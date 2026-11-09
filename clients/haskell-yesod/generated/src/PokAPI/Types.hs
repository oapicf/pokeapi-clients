{-# LANGUAGE GeneralizedNewtypeDeriving #-}
{-# LANGUAGE DeriveGeneric              #-}
{-# LANGUAGE NoImplicitPrelude          #-}
{-# OPTIONS_GHC -fno-warn-unused-binds -fno-warn-unused-imports #-}

module PokAPI.Types (
  AbilityChange (..),
  AbilityChangeEffectText (..),
  AbilityDetail (..),
  AbilityEffectText (..),
  AbilityFlavorText (..),
  AbilityName (..),
  AbilityPokemonDetail (..),
  AbilitySummary (..),
  BerryDetail (..),
  BerryFirmnessDetail (..),
  BerryFirmnessName (..),
  BerryFirmnessSummary (..),
  BerryFlavorBerryMap (..),
  BerryFlavorDetail (..),
  BerryFlavorMap (..),
  BerryFlavorName (..),
  BerryFlavorSummary (..),
  BerrySummary (..),
  CharacteristicDescription (..),
  CharacteristicDetail (..),
  CharacteristicSummary (..),
  ContestEffectDetail (..),
  ContestEffectEffectText (..),
  ContestEffectFlavorText (..),
  ContestEffectSummary (..),
  ContestTypeDetail (..),
  ContestTypeName (..),
  ContestTypeSummary (..),
  CurrencyDetail (..),
  CurrencyName (..),
  CurrencySummary (..),
  EggGroupDetail (..),
  EggGroupName (..),
  EggGroupSummary (..),
  EncounterConditionDetail (..),
  EncounterConditionName (..),
  EncounterConditionSummary (..),
  EncounterConditionValueDetail (..),
  EncounterConditionValueName (..),
  EncounterConditionValueSummary (..),
  EncounterMethodDetail (..),
  EncounterMethodName (..),
  EncounterMethodSummary (..),
  EncounterPokemonDetail (..),
  EvolutionChainDetail (..),
  EvolutionChainLink (..),
  EvolutionChainSummary (..),
  EvolutionConditionExpression (..),
  EvolutionTriggerDetail (..),
  EvolutionTriggerName (..),
  EvolutionTriggerSummary (..),
  EvolutionVariableDescription (..),
  EvolutionVariableDetail (..),
  EvolutionVariableName (..),
  EvolutionVariableSummary (..),
  Experience (..),
  GenderDetail (..),
  GenderPokemonSpecies (..),
  GenderSummary (..),
  GenerationDetail (..),
  GenerationName (..),
  GenerationSummary (..),
  GrowthRateDescription (..),
  GrowthRateDetail (..),
  GrowthRateSummary (..),
  ItemAttributeDescription (..),
  ItemAttributeDetail (..),
  ItemAttributeName (..),
  ItemAttributeSummary (..),
  ItemCategoryDetail (..),
  ItemCategoryName (..),
  ItemCategorySummary (..),
  ItemDetail (..),
  ItemEffectText (..),
  ItemFlavorText (..),
  ItemFlingEffectDetail (..),
  ItemFlingEffectEffectText (..),
  ItemFlingEffectSummary (..),
  ItemGameIndex (..),
  ItemMachine (..),
  ItemName (..),
  ItemPocketDetail (..),
  ItemPocketName (..),
  ItemPocketSummary (..),
  ItemPrice (..),
  ItemSprites (..),
  ItemSummary (..),
  LanguageDetail (..),
  LanguageName (..),
  LanguageSummary (..),
  LocationAreaDetail (..),
  LocationAreaEncounterDetail (..),
  LocationAreaEncounterRate (..),
  LocationAreaEncounterVersionDetail (..),
  LocationAreaName (..),
  LocationAreaPokemonEncounter (..),
  LocationAreaPokemonEncounterVersion (..),
  LocationAreaSummary (..),
  LocationDetail (..),
  LocationGameIndex (..),
  LocationName (..),
  LocationSummary (..),
  MachineDetail (..),
  MachineSummary (..),
  MoveBattleStyleDetail (..),
  MoveBattleStyleName (..),
  MoveBattleStyleSummary (..),
  MoveChange (..),
  MoveComboUsage (..),
  MoveCombos (..),
  MoveDamageClassDescription (..),
  MoveDamageClassDetail (..),
  MoveDamageClassName (..),
  MoveDamageClassSummary (..),
  MoveDetail (..),
  MoveEffectChange (..),
  MoveEffectChangeEffectText (..),
  MoveEffectEffectText (..),
  MoveFlavorText (..),
  MoveLearnMethodDescription (..),
  MoveLearnMethodDetail (..),
  MoveLearnMethodName (..),
  MoveLearnMethodSummary (..),
  MoveMeta (..),
  MoveMetaAilmentDetail (..),
  MoveMetaAilmentName (..),
  MoveMetaAilmentSummary (..),
  MoveMetaCategoryDescription (..),
  MoveMetaCategoryDetail (..),
  MoveMetaCategorySummary (..),
  MoveMetaStatChange (..),
  MoveName (..),
  MoveStatChange (..),
  MoveSummary (..),
  MoveTargetDescription (..),
  MoveTargetDetail (..),
  MoveTargetName (..),
  MoveTargetSummary (..),
  NatureBattleStylePreference (..),
  NatureDetail (..),
  NatureName (..),
  NaturePokeathlonStat (..),
  NatureSummary (..),
  PaginatedAbilitySummaryList (..),
  PaginatedBerryFirmnessSummaryList (..),
  PaginatedBerryFlavorSummaryList (..),
  PaginatedBerrySummaryList (..),
  PaginatedCharacteristicSummaryList (..),
  PaginatedContestEffectSummaryList (..),
  PaginatedContestTypeSummaryList (..),
  PaginatedCurrencySummaryList (..),
  PaginatedEggGroupSummaryList (..),
  PaginatedEncounterConditionSummaryList (..),
  PaginatedEncounterConditionValueSummaryList (..),
  PaginatedEncounterMethodSummaryList (..),
  PaginatedEvolutionChainSummaryList (..),
  PaginatedEvolutionTriggerSummaryList (..),
  PaginatedEvolutionVariableSummaryList (..),
  PaginatedGenderSummaryList (..),
  PaginatedGenerationSummaryList (..),
  PaginatedGrowthRateSummaryList (..),
  PaginatedItemAttributeSummaryList (..),
  PaginatedItemCategorySummaryList (..),
  PaginatedItemFlingEffectSummaryList (..),
  PaginatedItemPocketSummaryList (..),
  PaginatedItemSummaryList (..),
  PaginatedLanguageSummaryList (..),
  PaginatedLocationAreaSummaryList (..),
  PaginatedLocationSummaryList (..),
  PaginatedMachineSummaryList (..),
  PaginatedMoveBattleStyleSummaryList (..),
  PaginatedMoveDamageClassSummaryList (..),
  PaginatedMoveLearnMethodSummaryList (..),
  PaginatedMoveMetaAilmentSummaryList (..),
  PaginatedMoveMetaCategorySummaryList (..),
  PaginatedMoveSummaryList (..),
  PaginatedMoveTargetSummaryList (..),
  PaginatedNatureSummaryList (..),
  PaginatedPalParkAreaSummaryList (..),
  PaginatedPokeathlonStatSummaryList (..),
  PaginatedPokedexSummaryList (..),
  PaginatedPokemonColorSummaryList (..),
  PaginatedPokemonFormSummaryList (..),
  PaginatedPokemonHabitatSummaryList (..),
  PaginatedPokemonShapeSummaryList (..),
  PaginatedPokemonSpeciesSummaryList (..),
  PaginatedPokemonSummaryList (..),
  PaginatedRegionSummaryList (..),
  PaginatedStatSummaryList (..),
  PaginatedSuperContestEffectSummaryList (..),
  PaginatedTypeSummaryList (..),
  PaginatedVersionGroupSummaryList (..),
  PaginatedVersionSummaryList (..),
  PalParkAreaDetail (..),
  PalParkAreaName (..),
  PalParkAreaSummary (..),
  PalParkEncounter (..),
  PokeapiMetaResponse (..),
  PokeathlonStatAffectingNature (..),
  PokeathlonStatAffectingNatures (..),
  PokeathlonStatDetail (..),
  PokeathlonStatName (..),
  PokeathlonStatSummary (..),
  PokedexDescription (..),
  PokedexDetail (..),
  PokedexName (..),
  PokedexSummary (..),
  PokemonAbility (..),
  PokemonAbilityPast (..),
  PokemonColorDetail (..),
  PokemonColorName (..),
  PokemonColorSummary (..),
  PokemonCries (..),
  PokemonDetail (..),
  PokemonDexEntry (..),
  PokemonDexNumber (..),
  PokemonEncounterDetailResponse (..),
  PokemonEncounterResponse (..),
  PokemonEncounterVersionDetailResponse (..),
  PokemonEvolution (..),
  PokemonEvolutionKnownMove (..),
  PokemonFormDetail (..),
  PokemonFormFlavorText (..),
  PokemonFormName (..),
  PokemonFormSprites (..),
  PokemonFormSummary (..),
  PokemonFormTriggerCondition (..),
  PokemonFormType (..),
  PokemonGameIndex (..),
  PokemonHabitatDetail (..),
  PokemonHabitatName (..),
  PokemonHabitatSummary (..),
  PokemonHeldItem (..),
  PokemonHeldItemSummary (..),
  PokemonHeldItemVersion (..),
  PokemonMove (..),
  PokemonMoveVersionGroup (..),
  PokemonPastAbility (..),
  PokemonPastStat (..),
  PokemonPastType (..),
  PokemonShapeAwesomeName (..),
  PokemonShapeDetail (..),
  PokemonShapeName (..),
  PokemonShapeSummary (..),
  PokemonSpeciesDescription (..),
  PokemonSpeciesDetail (..),
  PokemonSpeciesFlavorText (..),
  PokemonSpeciesGenus (..),
  PokemonSpeciesName (..),
  PokemonSpeciesPalParkEncounter (..),
  PokemonSpeciesSummary (..),
  PokemonSpeciesVariety (..),
  PokemonSprites (..),
  PokemonSpritesOther (..),
  PokemonSpritesOtherDreamWorld (..),
  PokemonSpritesOtherHome (..),
  PokemonSpritesOtherOfficialArtwork (..),
  PokemonSpritesOtherShowdown (..),
  PokemonStat (..),
  PokemonSummary (..),
  PokemonType (..),
  RegionDetail (..),
  RegionName (..),
  RegionSummary (..),
  StatAffectingMoves (..),
  StatAffectingNatures (..),
  StatDetail (..),
  StatName (..),
  StatSummary (..),
  SuperContestEffectDetail (..),
  SuperContestEffectFlavorText (..),
  SuperContestEffectSummary (..),
  TypeDetail (..),
  TypeGameIndex (..),
  TypeGameSprite (..),
  TypeName (..),
  TypePastRelationships (..),
  TypePokemon (..),
  TypeRelationships (..),
  TypeSummary (..),
  VersionDetail (..),
  VersionGroupDetail (..),
  VersionGroupSummary (..),
  VersionName (..),
  VersionSummary (..),
  ) where

import ClassyPrelude.Yesod
import Data.Foldable (foldl)
import qualified Data.List as List
import Data.Maybe (fromMaybe)
import Data.Aeson (Value, FromJSON(..), ToJSON(..), genericToJSON, genericParseJSON)
import Data.Aeson.Types (Options(..), defaultOptions)
import qualified Data.Char as Char
import qualified Data.Text as T
import qualified Data.Map as Map
import GHC.Generics (Generic)


-- | 
data AbilityChange = AbilityChange
  { abilityChangeVersionUnderscoregroup :: VersionGroupSummary -- ^ The version group in which the previous effect of this ability originated.
  , abilityChangeEffectUnderscoreentries :: [AbilityChangeEffectText] -- ^ The previous effect of this ability listed in different languages.
  } deriving (Show, Eq, Generic)

instance FromJSON AbilityChange where
  parseJSON = genericParseJSON optionsAbilityChange
instance ToJSON AbilityChange where
  toJSON = genericToJSON optionsAbilityChange

optionsAbilityChange :: Options
optionsAbilityChange =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("abilityChangeVersionUnderscoregroup", "version_group")
      , ("abilityChangeEffectUnderscoreentries", "effect_entries")
      ]


-- | 
data AbilityChangeEffectText = AbilityChangeEffectText
  { abilityChangeEffectTextEffect :: Text -- ^ The localized effect text for an API resource in a specific language.
  , abilityChangeEffectTextLanguage :: LanguageSummary -- ^ The language this effect is in.
  } deriving (Show, Eq, Generic)

instance FromJSON AbilityChangeEffectText where
  parseJSON = genericParseJSON optionsAbilityChangeEffectText
instance ToJSON AbilityChangeEffectText where
  toJSON = genericToJSON optionsAbilityChangeEffectText

optionsAbilityChangeEffectText :: Options
optionsAbilityChangeEffectText =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("abilityChangeEffectTextEffect", "effect")
      , ("abilityChangeEffectTextLanguage", "language")
      ]


-- | 
data AbilityDetail = AbilityDetail
  { abilityDetailId :: Int -- ^ The identifier for this resource.
  , abilityDetailName :: Text -- ^ The name for this resource.
  , abilityDetailIsUnderscoremainUnderscoreseries :: Maybe Bool -- ^ Whether or not this ability originated in the main series of the video games.
  , abilityDetailGeneration :: GenerationSummary -- ^ The generation this ability originated in.
  , abilityDetailNames :: [AbilityName] -- ^ The name of this resource listed in different languages.
  , abilityDetailEffectUnderscoreentries :: [AbilityEffectText] -- ^ The effect of this ability listed in different languages.
  , abilityDetailEffectUnderscorechanges :: [AbilityChange] -- ^ The list of previous effects this ability has had across version groups.
  , abilityDetailFlavorUnderscoretextUnderscoreentries :: [AbilityFlavorText] -- ^ The flavor text of this ability listed in different languages.
  , abilityDetailPokemon :: [AbilityPokemonDetail] -- ^ A list of Pokémon that could potentially have this ability.
  } deriving (Show, Eq, Generic)

instance FromJSON AbilityDetail where
  parseJSON = genericParseJSON optionsAbilityDetail
instance ToJSON AbilityDetail where
  toJSON = genericToJSON optionsAbilityDetail

optionsAbilityDetail :: Options
optionsAbilityDetail =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("abilityDetailId", "id")
      , ("abilityDetailName", "name")
      , ("abilityDetailIsUnderscoremainUnderscoreseries", "is_main_series")
      , ("abilityDetailGeneration", "generation")
      , ("abilityDetailNames", "names")
      , ("abilityDetailEffectUnderscoreentries", "effect_entries")
      , ("abilityDetailEffectUnderscorechanges", "effect_changes")
      , ("abilityDetailFlavorUnderscoretextUnderscoreentries", "flavor_text_entries")
      , ("abilityDetailPokemon", "pokemon")
      ]


-- | 
data AbilityEffectText = AbilityEffectText
  { abilityEffectTextEffect :: Text -- ^ The localized effect text for an API resource in a specific language.
  , abilityEffectTextShortUnderscoreeffect :: Text -- ^ The localized effect text in brief.
  , abilityEffectTextLanguage :: LanguageSummary -- ^ The language this effect is in.
  } deriving (Show, Eq, Generic)

instance FromJSON AbilityEffectText where
  parseJSON = genericParseJSON optionsAbilityEffectText
instance ToJSON AbilityEffectText where
  toJSON = genericToJSON optionsAbilityEffectText

optionsAbilityEffectText :: Options
optionsAbilityEffectText =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("abilityEffectTextEffect", "effect")
      , ("abilityEffectTextShortUnderscoreeffect", "short_effect")
      , ("abilityEffectTextLanguage", "language")
      ]


-- | 
data AbilityFlavorText = AbilityFlavorText
  { abilityFlavorTextFlavorUnderscoretext :: Text -- ^ The localized name for an API resource in a specific language.
  , abilityFlavorTextLanguage :: LanguageSummary -- ^ The language this text resource is in.
  , abilityFlavorTextVersionUnderscoregroup :: VersionGroupSummary -- ^ The version group that uses this flavor text.
  } deriving (Show, Eq, Generic)

instance FromJSON AbilityFlavorText where
  parseJSON = genericParseJSON optionsAbilityFlavorText
instance ToJSON AbilityFlavorText where
  toJSON = genericToJSON optionsAbilityFlavorText

optionsAbilityFlavorText :: Options
optionsAbilityFlavorText =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("abilityFlavorTextFlavorUnderscoretext", "flavor_text")
      , ("abilityFlavorTextLanguage", "language")
      , ("abilityFlavorTextVersionUnderscoregroup", "version_group")
      ]


-- | 
data AbilityName = AbilityName
  { abilityNameName :: Text -- ^ The localized name for an API resource in a specific language.
  , abilityNameLanguage :: LanguageSummary -- ^ The language this name is in.
  } deriving (Show, Eq, Generic)

instance FromJSON AbilityName where
  parseJSON = genericParseJSON optionsAbilityName
instance ToJSON AbilityName where
  toJSON = genericToJSON optionsAbilityName

optionsAbilityName :: Options
optionsAbilityName =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("abilityNameName", "name")
      , ("abilityNameLanguage", "language")
      ]


-- | 
data AbilityPokemonDetail = AbilityPokemonDetail
  { abilityPokemonDetailIsUnderscorehidden :: Maybe Bool -- ^ Whether or not this a hidden ability for the referenced Pokémon.
  , abilityPokemonDetailSlot :: Int -- ^ Pokémon have 3 ability 'slots' which hold references to possible abilities they could have. This is the slot of this ability for the referenced pokemon.
  , abilityPokemonDetailPokemon :: PokemonSummary -- ^ The Pokémon this ability could belong to.
  } deriving (Show, Eq, Generic)

instance FromJSON AbilityPokemonDetail where
  parseJSON = genericParseJSON optionsAbilityPokemonDetail
instance ToJSON AbilityPokemonDetail where
  toJSON = genericToJSON optionsAbilityPokemonDetail

optionsAbilityPokemonDetail :: Options
optionsAbilityPokemonDetail =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("abilityPokemonDetailIsUnderscorehidden", "is_hidden")
      , ("abilityPokemonDetailSlot", "slot")
      , ("abilityPokemonDetailPokemon", "pokemon")
      ]


-- | 
data AbilitySummary = AbilitySummary
  { abilitySummaryName :: Text -- ^ The name of the referenced resource.
  , abilitySummaryUrl :: Text -- ^ The URL of the referenced resource.
  } deriving (Show, Eq, Generic)

instance FromJSON AbilitySummary where
  parseJSON = genericParseJSON optionsAbilitySummary
instance ToJSON AbilitySummary where
  toJSON = genericToJSON optionsAbilitySummary

optionsAbilitySummary :: Options
optionsAbilitySummary =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("abilitySummaryName", "name")
      , ("abilitySummaryUrl", "url")
      ]


-- | 
data BerryDetail = BerryDetail
  { berryDetailId :: Int -- ^ The identifier for this resource.
  , berryDetailName :: Text -- ^ The name for this resource.
  , berryDetailGrowthUnderscoretime :: Maybe Int -- ^ Time it takes the tree to grow one stage, in hours. Berry trees go through four of these growth stages before they can be picked.
  , berryDetailMaxUnderscoreharvest :: Maybe Int -- ^ The maximum number of these berries that can grow on one tree in Generation IV.
  , berryDetailNaturalUnderscoregiftUnderscorepower :: Maybe Int -- ^ The power of the move \"Natural Gift\" when used with this Berry.
  , berryDetailSize :: Maybe Int -- ^ The size of this Berry, in millimeters.
  , berryDetailSmoothness :: Maybe Int -- ^ The smoothness of this Berry, used in making Pokéblocks or Poffins.
  , berryDetailSoilUnderscoredryness :: Maybe Int -- ^ The speed at which this Berry dries out the soil as it grows. A higher rate means the soil dries more quickly.
  , berryDetailFirmness :: BerryFirmnessSummary -- ^ The firmness of this berry, used in making Pokéblocks or Poffins.
  , berryDetailFlavors :: [BerryFlavorMap] -- ^ A list of references to each flavor a berry can have and the potency of each of those flavors in regard to this berry.
  , berryDetailItem :: ItemSummary -- ^ Berries are actually items. This is a reference to the item specific data for this berry.
  , berryDetailNaturalUnderscoregiftUnderscoretype :: TypeSummary -- ^ The type inherited by \"Natural Gift\" when used with this Berry.
  } deriving (Show, Eq, Generic)

instance FromJSON BerryDetail where
  parseJSON = genericParseJSON optionsBerryDetail
instance ToJSON BerryDetail where
  toJSON = genericToJSON optionsBerryDetail

optionsBerryDetail :: Options
optionsBerryDetail =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("berryDetailId", "id")
      , ("berryDetailName", "name")
      , ("berryDetailGrowthUnderscoretime", "growth_time")
      , ("berryDetailMaxUnderscoreharvest", "max_harvest")
      , ("berryDetailNaturalUnderscoregiftUnderscorepower", "natural_gift_power")
      , ("berryDetailSize", "size")
      , ("berryDetailSmoothness", "smoothness")
      , ("berryDetailSoilUnderscoredryness", "soil_dryness")
      , ("berryDetailFirmness", "firmness")
      , ("berryDetailFlavors", "flavors")
      , ("berryDetailItem", "item")
      , ("berryDetailNaturalUnderscoregiftUnderscoretype", "natural_gift_type")
      ]


-- | 
data BerryFirmnessDetail = BerryFirmnessDetail
  { berryFirmnessDetailId :: Int -- ^ The identifier for this resource.
  , berryFirmnessDetailName :: Text -- ^ The name for this resource.
  , berryFirmnessDetailBerries :: [BerrySummary] -- ^ A list of the berries with this firmness.
  , berryFirmnessDetailNames :: [BerryFirmnessName] -- ^ The name of this resource listed in different languages.
  } deriving (Show, Eq, Generic)

instance FromJSON BerryFirmnessDetail where
  parseJSON = genericParseJSON optionsBerryFirmnessDetail
instance ToJSON BerryFirmnessDetail where
  toJSON = genericToJSON optionsBerryFirmnessDetail

optionsBerryFirmnessDetail :: Options
optionsBerryFirmnessDetail =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("berryFirmnessDetailId", "id")
      , ("berryFirmnessDetailName", "name")
      , ("berryFirmnessDetailBerries", "berries")
      , ("berryFirmnessDetailNames", "names")
      ]


-- | 
data BerryFirmnessName = BerryFirmnessName
  { berryFirmnessNameName :: Text -- ^ The localized name for an API resource in a specific language.
  , berryFirmnessNameLanguage :: LanguageSummary -- ^ The language this name is in.
  } deriving (Show, Eq, Generic)

instance FromJSON BerryFirmnessName where
  parseJSON = genericParseJSON optionsBerryFirmnessName
instance ToJSON BerryFirmnessName where
  toJSON = genericToJSON optionsBerryFirmnessName

optionsBerryFirmnessName :: Options
optionsBerryFirmnessName =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("berryFirmnessNameName", "name")
      , ("berryFirmnessNameLanguage", "language")
      ]


-- | 
data BerryFirmnessSummary = BerryFirmnessSummary
  { berryFirmnessSummaryName :: Text -- ^ The name of the referenced resource.
  , berryFirmnessSummaryUrl :: Text -- ^ The URL of the referenced resource.
  } deriving (Show, Eq, Generic)

instance FromJSON BerryFirmnessSummary where
  parseJSON = genericParseJSON optionsBerryFirmnessSummary
instance ToJSON BerryFirmnessSummary where
  toJSON = genericToJSON optionsBerryFirmnessSummary

optionsBerryFirmnessSummary :: Options
optionsBerryFirmnessSummary =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("berryFirmnessSummaryName", "name")
      , ("berryFirmnessSummaryUrl", "url")
      ]


-- | 
data BerryFlavorBerryMap = BerryFlavorBerryMap
  { berryFlavorBerryMapPotency :: Int -- ^ How powerful the referenced flavor is for this berry.
  , berryFlavorBerryMapBerry :: BerrySummary -- ^ The berry with the referenced flavor.
  } deriving (Show, Eq, Generic)

instance FromJSON BerryFlavorBerryMap where
  parseJSON = genericParseJSON optionsBerryFlavorBerryMap
instance ToJSON BerryFlavorBerryMap where
  toJSON = genericToJSON optionsBerryFlavorBerryMap

optionsBerryFlavorBerryMap :: Options
optionsBerryFlavorBerryMap =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("berryFlavorBerryMapPotency", "potency")
      , ("berryFlavorBerryMapBerry", "berry")
      ]


-- | 
data BerryFlavorDetail = BerryFlavorDetail
  { berryFlavorDetailId :: Int -- ^ The identifier for this resource.
  , berryFlavorDetailName :: Text -- ^ The name for this resource.
  , berryFlavorDetailBerries :: [BerryFlavorBerryMap] -- ^ A list of the berries with this flavor.
  , berryFlavorDetailContestUnderscoretype :: ContestTypeSummary -- ^ The contest type that correlates with this berry flavor.
  , berryFlavorDetailNames :: [BerryFlavorName] -- ^ The name of this resource listed in different languages.
  } deriving (Show, Eq, Generic)

instance FromJSON BerryFlavorDetail where
  parseJSON = genericParseJSON optionsBerryFlavorDetail
instance ToJSON BerryFlavorDetail where
  toJSON = genericToJSON optionsBerryFlavorDetail

optionsBerryFlavorDetail :: Options
optionsBerryFlavorDetail =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("berryFlavorDetailId", "id")
      , ("berryFlavorDetailName", "name")
      , ("berryFlavorDetailBerries", "berries")
      , ("berryFlavorDetailContestUnderscoretype", "contest_type")
      , ("berryFlavorDetailNames", "names")
      ]


-- | 
data BerryFlavorMap = BerryFlavorMap
  { berryFlavorMapPotency :: Int -- ^ How powerful the referenced flavor is for this berry.
  , berryFlavorMapFlavor :: BerryFlavorSummary -- ^ The referenced berry flavor.
  } deriving (Show, Eq, Generic)

instance FromJSON BerryFlavorMap where
  parseJSON = genericParseJSON optionsBerryFlavorMap
instance ToJSON BerryFlavorMap where
  toJSON = genericToJSON optionsBerryFlavorMap

optionsBerryFlavorMap :: Options
optionsBerryFlavorMap =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("berryFlavorMapPotency", "potency")
      , ("berryFlavorMapFlavor", "flavor")
      ]


-- | 
data BerryFlavorName = BerryFlavorName
  { berryFlavorNameName :: Text -- ^ The localized name for an API resource in a specific language.
  , berryFlavorNameLanguage :: LanguageSummary -- ^ The language this name is in.
  } deriving (Show, Eq, Generic)

instance FromJSON BerryFlavorName where
  parseJSON = genericParseJSON optionsBerryFlavorName
instance ToJSON BerryFlavorName where
  toJSON = genericToJSON optionsBerryFlavorName

optionsBerryFlavorName :: Options
optionsBerryFlavorName =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("berryFlavorNameName", "name")
      , ("berryFlavorNameLanguage", "language")
      ]


-- | 
data BerryFlavorSummary = BerryFlavorSummary
  { berryFlavorSummaryName :: Text -- ^ The name of the referenced resource.
  , berryFlavorSummaryUrl :: Text -- ^ The URL of the referenced resource.
  } deriving (Show, Eq, Generic)

instance FromJSON BerryFlavorSummary where
  parseJSON = genericParseJSON optionsBerryFlavorSummary
instance ToJSON BerryFlavorSummary where
  toJSON = genericToJSON optionsBerryFlavorSummary

optionsBerryFlavorSummary :: Options
optionsBerryFlavorSummary =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("berryFlavorSummaryName", "name")
      , ("berryFlavorSummaryUrl", "url")
      ]


-- | 
data BerrySummary = BerrySummary
  { berrySummaryName :: Text -- ^ The name of the referenced resource.
  , berrySummaryUrl :: Text -- ^ The URL of the referenced resource.
  } deriving (Show, Eq, Generic)

instance FromJSON BerrySummary where
  parseJSON = genericParseJSON optionsBerrySummary
instance ToJSON BerrySummary where
  toJSON = genericToJSON optionsBerrySummary

optionsBerrySummary :: Options
optionsBerrySummary =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("berrySummaryName", "name")
      , ("berrySummaryUrl", "url")
      ]


-- | 
data CharacteristicDescription = CharacteristicDescription
  { characteristicDescriptionDescription :: Maybe Text -- ^ The localized description for an API resource in a specific language.
  , characteristicDescriptionLanguage :: LanguageSummary -- ^ The language this name is in.
  } deriving (Show, Eq, Generic)

instance FromJSON CharacteristicDescription where
  parseJSON = genericParseJSON optionsCharacteristicDescription
instance ToJSON CharacteristicDescription where
  toJSON = genericToJSON optionsCharacteristicDescription

optionsCharacteristicDescription :: Options
optionsCharacteristicDescription =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("characteristicDescriptionDescription", "description")
      , ("characteristicDescriptionLanguage", "language")
      ]


-- | 
data CharacteristicDetail = CharacteristicDetail
  { characteristicDetailId :: Int -- ^ The identifier for this resource.
  , characteristicDetailGeneUnderscoremodulo :: Int -- ^ The remainder of the highest stat/IV divided by 5.
  , characteristicDetailPossibleUnderscorevalues :: [Int] -- ^ The possible values of the highest stat that would result in a Pokémon recieving this characteristic when divided by 5.
  , characteristicDetailHighestUnderscorestat :: StatSummary -- ^ The stat which results in this characteristic.
  , characteristicDetailDescriptions :: [CharacteristicDescription] -- ^ The descriptions of this characteristic listed in different languages.
  } deriving (Show, Eq, Generic)

instance FromJSON CharacteristicDetail where
  parseJSON = genericParseJSON optionsCharacteristicDetail
instance ToJSON CharacteristicDetail where
  toJSON = genericToJSON optionsCharacteristicDetail

optionsCharacteristicDetail :: Options
optionsCharacteristicDetail =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("characteristicDetailId", "id")
      , ("characteristicDetailGeneUnderscoremodulo", "gene_modulo")
      , ("characteristicDetailPossibleUnderscorevalues", "possible_values")
      , ("characteristicDetailHighestUnderscorestat", "highest_stat")
      , ("characteristicDetailDescriptions", "descriptions")
      ]


-- | 
data CharacteristicSummary = CharacteristicSummary
  { characteristicSummaryUrl :: Text -- ^ The URL of the referenced resource.
  } deriving (Show, Eq, Generic)

instance FromJSON CharacteristicSummary where
  parseJSON = genericParseJSON optionsCharacteristicSummary
instance ToJSON CharacteristicSummary where
  toJSON = genericToJSON optionsCharacteristicSummary

optionsCharacteristicSummary :: Options
optionsCharacteristicSummary =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("characteristicSummaryUrl", "url")
      ]


-- | 
data ContestEffectDetail = ContestEffectDetail
  { contestEffectDetailId :: Int -- ^ The identifier for this resource.
  , contestEffectDetailAppeal :: Int -- ^ The base number of hearts the user of this move gets.
  , contestEffectDetailJam :: Int -- ^ The base number of hearts the user's opponent loses.
  , contestEffectDetailEffectUnderscoreentries :: [ContestEffectEffectText] -- ^ The result of this contest effect listed in different languages.
  , contestEffectDetailFlavorUnderscoretextUnderscoreentries :: [ContestEffectFlavorText] -- ^ The flavor text of this contest effect listed in different languages.
  } deriving (Show, Eq, Generic)

instance FromJSON ContestEffectDetail where
  parseJSON = genericParseJSON optionsContestEffectDetail
instance ToJSON ContestEffectDetail where
  toJSON = genericToJSON optionsContestEffectDetail

optionsContestEffectDetail :: Options
optionsContestEffectDetail =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("contestEffectDetailId", "id")
      , ("contestEffectDetailAppeal", "appeal")
      , ("contestEffectDetailJam", "jam")
      , ("contestEffectDetailEffectUnderscoreentries", "effect_entries")
      , ("contestEffectDetailFlavorUnderscoretextUnderscoreentries", "flavor_text_entries")
      ]


-- | 
data ContestEffectEffectText = ContestEffectEffectText
  { contestEffectEffectTextEffect :: Text -- ^ The localized effect text for an API resource in a specific language.
  , contestEffectEffectTextLanguage :: LanguageSummary -- ^ The language this effect is in.
  } deriving (Show, Eq, Generic)

instance FromJSON ContestEffectEffectText where
  parseJSON = genericParseJSON optionsContestEffectEffectText
instance ToJSON ContestEffectEffectText where
  toJSON = genericToJSON optionsContestEffectEffectText

optionsContestEffectEffectText :: Options
optionsContestEffectEffectText =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("contestEffectEffectTextEffect", "effect")
      , ("contestEffectEffectTextLanguage", "language")
      ]


-- | 
data ContestEffectFlavorText = ContestEffectFlavorText
  { contestEffectFlavorTextFlavorUnderscoretext :: Text -- ^ The localized flavor text for an API resource in a specific language.
  , contestEffectFlavorTextLanguage :: LanguageSummary -- ^ The language this name is in.
  } deriving (Show, Eq, Generic)

instance FromJSON ContestEffectFlavorText where
  parseJSON = genericParseJSON optionsContestEffectFlavorText
instance ToJSON ContestEffectFlavorText where
  toJSON = genericToJSON optionsContestEffectFlavorText

optionsContestEffectFlavorText :: Options
optionsContestEffectFlavorText =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("contestEffectFlavorTextFlavorUnderscoretext", "flavor_text")
      , ("contestEffectFlavorTextLanguage", "language")
      ]


-- | 
data ContestEffectSummary = ContestEffectSummary
  { contestEffectSummaryUrl :: Text -- ^ The URL of the referenced resource.
  } deriving (Show, Eq, Generic)

instance FromJSON ContestEffectSummary where
  parseJSON = genericParseJSON optionsContestEffectSummary
instance ToJSON ContestEffectSummary where
  toJSON = genericToJSON optionsContestEffectSummary

optionsContestEffectSummary :: Options
optionsContestEffectSummary =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("contestEffectSummaryUrl", "url")
      ]


-- | 
data ContestTypeDetail = ContestTypeDetail
  { contestTypeDetailId :: Int -- ^ The identifier for this resource.
  , contestTypeDetailName :: Text -- ^ The name for this resource.
  , contestTypeDetailBerryUnderscoreflavor :: BerryFlavorSummary -- ^ The berry flavor that correlates with this contest type.
  , contestTypeDetailNames :: [ContestTypeName] -- ^ The name of this contest type listed in different languages.
  } deriving (Show, Eq, Generic)

instance FromJSON ContestTypeDetail where
  parseJSON = genericParseJSON optionsContestTypeDetail
instance ToJSON ContestTypeDetail where
  toJSON = genericToJSON optionsContestTypeDetail

optionsContestTypeDetail :: Options
optionsContestTypeDetail =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("contestTypeDetailId", "id")
      , ("contestTypeDetailName", "name")
      , ("contestTypeDetailBerryUnderscoreflavor", "berry_flavor")
      , ("contestTypeDetailNames", "names")
      ]


-- | 
data ContestTypeName = ContestTypeName
  { contestTypeNameName :: Text -- ^ The name for this contest.
  , contestTypeNameColor :: Text -- ^ The color associated with this contest's name.
  , contestTypeNameLanguage :: LanguageSummary -- ^ The language that this name is in.
  } deriving (Show, Eq, Generic)

instance FromJSON ContestTypeName where
  parseJSON = genericParseJSON optionsContestTypeName
instance ToJSON ContestTypeName where
  toJSON = genericToJSON optionsContestTypeName

optionsContestTypeName :: Options
optionsContestTypeName =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("contestTypeNameName", "name")
      , ("contestTypeNameColor", "color")
      , ("contestTypeNameLanguage", "language")
      ]


-- | 
data ContestTypeSummary = ContestTypeSummary
  { contestTypeSummaryName :: Text -- ^ The name of the referenced resource.
  , contestTypeSummaryUrl :: Text -- ^ The URL of the referenced resource.
  } deriving (Show, Eq, Generic)

instance FromJSON ContestTypeSummary where
  parseJSON = genericParseJSON optionsContestTypeSummary
instance ToJSON ContestTypeSummary where
  toJSON = genericToJSON optionsContestTypeSummary

optionsContestTypeSummary :: Options
optionsContestTypeSummary =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("contestTypeSummaryName", "name")
      , ("contestTypeSummaryUrl", "url")
      ]


-- | 
data CurrencyDetail = CurrencyDetail
  { currencyDetailId :: Int -- ^ The identifier for this resource.
  , currencyDetailName :: Text -- ^ The name for this resource.
  , currencyDetailNames :: [CurrencyName] -- ^ The name of this resource listed in different languages.
  } deriving (Show, Eq, Generic)

instance FromJSON CurrencyDetail where
  parseJSON = genericParseJSON optionsCurrencyDetail
instance ToJSON CurrencyDetail where
  toJSON = genericToJSON optionsCurrencyDetail

optionsCurrencyDetail :: Options
optionsCurrencyDetail =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("currencyDetailId", "id")
      , ("currencyDetailName", "name")
      , ("currencyDetailNames", "names")
      ]


-- | 
data CurrencyName = CurrencyName
  { currencyNameName :: Text -- ^ The localized name for an API resource in a specific language.
  , currencyNameLanguage :: LanguageSummary -- ^ The language this name is in.
  } deriving (Show, Eq, Generic)

instance FromJSON CurrencyName where
  parseJSON = genericParseJSON optionsCurrencyName
instance ToJSON CurrencyName where
  toJSON = genericToJSON optionsCurrencyName

optionsCurrencyName :: Options
optionsCurrencyName =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("currencyNameName", "name")
      , ("currencyNameLanguage", "language")
      ]


-- | 
data CurrencySummary = CurrencySummary
  { currencySummaryName :: Text -- ^ The name of the referenced resource.
  , currencySummaryUrl :: Text -- ^ The URL of the referenced resource.
  } deriving (Show, Eq, Generic)

instance FromJSON CurrencySummary where
  parseJSON = genericParseJSON optionsCurrencySummary
instance ToJSON CurrencySummary where
  toJSON = genericToJSON optionsCurrencySummary

