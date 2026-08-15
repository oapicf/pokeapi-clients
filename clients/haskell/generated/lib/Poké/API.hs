{-# LANGUAGE DataKinds                  #-}
{-# LANGUAGE DeriveDataTypeable         #-}
{-# LANGUAGE DeriveGeneric              #-}
{-# LANGUAGE DeriveTraversable          #-}
{-# LANGUAGE FlexibleContexts           #-}
{-# LANGUAGE FlexibleInstances          #-}
{-# LANGUAGE GeneralizedNewtypeDeriving #-}
{-# LANGUAGE OverloadedStrings          #-}
{-# LANGUAGE RecordWildCards            #-}
{-# LANGUAGE TypeFamilies               #-}
{-# LANGUAGE TypeOperators              #-}
{-# LANGUAGE ViewPatterns               #-}
{-# OPTIONS_GHC
-fno-warn-unused-binds -fno-warn-unused-imports -freduction-depth=328 #-}

module Poké.API
  ( -- * Client and Server
    Config(..)
  , PokéBackend(..)
  , createPokéClient
  , runPokéServer
  , runPokéMiddlewareServer
  , runPokéClient
  , runPokéClientWithManager
  , callPoké
  , PokéClient
  , PokéClientError(..)
  -- ** Servant
  , PokéAPI
  -- ** Plain WAI Application
  , serverWaiApplicationPoké
  -- ** Authentication
  , PokéAuth(..)
  , clientAuth
  , Protected
  ) where

import           Poké.Types

import           Control.Monad.Catch                (Exception, MonadThrow, throwM)
import           Control.Monad.Except               (ExceptT, runExceptT)
import           Control.Monad.IO.Class
import           Control.Monad.Trans.Reader         (ReaderT (..))
import           Data.Aeson                         (Value)
import qualified Data.Aeson                         as Aeson
import           Data.ByteString                    (ByteString)
import qualified Data.ByteString.Lazy               as BSL
import           Data.Coerce                        (coerce)
import           Data.Data                          (Data)
import           Data.Function                      ((&))
import qualified Data.Map                           as Map
import           Data.Monoid                        ((<>))
import           Data.Proxy                         (Proxy (..))
import           Data.Set                           (Set)
import           Data.Text                          (Text)
import qualified Data.Text                          as T
import qualified Data.Text.Encoding                 as T
import           Data.Time
import           Data.UUID                          (UUID)
import           GHC.Exts                           (IsString (..))
import           GHC.Generics                       (Generic)
import           Network.HTTP.Client                (Manager, newManager)
import           Network.HTTP.Client.TLS            (tlsManagerSettings)
import           Network.HTTP.Types.Method          (methodOptions)
import           Network.Wai                        (Middleware, Request, requestHeaders)
import qualified Network.Wai.Handler.Warp           as Warp
import           Network.Wai.Middleware.HttpAuth    (extractBasicAuth)
import           Servant                            (ServerError, serveWithContextT, throwError)
import           Servant.API                        hiding (addHeader)
import           Servant.API.BasicAuth              (BasicAuthData (..))
import           Servant.API.Verbs                  (StdMethod (..), Verb)
import           Servant.API.Experimental.Auth      (AuthProtect)
import           Servant.Client                     (ClientEnv, Scheme (Http), ClientError, client,
                                                     mkClientEnv, parseBaseUrl)
import           Servant.Client.Core                (baseUrlPort, baseUrlHost, basicAuthReq, AuthClientData, AuthenticatedRequest, addHeader, mkAuthenticatedRequest, AuthClientData, AuthenticatedRequest, addHeader, mkAuthenticatedRequest)
import           Servant.Client.Internal.HttpClient (ClientM (..))
import           Servant.Server                     (Handler (..), Application, Context ((:.), EmptyContext))
import           Servant.Server.Experimental.Auth   (AuthHandler, AuthServerData, mkAuthHandler)
import           Servant.Server.StaticFiles         (serveDirectoryFileServer)
import           Web.FormUrlEncoded
import           Web.HttpApiData




-- | List of elements parsed from a query.
newtype QueryList (p :: CollectionFormat) a = QueryList
  { fromQueryList :: [a]
  } deriving (Functor, Applicative, Monad, Foldable, Traversable)

-- | Formats in which a list can be encoded into a HTTP path.
data CollectionFormat
  = CommaSeparated -- ^ CSV format for multiple parameters.
  | SpaceSeparated -- ^ Also called "SSV"
  | TabSeparated -- ^ Also called "TSV"
  | PipeSeparated -- ^ `value1|value2|value2`
  | MultiParamArray -- ^ Using multiple GET parameters, e.g. `foo=bar&foo=baz`. Only for GET params.

instance FromHttpApiData a => FromHttpApiData (QueryList 'CommaSeparated a) where
  parseQueryParam = parseSeparatedQueryList ','

instance FromHttpApiData a => FromHttpApiData (QueryList 'TabSeparated a) where
  parseQueryParam = parseSeparatedQueryList '\t'

instance FromHttpApiData a => FromHttpApiData (QueryList 'SpaceSeparated a) where
  parseQueryParam = parseSeparatedQueryList ' '

instance FromHttpApiData a => FromHttpApiData (QueryList 'PipeSeparated a) where
  parseQueryParam = parseSeparatedQueryList '|'

instance FromHttpApiData a => FromHttpApiData (QueryList 'MultiParamArray a) where
  parseQueryParam = error "unimplemented FromHttpApiData for MultiParamArray collection format"

parseSeparatedQueryList :: FromHttpApiData a => Char -> Text -> Either Text (QueryList p a)
parseSeparatedQueryList char = fmap QueryList . mapM parseQueryParam . T.split (== char)

instance ToHttpApiData a => ToHttpApiData (QueryList 'CommaSeparated a) where
  toQueryParam = formatSeparatedQueryList ','

instance ToHttpApiData a => ToHttpApiData (QueryList 'TabSeparated a) where
  toQueryParam = formatSeparatedQueryList '\t'

instance ToHttpApiData a => ToHttpApiData (QueryList 'SpaceSeparated a) where
  toQueryParam = formatSeparatedQueryList ' '

instance ToHttpApiData a => ToHttpApiData (QueryList 'PipeSeparated a) where
  toQueryParam = formatSeparatedQueryList '|'

instance ToHttpApiData a => ToHttpApiData (QueryList 'MultiParamArray a) where
  toQueryParam = error "unimplemented ToHttpApiData for MultiParamArray collection format"

formatSeparatedQueryList :: ToHttpApiData a => Char ->  QueryList p a -> Text
formatSeparatedQueryList char = T.intercalate (T.singleton char) . map toQueryParam . fromQueryList

newtype JSONQueryParam a = JSONQueryParam
  { fromJsonQueryParam :: a
  } deriving (Functor, Foldable, Traversable)

instance Aeson.ToJSON a => ToHttpApiData (JSONQueryParam a) where
  toQueryParam = T.decodeUtf8 . BSL.toStrict . Aeson.encode . fromJsonQueryParam

instance Aeson.FromJSON a => FromHttpApiData (JSONQueryParam a) where
  parseQueryParam = either (Left . T.pack) (Right . JSONQueryParam) . Aeson.eitherDecodeStrict . T.encodeUtf8


-- | Servant type-level API, generated from the OpenAPI spec for Poké.
type PokéAPI
    =    Protected :> "api" :> "v2" :> "berry-firmness" :> QueryParam "limit" Int :> QueryParam "offset" Int :> QueryParam "q" Text :> Verb 'GET 200 '[JSON] PaginatedBerryFirmnessSummaryList -- 'berryFirmnessList' route
    :<|> Protected :> "api" :> "v2" :> "berry-firmness" :> Capture "id" Text :> Verb 'GET 200 '[JSON] BerryFirmnessDetail -- 'berryFirmnessRetrieve' route
    :<|> Protected :> "api" :> "v2" :> "berry-flavor" :> QueryParam "limit" Int :> QueryParam "offset" Int :> QueryParam "q" Text :> Verb 'GET 200 '[JSON] PaginatedBerryFlavorSummaryList -- 'berryFlavorList' route
    :<|> Protected :> "api" :> "v2" :> "berry-flavor" :> Capture "id" Text :> Verb 'GET 200 '[JSON] BerryFlavorDetail -- 'berryFlavorRetrieve' route
    :<|> Protected :> "api" :> "v2" :> "berry" :> QueryParam "limit" Int :> QueryParam "offset" Int :> QueryParam "q" Text :> Verb 'GET 200 '[JSON] PaginatedBerrySummaryList -- 'berryList' route
    :<|> Protected :> "api" :> "v2" :> "berry" :> Capture "id" Text :> Verb 'GET 200 '[JSON] BerryDetail -- 'berryRetrieve' route
    :<|> Protected :> "api" :> "v2" :> "contest-effect" :> QueryParam "limit" Int :> QueryParam "offset" Int :> QueryParam "q" Text :> Verb 'GET 200 '[JSON] PaginatedContestEffectSummaryList -- 'contestEffectList' route
    :<|> Protected :> "api" :> "v2" :> "contest-effect" :> Capture "id" Text :> Verb 'GET 200 '[JSON] ContestEffectDetail -- 'contestEffectRetrieve' route
    :<|> Protected :> "api" :> "v2" :> "contest-type" :> QueryParam "limit" Int :> QueryParam "offset" Int :> QueryParam "q" Text :> Verb 'GET 200 '[JSON] PaginatedContestTypeSummaryList -- 'contestTypeList' route
    :<|> Protected :> "api" :> "v2" :> "contest-type" :> Capture "id" Text :> Verb 'GET 200 '[JSON] ContestTypeDetail -- 'contestTypeRetrieve' route
    :<|> Protected :> "api" :> "v2" :> "super-contest-effect" :> QueryParam "limit" Int :> QueryParam "offset" Int :> QueryParam "q" Text :> Verb 'GET 200 '[JSON] PaginatedSuperContestEffectSummaryList -- 'superContestEffectList' route
    :<|> Protected :> "api" :> "v2" :> "super-contest-effect" :> Capture "id" Text :> Verb 'GET 200 '[JSON] SuperContestEffectDetail -- 'superContestEffectRetrieve' route
    :<|> Protected :> "api" :> "v2" :> "encounter-condition" :> QueryParam "limit" Int :> QueryParam "offset" Int :> QueryParam "q" Text :> Verb 'GET 200 '[JSON] PaginatedEncounterConditionSummaryList -- 'encounterConditionList' route
    :<|> Protected :> "api" :> "v2" :> "encounter-condition" :> Capture "id" Text :> Verb 'GET 200 '[JSON] EncounterConditionDetail -- 'encounterConditionRetrieve' route
    :<|> Protected :> "api" :> "v2" :> "encounter-condition-value" :> QueryParam "limit" Int :> QueryParam "offset" Int :> QueryParam "q" Text :> Verb 'GET 200 '[JSON] PaginatedEncounterConditionValueSummaryList -- 'encounterConditionValueList' route
    :<|> Protected :> "api" :> "v2" :> "encounter-condition-value" :> Capture "id" Text :> Verb 'GET 200 '[JSON] EncounterConditionValueDetail -- 'encounterConditionValueRetrieve' route
    :<|> Protected :> "api" :> "v2" :> "encounter-method" :> QueryParam "limit" Int :> QueryParam "offset" Int :> QueryParam "q" Text :> Verb 'GET 200 '[JSON] PaginatedEncounterMethodSummaryList -- 'encounterMethodList' route
    :<|> Protected :> "api" :> "v2" :> "encounter-method" :> Capture "id" Text :> Verb 'GET 200 '[JSON] EncounterMethodDetail -- 'encounterMethodRetrieve' route
    :<|> Protected :> "api" :> "v2" :> "evolution-chain" :> QueryParam "limit" Int :> QueryParam "offset" Int :> QueryParam "q" Text :> Verb 'GET 200 '[JSON] PaginatedEvolutionChainSummaryList -- 'evolutionChainList' route
    :<|> Protected :> "api" :> "v2" :> "evolution-chain" :> Capture "id" Text :> Verb 'GET 200 '[JSON] EvolutionChainDetail -- 'evolutionChainRetrieve' route
    :<|> Protected :> "api" :> "v2" :> "evolution-trigger" :> QueryParam "limit" Int :> QueryParam "offset" Int :> QueryParam "q" Text :> Verb 'GET 200 '[JSON] PaginatedEvolutionTriggerSummaryList -- 'evolutionTriggerList' route
    :<|> Protected :> "api" :> "v2" :> "evolution-trigger" :> Capture "id" Text :> Verb 'GET 200 '[JSON] EvolutionTriggerDetail -- 'evolutionTriggerRetrieve' route
    :<|> Protected :> "api" :> "v2" :> "generation" :> QueryParam "limit" Int :> QueryParam "offset" Int :> QueryParam "q" Text :> Verb 'GET 200 '[JSON] PaginatedGenerationSummaryList -- 'generationList' route
    :<|> Protected :> "api" :> "v2" :> "generation" :> Capture "id" Text :> Verb 'GET 200 '[JSON] GenerationDetail -- 'generationRetrieve' route
    :<|> Protected :> "api" :> "v2" :> "pokedex" :> QueryParam "limit" Int :> QueryParam "offset" Int :> QueryParam "q" Text :> Verb 'GET 200 '[JSON] PaginatedPokedexSummaryList -- 'pokedexList' route
    :<|> Protected :> "api" :> "v2" :> "pokedex" :> Capture "id" Text :> Verb 'GET 200 '[JSON] PokedexDetail -- 'pokedexRetrieve' route
    :<|> Protected :> "api" :> "v2" :> "version-group" :> QueryParam "limit" Int :> QueryParam "offset" Int :> QueryParam "q" Text :> Verb 'GET 200 '[JSON] PaginatedVersionGroupSummaryList -- 'versionGroupList' route
    :<|> Protected :> "api" :> "v2" :> "version-group" :> Capture "id" Text :> Verb 'GET 200 '[JSON] VersionGroupDetail -- 'versionGroupRetrieve' route
    :<|> Protected :> "api" :> "v2" :> "version" :> QueryParam "limit" Int :> QueryParam "offset" Int :> QueryParam "q" Text :> Verb 'GET 200 '[JSON] PaginatedVersionSummaryList -- 'versionList' route
    :<|> Protected :> "api" :> "v2" :> "version" :> Capture "id" Text :> Verb 'GET 200 '[JSON] VersionDetail -- 'versionRetrieve' route
    :<|> Protected :> "api" :> "v2" :> "item-attribute" :> QueryParam "limit" Int :> QueryParam "offset" Int :> QueryParam "q" Text :> Verb 'GET 200 '[JSON] PaginatedItemAttributeSummaryList -- 'itemAttributeList' route
    :<|> Protected :> "api" :> "v2" :> "item-attribute" :> Capture "id" Text :> Verb 'GET 200 '[JSON] ItemAttributeDetail -- 'itemAttributeRetrieve' route
    :<|> Protected :> "api" :> "v2" :> "item-category" :> QueryParam "limit" Int :> QueryParam "offset" Int :> QueryParam "q" Text :> Verb 'GET 200 '[JSON] PaginatedItemCategorySummaryList -- 'itemCategoryList' route
    :<|> Protected :> "api" :> "v2" :> "item-category" :> Capture "id" Text :> Verb 'GET 200 '[JSON] ItemCategoryDetail -- 'itemCategoryRetrieve' route
    :<|> Protected :> "api" :> "v2" :> "item-fling-effect" :> QueryParam "limit" Int :> QueryParam "offset" Int :> QueryParam "q" Text :> Verb 'GET 200 '[JSON] PaginatedItemFlingEffectSummaryList -- 'itemFlingEffectList' route
    :<|> Protected :> "api" :> "v2" :> "item-fling-effect" :> Capture "id" Text :> Verb 'GET 200 '[JSON] ItemFlingEffectDetail -- 'itemFlingEffectRetrieve' route
    :<|> Protected :> "api" :> "v2" :> "item" :> QueryParam "limit" Int :> QueryParam "offset" Int :> QueryParam "q" Text :> Verb 'GET 200 '[JSON] PaginatedItemSummaryList -- 'itemList' route
    :<|> Protected :> "api" :> "v2" :> "item-pocket" :> QueryParam "limit" Int :> QueryParam "offset" Int :> QueryParam "q" Text :> Verb 'GET 200 '[JSON] PaginatedItemPocketSummaryList -- 'itemPocketList' route
    :<|> Protected :> "api" :> "v2" :> "item-pocket" :> Capture "id" Text :> Verb 'GET 200 '[JSON] ItemPocketDetail -- 'itemPocketRetrieve' route
    :<|> Protected :> "api" :> "v2" :> "item" :> Capture "id" Text :> Verb 'GET 200 '[JSON] ItemDetail -- 'itemRetrieve' route
    :<|> Protected :> "api" :> "v2" :> "location-area" :> QueryParam "limit" Int :> QueryParam "offset" Int :> Verb 'GET 200 '[JSON] PaginatedLocationAreaSummaryList -- 'locationAreaList' route
    :<|> Protected :> "api" :> "v2" :> "location-area" :> Capture "id" Int :> Verb 'GET 200 '[JSON] LocationAreaDetail -- 'locationAreaRetrieve' route
    :<|> Protected :> "api" :> "v2" :> "location" :> QueryParam "limit" Int :> QueryParam "offset" Int :> QueryParam "q" Text :> Verb 'GET 200 '[JSON] PaginatedLocationSummaryList -- 'locationList' route
    :<|> Protected :> "api" :> "v2" :> "location" :> Capture "id" Text :> Verb 'GET 200 '[JSON] LocationDetail -- 'locationRetrieve' route
    :<|> Protected :> "api" :> "v2" :> "pal-park-area" :> QueryParam "limit" Int :> QueryParam "offset" Int :> QueryParam "q" Text :> Verb 'GET 200 '[JSON] PaginatedPalParkAreaSummaryList -- 'palParkAreaList' route
    :<|> Protected :> "api" :> "v2" :> "pal-park-area" :> Capture "id" Text :> Verb 'GET 200 '[JSON] PalParkAreaDetail -- 'palParkAreaRetrieve' route
    :<|> Protected :> "api" :> "v2" :> "region" :> QueryParam "limit" Int :> QueryParam "offset" Int :> QueryParam "q" Text :> Verb 'GET 200 '[JSON] PaginatedRegionSummaryList -- 'regionList' route
    :<|> Protected :> "api" :> "v2" :> "region" :> Capture "id" Text :> Verb 'GET 200 '[JSON] RegionDetail -- 'regionRetrieve' route
    :<|> Protected :> "api" :> "v2" :> "machine" :> QueryParam "limit" Int :> QueryParam "offset" Int :> QueryParam "q" Text :> Verb 'GET 200 '[JSON] PaginatedMachineSummaryList -- 'machineList' route
    :<|> Protected :> "api" :> "v2" :> "machine" :> Capture "id" Text :> Verb 'GET 200 '[JSON] MachineDetail -- 'machineRetrieve' route
    :<|> Protected :> "api" :> "v2" :> "move-ailment" :> QueryParam "limit" Int :> QueryParam "offset" Int :> QueryParam "q" Text :> Verb 'GET 200 '[JSON] PaginatedMoveMetaAilmentSummaryList -- 'moveAilmentList' route
    :<|> Protected :> "api" :> "v2" :> "move-ailment" :> Capture "id" Text :> Verb 'GET 200 '[JSON] MoveMetaAilmentDetail -- 'moveAilmentRetrieve' route
    :<|> Protected :> "api" :> "v2" :> "move-battle-style" :> QueryParam "limit" Int :> QueryParam "offset" Int :> QueryParam "q" Text :> Verb 'GET 200 '[JSON] PaginatedMoveBattleStyleSummaryList -- 'moveBattleStyleList' route
    :<|> Protected :> "api" :> "v2" :> "move-battle-style" :> Capture "id" Text :> Verb 'GET 200 '[JSON] MoveBattleStyleDetail -- 'moveBattleStyleRetrieve' route
    :<|> Protected :> "api" :> "v2" :> "move-category" :> QueryParam "limit" Int :> QueryParam "offset" Int :> QueryParam "q" Text :> Verb 'GET 200 '[JSON] PaginatedMoveMetaCategorySummaryList -- 'moveCategoryList' route
    :<|> Protected :> "api" :> "v2" :> "move-category" :> Capture "id" Text :> Verb 'GET 200 '[JSON] MoveMetaCategoryDetail -- 'moveCategoryRetrieve' route
    :<|> Protected :> "api" :> "v2" :> "move-learn-method" :> QueryParam "limit" Int :> QueryParam "offset" Int :> QueryParam "q" Text :> Verb 'GET 200 '[JSON] PaginatedMoveLearnMethodSummaryList -- 'moveLearnMethodList' route
    :<|> Protected :> "api" :> "v2" :> "move-learn-method" :> Capture "id" Text :> Verb 'GET 200 '[JSON] MoveLearnMethodDetail -- 'moveLearnMethodRetrieve' route
    :<|> Protected :> "api" :> "v2" :> "move" :> QueryParam "limit" Int :> QueryParam "offset" Int :> QueryParam "q" Text :> Verb 'GET 200 '[JSON] PaginatedMoveSummaryList -- 'moveList' route
    :<|> Protected :> "api" :> "v2" :> "move" :> Capture "id" Text :> Verb 'GET 200 '[JSON] MoveDetail -- 'moveRetrieve' route
    :<|> Protected :> "api" :> "v2" :> "move-target" :> QueryParam "limit" Int :> QueryParam "offset" Int :> QueryParam "q" Text :> Verb 'GET 200 '[JSON] PaginatedMoveTargetSummaryList -- 'moveTargetList' route
    :<|> Protected :> "api" :> "v2" :> "move-target" :> Capture "id" Text :> Verb 'GET 200 '[JSON] MoveTargetDetail -- 'moveTargetRetrieve' route
    :<|> Protected :> "api" :> "v2" :> "ability" :> QueryParam "limit" Int :> QueryParam "offset" Int :> QueryParam "q" Text :> Verb 'GET 200 '[JSON] PaginatedAbilitySummaryList -- 'abilityList' route
    :<|> Protected :> "api" :> "v2" :> "ability" :> Capture "id" Text :> Verb 'GET 200 '[JSON] AbilityDetail -- 'abilityRetrieve' route
    :<|> Protected :> "api" :> "v2" :> "characteristic" :> QueryParam "limit" Int :> QueryParam "offset" Int :> QueryParam "q" Text :> Verb 'GET 200 '[JSON] PaginatedCharacteristicSummaryList -- 'characteristicList' route
    :<|> Protected :> "api" :> "v2" :> "characteristic" :> Capture "id" Text :> Verb 'GET 200 '[JSON] CharacteristicDetail -- 'characteristicRetrieve' route
    :<|> Protected :> "api" :> "v2" :> "egg-group" :> QueryParam "limit" Int :> QueryParam "offset" Int :> QueryParam "q" Text :> Verb 'GET 200 '[JSON] PaginatedEggGroupSummaryList -- 'eggGroupList' route
    :<|> Protected :> "api" :> "v2" :> "egg-group" :> Capture "id" Text :> Verb 'GET 200 '[JSON] EggGroupDetail -- 'eggGroupRetrieve' route
    :<|> Protected :> "api" :> "v2" :> "gender" :> QueryParam "limit" Int :> QueryParam "offset" Int :> QueryParam "q" Text :> Verb 'GET 200 '[JSON] PaginatedGenderSummaryList -- 'genderList' route
    :<|> Protected :> "api" :> "v2" :> "gender" :> Capture "id" Text :> Verb 'GET 200 '[JSON] GenderDetail -- 'genderRetrieve' route
    :<|> Protected :> "api" :> "v2" :> "growth-rate" :> QueryParam "limit" Int :> QueryParam "offset" Int :> QueryParam "q" Text :> Verb 'GET 200 '[JSON] PaginatedGrowthRateSummaryList -- 'growthRateList' route
    :<|> Protected :> "api" :> "v2" :> "growth-rate" :> Capture "id" Text :> Verb 'GET 200 '[JSON] GrowthRateDetail -- 'growthRateRetrieve' route
    :<|> Protected :> "api" :> "v2" :> "move-damage-class" :> QueryParam "limit" Int :> QueryParam "offset" Int :> QueryParam "q" Text :> Verb 'GET 200 '[JSON] PaginatedMoveDamageClassSummaryList -- 'moveDamageClassList' route
    :<|> Protected :> "api" :> "v2" :> "move-damage-class" :> Capture "id" Text :> Verb 'GET 200 '[JSON] MoveDamageClassDetail -- 'moveDamageClassRetrieve' route
    :<|> Protected :> "api" :> "v2" :> "nature" :> QueryParam "limit" Int :> QueryParam "offset" Int :> QueryParam "q" Text :> Verb 'GET 200 '[JSON] PaginatedNatureSummaryList -- 'natureList' route
    :<|> Protected :> "api" :> "v2" :> "nature" :> Capture "id" Text :> Verb 'GET 200 '[JSON] NatureDetail -- 'natureRetrieve' route
    :<|> Protected :> "api" :> "v2" :> "pokeathlon-stat" :> QueryParam "limit" Int :> QueryParam "offset" Int :> QueryParam "q" Text :> Verb 'GET 200 '[JSON] PaginatedPokeathlonStatSummaryList -- 'pokeathlonStatList' route
    :<|> Protected :> "api" :> "v2" :> "pokeathlon-stat" :> Capture "id" Text :> Verb 'GET 200 '[JSON] PokeathlonStatDetail -- 'pokeathlonStatRetrieve' route
    :<|> Protected :> "api" :> "v2" :> "pokemon-color" :> QueryParam "limit" Int :> QueryParam "offset" Int :> QueryParam "q" Text :> Verb 'GET 200 '[JSON] PaginatedPokemonColorSummaryList -- 'pokemonColorList' route
    :<|> Protected :> "api" :> "v2" :> "pokemon-color" :> Capture "id" Text :> Verb 'GET 200 '[JSON] PokemonColorDetail -- 'pokemonColorRetrieve' route
    :<|> Protected :> "api" :> "v2" :> "pokemon-form" :> QueryParam "limit" Int :> QueryParam "offset" Int :> QueryParam "q" Text :> Verb 'GET 200 '[JSON] PaginatedPokemonFormSummaryList -- 'pokemonFormList' route
    :<|> Protected :> "api" :> "v2" :> "pokemon-form" :> Capture "id" Text :> Verb 'GET 200 '[JSON] PokemonFormDetail -- 'pokemonFormRetrieve' route
    :<|> Protected :> "api" :> "v2" :> "pokemon-habitat" :> QueryParam "limit" Int :> QueryParam "offset" Int :> QueryParam "q" Text :> Verb 'GET 200 '[JSON] PaginatedPokemonHabitatSummaryList -- 'pokemonHabitatList' route
    :<|> Protected :> "api" :> "v2" :> "pokemon-habitat" :> Capture "id" Text :> Verb 'GET 200 '[JSON] PokemonHabitatDetail -- 'pokemonHabitatRetrieve' route
    :<|> Protected :> "api" :> "v2" :> "pokemon" :> QueryParam "limit" Int :> QueryParam "offset" Int :> QueryParam "q" Text :> Verb 'GET 200 '[JSON] PaginatedPokemonSummaryList -- 'pokemonList' route
    :<|> Protected :> "api" :> "v2" :> "pokemon" :> Capture "id" Text :> Verb 'GET 200 '[JSON] PokemonDetail -- 'pokemonRetrieve' route
    :<|> Protected :> "api" :> "v2" :> "pokemon-shape" :> QueryParam "limit" Int :> QueryParam "offset" Int :> QueryParam "q" Text :> Verb 'GET 200 '[JSON] PaginatedPokemonShapeSummaryList -- 'pokemonShapeList' route
    :<|> Protected :> "api" :> "v2" :> "pokemon-shape" :> Capture "id" Text :> Verb 'GET 200 '[JSON] PokemonShapeDetail -- 'pokemonShapeRetrieve' route
    :<|> Protected :> "api" :> "v2" :> "pokemon-species" :> QueryParam "limit" Int :> QueryParam "offset" Int :> QueryParam "q" Text :> Verb 'GET 200 '[JSON] PaginatedPokemonSpeciesSummaryList -- 'pokemonSpeciesList' route
    :<|> Protected :> "api" :> "v2" :> "pokemon-species" :> Capture "id" Text :> Verb 'GET 200 '[JSON] PokemonSpeciesDetail -- 'pokemonSpeciesRetrieve' route
    :<|> Protected :> "api" :> "v2" :> "stat" :> QueryParam "limit" Int :> QueryParam "offset" Int :> QueryParam "q" Text :> Verb 'GET 200 '[JSON] PaginatedStatSummaryList -- 'statList' route
    :<|> Protected :> "api" :> "v2" :> "stat" :> Capture "id" Text :> Verb 'GET 200 '[JSON] StatDetail -- 'statRetrieve' route
    :<|> Protected :> "api" :> "v2" :> "type" :> QueryParam "limit" Int :> QueryParam "offset" Int :> QueryParam "q" Text :> Verb 'GET 200 '[JSON] PaginatedTypeSummaryList -- 'typeList' route
    :<|> Protected :> "api" :> "v2" :> "type" :> Capture "id" Text :> Verb 'GET 200 '[JSON] TypeDetail -- 'typeRetrieve' route
    :<|> Protected :> "api" :> "v2" :> "language" :> QueryParam "limit" Int :> QueryParam "offset" Int :> QueryParam "q" Text :> Verb 'GET 200 '[JSON] PaginatedLanguageSummaryList -- 'languageList' route
    :<|> Protected :> "api" :> "v2" :> "language" :> Capture "id" Text :> Verb 'GET 200 '[JSON] LanguageDetail -- 'languageRetrieve' route
    :<|> Raw


-- | Server or client configuration, specifying the host and port to query or serve on.
data Config = Config
  { configUrl :: String  -- ^ scheme://hostname:port/path, e.g. "http://localhost:8080/"
  } deriving (Eq, Ord, Show, Read)


-- | Custom exception type for our errors.
newtype PokéClientError = PokéClientError ClientError
  deriving (Show, Exception)
-- | Configuration, specifying the full url of the service.


-- | Backend for Poké.
-- The backend can be used both for the client and the server. The client generated from the Poké OpenAPI spec
-- is a backend that executes actions by sending HTTP requests (see @createPokéClient@). Alternatively, provided
-- a backend, the API can be served using @runPokéMiddlewareServer@.
data PokéBackend a m = PokéBackend
  { berryFirmnessList :: a -> Maybe Int -> Maybe Int -> Maybe Text -> m PaginatedBerryFirmnessSummaryList{- ^ Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail. -}
  , berryFirmnessRetrieve :: a -> Text -> m BerryFirmnessDetail{- ^ Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail. -}
  , berryFlavorList :: a -> Maybe Int -> Maybe Int -> Maybe Text -> m PaginatedBerryFlavorSummaryList{- ^ Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail. -}
  , berryFlavorRetrieve :: a -> Text -> m BerryFlavorDetail{- ^ Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail. -}
  , berryList :: a -> Maybe Int -> Maybe Int -> Maybe Text -> m PaginatedBerrySummaryList{- ^ Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail. -}
  , berryRetrieve :: a -> Text -> m BerryDetail{- ^ Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail. -}
  , contestEffectList :: a -> Maybe Int -> Maybe Int -> Maybe Text -> m PaginatedContestEffectSummaryList{- ^ Contest effects refer to the effects of moves when used in contests. -}
  , contestEffectRetrieve :: a -> Text -> m ContestEffectDetail{- ^ Contest effects refer to the effects of moves when used in contests. -}
  , contestTypeList :: a -> Maybe Int -> Maybe Int -> Maybe Text -> m PaginatedContestTypeSummaryList{- ^ Contest types are categories judges used to weigh a Pokémon's condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail. -}
  , contestTypeRetrieve :: a -> Text -> m ContestTypeDetail{- ^ Contest types are categories judges used to weigh a Pokémon's condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail. -}
  , superContestEffectList :: a -> Maybe Int -> Maybe Int -> Maybe Text -> m PaginatedSuperContestEffectSummaryList{- ^ Super contest effects refer to the effects of moves when used in super contests. -}
  , superContestEffectRetrieve :: a -> Text -> m SuperContestEffectDetail{- ^ Super contest effects refer to the effects of moves when used in super contests. -}
  , encounterConditionList :: a -> Maybe Int -> Maybe Int -> Maybe Text -> m PaginatedEncounterConditionSummaryList{- ^ Conditions which affect what pokemon might appear in the wild, e.g., day or night. -}
  , encounterConditionRetrieve :: a -> Text -> m EncounterConditionDetail{- ^ Conditions which affect what pokemon might appear in the wild, e.g., day or night. -}
  , encounterConditionValueList :: a -> Maybe Int -> Maybe Int -> Maybe Text -> m PaginatedEncounterConditionValueSummaryList{- ^ Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night. -}
  , encounterConditionValueRetrieve :: a -> Text -> m EncounterConditionValueDetail{- ^ Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night. -}
  , encounterMethodList :: a -> Maybe Int -> Maybe Int -> Maybe Text -> m PaginatedEncounterMethodSummaryList{- ^ Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail. -}
  , encounterMethodRetrieve :: a -> Text -> m EncounterMethodDetail{- ^ Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail. -}
  , evolutionChainList :: a -> Maybe Int -> Maybe Int -> Maybe Text -> m PaginatedEvolutionChainSummaryList{- ^ Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy. -}
  , evolutionChainRetrieve :: a -> Text -> m EvolutionChainDetail{- ^ Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy. -}
  , evolutionTriggerList :: a -> Maybe Int -> Maybe Int -> Maybe Text -> m PaginatedEvolutionTriggerSummaryList{- ^ Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail. -}
  , evolutionTriggerRetrieve :: a -> Text -> m EvolutionTriggerDetail{- ^ Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail. -}
  , generationList :: a -> Maybe Int -> Maybe Int -> Maybe Text -> m PaginatedGenerationSummaryList{- ^ A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released. -}
  , generationRetrieve :: a -> Text -> m GenerationDetail{- ^ A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released. -}
  , pokedexList :: a -> Maybe Int -> Maybe Int -> Maybe Text -> m PaginatedPokedexSummaryList{- ^ A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail. -}
  , pokedexRetrieve :: a -> Text -> m PokedexDetail{- ^ A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail. -}
  , versionGroupList :: a -> Maybe Int -> Maybe Int -> Maybe Text -> m PaginatedVersionGroupSummaryList{- ^ Version groups categorize highly similar versions of the games. -}
  , versionGroupRetrieve :: a -> Text -> m VersionGroupDetail{- ^ Version groups categorize highly similar versions of the games. -}
  , versionList :: a -> Maybe Int -> Maybe Int -> Maybe Text -> m PaginatedVersionSummaryList{- ^ Versions of the games, e.g., Red, Blue or Yellow. -}
  , versionRetrieve :: a -> Text -> m VersionDetail{- ^ Versions of the games, e.g., Red, Blue or Yellow. -}
  , itemAttributeList :: a -> Maybe Int -> Maybe Int -> Maybe Text -> m PaginatedItemAttributeSummaryList{- ^ Item attributes define particular aspects of items, e.g.\"usable in battle\" or \"consumable\". -}
  , itemAttributeRetrieve :: a -> Text -> m ItemAttributeDetail{- ^ Item attributes define particular aspects of items, e.g.\"usable in battle\" or \"consumable\". -}
  , itemCategoryList :: a -> Maybe Int -> Maybe Int -> Maybe Text -> m PaginatedItemCategorySummaryList{- ^ Item categories determine where items will be placed in the players bag. -}
  , itemCategoryRetrieve :: a -> Text -> m ItemCategoryDetail{- ^ Item categories determine where items will be placed in the players bag. -}
  , itemFlingEffectList :: a -> Maybe Int -> Maybe Int -> Maybe Text -> m PaginatedItemFlingEffectSummaryList{- ^ The various effects of the move\"Fling\" when used with different items. -}
  , itemFlingEffectRetrieve :: a -> Text -> m ItemFlingEffectDetail{- ^ The various effects of the move\"Fling\" when used with different items. -}
  , itemList :: a -> Maybe Int -> Maybe Int -> Maybe Text -> m PaginatedItemSummaryList{- ^ An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area. -}
  , itemPocketList :: a -> Maybe Int -> Maybe Int -> Maybe Text -> m PaginatedItemPocketSummaryList{- ^ Pockets within the players bag used for storing items by category. -}
  , itemPocketRetrieve :: a -> Text -> m ItemPocketDetail{- ^ Pockets within the players bag used for storing items by category. -}
  , itemRetrieve :: a -> Text -> m ItemDetail{- ^ An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area. -}
  , locationAreaList :: a -> Maybe Int -> Maybe Int -> m PaginatedLocationAreaSummaryList{- ^ Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters. -}
  , locationAreaRetrieve :: a -> Int -> m LocationAreaDetail{- ^ Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters. -}
  , locationList :: a -> Maybe Int -> Maybe Int -> Maybe Text -> m PaginatedLocationSummaryList{- ^ Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes. -}
  , locationRetrieve :: a -> Text -> m LocationDetail{- ^ Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes. -}
  , palParkAreaList :: a -> Maybe Int -> Maybe Int -> Maybe Text -> m PaginatedPalParkAreaSummaryList{- ^ Areas used for grouping Pokémon encounters in Pal Park. They're like habitats that are specific to Pal Park. -}
  , palParkAreaRetrieve :: a -> Text -> m PalParkAreaDetail{- ^ Areas used for grouping Pokémon encounters in Pal Park. They're like habitats that are specific to Pal Park. -}
  , regionList :: a -> Maybe Int -> Maybe Int -> Maybe Text -> m PaginatedRegionSummaryList{- ^ A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them. -}
  , regionRetrieve :: a -> Text -> m RegionDetail{- ^ A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them. -}
  , machineList :: a -> Maybe Int -> Maybe Int -> Maybe Text -> m PaginatedMachineSummaryList{- ^ Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine. -}
  , machineRetrieve :: a -> Text -> m MachineDetail{- ^ Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine. -}
  , moveAilmentList :: a -> Maybe Int -> Maybe Int -> Maybe Text -> m PaginatedMoveMetaAilmentSummaryList{- ^ Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail. -}
  , moveAilmentRetrieve :: a -> Text -> m MoveMetaAilmentDetail{- ^ Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail. -}
  , moveBattleStyleList :: a -> Maybe Int -> Maybe Int -> Maybe Text -> m PaginatedMoveBattleStyleSummaryList{- ^ Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail. -}
  , moveBattleStyleRetrieve :: a -> Text -> m MoveBattleStyleDetail{- ^ Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail. -}
  , moveCategoryList :: a -> Maybe Int -> Maybe Int -> Maybe Text -> m PaginatedMoveMetaCategorySummaryList{- ^ Very general categories that loosely group move effects. -}
  , moveCategoryRetrieve :: a -> Text -> m MoveMetaCategoryDetail{- ^ Very general categories that loosely group move effects. -}
  , moveLearnMethodList :: a -> Maybe Int -> Maybe Int -> Maybe Text -> m PaginatedMoveLearnMethodSummaryList{- ^ Methods by which Pokémon can learn moves. -}
  , moveLearnMethodRetrieve :: a -> Text -> m MoveLearnMethodDetail{- ^ Methods by which Pokémon can learn moves. -}
  , moveList :: a -> Maybe Int -> Maybe Int -> Maybe Text -> m PaginatedMoveSummaryList{- ^ Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas. -}
  , moveRetrieve :: a -> Text -> m MoveDetail{- ^ Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas. -}
  , moveTargetList :: a -> Maybe Int -> Maybe Int -> Maybe Text -> m PaginatedMoveTargetSummaryList{- ^ Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves. -}
  , moveTargetRetrieve :: a -> Text -> m MoveTargetDetail{- ^ Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves. -}
  , abilityList :: a -> Maybe Int -> Maybe Int -> Maybe Text -> m PaginatedAbilitySummaryList{- ^ Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail. -}
  , abilityRetrieve :: a -> Text -> m AbilityDetail{- ^ Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail. -}
  , characteristicList :: a -> Maybe Int -> Maybe Int -> Maybe Text -> m PaginatedCharacteristicSummaryList{- ^ Characteristics indicate which stat contains a Pokémon's highest IV. A Pokémon's Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail. -}
  , characteristicRetrieve :: a -> Text -> m CharacteristicDetail{- ^ Characteristics indicate which stat contains a Pokémon's highest IV. A Pokémon's Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail. -}
  , eggGroupList :: a -> Maybe Int -> Maybe Int -> Maybe Text -> m PaginatedEggGroupSummaryList{- ^ Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail. -}
  , eggGroupRetrieve :: a -> Text -> m EggGroupDetail{- ^ Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail. -}
  , genderList :: a -> Maybe Int -> Maybe Int -> Maybe Text -> m PaginatedGenderSummaryList{- ^ Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail. -}
  , genderRetrieve :: a -> Text -> m GenderDetail{- ^ Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail. -}
  , growthRateList :: a -> Maybe Int -> Maybe Int -> Maybe Text -> m PaginatedGrowthRateSummaryList{- ^ Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail. -}
  , growthRateRetrieve :: a -> Text -> m GrowthRateDetail{- ^ Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail. -}
  , moveDamageClassList :: a -> Maybe Int -> Maybe Int -> Maybe Text -> m PaginatedMoveDamageClassSummaryList{- ^ Damage classes moves can have, e.g. physical, special, or non-damaging. -}
  , moveDamageClassRetrieve :: a -> Text -> m MoveDamageClassDetail{- ^ Damage classes moves can have, e.g. physical, special, or non-damaging. -}
  , natureList :: a -> Maybe Int -> Maybe Int -> Maybe Text -> m PaginatedNatureSummaryList{- ^ Natures influence how a Pokémon's stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail. -}
  , natureRetrieve :: a -> Text -> m NatureDetail{- ^ Natures influence how a Pokémon's stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail. -}
  , pokeathlonStatList :: a -> Maybe Int -> Maybe Int -> Maybe Text -> m PaginatedPokeathlonStatSummaryList{- ^ Pokeathlon Stats are different attributes of a Pokémon's performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail. -}
  , pokeathlonStatRetrieve :: a -> Text -> m PokeathlonStatDetail{- ^ Pokeathlon Stats are different attributes of a Pokémon's performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail. -}
  , pokemonColorList :: a -> Maybe Int -> Maybe Int -> Maybe Text -> m PaginatedPokemonColorSummaryList{- ^ Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon's body. No orange category exists; Pokémon that are primarily orange are listed as red or brown. -}
  , pokemonColorRetrieve :: a -> Text -> m PokemonColorDetail{- ^ Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon's body. No orange category exists; Pokémon that are primarily orange are listed as red or brown. -}
  , pokemonFormList :: a -> Maybe Int -> Maybe Int -> Maybe Text -> m PaginatedPokemonFormSummaryList{- ^ Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the 'Pokémon' entity is used to represent such a variety. -}
  , pokemonFormRetrieve :: a -> Text -> m PokemonFormDetail{- ^ Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the 'Pokémon' entity is used to represent such a variety. -}
  , pokemonHabitatList :: a -> Maybe Int -> Maybe Int -> Maybe Text -> m PaginatedPokemonHabitatSummaryList{- ^ Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon. -}
  , pokemonHabitatRetrieve :: a -> Text -> m PokemonHabitatDetail{- ^ Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon. -}
  , pokemonList :: a -> Maybe Int -> Maybe Int -> Maybe Text -> m PaginatedPokemonSummaryList{- ^ Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail. -}
  , pokemonRetrieve :: a -> Text -> m PokemonDetail{- ^ Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail. -}
  , pokemonShapeList :: a -> Maybe Int -> Maybe Int -> Maybe Text -> m PaginatedPokemonShapeSummaryList{- ^ Shapes used for sorting Pokémon in a Pokédex. -}
  , pokemonShapeRetrieve :: a -> Text -> m PokemonShapeDetail{- ^ Shapes used for sorting Pokémon in a Pokédex. -}
  , pokemonSpeciesList :: a -> Maybe Int -> Maybe Int -> Maybe Text -> m PaginatedPokemonSpeciesSummaryList{- ^ A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant. -}
  , pokemonSpeciesRetrieve :: a -> Text -> m PokemonSpeciesDetail{- ^ A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant. -}
  , statList :: a -> Maybe Int -> Maybe Int -> Maybe Text -> m PaginatedStatSummaryList{- ^ Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles. -}
  , statRetrieve :: a -> Text -> m StatDetail{- ^ Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles. -}
  , typeList :: a -> Maybe Int -> Maybe Int -> Maybe Text -> m PaginatedTypeSummaryList{- ^ Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against. -}
  , typeRetrieve :: a -> Text -> m TypeDetail{- ^ Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against. -}
  , languageList :: a -> Maybe Int -> Maybe Int -> Maybe Text -> m PaginatedLanguageSummaryList{- ^ Languages for translations of API resource information. -}
  , languageRetrieve :: a -> Text -> m LanguageDetail{- ^ Languages for translations of API resource information. -}
  }

-- | Authentication settings for Poké.
-- lookupUser is used to retrieve a user given a header value. The data type can be specified by providing an
-- type instance for AuthServerData. authError is a function that given a request returns a custom error that
-- is returned when the header is not found.
data PokéAuth = PokéAuth
  { lookupUser :: BasicAuthData -> Handler AuthServer
  , authError :: Request -> ServerError
  }
-- | Authentication settings for Poké.
-- lookupUser is used to retrieve a user given a header value. The data type can be specified by providing an
-- type instance for AuthServerData. authError is a function that given a request returns a custom error that
-- is returned when the header is not found.
data PokéAuth = PokéAuth
  { lookupUser :: ByteString -> Handler AuthServer
  , authError :: Request -> ServerError
  }

newtype PokéClient a = PokéClient
  { runClient :: ClientEnv -> ExceptT ClientError IO a
  } deriving Functor

instance Applicative PokéClient where
  pure x = PokéClient (\_ -> pure x)
  (PokéClient f) <*> (PokéClient x) =
    PokéClient (\env -> f env <*> x env)

instance Monad PokéClient where
  (PokéClient a) >>= f =
    PokéClient (\env -> do
      value <- a env
      runClient (f value) env)

instance MonadIO PokéClient where
  liftIO io = PokéClient (\_ -> liftIO io)

createPokéClient :: PokéBackend AuthClient PokéClient
createPokéClient = PokéBackend{..}
  where
    ((coerce -> berryFirmnessList) :<|>
     (coerce -> berryFirmnessRetrieve) :<|>
     (coerce -> berryFlavorList) :<|>
     (coerce -> berryFlavorRetrieve) :<|>
     (coerce -> berryList) :<|>
     (coerce -> berryRetrieve) :<|>
     (coerce -> contestEffectList) :<|>
     (coerce -> contestEffectRetrieve) :<|>
     (coerce -> contestTypeList) :<|>
     (coerce -> contestTypeRetrieve) :<|>
     (coerce -> superContestEffectList) :<|>
     (coerce -> superContestEffectRetrieve) :<|>
     (coerce -> encounterConditionList) :<|>
     (coerce -> encounterConditionRetrieve) :<|>
     (coerce -> encounterConditionValueList) :<|>
     (coerce -> encounterConditionValueRetrieve) :<|>
     (coerce -> encounterMethodList) :<|>
     (coerce -> encounterMethodRetrieve) :<|>
     (coerce -> evolutionChainList) :<|>
     (coerce -> evolutionChainRetrieve) :<|>
     (coerce -> evolutionTriggerList) :<|>
     (coerce -> evolutionTriggerRetrieve) :<|>
     (coerce -> generationList) :<|>
     (coerce -> generationRetrieve) :<|>
     (coerce -> pokedexList) :<|>
     (coerce -> pokedexRetrieve) :<|>
     (coerce -> versionGroupList) :<|>
     (coerce -> versionGroupRetrieve) :<|>
     (coerce -> versionList) :<|>
     (coerce -> versionRetrieve) :<|>
     (coerce -> itemAttributeList) :<|>
     (coerce -> itemAttributeRetrieve) :<|>
     (coerce -> itemCategoryList) :<|>
     (coerce -> itemCategoryRetrieve) :<|>
     (coerce -> itemFlingEffectList) :<|>
     (coerce -> itemFlingEffectRetrieve) :<|>
     (coerce -> itemList) :<|>
     (coerce -> itemPocketList) :<|>
     (coerce -> itemPocketRetrieve) :<|>
     (coerce -> itemRetrieve) :<|>
     (coerce -> locationAreaList) :<|>
     (coerce -> locationAreaRetrieve) :<|>
     (coerce -> locationList) :<|>
     (coerce -> locationRetrieve) :<|>
     (coerce -> palParkAreaList) :<|>
     (coerce -> palParkAreaRetrieve) :<|>
     (coerce -> regionList) :<|>
     (coerce -> regionRetrieve) :<|>
     (coerce -> machineList) :<|>
     (coerce -> machineRetrieve) :<|>
     (coerce -> moveAilmentList) :<|>
     (coerce -> moveAilmentRetrieve) :<|>
     (coerce -> moveBattleStyleList) :<|>
     (coerce -> moveBattleStyleRetrieve) :<|>
     (coerce -> moveCategoryList) :<|>
     (coerce -> moveCategoryRetrieve) :<|>
     (coerce -> moveLearnMethodList) :<|>
     (coerce -> moveLearnMethodRetrieve) :<|>
     (coerce -> moveList) :<|>
     (coerce -> moveRetrieve) :<|>
     (coerce -> moveTargetList) :<|>
     (coerce -> moveTargetRetrieve) :<|>
     (coerce -> abilityList) :<|>
     (coerce -> abilityRetrieve) :<|>
     (coerce -> characteristicList) :<|>
     (coerce -> characteristicRetrieve) :<|>
     (coerce -> eggGroupList) :<|>
     (coerce -> eggGroupRetrieve) :<|>
     (coerce -> genderList) :<|>
     (coerce -> genderRetrieve) :<|>
     (coerce -> growthRateList) :<|>
     (coerce -> growthRateRetrieve) :<|>
     (coerce -> moveDamageClassList) :<|>
     (coerce -> moveDamageClassRetrieve) :<|>
     (coerce -> natureList) :<|>
     (coerce -> natureRetrieve) :<|>
     (coerce -> pokeathlonStatList) :<|>
     (coerce -> pokeathlonStatRetrieve) :<|>
     (coerce -> pokemonColorList) :<|>
     (coerce -> pokemonColorRetrieve) :<|>
     (coerce -> pokemonFormList) :<|>
     (coerce -> pokemonFormRetrieve) :<|>
     (coerce -> pokemonHabitatList) :<|>
     (coerce -> pokemonHabitatRetrieve) :<|>
     (coerce -> pokemonList) :<|>
     (coerce -> pokemonRetrieve) :<|>
     (coerce -> pokemonShapeList) :<|>
     (coerce -> pokemonShapeRetrieve) :<|>
     (coerce -> pokemonSpeciesList) :<|>
     (coerce -> pokemonSpeciesRetrieve) :<|>
     (coerce -> statList) :<|>
     (coerce -> statRetrieve) :<|>
     (coerce -> typeList) :<|>
     (coerce -> typeRetrieve) :<|>
     (coerce -> languageList) :<|>
     (coerce -> languageRetrieve) :<|>
     _) = client (Proxy :: Proxy PokéAPI)

-- | Run requests in the PokéClient monad.
runPokéClient :: Config -> PokéClient a -> ExceptT ClientError IO a
runPokéClient clientConfig cl = do
  manager <- liftIO $ newManager tlsManagerSettings
  runPokéClientWithManager manager clientConfig cl

-- | Run requests in the PokéClient monad using a custom manager.
runPokéClientWithManager :: Manager -> Config -> PokéClient a -> ExceptT ClientError IO a
runPokéClientWithManager manager Config{..} cl = do
  url <- parseBaseUrl configUrl
  runClient cl $ mkClientEnv manager url

-- | Like @runClient@, but returns the response or throws
--   a PokéClientError
callPoké
  :: (MonadIO m, MonadThrow m)
  => ClientEnv -> PokéClient a -> m a
callPoké env f = do
  res <- liftIO $ runExceptT $ runClient f env
  case res of
    Left err       -> throwM (PokéClientError err)
    Right response -> pure response


requestMiddlewareId :: Application -> Application
requestMiddlewareId a = a

-- | Run the Poké server at the provided host and port.
runPokéServer
  :: (MonadIO m, MonadThrow m)
  => Config -> PokéAuth -> PokéBackend AuthServer (ExceptT ServerError IO) -> m ()
runPokéServer config auth backend = runPokéMiddlewareServer config requestMiddlewareId auth backend

-- | Run the Poké server at the provided host and port.
runPokéMiddlewareServer
  :: (MonadIO m, MonadThrow m)
  => Config -> Middleware -> PokéAuth -> PokéBackend AuthServer (ExceptT ServerError IO) -> m ()
runPokéMiddlewareServer Config{..} middleware auth backend = do
  url <- parseBaseUrl configUrl
  let warpSettings = Warp.defaultSettings
        & Warp.setPort (baseUrlPort url)
        & Warp.setHost (fromString $ baseUrlHost url)
  liftIO $ Warp.runSettings warpSettings $ middleware $ serverWaiApplicationPoké auth backend

-- | Plain "Network.Wai" Application for the Poké server.
--
-- Can be used to implement e.g. tests that call the API without a full webserver.
serverWaiApplicationPoké :: PokéAuth -> PokéBackend AuthServer (ExceptT ServerError IO) -> Application
serverWaiApplicationPoké auth backend = serveWithContextT (Proxy :: Proxy PokéAPI) context id (serverFromBackend backend)
  where
    context = serverContext auth
    serverFromBackend PokéBackend{..} =
      (coerce berryFirmnessList :<|>
       coerce berryFirmnessRetrieve :<|>
       coerce berryFlavorList :<|>
       coerce berryFlavorRetrieve :<|>
       coerce berryList :<|>
       coerce berryRetrieve :<|>
       coerce contestEffectList :<|>
       coerce contestEffectRetrieve :<|>
       coerce contestTypeList :<|>
       coerce contestTypeRetrieve :<|>
       coerce superContestEffectList :<|>
       coerce superContestEffectRetrieve :<|>
       coerce encounterConditionList :<|>
       coerce encounterConditionRetrieve :<|>
       coerce encounterConditionValueList :<|>
       coerce encounterConditionValueRetrieve :<|>
       coerce encounterMethodList :<|>
       coerce encounterMethodRetrieve :<|>
       coerce evolutionChainList :<|>
       coerce evolutionChainRetrieve :<|>
       coerce evolutionTriggerList :<|>
       coerce evolutionTriggerRetrieve :<|>
       coerce generationList :<|>
       coerce generationRetrieve :<|>
       coerce pokedexList :<|>
       coerce pokedexRetrieve :<|>
       coerce versionGroupList :<|>
       coerce versionGroupRetrieve :<|>
       coerce versionList :<|>
       coerce versionRetrieve :<|>
       coerce itemAttributeList :<|>
       coerce itemAttributeRetrieve :<|>
       coerce itemCategoryList :<|>
       coerce itemCategoryRetrieve :<|>
       coerce itemFlingEffectList :<|>
       coerce itemFlingEffectRetrieve :<|>
       coerce itemList :<|>
       coerce itemPocketList :<|>
       coerce itemPocketRetrieve :<|>
       coerce itemRetrieve :<|>
       coerce locationAreaList :<|>
       coerce locationAreaRetrieve :<|>
       coerce locationList :<|>
       coerce locationRetrieve :<|>
       coerce palParkAreaList :<|>
       coerce palParkAreaRetrieve :<|>
       coerce regionList :<|>
       coerce regionRetrieve :<|>
       coerce machineList :<|>
       coerce machineRetrieve :<|>
       coerce moveAilmentList :<|>
       coerce moveAilmentRetrieve :<|>
       coerce moveBattleStyleList :<|>
       coerce moveBattleStyleRetrieve :<|>
       coerce moveCategoryList :<|>
       coerce moveCategoryRetrieve :<|>
       coerce moveLearnMethodList :<|>
       coerce moveLearnMethodRetrieve :<|>
       coerce moveList :<|>
       coerce moveRetrieve :<|>
       coerce moveTargetList :<|>
       coerce moveTargetRetrieve :<|>
       coerce abilityList :<|>
       coerce abilityRetrieve :<|>
       coerce characteristicList :<|>
       coerce characteristicRetrieve :<|>
       coerce eggGroupList :<|>
       coerce eggGroupRetrieve :<|>
       coerce genderList :<|>
       coerce genderRetrieve :<|>
       coerce growthRateList :<|>
       coerce growthRateRetrieve :<|>
       coerce moveDamageClassList :<|>
       coerce moveDamageClassRetrieve :<|>
       coerce natureList :<|>
       coerce natureRetrieve :<|>
       coerce pokeathlonStatList :<|>
       coerce pokeathlonStatRetrieve :<|>
       coerce pokemonColorList :<|>
       coerce pokemonColorRetrieve :<|>
       coerce pokemonFormList :<|>
       coerce pokemonFormRetrieve :<|>
       coerce pokemonHabitatList :<|>
       coerce pokemonHabitatRetrieve :<|>
       coerce pokemonList :<|>
       coerce pokemonRetrieve :<|>
       coerce pokemonShapeList :<|>
       coerce pokemonShapeRetrieve :<|>
       coerce pokemonSpeciesList :<|>
       coerce pokemonSpeciesRetrieve :<|>
       coerce statList :<|>
       coerce statRetrieve :<|>
       coerce typeList :<|>
       coerce typeRetrieve :<|>
       coerce languageList :<|>
       coerce languageRetrieve :<|>
       serveDirectoryFileServer "static")

-- Authentication is implemented with servants generalized authentication:
-- https://docs.servant.dev/en/stable/tutorial/Authentication.html#generalized-authentication

authHandler :: PokéAuth -> AuthHandler Request AuthServer
authHandler PokéAuth{..} = mkAuthHandler handler
  where
    handler req = case lookup "Authorization" (requestHeaders req) of
      Just header -> case extractBasicAuth header of
        Just (user, password) -> lookupUser (BasicAuthData user password)
        Nothing -> throwError (authError req)
      Nothing -> throwError (authError req)

type Protected = AuthProtect "basic"
type AuthServer = AuthServerData Protected
type AuthClient = AuthenticatedRequest Protected
type instance AuthClientData Protected = BasicAuthData

clientAuth :: BasicAuthData -> AuthClient
clientAuth key = mkAuthenticatedRequest key basicAuthReq
-- Authentication is implemented with servants generalized authentication:
-- https://docs.servant.dev/en/stable/tutorial/Authentication.html#generalized-authentication

authHandler :: PokéAuth -> AuthHandler Request AuthServer
authHandler PokéAuth{..} = mkAuthHandler handler
  where
    handler req = case lookup "sessionid" (requestHeaders req) of
      Just header -> lookupUser header
      Nothing -> throwError (authError req)

type Protected = AuthProtect "apikey"
type AuthServer = AuthServerData Protected
type AuthClient = AuthenticatedRequest Protected
type instance AuthClientData Protected = Text

clientAuth :: Text -> AuthClient
clientAuth key = mkAuthenticatedRequest key (addHeader "sessionid")

serverContext :: PokéAuth -> Context (AuthHandler Request AuthServer ': '[])
serverContext auth = authHandler auth :. EmptyContext