optionsCurrencySummary :: Options
optionsCurrencySummary =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("currencySummaryName", "name")
      , ("currencySummaryUrl", "url")
      ]


-- | 
data EggGroupDetail = EggGroupDetail
  { eggGroupDetailId :: Int -- ^ The identifier for this resource.
  , eggGroupDetailName :: Text -- ^ The name for this resource.
  , eggGroupDetailNames :: [EggGroupName] -- ^ The name of this resource listed in different languages.
  , eggGroupDetailPokemonUnderscorespecies :: [PokemonSpeciesSummary] -- ^ A list of all Pokémon species that are members of this egg group.
  } deriving (Show, Eq, Generic)

instance FromJSON EggGroupDetail where
  parseJSON = genericParseJSON optionsEggGroupDetail
instance ToJSON EggGroupDetail where
  toJSON = genericToJSON optionsEggGroupDetail

optionsEggGroupDetail :: Options
optionsEggGroupDetail =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("eggGroupDetailId", "id")
      , ("eggGroupDetailName", "name")
      , ("eggGroupDetailNames", "names")
      , ("eggGroupDetailPokemonUnderscorespecies", "pokemon_species")
      ]


-- | 
data EggGroupName = EggGroupName
  { eggGroupNameName :: Text -- ^ The localized name for an API resource in a specific language.
  , eggGroupNameLanguage :: LanguageSummary -- ^ The language this name is in.
  } deriving (Show, Eq, Generic)

instance FromJSON EggGroupName where
  parseJSON = genericParseJSON optionsEggGroupName
instance ToJSON EggGroupName where
  toJSON = genericToJSON optionsEggGroupName

optionsEggGroupName :: Options
optionsEggGroupName =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("eggGroupNameName", "name")
      , ("eggGroupNameLanguage", "language")
      ]


-- | 
data EggGroupSummary = EggGroupSummary
  { eggGroupSummaryName :: Text -- ^ The name of the referenced resource.
  , eggGroupSummaryUrl :: Text -- ^ The URL of the referenced resource.
  } deriving (Show, Eq, Generic)

instance FromJSON EggGroupSummary where
  parseJSON = genericParseJSON optionsEggGroupSummary
instance ToJSON EggGroupSummary where
  toJSON = genericToJSON optionsEggGroupSummary

optionsEggGroupSummary :: Options
optionsEggGroupSummary =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("eggGroupSummaryName", "name")
      , ("eggGroupSummaryUrl", "url")
      ]


-- | 
data EncounterConditionDetail = EncounterConditionDetail
  { encounterConditionDetailId :: Int -- ^ The identifier for this resource.
  , encounterConditionDetailName :: Text -- ^ The name for this resource.
  , encounterConditionDetailValues :: [EncounterConditionValueSummary] -- ^ A list of possible values for this encounter condition.
  , encounterConditionDetailNames :: [EncounterConditionName] -- ^ The name of this resource listed in different languages.
  } deriving (Show, Eq, Generic)

instance FromJSON EncounterConditionDetail where
  parseJSON = genericParseJSON optionsEncounterConditionDetail
instance ToJSON EncounterConditionDetail where
  toJSON = genericToJSON optionsEncounterConditionDetail

optionsEncounterConditionDetail :: Options
optionsEncounterConditionDetail =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("encounterConditionDetailId", "id")
      , ("encounterConditionDetailName", "name")
      , ("encounterConditionDetailValues", "values")
      , ("encounterConditionDetailNames", "names")
      ]


-- | 
data EncounterConditionName = EncounterConditionName
  { encounterConditionNameName :: Text -- ^ The localized name for an API resource in a specific language.
  , encounterConditionNameLanguage :: LanguageSummary -- ^ The language this name is in.
  } deriving (Show, Eq, Generic)

instance FromJSON EncounterConditionName where
  parseJSON = genericParseJSON optionsEncounterConditionName
instance ToJSON EncounterConditionName where
  toJSON = genericToJSON optionsEncounterConditionName

optionsEncounterConditionName :: Options
optionsEncounterConditionName =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("encounterConditionNameName", "name")
      , ("encounterConditionNameLanguage", "language")
      ]


-- | 
data EncounterConditionSummary = EncounterConditionSummary
  { encounterConditionSummaryName :: Text -- ^ The name of the referenced resource.
  , encounterConditionSummaryUrl :: Text -- ^ The URL of the referenced resource.
  } deriving (Show, Eq, Generic)

instance FromJSON EncounterConditionSummary where
  parseJSON = genericParseJSON optionsEncounterConditionSummary
instance ToJSON EncounterConditionSummary where
  toJSON = genericToJSON optionsEncounterConditionSummary

optionsEncounterConditionSummary :: Options
optionsEncounterConditionSummary =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("encounterConditionSummaryName", "name")
      , ("encounterConditionSummaryUrl", "url")
      ]


-- | 
data EncounterConditionValueDetail = EncounterConditionValueDetail
  { encounterConditionValueDetailId :: Int -- ^ The identifier for this resource.
  , encounterConditionValueDetailName :: Text -- ^ The name for this resource.
  , encounterConditionValueDetailCondition :: EncounterConditionSummary -- ^ The condition this encounter condition value pertains to.
  , encounterConditionValueDetailNames :: [EncounterConditionValueName] -- ^ The name of this resource listed in different languages.
  } deriving (Show, Eq, Generic)

instance FromJSON EncounterConditionValueDetail where
  parseJSON = genericParseJSON optionsEncounterConditionValueDetail
instance ToJSON EncounterConditionValueDetail where
  toJSON = genericToJSON optionsEncounterConditionValueDetail

optionsEncounterConditionValueDetail :: Options
optionsEncounterConditionValueDetail =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("encounterConditionValueDetailId", "id")
      , ("encounterConditionValueDetailName", "name")
      , ("encounterConditionValueDetailCondition", "condition")
      , ("encounterConditionValueDetailNames", "names")
      ]


-- | 
data EncounterConditionValueName = EncounterConditionValueName
  { encounterConditionValueNameName :: Text -- ^ The localized name for an API resource in a specific language.
  , encounterConditionValueNameLanguage :: LanguageSummary -- ^ The language this name is in.
  } deriving (Show, Eq, Generic)

instance FromJSON EncounterConditionValueName where
  parseJSON = genericParseJSON optionsEncounterConditionValueName
instance ToJSON EncounterConditionValueName where
  toJSON = genericToJSON optionsEncounterConditionValueName

optionsEncounterConditionValueName :: Options
optionsEncounterConditionValueName =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("encounterConditionValueNameName", "name")
      , ("encounterConditionValueNameLanguage", "language")
      ]


-- | 
data EncounterConditionValueSummary = EncounterConditionValueSummary
  { encounterConditionValueSummaryName :: Text -- ^ The name of the referenced resource.
  , encounterConditionValueSummaryUrl :: Text -- ^ The URL of the referenced resource.
  } deriving (Show, Eq, Generic)

instance FromJSON EncounterConditionValueSummary where
  parseJSON = genericParseJSON optionsEncounterConditionValueSummary
instance ToJSON EncounterConditionValueSummary where
  toJSON = genericToJSON optionsEncounterConditionValueSummary

optionsEncounterConditionValueSummary :: Options
optionsEncounterConditionValueSummary =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("encounterConditionValueSummaryName", "name")
      , ("encounterConditionValueSummaryUrl", "url")
      ]


-- | 
data EncounterMethodDetail = EncounterMethodDetail
  { encounterMethodDetailId :: Int -- ^ The identifier for this resource.
  , encounterMethodDetailName :: Text -- ^ The name for this resource.
  , encounterMethodDetailOrder :: Maybe Int -- ^ A good value for sorting.
  , encounterMethodDetailNames :: [EncounterMethodName] -- ^ The name of this resource listed in different languages.
  } deriving (Show, Eq, Generic)

instance FromJSON EncounterMethodDetail where
  parseJSON = genericParseJSON optionsEncounterMethodDetail
instance ToJSON EncounterMethodDetail where
  toJSON = genericToJSON optionsEncounterMethodDetail

optionsEncounterMethodDetail :: Options
optionsEncounterMethodDetail =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("encounterMethodDetailId", "id")
      , ("encounterMethodDetailName", "name")
      , ("encounterMethodDetailOrder", "order")
      , ("encounterMethodDetailNames", "names")
      ]


-- | 
data EncounterMethodName = EncounterMethodName
  { encounterMethodNameName :: Text -- ^ The localized name for an API resource in a specific language.
  , encounterMethodNameLanguage :: LanguageSummary -- ^ The language this name is in.
  } deriving (Show, Eq, Generic)

instance FromJSON EncounterMethodName where
  parseJSON = genericParseJSON optionsEncounterMethodName
instance ToJSON EncounterMethodName where
  toJSON = genericToJSON optionsEncounterMethodName

optionsEncounterMethodName :: Options
optionsEncounterMethodName =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("encounterMethodNameName", "name")
      , ("encounterMethodNameLanguage", "language")
      ]


-- | 
data EncounterMethodSummary = EncounterMethodSummary
  { encounterMethodSummaryName :: Text -- ^ The name of the referenced resource.
  , encounterMethodSummaryUrl :: Text -- ^ The URL of the referenced resource.
  } deriving (Show, Eq, Generic)

instance FromJSON EncounterMethodSummary where
  parseJSON = genericParseJSON optionsEncounterMethodSummary
instance ToJSON EncounterMethodSummary where
  toJSON = genericToJSON optionsEncounterMethodSummary

optionsEncounterMethodSummary :: Options
optionsEncounterMethodSummary =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("encounterMethodSummaryName", "name")
      , ("encounterMethodSummaryUrl", "url")
      ]


-- | 
data EncounterPokemonDetail = EncounterPokemonDetail
  { encounterPokemonDetailMinUnderscoreperfectUnderscoreivs :: Maybe Int -- ^ The minimum number of perfect IVs, or null if unspecified.
  , encounterPokemonDetailAlwaysUnderscoreshiny :: Maybe Bool -- ^ Whether the encountered Pokémon is always shiny.
  , encounterPokemonDetailNeverUnderscoreshiny :: Maybe Bool -- ^ Whether the encountered Pokémon can never be shiny.
  , encounterPokemonDetailIsUnderscorealpha :: Maybe Bool -- ^ Whether the encountered Pokémon is an alpha Pokémon.
  } deriving (Show, Eq, Generic)

instance FromJSON EncounterPokemonDetail where
  parseJSON = genericParseJSON optionsEncounterPokemonDetail
instance ToJSON EncounterPokemonDetail where
  toJSON = genericToJSON optionsEncounterPokemonDetail

optionsEncounterPokemonDetail :: Options
optionsEncounterPokemonDetail =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("encounterPokemonDetailMinUnderscoreperfectUnderscoreivs", "min_perfect_ivs")
      , ("encounterPokemonDetailAlwaysUnderscoreshiny", "always_shiny")
      , ("encounterPokemonDetailNeverUnderscoreshiny", "never_shiny")
      , ("encounterPokemonDetailIsUnderscorealpha", "is_alpha")
      ]


-- | 
data EvolutionChainDetail = EvolutionChainDetail
  { evolutionChainDetailId :: Int -- ^ The identifier for this resource.
  , evolutionChainDetailBabyUnderscoretriggerUnderscoreitem :: ItemSummary -- ^ The item that a Pokémon would be holding when mating that would trigger the egg hatching a baby Pokémon rather than a basic Pokémon.
  , evolutionChainDetailChain :: EvolutionChainLink -- ^ The base chain link object. Each link contains evolution details for a Pokémon in the chain. Each link references the next Pokémon in the natural evolution order.
  } deriving (Show, Eq, Generic)

instance FromJSON EvolutionChainDetail where
  parseJSON = genericParseJSON optionsEvolutionChainDetail
instance ToJSON EvolutionChainDetail where
  toJSON = genericToJSON optionsEvolutionChainDetail

optionsEvolutionChainDetail :: Options
optionsEvolutionChainDetail =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("evolutionChainDetailId", "id")
      , ("evolutionChainDetailBabyUnderscoretriggerUnderscoreitem", "baby_trigger_item")
      , ("evolutionChainDetailChain", "chain")
      ]


-- | 
data EvolutionChainLink = EvolutionChainLink
  { evolutionChainLinkIsUnderscorebaby :: Bool -- ^ Whether or not this link is for a baby Pokémon. This would only ever be true on the base link.
  , evolutionChainLinkSpecies :: PokemonSpeciesSummary -- ^ The Pokémon species at this point in the evolution chain.
  , evolutionChainLinkEvolutionUnderscoredetails :: [PokemonEvolution] -- ^ All details regarding the specific details of the referenced Pokémon species evolution.
  , evolutionChainLinkEvolvesUnderscoreto :: [EvolutionChainLink] -- ^ A List of chain objects.
  } deriving (Show, Eq, Generic)

instance FromJSON EvolutionChainLink where
  parseJSON = genericParseJSON optionsEvolutionChainLink
instance ToJSON EvolutionChainLink where
  toJSON = genericToJSON optionsEvolutionChainLink

optionsEvolutionChainLink :: Options
optionsEvolutionChainLink =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("evolutionChainLinkIsUnderscorebaby", "is_baby")
      , ("evolutionChainLinkSpecies", "species")
      , ("evolutionChainLinkEvolutionUnderscoredetails", "evolution_details")
      , ("evolutionChainLinkEvolvesUnderscoreto", "evolves_to")
      ]


-- | 
data EvolutionChainSummary = EvolutionChainSummary
  { evolutionChainSummaryUrl :: Text -- ^ The URL of the referenced resource.
  } deriving (Show, Eq, Generic)

instance FromJSON EvolutionChainSummary where
  parseJSON = genericParseJSON optionsEvolutionChainSummary
instance ToJSON EvolutionChainSummary where
  toJSON = genericToJSON optionsEvolutionChainSummary

optionsEvolutionChainSummary :: Options
optionsEvolutionChainSummary =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("evolutionChainSummaryUrl", "url")
      ]


-- | 
data EvolutionConditionExpression = EvolutionConditionExpression
  { evolutionConditionExpressionExpression :: Text -- ^ Evaluatable RPN condition expression using evolution variables (e.g. 'EC 100 % 0 ==')
  , evolutionConditionExpressionPercentageUnderscorechance :: Double -- ^ Percentage chance of evolution under this condition (0-100)
  , evolutionConditionExpressionVariables :: [EvolutionVariableSummary] -- ^ Evolution variables referenced in the expression
  } deriving (Show, Eq, Generic)

instance FromJSON EvolutionConditionExpression where
  parseJSON = genericParseJSON optionsEvolutionConditionExpression
instance ToJSON EvolutionConditionExpression where
  toJSON = genericToJSON optionsEvolutionConditionExpression

optionsEvolutionConditionExpression :: Options
optionsEvolutionConditionExpression =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("evolutionConditionExpressionExpression", "expression")
      , ("evolutionConditionExpressionPercentageUnderscorechance", "percentage_chance")
      , ("evolutionConditionExpressionVariables", "variables")
      ]


-- | 
data EvolutionTriggerDetail = EvolutionTriggerDetail
  { evolutionTriggerDetailId :: Int -- ^ The identifier for this resource.
  , evolutionTriggerDetailName :: Text -- ^ The name for this resource.
  , evolutionTriggerDetailNames :: [EvolutionTriggerName] -- ^ The name of this resource listed in different languages.
  , evolutionTriggerDetailPokemonUnderscorespecies :: [PokemonSpeciesSummary] -- ^ A list of pokemon species that result from this evolution trigger.
  } deriving (Show, Eq, Generic)

instance FromJSON EvolutionTriggerDetail where
  parseJSON = genericParseJSON optionsEvolutionTriggerDetail
instance ToJSON EvolutionTriggerDetail where
  toJSON = genericToJSON optionsEvolutionTriggerDetail

optionsEvolutionTriggerDetail :: Options
optionsEvolutionTriggerDetail =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("evolutionTriggerDetailId", "id")
      , ("evolutionTriggerDetailName", "name")
      , ("evolutionTriggerDetailNames", "names")
      , ("evolutionTriggerDetailPokemonUnderscorespecies", "pokemon_species")
      ]


-- | 
data EvolutionTriggerName = EvolutionTriggerName
  { evolutionTriggerNameName :: Text -- ^ The localized name for an API resource in a specific language.
  , evolutionTriggerNameLanguage :: LanguageSummary -- ^ The language this name is in.
  } deriving (Show, Eq, Generic)

instance FromJSON EvolutionTriggerName where
  parseJSON = genericParseJSON optionsEvolutionTriggerName
instance ToJSON EvolutionTriggerName where
  toJSON = genericToJSON optionsEvolutionTriggerName

optionsEvolutionTriggerName :: Options
optionsEvolutionTriggerName =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("evolutionTriggerNameName", "name")
      , ("evolutionTriggerNameLanguage", "language")
      ]


-- | 
data EvolutionTriggerSummary = EvolutionTriggerSummary
  { evolutionTriggerSummaryName :: Text -- ^ The name of the referenced resource.
  , evolutionTriggerSummaryUrl :: Text -- ^ The URL of the referenced resource.
  } deriving (Show, Eq, Generic)

instance FromJSON EvolutionTriggerSummary where
  parseJSON = genericParseJSON optionsEvolutionTriggerSummary
instance ToJSON EvolutionTriggerSummary where
  toJSON = genericToJSON optionsEvolutionTriggerSummary

optionsEvolutionTriggerSummary :: Options
optionsEvolutionTriggerSummary =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("evolutionTriggerSummaryName", "name")
      , ("evolutionTriggerSummaryUrl", "url")
      ]


-- | 
data EvolutionVariableDescription = EvolutionVariableDescription
  { evolutionVariableDescriptionDescription :: Maybe Text -- ^ The localized description for an API resource in a specific language.
  , evolutionVariableDescriptionLanguage :: LanguageSummary -- ^ The language this name is in.
  } deriving (Show, Eq, Generic)

instance FromJSON EvolutionVariableDescription where
  parseJSON = genericParseJSON optionsEvolutionVariableDescription
instance ToJSON EvolutionVariableDescription where
  toJSON = genericToJSON optionsEvolutionVariableDescription

optionsEvolutionVariableDescription :: Options
optionsEvolutionVariableDescription =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("evolutionVariableDescriptionDescription", "description")
      , ("evolutionVariableDescriptionLanguage", "language")
      ]


-- | 
data EvolutionVariableDetail = EvolutionVariableDetail
  { evolutionVariableDetailId :: Int -- ^ The identifier for this resource.
  , evolutionVariableDetailName :: Text -- ^ The name for this resource.
  , evolutionVariableDetailSymbol :: Text -- ^ The symbol used for this variable in evolution condition expressions.
  , evolutionVariableDetailDataUnderscoretype :: Maybe Text -- ^ The data type of this variable.
  , evolutionVariableDetailSource :: Maybe Text -- ^ The source of the variable value.
  , evolutionVariableDetailVersionUnderscoregroup :: VersionGroupSummary -- ^ The version group in which this variable was introduced.
  , evolutionVariableDetailNames :: [EvolutionVariableName] -- ^ The name of this resource listed in different languages.
  , evolutionVariableDetailDescriptions :: [EvolutionVariableDescription] -- ^ The description of this resource listed in different languages.
  } deriving (Show, Eq, Generic)

instance FromJSON EvolutionVariableDetail where
  parseJSON = genericParseJSON optionsEvolutionVariableDetail
instance ToJSON EvolutionVariableDetail where
  toJSON = genericToJSON optionsEvolutionVariableDetail

optionsEvolutionVariableDetail :: Options
optionsEvolutionVariableDetail =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("evolutionVariableDetailId", "id")
      , ("evolutionVariableDetailName", "name")
      , ("evolutionVariableDetailSymbol", "symbol")
      , ("evolutionVariableDetailDataUnderscoretype", "data_type")
      , ("evolutionVariableDetailSource", "source")
      , ("evolutionVariableDetailVersionUnderscoregroup", "version_group")
      , ("evolutionVariableDetailNames", "names")
      , ("evolutionVariableDetailDescriptions", "descriptions")
      ]


-- | 
data EvolutionVariableName = EvolutionVariableName
  { evolutionVariableNameName :: Text -- ^ The localized name for an API resource in a specific language.
  , evolutionVariableNameLanguage :: LanguageSummary -- ^ The language this name is in.
  } deriving (Show, Eq, Generic)

instance FromJSON EvolutionVariableName where
  parseJSON = genericParseJSON optionsEvolutionVariableName
instance ToJSON EvolutionVariableName where
  toJSON = genericToJSON optionsEvolutionVariableName

optionsEvolutionVariableName :: Options
optionsEvolutionVariableName =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("evolutionVariableNameName", "name")
      , ("evolutionVariableNameLanguage", "language")
      ]


-- | 
data EvolutionVariableSummary = EvolutionVariableSummary
  { evolutionVariableSummaryName :: Text -- ^ The name of the referenced resource.
  , evolutionVariableSummaryUrl :: Text -- ^ The URL of the referenced resource.
  } deriving (Show, Eq, Generic)

instance FromJSON EvolutionVariableSummary where
  parseJSON = genericParseJSON optionsEvolutionVariableSummary
instance ToJSON EvolutionVariableSummary where
  toJSON = genericToJSON optionsEvolutionVariableSummary

optionsEvolutionVariableSummary :: Options
optionsEvolutionVariableSummary =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("evolutionVariableSummaryName", "name")
      , ("evolutionVariableSummaryUrl", "url")
      ]


-- | 
data Experience = Experience
  { experienceLevel :: Int -- ^ The level gained.
  , experienceExperience :: Int -- ^ The amount of experience required to reach the referenced level.
  } deriving (Show, Eq, Generic)

instance FromJSON Experience where
  parseJSON = genericParseJSON optionsExperience
instance ToJSON Experience where
  toJSON = genericToJSON optionsExperience

optionsExperience :: Options
optionsExperience =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("experienceLevel", "level")
      , ("experienceExperience", "experience")
      ]


-- | 
data GenderDetail = GenderDetail
  { genderDetailId :: Int -- ^ The identifier for this resource.
  , genderDetailName :: Text -- ^ The name for this resource.
  , genderDetailPokemonUnderscorespeciesUnderscoredetails :: [GenderPokemonSpecies] -- ^ A list of Pokémon species that can be this gender and how likely it is that they will be.
  , genderDetailRequiredUnderscoreforUnderscoreevolution :: [PokemonSpeciesSummary] -- ^ A list of Pokémon species that required this gender in order for a Pokémon to evolve into them.
  } deriving (Show, Eq, Generic)

instance FromJSON GenderDetail where
  parseJSON = genericParseJSON optionsGenderDetail
instance ToJSON GenderDetail where
  toJSON = genericToJSON optionsGenderDetail

optionsGenderDetail :: Options
optionsGenderDetail =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("genderDetailId", "id")
      , ("genderDetailName", "name")
      , ("genderDetailPokemonUnderscorespeciesUnderscoredetails", "pokemon_species_details")
      , ("genderDetailRequiredUnderscoreforUnderscoreevolution", "required_for_evolution")
      ]


-- | 
data GenderPokemonSpecies = GenderPokemonSpecies
  { genderPokemonSpeciesRate :: Int -- ^ The chance of this Pokémon being female, in eighths; or -1 for genderless.
  , genderPokemonSpeciesPokemonUnderscorespecies :: PokemonSpeciesSummary -- ^ A Pokémon species that can be the referenced gender.
  } deriving (Show, Eq, Generic)

instance FromJSON GenderPokemonSpecies where
  parseJSON = genericParseJSON optionsGenderPokemonSpecies
instance ToJSON GenderPokemonSpecies where
  toJSON = genericToJSON optionsGenderPokemonSpecies

optionsGenderPokemonSpecies :: Options
optionsGenderPokemonSpecies =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("genderPokemonSpeciesRate", "rate")
      , ("genderPokemonSpeciesPokemonUnderscorespecies", "pokemon_species")
      ]


-- | 
data GenderSummary = GenderSummary
  { genderSummaryName :: Text -- ^ The name of the referenced resource.
  , genderSummaryUrl :: Text -- ^ The URL of the referenced resource.
  } deriving (Show, Eq, Generic)

instance FromJSON GenderSummary where
  parseJSON = genericParseJSON optionsGenderSummary
instance ToJSON GenderSummary where
  toJSON = genericToJSON optionsGenderSummary

optionsGenderSummary :: Options
optionsGenderSummary =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("genderSummaryName", "name")
      , ("genderSummaryUrl", "url")
      ]


-- | 
data GenerationDetail = GenerationDetail
  { generationDetailId :: Int -- ^ The identifier for this resource.
  , generationDetailName :: Text -- ^ The name for this resource.
  , generationDetailAbilities :: [AbilitySummary] -- ^ A list of abilities that were introduced in this generation.
  , generationDetailMainUnderscoreregion :: RegionSummary -- ^ The main region travelled in this generation.
  , generationDetailMoves :: [MoveSummary] -- ^ A list of moves that were introduced in this generation.
  , generationDetailNames :: [GenerationName] -- ^ The name of this resource listed in different languages.
  , generationDetailPokemonUnderscorespecies :: [PokemonSpeciesSummary] -- ^ A list of Pokémon species that were introduced in this generation.
  , generationDetailTypes :: [TypeSummary] -- ^ A list of types that were introduced in this generation.
  , generationDetailVersionUnderscoregroups :: [VersionGroupSummary] -- ^ A list of version groups that were introduced in this generation.
  } deriving (Show, Eq, Generic)

instance FromJSON GenerationDetail where
  parseJSON = genericParseJSON optionsGenerationDetail
instance ToJSON GenerationDetail where
  toJSON = genericToJSON optionsGenerationDetail

optionsGenerationDetail :: Options
optionsGenerationDetail =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("generationDetailId", "id")
      , ("generationDetailName", "name")
      , ("generationDetailAbilities", "abilities")
      , ("generationDetailMainUnderscoreregion", "main_region")
      , ("generationDetailMoves", "moves")
      , ("generationDetailNames", "names")
      , ("generationDetailPokemonUnderscorespecies", "pokemon_species")
      , ("generationDetailTypes", "types")
      , ("generationDetailVersionUnderscoregroups", "version_groups")
      ]


-- | 
data GenerationName = GenerationName
  { generationNameName :: Text -- ^ The localized name for an API resource in a specific language.
  , generationNameLanguage :: LanguageSummary -- ^ The language this name is in.
  } deriving (Show, Eq, Generic)

instance FromJSON GenerationName where
  parseJSON = genericParseJSON optionsGenerationName
instance ToJSON GenerationName where
  toJSON = genericToJSON optionsGenerationName

optionsGenerationName :: Options
optionsGenerationName =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("generationNameName", "name")
      , ("generationNameLanguage", "language")
      ]


-- | 
data GenerationSummary = GenerationSummary
  { generationSummaryName :: Text -- ^ The name of the referenced resource.
  , generationSummaryUrl :: Text -- ^ The URL of the referenced resource.
  } deriving (Show, Eq, Generic)

instance FromJSON GenerationSummary where
  parseJSON = genericParseJSON optionsGenerationSummary
instance ToJSON GenerationSummary where
  toJSON = genericToJSON optionsGenerationSummary

optionsGenerationSummary :: Options
optionsGenerationSummary =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("generationSummaryName", "name")
      , ("generationSummaryUrl", "url")
      ]


-- | 
data GrowthRateDescription = GrowthRateDescription
  { growthRateDescriptionDescription :: Maybe Text -- ^ The localized description for an API resource in a specific language.
  , growthRateDescriptionLanguage :: LanguageSummary -- ^ The language this name is in.
  } deriving (Show, Eq, Generic)

instance FromJSON GrowthRateDescription where
  parseJSON = genericParseJSON optionsGrowthRateDescription
instance ToJSON GrowthRateDescription where
  toJSON = genericToJSON optionsGrowthRateDescription

optionsGrowthRateDescription :: Options
optionsGrowthRateDescription =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("growthRateDescriptionDescription", "description")
      , ("growthRateDescriptionLanguage", "language")
      ]


-- | 
data GrowthRateDetail = GrowthRateDetail
  { growthRateDetailId :: Int -- ^ The identifier for this resource.
  , growthRateDetailName :: Text -- ^ The name for this resource.
  , growthRateDetailFormula :: Text -- ^ The formula used to calculate the rate at which the Pokémon species gains level.
  , growthRateDetailDescriptions :: [GrowthRateDescription] -- ^ The descriptions of this characteristic listed in different languages.
  , growthRateDetailLevels :: [Experience] -- ^ A list of levels and the amount of experienced needed to atain them based on this growth rate.
  , growthRateDetailPokemonUnderscorespecies :: [PokemonSpeciesSummary] -- ^ A list of Pokémon species that gain levels at this growth rate.
  } deriving (Show, Eq, Generic)

instance FromJSON GrowthRateDetail where
  parseJSON = genericParseJSON optionsGrowthRateDetail
instance ToJSON GrowthRateDetail where
  toJSON = genericToJSON optionsGrowthRateDetail

optionsGrowthRateDetail :: Options
optionsGrowthRateDetail =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("growthRateDetailId", "id")
      , ("growthRateDetailName", "name")
      , ("growthRateDetailFormula", "formula")
      , ("growthRateDetailDescriptions", "descriptions")
      , ("growthRateDetailLevels", "levels")
      , ("growthRateDetailPokemonUnderscorespecies", "pokemon_species")
      ]


-- | 
data GrowthRateSummary = GrowthRateSummary
  { growthRateSummaryName :: Text -- ^ The name of the referenced resource.
  , growthRateSummaryUrl :: Text -- ^ The URL of the referenced resource.
  } deriving (Show, Eq, Generic)

instance FromJSON GrowthRateSummary where
  parseJSON = genericParseJSON optionsGrowthRateSummary
instance ToJSON GrowthRateSummary where
  toJSON = genericToJSON optionsGrowthRateSummary

optionsGrowthRateSummary :: Options
optionsGrowthRateSummary =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("growthRateSummaryName", "name")
      , ("growthRateSummaryUrl", "url")
      ]


-- | 
data ItemAttributeDescription = ItemAttributeDescription
  { itemAttributeDescriptionDescription :: Maybe Text -- ^ The localized description for an API resource in a specific language.
  , itemAttributeDescriptionLanguage :: LanguageSummary -- ^ The language this name is in.
  } deriving (Show, Eq, Generic)

instance FromJSON ItemAttributeDescription where
  parseJSON = genericParseJSON optionsItemAttributeDescription
instance ToJSON ItemAttributeDescription where
  toJSON = genericToJSON optionsItemAttributeDescription

optionsItemAttributeDescription :: Options
optionsItemAttributeDescription =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("itemAttributeDescriptionDescription", "description")
      , ("itemAttributeDescriptionLanguage", "language")
      ]


-- | 
data ItemAttributeDetail = ItemAttributeDetail
  { itemAttributeDetailId :: Int -- ^ The identifier for this resource.
  , itemAttributeDetailName :: Text -- ^ The name for this resource.
  , itemAttributeDetailDescriptions :: [ItemAttributeDescription] -- ^ The description of this item attribute listed in different languages.
  , itemAttributeDetailItems :: [ItemSummary] -- ^ A list of items that have this attribute.
  , itemAttributeDetailNames :: [ItemAttributeName] -- ^ The name of this item attribute listed in different languages.
  } deriving (Show, Eq, Generic)

instance FromJSON ItemAttributeDetail where
  parseJSON = genericParseJSON optionsItemAttributeDetail
instance ToJSON ItemAttributeDetail where
  toJSON = genericToJSON optionsItemAttributeDetail

optionsItemAttributeDetail :: Options
optionsItemAttributeDetail =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("itemAttributeDetailId", "id")
      , ("itemAttributeDetailName", "name")
      , ("itemAttributeDetailDescriptions", "descriptions")
      , ("itemAttributeDetailItems", "items")
      , ("itemAttributeDetailNames", "names")
      ]


-- | 
data ItemAttributeName = ItemAttributeName
  { itemAttributeNameName :: Text -- ^ The localized name for an API resource in a specific language.
  , itemAttributeNameLanguage :: LanguageSummary -- ^ The language this name is in.
  } deriving (Show, Eq, Generic)

instance FromJSON ItemAttributeName where
  parseJSON = genericParseJSON optionsItemAttributeName
instance ToJSON ItemAttributeName where
  toJSON = genericToJSON optionsItemAttributeName

optionsItemAttributeName :: Options
optionsItemAttributeName =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("itemAttributeNameName", "name")
      , ("itemAttributeNameLanguage", "language")
      ]


-- | 
data ItemAttributeSummary = ItemAttributeSummary
  { itemAttributeSummaryName :: Text -- ^ The name of the referenced resource.
  , itemAttributeSummaryUrl :: Text -- ^ The URL of the referenced resource.
  } deriving (Show, Eq, Generic)

instance FromJSON ItemAttributeSummary where
  parseJSON = genericParseJSON optionsItemAttributeSummary
instance ToJSON ItemAttributeSummary where
  toJSON = genericToJSON optionsItemAttributeSummary

optionsItemAttributeSummary :: Options
optionsItemAttributeSummary =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("itemAttributeSummaryName", "name")
      , ("itemAttributeSummaryUrl", "url")
      ]


-- | 
data ItemCategoryDetail = ItemCategoryDetail
  { itemCategoryDetailId :: Int -- ^ The identifier for this resource.
  , itemCategoryDetailName :: Text -- ^ The name for this resource.
  , itemCategoryDetailItems :: [ItemSummary] -- ^ A list of items that are a part of this category.
  , itemCategoryDetailNames :: [ItemCategoryName] -- ^ The name of this item category listed in different languages.
  , itemCategoryDetailPocket :: ItemPocketSummary -- ^ The pocket items in this category would be put in.
  } deriving (Show, Eq, Generic)

instance FromJSON ItemCategoryDetail where
  parseJSON = genericParseJSON optionsItemCategoryDetail
instance ToJSON ItemCategoryDetail where
  toJSON = genericToJSON optionsItemCategoryDetail

optionsItemCategoryDetail :: Options
optionsItemCategoryDetail =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("itemCategoryDetailId", "id")
      , ("itemCategoryDetailName", "name")
      , ("itemCategoryDetailItems", "items")
      , ("itemCategoryDetailNames", "names")
      , ("itemCategoryDetailPocket", "pocket")
      ]


-- | 
data ItemCategoryName = ItemCategoryName
  { itemCategoryNameName :: Text -- ^ The localized name for an API resource in a specific language.
  , itemCategoryNameLanguage :: LanguageSummary -- ^ The language this name is in.
  } deriving (Show, Eq, Generic)

instance FromJSON ItemCategoryName where
  parseJSON = genericParseJSON optionsItemCategoryName
instance ToJSON ItemCategoryName where
  toJSON = genericToJSON optionsItemCategoryName

optionsItemCategoryName :: Options
optionsItemCategoryName =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("itemCategoryNameName", "name")
      , ("itemCategoryNameLanguage", "language")
      ]


-- | 
data ItemCategorySummary = ItemCategorySummary
  { itemCategorySummaryName :: Text -- ^ The name of the referenced resource.
  , itemCategorySummaryUrl :: Text -- ^ The URL of the referenced resource.
  } deriving (Show, Eq, Generic)

instance FromJSON ItemCategorySummary where
  parseJSON = genericParseJSON optionsItemCategorySummary
instance ToJSON ItemCategorySummary where
  toJSON = genericToJSON optionsItemCategorySummary

optionsItemCategorySummary :: Options
optionsItemCategorySummary =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("itemCategorySummaryName", "name")
      , ("itemCategorySummaryUrl", "url")
      ]


-- | 
data ItemDetail = ItemDetail
  { itemDetailId :: Int -- ^ The identifier for this resource.
  , itemDetailName :: Text -- ^ The name for this resource.
  , itemDetailFlingUnderscorepower :: Maybe Int -- ^ The power of the move Fling when used with this item.
  , itemDetailFlingUnderscoreeffect :: ItemFlingEffectSummary -- ^ The effect of the move Fling when used with this item.
  , itemDetailAttributes :: [ItemAttributeSummary] -- ^ A list of attributes this item has.
  , itemDetailCategory :: ItemCategorySummary -- ^ The category of items this item falls into.
  , itemDetailEffectUnderscoreentries :: [ItemEffectText] -- ^ The effect of this ability listed in different languages.
  , itemDetailFlavorUnderscoretextUnderscoreentries :: [ItemFlavorText] -- ^ The flavor text of this ability listed in different languages.
  , itemDetailGameUnderscoreindices :: [ItemGameIndex] -- ^ A list of game indices relevent to this item by generation.
  , itemDetailPrices :: [ItemPrice] -- ^ Purchase and sell prices by currency and version group. Prices may be null when the item cannot be bought or sold.
  , itemDetailNames :: [ItemName] -- ^ The name of this item listed in different languages.
  , itemDetailHeldUnderscorebyUnderscorepokemon :: [PokemonHeldItem] -- ^ A list of Pokémon that might be found in the wild holding this item.
  , itemDetailSprites :: ItemSprites -- ^ A set of sprites used to depict this item in the game.
  , itemDetailBabyUnderscoretriggerUnderscorefor :: EvolutionChainSummary -- ^ An evolution chain this item requires to produce a bay during mating.
  , itemDetailMachines :: [ItemMachine] -- ^ A list of the machines related to this item.
  } deriving (Show, Eq, Generic)

instance FromJSON ItemDetail where
  parseJSON = genericParseJSON optionsItemDetail
instance ToJSON ItemDetail where
  toJSON = genericToJSON optionsItemDetail

optionsItemDetail :: Options
optionsItemDetail =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("itemDetailId", "id")
      , ("itemDetailName", "name")
      , ("itemDetailFlingUnderscorepower", "fling_power")
      , ("itemDetailFlingUnderscoreeffect", "fling_effect")
      , ("itemDetailAttributes", "attributes")
      , ("itemDetailCategory", "category")
      , ("itemDetailEffectUnderscoreentries", "effect_entries")
      , ("itemDetailFlavorUnderscoretextUnderscoreentries", "flavor_text_entries")
      , ("itemDetailGameUnderscoreindices", "game_indices")
      , ("itemDetailPrices", "prices")
      , ("itemDetailNames", "names")
      , ("itemDetailHeldUnderscorebyUnderscorepokemon", "held_by_pokemon")
      , ("itemDetailSprites", "sprites")
      , ("itemDetailBabyUnderscoretriggerUnderscorefor", "baby_trigger_for")
      , ("itemDetailMachines", "machines")
      ]


-- | 
data ItemEffectText = ItemEffectText
  { itemEffectTextEffect :: Text -- ^ The localized effect text for an API resource in a specific language.
  , itemEffectTextShortUnderscoreeffect :: Text -- ^ The localized effect text in brief.
  , itemEffectTextLanguage :: LanguageSummary -- ^ The language this effect is in.
  } deriving (Show, Eq, Generic)

instance FromJSON ItemEffectText where
  parseJSON = genericParseJSON optionsItemEffectText
instance ToJSON ItemEffectText where
  toJSON = genericToJSON optionsItemEffectText

optionsItemEffectText :: Options
optionsItemEffectText =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("itemEffectTextEffect", "effect")
      , ("itemEffectTextShortUnderscoreeffect", "short_effect")
      , ("itemEffectTextLanguage", "language")
      ]


-- | 
data ItemFlavorText = ItemFlavorText
  { itemFlavorTextText :: Text -- ^ The localized flavor text for an API resource in a specific language.
  , itemFlavorTextVersionUnderscoregroup :: VersionGroupSummary -- ^ The version group which uses this flavor text.
  , itemFlavorTextLanguage :: LanguageSummary -- ^ The language this name is in.
  } deriving (Show, Eq, Generic)

instance FromJSON ItemFlavorText where
  parseJSON = genericParseJSON optionsItemFlavorText
instance ToJSON ItemFlavorText where
  toJSON = genericToJSON optionsItemFlavorText

optionsItemFlavorText :: Options
optionsItemFlavorText =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("itemFlavorTextText", "text")
      , ("itemFlavorTextVersionUnderscoregroup", "version_group")
      , ("itemFlavorTextLanguage", "language")
      ]


-- | 
data ItemFlingEffectDetail = ItemFlingEffectDetail
  { itemFlingEffectDetailId :: Int -- ^ The identifier for this resource.
  , itemFlingEffectDetailName :: Text -- ^ The name for this resource.
  , itemFlingEffectDetailEffectUnderscoreentries :: [ItemFlingEffectEffectText] -- ^ The result of this fling effect listed in different languages.
  , itemFlingEffectDetailItems :: [ItemSummary] -- ^ A list of items that have this fling effect.
  } deriving (Show, Eq, Generic)

instance FromJSON ItemFlingEffectDetail where
  parseJSON = genericParseJSON optionsItemFlingEffectDetail
instance ToJSON ItemFlingEffectDetail where
  toJSON = genericToJSON optionsItemFlingEffectDetail

optionsItemFlingEffectDetail :: Options
optionsItemFlingEffectDetail =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("itemFlingEffectDetailId", "id")
      , ("itemFlingEffectDetailName", "name")
      , ("itemFlingEffectDetailEffectUnderscoreentries", "effect_entries")
      , ("itemFlingEffectDetailItems", "items")
      ]


-- | 
data ItemFlingEffectEffectText = ItemFlingEffectEffectText
  { itemFlingEffectEffectTextEffect :: Text -- ^ The localized effect text for an API resource in a specific language.
  , itemFlingEffectEffectTextLanguage :: LanguageSummary -- ^ The language this effect is in.
  } deriving (Show, Eq, Generic)

instance FromJSON ItemFlingEffectEffectText where
  parseJSON = genericParseJSON optionsItemFlingEffectEffectText
instance ToJSON ItemFlingEffectEffectText where
  toJSON = genericToJSON optionsItemFlingEffectEffectText

optionsItemFlingEffectEffectText :: Options
optionsItemFlingEffectEffectText =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("itemFlingEffectEffectTextEffect", "effect")
      , ("itemFlingEffectEffectTextLanguage", "language")
      ]


-- | 
data ItemFlingEffectSummary = ItemFlingEffectSummary
  { itemFlingEffectSummaryName :: Text -- ^ The name of the referenced resource.
  , itemFlingEffectSummaryUrl :: Text -- ^ The URL of the referenced resource.
  } deriving (Show, Eq, Generic)

instance FromJSON ItemFlingEffectSummary where
  parseJSON = genericParseJSON optionsItemFlingEffectSummary
instance ToJSON ItemFlingEffectSummary where
  toJSON = genericToJSON optionsItemFlingEffectSummary

optionsItemFlingEffectSummary :: Options
optionsItemFlingEffectSummary =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("itemFlingEffectSummaryName", "name")
      , ("itemFlingEffectSummaryUrl", "url")
      ]


-- | 
data ItemGameIndex = ItemGameIndex
  { itemGameIndexGameUnderscoreindex :: Int -- ^ The internal id of an API resource within game data.
  , itemGameIndexGeneration :: GenerationSummary -- ^ The generation relevent to this game index.
  } deriving (Show, Eq, Generic)

instance FromJSON ItemGameIndex where
  parseJSON = genericParseJSON optionsItemGameIndex
instance ToJSON ItemGameIndex where
  toJSON = genericToJSON optionsItemGameIndex

optionsItemGameIndex :: Options
optionsItemGameIndex =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("itemGameIndexGameUnderscoreindex", "game_index")
      , ("itemGameIndexGeneration", "generation")
      ]


-- | 
data ItemMachine = ItemMachine
  { itemMachineMachine :: MachineSummary -- ^ The machine that teaches a move from an item.
  , itemMachineVersionUnderscoregroup :: VersionGroupSummary -- ^ The version group of this specific machine.
  } deriving (Show, Eq, Generic)

instance FromJSON ItemMachine where
  parseJSON = genericParseJSON optionsItemMachine
instance ToJSON ItemMachine where
  toJSON = genericToJSON optionsItemMachine

optionsItemMachine :: Options
optionsItemMachine =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("itemMachineMachine", "machine")
      , ("itemMachineVersionUnderscoregroup", "version_group")
      ]


-- | 
data ItemName = ItemName
  { itemNameName :: Text -- ^ The localized name for an API resource in a specific language.
  , itemNameLanguage :: LanguageSummary -- ^ The language this name is in.
  } deriving (Show, Eq, Generic)

instance FromJSON ItemName where
  parseJSON = genericParseJSON optionsItemName
instance ToJSON ItemName where
  toJSON = genericToJSON optionsItemName

optionsItemName :: Options
optionsItemName =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("itemNameName", "name")
      , ("itemNameLanguage", "language")
      ]


-- | 
data ItemPocketDetail = ItemPocketDetail
  { itemPocketDetailId :: Int -- ^ The identifier for this resource.
  , itemPocketDetailName :: Text -- ^ The name for this resource.
  , itemPocketDetailCategories :: [ItemCategorySummary] -- ^ A list of item categories that are relevant to this item pocket.
  , itemPocketDetailNames :: [ItemPocketName] -- ^ The name of this resource listed in different languages.
  } deriving (Show, Eq, Generic)

instance FromJSON ItemPocketDetail where
  parseJSON = genericParseJSON optionsItemPocketDetail
instance ToJSON ItemPocketDetail where
  toJSON = genericToJSON optionsItemPocketDetail

optionsItemPocketDetail :: Options
optionsItemPocketDetail =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("itemPocketDetailId", "id")
      , ("itemPocketDetailName", "name")
      , ("itemPocketDetailCategories", "categories")
      , ("itemPocketDetailNames", "names")
      ]


-- | 
data ItemPocketName = ItemPocketName
  { itemPocketNameName :: Text -- ^ The localized name for an API resource in a specific language.
  , itemPocketNameLanguage :: LanguageSummary -- ^ The language this name is in.
  } deriving (Show, Eq, Generic)

instance FromJSON ItemPocketName where
  parseJSON = genericParseJSON optionsItemPocketName
instance ToJSON ItemPocketName where
  toJSON = genericToJSON optionsItemPocketName

optionsItemPocketName :: Options
optionsItemPocketName =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("itemPocketNameName", "name")
      , ("itemPocketNameLanguage", "language")
      ]


-- | 
data ItemPocketSummary = ItemPocketSummary
  { itemPocketSummaryName :: Text -- ^ The name of the referenced resource.
  , itemPocketSummaryUrl :: Text -- ^ The URL of the referenced resource.
  } deriving (Show, Eq, Generic)

instance FromJSON ItemPocketSummary where
  parseJSON = genericParseJSON optionsItemPocketSummary
instance ToJSON ItemPocketSummary where
  toJSON = genericToJSON optionsItemPocketSummary

optionsItemPocketSummary :: Options
optionsItemPocketSummary =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("itemPocketSummaryName", "name")
      , ("itemPocketSummaryUrl", "url")
      ]


-- | 
data ItemPrice = ItemPrice
  { itemPricePurchaseUnderscoreprice :: Maybe Int -- ^ The purchase price in this currency and version group, or null if unavailable.
  , itemPriceSellUnderscoreprice :: Maybe Int -- ^ The sell price in this currency and version group, or null if unavailable.
  , itemPriceCurrency :: CurrencySummary -- ^ The currency used for this price.
  , itemPriceVersionUnderscoregroup :: VersionGroupSummary -- ^ The version group to which this price applies.
  } deriving (Show, Eq, Generic)

instance FromJSON ItemPrice where
  parseJSON = genericParseJSON optionsItemPrice
instance ToJSON ItemPrice where
  toJSON = genericToJSON optionsItemPrice

optionsItemPrice :: Options
optionsItemPrice =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("itemPricePurchaseUnderscoreprice", "purchase_price")
      , ("itemPriceSellUnderscoreprice", "sell_price")
      , ("itemPriceCurrency", "currency")
      , ("itemPriceVersionUnderscoregroup", "version_group")
      ]


-- | 
data ItemSprites = ItemSprites
  { itemSpritesDefault :: Text -- ^ The default depiction of this item.
  } deriving (Show, Eq, Generic)

instance FromJSON ItemSprites where
  parseJSON = genericParseJSON optionsItemSprites
instance ToJSON ItemSprites where
  toJSON = genericToJSON optionsItemSprites

optionsItemSprites :: Options
optionsItemSprites =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("itemSpritesDefault", "default")
      ]


-- | 
data ItemSummary = ItemSummary
  { itemSummaryName :: Text -- ^ The name of the referenced resource.
  , itemSummaryUrl :: Text -- ^ The URL of the referenced resource.
  } deriving (Show, Eq, Generic)

instance FromJSON ItemSummary where
  parseJSON = genericParseJSON optionsItemSummary
instance ToJSON ItemSummary where
  toJSON = genericToJSON optionsItemSummary

optionsItemSummary :: Options
optionsItemSummary =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("itemSummaryName", "name")
      , ("itemSummaryUrl", "url")
      ]


-- | 
data LanguageDetail = LanguageDetail
  { languageDetailId :: Int -- ^ The identifier for this resource.
  , languageDetailName :: Text -- ^ The name for this resource.
  , languageDetailOfficial :: Maybe Bool -- ^ Whether or not the games are published in this language.
  , languageDetailIso639 :: Text -- ^ The two-letter ISO 639-1 language code. Multiple PokéAPI language records may share this code.
  , languageDetailIso3166 :: Text -- ^ The two-letter ISO 3166-1 alpha-2 code of the country or region associated with this language record. Multiple PokéAPI language records may share this code.
  , languageDetailNames :: [LanguageName] -- ^ The name of this resource listed in different languages.
  } deriving (Show, Eq, Generic)

instance FromJSON LanguageDetail where
  parseJSON = genericParseJSON optionsLanguageDetail
instance ToJSON LanguageDetail where
  toJSON = genericToJSON optionsLanguageDetail

optionsLanguageDetail :: Options
optionsLanguageDetail =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("languageDetailId", "id")
      , ("languageDetailName", "name")
      , ("languageDetailOfficial", "official")
      , ("languageDetailIso639", "iso639")
      , ("languageDetailIso3166", "iso3166")
      , ("languageDetailNames", "names")
      ]


-- | 
data LanguageName = LanguageName
  { languageNameName :: Text -- ^ The localized name for an API resource in a specific language.
  , languageNameLanguage :: LanguageSummary -- ^ The language this name is in.
  } deriving (Show, Eq, Generic)

instance FromJSON LanguageName where
  parseJSON = genericParseJSON optionsLanguageName
instance ToJSON LanguageName where
  toJSON = genericToJSON optionsLanguageName

optionsLanguageName :: Options
optionsLanguageName =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("languageNameName", "name")
      , ("languageNameLanguage", "language")
      ]


-- | 
data LanguageSummary = LanguageSummary
  { languageSummaryName :: Text -- ^ The name of the referenced resource.
  , languageSummaryUrl :: Text -- ^ The URL of the referenced resource.
  } deriving (Show, Eq, Generic)

instance FromJSON LanguageSummary where
  parseJSON = genericParseJSON optionsLanguageSummary
instance ToJSON LanguageSummary where
  toJSON = genericToJSON optionsLanguageSummary

optionsLanguageSummary :: Options
optionsLanguageSummary =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("languageSummaryName", "name")
      , ("languageSummaryUrl", "url")
      ]


-- | 
data LocationAreaDetail = LocationAreaDetail
  { locationAreaDetailId :: Int -- ^ The identifier for this resource.
  , locationAreaDetailName :: Text -- ^ The name for this resource.
  , locationAreaDetailGameUnderscoreindex :: Int -- ^ The internal id of an API resource within game data.
  , locationAreaDetailEncounterUnderscoremethodUnderscorerates :: [LocationAreaEncounterRate] -- ^ A list of methods in which Pokémon may be encountered in this area and how likely the method will occur depending on the version of the game.
  , locationAreaDetailLocation :: LocationSummary -- ^ The region this location area can be found in.
  , locationAreaDetailNames :: [LocationAreaName] -- ^ The name of this resource listed in different languages.
  , locationAreaDetailPokemonUnderscoreencounters :: [LocationAreaPokemonEncounter] -- ^ A list of Pokémon that can be encountered in this area along with version specific details about the encounter.
  } deriving (Show, Eq, Generic)

instance FromJSON LocationAreaDetail where
  parseJSON = genericParseJSON optionsLocationAreaDetail
instance ToJSON LocationAreaDetail where
  toJSON = genericToJSON optionsLocationAreaDetail

optionsLocationAreaDetail :: Options
optionsLocationAreaDetail =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("locationAreaDetailId", "id")
      , ("locationAreaDetailName", "name")
      , ("locationAreaDetailGameUnderscoreindex", "game_index")
      , ("locationAreaDetailEncounterUnderscoremethodUnderscorerates", "encounter_method_rates")
      , ("locationAreaDetailLocation", "location")
      , ("locationAreaDetailNames", "names")
      , ("locationAreaDetailPokemonUnderscoreencounters", "pokemon_encounters")
      ]


-- | 
data LocationAreaEncounterDetail = LocationAreaEncounterDetail
  { locationAreaEncounterDetailMinUnderscorelevel :: Int -- ^ The lowest level the Pokémon could be encountered at.
  , locationAreaEncounterDetailMaxUnderscorelevel :: Int -- ^ The highest level the Pokémon could be encountered at.
  , locationAreaEncounterDetailChance :: Maybe Int -- ^ Percent chance that this encounter will occur.
  , locationAreaEncounterDetailMethod :: Maybe EncounterMethodSummary -- ^ The method by which this encounter happens.
  , locationAreaEncounterDetailConditionUnderscorevalues :: [EncounterConditionValueSummary] -- ^ A list of condition values that must be in effect for this encounter to occur.
  , locationAreaEncounterDetailPokemonUnderscoredetails :: EncounterPokemonDetail -- ^ Additional properties of the encountered Pokémon, or null if unspecified.
  } deriving (Show, Eq, Generic)

instance FromJSON LocationAreaEncounterDetail where
  parseJSON = genericParseJSON optionsLocationAreaEncounterDetail
instance ToJSON LocationAreaEncounterDetail where
  toJSON = genericToJSON optionsLocationAreaEncounterDetail

optionsLocationAreaEncounterDetail :: Options
optionsLocationAreaEncounterDetail =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("locationAreaEncounterDetailMinUnderscorelevel", "min_level")
      , ("locationAreaEncounterDetailMaxUnderscorelevel", "max_level")
      , ("locationAreaEncounterDetailChance", "chance")
      , ("locationAreaEncounterDetailMethod", "method")
      , ("locationAreaEncounterDetailConditionUnderscorevalues", "condition_values")
      , ("locationAreaEncounterDetailPokemonUnderscoredetails", "pokemon_details")
      ]


-- | 
data LocationAreaEncounterRate = LocationAreaEncounterRate
  { locationAreaEncounterRateEncounterUnderscoremethod :: EncounterMethodSummary -- ^ The method in which Pokémon may be encountered in an area..
  , locationAreaEncounterRateVersionUnderscoredetails :: [LocationAreaEncounterVersionDetail] -- ^ The chance of the encounter to occur on a version of the game.
  } deriving (Show, Eq, Generic)

instance FromJSON LocationAreaEncounterRate where
  parseJSON = genericParseJSON optionsLocationAreaEncounterRate
instance ToJSON LocationAreaEncounterRate where
  toJSON = genericToJSON optionsLocationAreaEncounterRate

optionsLocationAreaEncounterRate :: Options
optionsLocationAreaEncounterRate =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("locationAreaEncounterRateEncounterUnderscoremethod", "encounter_method")
      , ("locationAreaEncounterRateVersionUnderscoredetails", "version_details")
      ]


-- | 
data LocationAreaEncounterVersionDetail = LocationAreaEncounterVersionDetail
  { locationAreaEncounterVersionDetailRate :: Int -- ^ The chance of an encounter to occur.
  , locationAreaEncounterVersionDetailVersion :: VersionSummary -- ^ The version of the game in which the encounter can occur with the given chance.
  } deriving (Show, Eq, Generic)

instance FromJSON LocationAreaEncounterVersionDetail where
  parseJSON = genericParseJSON optionsLocationAreaEncounterVersionDetail
instance ToJSON LocationAreaEncounterVersionDetail where
  toJSON = genericToJSON optionsLocationAreaEncounterVersionDetail

optionsLocationAreaEncounterVersionDetail :: Options
optionsLocationAreaEncounterVersionDetail =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("locationAreaEncounterVersionDetailRate", "rate")
      , ("locationAreaEncounterVersionDetailVersion", "version")
      ]


-- | 
data LocationAreaName = LocationAreaName
  { locationAreaNameName :: Text -- ^ The localized name for an API resource in a specific language.
  , locationAreaNameLanguage :: LanguageSummary -- ^ The language this name is in.
  } deriving (Show, Eq, Generic)

instance FromJSON LocationAreaName where
  parseJSON = genericParseJSON optionsLocationAreaName
instance ToJSON LocationAreaName where
  toJSON = genericToJSON optionsLocationAreaName

optionsLocationAreaName :: Options
optionsLocationAreaName =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("locationAreaNameName", "name")
      , ("locationAreaNameLanguage", "language")
      ]


-- | 
data LocationAreaPokemonEncounter = LocationAreaPokemonEncounter
  { locationAreaPokemonEncounterPokemon :: PokemonSummary -- ^ The Pokémon being encountered.
  , locationAreaPokemonEncounterVersionUnderscoredetails :: [LocationAreaPokemonEncounterVersion] -- ^ A list of versions and encounters with Pokémon that might happen in the referenced location area.
  } deriving (Show, Eq, Generic)

instance FromJSON LocationAreaPokemonEncounter where
  parseJSON = genericParseJSON optionsLocationAreaPokemonEncounter
instance ToJSON LocationAreaPokemonEncounter where
  toJSON = genericToJSON optionsLocationAreaPokemonEncounter

optionsLocationAreaPokemonEncounter :: Options
optionsLocationAreaPokemonEncounter =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("locationAreaPokemonEncounterPokemon", "pokemon")
      , ("locationAreaPokemonEncounterVersionUnderscoredetails", "version_details")
      ]


-- | 
data LocationAreaPokemonEncounterVersion = LocationAreaPokemonEncounterVersion
  { locationAreaPokemonEncounterVersionVersion :: VersionSummary -- ^ The game version this encounter happens in.
  , locationAreaPokemonEncounterVersionMaxUnderscorechance :: Int -- ^ The total percentage of all encounter potential.
  , locationAreaPokemonEncounterVersionEncounterUnderscoredetails :: [LocationAreaEncounterDetail] -- ^ A list of encounters and their specifics.
  } deriving (Show, Eq, Generic)

instance FromJSON LocationAreaPokemonEncounterVersion where
  parseJSON = genericParseJSON optionsLocationAreaPokemonEncounterVersion
instance ToJSON LocationAreaPokemonEncounterVersion where
  toJSON = genericToJSON optionsLocationAreaPokemonEncounterVersion

optionsLocationAreaPokemonEncounterVersion :: Options
optionsLocationAreaPokemonEncounterVersion =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("locationAreaPokemonEncounterVersionVersion", "version")
      , ("locationAreaPokemonEncounterVersionMaxUnderscorechance", "max_chance")
      , ("locationAreaPokemonEncounterVersionEncounterUnderscoredetails", "encounter_details")
      ]


-- | 
data LocationAreaSummary = LocationAreaSummary
  { locationAreaSummaryName :: Text -- ^ The name of the referenced resource.
  , locationAreaSummaryUrl :: Text -- ^ The URL of the referenced resource.
  } deriving (Show, Eq, Generic)

instance FromJSON LocationAreaSummary where
  parseJSON = genericParseJSON optionsLocationAreaSummary
instance ToJSON LocationAreaSummary where
  toJSON = genericToJSON optionsLocationAreaSummary

optionsLocationAreaSummary :: Options
optionsLocationAreaSummary =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("locationAreaSummaryName", "name")
      , ("locationAreaSummaryUrl", "url")
      ]


-- | 
data LocationDetail = LocationDetail
  { locationDetailId :: Int -- ^ The identifier for this resource.
  , locationDetailName :: Text -- ^ The name for this resource.
  , locationDetailRegion :: RegionSummary -- ^ The region this location can be found in.
  , locationDetailNames :: [LocationName] -- ^ The name of this resource listed in different languages.
  , locationDetailGameUnderscoreindices :: [LocationGameIndex] -- ^ A list of game indices relevent to this location by generation.
  , locationDetailAreas :: [LocationAreaSummary] -- ^ Areas that can be found within this location.
  } deriving (Show, Eq, Generic)

instance FromJSON LocationDetail where
  parseJSON = genericParseJSON optionsLocationDetail
instance ToJSON LocationDetail where
  toJSON = genericToJSON optionsLocationDetail

optionsLocationDetail :: Options
optionsLocationDetail =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("locationDetailId", "id")
      , ("locationDetailName", "name")
      , ("locationDetailRegion", "region")
      , ("locationDetailNames", "names")
      , ("locationDetailGameUnderscoreindices", "game_indices")
      , ("locationDetailAreas", "areas")
      ]


-- | 
data LocationGameIndex = LocationGameIndex
  { locationGameIndexGameUnderscoreindex :: Int -- ^ The internal id of an API resource within game data.
  , locationGameIndexGeneration :: GenerationSummary -- ^ The generation relevent to this game index.
  } deriving (Show, Eq, Generic)

instance FromJSON LocationGameIndex where
  parseJSON = genericParseJSON optionsLocationGameIndex
instance ToJSON LocationGameIndex where
  toJSON = genericToJSON optionsLocationGameIndex

optionsLocationGameIndex :: Options
optionsLocationGameIndex =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("locationGameIndexGameUnderscoreindex", "game_index")
      , ("locationGameIndexGeneration", "generation")
      ]


-- | 
data LocationName = LocationName
  { locationNameName :: Text -- ^ The localized name for an API resource in a specific language.
  , locationNameLanguage :: LanguageSummary -- ^ The language this name is in.
  } deriving (Show, Eq, Generic)

instance FromJSON LocationName where
  parseJSON = genericParseJSON optionsLocationName
instance ToJSON LocationName where
  toJSON = genericToJSON optionsLocationName

optionsLocationName :: Options
optionsLocationName =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("locationNameName", "name")
      , ("locationNameLanguage", "language")
      ]


-- | 
data LocationSummary = LocationSummary
  { locationSummaryName :: Text -- ^ The name of the referenced resource.
  , locationSummaryUrl :: Text -- ^ The URL of the referenced resource.
  } deriving (Show, Eq, Generic)

instance FromJSON LocationSummary where
  parseJSON = genericParseJSON optionsLocationSummary
instance ToJSON LocationSummary where
  toJSON = genericToJSON optionsLocationSummary

optionsLocationSummary :: Options
optionsLocationSummary =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("locationSummaryName", "name")
      , ("locationSummaryUrl", "url")
      ]


-- | 
data MachineDetail = MachineDetail
  { machineDetailId :: Int -- ^ The identifier for this resource.
  , machineDetailItem :: ItemSummary -- ^ The TM or HM item that corresponds to this machine.
  , machineDetailVersionUnderscoregroup :: VersionGroupSummary -- ^ The version group that this machine applies to.
  , machineDetailMove :: MoveSummary -- ^ The move that is taught by this machine.
  } deriving (Show, Eq, Generic)

instance FromJSON MachineDetail where
  parseJSON = genericParseJSON optionsMachineDetail
instance ToJSON MachineDetail where
  toJSON = genericToJSON optionsMachineDetail

optionsMachineDetail :: Options
optionsMachineDetail =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("machineDetailId", "id")
      , ("machineDetailItem", "item")
      , ("machineDetailVersionUnderscoregroup", "version_group")
      , ("machineDetailMove", "move")
      ]


-- | 
data MachineSummary = MachineSummary
  { machineSummaryUrl :: Text -- ^ The URL of the referenced resource.
  } deriving (Show, Eq, Generic)

instance FromJSON MachineSummary where
  parseJSON = genericParseJSON optionsMachineSummary
instance ToJSON MachineSummary where
  toJSON = genericToJSON optionsMachineSummary

optionsMachineSummary :: Options
optionsMachineSummary =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("machineSummaryUrl", "url")
      ]


-- | 
data MoveBattleStyleDetail = MoveBattleStyleDetail
  { moveBattleStyleDetailId :: Int -- ^ The identifier for this resource.
  , moveBattleStyleDetailName :: Text -- ^ The name for this resource.
  , moveBattleStyleDetailNames :: [MoveBattleStyleName] -- ^ The name of this resource listed in different languages.
  } deriving (Show, Eq, Generic)

instance FromJSON MoveBattleStyleDetail where
  parseJSON = genericParseJSON optionsMoveBattleStyleDetail
instance ToJSON MoveBattleStyleDetail where
  toJSON = genericToJSON optionsMoveBattleStyleDetail

optionsMoveBattleStyleDetail :: Options
optionsMoveBattleStyleDetail =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("moveBattleStyleDetailId", "id")
      , ("moveBattleStyleDetailName", "name")
      , ("moveBattleStyleDetailNames", "names")
      ]


-- | 
data MoveBattleStyleName = MoveBattleStyleName
  { moveBattleStyleNameName :: Text -- ^ The localized name for an API resource in a specific language.
  , moveBattleStyleNameLanguage :: LanguageSummary -- ^ The language this name is in.
  } deriving (Show, Eq, Generic)

instance FromJSON MoveBattleStyleName where
  parseJSON = genericParseJSON optionsMoveBattleStyleName
instance ToJSON MoveBattleStyleName where
  toJSON = genericToJSON optionsMoveBattleStyleName

optionsMoveBattleStyleName :: Options
optionsMoveBattleStyleName =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("moveBattleStyleNameName", "name")
      , ("moveBattleStyleNameLanguage", "language")
      ]


-- | 
data MoveBattleStyleSummary = MoveBattleStyleSummary
  { moveBattleStyleSummaryName :: Text -- ^ The name of the referenced resource.
  , moveBattleStyleSummaryUrl :: Text -- ^ The URL of the referenced resource.
  } deriving (Show, Eq, Generic)

instance FromJSON MoveBattleStyleSummary where
  parseJSON = genericParseJSON optionsMoveBattleStyleSummary
instance ToJSON MoveBattleStyleSummary where
  toJSON = genericToJSON optionsMoveBattleStyleSummary

optionsMoveBattleStyleSummary :: Options
optionsMoveBattleStyleSummary =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("moveBattleStyleSummaryName", "name")
      , ("moveBattleStyleSummaryUrl", "url")
      ]


-- | 
data MoveChange = MoveChange
  { moveChangeAccuracy :: Maybe Int -- ^ The percent value of how likely this move is to be successful.
  , moveChangePower :: Maybe Int -- ^ The base power before the listed version group, or null if power did not change.
  , moveChangePp :: Maybe Int -- ^ Power points. The number of times this move can be used.
  , moveChangeEffectUnderscorechance :: Int -- ^ The percent value of how likely it is this moves effect will take effect.
  , moveChangeEffectUnderscoreentries :: [MoveEffectEffectText] -- ^ The effect of this move listed in different languages.
  , moveChangeType :: TypeSummary -- ^ The elemental type of this move.
  , moveChangeVersionUnderscoregroup :: VersionGroupSummary -- ^ The version group in which these move stat values were in effect.
  } deriving (Show, Eq, Generic)

instance FromJSON MoveChange where
  parseJSON = genericParseJSON optionsMoveChange
instance ToJSON MoveChange where
  toJSON = genericToJSON optionsMoveChange

optionsMoveChange :: Options
optionsMoveChange =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("moveChangeAccuracy", "accuracy")
      , ("moveChangePower", "power")
      , ("moveChangePp", "pp")
      , ("moveChangeEffectUnderscorechance", "effect_chance")
      , ("moveChangeEffectUnderscoreentries", "effect_entries")
      , ("moveChangeType", "type")
      , ("moveChangeVersionUnderscoregroup", "version_group")
      ]


-- | 
data MoveComboUsage = MoveComboUsage
  { moveComboUsageUseUnderscorebefore :: [MoveSummary] -- ^ A list of moves to use before this move.
  , moveComboUsageUseUnderscoreafter :: [MoveSummary] -- ^ A list of moves to use after this move.
  } deriving (Show, Eq, Generic)

instance FromJSON MoveComboUsage where
  parseJSON = genericParseJSON optionsMoveComboUsage
instance ToJSON MoveComboUsage where
  toJSON = genericToJSON optionsMoveComboUsage

optionsMoveComboUsage :: Options
optionsMoveComboUsage =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("moveComboUsageUseUnderscorebefore", "use_before")
      , ("moveComboUsageUseUnderscoreafter", "use_after")
      ]


-- | 
data MoveCombos = MoveCombos
  { moveCombosNormal :: MoveComboUsage -- ^ A detail of moves this move can be used before or after, granting additional appeal points in contests.
  , moveCombosSuper :: MoveComboUsage -- ^ A detail of moves this move can be used before or after, granting additional appeal points in super contests.
  } deriving (Show, Eq, Generic)

instance FromJSON MoveCombos where
  parseJSON = genericParseJSON optionsMoveCombos
instance ToJSON MoveCombos where
  toJSON = genericToJSON optionsMoveCombos

optionsMoveCombos :: Options
optionsMoveCombos =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("moveCombosNormal", "normal")
      , ("moveCombosSuper", "super")
      ]


-- | 
data MoveDamageClassDescription = MoveDamageClassDescription
  { moveDamageClassDescriptionDescription :: Maybe Text -- ^ The localized description for an API resource in a specific language.
  , moveDamageClassDescriptionLanguage :: LanguageSummary -- ^ The language this name is in.
  } deriving (Show, Eq, Generic)

instance FromJSON MoveDamageClassDescription where
  parseJSON = genericParseJSON optionsMoveDamageClassDescription
instance ToJSON MoveDamageClassDescription where
  toJSON = genericToJSON optionsMoveDamageClassDescription

optionsMoveDamageClassDescription :: Options
optionsMoveDamageClassDescription =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("moveDamageClassDescriptionDescription", "description")
      , ("moveDamageClassDescriptionLanguage", "language")
      ]


-- | 
data MoveDamageClassDetail = MoveDamageClassDetail
  { moveDamageClassDetailId :: Int -- ^ The identifier for this resource.
  , moveDamageClassDetailName :: Text -- ^ The name for this resource.
  , moveDamageClassDetailDescriptions :: [MoveDamageClassDescription] -- ^ The description of this resource listed in different languages.
  , moveDamageClassDetailMoves :: [MoveSummary] -- ^ A list of moves that fall into this damage class.
  , moveDamageClassDetailNames :: [MoveDamageClassName] -- ^ The name of this resource listed in different languages.
  } deriving (Show, Eq, Generic)

instance FromJSON MoveDamageClassDetail where
  parseJSON = genericParseJSON optionsMoveDamageClassDetail
instance ToJSON MoveDamageClassDetail where
  toJSON = genericToJSON optionsMoveDamageClassDetail

optionsMoveDamageClassDetail :: Options
optionsMoveDamageClassDetail =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("moveDamageClassDetailId", "id")
      , ("moveDamageClassDetailName", "name")
      , ("moveDamageClassDetailDescriptions", "descriptions")
      , ("moveDamageClassDetailMoves", "moves")
      , ("moveDamageClassDetailNames", "names")
      ]


-- | 
data MoveDamageClassName = MoveDamageClassName
  { moveDamageClassNameName :: Text -- ^ The localized name for an API resource in a specific language.
  , moveDamageClassNameLanguage :: LanguageSummary -- ^ The language this name is in.
  } deriving (Show, Eq, Generic)

instance FromJSON MoveDamageClassName where
  parseJSON = genericParseJSON optionsMoveDamageClassName
instance ToJSON MoveDamageClassName where
  toJSON = genericToJSON optionsMoveDamageClassName

optionsMoveDamageClassName :: Options
optionsMoveDamageClassName =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("moveDamageClassNameName", "name")
      , ("moveDamageClassNameLanguage", "language")
      ]


-- | 
data MoveDamageClassSummary = MoveDamageClassSummary
  { moveDamageClassSummaryName :: Text -- ^ The name of the referenced resource.
  , moveDamageClassSummaryUrl :: Text -- ^ The URL of the referenced resource.
  } deriving (Show, Eq, Generic)

instance FromJSON MoveDamageClassSummary where
  parseJSON = genericParseJSON optionsMoveDamageClassSummary
instance ToJSON MoveDamageClassSummary where
  toJSON = genericToJSON optionsMoveDamageClassSummary

optionsMoveDamageClassSummary :: Options
optionsMoveDamageClassSummary =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("moveDamageClassSummaryName", "name")
      , ("moveDamageClassSummaryUrl", "url")
      ]


-- | 
data MoveDetail = MoveDetail
  { moveDetailId :: Int -- ^ The identifier for this resource.
  , moveDetailName :: Text -- ^ The name for this resource.
  , moveDetailAccuracy :: Maybe Int -- ^ The percent value of how likely this move is to be successful.
  , moveDetailEffectUnderscorechance :: Int -- ^ The percent value of how likely it is this moves effect will happen.
  , moveDetailPp :: Maybe Int -- ^ Power points. The number of times this move can be used.
  , moveDetailPriority :: Maybe Int -- ^ A value between -8 and 8. Sets the order in which moves are executed during battle. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Priority) for greater detail.
  , moveDetailPower :: Maybe Int -- ^ The base power of this move, or null if it has no fixed base power.
  , moveDetailContestUnderscorecombos :: MoveCombos -- ^ A detail of normal and super contest combos that require this move.
  , moveDetailContestUnderscoretype :: ContestTypeSummary -- ^ The type of appeal this move gives a Pokémon when used in a contest.
  , moveDetailContestUnderscoreeffect :: ContestEffectSummary -- ^ The effect the move has when used in a contest.
  , moveDetailDamageUnderscoreclass :: MoveDamageClassSummary -- ^ The type of damage the move inflicts on the target, e.g. physical.
  , moveDetailEffectUnderscoreentries :: [MoveEffectEffectText] -- ^ The effect of this move listed in different languages.
  , moveDetailEffectUnderscorechanges :: [MoveEffectChange] -- ^ The list of previous effects this move has had across version groups of the games.
  , moveDetailGeneration :: GenerationSummary -- ^ The generation in which this move was introduced.
  , moveDetailMeta :: MoveMeta -- ^ Metadata about this move
  , moveDetailNames :: [MoveName] -- ^ The name of this resource listed in different languages.
  , moveDetailPastUnderscorevalues :: [MoveChange] -- ^ A list of move resource value changes across version groups of the game.
  , moveDetailStatUnderscorechanges :: [MoveMetaStatChange] -- ^ A list of stats this moves effects and how much it effects them.
  , moveDetailSuperUnderscorecontestUnderscoreeffect :: SuperContestEffectSummary -- ^ The effect the move has when used in a super contest.
  , moveDetailTarget :: MoveTargetSummary -- ^ The type of target that will receive the effects of the attack.
  , moveDetailType :: TypeSummary -- ^ The elemental type of this move.
  , moveDetailMachines :: [ItemMachine] -- ^ A list of the machines that teach this move.
  , moveDetailFlavorUnderscoretextUnderscoreentries :: [MoveFlavorText] -- ^ The flavor text of this move listed in different languages.
  , moveDetailLearnedUnderscorebyUnderscorepokemon :: [PokemonSummary] -- ^ List of Pokemon that can learn the move
  } deriving (Show, Eq, Generic)

instance FromJSON MoveDetail where
  parseJSON = genericParseJSON optionsMoveDetail
instance ToJSON MoveDetail where
  toJSON = genericToJSON optionsMoveDetail

optionsMoveDetail :: Options
optionsMoveDetail =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("moveDetailId", "id")
      , ("moveDetailName", "name")
      , ("moveDetailAccuracy", "accuracy")
      , ("moveDetailEffectUnderscorechance", "effect_chance")
      , ("moveDetailPp", "pp")
      , ("moveDetailPriority", "priority")
      , ("moveDetailPower", "power")
      , ("moveDetailContestUnderscorecombos", "contest_combos")
      , ("moveDetailContestUnderscoretype", "contest_type")
      , ("moveDetailContestUnderscoreeffect", "contest_effect")
      , ("moveDetailDamageUnderscoreclass", "damage_class")
      , ("moveDetailEffectUnderscoreentries", "effect_entries")
      , ("moveDetailEffectUnderscorechanges", "effect_changes")
      , ("moveDetailGeneration", "generation")
      , ("moveDetailMeta", "meta")
      , ("moveDetailNames", "names")
      , ("moveDetailPastUnderscorevalues", "past_values")
      , ("moveDetailStatUnderscorechanges", "stat_changes")
      , ("moveDetailSuperUnderscorecontestUnderscoreeffect", "super_contest_effect")
      , ("moveDetailTarget", "target")
      , ("moveDetailType", "type")
      , ("moveDetailMachines", "machines")
      , ("moveDetailFlavorUnderscoretextUnderscoreentries", "flavor_text_entries")
      , ("moveDetailLearnedUnderscorebyUnderscorepokemon", "learned_by_pokemon")
      ]


-- | 
data MoveEffectChange = MoveEffectChange
  { moveEffectChangeVersionUnderscoregroup :: VersionGroupSummary -- ^ The version group in which the previous effect of this ability originated.
  , moveEffectChangeEffectUnderscoreentries :: [MoveEffectChangeEffectText] -- ^ The previous effect of this ability listed in different languages.
  } deriving (Show, Eq, Generic)

instance FromJSON MoveEffectChange where
  parseJSON = genericParseJSON optionsMoveEffectChange
instance ToJSON MoveEffectChange where
  toJSON = genericToJSON optionsMoveEffectChange

optionsMoveEffectChange :: Options
optionsMoveEffectChange =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("moveEffectChangeVersionUnderscoregroup", "version_group")
      , ("moveEffectChangeEffectUnderscoreentries", "effect_entries")
      ]


-- | 
data MoveEffectChangeEffectText = MoveEffectChangeEffectText
  { moveEffectChangeEffectTextEffect :: Text -- ^ The localized effect text for an API resource in a specific language.
  , moveEffectChangeEffectTextLanguage :: LanguageSummary -- ^ The language this effect is in.
  } deriving (Show, Eq, Generic)

instance FromJSON MoveEffectChangeEffectText where
  parseJSON = genericParseJSON optionsMoveEffectChangeEffectText
instance ToJSON MoveEffectChangeEffectText where
  toJSON = genericToJSON optionsMoveEffectChangeEffectText

optionsMoveEffectChangeEffectText :: Options
optionsMoveEffectChangeEffectText =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("moveEffectChangeEffectTextEffect", "effect")
      , ("moveEffectChangeEffectTextLanguage", "language")
      ]


-- | 
data MoveEffectEffectText = MoveEffectEffectText
  { moveEffectEffectTextEffect :: Text -- ^ The localized effect text for an API resource in a specific language.
  , moveEffectEffectTextShortUnderscoreeffect :: Text -- ^ The localized effect text in brief.
  , moveEffectEffectTextLanguage :: LanguageSummary -- ^ The language this effect is in.
  } deriving (Show, Eq, Generic)

instance FromJSON MoveEffectEffectText where
  parseJSON = genericParseJSON optionsMoveEffectEffectText
instance ToJSON MoveEffectEffectText where
  toJSON = genericToJSON optionsMoveEffectEffectText

optionsMoveEffectEffectText :: Options
optionsMoveEffectEffectText =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("moveEffectEffectTextEffect", "effect")
      , ("moveEffectEffectTextShortUnderscoreeffect", "short_effect")
      , ("moveEffectEffectTextLanguage", "language")
      ]


-- | 
data MoveFlavorText = MoveFlavorText
  { moveFlavorTextFlavorUnderscoretext :: Text -- ^ The localized flavor text for an api resource in a specific language.
  , moveFlavorTextLanguage :: LanguageSummary -- ^ The language this name is in.
  , moveFlavorTextVersionUnderscoregroup :: VersionGroupSummary -- ^ The version group that uses this flavor text.
  } deriving (Show, Eq, Generic)

instance FromJSON MoveFlavorText where
  parseJSON = genericParseJSON optionsMoveFlavorText
instance ToJSON MoveFlavorText where
  toJSON = genericToJSON optionsMoveFlavorText

optionsMoveFlavorText :: Options
optionsMoveFlavorText =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("moveFlavorTextFlavorUnderscoretext", "flavor_text")
      , ("moveFlavorTextLanguage", "language")
      , ("moveFlavorTextVersionUnderscoregroup", "version_group")
      ]


-- | 
data MoveLearnMethodDescription = MoveLearnMethodDescription
  { moveLearnMethodDescriptionDescription :: Maybe Text -- ^ The localized description for an API resource in a specific language.
  , moveLearnMethodDescriptionLanguage :: LanguageSummary -- ^ The language this name is in.
  } deriving (Show, Eq, Generic)

instance FromJSON MoveLearnMethodDescription where
  parseJSON = genericParseJSON optionsMoveLearnMethodDescription
instance ToJSON MoveLearnMethodDescription where
  toJSON = genericToJSON optionsMoveLearnMethodDescription

optionsMoveLearnMethodDescription :: Options
optionsMoveLearnMethodDescription =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("moveLearnMethodDescriptionDescription", "description")
      , ("moveLearnMethodDescriptionLanguage", "language")
      ]


-- | 
data MoveLearnMethodDetail = MoveLearnMethodDetail
  { moveLearnMethodDetailId :: Int -- ^ The identifier for this resource.
  , moveLearnMethodDetailName :: Text -- ^ The name for this resource.
  , moveLearnMethodDetailNames :: [MoveLearnMethodName] -- ^ The name of this resource listed in different languages.
  , moveLearnMethodDetailDescriptions :: [MoveLearnMethodDescription] -- ^ The description of this resource listed in different languages.
  , moveLearnMethodDetailVersionUnderscoregroups :: [VersionGroupSummary] -- ^ A list of version groups where moves can be learned through this method.
  } deriving (Show, Eq, Generic)

instance FromJSON MoveLearnMethodDetail where
  parseJSON = genericParseJSON optionsMoveLearnMethodDetail
instance ToJSON MoveLearnMethodDetail where
  toJSON = genericToJSON optionsMoveLearnMethodDetail

optionsMoveLearnMethodDetail :: Options
optionsMoveLearnMethodDetail =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("moveLearnMethodDetailId", "id")
      , ("moveLearnMethodDetailName", "name")
      , ("moveLearnMethodDetailNames", "names")
      , ("moveLearnMethodDetailDescriptions", "descriptions")
      , ("moveLearnMethodDetailVersionUnderscoregroups", "version_groups")
      ]


-- | 
data MoveLearnMethodName = MoveLearnMethodName
  { moveLearnMethodNameName :: Text -- ^ The localized name for an API resource in a specific language.
  , moveLearnMethodNameLanguage :: LanguageSummary -- ^ The language this name is in.
  } deriving (Show, Eq, Generic)

instance FromJSON MoveLearnMethodName where
  parseJSON = genericParseJSON optionsMoveLearnMethodName
instance ToJSON MoveLearnMethodName where
  toJSON = genericToJSON optionsMoveLearnMethodName

optionsMoveLearnMethodName :: Options
optionsMoveLearnMethodName =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("moveLearnMethodNameName", "name")
      , ("moveLearnMethodNameLanguage", "language")
      ]


-- | 
data MoveLearnMethodSummary = MoveLearnMethodSummary
  { moveLearnMethodSummaryName :: Text -- ^ The name of the referenced resource.
  , moveLearnMethodSummaryUrl :: Text -- ^ The URL of the referenced resource.
  } deriving (Show, Eq, Generic)

instance FromJSON MoveLearnMethodSummary where
  parseJSON = genericParseJSON optionsMoveLearnMethodSummary
instance ToJSON MoveLearnMethodSummary where
  toJSON = genericToJSON optionsMoveLearnMethodSummary

optionsMoveLearnMethodSummary :: Options
optionsMoveLearnMethodSummary =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("moveLearnMethodSummaryName", "name")
      , ("moveLearnMethodSummaryUrl", "url")
      ]


-- | 
data MoveMeta = MoveMeta
  { moveMetaAilment :: MoveMetaAilmentSummary -- ^ The status ailment this move inflicts on its target.
  , moveMetaCategory :: MoveMetaCategorySummary -- ^ The category of move this move falls under, e.g. damage or ailment.
  , moveMetaMinUnderscorehits :: Maybe Int -- ^ The minimum number of times this move hits. Null if it always only hits once.
  , moveMetaMaxUnderscorehits :: Maybe Int -- ^ The maximum number of times this move hits. Null if it always only hits once.
  , moveMetaMinUnderscoreturns :: Maybe Int -- ^ The minimum number of turns this move continues to take effect. Null if it always only lasts one turn.
  , moveMetaMaxUnderscoreturns :: Maybe Int -- ^ The maximum number of turns this move continues to take effect. Null if it always only lasts one turn.
  , moveMetaDrain :: Maybe Int -- ^ HP drain (if positive) or Recoil damage (if negative), in percent of damage done.
  , moveMetaHealing :: Maybe Int -- ^ The amount of hp gained by the attacking Pokemon, in percent of it's maximum HP.
  , moveMetaCritUnderscorerate :: Maybe Int -- ^ Critical hit rate bonus.
  , moveMetaAilmentUnderscorechance :: Maybe Int -- ^ The likelihood this attack will cause an ailment.
  , moveMetaFlinchUnderscorechance :: Maybe Int -- ^ The likelihood this attack will cause the target Pokémon to flinch.
  , moveMetaStatUnderscorechance :: Maybe Int -- ^ The likelihood this attack will cause a stat change in the target Pokémon.
  } deriving (Show, Eq, Generic)

instance FromJSON MoveMeta where
  parseJSON = genericParseJSON optionsMoveMeta
instance ToJSON MoveMeta where
  toJSON = genericToJSON optionsMoveMeta

optionsMoveMeta :: Options
optionsMoveMeta =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("moveMetaAilment", "ailment")
      , ("moveMetaCategory", "category")
      , ("moveMetaMinUnderscorehits", "min_hits")
      , ("moveMetaMaxUnderscorehits", "max_hits")
      , ("moveMetaMinUnderscoreturns", "min_turns")
      , ("moveMetaMaxUnderscoreturns", "max_turns")
      , ("moveMetaDrain", "drain")
      , ("moveMetaHealing", "healing")
      , ("moveMetaCritUnderscorerate", "crit_rate")
      , ("moveMetaAilmentUnderscorechance", "ailment_chance")
      , ("moveMetaFlinchUnderscorechance", "flinch_chance")
      , ("moveMetaStatUnderscorechance", "stat_chance")
      ]


-- | 
data MoveMetaAilmentDetail = MoveMetaAilmentDetail
  { moveMetaAilmentDetailId :: Int -- ^ The identifier for this resource.
  , moveMetaAilmentDetailName :: Text -- ^ The name for this resource.
  , moveMetaAilmentDetailMoves :: [MoveSummary] -- ^ A list of moves that cause this ailment.
  , moveMetaAilmentDetailNames :: [MoveMetaAilmentName] -- ^ The name of this resource listed in different languages.
  } deriving (Show, Eq, Generic)

instance FromJSON MoveMetaAilmentDetail where
  parseJSON = genericParseJSON optionsMoveMetaAilmentDetail
instance ToJSON MoveMetaAilmentDetail where
  toJSON = genericToJSON optionsMoveMetaAilmentDetail

optionsMoveMetaAilmentDetail :: Options
optionsMoveMetaAilmentDetail =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("moveMetaAilmentDetailId", "id")
      , ("moveMetaAilmentDetailName", "name")
      , ("moveMetaAilmentDetailMoves", "moves")
      , ("moveMetaAilmentDetailNames", "names")
      ]


-- | 
data MoveMetaAilmentName = MoveMetaAilmentName
  { moveMetaAilmentNameName :: Text -- ^ The localized name for an API resource in a specific language.
  , moveMetaAilmentNameLanguage :: LanguageSummary -- ^ The language this name is in.
  } deriving (Show, Eq, Generic)

instance FromJSON MoveMetaAilmentName where
  parseJSON = genericParseJSON optionsMoveMetaAilmentName
instance ToJSON MoveMetaAilmentName where
  toJSON = genericToJSON optionsMoveMetaAilmentName

optionsMoveMetaAilmentName :: Options
optionsMoveMetaAilmentName =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("moveMetaAilmentNameName", "name")
      , ("moveMetaAilmentNameLanguage", "language")
      ]


-- | 
data MoveMetaAilmentSummary = MoveMetaAilmentSummary
  { moveMetaAilmentSummaryName :: Text -- ^ The name of the referenced resource.
  , moveMetaAilmentSummaryUrl :: Text -- ^ The URL of the referenced resource.
  } deriving (Show, Eq, Generic)

instance FromJSON MoveMetaAilmentSummary where
  parseJSON = genericParseJSON optionsMoveMetaAilmentSummary
instance ToJSON MoveMetaAilmentSummary where
  toJSON = genericToJSON optionsMoveMetaAilmentSummary

optionsMoveMetaAilmentSummary :: Options
optionsMoveMetaAilmentSummary =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("moveMetaAilmentSummaryName", "name")
      , ("moveMetaAilmentSummaryUrl", "url")
      ]


-- | 
data MoveMetaCategoryDescription = MoveMetaCategoryDescription
  { moveMetaCategoryDescriptionDescription :: Maybe Text -- ^ The localized description for an API resource in a specific language.
  , moveMetaCategoryDescriptionLanguage :: LanguageSummary -- ^ The language this name is in.
  } deriving (Show, Eq, Generic)

instance FromJSON MoveMetaCategoryDescription where
  parseJSON = genericParseJSON optionsMoveMetaCategoryDescription
instance ToJSON MoveMetaCategoryDescription where
  toJSON = genericToJSON optionsMoveMetaCategoryDescription

optionsMoveMetaCategoryDescription :: Options
optionsMoveMetaCategoryDescription =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("moveMetaCategoryDescriptionDescription", "description")
      , ("moveMetaCategoryDescriptionLanguage", "language")
      ]


-- | 
data MoveMetaCategoryDetail = MoveMetaCategoryDetail
  { moveMetaCategoryDetailId :: Int -- ^ The identifier for this resource.
  , moveMetaCategoryDetailName :: Text -- ^ The name for this resource.
  , moveMetaCategoryDetailDescriptions :: [MoveMetaCategoryDescription] -- ^ The description of this resource listed in different languages.
  , moveMetaCategoryDetailMoves :: [MoveSummary] -- ^ A list of moves that fall into this category.
  } deriving (Show, Eq, Generic)

instance FromJSON MoveMetaCategoryDetail where
  parseJSON = genericParseJSON optionsMoveMetaCategoryDetail
instance ToJSON MoveMetaCategoryDetail where
  toJSON = genericToJSON optionsMoveMetaCategoryDetail

optionsMoveMetaCategoryDetail :: Options
optionsMoveMetaCategoryDetail =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("moveMetaCategoryDetailId", "id")
      , ("moveMetaCategoryDetailName", "name")
      , ("moveMetaCategoryDetailDescriptions", "descriptions")
      , ("moveMetaCategoryDetailMoves", "moves")
      ]


-- | 
data MoveMetaCategorySummary = MoveMetaCategorySummary
  { moveMetaCategorySummaryName :: Text -- ^ The name of the referenced resource.
  , moveMetaCategorySummaryUrl :: Text -- ^ The URL of the referenced resource.
  } deriving (Show, Eq, Generic)

instance FromJSON MoveMetaCategorySummary where
  parseJSON = genericParseJSON optionsMoveMetaCategorySummary
instance ToJSON MoveMetaCategorySummary where
  toJSON = genericToJSON optionsMoveMetaCategorySummary

optionsMoveMetaCategorySummary :: Options
optionsMoveMetaCategorySummary =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("moveMetaCategorySummaryName", "name")
      , ("moveMetaCategorySummaryUrl", "url")
      ]


-- | 
data MoveMetaStatChange = MoveMetaStatChange
  { moveMetaStatChangeChange :: Int -- ^ The amount of change.
  , moveMetaStatChangeStat :: StatSummary -- ^ The stat being affected.
  } deriving (Show, Eq, Generic)

instance FromJSON MoveMetaStatChange where
  parseJSON = genericParseJSON optionsMoveMetaStatChange
instance ToJSON MoveMetaStatChange where
  toJSON = genericToJSON optionsMoveMetaStatChange

optionsMoveMetaStatChange :: Options
optionsMoveMetaStatChange =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("moveMetaStatChangeChange", "change")
      , ("moveMetaStatChangeStat", "stat")
      ]


-- | 
data MoveName = MoveName
  { moveNameName :: Text -- ^ The localized name for an API resource in a specific language.
  , moveNameLanguage :: LanguageSummary -- ^ The language this name is in.
  } deriving (Show, Eq, Generic)

instance FromJSON MoveName where
  parseJSON = genericParseJSON optionsMoveName
instance ToJSON MoveName where
  toJSON = genericToJSON optionsMoveName

optionsMoveName :: Options
optionsMoveName =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("moveNameName", "name")
      , ("moveNameLanguage", "language")
      ]


-- | 
data MoveStatChange = MoveStatChange
  { moveStatChangeChange :: Int -- ^ The maximum amount of change to the referenced stat.
  , moveStatChangeMove :: MoveSummary -- ^ The move causing the change.
  } deriving (Show, Eq, Generic)

instance FromJSON MoveStatChange where
  parseJSON = genericParseJSON optionsMoveStatChange
instance ToJSON MoveStatChange where
  toJSON = genericToJSON optionsMoveStatChange

optionsMoveStatChange :: Options
optionsMoveStatChange =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("moveStatChangeChange", "change")
      , ("moveStatChangeMove", "move")
      ]


-- | 
data MoveSummary = MoveSummary
  { moveSummaryName :: Text -- ^ The name of the referenced resource.
  , moveSummaryUrl :: Text -- ^ The URL of the referenced resource.
  } deriving (Show, Eq, Generic)

instance FromJSON MoveSummary where
  parseJSON = genericParseJSON optionsMoveSummary
instance ToJSON MoveSummary where
  toJSON = genericToJSON optionsMoveSummary

optionsMoveSummary :: Options
optionsMoveSummary =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("moveSummaryName", "name")
      , ("moveSummaryUrl", "url")
      ]


-- | 
data MoveTargetDescription = MoveTargetDescription
  { moveTargetDescriptionDescription :: Maybe Text -- ^ The localized description for an API resource in a specific language.
  , moveTargetDescriptionLanguage :: LanguageSummary -- ^ The language this name is in.
  } deriving (Show, Eq, Generic)

instance FromJSON MoveTargetDescription where
  parseJSON = genericParseJSON optionsMoveTargetDescription
instance ToJSON MoveTargetDescription where
  toJSON = genericToJSON optionsMoveTargetDescription

optionsMoveTargetDescription :: Options
optionsMoveTargetDescription =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("moveTargetDescriptionDescription", "description")
      , ("moveTargetDescriptionLanguage", "language")
      ]


-- | 
data MoveTargetDetail = MoveTargetDetail
  { moveTargetDetailId :: Int -- ^ The identifier for this resource.
  , moveTargetDetailName :: Text -- ^ The name for this resource.
  , moveTargetDetailDescriptions :: [MoveTargetDescription] -- ^ The description of this resource listed in different languages.
  , moveTargetDetailMoves :: [MoveSummary] -- ^ A list of moves that that are directed at this target.
  , moveTargetDetailNames :: [MoveTargetName] -- ^ The name of this resource listed in different languages.
  } deriving (Show, Eq, Generic)

instance FromJSON MoveTargetDetail where
  parseJSON = genericParseJSON optionsMoveTargetDetail
instance ToJSON MoveTargetDetail where
  toJSON = genericToJSON optionsMoveTargetDetail

optionsMoveTargetDetail :: Options
optionsMoveTargetDetail =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("moveTargetDetailId", "id")
      , ("moveTargetDetailName", "name")
      , ("moveTargetDetailDescriptions", "descriptions")
      , ("moveTargetDetailMoves", "moves")
      , ("moveTargetDetailNames", "names")
      ]


-- | 
data MoveTargetName = MoveTargetName
  { moveTargetNameName :: Text -- ^ The localized name for an API resource in a specific language.
  , moveTargetNameLanguage :: LanguageSummary -- ^ The language this name is in.
  } deriving (Show, Eq, Generic)

instance FromJSON MoveTargetName where
  parseJSON = genericParseJSON optionsMoveTargetName
instance ToJSON MoveTargetName where
  toJSON = genericToJSON optionsMoveTargetName

optionsMoveTargetName :: Options
optionsMoveTargetName =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("moveTargetNameName", "name")
      , ("moveTargetNameLanguage", "language")
      ]


-- | 
data MoveTargetSummary = MoveTargetSummary
  { moveTargetSummaryName :: Text -- ^ The name of the referenced resource.
  , moveTargetSummaryUrl :: Text -- ^ The URL of the referenced resource.
  } deriving (Show, Eq, Generic)

instance FromJSON MoveTargetSummary where
  parseJSON = genericParseJSON optionsMoveTargetSummary
instance ToJSON MoveTargetSummary where
  toJSON = genericToJSON optionsMoveTargetSummary

optionsMoveTargetSummary :: Options
optionsMoveTargetSummary =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("moveTargetSummaryName", "name")
      , ("moveTargetSummaryUrl", "url")
      ]


-- | 
data NatureBattleStylePreference = NatureBattleStylePreference
  { natureBattleStylePreferenceLowUnderscorehpUnderscorepreference :: Int -- ^ Chance of using the move, in percent, if HP is under one half.
  , natureBattleStylePreferenceHighUnderscorehpUnderscorepreference :: Int -- ^ Chance of using the move, in percent, if HP is over one half.
  , natureBattleStylePreferenceMoveUnderscorebattleUnderscorestyle :: MoveBattleStyleSummary -- ^ The move battle style.
  } deriving (Show, Eq, Generic)

instance FromJSON NatureBattleStylePreference where
  parseJSON = genericParseJSON optionsNatureBattleStylePreference
instance ToJSON NatureBattleStylePreference where
  toJSON = genericToJSON optionsNatureBattleStylePreference

optionsNatureBattleStylePreference :: Options
optionsNatureBattleStylePreference =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("natureBattleStylePreferenceLowUnderscorehpUnderscorepreference", "low_hp_preference")
      , ("natureBattleStylePreferenceHighUnderscorehpUnderscorepreference", "high_hp_preference")
      , ("natureBattleStylePreferenceMoveUnderscorebattleUnderscorestyle", "move_battle_style")
      ]


-- | 
data NatureDetail = NatureDetail
  { natureDetailId :: Int -- ^ The identifier for this resource.
  , natureDetailName :: Text -- ^ The name for this resource.
  , natureDetailDecreasedUnderscorestat :: StatSummary -- ^ The stat decreased by 10% in Pokémon with this nature.
  , natureDetailIncreasedUnderscorestat :: StatSummary -- ^ The stat increased by 10% in Pokémon with this nature.
  , natureDetailLikesUnderscoreflavor :: BerryFlavorSummary -- ^ The flavor liked by Pokémon with this nature.
  , natureDetailHatesUnderscoreflavor :: BerryFlavorSummary -- ^ The flavor hated by Pokémon with this nature.
  , natureDetailPokeathlonUnderscorestatUnderscorechanges :: [NaturePokeathlonStat] -- ^ A list of Pokéathlon stats this nature effects and how much it effects them.
  , natureDetailMoveUnderscorebattleUnderscorestyleUnderscorepreferences :: [NatureBattleStylePreference] -- ^ A list of battle styles and how likely a Pokémon with this nature is to use them in the Battle Palace or Battle Tent.
  , natureDetailNames :: [NatureName] -- ^ The name of this resource listed in different languages.
  } deriving (Show, Eq, Generic)

instance FromJSON NatureDetail where
  parseJSON = genericParseJSON optionsNatureDetail
instance ToJSON NatureDetail where
  toJSON = genericToJSON optionsNatureDetail

optionsNatureDetail :: Options
optionsNatureDetail =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("natureDetailId", "id")
      , ("natureDetailName", "name")
      , ("natureDetailDecreasedUnderscorestat", "decreased_stat")
      , ("natureDetailIncreasedUnderscorestat", "increased_stat")
      , ("natureDetailLikesUnderscoreflavor", "likes_flavor")
      , ("natureDetailHatesUnderscoreflavor", "hates_flavor")
      , ("natureDetailPokeathlonUnderscorestatUnderscorechanges", "pokeathlon_stat_changes")
      , ("natureDetailMoveUnderscorebattleUnderscorestyleUnderscorepreferences", "move_battle_style_preferences")
      , ("natureDetailNames", "names")
      ]


-- | 
data NatureName = NatureName
  { natureNameName :: Text -- ^ The localized name for an API resource in a specific language.
  , natureNameLanguage :: LanguageSummary -- ^ The language this name is in.
  } deriving (Show, Eq, Generic)

instance FromJSON NatureName where
  parseJSON = genericParseJSON optionsNatureName
instance ToJSON NatureName where
  toJSON = genericToJSON optionsNatureName

optionsNatureName :: Options
optionsNatureName =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("natureNameName", "name")
      , ("natureNameLanguage", "language")
      ]


-- | 
data NaturePokeathlonStat = NaturePokeathlonStat
  { naturePokeathlonStatMaxUnderscorechange :: Int -- ^ The amount of change.
  , naturePokeathlonStatPokeathlonUnderscorestat :: PokeathlonStatSummary -- ^ The stat being affected.
  } deriving (Show, Eq, Generic)

instance FromJSON NaturePokeathlonStat where
  parseJSON = genericParseJSON optionsNaturePokeathlonStat
instance ToJSON NaturePokeathlonStat where
  toJSON = genericToJSON optionsNaturePokeathlonStat

optionsNaturePokeathlonStat :: Options
optionsNaturePokeathlonStat =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("naturePokeathlonStatMaxUnderscorechange", "max_change")
      , ("naturePokeathlonStatPokeathlonUnderscorestat", "pokeathlon_stat")
      ]


-- | 
data NatureSummary = NatureSummary
  { natureSummaryName :: Text -- ^ The name of the referenced resource.
  , natureSummaryUrl :: Text -- ^ The URL of the referenced resource.
  } deriving (Show, Eq, Generic)

instance FromJSON NatureSummary where
  parseJSON = genericParseJSON optionsNatureSummary
instance ToJSON NatureSummary where
  toJSON = genericToJSON optionsNatureSummary

optionsNatureSummary :: Options
optionsNatureSummary =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("natureSummaryName", "name")
      , ("natureSummaryUrl", "url")
      ]


-- | 
data PaginatedAbilitySummaryList = PaginatedAbilitySummaryList
  { paginatedAbilitySummaryListCount :: Int -- ^ The total number of resources available from this API.
  , paginatedAbilitySummaryListNext :: Maybe Text -- ^ The URL for the next page in the list, or null if there is no next page.
  , paginatedAbilitySummaryListPrevious :: Maybe Text -- ^ The URL for the previous page in the list, or null if there is no previous page.
  , paginatedAbilitySummaryListResults :: [AbilitySummary] -- ^ A list of API resources on this page.
  } deriving (Show, Eq, Generic)

instance FromJSON PaginatedAbilitySummaryList where
  parseJSON = genericParseJSON optionsPaginatedAbilitySummaryList
instance ToJSON PaginatedAbilitySummaryList where
  toJSON = genericToJSON optionsPaginatedAbilitySummaryList

optionsPaginatedAbilitySummaryList :: Options
optionsPaginatedAbilitySummaryList =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("paginatedAbilitySummaryListCount", "count")
      , ("paginatedAbilitySummaryListNext", "next")
      , ("paginatedAbilitySummaryListPrevious", "previous")
      , ("paginatedAbilitySummaryListResults", "results")
      ]


-- | 
data PaginatedBerryFirmnessSummaryList = PaginatedBerryFirmnessSummaryList
  { paginatedBerryFirmnessSummaryListCount :: Int -- ^ The total number of resources available from this API.
  , paginatedBerryFirmnessSummaryListNext :: Maybe Text -- ^ The URL for the next page in the list, or null if there is no next page.
  , paginatedBerryFirmnessSummaryListPrevious :: Maybe Text -- ^ The URL for the previous page in the list, or null if there is no previous page.
  , paginatedBerryFirmnessSummaryListResults :: [BerryFirmnessSummary] -- ^ A list of API resources on this page.
  } deriving (Show, Eq, Generic)

instance FromJSON PaginatedBerryFirmnessSummaryList where
  parseJSON = genericParseJSON optionsPaginatedBerryFirmnessSummaryList
instance ToJSON PaginatedBerryFirmnessSummaryList where
  toJSON = genericToJSON optionsPaginatedBerryFirmnessSummaryList

optionsPaginatedBerryFirmnessSummaryList :: Options
optionsPaginatedBerryFirmnessSummaryList =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("paginatedBerryFirmnessSummaryListCount", "count")
      , ("paginatedBerryFirmnessSummaryListNext", "next")
      , ("paginatedBerryFirmnessSummaryListPrevious", "previous")
      , ("paginatedBerryFirmnessSummaryListResults", "results")
      ]


-- | 
data PaginatedBerryFlavorSummaryList = PaginatedBerryFlavorSummaryList
  { paginatedBerryFlavorSummaryListCount :: Int -- ^ The total number of resources available from this API.
  , paginatedBerryFlavorSummaryListNext :: Maybe Text -- ^ The URL for the next page in the list, or null if there is no next page.
  , paginatedBerryFlavorSummaryListPrevious :: Maybe Text -- ^ The URL for the previous page in the list, or null if there is no previous page.
  , paginatedBerryFlavorSummaryListResults :: [BerryFlavorSummary] -- ^ A list of API resources on this page.
  } deriving (Show, Eq, Generic)

instance FromJSON PaginatedBerryFlavorSummaryList where
  parseJSON = genericParseJSON optionsPaginatedBerryFlavorSummaryList
instance ToJSON PaginatedBerryFlavorSummaryList where
  toJSON = genericToJSON optionsPaginatedBerryFlavorSummaryList

optionsPaginatedBerryFlavorSummaryList :: Options
optionsPaginatedBerryFlavorSummaryList =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("paginatedBerryFlavorSummaryListCount", "count")
      , ("paginatedBerryFlavorSummaryListNext", "next")
      , ("paginatedBerryFlavorSummaryListPrevious", "previous")
      , ("paginatedBerryFlavorSummaryListResults", "results")
      ]


-- | 
data PaginatedBerrySummaryList = PaginatedBerrySummaryList
  { paginatedBerrySummaryListCount :: Int -- ^ The total number of resources available from this API.
  , paginatedBerrySummaryListNext :: Maybe Text -- ^ The URL for the next page in the list, or null if there is no next page.
  , paginatedBerrySummaryListPrevious :: Maybe Text -- ^ The URL for the previous page in the list, or null if there is no previous page.
  , paginatedBerrySummaryListResults :: [BerrySummary] -- ^ A list of API resources on this page.
  } deriving (Show, Eq, Generic)

instance FromJSON PaginatedBerrySummaryList where
  parseJSON = genericParseJSON optionsPaginatedBerrySummaryList
instance ToJSON PaginatedBerrySummaryList where
  toJSON = genericToJSON optionsPaginatedBerrySummaryList

optionsPaginatedBerrySummaryList :: Options
optionsPaginatedBerrySummaryList =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("paginatedBerrySummaryListCount", "count")
      , ("paginatedBerrySummaryListNext", "next")
      , ("paginatedBerrySummaryListPrevious", "previous")
      , ("paginatedBerrySummaryListResults", "results")
      ]


-- | 
data PaginatedCharacteristicSummaryList = PaginatedCharacteristicSummaryList
  { paginatedCharacteristicSummaryListCount :: Int -- ^ The total number of resources available from this API.
  , paginatedCharacteristicSummaryListNext :: Maybe Text -- ^ The URL for the next page in the list, or null if there is no next page.
  , paginatedCharacteristicSummaryListPrevious :: Maybe Text -- ^ The URL for the previous page in the list, or null if there is no previous page.
  , paginatedCharacteristicSummaryListResults :: [CharacteristicSummary] -- ^ A list of API resources on this page.
  } deriving (Show, Eq, Generic)

instance FromJSON PaginatedCharacteristicSummaryList where
  parseJSON = genericParseJSON optionsPaginatedCharacteristicSummaryList
instance ToJSON PaginatedCharacteristicSummaryList where
  toJSON = genericToJSON optionsPaginatedCharacteristicSummaryList

optionsPaginatedCharacteristicSummaryList :: Options
optionsPaginatedCharacteristicSummaryList =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("paginatedCharacteristicSummaryListCount", "count")
      , ("paginatedCharacteristicSummaryListNext", "next")
      , ("paginatedCharacteristicSummaryListPrevious", "previous")
      , ("paginatedCharacteristicSummaryListResults", "results")
      ]


-- | 
data PaginatedContestEffectSummaryList = PaginatedContestEffectSummaryList
  { paginatedContestEffectSummaryListCount :: Int -- ^ The total number of resources available from this API.
  , paginatedContestEffectSummaryListNext :: Maybe Text -- ^ The URL for the next page in the list, or null if there is no next page.
  , paginatedContestEffectSummaryListPrevious :: Maybe Text -- ^ The URL for the previous page in the list, or null if there is no previous page.
  , paginatedContestEffectSummaryListResults :: [ContestEffectSummary] -- ^ A list of API resources on this page.
  } deriving (Show, Eq, Generic)

instance FromJSON PaginatedContestEffectSummaryList where
  parseJSON = genericParseJSON optionsPaginatedContestEffectSummaryList
instance ToJSON PaginatedContestEffectSummaryList where
  toJSON = genericToJSON optionsPaginatedContestEffectSummaryList

optionsPaginatedContestEffectSummaryList :: Options
optionsPaginatedContestEffectSummaryList =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("paginatedContestEffectSummaryListCount", "count")
      , ("paginatedContestEffectSummaryListNext", "next")
      , ("paginatedContestEffectSummaryListPrevious", "previous")
      , ("paginatedContestEffectSummaryListResults", "results")
      ]


-- | 
data PaginatedContestTypeSummaryList = PaginatedContestTypeSummaryList
  { paginatedContestTypeSummaryListCount :: Int -- ^ The total number of resources available from this API.
  , paginatedContestTypeSummaryListNext :: Maybe Text -- ^ The URL for the next page in the list, or null if there is no next page.
  , paginatedContestTypeSummaryListPrevious :: Maybe Text -- ^ The URL for the previous page in the list, or null if there is no previous page.
  , paginatedContestTypeSummaryListResults :: [ContestTypeSummary] -- ^ A list of API resources on this page.
  } deriving (Show, Eq, Generic)

instance FromJSON PaginatedContestTypeSummaryList where
  parseJSON = genericParseJSON optionsPaginatedContestTypeSummaryList
instance ToJSON PaginatedContestTypeSummaryList where
  toJSON = genericToJSON optionsPaginatedContestTypeSummaryList

optionsPaginatedContestTypeSummaryList :: Options
optionsPaginatedContestTypeSummaryList =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("paginatedContestTypeSummaryListCount", "count")
      , ("paginatedContestTypeSummaryListNext", "next")
      , ("paginatedContestTypeSummaryListPrevious", "previous")
      , ("paginatedContestTypeSummaryListResults", "results")
      ]


-- | 
data PaginatedCurrencySummaryList = PaginatedCurrencySummaryList
  { paginatedCurrencySummaryListCount :: Int -- ^ The total number of resources available from this API.
  , paginatedCurrencySummaryListNext :: Maybe Text -- ^ The URL for the next page in the list, or null if there is no next page.
  , paginatedCurrencySummaryListPrevious :: Maybe Text -- ^ The URL for the previous page in the list, or null if there is no previous page.
  , paginatedCurrencySummaryListResults :: [CurrencySummary] -- ^ A list of API resources on this page.
  } deriving (Show, Eq, Generic)

instance FromJSON PaginatedCurrencySummaryList where
  parseJSON = genericParseJSON optionsPaginatedCurrencySummaryList
instance ToJSON PaginatedCurrencySummaryList where
  toJSON = genericToJSON optionsPaginatedCurrencySummaryList

optionsPaginatedCurrencySummaryList :: Options
optionsPaginatedCurrencySummaryList =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("paginatedCurrencySummaryListCount", "count")
      , ("paginatedCurrencySummaryListNext", "next")
      , ("paginatedCurrencySummaryListPrevious", "previous")
      , ("paginatedCurrencySummaryListResults", "results")
      ]


-- | 
data PaginatedEggGroupSummaryList = PaginatedEggGroupSummaryList
  { paginatedEggGroupSummaryListCount :: Int -- ^ The total number of resources available from this API.
  , paginatedEggGroupSummaryListNext :: Maybe Text -- ^ The URL for the next page in the list, or null if there is no next page.
  , paginatedEggGroupSummaryListPrevious :: Maybe Text -- ^ The URL for the previous page in the list, or null if there is no previous page.
  , paginatedEggGroupSummaryListResults :: [EggGroupSummary] -- ^ A list of API resources on this page.
  } deriving (Show, Eq, Generic)

instance FromJSON PaginatedEggGroupSummaryList where
  parseJSON = genericParseJSON optionsPaginatedEggGroupSummaryList
instance ToJSON PaginatedEggGroupSummaryList where
  toJSON = genericToJSON optionsPaginatedEggGroupSummaryList

optionsPaginatedEggGroupSummaryList :: Options
optionsPaginatedEggGroupSummaryList =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("paginatedEggGroupSummaryListCount", "count")
      , ("paginatedEggGroupSummaryListNext", "next")
      , ("paginatedEggGroupSummaryListPrevious", "previous")
      , ("paginatedEggGroupSummaryListResults", "results")
      ]


-- | 
data PaginatedEncounterConditionSummaryList = PaginatedEncounterConditionSummaryList
  { paginatedEncounterConditionSummaryListCount :: Int -- ^ The total number of resources available from this API.
  , paginatedEncounterConditionSummaryListNext :: Maybe Text -- ^ The URL for the next page in the list, or null if there is no next page.
  , paginatedEncounterConditionSummaryListPrevious :: Maybe Text -- ^ The URL for the previous page in the list, or null if there is no previous page.
  , paginatedEncounterConditionSummaryListResults :: [EncounterConditionSummary] -- ^ A list of API resources on this page.
  } deriving (Show, Eq, Generic)

instance FromJSON PaginatedEncounterConditionSummaryList where
  parseJSON = genericParseJSON optionsPaginatedEncounterConditionSummaryList
instance ToJSON PaginatedEncounterConditionSummaryList where
  toJSON = genericToJSON optionsPaginatedEncounterConditionSummaryList

optionsPaginatedEncounterConditionSummaryList :: Options
optionsPaginatedEncounterConditionSummaryList =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("paginatedEncounterConditionSummaryListCount", "count")
      , ("paginatedEncounterConditionSummaryListNext", "next")
      , ("paginatedEncounterConditionSummaryListPrevious", "previous")
      , ("paginatedEncounterConditionSummaryListResults", "results")
      ]


-- | 
data PaginatedEncounterConditionValueSummaryList = PaginatedEncounterConditionValueSummaryList
  { paginatedEncounterConditionValueSummaryListCount :: Int -- ^ The total number of resources available from this API.
  , paginatedEncounterConditionValueSummaryListNext :: Maybe Text -- ^ The URL for the next page in the list, or null if there is no next page.
  , paginatedEncounterConditionValueSummaryListPrevious :: Maybe Text -- ^ The URL for the previous page in the list, or null if there is no previous page.
  , paginatedEncounterConditionValueSummaryListResults :: [EncounterConditionValueSummary] -- ^ A list of API resources on this page.
  } deriving (Show, Eq, Generic)

instance FromJSON PaginatedEncounterConditionValueSummaryList where
  parseJSON = genericParseJSON optionsPaginatedEncounterConditionValueSummaryList
instance ToJSON PaginatedEncounterConditionValueSummaryList where
  toJSON = genericToJSON optionsPaginatedEncounterConditionValueSummaryList

optionsPaginatedEncounterConditionValueSummaryList :: Options
optionsPaginatedEncounterConditionValueSummaryList =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("paginatedEncounterConditionValueSummaryListCount", "count")
      , ("paginatedEncounterConditionValueSummaryListNext", "next")
      , ("paginatedEncounterConditionValueSummaryListPrevious", "previous")
      , ("paginatedEncounterConditionValueSummaryListResults", "results")
      ]


-- | 
data PaginatedEncounterMethodSummaryList = PaginatedEncounterMethodSummaryList
  { paginatedEncounterMethodSummaryListCount :: Int -- ^ The total number of resources available from this API.
  , paginatedEncounterMethodSummaryListNext :: Maybe Text -- ^ The URL for the next page in the list, or null if there is no next page.
  , paginatedEncounterMethodSummaryListPrevious :: Maybe Text -- ^ The URL for the previous page in the list, or null if there is no previous page.
  , paginatedEncounterMethodSummaryListResults :: [EncounterMethodSummary] -- ^ A list of API resources on this page.
  } deriving (Show, Eq, Generic)

instance FromJSON PaginatedEncounterMethodSummaryList where
  parseJSON = genericParseJSON optionsPaginatedEncounterMethodSummaryList
instance ToJSON PaginatedEncounterMethodSummaryList where
  toJSON = genericToJSON optionsPaginatedEncounterMethodSummaryList

optionsPaginatedEncounterMethodSummaryList :: Options
optionsPaginatedEncounterMethodSummaryList =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("paginatedEncounterMethodSummaryListCount", "count")
      , ("paginatedEncounterMethodSummaryListNext", "next")
      , ("paginatedEncounterMethodSummaryListPrevious", "previous")
      , ("paginatedEncounterMethodSummaryListResults", "results")
      ]


-- | 
data PaginatedEvolutionChainSummaryList = PaginatedEvolutionChainSummaryList
  { paginatedEvolutionChainSummaryListCount :: Int -- ^ The total number of resources available from this API.
  , paginatedEvolutionChainSummaryListNext :: Maybe Text -- ^ The URL for the next page in the list, or null if there is no next page.
  , paginatedEvolutionChainSummaryListPrevious :: Maybe Text -- ^ The URL for the previous page in the list, or null if there is no previous page.
  , paginatedEvolutionChainSummaryListResults :: [EvolutionChainSummary] -- ^ A list of API resources on this page.
  } deriving (Show, Eq, Generic)

instance FromJSON PaginatedEvolutionChainSummaryList where
  parseJSON = genericParseJSON optionsPaginatedEvolutionChainSummaryList
instance ToJSON PaginatedEvolutionChainSummaryList where
  toJSON = genericToJSON optionsPaginatedEvolutionChainSummaryList

optionsPaginatedEvolutionChainSummaryList :: Options
optionsPaginatedEvolutionChainSummaryList =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("paginatedEvolutionChainSummaryListCount", "count")
      , ("paginatedEvolutionChainSummaryListNext", "next")
      , ("paginatedEvolutionChainSummaryListPrevious", "previous")
      , ("paginatedEvolutionChainSummaryListResults", "results")
      ]


-- | 
data PaginatedEvolutionTriggerSummaryList = PaginatedEvolutionTriggerSummaryList
  { paginatedEvolutionTriggerSummaryListCount :: Int -- ^ The total number of resources available from this API.
  , paginatedEvolutionTriggerSummaryListNext :: Maybe Text -- ^ The URL for the next page in the list, or null if there is no next page.
  , paginatedEvolutionTriggerSummaryListPrevious :: Maybe Text -- ^ The URL for the previous page in the list, or null if there is no previous page.
  , paginatedEvolutionTriggerSummaryListResults :: [EvolutionTriggerSummary] -- ^ A list of API resources on this page.
  } deriving (Show, Eq, Generic)

instance FromJSON PaginatedEvolutionTriggerSummaryList where
  parseJSON = genericParseJSON optionsPaginatedEvolutionTriggerSummaryList
instance ToJSON PaginatedEvolutionTriggerSummaryList where
  toJSON = genericToJSON optionsPaginatedEvolutionTriggerSummaryList

optionsPaginatedEvolutionTriggerSummaryList :: Options
optionsPaginatedEvolutionTriggerSummaryList =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("paginatedEvolutionTriggerSummaryListCount", "count")
      , ("paginatedEvolutionTriggerSummaryListNext", "next")
      , ("paginatedEvolutionTriggerSummaryListPrevious", "previous")
      , ("paginatedEvolutionTriggerSummaryListResults", "results")
      ]


-- | 
data PaginatedEvolutionVariableSummaryList = PaginatedEvolutionVariableSummaryList
  { paginatedEvolutionVariableSummaryListCount :: Int -- ^ The total number of resources available from this API.
  , paginatedEvolutionVariableSummaryListNext :: Maybe Text -- ^ The URL for the next page in the list, or null if there is no next page.
  , paginatedEvolutionVariableSummaryListPrevious :: Maybe Text -- ^ The URL for the previous page in the list, or null if there is no previous page.
  , paginatedEvolutionVariableSummaryListResults :: [EvolutionVariableSummary] -- ^ A list of API resources on this page.
  } deriving (Show, Eq, Generic)

instance FromJSON PaginatedEvolutionVariableSummaryList where
  parseJSON = genericParseJSON optionsPaginatedEvolutionVariableSummaryList
instance ToJSON PaginatedEvolutionVariableSummaryList where
  toJSON = genericToJSON optionsPaginatedEvolutionVariableSummaryList

optionsPaginatedEvolutionVariableSummaryList :: Options
optionsPaginatedEvolutionVariableSummaryList =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("paginatedEvolutionVariableSummaryListCount", "count")
      , ("paginatedEvolutionVariableSummaryListNext", "next")
      , ("paginatedEvolutionVariableSummaryListPrevious", "previous")
      , ("paginatedEvolutionVariableSummaryListResults", "results")
      ]


-- | 
data PaginatedGenderSummaryList = PaginatedGenderSummaryList
  { paginatedGenderSummaryListCount :: Int -- ^ The total number of resources available from this API.
  , paginatedGenderSummaryListNext :: Maybe Text -- ^ The URL for the next page in the list, or null if there is no next page.
  , paginatedGenderSummaryListPrevious :: Maybe Text -- ^ The URL for the previous page in the list, or null if there is no previous page.
  , paginatedGenderSummaryListResults :: [GenderSummary] -- ^ A list of API resources on this page.
  } deriving (Show, Eq, Generic)

instance FromJSON PaginatedGenderSummaryList where
  parseJSON = genericParseJSON optionsPaginatedGenderSummaryList
instance ToJSON PaginatedGenderSummaryList where
  toJSON = genericToJSON optionsPaginatedGenderSummaryList

optionsPaginatedGenderSummaryList :: Options
optionsPaginatedGenderSummaryList =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("paginatedGenderSummaryListCount", "count")
      , ("paginatedGenderSummaryListNext", "next")
      , ("paginatedGenderSummaryListPrevious", "previous")
      , ("paginatedGenderSummaryListResults", "results")
      ]


-- | 
data PaginatedGenerationSummaryList = PaginatedGenerationSummaryList
  { paginatedGenerationSummaryListCount :: Int -- ^ The total number of resources available from this API.
  , paginatedGenerationSummaryListNext :: Maybe Text -- ^ The URL for the next page in the list, or null if there is no next page.
  , paginatedGenerationSummaryListPrevious :: Maybe Text -- ^ The URL for the previous page in the list, or null if there is no previous page.
  , paginatedGenerationSummaryListResults :: [GenerationSummary] -- ^ A list of API resources on this page.
  } deriving (Show, Eq, Generic)

instance FromJSON PaginatedGenerationSummaryList where
  parseJSON = genericParseJSON optionsPaginatedGenerationSummaryList
instance ToJSON PaginatedGenerationSummaryList where
  toJSON = genericToJSON optionsPaginatedGenerationSummaryList

optionsPaginatedGenerationSummaryList :: Options
optionsPaginatedGenerationSummaryList =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("paginatedGenerationSummaryListCount", "count")
      , ("paginatedGenerationSummaryListNext", "next")
      , ("paginatedGenerationSummaryListPrevious", "previous")
      , ("paginatedGenerationSummaryListResults", "results")
      ]


-- | 
data PaginatedGrowthRateSummaryList = PaginatedGrowthRateSummaryList
  { paginatedGrowthRateSummaryListCount :: Int -- ^ The total number of resources available from this API.
  , paginatedGrowthRateSummaryListNext :: Maybe Text -- ^ The URL for the next page in the list, or null if there is no next page.
  , paginatedGrowthRateSummaryListPrevious :: Maybe Text -- ^ The URL for the previous page in the list, or null if there is no previous page.
  , paginatedGrowthRateSummaryListResults :: [GrowthRateSummary] -- ^ A list of API resources on this page.
  } deriving (Show, Eq, Generic)

instance FromJSON PaginatedGrowthRateSummaryList where
  parseJSON = genericParseJSON optionsPaginatedGrowthRateSummaryList
instance ToJSON PaginatedGrowthRateSummaryList where
  toJSON = genericToJSON optionsPaginatedGrowthRateSummaryList

optionsPaginatedGrowthRateSummaryList :: Options
optionsPaginatedGrowthRateSummaryList =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("paginatedGrowthRateSummaryListCount", "count")
      , ("paginatedGrowthRateSummaryListNext", "next")
      , ("paginatedGrowthRateSummaryListPrevious", "previous")
      , ("paginatedGrowthRateSummaryListResults", "results")
      ]


-- | 
data PaginatedItemAttributeSummaryList = PaginatedItemAttributeSummaryList
  { paginatedItemAttributeSummaryListCount :: Int -- ^ The total number of resources available from this API.
  , paginatedItemAttributeSummaryListNext :: Maybe Text -- ^ The URL for the next page in the list, or null if there is no next page.
  , paginatedItemAttributeSummaryListPrevious :: Maybe Text -- ^ The URL for the previous page in the list, or null if there is no previous page.
  , paginatedItemAttributeSummaryListResults :: [ItemAttributeSummary] -- ^ A list of API resources on this page.
  } deriving (Show, Eq, Generic)

instance FromJSON PaginatedItemAttributeSummaryList where
  parseJSON = genericParseJSON optionsPaginatedItemAttributeSummaryList
instance ToJSON PaginatedItemAttributeSummaryList where
  toJSON = genericToJSON optionsPaginatedItemAttributeSummaryList

optionsPaginatedItemAttributeSummaryList :: Options
optionsPaginatedItemAttributeSummaryList =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("paginatedItemAttributeSummaryListCount", "count")
      , ("paginatedItemAttributeSummaryListNext", "next")
      , ("paginatedItemAttributeSummaryListPrevious", "previous")
      , ("paginatedItemAttributeSummaryListResults", "results")
      ]


-- | 
data PaginatedItemCategorySummaryList = PaginatedItemCategorySummaryList
  { paginatedItemCategorySummaryListCount :: Int -- ^ The total number of resources available from this API.
  , paginatedItemCategorySummaryListNext :: Maybe Text -- ^ The URL for the next page in the list, or null if there is no next page.
  , paginatedItemCategorySummaryListPrevious :: Maybe Text -- ^ The URL for the previous page in the list, or null if there is no previous page.
  , paginatedItemCategorySummaryListResults :: [ItemCategorySummary] -- ^ A list of API resources on this page.
  } deriving (Show, Eq, Generic)

instance FromJSON PaginatedItemCategorySummaryList where
  parseJSON = genericParseJSON optionsPaginatedItemCategorySummaryList
instance ToJSON PaginatedItemCategorySummaryList where
  toJSON = genericToJSON optionsPaginatedItemCategorySummaryList

optionsPaginatedItemCategorySummaryList :: Options
optionsPaginatedItemCategorySummaryList =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("paginatedItemCategorySummaryListCount", "count")
      , ("paginatedItemCategorySummaryListNext", "next")
      , ("paginatedItemCategorySummaryListPrevious", "previous")
      , ("paginatedItemCategorySummaryListResults", "results")
      ]


-- | 
data PaginatedItemFlingEffectSummaryList = PaginatedItemFlingEffectSummaryList
  { paginatedItemFlingEffectSummaryListCount :: Int -- ^ The total number of resources available from this API.
  , paginatedItemFlingEffectSummaryListNext :: Maybe Text -- ^ The URL for the next page in the list, or null if there is no next page.
  , paginatedItemFlingEffectSummaryListPrevious :: Maybe Text -- ^ The URL for the previous page in the list, or null if there is no previous page.
  , paginatedItemFlingEffectSummaryListResults :: [ItemFlingEffectSummary] -- ^ A list of API resources on this page.
  } deriving (Show, Eq, Generic)

instance FromJSON PaginatedItemFlingEffectSummaryList where
  parseJSON = genericParseJSON optionsPaginatedItemFlingEffectSummaryList
instance ToJSON PaginatedItemFlingEffectSummaryList where
  toJSON = genericToJSON optionsPaginatedItemFlingEffectSummaryList

optionsPaginatedItemFlingEffectSummaryList :: Options
optionsPaginatedItemFlingEffectSummaryList =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("paginatedItemFlingEffectSummaryListCount", "count")
      , ("paginatedItemFlingEffectSummaryListNext", "next")
      , ("paginatedItemFlingEffectSummaryListPrevious", "previous")
      , ("paginatedItemFlingEffectSummaryListResults", "results")
      ]


-- | 
data PaginatedItemPocketSummaryList = PaginatedItemPocketSummaryList
  { paginatedItemPocketSummaryListCount :: Int -- ^ The total number of resources available from this API.
  , paginatedItemPocketSummaryListNext :: Maybe Text -- ^ The URL for the next page in the list, or null if there is no next page.
  , paginatedItemPocketSummaryListPrevious :: Maybe Text -- ^ The URL for the previous page in the list, or null if there is no previous page.
  , paginatedItemPocketSummaryListResults :: [ItemPocketSummary] -- ^ A list of API resources on this page.
  } deriving (Show, Eq, Generic)

instance FromJSON PaginatedItemPocketSummaryList where
  parseJSON = genericParseJSON optionsPaginatedItemPocketSummaryList
instance ToJSON PaginatedItemPocketSummaryList where
  toJSON = genericToJSON optionsPaginatedItemPocketSummaryList

optionsPaginatedItemPocketSummaryList :: Options
optionsPaginatedItemPocketSummaryList =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("paginatedItemPocketSummaryListCount", "count")
      , ("paginatedItemPocketSummaryListNext", "next")
      , ("paginatedItemPocketSummaryListPrevious", "previous")
      , ("paginatedItemPocketSummaryListResults", "results")
      ]


-- | 
data PaginatedItemSummaryList = PaginatedItemSummaryList
  { paginatedItemSummaryListCount :: Int -- ^ The total number of resources available from this API.
  , paginatedItemSummaryListNext :: Maybe Text -- ^ The URL for the next page in the list, or null if there is no next page.
  , paginatedItemSummaryListPrevious :: Maybe Text -- ^ The URL for the previous page in the list, or null if there is no previous page.
  , paginatedItemSummaryListResults :: [ItemSummary] -- ^ A list of API resources on this page.
  } deriving (Show, Eq, Generic)

instance FromJSON PaginatedItemSummaryList where
  parseJSON = genericParseJSON optionsPaginatedItemSummaryList
instance ToJSON PaginatedItemSummaryList where
  toJSON = genericToJSON optionsPaginatedItemSummaryList

optionsPaginatedItemSummaryList :: Options
optionsPaginatedItemSummaryList =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("paginatedItemSummaryListCount", "count")
      , ("paginatedItemSummaryListNext", "next")
      , ("paginatedItemSummaryListPrevious", "previous")
      , ("paginatedItemSummaryListResults", "results")
      ]


-- | 
data PaginatedLanguageSummaryList = PaginatedLanguageSummaryList
  { paginatedLanguageSummaryListCount :: Int -- ^ The total number of resources available from this API.
  , paginatedLanguageSummaryListNext :: Maybe Text -- ^ The URL for the next page in the list, or null if there is no next page.
  , paginatedLanguageSummaryListPrevious :: Maybe Text -- ^ The URL for the previous page in the list, or null if there is no previous page.
  , paginatedLanguageSummaryListResults :: [LanguageSummary] -- ^ A list of API resources on this page.
  } deriving (Show, Eq, Generic)

instance FromJSON PaginatedLanguageSummaryList where
  parseJSON = genericParseJSON optionsPaginatedLanguageSummaryList
instance ToJSON PaginatedLanguageSummaryList where
  toJSON = genericToJSON optionsPaginatedLanguageSummaryList

optionsPaginatedLanguageSummaryList :: Options
optionsPaginatedLanguageSummaryList =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("paginatedLanguageSummaryListCount", "count")
      , ("paginatedLanguageSummaryListNext", "next")
      , ("paginatedLanguageSummaryListPrevious", "previous")
      , ("paginatedLanguageSummaryListResults", "results")
      ]


-- | 
data PaginatedLocationAreaSummaryList = PaginatedLocationAreaSummaryList
  { paginatedLocationAreaSummaryListCount :: Int -- ^ The total number of resources available from this API.
  , paginatedLocationAreaSummaryListNext :: Maybe Text -- ^ The URL for the next page in the list, or null if there is no next page.
  , paginatedLocationAreaSummaryListPrevious :: Maybe Text -- ^ The URL for the previous page in the list, or null if there is no previous page.
  , paginatedLocationAreaSummaryListResults :: [LocationAreaSummary] -- ^ A list of API resources on this page.
  } deriving (Show, Eq, Generic)

instance FromJSON PaginatedLocationAreaSummaryList where
  parseJSON = genericParseJSON optionsPaginatedLocationAreaSummaryList
instance ToJSON PaginatedLocationAreaSummaryList where
  toJSON = genericToJSON optionsPaginatedLocationAreaSummaryList

optionsPaginatedLocationAreaSummaryList :: Options
optionsPaginatedLocationAreaSummaryList =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("paginatedLocationAreaSummaryListCount", "count")
      , ("paginatedLocationAreaSummaryListNext", "next")
      , ("paginatedLocationAreaSummaryListPrevious", "previous")
      , ("paginatedLocationAreaSummaryListResults", "results")
      ]


-- | 
data PaginatedLocationSummaryList = PaginatedLocationSummaryList
  { paginatedLocationSummaryListCount :: Int -- ^ The total number of resources available from this API.
  , paginatedLocationSummaryListNext :: Maybe Text -- ^ The URL for the next page in the list, or null if there is no next page.
  , paginatedLocationSummaryListPrevious :: Maybe Text -- ^ The URL for the previous page in the list, or null if there is no previous page.
  , paginatedLocationSummaryListResults :: [LocationSummary] -- ^ A list of API resources on this page.
  } deriving (Show, Eq, Generic)

instance FromJSON PaginatedLocationSummaryList where
  parseJSON = genericParseJSON optionsPaginatedLocationSummaryList
instance ToJSON PaginatedLocationSummaryList where
  toJSON = genericToJSON optionsPaginatedLocationSummaryList

optionsPaginatedLocationSummaryList :: Options
optionsPaginatedLocationSummaryList =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("paginatedLocationSummaryListCount", "count")
      , ("paginatedLocationSummaryListNext", "next")
      , ("paginatedLocationSummaryListPrevious", "previous")
      , ("paginatedLocationSummaryListResults", "results")
      ]


-- | 
data PaginatedMachineSummaryList = PaginatedMachineSummaryList
  { paginatedMachineSummaryListCount :: Int -- ^ The total number of resources available from this API.
  , paginatedMachineSummaryListNext :: Maybe Text -- ^ The URL for the next page in the list, or null if there is no next page.
  , paginatedMachineSummaryListPrevious :: Maybe Text -- ^ The URL for the previous page in the list, or null if there is no previous page.
  , paginatedMachineSummaryListResults :: [MachineSummary] -- ^ A list of API resources on this page.
  } deriving (Show, Eq, Generic)

instance FromJSON PaginatedMachineSummaryList where
  parseJSON = genericParseJSON optionsPaginatedMachineSummaryList
instance ToJSON PaginatedMachineSummaryList where
  toJSON = genericToJSON optionsPaginatedMachineSummaryList

optionsPaginatedMachineSummaryList :: Options
optionsPaginatedMachineSummaryList =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("paginatedMachineSummaryListCount", "count")
      , ("paginatedMachineSummaryListNext", "next")
      , ("paginatedMachineSummaryListPrevious", "previous")
      , ("paginatedMachineSummaryListResults", "results")
      ]


-- | 
data PaginatedMoveBattleStyleSummaryList = PaginatedMoveBattleStyleSummaryList
  { paginatedMoveBattleStyleSummaryListCount :: Int -- ^ The total number of resources available from this API.
  , paginatedMoveBattleStyleSummaryListNext :: Maybe Text -- ^ The URL for the next page in the list, or null if there is no next page.
  , paginatedMoveBattleStyleSummaryListPrevious :: Maybe Text -- ^ The URL for the previous page in the list, or null if there is no previous page.
  , paginatedMoveBattleStyleSummaryListResults :: [MoveBattleStyleSummary] -- ^ A list of API resources on this page.
  } deriving (Show, Eq, Generic)

instance FromJSON PaginatedMoveBattleStyleSummaryList where
  parseJSON = genericParseJSON optionsPaginatedMoveBattleStyleSummaryList
instance ToJSON PaginatedMoveBattleStyleSummaryList where
  toJSON = genericToJSON optionsPaginatedMoveBattleStyleSummaryList

optionsPaginatedMoveBattleStyleSummaryList :: Options
optionsPaginatedMoveBattleStyleSummaryList =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("paginatedMoveBattleStyleSummaryListCount", "count")
      , ("paginatedMoveBattleStyleSummaryListNext", "next")
      , ("paginatedMoveBattleStyleSummaryListPrevious", "previous")
      , ("paginatedMoveBattleStyleSummaryListResults", "results")
      ]


-- | 
data PaginatedMoveDamageClassSummaryList = PaginatedMoveDamageClassSummaryList
  { paginatedMoveDamageClassSummaryListCount :: Int -- ^ The total number of resources available from this API.
  , paginatedMoveDamageClassSummaryListNext :: Maybe Text -- ^ The URL for the next page in the list, or null if there is no next page.
  , paginatedMoveDamageClassSummaryListPrevious :: Maybe Text -- ^ The URL for the previous page in the list, or null if there is no previous page.
  , paginatedMoveDamageClassSummaryListResults :: [MoveDamageClassSummary] -- ^ A list of API resources on this page.
  } deriving (Show, Eq, Generic)

instance FromJSON PaginatedMoveDamageClassSummaryList where
  parseJSON = genericParseJSON optionsPaginatedMoveDamageClassSummaryList
instance ToJSON PaginatedMoveDamageClassSummaryList where
  toJSON = genericToJSON optionsPaginatedMoveDamageClassSummaryList

optionsPaginatedMoveDamageClassSummaryList :: Options
optionsPaginatedMoveDamageClassSummaryList =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("paginatedMoveDamageClassSummaryListCount", "count")
      , ("paginatedMoveDamageClassSummaryListNext", "next")
      , ("paginatedMoveDamageClassSummaryListPrevious", "previous")
      , ("paginatedMoveDamageClassSummaryListResults", "results")
      ]


-- | 
data PaginatedMoveLearnMethodSummaryList = PaginatedMoveLearnMethodSummaryList
  { paginatedMoveLearnMethodSummaryListCount :: Int -- ^ The total number of resources available from this API.
  , paginatedMoveLearnMethodSummaryListNext :: Maybe Text -- ^ The URL for the next page in the list, or null if there is no next page.
  , paginatedMoveLearnMethodSummaryListPrevious :: Maybe Text -- ^ The URL for the previous page in the list, or null if there is no previous page.
  , paginatedMoveLearnMethodSummaryListResults :: [MoveLearnMethodSummary] -- ^ A list of API resources on this page.
  } deriving (Show, Eq, Generic)

instance FromJSON PaginatedMoveLearnMethodSummaryList where
  parseJSON = genericParseJSON optionsPaginatedMoveLearnMethodSummaryList
instance ToJSON PaginatedMoveLearnMethodSummaryList where
  toJSON = genericToJSON optionsPaginatedMoveLearnMethodSummaryList

optionsPaginatedMoveLearnMethodSummaryList :: Options
optionsPaginatedMoveLearnMethodSummaryList =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("paginatedMoveLearnMethodSummaryListCount", "count")
      , ("paginatedMoveLearnMethodSummaryListNext", "next")
      , ("paginatedMoveLearnMethodSummaryListPrevious", "previous")
      , ("paginatedMoveLearnMethodSummaryListResults", "results")
      ]


-- | 
data PaginatedMoveMetaAilmentSummaryList = PaginatedMoveMetaAilmentSummaryList
  { paginatedMoveMetaAilmentSummaryListCount :: Int -- ^ The total number of resources available from this API.
  , paginatedMoveMetaAilmentSummaryListNext :: Maybe Text -- ^ The URL for the next page in the list, or null if there is no next page.
  , paginatedMoveMetaAilmentSummaryListPrevious :: Maybe Text -- ^ The URL for the previous page in the list, or null if there is no previous page.
  , paginatedMoveMetaAilmentSummaryListResults :: [MoveMetaAilmentSummary] -- ^ A list of API resources on this page.
  } deriving (Show, Eq, Generic)

instance FromJSON PaginatedMoveMetaAilmentSummaryList where
  parseJSON = genericParseJSON optionsPaginatedMoveMetaAilmentSummaryList
instance ToJSON PaginatedMoveMetaAilmentSummaryList where
  toJSON = genericToJSON optionsPaginatedMoveMetaAilmentSummaryList

optionsPaginatedMoveMetaAilmentSummaryList :: Options
optionsPaginatedMoveMetaAilmentSummaryList =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("paginatedMoveMetaAilmentSummaryListCount", "count")
      , ("paginatedMoveMetaAilmentSummaryListNext", "next")
      , ("paginatedMoveMetaAilmentSummaryListPrevious", "previous")
      , ("paginatedMoveMetaAilmentSummaryListResults", "results")
      ]


-- | 
data PaginatedMoveMetaCategorySummaryList = PaginatedMoveMetaCategorySummaryList
  { paginatedMoveMetaCategorySummaryListCount :: Int -- ^ The total number of resources available from this API.
  , paginatedMoveMetaCategorySummaryListNext :: Maybe Text -- ^ The URL for the next page in the list, or null if there is no next page.
  , paginatedMoveMetaCategorySummaryListPrevious :: Maybe Text -- ^ The URL for the previous page in the list, or null if there is no previous page.
  , paginatedMoveMetaCategorySummaryListResults :: [MoveMetaCategorySummary] -- ^ A list of API resources on this page.
  } deriving (Show, Eq, Generic)

instance FromJSON PaginatedMoveMetaCategorySummaryList where
  parseJSON = genericParseJSON optionsPaginatedMoveMetaCategorySummaryList
instance ToJSON PaginatedMoveMetaCategorySummaryList where
  toJSON = genericToJSON optionsPaginatedMoveMetaCategorySummaryList

optionsPaginatedMoveMetaCategorySummaryList :: Options
optionsPaginatedMoveMetaCategorySummaryList =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("paginatedMoveMetaCategorySummaryListCount", "count")
      , ("paginatedMoveMetaCategorySummaryListNext", "next")
      , ("paginatedMoveMetaCategorySummaryListPrevious", "previous")
      , ("paginatedMoveMetaCategorySummaryListResults", "results")
      ]


-- | 
data PaginatedMoveSummaryList = PaginatedMoveSummaryList
  { paginatedMoveSummaryListCount :: Int -- ^ The total number of resources available from this API.
  , paginatedMoveSummaryListNext :: Maybe Text -- ^ The URL for the next page in the list, or null if there is no next page.
  , paginatedMoveSummaryListPrevious :: Maybe Text -- ^ The URL for the previous page in the list, or null if there is no previous page.
  , paginatedMoveSummaryListResults :: [MoveSummary] -- ^ A list of API resources on this page.
  } deriving (Show, Eq, Generic)

instance FromJSON PaginatedMoveSummaryList where
  parseJSON = genericParseJSON optionsPaginatedMoveSummaryList
instance ToJSON PaginatedMoveSummaryList where
  toJSON = genericToJSON optionsPaginatedMoveSummaryList

optionsPaginatedMoveSummaryList :: Options
optionsPaginatedMoveSummaryList =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("paginatedMoveSummaryListCount", "count")
      , ("paginatedMoveSummaryListNext", "next")
      , ("paginatedMoveSummaryListPrevious", "previous")
      , ("paginatedMoveSummaryListResults", "results")
      ]


-- | 
data PaginatedMoveTargetSummaryList = PaginatedMoveTargetSummaryList
  { paginatedMoveTargetSummaryListCount :: Int -- ^ The total number of resources available from this API.
  , paginatedMoveTargetSummaryListNext :: Maybe Text -- ^ The URL for the next page in the list, or null if there is no next page.
  , paginatedMoveTargetSummaryListPrevious :: Maybe Text -- ^ The URL for the previous page in the list, or null if there is no previous page.
  , paginatedMoveTargetSummaryListResults :: [MoveTargetSummary] -- ^ A list of API resources on this page.
  } deriving (Show, Eq, Generic)

instance FromJSON PaginatedMoveTargetSummaryList where
  parseJSON = genericParseJSON optionsPaginatedMoveTargetSummaryList
instance ToJSON PaginatedMoveTargetSummaryList where
  toJSON = genericToJSON optionsPaginatedMoveTargetSummaryList

optionsPaginatedMoveTargetSummaryList :: Options
optionsPaginatedMoveTargetSummaryList =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("paginatedMoveTargetSummaryListCount", "count")
      , ("paginatedMoveTargetSummaryListNext", "next")
      , ("paginatedMoveTargetSummaryListPrevious", "previous")
      , ("paginatedMoveTargetSummaryListResults", "results")
      ]


-- | 
data PaginatedNatureSummaryList = PaginatedNatureSummaryList
  { paginatedNatureSummaryListCount :: Int -- ^ The total number of resources available from this API.
  , paginatedNatureSummaryListNext :: Maybe Text -- ^ The URL for the next page in the list, or null if there is no next page.
  , paginatedNatureSummaryListPrevious :: Maybe Text -- ^ The URL for the previous page in the list, or null if there is no previous page.
  , paginatedNatureSummaryListResults :: [NatureSummary] -- ^ A list of API resources on this page.
  } deriving (Show, Eq, Generic)

instance FromJSON PaginatedNatureSummaryList where
  parseJSON = genericParseJSON optionsPaginatedNatureSummaryList
instance ToJSON PaginatedNatureSummaryList where
  toJSON = genericToJSON optionsPaginatedNatureSummaryList

optionsPaginatedNatureSummaryList :: Options
optionsPaginatedNatureSummaryList =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("paginatedNatureSummaryListCount", "count")
      , ("paginatedNatureSummaryListNext", "next")
      , ("paginatedNatureSummaryListPrevious", "previous")
      , ("paginatedNatureSummaryListResults", "results")
      ]


-- | 
data PaginatedPalParkAreaSummaryList = PaginatedPalParkAreaSummaryList
  { paginatedPalParkAreaSummaryListCount :: Int -- ^ The total number of resources available from this API.
  , paginatedPalParkAreaSummaryListNext :: Maybe Text -- ^ The URL for the next page in the list, or null if there is no next page.
  , paginatedPalParkAreaSummaryListPrevious :: Maybe Text -- ^ The URL for the previous page in the list, or null if there is no previous page.
  , paginatedPalParkAreaSummaryListResults :: [PalParkAreaSummary] -- ^ A list of API resources on this page.
  } deriving (Show, Eq, Generic)

instance FromJSON PaginatedPalParkAreaSummaryList where
  parseJSON = genericParseJSON optionsPaginatedPalParkAreaSummaryList
instance ToJSON PaginatedPalParkAreaSummaryList where
  toJSON = genericToJSON optionsPaginatedPalParkAreaSummaryList

optionsPaginatedPalParkAreaSummaryList :: Options
optionsPaginatedPalParkAreaSummaryList =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("paginatedPalParkAreaSummaryListCount", "count")
      , ("paginatedPalParkAreaSummaryListNext", "next")
      , ("paginatedPalParkAreaSummaryListPrevious", "previous")
      , ("paginatedPalParkAreaSummaryListResults", "results")
      ]


-- | 
data PaginatedPokeathlonStatSummaryList = PaginatedPokeathlonStatSummaryList
  { paginatedPokeathlonStatSummaryListCount :: Int -- ^ The total number of resources available from this API.
  , paginatedPokeathlonStatSummaryListNext :: Maybe Text -- ^ The URL for the next page in the list, or null if there is no next page.
  , paginatedPokeathlonStatSummaryListPrevious :: Maybe Text -- ^ The URL for the previous page in the list, or null if there is no previous page.
  , paginatedPokeathlonStatSummaryListResults :: [PokeathlonStatSummary] -- ^ A list of API resources on this page.
  } deriving (Show, Eq, Generic)

instance FromJSON PaginatedPokeathlonStatSummaryList where
  parseJSON = genericParseJSON optionsPaginatedPokeathlonStatSummaryList
instance ToJSON PaginatedPokeathlonStatSummaryList where
  toJSON = genericToJSON optionsPaginatedPokeathlonStatSummaryList

optionsPaginatedPokeathlonStatSummaryList :: Options
optionsPaginatedPokeathlonStatSummaryList =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("paginatedPokeathlonStatSummaryListCount", "count")
      , ("paginatedPokeathlonStatSummaryListNext", "next")
      , ("paginatedPokeathlonStatSummaryListPrevious", "previous")
      , ("paginatedPokeathlonStatSummaryListResults", "results")
      ]


-- | 
data PaginatedPokedexSummaryList = PaginatedPokedexSummaryList
  { paginatedPokedexSummaryListCount :: Int -- ^ The total number of resources available from this API.
  , paginatedPokedexSummaryListNext :: Maybe Text -- ^ The URL for the next page in the list, or null if there is no next page.
  , paginatedPokedexSummaryListPrevious :: Maybe Text -- ^ The URL for the previous page in the list, or null if there is no previous page.
  , paginatedPokedexSummaryListResults :: [PokedexSummary] -- ^ A list of API resources on this page.
  } deriving (Show, Eq, Generic)

instance FromJSON PaginatedPokedexSummaryList where
  parseJSON = genericParseJSON optionsPaginatedPokedexSummaryList
instance ToJSON PaginatedPokedexSummaryList where
  toJSON = genericToJSON optionsPaginatedPokedexSummaryList

optionsPaginatedPokedexSummaryList :: Options
optionsPaginatedPokedexSummaryList =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("paginatedPokedexSummaryListCount", "count")
      , ("paginatedPokedexSummaryListNext", "next")
      , ("paginatedPokedexSummaryListPrevious", "previous")
      , ("paginatedPokedexSummaryListResults", "results")
      ]


-- | 
data PaginatedPokemonColorSummaryList = PaginatedPokemonColorSummaryList
  { paginatedPokemonColorSummaryListCount :: Int -- ^ The total number of resources available from this API.
  , paginatedPokemonColorSummaryListNext :: Maybe Text -- ^ The URL for the next page in the list, or null if there is no next page.
  , paginatedPokemonColorSummaryListPrevious :: Maybe Text -- ^ The URL for the previous page in the list, or null if there is no previous page.
  , paginatedPokemonColorSummaryListResults :: [PokemonColorSummary] -- ^ A list of API resources on this page.
  } deriving (Show, Eq, Generic)

instance FromJSON PaginatedPokemonColorSummaryList where
  parseJSON = genericParseJSON optionsPaginatedPokemonColorSummaryList
instance ToJSON PaginatedPokemonColorSummaryList where
  toJSON = genericToJSON optionsPaginatedPokemonColorSummaryList

optionsPaginatedPokemonColorSummaryList :: Options
optionsPaginatedPokemonColorSummaryList =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("paginatedPokemonColorSummaryListCount", "count")
      , ("paginatedPokemonColorSummaryListNext", "next")
      , ("paginatedPokemonColorSummaryListPrevious", "previous")
      , ("paginatedPokemonColorSummaryListResults", "results")
      ]


-- | 
data PaginatedPokemonFormSummaryList = PaginatedPokemonFormSummaryList
  { paginatedPokemonFormSummaryListCount :: Int -- ^ The total number of resources available from this API.
  , paginatedPokemonFormSummaryListNext :: Maybe Text -- ^ The URL for the next page in the list, or null if there is no next page.
  , paginatedPokemonFormSummaryListPrevious :: Maybe Text -- ^ The URL for the previous page in the list, or null if there is no previous page.
  , paginatedPokemonFormSummaryListResults :: [PokemonFormSummary] -- ^ A list of API resources on this page.
  } deriving (Show, Eq, Generic)

instance FromJSON PaginatedPokemonFormSummaryList where
  parseJSON = genericParseJSON optionsPaginatedPokemonFormSummaryList
instance ToJSON PaginatedPokemonFormSummaryList where
  toJSON = genericToJSON optionsPaginatedPokemonFormSummaryList

optionsPaginatedPokemonFormSummaryList :: Options
optionsPaginatedPokemonFormSummaryList =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("paginatedPokemonFormSummaryListCount", "count")
      , ("paginatedPokemonFormSummaryListNext", "next")
      , ("paginatedPokemonFormSummaryListPrevious", "previous")
      , ("paginatedPokemonFormSummaryListResults", "results")
      ]


-- | 
data PaginatedPokemonHabitatSummaryList = PaginatedPokemonHabitatSummaryList
  { paginatedPokemonHabitatSummaryListCount :: Int -- ^ The total number of resources available from this API.
  , paginatedPokemonHabitatSummaryListNext :: Maybe Text -- ^ The URL for the next page in the list, or null if there is no next page.
  , paginatedPokemonHabitatSummaryListPrevious :: Maybe Text -- ^ The URL for the previous page in the list, or null if there is no previous page.
  , paginatedPokemonHabitatSummaryListResults :: [PokemonHabitatSummary] -- ^ A list of API resources on this page.
  } deriving (Show, Eq, Generic)

instance FromJSON PaginatedPokemonHabitatSummaryList where
  parseJSON = genericParseJSON optionsPaginatedPokemonHabitatSummaryList
instance ToJSON PaginatedPokemonHabitatSummaryList where
  toJSON = genericToJSON optionsPaginatedPokemonHabitatSummaryList

optionsPaginatedPokemonHabitatSummaryList :: Options
optionsPaginatedPokemonHabitatSummaryList =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("paginatedPokemonHabitatSummaryListCount", "count")
      , ("paginatedPokemonHabitatSummaryListNext", "next")
      , ("paginatedPokemonHabitatSummaryListPrevious", "previous")
      , ("paginatedPokemonHabitatSummaryListResults", "results")
      ]


-- | 
data PaginatedPokemonShapeSummaryList = PaginatedPokemonShapeSummaryList
  { paginatedPokemonShapeSummaryListCount :: Int -- ^ The total number of resources available from this API.
  , paginatedPokemonShapeSummaryListNext :: Maybe Text -- ^ The URL for the next page in the list, or null if there is no next page.
  , paginatedPokemonShapeSummaryListPrevious :: Maybe Text -- ^ The URL for the previous page in the list, or null if there is no previous page.
  , paginatedPokemonShapeSummaryListResults :: [PokemonShapeSummary] -- ^ A list of API resources on this page.
  } deriving (Show, Eq, Generic)

instance FromJSON PaginatedPokemonShapeSummaryList where
  parseJSON = genericParseJSON optionsPaginatedPokemonShapeSummaryList
instance ToJSON PaginatedPokemonShapeSummaryList where
  toJSON = genericToJSON optionsPaginatedPokemonShapeSummaryList

optionsPaginatedPokemonShapeSummaryList :: Options
optionsPaginatedPokemonShapeSummaryList =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("paginatedPokemonShapeSummaryListCount", "count")
      , ("paginatedPokemonShapeSummaryListNext", "next")
      , ("paginatedPokemonShapeSummaryListPrevious", "previous")
      , ("paginatedPokemonShapeSummaryListResults", "results")
      ]


-- | 
data PaginatedPokemonSpeciesSummaryList = PaginatedPokemonSpeciesSummaryList
  { paginatedPokemonSpeciesSummaryListCount :: Int -- ^ The total number of resources available from this API.
  , paginatedPokemonSpeciesSummaryListNext :: Maybe Text -- ^ The URL for the next page in the list, or null if there is no next page.
  , paginatedPokemonSpeciesSummaryListPrevious :: Maybe Text -- ^ The URL for the previous page in the list, or null if there is no previous page.
  , paginatedPokemonSpeciesSummaryListResults :: [PokemonSpeciesSummary] -- ^ A list of API resources on this page.
  } deriving (Show, Eq, Generic)

instance FromJSON PaginatedPokemonSpeciesSummaryList where
  parseJSON = genericParseJSON optionsPaginatedPokemonSpeciesSummaryList
instance ToJSON PaginatedPokemonSpeciesSummaryList where
  toJSON = genericToJSON optionsPaginatedPokemonSpeciesSummaryList

optionsPaginatedPokemonSpeciesSummaryList :: Options
optionsPaginatedPokemonSpeciesSummaryList =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("paginatedPokemonSpeciesSummaryListCount", "count")
      , ("paginatedPokemonSpeciesSummaryListNext", "next")
      , ("paginatedPokemonSpeciesSummaryListPrevious", "previous")
      , ("paginatedPokemonSpeciesSummaryListResults", "results")
      ]


-- | 
data PaginatedPokemonSummaryList = PaginatedPokemonSummaryList
  { paginatedPokemonSummaryListCount :: Int -- ^ The total number of resources available from this API.
  , paginatedPokemonSummaryListNext :: Maybe Text -- ^ The URL for the next page in the list, or null if there is no next page.
  , paginatedPokemonSummaryListPrevious :: Maybe Text -- ^ The URL for the previous page in the list, or null if there is no previous page.
  , paginatedPokemonSummaryListResults :: [PokemonSummary] -- ^ A list of API resources on this page.
  } deriving (Show, Eq, Generic)

instance FromJSON PaginatedPokemonSummaryList where
  parseJSON = genericParseJSON optionsPaginatedPokemonSummaryList
instance ToJSON PaginatedPokemonSummaryList where
  toJSON = genericToJSON optionsPaginatedPokemonSummaryList

optionsPaginatedPokemonSummaryList :: Options
optionsPaginatedPokemonSummaryList =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("paginatedPokemonSummaryListCount", "count")
      , ("paginatedPokemonSummaryListNext", "next")
      , ("paginatedPokemonSummaryListPrevious", "previous")
      , ("paginatedPokemonSummaryListResults", "results")
      ]


-- | 
data PaginatedRegionSummaryList = PaginatedRegionSummaryList
  { paginatedRegionSummaryListCount :: Int -- ^ The total number of resources available from this API.
  , paginatedRegionSummaryListNext :: Maybe Text -- ^ The URL for the next page in the list, or null if there is no next page.
  , paginatedRegionSummaryListPrevious :: Maybe Text -- ^ The URL for the previous page in the list, or null if there is no previous page.
  , paginatedRegionSummaryListResults :: [RegionSummary] -- ^ A list of API resources on this page.
  } deriving (Show, Eq, Generic)

instance FromJSON PaginatedRegionSummaryList where
  parseJSON = genericParseJSON optionsPaginatedRegionSummaryList
instance ToJSON PaginatedRegionSummaryList where
  toJSON = genericToJSON optionsPaginatedRegionSummaryList

optionsPaginatedRegionSummaryList :: Options
optionsPaginatedRegionSummaryList =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("paginatedRegionSummaryListCount", "count")
      , ("paginatedRegionSummaryListNext", "next")
      , ("paginatedRegionSummaryListPrevious", "previous")
      , ("paginatedRegionSummaryListResults", "results")
      ]


-- | 
data PaginatedStatSummaryList = PaginatedStatSummaryList
  { paginatedStatSummaryListCount :: Int -- ^ The total number of resources available from this API.
  , paginatedStatSummaryListNext :: Maybe Text -- ^ The URL for the next page in the list, or null if there is no next page.
  , paginatedStatSummaryListPrevious :: Maybe Text -- ^ The URL for the previous page in the list, or null if there is no previous page.
  , paginatedStatSummaryListResults :: [StatSummary] -- ^ A list of API resources on this page.
  } deriving (Show, Eq, Generic)

instance FromJSON PaginatedStatSummaryList where
  parseJSON = genericParseJSON optionsPaginatedStatSummaryList
instance ToJSON PaginatedStatSummaryList where
  toJSON = genericToJSON optionsPaginatedStatSummaryList

optionsPaginatedStatSummaryList :: Options
optionsPaginatedStatSummaryList =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("paginatedStatSummaryListCount", "count")
      , ("paginatedStatSummaryListNext", "next")
      , ("paginatedStatSummaryListPrevious", "previous")
      , ("paginatedStatSummaryListResults", "results")
      ]


-- | 
data PaginatedSuperContestEffectSummaryList = PaginatedSuperContestEffectSummaryList
  { paginatedSuperContestEffectSummaryListCount :: Int -- ^ The total number of resources available from this API.
  , paginatedSuperContestEffectSummaryListNext :: Maybe Text -- ^ The URL for the next page in the list, or null if there is no next page.
  , paginatedSuperContestEffectSummaryListPrevious :: Maybe Text -- ^ The URL for the previous page in the list, or null if there is no previous page.
  , paginatedSuperContestEffectSummaryListResults :: [SuperContestEffectSummary] -- ^ A list of API resources on this page.
  } deriving (Show, Eq, Generic)

instance FromJSON PaginatedSuperContestEffectSummaryList where
  parseJSON = genericParseJSON optionsPaginatedSuperContestEffectSummaryList
instance ToJSON PaginatedSuperContestEffectSummaryList where
  toJSON = genericToJSON optionsPaginatedSuperContestEffectSummaryList

optionsPaginatedSuperContestEffectSummaryList :: Options
optionsPaginatedSuperContestEffectSummaryList =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("paginatedSuperContestEffectSummaryListCount", "count")
      , ("paginatedSuperContestEffectSummaryListNext", "next")
      , ("paginatedSuperContestEffectSummaryListPrevious", "previous")
      , ("paginatedSuperContestEffectSummaryListResults", "results")
      ]


-- | 
data PaginatedTypeSummaryList = PaginatedTypeSummaryList
  { paginatedTypeSummaryListCount :: Int -- ^ The total number of resources available from this API.
  , paginatedTypeSummaryListNext :: Maybe Text -- ^ The URL for the next page in the list, or null if there is no next page.
  , paginatedTypeSummaryListPrevious :: Maybe Text -- ^ The URL for the previous page in the list, or null if there is no previous page.
  , paginatedTypeSummaryListResults :: [TypeSummary] -- ^ A list of API resources on this page.
  } deriving (Show, Eq, Generic)

instance FromJSON PaginatedTypeSummaryList where
  parseJSON = genericParseJSON optionsPaginatedTypeSummaryList
instance ToJSON PaginatedTypeSummaryList where
  toJSON = genericToJSON optionsPaginatedTypeSummaryList

optionsPaginatedTypeSummaryList :: Options
optionsPaginatedTypeSummaryList =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("paginatedTypeSummaryListCount", "count")
      , ("paginatedTypeSummaryListNext", "next")
      , ("paginatedTypeSummaryListPrevious", "previous")
      , ("paginatedTypeSummaryListResults", "results")
      ]


-- | 
data PaginatedVersionGroupSummaryList = PaginatedVersionGroupSummaryList
  { paginatedVersionGroupSummaryListCount :: Int -- ^ The total number of resources available from this API.
  , paginatedVersionGroupSummaryListNext :: Maybe Text -- ^ The URL for the next page in the list, or null if there is no next page.
  , paginatedVersionGroupSummaryListPrevious :: Maybe Text -- ^ The URL for the previous page in the list, or null if there is no previous page.
  , paginatedVersionGroupSummaryListResults :: [VersionGroupSummary] -- ^ A list of API resources on this page.
  } deriving (Show, Eq, Generic)

instance FromJSON PaginatedVersionGroupSummaryList where
  parseJSON = genericParseJSON optionsPaginatedVersionGroupSummaryList
instance ToJSON PaginatedVersionGroupSummaryList where
  toJSON = genericToJSON optionsPaginatedVersionGroupSummaryList

optionsPaginatedVersionGroupSummaryList :: Options
optionsPaginatedVersionGroupSummaryList =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("paginatedVersionGroupSummaryListCount", "count")
      , ("paginatedVersionGroupSummaryListNext", "next")
      , ("paginatedVersionGroupSummaryListPrevious", "previous")
      , ("paginatedVersionGroupSummaryListResults", "results")
      ]


-- | 
data PaginatedVersionSummaryList = PaginatedVersionSummaryList
  { paginatedVersionSummaryListCount :: Int -- ^ The total number of resources available from this API.
  , paginatedVersionSummaryListNext :: Maybe Text -- ^ The URL for the next page in the list, or null if there is no next page.
  , paginatedVersionSummaryListPrevious :: Maybe Text -- ^ The URL for the previous page in the list, or null if there is no previous page.
  , paginatedVersionSummaryListResults :: [VersionSummary] -- ^ A list of API resources on this page.
  } deriving (Show, Eq, Generic)

instance FromJSON PaginatedVersionSummaryList where
  parseJSON = genericParseJSON optionsPaginatedVersionSummaryList
instance ToJSON PaginatedVersionSummaryList where
  toJSON = genericToJSON optionsPaginatedVersionSummaryList

optionsPaginatedVersionSummaryList :: Options
optionsPaginatedVersionSummaryList =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("paginatedVersionSummaryListCount", "count")
      , ("paginatedVersionSummaryListNext", "next")
      , ("paginatedVersionSummaryListPrevious", "previous")
      , ("paginatedVersionSummaryListResults", "results")
      ]


-- | 
data PalParkAreaDetail = PalParkAreaDetail
  { palParkAreaDetailId :: Int -- ^ The identifier for this resource.
  , palParkAreaDetailName :: Text -- ^ The name for this resource.
  , palParkAreaDetailNames :: [PalParkAreaName] -- ^ The name of this resource listed in different languages.
  , palParkAreaDetailPokemonUnderscoreencounters :: [PalParkEncounter] -- ^ A list of Pokémon encountered in thi pal park area along with details.
  } deriving (Show, Eq, Generic)

instance FromJSON PalParkAreaDetail where
  parseJSON = genericParseJSON optionsPalParkAreaDetail
instance ToJSON PalParkAreaDetail where
  toJSON = genericToJSON optionsPalParkAreaDetail

optionsPalParkAreaDetail :: Options
optionsPalParkAreaDetail =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("palParkAreaDetailId", "id")
      , ("palParkAreaDetailName", "name")
      , ("palParkAreaDetailNames", "names")
      , ("palParkAreaDetailPokemonUnderscoreencounters", "pokemon_encounters")
      ]


-- | 
data PalParkAreaName = PalParkAreaName
  { palParkAreaNameName :: Text -- ^ The localized name for an API resource in a specific language.
  , palParkAreaNameLanguage :: LanguageSummary -- ^ The language this name is in.
  } deriving (Show, Eq, Generic)

instance FromJSON PalParkAreaName where
  parseJSON = genericParseJSON optionsPalParkAreaName
instance ToJSON PalParkAreaName where
  toJSON = genericToJSON optionsPalParkAreaName

optionsPalParkAreaName :: Options
optionsPalParkAreaName =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("palParkAreaNameName", "name")
      , ("palParkAreaNameLanguage", "language")
      ]


-- | 
data PalParkAreaSummary = PalParkAreaSummary
  { palParkAreaSummaryName :: Text -- ^ The name of the referenced resource.
  , palParkAreaSummaryUrl :: Text -- ^ The URL of the referenced resource.
  } deriving (Show, Eq, Generic)

instance FromJSON PalParkAreaSummary where
  parseJSON = genericParseJSON optionsPalParkAreaSummary
instance ToJSON PalParkAreaSummary where
  toJSON = genericToJSON optionsPalParkAreaSummary

optionsPalParkAreaSummary :: Options
optionsPalParkAreaSummary =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("palParkAreaSummaryName", "name")
      , ("palParkAreaSummaryUrl", "url")
      ]


-- | 
data PalParkEncounter = PalParkEncounter
  { palParkEncounterBaseUnderscorescore :: Maybe Int -- ^ The base score given to the player when this Pokémon is caught during a pal park run.
  , palParkEncounterRate :: Int -- ^ The base rate for encountering this Pokémon in this pal park area.
  , palParkEncounterPokemonUnderscorespecies :: PokemonSpeciesSummary -- ^ The Pokémon species being encountered.
  } deriving (Show, Eq, Generic)

instance FromJSON PalParkEncounter where
  parseJSON = genericParseJSON optionsPalParkEncounter
instance ToJSON PalParkEncounter where
  toJSON = genericToJSON optionsPalParkEncounter

optionsPalParkEncounter :: Options
optionsPalParkEncounter =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("palParkEncounterBaseUnderscorescore", "base_score")
      , ("palParkEncounterRate", "rate")
      , ("palParkEncounterPokemonUnderscorespecies", "pokemon_species")
      ]


-- | 
data PokeapiMetaResponse = PokeapiMetaResponse
  { pokeapiMetaResponseDeployUnderscoredate :: Text -- ^ The deployment time as a Unix timestamp string.
  , pokeapiMetaResponseHash :: Text -- ^ The source commit hash used for this deployment.
  , pokeapiMetaResponseTag :: Text -- ^ The deployment tag, or null if the deployment has no tag.
  } deriving (Show, Eq, Generic)

instance FromJSON PokeapiMetaResponse where
  parseJSON = genericParseJSON optionsPokeapiMetaResponse
instance ToJSON PokeapiMetaResponse where
  toJSON = genericToJSON optionsPokeapiMetaResponse

optionsPokeapiMetaResponse :: Options
optionsPokeapiMetaResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokeapiMetaResponseDeployUnderscoredate", "deploy_date")
      , ("pokeapiMetaResponseHash", "hash")
      , ("pokeapiMetaResponseTag", "tag")
      ]


-- | 
data PokeathlonStatAffectingNature = PokeathlonStatAffectingNature
  { pokeathlonStatAffectingNatureMaxUnderscorechange :: Int -- ^ The maximum amount of change to the referenced Pokéathlon stat.
  , pokeathlonStatAffectingNatureNature :: NatureSummary -- ^ The nature causing the change.
  } deriving (Show, Eq, Generic)

instance FromJSON PokeathlonStatAffectingNature where
  parseJSON = genericParseJSON optionsPokeathlonStatAffectingNature
instance ToJSON PokeathlonStatAffectingNature where
  toJSON = genericToJSON optionsPokeathlonStatAffectingNature

optionsPokeathlonStatAffectingNature :: Options
optionsPokeathlonStatAffectingNature =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokeathlonStatAffectingNatureMaxUnderscorechange", "max_change")
      , ("pokeathlonStatAffectingNatureNature", "nature")
      ]


-- | 
data PokeathlonStatAffectingNatures = PokeathlonStatAffectingNatures
  { pokeathlonStatAffectingNaturesIncrease :: [PokeathlonStatAffectingNature] -- ^ A list of natures and how they change the referenced Pokéathlon stat.
  , pokeathlonStatAffectingNaturesDecrease :: [PokeathlonStatAffectingNature] -- ^ A list of natures and how they change the referenced Pokéathlon stat.
  } deriving (Show, Eq, Generic)

instance FromJSON PokeathlonStatAffectingNatures where
  parseJSON = genericParseJSON optionsPokeathlonStatAffectingNatures
instance ToJSON PokeathlonStatAffectingNatures where
  toJSON = genericToJSON optionsPokeathlonStatAffectingNatures

optionsPokeathlonStatAffectingNatures :: Options
optionsPokeathlonStatAffectingNatures =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokeathlonStatAffectingNaturesIncrease", "increase")
      , ("pokeathlonStatAffectingNaturesDecrease", "decrease")
      ]


-- | 
data PokeathlonStatDetail = PokeathlonStatDetail
  { pokeathlonStatDetailId :: Int -- ^ The identifier for this resource.
  , pokeathlonStatDetailName :: Text -- ^ The name for this resource.
  , pokeathlonStatDetailAffectingUnderscorenatures :: PokeathlonStatAffectingNatures -- ^ A detail of natures which affect this Pokéathlon stat positively or negatively.
  , pokeathlonStatDetailNames :: [PokeathlonStatName] -- ^ The name of this resource listed in different languages.
  } deriving (Show, Eq, Generic)

instance FromJSON PokeathlonStatDetail where
  parseJSON = genericParseJSON optionsPokeathlonStatDetail
instance ToJSON PokeathlonStatDetail where
  toJSON = genericToJSON optionsPokeathlonStatDetail

optionsPokeathlonStatDetail :: Options
optionsPokeathlonStatDetail =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokeathlonStatDetailId", "id")
      , ("pokeathlonStatDetailName", "name")
      , ("pokeathlonStatDetailAffectingUnderscorenatures", "affecting_natures")
      , ("pokeathlonStatDetailNames", "names")
      ]


-- | 
data PokeathlonStatName = PokeathlonStatName
  { pokeathlonStatNameName :: Text -- ^ The localized name for an API resource in a specific language.
  , pokeathlonStatNameLanguage :: LanguageSummary -- ^ The language this name is in.
  } deriving (Show, Eq, Generic)

instance FromJSON PokeathlonStatName where
  parseJSON = genericParseJSON optionsPokeathlonStatName
instance ToJSON PokeathlonStatName where
  toJSON = genericToJSON optionsPokeathlonStatName

optionsPokeathlonStatName :: Options
optionsPokeathlonStatName =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokeathlonStatNameName", "name")
      , ("pokeathlonStatNameLanguage", "language")
      ]


-- | 
data PokeathlonStatSummary = PokeathlonStatSummary
  { pokeathlonStatSummaryName :: Text -- ^ The name of the referenced resource.
  , pokeathlonStatSummaryUrl :: Text -- ^ The URL of the referenced resource.
  } deriving (Show, Eq, Generic)

instance FromJSON PokeathlonStatSummary where
  parseJSON = genericParseJSON optionsPokeathlonStatSummary
instance ToJSON PokeathlonStatSummary where
  toJSON = genericToJSON optionsPokeathlonStatSummary

optionsPokeathlonStatSummary :: Options
optionsPokeathlonStatSummary =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokeathlonStatSummaryName", "name")
      , ("pokeathlonStatSummaryUrl", "url")
      ]


-- | 
data PokedexDescription = PokedexDescription
  { pokedexDescriptionDescription :: Maybe Text -- ^ The localized description for an API resource in a specific language.
  , pokedexDescriptionLanguage :: LanguageSummary -- ^ The language this name is in.
  } deriving (Show, Eq, Generic)

instance FromJSON PokedexDescription where
  parseJSON = genericParseJSON optionsPokedexDescription
instance ToJSON PokedexDescription where
  toJSON = genericToJSON optionsPokedexDescription

optionsPokedexDescription :: Options
optionsPokedexDescription =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokedexDescriptionDescription", "description")
      , ("pokedexDescriptionLanguage", "language")
      ]


-- | 
data PokedexDetail = PokedexDetail
  { pokedexDetailId :: Int -- ^ The identifier for this resource.
  , pokedexDetailName :: Text -- ^ The name for this resource.
  , pokedexDetailIsUnderscoremainUnderscoreseries :: Maybe Bool -- ^ Whether or not this Pokédex originated in the main series of the video games.
  , pokedexDetailDescriptions :: [PokedexDescription] -- ^ The description of this resource listed in different languages.
  , pokedexDetailNames :: [PokedexName] -- ^ The name of this resource listed in different languages.
  , pokedexDetailPokemonUnderscoreentries :: [PokemonDexNumber] -- ^ A list of Pokémon catalogued in this Pokédex and their indexes.
  , pokedexDetailRegion :: RegionSummary -- ^ The region this Pokédex catalogues Pokémon for.
  , pokedexDetailVersionUnderscoregroups :: [VersionGroupSummary] -- ^ A list of version groups this Pokédex is relevant to.
  } deriving (Show, Eq, Generic)

instance FromJSON PokedexDetail where
  parseJSON = genericParseJSON optionsPokedexDetail
instance ToJSON PokedexDetail where
  toJSON = genericToJSON optionsPokedexDetail

optionsPokedexDetail :: Options
optionsPokedexDetail =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokedexDetailId", "id")
      , ("pokedexDetailName", "name")
      , ("pokedexDetailIsUnderscoremainUnderscoreseries", "is_main_series")
      , ("pokedexDetailDescriptions", "descriptions")
      , ("pokedexDetailNames", "names")
      , ("pokedexDetailPokemonUnderscoreentries", "pokemon_entries")
      , ("pokedexDetailRegion", "region")
      , ("pokedexDetailVersionUnderscoregroups", "version_groups")
      ]


-- | 
data PokedexName = PokedexName
  { pokedexNameName :: Text -- ^ The localized name for an API resource in a specific language.
  , pokedexNameLanguage :: LanguageSummary -- ^ The language this name is in.
  } deriving (Show, Eq, Generic)

instance FromJSON PokedexName where
  parseJSON = genericParseJSON optionsPokedexName
instance ToJSON PokedexName where
  toJSON = genericToJSON optionsPokedexName

optionsPokedexName :: Options
optionsPokedexName =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokedexNameName", "name")
      , ("pokedexNameLanguage", "language")
      ]


-- | 
data PokedexSummary = PokedexSummary
  { pokedexSummaryName :: Text -- ^ The name of the referenced resource.
  , pokedexSummaryUrl :: Text -- ^ The URL of the referenced resource.
  } deriving (Show, Eq, Generic)

instance FromJSON PokedexSummary where
  parseJSON = genericParseJSON optionsPokedexSummary
instance ToJSON PokedexSummary where
  toJSON = genericToJSON optionsPokedexSummary

optionsPokedexSummary :: Options
optionsPokedexSummary =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokedexSummaryName", "name")
      , ("pokedexSummaryUrl", "url")
      ]


-- | 
data PokemonAbility = PokemonAbility
  { pokemonAbilityIsUnderscorehidden :: Maybe Bool -- ^ Whether or not this is a hidden ability.
  , pokemonAbilitySlot :: Int -- ^ The slot this ability occupies in this Pokémon species.
  , pokemonAbilityAbility :: AbilitySummary -- ^ The ability the Pokémon may have.
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonAbility where
  parseJSON = genericParseJSON optionsPokemonAbility
instance ToJSON PokemonAbility where
  toJSON = genericToJSON optionsPokemonAbility

optionsPokemonAbility :: Options
optionsPokemonAbility =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonAbilityIsUnderscorehidden", "is_hidden")
      , ("pokemonAbilitySlot", "slot")
      , ("pokemonAbilityAbility", "ability")
      ]


-- | 
data PokemonAbilityPast = PokemonAbilityPast
  { pokemonAbilityPastIsUnderscorehidden :: Maybe Bool -- ^ Whether or not this is a hidden ability.
  , pokemonAbilityPastSlot :: Int -- ^ The slot this ability occupies in this Pokémon species.
  , pokemonAbilityPastAbility :: AbilitySummary -- ^ The ability the Pokémon may have.
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonAbilityPast where
  parseJSON = genericParseJSON optionsPokemonAbilityPast
instance ToJSON PokemonAbilityPast where
  toJSON = genericToJSON optionsPokemonAbilityPast

optionsPokemonAbilityPast :: Options
optionsPokemonAbilityPast =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonAbilityPastIsUnderscorehidden", "is_hidden")
      , ("pokemonAbilityPastSlot", "slot")
      , ("pokemonAbilityPastAbility", "ability")
      ]


-- | 
data PokemonColorDetail = PokemonColorDetail
  { pokemonColorDetailId :: Int -- ^ The identifier for this resource.
  , pokemonColorDetailName :: Text -- ^ The name for this resource.
  , pokemonColorDetailNames :: [PokemonColorName] -- ^ The name of this resource listed in different languages.
  , pokemonColorDetailPokemonUnderscorespecies :: [PokemonSpeciesSummary] -- ^ A list of the Pokémon species that have this color.
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonColorDetail where
  parseJSON = genericParseJSON optionsPokemonColorDetail
instance ToJSON PokemonColorDetail where
  toJSON = genericToJSON optionsPokemonColorDetail

optionsPokemonColorDetail :: Options
optionsPokemonColorDetail =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonColorDetailId", "id")
      , ("pokemonColorDetailName", "name")
      , ("pokemonColorDetailNames", "names")
      , ("pokemonColorDetailPokemonUnderscorespecies", "pokemon_species")
      ]


-- | 
data PokemonColorName = PokemonColorName
  { pokemonColorNameName :: Text -- ^ The localized name for an API resource in a specific language.
  , pokemonColorNameLanguage :: LanguageSummary -- ^ The language this name is in.
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonColorName where
  parseJSON = genericParseJSON optionsPokemonColorName
instance ToJSON PokemonColorName where
  toJSON = genericToJSON optionsPokemonColorName

optionsPokemonColorName :: Options
optionsPokemonColorName =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonColorNameName", "name")
      , ("pokemonColorNameLanguage", "language")
      ]


-- | 
data PokemonColorSummary = PokemonColorSummary
  { pokemonColorSummaryName :: Text -- ^ The name of the referenced resource.
  , pokemonColorSummaryUrl :: Text -- ^ The URL of the referenced resource.
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonColorSummary where
  parseJSON = genericParseJSON optionsPokemonColorSummary
instance ToJSON PokemonColorSummary where
  toJSON = genericToJSON optionsPokemonColorSummary

optionsPokemonColorSummary :: Options
optionsPokemonColorSummary =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonColorSummaryName", "name")
      , ("pokemonColorSummaryUrl", "url")
      ]


-- | 
data PokemonCries = PokemonCries
  { pokemonCriesLatest :: Text -- ^ The latest depiction of this Pokémon's cry.
  , pokemonCriesLegacy :: Text -- ^ The legacy depiction of this Pokémon's cry.
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonCries where
  parseJSON = genericParseJSON optionsPokemonCries
instance ToJSON PokemonCries where
  toJSON = genericToJSON optionsPokemonCries

optionsPokemonCries :: Options
optionsPokemonCries =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonCriesLatest", "latest")
      , ("pokemonCriesLegacy", "legacy")
      ]


-- | 
data PokemonDetail = PokemonDetail
  { pokemonDetailId :: Int -- ^ The identifier for this resource.
  , pokemonDetailName :: Text -- ^ The name for this resource.
  , pokemonDetailBaseUnderscoreexperience :: Maybe Int -- ^ The base experience gained for defeating this Pokémon.
  , pokemonDetailHeight :: Maybe Int -- ^ The height of this Pokémon in decimetres.
  , pokemonDetailIsUnderscoredefault :: Maybe Bool -- ^ Set for exactly one Pokémon used as the default for each species.
  , pokemonDetailOrder :: Maybe Int -- ^ Order for sorting. Almost national order, except families are grouped together.
  , pokemonDetailWeight :: Maybe Int -- ^ The weight of this Pokémon in hectograms.
  , pokemonDetailAbilities :: [PokemonAbility] -- ^ A list of abilities this Pokémon could potentially have.
  , pokemonDetailPastUnderscoreabilities :: [PokemonPastAbility] -- ^ A list of details showing abilities this pokémon had in previous generations
  , pokemonDetailForms :: [PokemonFormSummary] -- ^ A list of forms this Pokémon can take on.
  , pokemonDetailGameUnderscoreindices :: [PokemonGameIndex] -- ^ A list of game indices relevent to Pokémon item by generation.
  , pokemonDetailHeldUnderscoreitems :: [PokemonHeldItemSummary] -- ^ A list of items this Pokémon may be holding when encountered.
  , pokemonDetailLocationUnderscoreareaUnderscoreencounters :: Text -- ^ A link to a list of location areas, as well as encounter details pertaining to specific versions.
  , pokemonDetailMoves :: [PokemonMove] -- ^ A list of moves along with learn methods and level details pertaining to specific version groups.
  , pokemonDetailSpecies :: PokemonSpeciesSummary -- ^ The species this Pokémon belongs to.
  , pokemonDetailSprites :: PokemonSprites -- ^ A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at <a href='https://github.com/PokeAPI/sprites#sprites'>PokeAPI/sprites</a>
  , pokemonDetailCries :: PokemonCries -- ^ A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at <a href='https://github.com/PokeAPI/cries#cries'>PokeAPI/cries</a>
  , pokemonDetailStats :: [PokemonStat] -- ^ A list of base stat values for this Pokémon.
  , pokemonDetailPastUnderscorestats :: [PokemonPastStat] -- ^ A list of details showing stats this pokémon had in previous generations
  , pokemonDetailTypes :: [PokemonType] -- ^ A list of details showing types this Pokémon has.
  , pokemonDetailPastUnderscoretypes :: [PokemonPastType] -- ^ A list of details showing types this pokémon had in previous generations
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonDetail where
  parseJSON = genericParseJSON optionsPokemonDetail
instance ToJSON PokemonDetail where
  toJSON = genericToJSON optionsPokemonDetail

optionsPokemonDetail :: Options
optionsPokemonDetail =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonDetailId", "id")
      , ("pokemonDetailName", "name")
      , ("pokemonDetailBaseUnderscoreexperience", "base_experience")
      , ("pokemonDetailHeight", "height")
      , ("pokemonDetailIsUnderscoredefault", "is_default")
      , ("pokemonDetailOrder", "order")
      , ("pokemonDetailWeight", "weight")
      , ("pokemonDetailAbilities", "abilities")
      , ("pokemonDetailPastUnderscoreabilities", "past_abilities")
      , ("pokemonDetailForms", "forms")
      , ("pokemonDetailGameUnderscoreindices", "game_indices")
      , ("pokemonDetailHeldUnderscoreitems", "held_items")
      , ("pokemonDetailLocationUnderscoreareaUnderscoreencounters", "location_area_encounters")
      , ("pokemonDetailMoves", "moves")
      , ("pokemonDetailSpecies", "species")
      , ("pokemonDetailSprites", "sprites")
      , ("pokemonDetailCries", "cries")
      , ("pokemonDetailStats", "stats")
      , ("pokemonDetailPastUnderscorestats", "past_stats")
      , ("pokemonDetailTypes", "types")
      , ("pokemonDetailPastUnderscoretypes", "past_types")
      ]


-- | 
data PokemonDexEntry = PokemonDexEntry
  { pokemonDexEntryEntryUnderscorenumber :: Int -- ^ The index number within the Pokédex.
  , pokemonDexEntryPokedex :: PokedexSummary -- ^ The Pokédex the referenced Pokémon species can be found in.
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonDexEntry where
  parseJSON = genericParseJSON optionsPokemonDexEntry
instance ToJSON PokemonDexEntry where
  toJSON = genericToJSON optionsPokemonDexEntry

optionsPokemonDexEntry :: Options
optionsPokemonDexEntry =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonDexEntryEntryUnderscorenumber", "entry_number")
      , ("pokemonDexEntryPokedex", "pokedex")
      ]


-- | 
data PokemonDexNumber = PokemonDexNumber
  { pokemonDexNumberEntryUnderscorenumber :: Int -- ^ The index of this Pokémon species entry within the Pokédex.
  , pokemonDexNumberPokemonUnderscorespecies :: PokemonSpeciesSummary -- ^ The Pokémon species being encountered.
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonDexNumber where
  parseJSON = genericParseJSON optionsPokemonDexNumber
instance ToJSON PokemonDexNumber where
  toJSON = genericToJSON optionsPokemonDexNumber

optionsPokemonDexNumber :: Options
optionsPokemonDexNumber =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonDexNumberEntryUnderscorenumber", "entry_number")
      , ("pokemonDexNumberPokemonUnderscorespecies", "pokemon_species")
      ]


-- | 
data PokemonEncounterDetailResponse = PokemonEncounterDetailResponse
  { pokemonEncounterDetailResponseChance :: Int -- ^ Percent chance that this encounter will occur.
  , pokemonEncounterDetailResponseConditionUnderscorevalues :: [EncounterConditionValueSummary] -- ^ A list of condition values that must be in effect for this encounter to occur.
  , pokemonEncounterDetailResponseMaxUnderscorelevel :: Int -- ^ The highest level the Pokémon could be encountered at.
  , pokemonEncounterDetailResponseMethod :: EncounterMethodSummary -- ^ The method by which this encounter happens.
  , pokemonEncounterDetailResponseMinUnderscorelevel :: Int -- ^ The lowest level the Pokémon could be encountered at.
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonEncounterDetailResponse where
  parseJSON = genericParseJSON optionsPokemonEncounterDetailResponse
instance ToJSON PokemonEncounterDetailResponse where
  toJSON = genericToJSON optionsPokemonEncounterDetailResponse

optionsPokemonEncounterDetailResponse :: Options
optionsPokemonEncounterDetailResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonEncounterDetailResponseChance", "chance")
      , ("pokemonEncounterDetailResponseConditionUnderscorevalues", "condition_values")
      , ("pokemonEncounterDetailResponseMaxUnderscorelevel", "max_level")
      , ("pokemonEncounterDetailResponseMethod", "method")
      , ("pokemonEncounterDetailResponseMinUnderscorelevel", "min_level")
      ]


-- | 
data PokemonEncounterResponse = PokemonEncounterResponse
  { pokemonEncounterResponseLocationUnderscorearea :: LocationAreaSummary -- ^ The location area the referenced Pokémon can be encountered in.
  , pokemonEncounterResponseVersionUnderscoredetails :: [PokemonEncounterVersionDetailResponse] -- ^ A list of versions and encounters with the referenced Pokémon that might happen.
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonEncounterResponse where
  parseJSON = genericParseJSON optionsPokemonEncounterResponse
instance ToJSON PokemonEncounterResponse where
  toJSON = genericToJSON optionsPokemonEncounterResponse

optionsPokemonEncounterResponse :: Options
optionsPokemonEncounterResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonEncounterResponseLocationUnderscorearea", "location_area")
      , ("pokemonEncounterResponseVersionUnderscoredetails", "version_details")
      ]


-- | 
data PokemonEncounterVersionDetailResponse = PokemonEncounterVersionDetailResponse
  { pokemonEncounterVersionDetailResponseVersion :: VersionSummary -- ^ The game version this encounter happens in.
  , pokemonEncounterVersionDetailResponseMaxUnderscorechance :: Int -- ^ The total percentage of all encounter potential.
  , pokemonEncounterVersionDetailResponseEncounterUnderscoredetails :: [PokemonEncounterDetailResponse] -- ^ A list of encounters and their specifics.
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonEncounterVersionDetailResponse where
  parseJSON = genericParseJSON optionsPokemonEncounterVersionDetailResponse
instance ToJSON PokemonEncounterVersionDetailResponse where
  toJSON = genericToJSON optionsPokemonEncounterVersionDetailResponse

optionsPokemonEncounterVersionDetailResponse :: Options
optionsPokemonEncounterVersionDetailResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonEncounterVersionDetailResponseVersion", "version")
      , ("pokemonEncounterVersionDetailResponseMaxUnderscorechance", "max_chance")
      , ("pokemonEncounterVersionDetailResponseEncounterUnderscoredetails", "encounter_details")
      ]


-- | 
data PokemonEvolution = PokemonEvolution
  { pokemonEvolutionVersionUnderscoregroup :: VersionGroupSummary -- ^ The version group in which these evolution requirements apply.
  , pokemonEvolutionIsUnderscoredefault :: Maybe Bool -- ^ Whether the evolution is considered as the expected evolution in a main series game. Each unique Pokémon variety of a line capable of evolution should have exactly one 'default' evolution. For example, the Meowth species has three default evolutions as there are three distinct varieties it can evolve into: Persian, Alolan Persian, and Perrserker.
  , pokemonEvolutionItem :: ItemSummary -- ^ The item required to cause evolution this into Pokémon species.
  , pokemonEvolutionTrigger :: EvolutionTriggerSummary -- ^ The type of event that triggers evolution into this Pokémon species.
  , pokemonEvolutionGender :: Maybe Int -- ^ The id of the gender of the evolving Pokémon species must be in order to evolve into this Pokémon species.
  , pokemonEvolutionHeldUnderscoreitem :: ItemSummary -- ^ The item the evolving Pokémon species must be holding during the evolution trigger event to evolve into this Pokémon species.
  , pokemonEvolutionKnownUnderscoremove :: PokemonEvolutionKnownMove -- ^ 
  , pokemonEvolutionKnownUnderscoremoveUnderscoretype :: PokemonEvolutionKnownMove -- ^ 
  , pokemonEvolutionLocation :: LocationSummary -- ^ The location the evolution must be triggered at.
  , pokemonEvolutionMinUnderscorelevel :: Maybe Int -- ^ The minimum required level of the evolving Pokémon species to evolve into this Pokémon species.
  , pokemonEvolutionMinUnderscorehappiness :: Maybe Int -- ^ The minimum required level of happiness the evolving Pokémon species to evolve into this Pokémon species.
  , pokemonEvolutionMinUnderscorebeauty :: Maybe Int -- ^ The minimum required level of beauty the evolving Pokémon species to evolve into this Pokémon species.
  , pokemonEvolutionMinUnderscoreaffection :: Maybe Int -- ^ The minimum required level of affection the evolving Pokémon species to evolve into this Pokémon species.
  , pokemonEvolutionNearUnderscorespecialUnderscorerock :: Maybe Bool -- ^ Whether or not you need to be near a Moss Rock or Icy Rock to evolve into this Pokémon species.
  , pokemonEvolutionNeedsUnderscoremultiplayer :: Maybe Bool -- ^ Whether or not multiplayer link play is needed to evolve into this Pokémon species (e.g. Union Circle).
  , pokemonEvolutionNeedsUnderscoreoverworldUnderscorerain :: Maybe Bool -- ^ Whether or not it must be raining in the overworld to cause evolution this Pokémon species.
  , pokemonEvolutionPartyUnderscorespecies :: PokemonSpeciesSummary -- ^ The Pokémon species that must be in the players party in order for the evolving Pokémon species to evolve into this Pokémon species.
  , pokemonEvolutionPartyUnderscoretype :: TypeSummary -- ^ The player must have a Pokémon of this type in their party during the evolution trigger event in order for the evolving Pokémon species to evolve into this Pokémon species.
  , pokemonEvolutionRelativeUnderscorephysicalUnderscorestats :: Maybe Int -- ^ The required relation between the Pokémon's Attack and Defense stats. 1 means Attack > Defense. 0 means Attack = Defense. -1 means Attack < Defense.
  , pokemonEvolutionTimeUnderscoreofUnderscoreday :: Maybe Text -- ^ The required time of day. Day or night.
  , pokemonEvolutionTradeUnderscorespecies :: PokemonSpeciesSummary -- ^ Pokémon species for which this one must be traded.
  , pokemonEvolutionTurnUnderscoreupsideUnderscoredown :: Maybe Bool -- ^ Whether or not the 3DS needs to be turned upside-down as this Pokémon levels up.
  , pokemonEvolutionRegion :: RegionSummary -- ^ The required region in which this evolution can occur.
  , pokemonEvolutionRequiredUnderscorepokemonUnderscoreform :: PokemonFormSummary -- ^ The Pokémon form required before evolving, or null if unrestricted.
  , pokemonEvolutionEvolvedUnderscorepokemonUnderscoreform :: PokemonFormSummary -- ^ The Pokémon form produced by this evolution, or null if unspecified.
  , pokemonEvolutionUsedUnderscoremove :: MoveSummary -- ^ The move that must be used by the evolving Pokémon species during the evolution trigger event in order to evolve into this Pokémon species.
  , pokemonEvolutionMinUnderscoremoveUnderscorecount :: Maybe Int -- ^ The minimum number of times a move must be used in order to evolve into this Pokémon species.
  , pokemonEvolutionMinUnderscoresteps :: Maybe Int -- ^ The minimum number of steps that must be taken in order to evolve into this Pokémon species.
  , pokemonEvolutionMinUnderscoredamageUnderscoretaken :: Maybe Int -- ^ The minimum amount of damage taken during the evolution trigger event in order to evolve into this Pokémon species.
  , pokemonEvolutionAllowedUnderscorenatures :: [NatureSummary] -- ^ The natures that allow this evolution, or null if unrestricted.
  , pokemonEvolutionConditionUnderscoreexpression :: EvolutionConditionExpression -- ^ An additional evolution condition expressed in reverse Polish notation, or null if none.
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonEvolution where
  parseJSON = genericParseJSON optionsPokemonEvolution
instance ToJSON PokemonEvolution where
  toJSON = genericToJSON optionsPokemonEvolution

optionsPokemonEvolution :: Options
optionsPokemonEvolution =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonEvolutionVersionUnderscoregroup", "version_group")
      , ("pokemonEvolutionIsUnderscoredefault", "is_default")
      , ("pokemonEvolutionItem", "item")
      , ("pokemonEvolutionTrigger", "trigger")
      , ("pokemonEvolutionGender", "gender")
      , ("pokemonEvolutionHeldUnderscoreitem", "held_item")
      , ("pokemonEvolutionKnownUnderscoremove", "known_move")
      , ("pokemonEvolutionKnownUnderscoremoveUnderscoretype", "known_move_type")
      , ("pokemonEvolutionLocation", "location")
      , ("pokemonEvolutionMinUnderscorelevel", "min_level")
      , ("pokemonEvolutionMinUnderscorehappiness", "min_happiness")
      , ("pokemonEvolutionMinUnderscorebeauty", "min_beauty")
      , ("pokemonEvolutionMinUnderscoreaffection", "min_affection")
      , ("pokemonEvolutionNearUnderscorespecialUnderscorerock", "near_special_rock")
      , ("pokemonEvolutionNeedsUnderscoremultiplayer", "needs_multiplayer")
      , ("pokemonEvolutionNeedsUnderscoreoverworldUnderscorerain", "needs_overworld_rain")
      , ("pokemonEvolutionPartyUnderscorespecies", "party_species")
      , ("pokemonEvolutionPartyUnderscoretype", "party_type")
      , ("pokemonEvolutionRelativeUnderscorephysicalUnderscorestats", "relative_physical_stats")
      , ("pokemonEvolutionTimeUnderscoreofUnderscoreday", "time_of_day")
      , ("pokemonEvolutionTradeUnderscorespecies", "trade_species")
      , ("pokemonEvolutionTurnUnderscoreupsideUnderscoredown", "turn_upside_down")
      , ("pokemonEvolutionRegion", "region")
      , ("pokemonEvolutionRequiredUnderscorepokemonUnderscoreform", "required_pokemon_form")
      , ("pokemonEvolutionEvolvedUnderscorepokemonUnderscoreform", "evolved_pokemon_form")
      , ("pokemonEvolutionUsedUnderscoremove", "used_move")
      , ("pokemonEvolutionMinUnderscoremoveUnderscorecount", "min_move_count")
      , ("pokemonEvolutionMinUnderscoresteps", "min_steps")
      , ("pokemonEvolutionMinUnderscoredamageUnderscoretaken", "min_damage_taken")
      , ("pokemonEvolutionAllowedUnderscorenatures", "allowed_natures")
      , ("pokemonEvolutionConditionUnderscoreexpression", "condition_expression")
      ]


-- | 
data PokemonEvolutionKnownMove = PokemonEvolutionKnownMove
  { pokemonEvolutionKnownMoveName :: Text -- ^ 
  , pokemonEvolutionKnownMoveUrl :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonEvolutionKnownMove where
  parseJSON = genericParseJSON optionsPokemonEvolutionKnownMove
instance ToJSON PokemonEvolutionKnownMove where
  toJSON = genericToJSON optionsPokemonEvolutionKnownMove

optionsPokemonEvolutionKnownMove :: Options
optionsPokemonEvolutionKnownMove =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonEvolutionKnownMoveName", "name")
      , ("pokemonEvolutionKnownMoveUrl", "url")
      ]


-- | 
data PokemonFormDetail = PokemonFormDetail
  { pokemonFormDetailId :: Int -- ^ The identifier for this resource.
  , pokemonFormDetailName :: Text -- ^ The name for this resource.
  , pokemonFormDetailOrder :: Maybe Int -- ^ The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name.
  , pokemonFormDetailFormUnderscoreorder :: Maybe Int -- ^ The order in which forms should be sorted within a species' forms.
  , pokemonFormDetailIsUnderscoredefault :: Maybe Bool -- ^ True for exactly one form used as the default for each Pokémon.
  , pokemonFormDetailIsUnderscorebattleUnderscoreonly :: Maybe Bool -- ^ Whether or not this form can only happen during battle.
  , pokemonFormDetailIsUnderscoremega :: Maybe Bool -- ^ Whether or not this form requires mega evolution.
  , pokemonFormDetailFormUnderscorename :: Text -- ^ The name of this form.
  , pokemonFormDetailPokemon :: PokemonSummary -- ^ The Pokémon that can take on this form.
  , pokemonFormDetailSprites :: PokemonFormSprites -- ^ A set of sprites used to depict this Pokémon form in the game.
  , pokemonFormDetailVersionUnderscoregroup :: VersionGroupSummary -- ^ The version group this Pokémon form was introduced in.
  , pokemonFormDetailFormUnderscorenames :: [PokemonFormName] -- ^ The form specific form name of this Pokémon form, or empty if the form does not have a specific name.
  , pokemonFormDetailNames :: [PokemonFormName] -- ^ The form specific full name of this Pokémon form, or empty if the form does not have a specific name.
  , pokemonFormDetailTypes :: [PokemonFormType] -- ^ A list of details showing types this Pokémon form has.
  , pokemonFormDetailTriggerUnderscoreconditions :: [PokemonFormTriggerCondition] -- ^ The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource.
  , pokemonFormDetailFlavorUnderscoretextUnderscoreentries :: [PokemonFormFlavorText] -- ^ The flavor text of this form listed in different languages and versions.
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonFormDetail where
  parseJSON = genericParseJSON optionsPokemonFormDetail
instance ToJSON PokemonFormDetail where
  toJSON = genericToJSON optionsPokemonFormDetail

optionsPokemonFormDetail :: Options
optionsPokemonFormDetail =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonFormDetailId", "id")
      , ("pokemonFormDetailName", "name")
      , ("pokemonFormDetailOrder", "order")
      , ("pokemonFormDetailFormUnderscoreorder", "form_order")
      , ("pokemonFormDetailIsUnderscoredefault", "is_default")
      , ("pokemonFormDetailIsUnderscorebattleUnderscoreonly", "is_battle_only")
      , ("pokemonFormDetailIsUnderscoremega", "is_mega")
      , ("pokemonFormDetailFormUnderscorename", "form_name")
      , ("pokemonFormDetailPokemon", "pokemon")
      , ("pokemonFormDetailSprites", "sprites")
      , ("pokemonFormDetailVersionUnderscoregroup", "version_group")
      , ("pokemonFormDetailFormUnderscorenames", "form_names")
      , ("pokemonFormDetailNames", "names")
      , ("pokemonFormDetailTypes", "types")
      , ("pokemonFormDetailTriggerUnderscoreconditions", "trigger_conditions")
      , ("pokemonFormDetailFlavorUnderscoretextUnderscoreentries", "flavor_text_entries")
      ]


-- | 
data PokemonFormFlavorText = PokemonFormFlavorText
  { pokemonFormFlavorTextFlavorUnderscoretext :: Text -- ^ The localized flavor text for an API resource in a specific language. Note that this text is left unprocessed as it is found in game files. This means that it contains special characters that one might want to replace with their visible decodable version. Please check out this <a href='https://github.com/veekun/pokedex/issues/218#issuecomment-339841781' >issue</a> to find out more. 
  , pokemonFormFlavorTextLanguage :: LanguageSummary -- ^ The language this name is in.
  , pokemonFormFlavorTextVersion :: VersionSummary -- ^ The game version this flavor text is extracted from.
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonFormFlavorText where
  parseJSON = genericParseJSON optionsPokemonFormFlavorText
instance ToJSON PokemonFormFlavorText where
  toJSON = genericToJSON optionsPokemonFormFlavorText

optionsPokemonFormFlavorText :: Options
optionsPokemonFormFlavorText =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonFormFlavorTextFlavorUnderscoretext", "flavor_text")
      , ("pokemonFormFlavorTextLanguage", "language")
      , ("pokemonFormFlavorTextVersion", "version")
      ]


-- | 
data PokemonFormName = PokemonFormName
  { pokemonFormNameName :: Text -- ^ The localized name for an API resource in a specific language.
  , pokemonFormNameLanguage :: LanguageSummary -- ^ The language this name is in.
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonFormName where
  parseJSON = genericParseJSON optionsPokemonFormName
instance ToJSON PokemonFormName where
  toJSON = genericToJSON optionsPokemonFormName

optionsPokemonFormName :: Options
optionsPokemonFormName =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonFormNameName", "name")
      , ("pokemonFormNameLanguage", "language")
      ]


-- | 
data PokemonFormSprites = PokemonFormSprites
  { pokemonFormSpritesFrontUnderscoredefault :: Text -- ^ The default depiction of this Pokémon from the front in battle.
  , pokemonFormSpritesFrontUnderscoreshiny :: Text -- ^ The shiny depiction of this Pokémon from the front in battle.
  , pokemonFormSpritesFrontUnderscorefemale :: Text -- ^ The female depiction of this Pokémon from the front in battle.
  , pokemonFormSpritesFrontUnderscoreshinyUnderscorefemale :: Text -- ^ The shiny female depiction of this Pokémon from the front in battle.
  , pokemonFormSpritesBackUnderscoredefault :: Text -- ^ The default depiction of this Pokémon from the back in battle.
  , pokemonFormSpritesBackUnderscoreshiny :: Text -- ^ The shiny depiction of this Pokémon from the back in battle.
  , pokemonFormSpritesBackUnderscorefemale :: Text -- ^ The female depiction of this Pokémon from the back in battle.
  , pokemonFormSpritesBackUnderscoreshinyUnderscorefemale :: Text -- ^ The shiny female depiction of this Pokémon from the back in battle.
  , pokemonFormSpritesOther :: Maybe PokemonSpritesOther -- ^ Additional sprites grouped by source, such as official artwork, HOME, and Showdown. Available keys vary by resource.
  , pokemonFormSpritesVersions :: Maybe (Map.Map String (Map.Map String Value)) -- ^ Sprites grouped by generation and game. Available keys vary by resource.
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonFormSprites where
  parseJSON = genericParseJSON optionsPokemonFormSprites
instance ToJSON PokemonFormSprites where
  toJSON = genericToJSON optionsPokemonFormSprites

optionsPokemonFormSprites :: Options
optionsPokemonFormSprites =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonFormSpritesFrontUnderscoredefault", "front_default")
      , ("pokemonFormSpritesFrontUnderscoreshiny", "front_shiny")
      , ("pokemonFormSpritesFrontUnderscorefemale", "front_female")
      , ("pokemonFormSpritesFrontUnderscoreshinyUnderscorefemale", "front_shiny_female")
      , ("pokemonFormSpritesBackUnderscoredefault", "back_default")
      , ("pokemonFormSpritesBackUnderscoreshiny", "back_shiny")
      , ("pokemonFormSpritesBackUnderscorefemale", "back_female")
      , ("pokemonFormSpritesBackUnderscoreshinyUnderscorefemale", "back_shiny_female")
      , ("pokemonFormSpritesOther", "other")
      , ("pokemonFormSpritesVersions", "versions")
      ]


-- | 
data PokemonFormSummary = PokemonFormSummary
  { pokemonFormSummaryName :: Text -- ^ The name of the referenced resource.
  , pokemonFormSummaryUrl :: Text -- ^ The URL of the referenced resource.
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonFormSummary where
  parseJSON = genericParseJSON optionsPokemonFormSummary
instance ToJSON PokemonFormSummary where
  toJSON = genericToJSON optionsPokemonFormSummary

optionsPokemonFormSummary :: Options
optionsPokemonFormSummary =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonFormSummaryName", "name")
      , ("pokemonFormSummaryUrl", "url")
      ]


-- | 
data PokemonFormTriggerCondition = PokemonFormTriggerCondition
  { pokemonFormTriggerConditionTrigger :: Text -- ^ The trigger for this form change.
  , pokemonFormTriggerConditionName :: Maybe Text -- ^ The name of the required item, ability, or move. Only present for a resource-based trigger.
  , pokemonFormTriggerConditionUrl :: Maybe Text -- ^ The URL of the required item, ability, or move. Only present for a resource-based trigger.
  , pokemonFormTriggerConditionBaseUnderscoreform :: Maybe PokemonFormSummary -- ^ The required base form. Only present when the trigger specifies one.
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonFormTriggerCondition where
  parseJSON = genericParseJSON optionsPokemonFormTriggerCondition
instance ToJSON PokemonFormTriggerCondition where
  toJSON = genericToJSON optionsPokemonFormTriggerCondition

optionsPokemonFormTriggerCondition :: Options
optionsPokemonFormTriggerCondition =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonFormTriggerConditionTrigger", "trigger")
      , ("pokemonFormTriggerConditionName", "name")
      , ("pokemonFormTriggerConditionUrl", "url")
      , ("pokemonFormTriggerConditionBaseUnderscoreform", "base_form")
      ]


-- | 
data PokemonFormType = PokemonFormType
  { pokemonFormTypeSlot :: Int -- ^ The order the Pokémon's types are listed in.
  , pokemonFormTypeType :: TypeSummary -- ^ The type the referenced Form has.
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonFormType where
  parseJSON = genericParseJSON optionsPokemonFormType
instance ToJSON PokemonFormType where
  toJSON = genericToJSON optionsPokemonFormType

optionsPokemonFormType :: Options
optionsPokemonFormType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonFormTypeSlot", "slot")
      , ("pokemonFormTypeType", "type")
      ]


-- | 
data PokemonGameIndex = PokemonGameIndex
  { pokemonGameIndexGameUnderscoreindex :: Int -- ^ The internal id of an API resource within game data.
  , pokemonGameIndexVersion :: VersionSummary -- ^ The version relevent to this game index.
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonGameIndex where
  parseJSON = genericParseJSON optionsPokemonGameIndex
instance ToJSON PokemonGameIndex where
  toJSON = genericToJSON optionsPokemonGameIndex

optionsPokemonGameIndex :: Options
optionsPokemonGameIndex =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonGameIndexGameUnderscoreindex", "game_index")
      , ("pokemonGameIndexVersion", "version")
      ]


-- | 
data PokemonHabitatDetail = PokemonHabitatDetail
  { pokemonHabitatDetailId :: Int -- ^ The identifier for this resource.
  , pokemonHabitatDetailName :: Text -- ^ The name for this resource.
  , pokemonHabitatDetailNames :: [PokemonHabitatName] -- ^ The name of this resource listed in different languages.
  , pokemonHabitatDetailPokemonUnderscorespecies :: [PokemonSpeciesSummary] -- ^ A list of the Pokémon species that can be found in this habitat.
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonHabitatDetail where
  parseJSON = genericParseJSON optionsPokemonHabitatDetail
instance ToJSON PokemonHabitatDetail where
  toJSON = genericToJSON optionsPokemonHabitatDetail

optionsPokemonHabitatDetail :: Options
optionsPokemonHabitatDetail =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonHabitatDetailId", "id")
      , ("pokemonHabitatDetailName", "name")
      , ("pokemonHabitatDetailNames", "names")
      , ("pokemonHabitatDetailPokemonUnderscorespecies", "pokemon_species")
      ]


-- | 
data PokemonHabitatName = PokemonHabitatName
  { pokemonHabitatNameName :: Text -- ^ The localized name for an API resource in a specific language.
  , pokemonHabitatNameLanguage :: LanguageSummary -- ^ The language this name is in.
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonHabitatName where
  parseJSON = genericParseJSON optionsPokemonHabitatName
instance ToJSON PokemonHabitatName where
  toJSON = genericToJSON optionsPokemonHabitatName

optionsPokemonHabitatName :: Options
optionsPokemonHabitatName =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonHabitatNameName", "name")
      , ("pokemonHabitatNameLanguage", "language")
      ]


-- | 
data PokemonHabitatSummary = PokemonHabitatSummary
  { pokemonHabitatSummaryName :: Text -- ^ The name of the referenced resource.
  , pokemonHabitatSummaryUrl :: Text -- ^ The URL of the referenced resource.
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonHabitatSummary where
  parseJSON = genericParseJSON optionsPokemonHabitatSummary
instance ToJSON PokemonHabitatSummary where
  toJSON = genericToJSON optionsPokemonHabitatSummary

optionsPokemonHabitatSummary :: Options
optionsPokemonHabitatSummary =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonHabitatSummaryName", "name")
      , ("pokemonHabitatSummaryUrl", "url")
      ]


-- | 
data PokemonHeldItem = PokemonHeldItem
  { pokemonHeldItemPokemon :: PokemonSummary -- ^ The Pokémon that holds this item.
  , pokemonHeldItemVersionUnderscoredetails :: [PokemonHeldItemVersion] -- ^ The details for the version that this item is held in by the Pokémon.
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonHeldItem where
  parseJSON = genericParseJSON optionsPokemonHeldItem
instance ToJSON PokemonHeldItem where
  toJSON = genericToJSON optionsPokemonHeldItem

optionsPokemonHeldItem :: Options
optionsPokemonHeldItem =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonHeldItemPokemon", "pokemon")
      , ("pokemonHeldItemVersionUnderscoredetails", "version_details")
      ]


-- | 
data PokemonHeldItemSummary = PokemonHeldItemSummary
  { pokemonHeldItemSummaryItem :: ItemSummary -- ^ The item the referenced Pokémon holds.
  , pokemonHeldItemSummaryVersionUnderscoredetails :: [PokemonHeldItemVersion] -- ^ The details of the different versions in which the item is held.
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonHeldItemSummary where
  parseJSON = genericParseJSON optionsPokemonHeldItemSummary
instance ToJSON PokemonHeldItemSummary where
  toJSON = genericToJSON optionsPokemonHeldItemSummary

optionsPokemonHeldItemSummary :: Options
optionsPokemonHeldItemSummary =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonHeldItemSummaryItem", "item")
      , ("pokemonHeldItemSummaryVersionUnderscoredetails", "version_details")
      ]


-- | 
data PokemonHeldItemVersion = PokemonHeldItemVersion
  { pokemonHeldItemVersionRarity :: Int -- ^ How often the item is held.
  , pokemonHeldItemVersionVersion :: VersionSummary -- ^ The version in which the item is held.
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonHeldItemVersion where
  parseJSON = genericParseJSON optionsPokemonHeldItemVersion
instance ToJSON PokemonHeldItemVersion where
  toJSON = genericToJSON optionsPokemonHeldItemVersion

optionsPokemonHeldItemVersion :: Options
optionsPokemonHeldItemVersion =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonHeldItemVersionRarity", "rarity")
      , ("pokemonHeldItemVersionVersion", "version")
      ]


-- | 
data PokemonMove = PokemonMove
  { pokemonMoveMove :: MoveSummary -- ^ The move the Pokémon can learn.
  , pokemonMoveVersionUnderscoregroupUnderscoredetails :: [PokemonMoveVersionGroup] -- ^ The details of the version in which the Pokémon can learn the move.
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonMove where
  parseJSON = genericParseJSON optionsPokemonMove
instance ToJSON PokemonMove where
  toJSON = genericToJSON optionsPokemonMove

optionsPokemonMove :: Options
optionsPokemonMove =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonMoveMove", "move")
      , ("pokemonMoveVersionUnderscoregroupUnderscoredetails", "version_group_details")
      ]


-- | 
data PokemonMoveVersionGroup = PokemonMoveVersionGroup
  { pokemonMoveVersionGroupLevelUnderscorelearnedUnderscoreat :: Int -- ^ The minimum level to learn the move.
  , pokemonMoveVersionGroupMoveUnderscorelearnUnderscoremethod :: MoveLearnMethodSummary -- ^ The method by which the move is learned.
  , pokemonMoveVersionGroupVersionUnderscoregroup :: VersionGroupSummary -- ^ The version group in which the move is learned.
  , pokemonMoveVersionGroupOrder :: Maybe Int -- ^ Order by which the pokemon will learn the move. A newly learnt move will replace the move with lowest order.
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonMoveVersionGroup where
  parseJSON = genericParseJSON optionsPokemonMoveVersionGroup
instance ToJSON PokemonMoveVersionGroup where
  toJSON = genericToJSON optionsPokemonMoveVersionGroup

optionsPokemonMoveVersionGroup :: Options
optionsPokemonMoveVersionGroup =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonMoveVersionGroupLevelUnderscorelearnedUnderscoreat", "level_learned_at")
      , ("pokemonMoveVersionGroupMoveUnderscorelearnUnderscoremethod", "move_learn_method")
      , ("pokemonMoveVersionGroupVersionUnderscoregroup", "version_group")
      , ("pokemonMoveVersionGroupOrder", "order")
      ]


-- | 
data PokemonPastAbility = PokemonPastAbility
  { pokemonPastAbilityAbilities :: [PokemonAbilityPast] -- ^ The abilities the referenced pokémon had up to and including the listed generation. If null, the slot was previously empty.
  , pokemonPastAbilityGeneration :: GenerationSummary -- ^ The last generation in which the referenced pokémon had the listed abilities.
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonPastAbility where
  parseJSON = genericParseJSON optionsPokemonPastAbility
instance ToJSON PokemonPastAbility where
  toJSON = genericToJSON optionsPokemonPastAbility

optionsPokemonPastAbility :: Options
optionsPokemonPastAbility =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonPastAbilityAbilities", "abilities")
      , ("pokemonPastAbilityGeneration", "generation")
      ]


-- | 
data PokemonPastStat = PokemonPastStat
  { pokemonPastStatGeneration :: GenerationSummary -- ^ The last generation in which the referenced pokémon had the listed stats.
  , pokemonPastStatStats :: [PokemonStat] -- ^ The stat the Pokémon had up to and including the listed generation.
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonPastStat where
  parseJSON = genericParseJSON optionsPokemonPastStat
instance ToJSON PokemonPastStat where
  toJSON = genericToJSON optionsPokemonPastStat

optionsPokemonPastStat :: Options
optionsPokemonPastStat =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonPastStatGeneration", "generation")
      , ("pokemonPastStatStats", "stats")
      ]


-- | 
data PokemonPastType = PokemonPastType
  { pokemonPastTypeGeneration :: GenerationSummary -- ^ The last generation in which the referenced pokémon had the listed types.
  , pokemonPastTypeTypes :: [PokemonType] -- ^ The types the referenced pokémon had up to and including the listed generation.
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonPastType where
  parseJSON = genericParseJSON optionsPokemonPastType
instance ToJSON PokemonPastType where
  toJSON = genericToJSON optionsPokemonPastType

optionsPokemonPastType :: Options
optionsPokemonPastType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonPastTypeGeneration", "generation")
      , ("pokemonPastTypeTypes", "types")
      ]


-- | 
data PokemonShapeAwesomeName = PokemonShapeAwesomeName
  { pokemonShapeAwesomeNameAwesomeUnderscorename :: Text -- ^ The localized \"scientific\" name for an API resource in a specific language.
  , pokemonShapeAwesomeNameLanguage :: LanguageSummary -- ^ The language this \"scientific\" name is in.
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonShapeAwesomeName where
  parseJSON = genericParseJSON optionsPokemonShapeAwesomeName
instance ToJSON PokemonShapeAwesomeName where
  toJSON = genericToJSON optionsPokemonShapeAwesomeName

optionsPokemonShapeAwesomeName :: Options
optionsPokemonShapeAwesomeName =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonShapeAwesomeNameAwesomeUnderscorename", "awesome_name")
      , ("pokemonShapeAwesomeNameLanguage", "language")
      ]


-- | 
data PokemonShapeDetail = PokemonShapeDetail
  { pokemonShapeDetailId :: Int -- ^ The identifier for this resource.
  , pokemonShapeDetailName :: Text -- ^ The name for this resource.
  , pokemonShapeDetailAwesomeUnderscorenames :: [PokemonShapeAwesomeName] -- ^ The \"scientific\" name of this Pokémon shape listed in different languages.
  , pokemonShapeDetailNames :: [PokemonShapeName] -- ^ The name of this resource listed in different languages.
  , pokemonShapeDetailPokemonUnderscorespecies :: [PokemonSpeciesSummary] -- ^ A list of the Pokémon species that have this shape.
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonShapeDetail where
  parseJSON = genericParseJSON optionsPokemonShapeDetail
instance ToJSON PokemonShapeDetail where
  toJSON = genericToJSON optionsPokemonShapeDetail

optionsPokemonShapeDetail :: Options
optionsPokemonShapeDetail =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonShapeDetailId", "id")
      , ("pokemonShapeDetailName", "name")
      , ("pokemonShapeDetailAwesomeUnderscorenames", "awesome_names")
      , ("pokemonShapeDetailNames", "names")
      , ("pokemonShapeDetailPokemonUnderscorespecies", "pokemon_species")
      ]


-- | 
data PokemonShapeName = PokemonShapeName
  { pokemonShapeNameName :: Text -- ^ The localized name for an API resource in a specific language.
  , pokemonShapeNameLanguage :: LanguageSummary -- ^ The language this name is in.
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonShapeName where
  parseJSON = genericParseJSON optionsPokemonShapeName
instance ToJSON PokemonShapeName where
  toJSON = genericToJSON optionsPokemonShapeName

optionsPokemonShapeName :: Options
optionsPokemonShapeName =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonShapeNameName", "name")
      , ("pokemonShapeNameLanguage", "language")
      ]


-- | 
data PokemonShapeSummary = PokemonShapeSummary
  { pokemonShapeSummaryName :: Text -- ^ The name of the referenced resource.
  , pokemonShapeSummaryUrl :: Text -- ^ The URL of the referenced resource.
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonShapeSummary where
  parseJSON = genericParseJSON optionsPokemonShapeSummary
instance ToJSON PokemonShapeSummary where
  toJSON = genericToJSON optionsPokemonShapeSummary

optionsPokemonShapeSummary :: Options
optionsPokemonShapeSummary =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonShapeSummaryName", "name")
      , ("pokemonShapeSummaryUrl", "url")
      ]


-- | 
data PokemonSpeciesDescription = PokemonSpeciesDescription
  { pokemonSpeciesDescriptionDescription :: Maybe Text -- ^ The localized description for an API resource in a specific language.
  , pokemonSpeciesDescriptionLanguage :: LanguageSummary -- ^ The language this name is in.
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonSpeciesDescription where
  parseJSON = genericParseJSON optionsPokemonSpeciesDescription
instance ToJSON PokemonSpeciesDescription where
  toJSON = genericToJSON optionsPokemonSpeciesDescription

optionsPokemonSpeciesDescription :: Options
optionsPokemonSpeciesDescription =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonSpeciesDescriptionDescription", "description")
      , ("pokemonSpeciesDescriptionLanguage", "language")
      ]


-- | 
data PokemonSpeciesDetail = PokemonSpeciesDetail
  { pokemonSpeciesDetailId :: Int -- ^ The identifier for this resource.
  , pokemonSpeciesDetailName :: Text -- ^ The name for this resource.
  , pokemonSpeciesDetailOrder :: Maybe Int -- ^ The order in which species should be sorted. Based on National Dex order, except families are grouped together and sorted by stage.
  , pokemonSpeciesDetailGenderUnderscorerate :: Maybe Int -- ^ The chance of this Pokémon being female, in eighths; or -1 for genderless.
  , pokemonSpeciesDetailCaptureUnderscorerate :: Maybe Int -- ^ The base capture rate; up to 255. The higher the number, the easier the catch.
  , pokemonSpeciesDetailBaseUnderscorehappiness :: Maybe Int -- ^ The happiness when caught by a normal Pokéball; up to 255. The higher the number, the happier the Pokémon.
  , pokemonSpeciesDetailIsUnderscorebaby :: Maybe Bool -- ^ Whether or not this is a baby Pokémon.
  , pokemonSpeciesDetailIsUnderscorelegendary :: Maybe Bool -- ^ Whether or not this is a legendary Pokémon.
  , pokemonSpeciesDetailIsUnderscoremythical :: Maybe Bool -- ^ Whether or not this is a mythical Pokémon.
  , pokemonSpeciesDetailHatchUnderscorecounter :: Maybe Int -- ^ Initial hatch counter: one must walk Y × (hatch_counter + 1) steps before this Pokémon's egg hatches, unless utilizing bonuses like Flame Body's. Y varies per generation. In Generations II, III, and VII, Egg cycles are 256 steps long. In Generation IV, Egg cycles are 255 steps long. In Pokémon Brilliant Diamond and Shining Pearl, Egg cycles are also 255 steps long, but are shorter on special dates. In Generations V and VI, Egg cycles are 257 steps long. In Pokémon Sword and Shield, and in Pokémon Scarlet and Violet, Egg cycles are 128 steps long.
  , pokemonSpeciesDetailHasUnderscoregenderUnderscoredifferences :: Maybe Bool -- ^ Whether or not this Pokémon has visual gender differences.
  , pokemonSpeciesDetailFormsUnderscoreswitchable :: Maybe Bool -- ^ Whether or not this Pokémon has multiple forms and can switch between them.
  , pokemonSpeciesDetailGrowthUnderscorerate :: GrowthRateSummary -- ^ The rate at which this Pokémon species gains levels.
  , pokemonSpeciesDetailPokedexUnderscorenumbers :: [PokemonDexEntry] -- ^ A list of Pokedexes and the indexes reserved within them for this Pokémon species.
  , pokemonSpeciesDetailEggUnderscoregroups :: [EggGroupSummary] -- ^ A list of egg groups this Pokémon species is a member of.
  , pokemonSpeciesDetailColor :: PokemonColorSummary -- ^ The color of this Pokémon for Pokédex search.
  , pokemonSpeciesDetailShape :: PokemonShapeSummary -- ^ The shape of this Pokémon for Pokédex search.
  , pokemonSpeciesDetailEvolvesUnderscorefromUnderscorespecies :: PokemonSpeciesSummary -- ^ The Pokémon species that evolves into this Pokemon_species.
  , pokemonSpeciesDetailEvolutionUnderscorechain :: EvolutionChainSummary -- ^ The evolution chain this Pokémon species is a member of.
  , pokemonSpeciesDetailHabitat :: PokemonHabitatSummary -- ^ The habitat this Pokémon species can be encountered in.
  , pokemonSpeciesDetailGeneration :: GenerationSummary -- ^ The generation this Pokémon species was introduced in.
  , pokemonSpeciesDetailNames :: [PokemonSpeciesName] -- ^ The name of this resource listed in different languages.
  , pokemonSpeciesDetailPalUnderscoreparkUnderscoreencounters :: [PokemonSpeciesPalParkEncounter] -- ^ A list of encounters that can be had with this Pokémon species in pal park.
  , pokemonSpeciesDetailFormUnderscoredescriptions :: [PokemonSpeciesDescription] -- ^ Descriptions of different forms Pokémon take on within the Pokémon species.
  , pokemonSpeciesDetailFlavorUnderscoretextUnderscoreentries :: [PokemonSpeciesFlavorText] -- ^ A list of flavor text entries for this Pokémon species.
  , pokemonSpeciesDetailGenera :: [PokemonSpeciesGenus] -- ^ The genus of this Pokémon species listed in multiple languages.
  , pokemonSpeciesDetailVarieties :: [PokemonSpeciesVariety] -- ^ A list of the Pokémon that exist within this Pokémon species.
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonSpeciesDetail where
  parseJSON = genericParseJSON optionsPokemonSpeciesDetail
instance ToJSON PokemonSpeciesDetail where
  toJSON = genericToJSON optionsPokemonSpeciesDetail

optionsPokemonSpeciesDetail :: Options
optionsPokemonSpeciesDetail =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonSpeciesDetailId", "id")
      , ("pokemonSpeciesDetailName", "name")
      , ("pokemonSpeciesDetailOrder", "order")
      , ("pokemonSpeciesDetailGenderUnderscorerate", "gender_rate")
      , ("pokemonSpeciesDetailCaptureUnderscorerate", "capture_rate")
      , ("pokemonSpeciesDetailBaseUnderscorehappiness", "base_happiness")
      , ("pokemonSpeciesDetailIsUnderscorebaby", "is_baby")
      , ("pokemonSpeciesDetailIsUnderscorelegendary", "is_legendary")
      , ("pokemonSpeciesDetailIsUnderscoremythical", "is_mythical")
      , ("pokemonSpeciesDetailHatchUnderscorecounter", "hatch_counter")
      , ("pokemonSpeciesDetailHasUnderscoregenderUnderscoredifferences", "has_gender_differences")
      , ("pokemonSpeciesDetailFormsUnderscoreswitchable", "forms_switchable")
      , ("pokemonSpeciesDetailGrowthUnderscorerate", "growth_rate")
      , ("pokemonSpeciesDetailPokedexUnderscorenumbers", "pokedex_numbers")
      , ("pokemonSpeciesDetailEggUnderscoregroups", "egg_groups")
      , ("pokemonSpeciesDetailColor", "color")
      , ("pokemonSpeciesDetailShape", "shape")
      , ("pokemonSpeciesDetailEvolvesUnderscorefromUnderscorespecies", "evolves_from_species")
      , ("pokemonSpeciesDetailEvolutionUnderscorechain", "evolution_chain")
      , ("pokemonSpeciesDetailHabitat", "habitat")
      , ("pokemonSpeciesDetailGeneration", "generation")
      , ("pokemonSpeciesDetailNames", "names")
      , ("pokemonSpeciesDetailPalUnderscoreparkUnderscoreencounters", "pal_park_encounters")
      , ("pokemonSpeciesDetailFormUnderscoredescriptions", "form_descriptions")
      , ("pokemonSpeciesDetailFlavorUnderscoretextUnderscoreentries", "flavor_text_entries")
      , ("pokemonSpeciesDetailGenera", "genera")
      , ("pokemonSpeciesDetailVarieties", "varieties")
      ]


-- | 
data PokemonSpeciesFlavorText = PokemonSpeciesFlavorText
  { pokemonSpeciesFlavorTextFlavorUnderscoretext :: Text -- ^ The localized flavor text for an API resource in a specific language. Note that this text is left unprocessed as it is found in game files. This means that it contains special characters that one might want to replace with their visible decodable version. Please check out this <a href='https://github.com/veekun/pokedex/issues/218#issuecomment-339841781' >issue</a> to find out more. 
  , pokemonSpeciesFlavorTextLanguage :: LanguageSummary -- ^ The language this name is in.
  , pokemonSpeciesFlavorTextVersion :: VersionSummary -- ^ The game version this flavor text is extracted from.
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonSpeciesFlavorText where
  parseJSON = genericParseJSON optionsPokemonSpeciesFlavorText
instance ToJSON PokemonSpeciesFlavorText where
  toJSON = genericToJSON optionsPokemonSpeciesFlavorText

optionsPokemonSpeciesFlavorText :: Options
optionsPokemonSpeciesFlavorText =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonSpeciesFlavorTextFlavorUnderscoretext", "flavor_text")
      , ("pokemonSpeciesFlavorTextLanguage", "language")
      , ("pokemonSpeciesFlavorTextVersion", "version")
      ]


-- | 
data PokemonSpeciesGenus = PokemonSpeciesGenus
  { pokemonSpeciesGenusGenus :: Text -- ^ The localized genus for the referenced Pokémon species
  , pokemonSpeciesGenusLanguage :: LanguageSummary -- ^ The language this genus is in.
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonSpeciesGenus where
  parseJSON = genericParseJSON optionsPokemonSpeciesGenus
instance ToJSON PokemonSpeciesGenus where
  toJSON = genericToJSON optionsPokemonSpeciesGenus

optionsPokemonSpeciesGenus :: Options
optionsPokemonSpeciesGenus =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonSpeciesGenusGenus", "genus")
      , ("pokemonSpeciesGenusLanguage", "language")
      ]


-- | 
data PokemonSpeciesName = PokemonSpeciesName
  { pokemonSpeciesNameName :: Text -- ^ The localized name for an API resource in a specific language.
  , pokemonSpeciesNameLanguage :: LanguageSummary -- ^ The language this name is in.
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonSpeciesName where
  parseJSON = genericParseJSON optionsPokemonSpeciesName
instance ToJSON PokemonSpeciesName where
  toJSON = genericToJSON optionsPokemonSpeciesName

optionsPokemonSpeciesName :: Options
optionsPokemonSpeciesName =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonSpeciesNameName", "name")
      , ("pokemonSpeciesNameLanguage", "language")
      ]


-- | 
data PokemonSpeciesPalParkEncounter = PokemonSpeciesPalParkEncounter
  { pokemonSpeciesPalParkEncounterBaseUnderscorescore :: Maybe Int -- ^ The base score given to the player when the referenced Pokémon is caught during a pal park run.
  , pokemonSpeciesPalParkEncounterRate :: Int -- ^ The base rate for encountering the referenced Pokémon in this pal park area.
  , pokemonSpeciesPalParkEncounterArea :: PalParkAreaSummary -- ^ The pal park area where this encounter happens.
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonSpeciesPalParkEncounter where
  parseJSON = genericParseJSON optionsPokemonSpeciesPalParkEncounter
instance ToJSON PokemonSpeciesPalParkEncounter where
  toJSON = genericToJSON optionsPokemonSpeciesPalParkEncounter

optionsPokemonSpeciesPalParkEncounter :: Options
optionsPokemonSpeciesPalParkEncounter =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonSpeciesPalParkEncounterBaseUnderscorescore", "base_score")
      , ("pokemonSpeciesPalParkEncounterRate", "rate")
      , ("pokemonSpeciesPalParkEncounterArea", "area")
      ]


-- | 
data PokemonSpeciesSummary = PokemonSpeciesSummary
  { pokemonSpeciesSummaryName :: Text -- ^ The name of the referenced resource.
  , pokemonSpeciesSummaryUrl :: Text -- ^ The URL of the referenced resource.
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonSpeciesSummary where
  parseJSON = genericParseJSON optionsPokemonSpeciesSummary
instance ToJSON PokemonSpeciesSummary where
  toJSON = genericToJSON optionsPokemonSpeciesSummary

optionsPokemonSpeciesSummary :: Options
optionsPokemonSpeciesSummary =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonSpeciesSummaryName", "name")
      , ("pokemonSpeciesSummaryUrl", "url")
      ]


-- | 
data PokemonSpeciesVariety = PokemonSpeciesVariety
  { pokemonSpeciesVarietyIsUnderscoredefault :: Bool -- ^ Whether this variety is the default variety.
  , pokemonSpeciesVarietyPokemon :: PokemonSummary -- ^ The Pokémon variety.
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonSpeciesVariety where
  parseJSON = genericParseJSON optionsPokemonSpeciesVariety
instance ToJSON PokemonSpeciesVariety where
  toJSON = genericToJSON optionsPokemonSpeciesVariety

optionsPokemonSpeciesVariety :: Options
optionsPokemonSpeciesVariety =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonSpeciesVarietyIsUnderscoredefault", "is_default")
      , ("pokemonSpeciesVarietyPokemon", "pokemon")
      ]


-- | 
data PokemonSprites = PokemonSprites
  { pokemonSpritesFrontUnderscoredefault :: Text -- ^ The default depiction of this Pokémon from the front in battle.
  , pokemonSpritesFrontUnderscoreshiny :: Text -- ^ The shiny depiction of this Pokémon from the front in battle.
  , pokemonSpritesFrontUnderscorefemale :: Text -- ^ The female depiction of this Pokémon from the front in battle.
  , pokemonSpritesFrontUnderscoreshinyUnderscorefemale :: Text -- ^ The shiny female depiction of this Pokémon from the front in battle.
  , pokemonSpritesBackUnderscoredefault :: Text -- ^ The default depiction of this Pokémon from the back in battle.
  , pokemonSpritesBackUnderscoreshiny :: Text -- ^ The shiny depiction of this Pokémon from the back in battle.
  , pokemonSpritesBackUnderscorefemale :: Text -- ^ The female depiction of this Pokémon from the back in battle.
  , pokemonSpritesBackUnderscoreshinyUnderscorefemale :: Text -- ^ The shiny female depiction of this Pokémon from the back in battle.
  , pokemonSpritesOther :: Maybe PokemonSpritesOther -- ^ Additional sprites grouped by source, such as official artwork, HOME, and Showdown. Available keys vary by resource.
  , pokemonSpritesVersions :: Maybe (Map.Map String (Map.Map String Value)) -- ^ Sprites grouped by generation and game. Available keys vary by resource.
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonSprites where
  parseJSON = genericParseJSON optionsPokemonSprites
instance ToJSON PokemonSprites where
  toJSON = genericToJSON optionsPokemonSprites

optionsPokemonSprites :: Options
optionsPokemonSprites =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonSpritesFrontUnderscoredefault", "front_default")
      , ("pokemonSpritesFrontUnderscoreshiny", "front_shiny")
      , ("pokemonSpritesFrontUnderscorefemale", "front_female")
      , ("pokemonSpritesFrontUnderscoreshinyUnderscorefemale", "front_shiny_female")
      , ("pokemonSpritesBackUnderscoredefault", "back_default")
      , ("pokemonSpritesBackUnderscoreshiny", "back_shiny")
      , ("pokemonSpritesBackUnderscorefemale", "back_female")
      , ("pokemonSpritesBackUnderscoreshinyUnderscorefemale", "back_shiny_female")
      , ("pokemonSpritesOther", "other")
      , ("pokemonSpritesVersions", "versions")
      ]


-- | 
data PokemonSpritesOther = PokemonSpritesOther
  { pokemonSpritesOtherDreamUnderscoreworld :: Maybe PokemonSpritesOtherDreamWorld -- ^ Pokémon Dream World artwork URLs.
  , pokemonSpritesOtherHome :: Maybe PokemonSpritesOtherHome -- ^ Pokémon HOME sprite URLs.
  , pokemonSpritesOtherShowdown :: Maybe PokemonSpritesOtherShowdown -- ^ Pokémon Showdown sprite URLs.
  , pokemonSpritesOtherOfficialDashartwork :: Maybe PokemonSpritesOtherOfficialArtwork -- ^ Official Pokémon artwork URLs, including shiny artwork and version-specific variants.
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonSpritesOther where
  parseJSON = genericParseJSON optionsPokemonSpritesOther
instance ToJSON PokemonSpritesOther where
  toJSON = genericToJSON optionsPokemonSpritesOther

optionsPokemonSpritesOther :: Options
optionsPokemonSpritesOther =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonSpritesOtherDreamUnderscoreworld", "dream_world")
      , ("pokemonSpritesOtherHome", "home")
      , ("pokemonSpritesOtherShowdown", "showdown")
      , ("pokemonSpritesOtherOfficialDashartwork", "official-artwork")
      ]


-- | 
data PokemonSpritesOtherDreamWorld = PokemonSpritesOtherDreamWorld
  { pokemonSpritesOtherDreamWorldFrontUnderscoredefault :: Text -- ^ The URL of the default Pokémon Dream World front image, or null if unavailable.
  , pokemonSpritesOtherDreamWorldFrontUnderscorefemale :: Text -- ^ The URL of the female Pokémon Dream World front image, or null if unavailable.
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonSpritesOtherDreamWorld where
  parseJSON = genericParseJSON optionsPokemonSpritesOtherDreamWorld
instance ToJSON PokemonSpritesOtherDreamWorld where
  toJSON = genericToJSON optionsPokemonSpritesOtherDreamWorld

optionsPokemonSpritesOtherDreamWorld :: Options
optionsPokemonSpritesOtherDreamWorld =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonSpritesOtherDreamWorldFrontUnderscoredefault", "front_default")
      , ("pokemonSpritesOtherDreamWorldFrontUnderscorefemale", "front_female")
      ]


-- | 
data PokemonSpritesOtherHome = PokemonSpritesOtherHome
  { pokemonSpritesOtherHomeFrontUnderscoredefault :: Text -- ^ The URL of the default Pokémon HOME front image, or null if unavailable.
  , pokemonSpritesOtherHomeFrontUnderscorefemale :: Text -- ^ The URL of the female Pokémon HOME front image, or null if unavailable.
  , pokemonSpritesOtherHomeFrontUnderscoreshiny :: Text -- ^ The URL of the shiny Pokémon HOME front image, or null if unavailable.
  , pokemonSpritesOtherHomeFrontUnderscoreshinyUnderscorefemale :: Text -- ^ The URL of the shiny female Pokémon HOME front image, or null if unavailable.
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonSpritesOtherHome where
  parseJSON = genericParseJSON optionsPokemonSpritesOtherHome
instance ToJSON PokemonSpritesOtherHome where
  toJSON = genericToJSON optionsPokemonSpritesOtherHome

optionsPokemonSpritesOtherHome :: Options
optionsPokemonSpritesOtherHome =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonSpritesOtherHomeFrontUnderscoredefault", "front_default")
      , ("pokemonSpritesOtherHomeFrontUnderscorefemale", "front_female")
      , ("pokemonSpritesOtherHomeFrontUnderscoreshiny", "front_shiny")
      , ("pokemonSpritesOtherHomeFrontUnderscoreshinyUnderscorefemale", "front_shiny_female")
      ]


-- | 
data PokemonSpritesOtherOfficialArtwork = PokemonSpritesOtherOfficialArtwork
  { pokemonSpritesOtherOfficialArtworkFrontUnderscoredefault :: Text -- ^ The URL of the default front official artwork, or null if unavailable.
  , pokemonSpritesOtherOfficialArtworkFrontUnderscoreshiny :: Text -- ^ The URL of the shiny front official artwork, or null if unavailable.
  , pokemonSpritesOtherOfficialArtworkVersions :: Maybe (Map.Map String (Map.Map String Value)) -- ^ Additional official artwork grouped by version. Available keys vary by resource.
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonSpritesOtherOfficialArtwork where
  parseJSON = genericParseJSON optionsPokemonSpritesOtherOfficialArtwork
instance ToJSON PokemonSpritesOtherOfficialArtwork where
  toJSON = genericToJSON optionsPokemonSpritesOtherOfficialArtwork

optionsPokemonSpritesOtherOfficialArtwork :: Options
optionsPokemonSpritesOtherOfficialArtwork =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonSpritesOtherOfficialArtworkFrontUnderscoredefault", "front_default")
      , ("pokemonSpritesOtherOfficialArtworkFrontUnderscoreshiny", "front_shiny")
      , ("pokemonSpritesOtherOfficialArtworkVersions", "versions")
      ]


-- | 
data PokemonSpritesOtherShowdown = PokemonSpritesOtherShowdown
  { pokemonSpritesOtherShowdownFrontUnderscoredefault :: Text -- ^ The URL of the default Pokémon Showdown front image, or null if unavailable.
  , pokemonSpritesOtherShowdownFrontUnderscorefemale :: Text -- ^ The URL of the female Pokémon Showdown front image, or null if unavailable.
  , pokemonSpritesOtherShowdownFrontUnderscoreshiny :: Text -- ^ The URL of the shiny Pokémon Showdown front image, or null if unavailable.
  , pokemonSpritesOtherShowdownFrontUnderscoreshinyUnderscorefemale :: Text -- ^ The URL of the shiny female Pokémon Showdown front image, or null if unavailable.
  , pokemonSpritesOtherShowdownBackUnderscoredefault :: Text -- ^ The URL of the default Pokémon Showdown back image, or null if unavailable.
  , pokemonSpritesOtherShowdownBackUnderscorefemale :: Text -- ^ The URL of the female Pokémon Showdown back image, or null if unavailable.
  , pokemonSpritesOtherShowdownBackUnderscoreshiny :: Text -- ^ The URL of the shiny Pokémon Showdown back image, or null if unavailable.
  , pokemonSpritesOtherShowdownBackUnderscoreshinyUnderscorefemale :: Text -- ^ The URL of the shiny female Pokémon Showdown back image, or null if unavailable.
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonSpritesOtherShowdown where
  parseJSON = genericParseJSON optionsPokemonSpritesOtherShowdown
instance ToJSON PokemonSpritesOtherShowdown where
  toJSON = genericToJSON optionsPokemonSpritesOtherShowdown

optionsPokemonSpritesOtherShowdown :: Options
optionsPokemonSpritesOtherShowdown =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonSpritesOtherShowdownFrontUnderscoredefault", "front_default")
      , ("pokemonSpritesOtherShowdownFrontUnderscorefemale", "front_female")
      , ("pokemonSpritesOtherShowdownFrontUnderscoreshiny", "front_shiny")
      , ("pokemonSpritesOtherShowdownFrontUnderscoreshinyUnderscorefemale", "front_shiny_female")
      , ("pokemonSpritesOtherShowdownBackUnderscoredefault", "back_default")
      , ("pokemonSpritesOtherShowdownBackUnderscorefemale", "back_female")
      , ("pokemonSpritesOtherShowdownBackUnderscoreshiny", "back_shiny")
      , ("pokemonSpritesOtherShowdownBackUnderscoreshinyUnderscorefemale", "back_shiny_female")
      ]


-- | 
data PokemonStat = PokemonStat
  { pokemonStatBaseUnderscorestat :: Int -- ^ The base value of the stat.
  , pokemonStatEffort :: Int -- ^ The effort points (EV) the Pokémon has in the stat.
  , pokemonStatStat :: StatSummary -- ^ The stat the Pokémon has.
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonStat where
  parseJSON = genericParseJSON optionsPokemonStat
instance ToJSON PokemonStat where
  toJSON = genericToJSON optionsPokemonStat

optionsPokemonStat :: Options
optionsPokemonStat =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonStatBaseUnderscorestat", "base_stat")
      , ("pokemonStatEffort", "effort")
      , ("pokemonStatStat", "stat")
      ]


-- | 
data PokemonSummary = PokemonSummary
  { pokemonSummaryName :: Text -- ^ The name of the referenced resource.
  , pokemonSummaryUrl :: Text -- ^ The URL of the referenced resource.
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonSummary where
  parseJSON = genericParseJSON optionsPokemonSummary
instance ToJSON PokemonSummary where
  toJSON = genericToJSON optionsPokemonSummary

optionsPokemonSummary :: Options
optionsPokemonSummary =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonSummaryName", "name")
      , ("pokemonSummaryUrl", "url")
      ]


-- | 
data PokemonType = PokemonType
  { pokemonTypeSlot :: Int -- ^ The order the Pokémon's types are listed in.
  , pokemonTypeType :: TypeSummary -- ^ The type the referenced Pokémon has.
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonType where
  parseJSON = genericParseJSON optionsPokemonType
instance ToJSON PokemonType where
  toJSON = genericToJSON optionsPokemonType

optionsPokemonType :: Options
optionsPokemonType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonTypeSlot", "slot")
      , ("pokemonTypeType", "type")
      ]


-- | 
data RegionDetail = RegionDetail
  { regionDetailId :: Int -- ^ The identifier for this resource.
  , regionDetailName :: Text -- ^ The name for this resource.
  , regionDetailLocations :: [LocationSummary] -- ^ A list of locations that can be found in this region.
  , regionDetailMainUnderscoregeneration :: GenerationSummary -- ^ The generation this region was introduced in.
  , regionDetailNames :: [RegionName] -- ^ The name of this resource listed in different languages.
  , regionDetailPokedexes :: [PokedexSummary] -- ^ A list of pokédexes that catalogue Pokémon in this region.
  , regionDetailVersionUnderscoregroups :: [VersionGroupSummary] -- ^ A list of version groups where this region can be visited.
  } deriving (Show, Eq, Generic)

instance FromJSON RegionDetail where
  parseJSON = genericParseJSON optionsRegionDetail
instance ToJSON RegionDetail where
  toJSON = genericToJSON optionsRegionDetail

optionsRegionDetail :: Options
optionsRegionDetail =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("regionDetailId", "id")
      , ("regionDetailName", "name")
      , ("regionDetailLocations", "locations")
      , ("regionDetailMainUnderscoregeneration", "main_generation")
      , ("regionDetailNames", "names")
      , ("regionDetailPokedexes", "pokedexes")
      , ("regionDetailVersionUnderscoregroups", "version_groups")
      ]


-- | 
data RegionName = RegionName
  { regionNameName :: Text -- ^ The localized name for an API resource in a specific language.
  , regionNameLanguage :: LanguageSummary -- ^ The language this name is in.
  } deriving (Show, Eq, Generic)

instance FromJSON RegionName where
  parseJSON = genericParseJSON optionsRegionName
instance ToJSON RegionName where
  toJSON = genericToJSON optionsRegionName

optionsRegionName :: Options
optionsRegionName =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("regionNameName", "name")
      , ("regionNameLanguage", "language")
      ]


-- | 
data RegionSummary = RegionSummary
  { regionSummaryName :: Text -- ^ The name of the referenced resource.
  , regionSummaryUrl :: Text -- ^ The URL of the referenced resource.
  } deriving (Show, Eq, Generic)

instance FromJSON RegionSummary where
  parseJSON = genericParseJSON optionsRegionSummary
instance ToJSON RegionSummary where
  toJSON = genericToJSON optionsRegionSummary

optionsRegionSummary :: Options
optionsRegionSummary =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("regionSummaryName", "name")
      , ("regionSummaryUrl", "url")
      ]


-- | 
data StatAffectingMoves = StatAffectingMoves
  { statAffectingMovesIncrease :: [MoveStatChange] -- ^ A list of moves and how they change the referenced stat.
  , statAffectingMovesDecrease :: [MoveStatChange] -- ^ A list of moves and how they change the referenced stat.
  } deriving (Show, Eq, Generic)

instance FromJSON StatAffectingMoves where
  parseJSON = genericParseJSON optionsStatAffectingMoves
instance ToJSON StatAffectingMoves where
  toJSON = genericToJSON optionsStatAffectingMoves

optionsStatAffectingMoves :: Options
optionsStatAffectingMoves =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("statAffectingMovesIncrease", "increase")
      , ("statAffectingMovesDecrease", "decrease")
      ]


-- | 
data StatAffectingNatures = StatAffectingNatures
  { statAffectingNaturesIncrease :: [NatureSummary] -- ^ A list of natures and how they change the referenced stat.
  , statAffectingNaturesDecrease :: [NatureSummary] -- ^ A list of nature sand how they change the referenced stat.
  } deriving (Show, Eq, Generic)

instance FromJSON StatAffectingNatures where
  parseJSON = genericParseJSON optionsStatAffectingNatures
instance ToJSON StatAffectingNatures where
  toJSON = genericToJSON optionsStatAffectingNatures

optionsStatAffectingNatures :: Options
optionsStatAffectingNatures =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("statAffectingNaturesIncrease", "increase")
      , ("statAffectingNaturesDecrease", "decrease")
      ]


-- | 
data StatDetail = StatDetail
  { statDetailId :: Int -- ^ The identifier for this resource.
  , statDetailName :: Text -- ^ The name for this resource.
  , statDetailGameUnderscoreindex :: Int -- ^ ID the games use for this stat.
  , statDetailIsUnderscorebattleUnderscoreonly :: Maybe Bool -- ^ Whether this stat only exists within a battle.
  , statDetailAffectingUnderscoremoves :: StatAffectingMoves -- ^ A detail of moves which affect this stat positively or negatively.
  , statDetailAffectingUnderscorenatures :: StatAffectingNatures -- ^ A detail of natures which affect this stat positively or negatively.
  , statDetailAffectingUnderscoreitems :: [ItemSummary] -- ^ Items that affect this stat, such as vitamins and battle items.
  , statDetailCharacteristics :: [CharacteristicSummary] -- ^ A list of characteristics that are set on a Pokémon when its highest base stat is this stat.
  , statDetailMoveUnderscoredamageUnderscoreclass :: MoveDamageClassSummary -- ^ The class of damage this stat is directly related to.
  , statDetailNames :: [StatName] -- ^ The name of this resource listed in different languages.
  } deriving (Show, Eq, Generic)

instance FromJSON StatDetail where
  parseJSON = genericParseJSON optionsStatDetail
instance ToJSON StatDetail where
  toJSON = genericToJSON optionsStatDetail

optionsStatDetail :: Options
optionsStatDetail =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("statDetailId", "id")
      , ("statDetailName", "name")
      , ("statDetailGameUnderscoreindex", "game_index")
      , ("statDetailIsUnderscorebattleUnderscoreonly", "is_battle_only")
      , ("statDetailAffectingUnderscoremoves", "affecting_moves")
      , ("statDetailAffectingUnderscorenatures", "affecting_natures")
      , ("statDetailAffectingUnderscoreitems", "affecting_items")
      , ("statDetailCharacteristics", "characteristics")
      , ("statDetailMoveUnderscoredamageUnderscoreclass", "move_damage_class")
      , ("statDetailNames", "names")
      ]


-- | 
data StatName = StatName
  { statNameName :: Text -- ^ The localized name for an API resource in a specific language.
  , statNameLanguage :: LanguageSummary -- ^ The language this name is in.
  } deriving (Show, Eq, Generic)

instance FromJSON StatName where
  parseJSON = genericParseJSON optionsStatName
instance ToJSON StatName where
  toJSON = genericToJSON optionsStatName

optionsStatName :: Options
optionsStatName =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("statNameName", "name")
      , ("statNameLanguage", "language")
      ]


-- | 
data StatSummary = StatSummary
  { statSummaryName :: Text -- ^ The name of the referenced resource.
  , statSummaryUrl :: Text -- ^ The URL of the referenced resource.
  } deriving (Show, Eq, Generic)

instance FromJSON StatSummary where
  parseJSON = genericParseJSON optionsStatSummary
instance ToJSON StatSummary where
  toJSON = genericToJSON optionsStatSummary

optionsStatSummary :: Options
optionsStatSummary =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("statSummaryName", "name")
      , ("statSummaryUrl", "url")
      ]


-- | 
data SuperContestEffectDetail = SuperContestEffectDetail
  { superContestEffectDetailId :: Int -- ^ The identifier for this resource.
  , superContestEffectDetailAppeal :: Int -- ^ The level of appeal this super contest effect has.
  , superContestEffectDetailFlavorUnderscoretextUnderscoreentries :: [SuperContestEffectFlavorText] -- ^ The flavor text of this super contest effect listed in different languages.
  , superContestEffectDetailMoves :: [MoveSummary] -- ^ A list of moves that have the effect when used in super contests.
  } deriving (Show, Eq, Generic)

instance FromJSON SuperContestEffectDetail where
  parseJSON = genericParseJSON optionsSuperContestEffectDetail
instance ToJSON SuperContestEffectDetail where
  toJSON = genericToJSON optionsSuperContestEffectDetail

optionsSuperContestEffectDetail :: Options
optionsSuperContestEffectDetail =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("superContestEffectDetailId", "id")
      , ("superContestEffectDetailAppeal", "appeal")
      , ("superContestEffectDetailFlavorUnderscoretextUnderscoreentries", "flavor_text_entries")
      , ("superContestEffectDetailMoves", "moves")
      ]


-- | 
data SuperContestEffectFlavorText = SuperContestEffectFlavorText
  { superContestEffectFlavorTextFlavorUnderscoretext :: Text -- ^ The localized flavor text for an API resource in a specific language.
  , superContestEffectFlavorTextLanguage :: LanguageSummary -- ^ The language this name is in.
  } deriving (Show, Eq, Generic)

instance FromJSON SuperContestEffectFlavorText where
  parseJSON = genericParseJSON optionsSuperContestEffectFlavorText
instance ToJSON SuperContestEffectFlavorText where
  toJSON = genericToJSON optionsSuperContestEffectFlavorText

optionsSuperContestEffectFlavorText :: Options
optionsSuperContestEffectFlavorText =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("superContestEffectFlavorTextFlavorUnderscoretext", "flavor_text")
      , ("superContestEffectFlavorTextLanguage", "language")
      ]


-- | 
data SuperContestEffectSummary = SuperContestEffectSummary
  { superContestEffectSummaryUrl :: Text -- ^ The URL of the referenced resource.
  } deriving (Show, Eq, Generic)

instance FromJSON SuperContestEffectSummary where
  parseJSON = genericParseJSON optionsSuperContestEffectSummary
instance ToJSON SuperContestEffectSummary where
  toJSON = genericToJSON optionsSuperContestEffectSummary

optionsSuperContestEffectSummary :: Options
optionsSuperContestEffectSummary =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("superContestEffectSummaryUrl", "url")
      ]


-- | Serializer for the Type resource
data TypeDetail = TypeDetail
  { typeDetailId :: Int -- ^ The identifier for this resource.
  , typeDetailName :: Text -- ^ The name for this resource.
  , typeDetailDamageUnderscorerelations :: TypeRelationships -- ^ A detail of how effective this type is toward others and vice versa.
  , typeDetailPastUnderscoredamageUnderscorerelations :: [TypePastRelationships] -- ^ A list of details of how effective this type was toward others and vice versa in previous generations
  , typeDetailGameUnderscoreindices :: [TypeGameIndex] -- ^ A list of game indices relevent to this item by generation.
  , typeDetailGeneration :: GenerationSummary -- ^ The generation this type was introduced in.
  , typeDetailMoveUnderscoredamageUnderscoreclass :: MoveDamageClassSummary -- ^ The class of damage inflicted by this type.
  , typeDetailNames :: [TypeName] -- ^ The name of this resource listed in different languages.
  , typeDetailPokemon :: [TypePokemon] -- ^ A list of details of Pokémon that have this type.
  , typeDetailMoves :: [MoveSummary] -- ^ A list of moves that have this type.
  , typeDetailSprites :: (Map.Map String (Map.Map String TypeGameSprite)) -- ^ Type icons grouped by generation and game, with name_icon and symbol_icon URLs. Unavailable icons are null.
  } deriving (Show, Eq, Generic)

instance FromJSON TypeDetail where
  parseJSON = genericParseJSON optionsTypeDetail
instance ToJSON TypeDetail where
  toJSON = genericToJSON optionsTypeDetail

optionsTypeDetail :: Options
optionsTypeDetail =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("typeDetailId", "id")
      , ("typeDetailName", "name")
      , ("typeDetailDamageUnderscorerelations", "damage_relations")
      , ("typeDetailPastUnderscoredamageUnderscorerelations", "past_damage_relations")
      , ("typeDetailGameUnderscoreindices", "game_indices")
      , ("typeDetailGeneration", "generation")
      , ("typeDetailMoveUnderscoredamageUnderscoreclass", "move_damage_class")
      , ("typeDetailNames", "names")
      , ("typeDetailPokemon", "pokemon")
      , ("typeDetailMoves", "moves")
      , ("typeDetailSprites", "sprites")
      ]


-- | 
data TypeGameIndex = TypeGameIndex
  { typeGameIndexGameUnderscoreindex :: Int -- ^ The internal id of an API resource within game data.
  , typeGameIndexGeneration :: GenerationSummary -- ^ The generation relevent to this game index.
  } deriving (Show, Eq, Generic)

instance FromJSON TypeGameIndex where
  parseJSON = genericParseJSON optionsTypeGameIndex
instance ToJSON TypeGameIndex where
  toJSON = genericToJSON optionsTypeGameIndex

optionsTypeGameIndex :: Options
optionsTypeGameIndex =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("typeGameIndexGameUnderscoreindex", "game_index")
      , ("typeGameIndexGeneration", "generation")
      ]


-- | 
data TypeGameSprite = TypeGameSprite
  { typeGameSpriteNameUnderscoreicon :: Maybe Text -- ^ The URL of the icon displaying the type name in this game, or null if unavailable.
  , typeGameSpriteSymbolUnderscoreicon :: Maybe Text -- ^ The URL of the type symbol icon in this game, or null if unavailable.
  } deriving (Show, Eq, Generic)

instance FromJSON TypeGameSprite where
  parseJSON = genericParseJSON optionsTypeGameSprite
instance ToJSON TypeGameSprite where
  toJSON = genericToJSON optionsTypeGameSprite

optionsTypeGameSprite :: Options
optionsTypeGameSprite =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("typeGameSpriteNameUnderscoreicon", "name_icon")
      , ("typeGameSpriteSymbolUnderscoreicon", "symbol_icon")
      ]


-- | 
data TypeName = TypeName
  { typeNameName :: Text -- ^ The localized name for an API resource in a specific language.
  , typeNameLanguage :: LanguageSummary -- ^ The language this name is in.
  } deriving (Show, Eq, Generic)

instance FromJSON TypeName where
  parseJSON = genericParseJSON optionsTypeName
instance ToJSON TypeName where
  toJSON = genericToJSON optionsTypeName

optionsTypeName :: Options
optionsTypeName =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("typeNameName", "name")
      , ("typeNameLanguage", "language")
      ]


-- | 
data TypePastRelationships = TypePastRelationships
  { typePastRelationshipsGeneration :: GenerationSummary -- ^ The last generation in which the referenced type had the listed damage relations
  , typePastRelationshipsDamageUnderscorerelations :: TypeRelationships -- ^ The damage relations the referenced type had up to and including the listed generation
  } deriving (Show, Eq, Generic)

instance FromJSON TypePastRelationships where
  parseJSON = genericParseJSON optionsTypePastRelationships
instance ToJSON TypePastRelationships where
  toJSON = genericToJSON optionsTypePastRelationships

optionsTypePastRelationships :: Options
optionsTypePastRelationships =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("typePastRelationshipsGeneration", "generation")
      , ("typePastRelationshipsDamageUnderscorerelations", "damage_relations")
      ]


-- | 
data TypePokemon = TypePokemon
  { typePokemonSlot :: Int -- ^ The order the Pokémon's types are listed in.
  , typePokemonPokemon :: PokemonSummary -- ^ The Pokémon that has the referenced type.
  } deriving (Show, Eq, Generic)

instance FromJSON TypePokemon where
  parseJSON = genericParseJSON optionsTypePokemon
instance ToJSON TypePokemon where
  toJSON = genericToJSON optionsTypePokemon

optionsTypePokemon :: Options
optionsTypePokemon =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("typePokemonSlot", "slot")
      , ("typePokemonPokemon", "pokemon")
      ]


-- | 
data TypeRelationships = TypeRelationships
  { typeRelationshipsNoUnderscoredamageUnderscoreto :: [TypeSummary] -- ^ A list of types this type has no effect on.
  , typeRelationshipsHalfUnderscoredamageUnderscoreto :: [TypeSummary] -- ^ A list of types this type is not very effect against.
  , typeRelationshipsDoubleUnderscoredamageUnderscoreto :: [TypeSummary] -- ^ A list of types this type is very effect against.
  , typeRelationshipsNoUnderscoredamageUnderscorefrom :: [TypeSummary] -- ^ A list of types that have no effect on this type.
  , typeRelationshipsHalfUnderscoredamageUnderscorefrom :: [TypeSummary] -- ^ A list of types that are not very effective against this type.
  , typeRelationshipsDoubleUnderscoredamageUnderscorefrom :: [TypeSummary] -- ^ A list of types that are very effective against this type.
  } deriving (Show, Eq, Generic)

instance FromJSON TypeRelationships where
  parseJSON = genericParseJSON optionsTypeRelationships
instance ToJSON TypeRelationships where
  toJSON = genericToJSON optionsTypeRelationships

optionsTypeRelationships :: Options
optionsTypeRelationships =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("typeRelationshipsNoUnderscoredamageUnderscoreto", "no_damage_to")
      , ("typeRelationshipsHalfUnderscoredamageUnderscoreto", "half_damage_to")
      , ("typeRelationshipsDoubleUnderscoredamageUnderscoreto", "double_damage_to")
      , ("typeRelationshipsNoUnderscoredamageUnderscorefrom", "no_damage_from")
      , ("typeRelationshipsHalfUnderscoredamageUnderscorefrom", "half_damage_from")
      , ("typeRelationshipsDoubleUnderscoredamageUnderscorefrom", "double_damage_from")
      ]


-- | 
data TypeSummary = TypeSummary
  { typeSummaryName :: Text -- ^ The name of the referenced resource.
  , typeSummaryUrl :: Text -- ^ The URL of the referenced resource.
  } deriving (Show, Eq, Generic)

instance FromJSON TypeSummary where
  parseJSON = genericParseJSON optionsTypeSummary
instance ToJSON TypeSummary where
  toJSON = genericToJSON optionsTypeSummary

optionsTypeSummary :: Options
optionsTypeSummary =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("typeSummaryName", "name")
      , ("typeSummaryUrl", "url")
      ]


-- | Should have a link to Version Group info but the Circular dependency and compilation order fight eachother and I&#39;m not sure how to add anything other than a hyperlink
data VersionDetail = VersionDetail
  { versionDetailId :: Int -- ^ The identifier for this resource.
  , versionDetailName :: Text -- ^ The name for this resource.
  , versionDetailNames :: [VersionName] -- ^ The name of this resource listed in different languages.
  , versionDetailVersionUnderscoregroup :: VersionGroupSummary -- ^ The version group this version belongs to.
  } deriving (Show, Eq, Generic)

instance FromJSON VersionDetail where
  parseJSON = genericParseJSON optionsVersionDetail
instance ToJSON VersionDetail where
  toJSON = genericToJSON optionsVersionDetail

optionsVersionDetail :: Options
optionsVersionDetail =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("versionDetailId", "id")
      , ("versionDetailName", "name")
      , ("versionDetailNames", "names")
      , ("versionDetailVersionUnderscoregroup", "version_group")
      ]


-- | 
data VersionGroupDetail = VersionGroupDetail
  { versionGroupDetailId :: Int -- ^ The identifier for this resource.
  , versionGroupDetailName :: Text -- ^ The name for this resource.
  , versionGroupDetailOrder :: Maybe Int -- ^ Order for sorting. Almost by date of release, except similar versions are grouped together.
  , versionGroupDetailGeneration :: GenerationSummary -- ^ The generation this version was introduced in.
  , versionGroupDetailMoveUnderscorelearnUnderscoremethods :: [MoveLearnMethodSummary] -- ^ A list of methods in which Pokémon can learn moves in this version group.
  , versionGroupDetailPokedexes :: [PokedexSummary] -- ^ A list of Pokédexes introduces in this version group.
  , versionGroupDetailRegions :: [RegionSummary] -- ^ A list of regions that can be visited in this version group.
  , versionGroupDetailVersions :: [VersionSummary] -- ^ The versions this version group owns.
  } deriving (Show, Eq, Generic)

instance FromJSON VersionGroupDetail where
  parseJSON = genericParseJSON optionsVersionGroupDetail
instance ToJSON VersionGroupDetail where
  toJSON = genericToJSON optionsVersionGroupDetail

optionsVersionGroupDetail :: Options
optionsVersionGroupDetail =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("versionGroupDetailId", "id")
      , ("versionGroupDetailName", "name")
      , ("versionGroupDetailOrder", "order")
      , ("versionGroupDetailGeneration", "generation")
      , ("versionGroupDetailMoveUnderscorelearnUnderscoremethods", "move_learn_methods")
      , ("versionGroupDetailPokedexes", "pokedexes")
      , ("versionGroupDetailRegions", "regions")
      , ("versionGroupDetailVersions", "versions")
      ]


-- | 
data VersionGroupSummary = VersionGroupSummary
  { versionGroupSummaryName :: Text -- ^ The name of the referenced resource.
  , versionGroupSummaryUrl :: Text -- ^ The URL of the referenced resource.
  } deriving (Show, Eq, Generic)

instance FromJSON VersionGroupSummary where
  parseJSON = genericParseJSON optionsVersionGroupSummary
instance ToJSON VersionGroupSummary where
  toJSON = genericToJSON optionsVersionGroupSummary

optionsVersionGroupSummary :: Options
optionsVersionGroupSummary =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("versionGroupSummaryName", "name")
      , ("versionGroupSummaryUrl", "url")
      ]


-- | 
data VersionName = VersionName
  { versionNameName :: Text -- ^ The localized name for an API resource in a specific language.
  , versionNameLanguage :: LanguageSummary -- ^ The language this name is in.
  } deriving (Show, Eq, Generic)

instance FromJSON VersionName where
  parseJSON = genericParseJSON optionsVersionName
instance ToJSON VersionName where
  toJSON = genericToJSON optionsVersionName

optionsVersionName :: Options
optionsVersionName =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("versionNameName", "name")
      , ("versionNameLanguage", "language")
      ]


-- | 
data VersionSummary = VersionSummary
  { versionSummaryName :: Text -- ^ The name of the referenced resource.
  , versionSummaryUrl :: Text -- ^ The URL of the referenced resource.
  } deriving (Show, Eq, Generic)

instance FromJSON VersionSummary where
  parseJSON = genericParseJSON optionsVersionSummary
instance ToJSON VersionSummary where
  toJSON = genericToJSON optionsVersionSummary

optionsVersionSummary :: Options
optionsVersionSummary =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("versionSummaryName", "name")
      , ("versionSummaryUrl", "url")
      ]

