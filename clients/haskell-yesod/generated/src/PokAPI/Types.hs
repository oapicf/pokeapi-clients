{-# LANGUAGE GeneralizedNewtypeDeriving #-}
{-# LANGUAGE DeriveGeneric              #-}
{-# LANGUAGE NoImplicitPrelude          #-}
{-# OPTIONS_GHC -fno-warn-unused-binds -fno-warn-unused-imports #-}

module PokAPI.Types (
  AbilityChange (..),
  AbilityChangeEffectText (..),
  AbilityDetail (..),
  AbilityDetailPokemonInner (..),
  AbilityDetailPokemonInnerPokemon (..),
  AbilityEffectText (..),
  AbilityFlavorText (..),
  AbilityName (..),
  AbilitySummary (..),
  BerryDetail (..),
  BerryDetailFlavorsInner (..),
  BerryDetailFlavorsInnerFlavor (..),
  BerryFirmnessDetail (..),
  BerryFirmnessName (..),
  BerryFirmnessSummary (..),
  BerryFlavorDetail (..),
  BerryFlavorDetailBerriesInner (..),
  BerryFlavorDetailBerriesInnerBerry (..),
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
  EggGroupDetail (..),
  EggGroupDetailPokemonSpeciesInner (..),
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
  EvolutionChainDetail (..),
  EvolutionChainDetailChain (..),
  EvolutionChainDetailChainEvolvesToInner (..),
  EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner (..),
  EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender (..),
  EvolutionChainSummary (..),
  EvolutionTriggerDetail (..),
  EvolutionTriggerName (..),
  EvolutionTriggerSummary (..),
  Experience (..),
  GenderDetail (..),
  GenderDetailPokemonSpeciesDetailsInner (..),
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
  ItemDetailBabyTriggerFor (..),
  ItemDetailHeldByPokemonInner (..),
  ItemDetailHeldByPokemonInnerVersionDetailsInner (..),
  ItemDetailMachinesInner (..),
  ItemDetailSprites (..),
  ItemEffectText (..),
  ItemFlavorText (..),
  ItemFlingEffectDetail (..),
  ItemFlingEffectEffectText (..),
  ItemFlingEffectSummary (..),
  ItemGameIndex (..),
  ItemName (..),
  ItemPocketDetail (..),
  ItemPocketName (..),
  ItemPocketSummary (..),
  ItemSummary (..),
  LanguageDetail (..),
  LanguageName (..),
  LanguageSummary (..),
  LocationAreaDetail (..),
  LocationAreaDetailEncounterMethodRatesInner (..),
  LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner (..),
  LocationAreaDetailPokemonEncountersInner (..),
  LocationAreaDetailPokemonEncountersInnerVersionDetailsInner (..),
  LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails (..),
  LocationAreaName (..),
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
  MoveChangeEffectEntriesInner (..),
  MoveDamageClassDescription (..),
  MoveDamageClassDetail (..),
  MoveDamageClassName (..),
  MoveDamageClassSummary (..),
  MoveDetail (..),
  MoveDetailContestCombos (..),
  MoveDetailContestCombosNormal (..),
  MoveDetailEffectChangesInner (..),
  MoveDetailEffectChangesInnerEffectEntriesInner (..),
  MoveDetailMachinesInner (..),
  MoveDetailMachinesInnerMachine (..),
  MoveDetailStatChangesInner (..),
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
  MoveName (..),
  MoveSummary (..),
  MoveTargetDescription (..),
  MoveTargetDetail (..),
  MoveTargetName (..),
  MoveTargetSummary (..),
  NatureBattleStylePreference (..),
  NatureDetail (..),
  NatureDetailPokeathlonStatChangesInner (..),
  NatureName (..),
  NatureSummary (..),
  PaginatedAbilitySummaryList (..),
  PaginatedBerryFirmnessSummaryList (..),
  PaginatedBerryFlavorSummaryList (..),
  PaginatedBerrySummaryList (..),
  PaginatedCharacteristicSummaryList (..),
  PaginatedContestEffectSummaryList (..),
  PaginatedContestTypeSummaryList (..),
  PaginatedEggGroupSummaryList (..),
  PaginatedEncounterConditionSummaryList (..),
  PaginatedEncounterConditionValueSummaryList (..),
  PaginatedEncounterMethodSummaryList (..),
  PaginatedEvolutionChainSummaryList (..),
  PaginatedEvolutionTriggerSummaryList (..),
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
  PalParkAreaDetailPokemonEncountersInner (..),
  PalParkAreaName (..),
  PalParkAreaSummary (..),
  PokeathlonStatDetail (..),
  PokeathlonStatDetailAffectingNatures (..),
  PokeathlonStatDetailAffectingNaturesDecreaseInner (..),
  PokeathlonStatDetailAffectingNaturesIncreaseInner (..),
  PokeathlonStatName (..),
  PokeathlonStatSummary (..),
  PokedexDescription (..),
  PokedexDetail (..),
  PokedexDetailPokemonEntriesInner (..),
  PokedexName (..),
  PokedexSummary (..),
  PokemonColorDetail (..),
  PokemonColorName (..),
  PokemonColorSummary (..),
  PokemonDetail (..),
  PokemonDetailAbilitiesInner (..),
  PokemonDetailCries (..),
  PokemonDetailHeldItems (..),
  PokemonDetailMovesInner (..),
  PokemonDetailMovesInnerVersionGroupDetailsInner (..),
  PokemonDetailPastAbilitiesInner (..),
  PokemonDetailPastTypesInner (..),
  PokemonDetailSprites (..),
  PokemonDetailTypesInner (..),
  PokemonDexEntry (..),
  PokemonFormDetail (..),
  PokemonFormDetailFormNamesInner (..),
  PokemonFormDetailSprites (..),
  PokemonFormSummary (..),
  PokemonGameIndex (..),
  PokemonHabitatDetail (..),
  PokemonHabitatName (..),
  PokemonHabitatSummary (..),
  PokemonShapeDetail (..),
  PokemonShapeDetailAwesomeNamesInner (..),
  PokemonShapeDetailNamesInner (..),
  PokemonShapeSummary (..),
  PokemonSpeciesDescription (..),
  PokemonSpeciesDetail (..),
  PokemonSpeciesDetailGeneraInner (..),
  PokemonSpeciesDetailPalParkEncountersInner (..),
  PokemonSpeciesDetailVarietiesInner (..),
  PokemonSpeciesFlavorText (..),
  PokemonSpeciesSummary (..),
  PokemonStat (..),
  PokemonSummary (..),
  RegionDetail (..),
  RegionName (..),
  RegionSummary (..),
  StatDetail (..),
  StatDetailAffectingMoves (..),
  StatDetailAffectingMovesIncreaseInner (..),
  StatDetailAffectingNatures (..),
  StatName (..),
  StatSummary (..),
  SuperContestEffectDetail (..),
  SuperContestEffectFlavorText (..),
  SuperContestEffectSummary (..),
  TypeDetail (..),
  TypeDetailDamageRelations (..),
  TypeDetailPastDamageRelationsInner (..),
  TypeDetailPastDamageRelationsInnerDamageRelations (..),
  TypeDetailPokemonInner (..),
  TypeDetailPokemonInnerPokemon (..),
  TypeDetailSpritesValueValue (..),
  TypeGameIndex (..),
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
  { abilityChangeVersionUnderscoregroup :: VersionGroupSummary -- ^ 
  , abilityChangeEffectUnderscoreentries :: [AbilityChangeEffectText] -- ^ 
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
  { abilityChangeEffectTextEffect :: Text -- ^ 
  , abilityChangeEffectTextLanguage :: LanguageSummary -- ^ 
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
  { abilityDetailId :: Int -- ^ 
  , abilityDetailName :: Text -- ^ 
  , abilityDetailIsUnderscoremainUnderscoreseries :: Maybe Bool -- ^ 
  , abilityDetailGeneration :: GenerationSummary -- ^ 
  , abilityDetailNames :: [AbilityName] -- ^ 
  , abilityDetailEffectUnderscoreentries :: [AbilityEffectText] -- ^ 
  , abilityDetailEffectUnderscorechanges :: [AbilityChange] -- ^ 
  , abilityDetailFlavorUnderscoretextUnderscoreentries :: [AbilityFlavorText] -- ^ 
  , abilityDetailPokemon :: [AbilityDetailPokemonInner] -- ^ 
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
data AbilityDetailPokemonInner = AbilityDetailPokemonInner
  { abilityDetailPokemonInnerIsUnderscorehidden :: Bool -- ^ 
  , abilityDetailPokemonInnerSlot :: Int -- ^ 
  , abilityDetailPokemonInnerPokemon :: AbilityDetailPokemonInnerPokemon -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AbilityDetailPokemonInner where
  parseJSON = genericParseJSON optionsAbilityDetailPokemonInner
instance ToJSON AbilityDetailPokemonInner where
  toJSON = genericToJSON optionsAbilityDetailPokemonInner

optionsAbilityDetailPokemonInner :: Options
optionsAbilityDetailPokemonInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("abilityDetailPokemonInnerIsUnderscorehidden", "is_hidden")
      , ("abilityDetailPokemonInnerSlot", "slot")
      , ("abilityDetailPokemonInnerPokemon", "pokemon")
      ]


-- | 
data AbilityDetailPokemonInnerPokemon = AbilityDetailPokemonInnerPokemon
  { abilityDetailPokemonInnerPokemonName :: Text -- ^ 
  , abilityDetailPokemonInnerPokemonUrl :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AbilityDetailPokemonInnerPokemon where
  parseJSON = genericParseJSON optionsAbilityDetailPokemonInnerPokemon
instance ToJSON AbilityDetailPokemonInnerPokemon where
  toJSON = genericToJSON optionsAbilityDetailPokemonInnerPokemon

optionsAbilityDetailPokemonInnerPokemon :: Options
optionsAbilityDetailPokemonInnerPokemon =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("abilityDetailPokemonInnerPokemonName", "name")
      , ("abilityDetailPokemonInnerPokemonUrl", "url")
      ]


-- | 
data AbilityEffectText = AbilityEffectText
  { abilityEffectTextEffect :: Text -- ^ 
  , abilityEffectTextShortUnderscoreeffect :: Text -- ^ 
  , abilityEffectTextLanguage :: LanguageSummary -- ^ 
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
  { abilityFlavorTextFlavorUnderscoretext :: Text -- ^ 
  , abilityFlavorTextLanguage :: LanguageSummary -- ^ 
  , abilityFlavorTextVersionUnderscoregroup :: VersionGroupSummary -- ^ 
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
  { abilityNameName :: Text -- ^ 
  , abilityNameLanguage :: LanguageSummary -- ^ 
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
data AbilitySummary = AbilitySummary
  { abilitySummaryName :: Text -- ^ 
  , abilitySummaryUrl :: Text -- ^ 
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
  { berryDetailId :: Int -- ^ 
  , berryDetailName :: Text -- ^ 
  , berryDetailGrowthUnderscoretime :: Int -- ^ 
  , berryDetailMaxUnderscoreharvest :: Int -- ^ 
  , berryDetailNaturalUnderscoregiftUnderscorepower :: Int -- ^ 
  , berryDetailSize :: Int -- ^ 
  , berryDetailSmoothness :: Int -- ^ 
  , berryDetailSoilUnderscoredryness :: Int -- ^ 
  , berryDetailFirmness :: BerryFirmnessSummary -- ^ 
  , berryDetailFlavors :: [BerryDetailFlavorsInner] -- ^ 
  , berryDetailItem :: ItemSummary -- ^ 
  , berryDetailNaturalUnderscoregiftUnderscoretype :: TypeSummary -- ^ 
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
data BerryDetailFlavorsInner = BerryDetailFlavorsInner
  { berryDetailFlavorsInnerPotency :: Int -- ^ 
  , berryDetailFlavorsInnerFlavor :: BerryDetailFlavorsInnerFlavor -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON BerryDetailFlavorsInner where
  parseJSON = genericParseJSON optionsBerryDetailFlavorsInner
instance ToJSON BerryDetailFlavorsInner where
  toJSON = genericToJSON optionsBerryDetailFlavorsInner

optionsBerryDetailFlavorsInner :: Options
optionsBerryDetailFlavorsInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("berryDetailFlavorsInnerPotency", "potency")
      , ("berryDetailFlavorsInnerFlavor", "flavor")
      ]


-- | 
data BerryDetailFlavorsInnerFlavor = BerryDetailFlavorsInnerFlavor
  { berryDetailFlavorsInnerFlavorName :: Maybe Text -- ^ The name of the flavor
  , berryDetailFlavorsInnerFlavorUrl :: Maybe Text -- ^ The URL to get more information about the flavor
  } deriving (Show, Eq, Generic)

instance FromJSON BerryDetailFlavorsInnerFlavor where
  parseJSON = genericParseJSON optionsBerryDetailFlavorsInnerFlavor
instance ToJSON BerryDetailFlavorsInnerFlavor where
  toJSON = genericToJSON optionsBerryDetailFlavorsInnerFlavor

optionsBerryDetailFlavorsInnerFlavor :: Options
optionsBerryDetailFlavorsInnerFlavor =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("berryDetailFlavorsInnerFlavorName", "name")
      , ("berryDetailFlavorsInnerFlavorUrl", "url")
      ]


-- | 
data BerryFirmnessDetail = BerryFirmnessDetail
  { berryFirmnessDetailId :: Int -- ^ 
  , berryFirmnessDetailName :: Text -- ^ 
  , berryFirmnessDetailBerries :: [BerrySummary] -- ^ 
  , berryFirmnessDetailNames :: [BerryFirmnessName] -- ^ 
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
  { berryFirmnessNameName :: Text -- ^ 
  , berryFirmnessNameLanguage :: LanguageSummary -- ^ 
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
  { berryFirmnessSummaryName :: Text -- ^ 
  , berryFirmnessSummaryUrl :: Text -- ^ 
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
data BerryFlavorDetail = BerryFlavorDetail
  { berryFlavorDetailId :: Int -- ^ 
  , berryFlavorDetailName :: Text -- ^ 
  , berryFlavorDetailBerries :: [BerryFlavorDetailBerriesInner] -- ^ 
  , berryFlavorDetailContestUnderscoretype :: ContestTypeSummary -- ^ 
  , berryFlavorDetailNames :: [BerryFlavorName] -- ^ 
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
data BerryFlavorDetailBerriesInner = BerryFlavorDetailBerriesInner
  { berryFlavorDetailBerriesInnerPotency :: Int -- ^ 
  , berryFlavorDetailBerriesInnerBerry :: BerryFlavorDetailBerriesInnerBerry -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON BerryFlavorDetailBerriesInner where
  parseJSON = genericParseJSON optionsBerryFlavorDetailBerriesInner
instance ToJSON BerryFlavorDetailBerriesInner where
  toJSON = genericToJSON optionsBerryFlavorDetailBerriesInner

optionsBerryFlavorDetailBerriesInner :: Options
optionsBerryFlavorDetailBerriesInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("berryFlavorDetailBerriesInnerPotency", "potency")
      , ("berryFlavorDetailBerriesInnerBerry", "berry")
      ]


-- | 
data BerryFlavorDetailBerriesInnerBerry = BerryFlavorDetailBerriesInnerBerry
  { berryFlavorDetailBerriesInnerBerryName :: Maybe Text -- ^ The name of the berry
  , berryFlavorDetailBerriesInnerBerryUrl :: Maybe Text -- ^ The URL to get more information about the berry
  } deriving (Show, Eq, Generic)

instance FromJSON BerryFlavorDetailBerriesInnerBerry where
  parseJSON = genericParseJSON optionsBerryFlavorDetailBerriesInnerBerry
instance ToJSON BerryFlavorDetailBerriesInnerBerry where
  toJSON = genericToJSON optionsBerryFlavorDetailBerriesInnerBerry

optionsBerryFlavorDetailBerriesInnerBerry :: Options
optionsBerryFlavorDetailBerriesInnerBerry =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("berryFlavorDetailBerriesInnerBerryName", "name")
      , ("berryFlavorDetailBerriesInnerBerryUrl", "url")
      ]


-- | 
data BerryFlavorName = BerryFlavorName
  { berryFlavorNameName :: Text -- ^ 
  , berryFlavorNameLanguage :: LanguageSummary -- ^ 
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
  { berryFlavorSummaryName :: Text -- ^ 
  , berryFlavorSummaryUrl :: Text -- ^ 
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
  { berrySummaryName :: Text -- ^ 
  , berrySummaryUrl :: Text -- ^ 
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
  { characteristicDescriptionDescription :: Maybe Text -- ^ 
  , characteristicDescriptionLanguage :: LanguageSummary -- ^ 
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
  { characteristicDetailId :: Int -- ^ 
  , characteristicDetailGeneUnderscoremodulo :: Int -- ^ 
  , characteristicDetailPossibleUnderscorevalues :: [Int] -- ^ 
  , characteristicDetailHighestUnderscorestat :: StatSummary -- ^ 
  , characteristicDetailDescriptions :: [CharacteristicDescription] -- ^ 
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
  { characteristicSummaryUrl :: Text -- ^ 
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
  { contestEffectDetailId :: Int -- ^ 
  , contestEffectDetailAppeal :: Int -- ^ 
  , contestEffectDetailJam :: Int -- ^ 
  , contestEffectDetailEffectUnderscoreentries :: [ContestEffectEffectText] -- ^ 
  , contestEffectDetailFlavorUnderscoretextUnderscoreentries :: [ContestEffectFlavorText] -- ^ 
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
  { contestEffectEffectTextEffect :: Text -- ^ 
  , contestEffectEffectTextLanguage :: LanguageSummary -- ^ 
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
  { contestEffectFlavorTextFlavorUnderscoretext :: Text -- ^ 
  , contestEffectFlavorTextLanguage :: LanguageSummary -- ^ 
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
  { contestEffectSummaryUrl :: Text -- ^ 
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
  { contestTypeDetailId :: Int -- ^ 
  , contestTypeDetailName :: Text -- ^ 
  , contestTypeDetailBerryUnderscoreflavor :: BerryFlavorSummary -- ^ 
  , contestTypeDetailNames :: [ContestTypeName] -- ^ 
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
  { contestTypeNameName :: Text -- ^ 
  , contestTypeNameColor :: Text -- ^ 
  , contestTypeNameLanguage :: LanguageSummary -- ^ 
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
  { contestTypeSummaryName :: Text -- ^ 
  , contestTypeSummaryUrl :: Text -- ^ 
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
data EggGroupDetail = EggGroupDetail
  { eggGroupDetailId :: Int -- ^ 
  , eggGroupDetailName :: Text -- ^ 
  , eggGroupDetailNames :: [EggGroupName] -- ^ 
  , eggGroupDetailPokemonUnderscorespecies :: [EggGroupDetailPokemonSpeciesInner] -- ^ 
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
data EggGroupDetailPokemonSpeciesInner = EggGroupDetailPokemonSpeciesInner
  { eggGroupDetailPokemonSpeciesInnerName :: Maybe Text -- ^ Pokemon species name.
  , eggGroupDetailPokemonSpeciesInnerUrl :: Maybe Text -- ^ The URL to get more information about the species
  } deriving (Show, Eq, Generic)

instance FromJSON EggGroupDetailPokemonSpeciesInner where
  parseJSON = genericParseJSON optionsEggGroupDetailPokemonSpeciesInner
instance ToJSON EggGroupDetailPokemonSpeciesInner where
  toJSON = genericToJSON optionsEggGroupDetailPokemonSpeciesInner

optionsEggGroupDetailPokemonSpeciesInner :: Options
optionsEggGroupDetailPokemonSpeciesInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("eggGroupDetailPokemonSpeciesInnerName", "name")
      , ("eggGroupDetailPokemonSpeciesInnerUrl", "url")
      ]


-- | 
data EggGroupName = EggGroupName
  { eggGroupNameName :: Text -- ^ 
  , eggGroupNameLanguage :: LanguageSummary -- ^ 
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
  { eggGroupSummaryName :: Text -- ^ 
  , eggGroupSummaryUrl :: Text -- ^ 
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
  { encounterConditionDetailId :: Int -- ^ 
  , encounterConditionDetailName :: Text -- ^ 
  , encounterConditionDetailValues :: [EncounterConditionValueSummary] -- ^ 
  , encounterConditionDetailNames :: [EncounterConditionName] -- ^ 
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
  { encounterConditionNameName :: Text -- ^ 
  , encounterConditionNameLanguage :: LanguageSummary -- ^ 
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
  { encounterConditionSummaryName :: Text -- ^ 
  , encounterConditionSummaryUrl :: Text -- ^ 
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
  { encounterConditionValueDetailId :: Int -- ^ 
  , encounterConditionValueDetailName :: Text -- ^ 
  , encounterConditionValueDetailCondition :: EncounterConditionSummary -- ^ 
  , encounterConditionValueDetailNames :: [EncounterConditionValueName] -- ^ 
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
  { encounterConditionValueNameName :: Text -- ^ 
  , encounterConditionValueNameLanguage :: LanguageSummary -- ^ 
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
  { encounterConditionValueSummaryName :: Text -- ^ 
  , encounterConditionValueSummaryUrl :: Text -- ^ 
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
  { encounterMethodDetailId :: Int -- ^ 
  , encounterMethodDetailName :: Text -- ^ 
  , encounterMethodDetailOrder :: Maybe Int -- ^ 
  , encounterMethodDetailNames :: [EncounterMethodName] -- ^ 
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
  { encounterMethodNameName :: Text -- ^ 
  , encounterMethodNameLanguage :: LanguageSummary -- ^ 
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
  { encounterMethodSummaryName :: Text -- ^ 
  , encounterMethodSummaryUrl :: Text -- ^ 
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
data EvolutionChainDetail = EvolutionChainDetail
  { evolutionChainDetailId :: Int -- ^ 
  , evolutionChainDetailBabyUnderscoretriggerUnderscoreitem :: ItemSummary -- ^ 
  , evolutionChainDetailChain :: EvolutionChainDetailChain -- ^ 
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
data EvolutionChainDetailChain = EvolutionChainDetailChain
  { evolutionChainDetailChainEvolutionUnderscoredetails :: [Value] -- ^ 
  , evolutionChainDetailChainEvolvesUnderscoreto :: [EvolutionChainDetailChainEvolvesToInner] -- ^ 
  , evolutionChainDetailChainIsUnderscorebaby :: Bool -- ^ 
  , evolutionChainDetailChainSpecies :: AbilityDetailPokemonInnerPokemon -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON EvolutionChainDetailChain where
  parseJSON = genericParseJSON optionsEvolutionChainDetailChain
instance ToJSON EvolutionChainDetailChain where
  toJSON = genericToJSON optionsEvolutionChainDetailChain

optionsEvolutionChainDetailChain :: Options
optionsEvolutionChainDetailChain =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("evolutionChainDetailChainEvolutionUnderscoredetails", "evolution_details")
      , ("evolutionChainDetailChainEvolvesUnderscoreto", "evolves_to")
      , ("evolutionChainDetailChainIsUnderscorebaby", "is_baby")
      , ("evolutionChainDetailChainSpecies", "species")
      ]


-- | 
data EvolutionChainDetailChainEvolvesToInner = EvolutionChainDetailChainEvolvesToInner
  { evolutionChainDetailChainEvolvesToInnerEvolutionUnderscoredetails :: [EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner] -- ^ 
  , evolutionChainDetailChainEvolvesToInnerIsUnderscorebaby :: Bool -- ^ 
  , evolutionChainDetailChainEvolvesToInnerSpecies :: AbilityDetailPokemonInnerPokemon -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON EvolutionChainDetailChainEvolvesToInner where
  parseJSON = genericParseJSON optionsEvolutionChainDetailChainEvolvesToInner
instance ToJSON EvolutionChainDetailChainEvolvesToInner where
  toJSON = genericToJSON optionsEvolutionChainDetailChainEvolvesToInner

optionsEvolutionChainDetailChainEvolvesToInner :: Options
optionsEvolutionChainDetailChainEvolvesToInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("evolutionChainDetailChainEvolvesToInnerEvolutionUnderscoredetails", "evolution_details")
      , ("evolutionChainDetailChainEvolvesToInnerIsUnderscorebaby", "is_baby")
      , ("evolutionChainDetailChainEvolvesToInnerSpecies", "species")
      ]


-- | 
data EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner = EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner
  { evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender :: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender -- ^ 
  , evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerHeldUnderscoreitem :: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender -- ^ 
  , evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerItem :: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender -- ^ 
  , evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerKnownUnderscoremove :: Object -- ^ 
  , evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerKnownUnderscoremoveUnderscoretype :: Object -- ^ 
  , evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerLocation :: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender -- ^ 
  , evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerMinUnderscoreaffection :: Int -- ^ 
  , evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerMinUnderscorebeauty :: Int -- ^ 
  , evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerMinUnderscorehappiness :: Int -- ^ 
  , evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerMinUnderscorelevel :: Int -- ^ 
  , evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerNeedsUnderscoreoverworldUnderscorerain :: Bool -- ^ 
  , evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerPartyUnderscorespecies :: Text -- ^ 
  , evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerPartyUnderscoretype :: Text -- ^ 
  , evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerRelativeUnderscorephysicalUnderscorestats :: Text -- ^ 
  , evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerTimeUnderscoreofUnderscoreday :: Text -- ^ 
  , evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerTradeUnderscorespecies :: Text -- ^ 
  , evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerTrigger :: AbilityDetailPokemonInnerPokemon -- ^ 
  , evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerTurnUnderscoreupsideUnderscoredown :: Bool -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner where
  parseJSON = genericParseJSON optionsEvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner
instance ToJSON EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner where
  toJSON = genericToJSON optionsEvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner

optionsEvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner :: Options
optionsEvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender", "gender")
      , ("evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerHeldUnderscoreitem", "held_item")
      , ("evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerItem", "item")
      , ("evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerKnownUnderscoremove", "known_move")
      , ("evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerKnownUnderscoremoveUnderscoretype", "known_move_type")
      , ("evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerLocation", "location")
      , ("evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerMinUnderscoreaffection", "min_affection")
      , ("evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerMinUnderscorebeauty", "min_beauty")
      , ("evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerMinUnderscorehappiness", "min_happiness")
      , ("evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerMinUnderscorelevel", "min_level")
      , ("evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerNeedsUnderscoreoverworldUnderscorerain", "needs_overworld_rain")
      , ("evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerPartyUnderscorespecies", "party_species")
      , ("evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerPartyUnderscoretype", "party_type")
      , ("evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerRelativeUnderscorephysicalUnderscorestats", "relative_physical_stats")
      , ("evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerTimeUnderscoreofUnderscoreday", "time_of_day")
      , ("evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerTradeUnderscorespecies", "trade_species")
      , ("evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerTrigger", "trigger")
      , ("evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerTurnUnderscoreupsideUnderscoredown", "turn_upside_down")
      ]


-- | 
data EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender = EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender
  { evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGenderName :: Text -- ^ 
  , evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGenderUrl :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender where
  parseJSON = genericParseJSON optionsEvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender
instance ToJSON EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender where
  toJSON = genericToJSON optionsEvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender

optionsEvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender :: Options
optionsEvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGenderName", "name")
      , ("evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGenderUrl", "url")
      ]


-- | 
data EvolutionChainSummary = EvolutionChainSummary
  { evolutionChainSummaryUrl :: Text -- ^ 
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
data EvolutionTriggerDetail = EvolutionTriggerDetail
  { evolutionTriggerDetailId :: Int -- ^ 
  , evolutionTriggerDetailName :: Text -- ^ 
  , evolutionTriggerDetailNames :: [EvolutionTriggerName] -- ^ 
  , evolutionTriggerDetailPokemonUnderscorespecies :: [AbilityDetailPokemonInnerPokemon] -- ^ 
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
  { evolutionTriggerNameName :: Text -- ^ 
  , evolutionTriggerNameLanguage :: LanguageSummary -- ^ 
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
  { evolutionTriggerSummaryName :: Text -- ^ 
  , evolutionTriggerSummaryUrl :: Text -- ^ 
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
data Experience = Experience
  { experienceLevel :: Int -- ^ 
  , experienceExperience :: Int -- ^ 
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
  { genderDetailId :: Int -- ^ 
  , genderDetailName :: Text -- ^ 
  , genderDetailPokemonUnderscorespeciesUnderscoredetails :: [GenderDetailPokemonSpeciesDetailsInner] -- ^ 
  , genderDetailRequiredUnderscoreforUnderscoreevolution :: [AbilityDetailPokemonInnerPokemon] -- ^ 
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
data GenderDetailPokemonSpeciesDetailsInner = GenderDetailPokemonSpeciesDetailsInner
  { genderDetailPokemonSpeciesDetailsInnerRate :: Int -- ^ 
  , genderDetailPokemonSpeciesDetailsInnerPokemonUnderscorespecies :: AbilityDetailPokemonInnerPokemon -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GenderDetailPokemonSpeciesDetailsInner where
  parseJSON = genericParseJSON optionsGenderDetailPokemonSpeciesDetailsInner
instance ToJSON GenderDetailPokemonSpeciesDetailsInner where
  toJSON = genericToJSON optionsGenderDetailPokemonSpeciesDetailsInner

optionsGenderDetailPokemonSpeciesDetailsInner :: Options
optionsGenderDetailPokemonSpeciesDetailsInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("genderDetailPokemonSpeciesDetailsInnerRate", "rate")
      , ("genderDetailPokemonSpeciesDetailsInnerPokemonUnderscorespecies", "pokemon_species")
      ]


-- | 
data GenderSummary = GenderSummary
  { genderSummaryName :: Text -- ^ 
  , genderSummaryUrl :: Text -- ^ 
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
  { generationDetailId :: Int -- ^ 
  , generationDetailName :: Text -- ^ 
  , generationDetailAbilities :: [AbilitySummary] -- ^ 
  , generationDetailMainUnderscoreregion :: RegionSummary -- ^ 
  , generationDetailMoves :: [MoveSummary] -- ^ 
  , generationDetailNames :: [GenerationName] -- ^ 
  , generationDetailPokemonUnderscorespecies :: [PokemonSpeciesSummary] -- ^ 
  , generationDetailTypes :: [TypeSummary] -- ^ 
  , generationDetailVersionUnderscoregroups :: [VersionGroupSummary] -- ^ 
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
  { generationNameName :: Text -- ^ 
  , generationNameLanguage :: LanguageSummary -- ^ 
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
  { generationSummaryName :: Text -- ^ 
  , generationSummaryUrl :: Text -- ^ 
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
  { growthRateDescriptionDescription :: Maybe Text -- ^ 
  , growthRateDescriptionLanguage :: LanguageSummary -- ^ 
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
  { growthRateDetailId :: Int -- ^ 
  , growthRateDetailName :: Text -- ^ 
  , growthRateDetailFormula :: Text -- ^ 
  , growthRateDetailDescriptions :: [GrowthRateDescription] -- ^ 
  , growthRateDetailLevels :: [Experience] -- ^ 
  , growthRateDetailPokemonUnderscorespecies :: [PokemonSpeciesSummary] -- ^ 
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
  { growthRateSummaryName :: Text -- ^ 
  , growthRateSummaryUrl :: Text -- ^ 
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
  { itemAttributeDescriptionDescription :: Maybe Text -- ^ 
  , itemAttributeDescriptionLanguage :: LanguageSummary -- ^ 
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
  { itemAttributeDetailId :: Int -- ^ 
  , itemAttributeDetailName :: Text -- ^ 
  , itemAttributeDetailDescriptions :: [ItemAttributeDescription] -- ^ 
  , itemAttributeDetailItems :: [AbilityDetailPokemonInnerPokemon] -- ^ 
  , itemAttributeDetailNames :: [ItemAttributeName] -- ^ 
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
  { itemAttributeNameName :: Text -- ^ 
  , itemAttributeNameLanguage :: LanguageSummary -- ^ 
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
  { itemAttributeSummaryName :: Text -- ^ 
  , itemAttributeSummaryUrl :: Text -- ^ 
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
  { itemCategoryDetailId :: Int -- ^ 
  , itemCategoryDetailName :: Text -- ^ 
  , itemCategoryDetailItems :: [ItemSummary] -- ^ 
  , itemCategoryDetailNames :: [ItemCategoryName] -- ^ 
  , itemCategoryDetailPocket :: ItemPocketSummary -- ^ 
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
  { itemCategoryNameName :: Text -- ^ 
  , itemCategoryNameLanguage :: LanguageSummary -- ^ 
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
  { itemCategorySummaryName :: Text -- ^ 
  , itemCategorySummaryUrl :: Text -- ^ 
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
  { itemDetailId :: Int -- ^ 
  , itemDetailName :: Text -- ^ 
  , itemDetailCost :: Maybe Int -- ^ 
  , itemDetailFlingUnderscorepower :: Maybe Int -- ^ 
  , itemDetailFlingUnderscoreeffect :: ItemFlingEffectSummary -- ^ 
  , itemDetailAttributes :: [AbilityDetailPokemonInnerPokemon] -- ^ 
  , itemDetailCategory :: ItemCategorySummary -- ^ 
  , itemDetailEffectUnderscoreentries :: [ItemEffectText] -- ^ 
  , itemDetailFlavorUnderscoretextUnderscoreentries :: [ItemFlavorText] -- ^ 
  , itemDetailGameUnderscoreindices :: [ItemGameIndex] -- ^ 
  , itemDetailNames :: [ItemName] -- ^ 
  , itemDetailHeldUnderscorebyUnderscorepokemon :: [ItemDetailHeldByPokemonInner] -- ^ 
  , itemDetailSprites :: ItemDetailSprites -- ^ 
  , itemDetailBabyUnderscoretriggerUnderscorefor :: ItemDetailBabyTriggerFor -- ^ 
  , itemDetailMachines :: [ItemDetailMachinesInner] -- ^ 
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
      , ("itemDetailCost", "cost")
      , ("itemDetailFlingUnderscorepower", "fling_power")
      , ("itemDetailFlingUnderscoreeffect", "fling_effect")
      , ("itemDetailAttributes", "attributes")
      , ("itemDetailCategory", "category")
      , ("itemDetailEffectUnderscoreentries", "effect_entries")
      , ("itemDetailFlavorUnderscoretextUnderscoreentries", "flavor_text_entries")
      , ("itemDetailGameUnderscoreindices", "game_indices")
      , ("itemDetailNames", "names")
      , ("itemDetailHeldUnderscorebyUnderscorepokemon", "held_by_pokemon")
      , ("itemDetailSprites", "sprites")
      , ("itemDetailBabyUnderscoretriggerUnderscorefor", "baby_trigger_for")
      , ("itemDetailMachines", "machines")
      ]


-- | 
data ItemDetailBabyTriggerFor = ItemDetailBabyTriggerFor
  { itemDetailBabyTriggerForUrl :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ItemDetailBabyTriggerFor where
  parseJSON = genericParseJSON optionsItemDetailBabyTriggerFor
instance ToJSON ItemDetailBabyTriggerFor where
  toJSON = genericToJSON optionsItemDetailBabyTriggerFor

optionsItemDetailBabyTriggerFor :: Options
optionsItemDetailBabyTriggerFor =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("itemDetailBabyTriggerForUrl", "url")
      ]


-- | 
data ItemDetailHeldByPokemonInner = ItemDetailHeldByPokemonInner
  { itemDetailHeldByPokemonInnerPokemon :: AbilityDetailPokemonInnerPokemon -- ^ 
  , itemDetailHeldByPokemonInnerVersionDashdetails :: [ItemDetailHeldByPokemonInnerVersionDetailsInner] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ItemDetailHeldByPokemonInner where
  parseJSON = genericParseJSON optionsItemDetailHeldByPokemonInner
instance ToJSON ItemDetailHeldByPokemonInner where
  toJSON = genericToJSON optionsItemDetailHeldByPokemonInner

optionsItemDetailHeldByPokemonInner :: Options
optionsItemDetailHeldByPokemonInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("itemDetailHeldByPokemonInnerPokemon", "pokemon")
      , ("itemDetailHeldByPokemonInnerVersionDashdetails", "version-details")
      ]


-- | 
data ItemDetailHeldByPokemonInnerVersionDetailsInner = ItemDetailHeldByPokemonInnerVersionDetailsInner
  { itemDetailHeldByPokemonInnerVersionDetailsInnerRarity :: Int -- ^ 
  , itemDetailHeldByPokemonInnerVersionDetailsInnerVersion :: AbilityDetailPokemonInnerPokemon -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ItemDetailHeldByPokemonInnerVersionDetailsInner where
  parseJSON = genericParseJSON optionsItemDetailHeldByPokemonInnerVersionDetailsInner
instance ToJSON ItemDetailHeldByPokemonInnerVersionDetailsInner where
  toJSON = genericToJSON optionsItemDetailHeldByPokemonInnerVersionDetailsInner

optionsItemDetailHeldByPokemonInnerVersionDetailsInner :: Options
optionsItemDetailHeldByPokemonInnerVersionDetailsInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("itemDetailHeldByPokemonInnerVersionDetailsInnerRarity", "rarity")
      , ("itemDetailHeldByPokemonInnerVersionDetailsInnerVersion", "version")
      ]


-- | 
data ItemDetailMachinesInner = ItemDetailMachinesInner
  { itemDetailMachinesInnerMachine :: Text -- ^ 
  , itemDetailMachinesInnerVersionUnderscoregroup :: AbilityDetailPokemonInnerPokemon -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ItemDetailMachinesInner where
  parseJSON = genericParseJSON optionsItemDetailMachinesInner
instance ToJSON ItemDetailMachinesInner where
  toJSON = genericToJSON optionsItemDetailMachinesInner

optionsItemDetailMachinesInner :: Options
optionsItemDetailMachinesInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("itemDetailMachinesInnerMachine", "machine")
      , ("itemDetailMachinesInnerVersionUnderscoregroup", "version_group")
      ]


-- | 
data ItemDetailSprites = ItemDetailSprites
  { itemDetailSpritesDefault :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ItemDetailSprites where
  parseJSON = genericParseJSON optionsItemDetailSprites
instance ToJSON ItemDetailSprites where
  toJSON = genericToJSON optionsItemDetailSprites

optionsItemDetailSprites :: Options
optionsItemDetailSprites =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("itemDetailSpritesDefault", "default")
      ]


-- | 
data ItemEffectText = ItemEffectText
  { itemEffectTextEffect :: Text -- ^ 
  , itemEffectTextShortUnderscoreeffect :: Text -- ^ 
  , itemEffectTextLanguage :: LanguageSummary -- ^ 
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
  { itemFlavorTextText :: Text -- ^ 
  , itemFlavorTextVersionUnderscoregroup :: VersionGroupSummary -- ^ 
  , itemFlavorTextLanguage :: LanguageSummary -- ^ 
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
  { itemFlingEffectDetailId :: Int -- ^ 
  , itemFlingEffectDetailName :: Text -- ^ 
  , itemFlingEffectDetailEffectUnderscoreentries :: [ItemFlingEffectEffectText] -- ^ 
  , itemFlingEffectDetailItems :: [ItemSummary] -- ^ 
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
  { itemFlingEffectEffectTextEffect :: Text -- ^ 
  , itemFlingEffectEffectTextLanguage :: LanguageSummary -- ^ 
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
  { itemFlingEffectSummaryName :: Text -- ^ 
  , itemFlingEffectSummaryUrl :: Text -- ^ 
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
  { itemGameIndexGameUnderscoreindex :: Int -- ^ 
  , itemGameIndexGeneration :: GenerationSummary -- ^ 
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
data ItemName = ItemName
  { itemNameName :: Text -- ^ 
  , itemNameLanguage :: LanguageSummary -- ^ 
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
  { itemPocketDetailId :: Int -- ^ 
  , itemPocketDetailName :: Text -- ^ 
  , itemPocketDetailCategories :: [ItemCategorySummary] -- ^ 
  , itemPocketDetailNames :: [ItemPocketName] -- ^ 
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
  { itemPocketNameName :: Text -- ^ 
  , itemPocketNameLanguage :: LanguageSummary -- ^ 
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
  { itemPocketSummaryName :: Text -- ^ 
  , itemPocketSummaryUrl :: Text -- ^ 
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
data ItemSummary = ItemSummary
  { itemSummaryName :: Text -- ^ 
  , itemSummaryUrl :: Text -- ^ 
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
  { languageDetailId :: Int -- ^ 
  , languageDetailName :: Text -- ^ 
  , languageDetailOfficial :: Maybe Bool -- ^ 
  , languageDetailIso639 :: Text -- ^ 
  , languageDetailIso3166 :: Text -- ^ 
  , languageDetailNames :: [LanguageName] -- ^ 
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
  { languageNameName :: Text -- ^ 
  , languageNameLanguage :: LanguageSummary -- ^ 
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
  { languageSummaryName :: Text -- ^ 
  , languageSummaryUrl :: Text -- ^ 
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
  { locationAreaDetailId :: Int -- ^ 
  , locationAreaDetailName :: Text -- ^ 
  , locationAreaDetailGameUnderscoreindex :: Int -- ^ 
  , locationAreaDetailEncounterUnderscoremethodUnderscorerates :: [LocationAreaDetailEncounterMethodRatesInner] -- ^ 
  , locationAreaDetailLocation :: LocationSummary -- ^ 
  , locationAreaDetailNames :: [LocationAreaName] -- ^ 
  , locationAreaDetailPokemonUnderscoreencounters :: [LocationAreaDetailPokemonEncountersInner] -- ^ 
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
data LocationAreaDetailEncounterMethodRatesInner = LocationAreaDetailEncounterMethodRatesInner
  { locationAreaDetailEncounterMethodRatesInnerEncounterUnderscoremethod :: AbilityDetailPokemonInnerPokemon -- ^ 
  , locationAreaDetailEncounterMethodRatesInnerVersionUnderscoredetails :: [LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON LocationAreaDetailEncounterMethodRatesInner where
  parseJSON = genericParseJSON optionsLocationAreaDetailEncounterMethodRatesInner
instance ToJSON LocationAreaDetailEncounterMethodRatesInner where
  toJSON = genericToJSON optionsLocationAreaDetailEncounterMethodRatesInner

optionsLocationAreaDetailEncounterMethodRatesInner :: Options
optionsLocationAreaDetailEncounterMethodRatesInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("locationAreaDetailEncounterMethodRatesInnerEncounterUnderscoremethod", "encounter_method")
      , ("locationAreaDetailEncounterMethodRatesInnerVersionUnderscoredetails", "version_details")
      ]


-- | 
data LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner = LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner
  { locationAreaDetailEncounterMethodRatesInnerVersionDetailsInnerRate :: Int -- ^ 
  , locationAreaDetailEncounterMethodRatesInnerVersionDetailsInnerVersion :: AbilityDetailPokemonInnerPokemon -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner where
  parseJSON = genericParseJSON optionsLocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner
instance ToJSON LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner where
  toJSON = genericToJSON optionsLocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner

optionsLocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner :: Options
optionsLocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("locationAreaDetailEncounterMethodRatesInnerVersionDetailsInnerRate", "rate")
      , ("locationAreaDetailEncounterMethodRatesInnerVersionDetailsInnerVersion", "version")
      ]


-- | 
data LocationAreaDetailPokemonEncountersInner = LocationAreaDetailPokemonEncountersInner
  { locationAreaDetailPokemonEncountersInnerPokemon :: AbilityDetailPokemonInnerPokemon -- ^ 
  , locationAreaDetailPokemonEncountersInnerVersionUnderscoredetails :: [LocationAreaDetailPokemonEncountersInnerVersionDetailsInner] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON LocationAreaDetailPokemonEncountersInner where
  parseJSON = genericParseJSON optionsLocationAreaDetailPokemonEncountersInner
instance ToJSON LocationAreaDetailPokemonEncountersInner where
  toJSON = genericToJSON optionsLocationAreaDetailPokemonEncountersInner

optionsLocationAreaDetailPokemonEncountersInner :: Options
optionsLocationAreaDetailPokemonEncountersInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("locationAreaDetailPokemonEncountersInnerPokemon", "pokemon")
      , ("locationAreaDetailPokemonEncountersInnerVersionUnderscoredetails", "version_details")
      ]


-- | 
data LocationAreaDetailPokemonEncountersInnerVersionDetailsInner = LocationAreaDetailPokemonEncountersInnerVersionDetailsInner
  { locationAreaDetailPokemonEncountersInnerVersionDetailsInnerVersion :: AbilityDetailPokemonInnerPokemon -- ^ 
  , locationAreaDetailPokemonEncountersInnerVersionDetailsInnerMaxUnderscorechance :: Int -- ^ 
  , locationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterUnderscoredetails :: LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON LocationAreaDetailPokemonEncountersInnerVersionDetailsInner where
  parseJSON = genericParseJSON optionsLocationAreaDetailPokemonEncountersInnerVersionDetailsInner
instance ToJSON LocationAreaDetailPokemonEncountersInnerVersionDetailsInner where
  toJSON = genericToJSON optionsLocationAreaDetailPokemonEncountersInnerVersionDetailsInner

optionsLocationAreaDetailPokemonEncountersInnerVersionDetailsInner :: Options
optionsLocationAreaDetailPokemonEncountersInnerVersionDetailsInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("locationAreaDetailPokemonEncountersInnerVersionDetailsInnerVersion", "version")
      , ("locationAreaDetailPokemonEncountersInnerVersionDetailsInnerMaxUnderscorechance", "max_chance")
      , ("locationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterUnderscoredetails", "encounter_details")
      ]


-- | 
data LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails = LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails
  { locationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetailsMinUnderscorelevel :: Int -- ^ 
  , locationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetailsMaxUnderscorelevel :: Int -- ^ 
  , locationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetailsConditionUnderscorevalues :: Maybe AbilityDetailPokemonInnerPokemon -- ^ 
  , locationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetailsChance :: Int -- ^ 
  , locationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetailsMethod :: AbilityDetailPokemonInnerPokemon -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails where
  parseJSON = genericParseJSON optionsLocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails
instance ToJSON LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails where
  toJSON = genericToJSON optionsLocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails

optionsLocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails :: Options
optionsLocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("locationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetailsMinUnderscorelevel", "min_level")
      , ("locationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetailsMaxUnderscorelevel", "max_level")
      , ("locationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetailsConditionUnderscorevalues", "condition_values")
      , ("locationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetailsChance", "chance")
      , ("locationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetailsMethod", "method")
      ]


-- | 
data LocationAreaName = LocationAreaName
  { locationAreaNameName :: Text -- ^ 
  , locationAreaNameLanguage :: LanguageSummary -- ^ 
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
data LocationAreaSummary = LocationAreaSummary
  { locationAreaSummaryName :: Text -- ^ 
  , locationAreaSummaryUrl :: Text -- ^ 
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
  { locationDetailId :: Int -- ^ 
  , locationDetailName :: Text -- ^ 
  , locationDetailRegion :: RegionSummary -- ^ 
  , locationDetailNames :: [LocationName] -- ^ 
  , locationDetailGameUnderscoreindices :: [LocationGameIndex] -- ^ 
  , locationDetailAreas :: [LocationAreaSummary] -- ^ 
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
  { locationGameIndexGameUnderscoreindex :: Int -- ^ 
  , locationGameIndexGeneration :: GenerationSummary -- ^ 
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
  { locationNameName :: Text -- ^ 
  , locationNameLanguage :: LanguageSummary -- ^ 
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
  { locationSummaryName :: Text -- ^ 
  , locationSummaryUrl :: Text -- ^ 
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
  { machineDetailId :: Int -- ^ 
  , machineDetailItem :: ItemSummary -- ^ 
  , machineDetailVersionUnderscoregroup :: VersionGroupSummary -- ^ 
  , machineDetailMove :: MoveSummary -- ^ 
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
  { machineSummaryUrl :: Text -- ^ 
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
  { moveBattleStyleDetailId :: Int -- ^ 
  , moveBattleStyleDetailName :: Text -- ^ 
  , moveBattleStyleDetailNames :: [MoveBattleStyleName] -- ^ 
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
  { moveBattleStyleNameName :: Text -- ^ 
  , moveBattleStyleNameLanguage :: LanguageSummary -- ^ 
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
  { moveBattleStyleSummaryName :: Text -- ^ 
  , moveBattleStyleSummaryUrl :: Text -- ^ 
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
  { moveChangeAccuracy :: Maybe Int -- ^ 
  , moveChangePower :: Maybe Int -- ^ 
  , moveChangePp :: Maybe Int -- ^ 
  , moveChangeEffectUnderscorechance :: Int -- ^ 
  , moveChangeEffectUnderscoreentries :: [MoveChangeEffectEntriesInner] -- ^ 
  , moveChangeType :: TypeSummary -- ^ 
  , moveChangeVersionUnderscoregroup :: VersionGroupSummary -- ^ 
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
data MoveChangeEffectEntriesInner = MoveChangeEffectEntriesInner
  { moveChangeEffectEntriesInnerEffect :: Text -- ^ 
  , moveChangeEffectEntriesInnerShortUnderscoreeffect :: Text -- ^ 
  , moveChangeEffectEntriesInnerLanguage :: AbilityDetailPokemonInnerPokemon -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON MoveChangeEffectEntriesInner where
  parseJSON = genericParseJSON optionsMoveChangeEffectEntriesInner
instance ToJSON MoveChangeEffectEntriesInner where
  toJSON = genericToJSON optionsMoveChangeEffectEntriesInner

optionsMoveChangeEffectEntriesInner :: Options
optionsMoveChangeEffectEntriesInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("moveChangeEffectEntriesInnerEffect", "effect")
      , ("moveChangeEffectEntriesInnerShortUnderscoreeffect", "short_effect")
      , ("moveChangeEffectEntriesInnerLanguage", "language")
      ]


-- | 
data MoveDamageClassDescription = MoveDamageClassDescription
  { moveDamageClassDescriptionDescription :: Maybe Text -- ^ 
  , moveDamageClassDescriptionLanguage :: LanguageSummary -- ^ 
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
  { moveDamageClassDetailId :: Int -- ^ 
  , moveDamageClassDetailName :: Text -- ^ 
  , moveDamageClassDetailDescriptions :: [MoveDamageClassDescription] -- ^ 
  , moveDamageClassDetailMoves :: [MoveSummary] -- ^ 
  , moveDamageClassDetailNames :: [MoveDamageClassName] -- ^ 
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
  { moveDamageClassNameName :: Text -- ^ 
  , moveDamageClassNameLanguage :: LanguageSummary -- ^ 
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
  { moveDamageClassSummaryName :: Text -- ^ 
  , moveDamageClassSummaryUrl :: Text -- ^ 
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
  { moveDetailId :: Int -- ^ 
  , moveDetailName :: Text -- ^ 
  , moveDetailAccuracy :: Maybe Int -- ^ 
  , moveDetailEffectUnderscorechance :: Int -- ^ 
  , moveDetailPp :: Maybe Int -- ^ 
  , moveDetailPriority :: Maybe Int -- ^ 
  , moveDetailPower :: Maybe Int -- ^ 
  , moveDetailContestUnderscorecombos :: MoveDetailContestCombos -- ^ 
  , moveDetailContestUnderscoretype :: ContestTypeSummary -- ^ 
  , moveDetailContestUnderscoreeffect :: ContestEffectSummary -- ^ 
  , moveDetailDamageUnderscoreclass :: MoveDamageClassSummary -- ^ 
  , moveDetailEffectUnderscoreentries :: [MoveChangeEffectEntriesInner] -- ^ 
  , moveDetailEffectUnderscorechanges :: [MoveDetailEffectChangesInner] -- ^ 
  , moveDetailGeneration :: GenerationSummary -- ^ 
  , moveDetailMeta :: MoveMeta -- ^ 
  , moveDetailNames :: [MoveName] -- ^ 
  , moveDetailPastUnderscorevalues :: [MoveChange] -- ^ 
  , moveDetailStatUnderscorechanges :: [MoveDetailStatChangesInner] -- ^ 
  , moveDetailSuperUnderscorecontestUnderscoreeffect :: SuperContestEffectSummary -- ^ 
  , moveDetailTarget :: MoveTargetSummary -- ^ 
  , moveDetailType :: TypeSummary -- ^ 
  , moveDetailMachines :: [MoveDetailMachinesInner] -- ^ 
  , moveDetailFlavorUnderscoretextUnderscoreentries :: [MoveFlavorText] -- ^ 
  , moveDetailLearnedUnderscorebyUnderscorepokemon :: [AbilityDetailPokemonInnerPokemon] -- ^ 
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
data MoveDetailContestCombos = MoveDetailContestCombos
  { moveDetailContestCombosNormal :: MoveDetailContestCombosNormal -- ^ 
  , moveDetailContestCombosSuper :: MoveDetailContestCombosNormal -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON MoveDetailContestCombos where
  parseJSON = genericParseJSON optionsMoveDetailContestCombos
instance ToJSON MoveDetailContestCombos where
  toJSON = genericToJSON optionsMoveDetailContestCombos

optionsMoveDetailContestCombos :: Options
optionsMoveDetailContestCombos =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("moveDetailContestCombosNormal", "normal")
      , ("moveDetailContestCombosSuper", "super")
      ]


-- | 
data MoveDetailContestCombosNormal = MoveDetailContestCombosNormal
  { moveDetailContestCombosNormalUseUnderscorebefore :: [AbilityDetailPokemonInnerPokemon] -- ^ 
  , moveDetailContestCombosNormalUseUnderscoreafter :: [AbilityDetailPokemonInnerPokemon] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON MoveDetailContestCombosNormal where
  parseJSON = genericParseJSON optionsMoveDetailContestCombosNormal
instance ToJSON MoveDetailContestCombosNormal where
  toJSON = genericToJSON optionsMoveDetailContestCombosNormal

optionsMoveDetailContestCombosNormal :: Options
optionsMoveDetailContestCombosNormal =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("moveDetailContestCombosNormalUseUnderscorebefore", "use_before")
      , ("moveDetailContestCombosNormalUseUnderscoreafter", "use_after")
      ]


-- | 
data MoveDetailEffectChangesInner = MoveDetailEffectChangesInner
  { moveDetailEffectChangesInnerEffectUnderscoreentries :: [MoveDetailEffectChangesInnerEffectEntriesInner] -- ^ 
  , moveDetailEffectChangesInnerVersionUnderscoregroup :: AbilityDetailPokemonInnerPokemon -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON MoveDetailEffectChangesInner where
  parseJSON = genericParseJSON optionsMoveDetailEffectChangesInner
instance ToJSON MoveDetailEffectChangesInner where
  toJSON = genericToJSON optionsMoveDetailEffectChangesInner

optionsMoveDetailEffectChangesInner :: Options
optionsMoveDetailEffectChangesInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("moveDetailEffectChangesInnerEffectUnderscoreentries", "effect_entries")
      , ("moveDetailEffectChangesInnerVersionUnderscoregroup", "version_group")
      ]


-- | 
data MoveDetailEffectChangesInnerEffectEntriesInner = MoveDetailEffectChangesInnerEffectEntriesInner
  { moveDetailEffectChangesInnerEffectEntriesInnerEffect :: Text -- ^ 
  , moveDetailEffectChangesInnerEffectEntriesInnerLanguage :: AbilityDetailPokemonInnerPokemon -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON MoveDetailEffectChangesInnerEffectEntriesInner where
  parseJSON = genericParseJSON optionsMoveDetailEffectChangesInnerEffectEntriesInner
instance ToJSON MoveDetailEffectChangesInnerEffectEntriesInner where
  toJSON = genericToJSON optionsMoveDetailEffectChangesInnerEffectEntriesInner

optionsMoveDetailEffectChangesInnerEffectEntriesInner :: Options
optionsMoveDetailEffectChangesInnerEffectEntriesInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("moveDetailEffectChangesInnerEffectEntriesInnerEffect", "effect")
      , ("moveDetailEffectChangesInnerEffectEntriesInnerLanguage", "language")
      ]


-- | 
data MoveDetailMachinesInner = MoveDetailMachinesInner
  { moveDetailMachinesInnerMachine :: MoveDetailMachinesInnerMachine -- ^ 
  , moveDetailMachinesInnerVersionUnderscoregroup :: AbilityDetailPokemonInnerPokemon -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON MoveDetailMachinesInner where
  parseJSON = genericParseJSON optionsMoveDetailMachinesInner
instance ToJSON MoveDetailMachinesInner where
  toJSON = genericToJSON optionsMoveDetailMachinesInner

optionsMoveDetailMachinesInner :: Options
optionsMoveDetailMachinesInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("moveDetailMachinesInnerMachine", "machine")
      , ("moveDetailMachinesInnerVersionUnderscoregroup", "version_group")
      ]


-- | 
data MoveDetailMachinesInnerMachine = MoveDetailMachinesInnerMachine
  { moveDetailMachinesInnerMachineUrl :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON MoveDetailMachinesInnerMachine where
  parseJSON = genericParseJSON optionsMoveDetailMachinesInnerMachine
instance ToJSON MoveDetailMachinesInnerMachine where
  toJSON = genericToJSON optionsMoveDetailMachinesInnerMachine

optionsMoveDetailMachinesInnerMachine :: Options
optionsMoveDetailMachinesInnerMachine =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("moveDetailMachinesInnerMachineUrl", "url")
      ]


-- | 
data MoveDetailStatChangesInner = MoveDetailStatChangesInner
  { moveDetailStatChangesInnerChange :: Int -- ^ 
  , moveDetailStatChangesInnerStat :: AbilityDetailPokemonInnerPokemon -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON MoveDetailStatChangesInner where
  parseJSON = genericParseJSON optionsMoveDetailStatChangesInner
instance ToJSON MoveDetailStatChangesInner where
  toJSON = genericToJSON optionsMoveDetailStatChangesInner

optionsMoveDetailStatChangesInner :: Options
optionsMoveDetailStatChangesInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("moveDetailStatChangesInnerChange", "change")
      , ("moveDetailStatChangesInnerStat", "stat")
      ]


-- | 
data MoveFlavorText = MoveFlavorText
  { moveFlavorTextFlavorUnderscoretext :: Text -- ^ 
  , moveFlavorTextLanguage :: LanguageSummary -- ^ 
  , moveFlavorTextVersionUnderscoregroup :: VersionGroupSummary -- ^ 
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
  { moveLearnMethodDescriptionDescription :: Maybe Text -- ^ 
  , moveLearnMethodDescriptionLanguage :: LanguageSummary -- ^ 
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
  { moveLearnMethodDetailId :: Int -- ^ 
  , moveLearnMethodDetailName :: Text -- ^ 
  , moveLearnMethodDetailNames :: [MoveLearnMethodName] -- ^ 
  , moveLearnMethodDetailDescriptions :: [MoveLearnMethodDescription] -- ^ 
  , moveLearnMethodDetailVersionUnderscoregroups :: [AbilityDetailPokemonInnerPokemon] -- ^ 
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
  { moveLearnMethodNameName :: Text -- ^ 
  , moveLearnMethodNameLanguage :: LanguageSummary -- ^ 
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
  { moveLearnMethodSummaryName :: Text -- ^ 
  , moveLearnMethodSummaryUrl :: Text -- ^ 
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
  { moveMetaAilment :: MoveMetaAilmentSummary -- ^ 
  , moveMetaCategory :: MoveMetaCategorySummary -- ^ 
  , moveMetaMinUnderscorehits :: Maybe Int -- ^ 
  , moveMetaMaxUnderscorehits :: Maybe Int -- ^ 
  , moveMetaMinUnderscoreturns :: Maybe Int -- ^ 
  , moveMetaMaxUnderscoreturns :: Maybe Int -- ^ 
  , moveMetaDrain :: Maybe Int -- ^ 
  , moveMetaHealing :: Maybe Int -- ^ 
  , moveMetaCritUnderscorerate :: Maybe Int -- ^ 
  , moveMetaAilmentUnderscorechance :: Maybe Int -- ^ 
  , moveMetaFlinchUnderscorechance :: Maybe Int -- ^ 
  , moveMetaStatUnderscorechance :: Maybe Int -- ^ 
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
  { moveMetaAilmentDetailId :: Int -- ^ 
  , moveMetaAilmentDetailName :: Text -- ^ 
  , moveMetaAilmentDetailMoves :: [AbilityDetailPokemonInnerPokemon] -- ^ 
  , moveMetaAilmentDetailNames :: [MoveMetaAilmentName] -- ^ 
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
  { moveMetaAilmentNameName :: Text -- ^ 
  , moveMetaAilmentNameLanguage :: LanguageSummary -- ^ 
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
  { moveMetaAilmentSummaryName :: Text -- ^ 
  , moveMetaAilmentSummaryUrl :: Text -- ^ 
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
  { moveMetaCategoryDescriptionDescription :: Maybe Text -- ^ 
  , moveMetaCategoryDescriptionLanguage :: LanguageSummary -- ^ 
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
  { moveMetaCategoryDetailId :: Int -- ^ 
  , moveMetaCategoryDetailName :: Text -- ^ 
  , moveMetaCategoryDetailDescriptions :: [MoveMetaCategoryDescription] -- ^ 
  , moveMetaCategoryDetailMoves :: [AbilityDetailPokemonInnerPokemon] -- ^ 
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
  { moveMetaCategorySummaryName :: Text -- ^ 
  , moveMetaCategorySummaryUrl :: Text -- ^ 
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
data MoveName = MoveName
  { moveNameName :: Text -- ^ 
  , moveNameLanguage :: LanguageSummary -- ^ 
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
data MoveSummary = MoveSummary
  { moveSummaryName :: Text -- ^ 
  , moveSummaryUrl :: Text -- ^ 
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
  { moveTargetDescriptionDescription :: Maybe Text -- ^ 
  , moveTargetDescriptionLanguage :: LanguageSummary -- ^ 
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
  { moveTargetDetailId :: Int -- ^ 
  , moveTargetDetailName :: Text -- ^ 
  , moveTargetDetailDescriptions :: [MoveTargetDescription] -- ^ 
  , moveTargetDetailMoves :: [MoveSummary] -- ^ 
  , moveTargetDetailNames :: [MoveTargetName] -- ^ 
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
  { moveTargetNameName :: Text -- ^ 
  , moveTargetNameLanguage :: LanguageSummary -- ^ 
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
  { moveTargetSummaryName :: Text -- ^ 
  , moveTargetSummaryUrl :: Text -- ^ 
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
  { natureBattleStylePreferenceLowUnderscorehpUnderscorepreference :: Int -- ^ 
  , natureBattleStylePreferenceHighUnderscorehpUnderscorepreference :: Int -- ^ 
  , natureBattleStylePreferenceMoveUnderscorebattleUnderscorestyle :: MoveBattleStyleSummary -- ^ 
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
  { natureDetailId :: Int -- ^ 
  , natureDetailName :: Text -- ^ 
  , natureDetailDecreasedUnderscorestat :: StatSummary -- ^ 
  , natureDetailIncreasedUnderscorestat :: StatSummary -- ^ 
  , natureDetailLikesUnderscoreflavor :: BerryFlavorSummary -- ^ 
  , natureDetailHatesUnderscoreflavor :: BerryFlavorSummary -- ^ 
  , natureDetailBerries :: [BerrySummary] -- ^ 
  , natureDetailPokeathlonUnderscorestatUnderscorechanges :: [NatureDetailPokeathlonStatChangesInner] -- ^ 
  , natureDetailMoveUnderscorebattleUnderscorestyleUnderscorepreferences :: [NatureBattleStylePreference] -- ^ 
  , natureDetailNames :: [NatureName] -- ^ 
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
      , ("natureDetailBerries", "berries")
      , ("natureDetailPokeathlonUnderscorestatUnderscorechanges", "pokeathlon_stat_changes")
      , ("natureDetailMoveUnderscorebattleUnderscorestyleUnderscorepreferences", "move_battle_style_preferences")
      , ("natureDetailNames", "names")
      ]


-- | 
data NatureDetailPokeathlonStatChangesInner = NatureDetailPokeathlonStatChangesInner
  { natureDetailPokeathlonStatChangesInnerMaxUnderscorechange :: Int -- ^ 
  , natureDetailPokeathlonStatChangesInnerPokeathlonUnderscorestat :: AbilityDetailPokemonInnerPokemon -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON NatureDetailPokeathlonStatChangesInner where
  parseJSON = genericParseJSON optionsNatureDetailPokeathlonStatChangesInner
instance ToJSON NatureDetailPokeathlonStatChangesInner where
  toJSON = genericToJSON optionsNatureDetailPokeathlonStatChangesInner

optionsNatureDetailPokeathlonStatChangesInner :: Options
optionsNatureDetailPokeathlonStatChangesInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("natureDetailPokeathlonStatChangesInnerMaxUnderscorechange", "max_change")
      , ("natureDetailPokeathlonStatChangesInnerPokeathlonUnderscorestat", "pokeathlon_stat")
      ]


-- | 
data NatureName = NatureName
  { natureNameName :: Text -- ^ 
  , natureNameLanguage :: LanguageSummary -- ^ 
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
data NatureSummary = NatureSummary
  { natureSummaryName :: Text -- ^ 
  , natureSummaryUrl :: Text -- ^ 
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
  { paginatedAbilitySummaryListCount :: Maybe Int -- ^ 
  , paginatedAbilitySummaryListNext :: Maybe Text -- ^ 
  , paginatedAbilitySummaryListPrevious :: Maybe Text -- ^ 
  , paginatedAbilitySummaryListResults :: Maybe [AbilitySummary] -- ^ 
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
  { paginatedBerryFirmnessSummaryListCount :: Maybe Int -- ^ 
  , paginatedBerryFirmnessSummaryListNext :: Maybe Text -- ^ 
  , paginatedBerryFirmnessSummaryListPrevious :: Maybe Text -- ^ 
  , paginatedBerryFirmnessSummaryListResults :: Maybe [BerryFirmnessSummary] -- ^ 
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
  { paginatedBerryFlavorSummaryListCount :: Maybe Int -- ^ 
  , paginatedBerryFlavorSummaryListNext :: Maybe Text -- ^ 
  , paginatedBerryFlavorSummaryListPrevious :: Maybe Text -- ^ 
  , paginatedBerryFlavorSummaryListResults :: Maybe [BerryFlavorSummary] -- ^ 
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
  { paginatedBerrySummaryListCount :: Maybe Int -- ^ 
  , paginatedBerrySummaryListNext :: Maybe Text -- ^ 
  , paginatedBerrySummaryListPrevious :: Maybe Text -- ^ 
  , paginatedBerrySummaryListResults :: Maybe [BerrySummary] -- ^ 
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
  { paginatedCharacteristicSummaryListCount :: Maybe Int -- ^ 
  , paginatedCharacteristicSummaryListNext :: Maybe Text -- ^ 
  , paginatedCharacteristicSummaryListPrevious :: Maybe Text -- ^ 
  , paginatedCharacteristicSummaryListResults :: Maybe [CharacteristicSummary] -- ^ 
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
  { paginatedContestEffectSummaryListCount :: Maybe Int -- ^ 
  , paginatedContestEffectSummaryListNext :: Maybe Text -- ^ 
  , paginatedContestEffectSummaryListPrevious :: Maybe Text -- ^ 
  , paginatedContestEffectSummaryListResults :: Maybe [ContestEffectSummary] -- ^ 
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
  { paginatedContestTypeSummaryListCount :: Maybe Int -- ^ 
  , paginatedContestTypeSummaryListNext :: Maybe Text -- ^ 
  , paginatedContestTypeSummaryListPrevious :: Maybe Text -- ^ 
  , paginatedContestTypeSummaryListResults :: Maybe [ContestTypeSummary] -- ^ 
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
data PaginatedEggGroupSummaryList = PaginatedEggGroupSummaryList
  { paginatedEggGroupSummaryListCount :: Maybe Int -- ^ 
  , paginatedEggGroupSummaryListNext :: Maybe Text -- ^ 
  , paginatedEggGroupSummaryListPrevious :: Maybe Text -- ^ 
  , paginatedEggGroupSummaryListResults :: Maybe [EggGroupSummary] -- ^ 
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
  { paginatedEncounterConditionSummaryListCount :: Maybe Int -- ^ 
  , paginatedEncounterConditionSummaryListNext :: Maybe Text -- ^ 
  , paginatedEncounterConditionSummaryListPrevious :: Maybe Text -- ^ 
  , paginatedEncounterConditionSummaryListResults :: Maybe [EncounterConditionSummary] -- ^ 
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
  { paginatedEncounterConditionValueSummaryListCount :: Maybe Int -- ^ 
  , paginatedEncounterConditionValueSummaryListNext :: Maybe Text -- ^ 
  , paginatedEncounterConditionValueSummaryListPrevious :: Maybe Text -- ^ 
  , paginatedEncounterConditionValueSummaryListResults :: Maybe [EncounterConditionValueSummary] -- ^ 
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
  { paginatedEncounterMethodSummaryListCount :: Maybe Int -- ^ 
  , paginatedEncounterMethodSummaryListNext :: Maybe Text -- ^ 
  , paginatedEncounterMethodSummaryListPrevious :: Maybe Text -- ^ 
  , paginatedEncounterMethodSummaryListResults :: Maybe [EncounterMethodSummary] -- ^ 
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
  { paginatedEvolutionChainSummaryListCount :: Maybe Int -- ^ 
  , paginatedEvolutionChainSummaryListNext :: Maybe Text -- ^ 
  , paginatedEvolutionChainSummaryListPrevious :: Maybe Text -- ^ 
  , paginatedEvolutionChainSummaryListResults :: Maybe [EvolutionChainSummary] -- ^ 
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
  { paginatedEvolutionTriggerSummaryListCount :: Maybe Int -- ^ 
  , paginatedEvolutionTriggerSummaryListNext :: Maybe Text -- ^ 
  , paginatedEvolutionTriggerSummaryListPrevious :: Maybe Text -- ^ 
  , paginatedEvolutionTriggerSummaryListResults :: Maybe [EvolutionTriggerSummary] -- ^ 
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
data PaginatedGenderSummaryList = PaginatedGenderSummaryList
  { paginatedGenderSummaryListCount :: Maybe Int -- ^ 
  , paginatedGenderSummaryListNext :: Maybe Text -- ^ 
  , paginatedGenderSummaryListPrevious :: Maybe Text -- ^ 
  , paginatedGenderSummaryListResults :: Maybe [GenderSummary] -- ^ 
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
  { paginatedGenerationSummaryListCount :: Maybe Int -- ^ 
  , paginatedGenerationSummaryListNext :: Maybe Text -- ^ 
  , paginatedGenerationSummaryListPrevious :: Maybe Text -- ^ 
  , paginatedGenerationSummaryListResults :: Maybe [GenerationSummary] -- ^ 
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
  { paginatedGrowthRateSummaryListCount :: Maybe Int -- ^ 
  , paginatedGrowthRateSummaryListNext :: Maybe Text -- ^ 
  , paginatedGrowthRateSummaryListPrevious :: Maybe Text -- ^ 
  , paginatedGrowthRateSummaryListResults :: Maybe [GrowthRateSummary] -- ^ 
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
  { paginatedItemAttributeSummaryListCount :: Maybe Int -- ^ 
  , paginatedItemAttributeSummaryListNext :: Maybe Text -- ^ 
  , paginatedItemAttributeSummaryListPrevious :: Maybe Text -- ^ 
  , paginatedItemAttributeSummaryListResults :: Maybe [ItemAttributeSummary] -- ^ 
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
  { paginatedItemCategorySummaryListCount :: Maybe Int -- ^ 
  , paginatedItemCategorySummaryListNext :: Maybe Text -- ^ 
  , paginatedItemCategorySummaryListPrevious :: Maybe Text -- ^ 
  , paginatedItemCategorySummaryListResults :: Maybe [ItemCategorySummary] -- ^ 
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
  { paginatedItemFlingEffectSummaryListCount :: Maybe Int -- ^ 
  , paginatedItemFlingEffectSummaryListNext :: Maybe Text -- ^ 
  , paginatedItemFlingEffectSummaryListPrevious :: Maybe Text -- ^ 
  , paginatedItemFlingEffectSummaryListResults :: Maybe [ItemFlingEffectSummary] -- ^ 
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
  { paginatedItemPocketSummaryListCount :: Maybe Int -- ^ 
  , paginatedItemPocketSummaryListNext :: Maybe Text -- ^ 
  , paginatedItemPocketSummaryListPrevious :: Maybe Text -- ^ 
  , paginatedItemPocketSummaryListResults :: Maybe [ItemPocketSummary] -- ^ 
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
  { paginatedItemSummaryListCount :: Maybe Int -- ^ 
  , paginatedItemSummaryListNext :: Maybe Text -- ^ 
  , paginatedItemSummaryListPrevious :: Maybe Text -- ^ 
  , paginatedItemSummaryListResults :: Maybe [ItemSummary] -- ^ 
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
  { paginatedLanguageSummaryListCount :: Maybe Int -- ^ 
  , paginatedLanguageSummaryListNext :: Maybe Text -- ^ 
  , paginatedLanguageSummaryListPrevious :: Maybe Text -- ^ 
  , paginatedLanguageSummaryListResults :: Maybe [LanguageSummary] -- ^ 
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
  { paginatedLocationAreaSummaryListCount :: Maybe Int -- ^ 
  , paginatedLocationAreaSummaryListNext :: Maybe Text -- ^ 
  , paginatedLocationAreaSummaryListPrevious :: Maybe Text -- ^ 
  , paginatedLocationAreaSummaryListResults :: Maybe [LocationAreaSummary] -- ^ 
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
  { paginatedLocationSummaryListCount :: Maybe Int -- ^ 
  , paginatedLocationSummaryListNext :: Maybe Text -- ^ 
  , paginatedLocationSummaryListPrevious :: Maybe Text -- ^ 
  , paginatedLocationSummaryListResults :: Maybe [LocationSummary] -- ^ 
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
  { paginatedMachineSummaryListCount :: Maybe Int -- ^ 
  , paginatedMachineSummaryListNext :: Maybe Text -- ^ 
  , paginatedMachineSummaryListPrevious :: Maybe Text -- ^ 
  , paginatedMachineSummaryListResults :: Maybe [MachineSummary] -- ^ 
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
  { paginatedMoveBattleStyleSummaryListCount :: Maybe Int -- ^ 
  , paginatedMoveBattleStyleSummaryListNext :: Maybe Text -- ^ 
  , paginatedMoveBattleStyleSummaryListPrevious :: Maybe Text -- ^ 
  , paginatedMoveBattleStyleSummaryListResults :: Maybe [MoveBattleStyleSummary] -- ^ 
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
  { paginatedMoveDamageClassSummaryListCount :: Maybe Int -- ^ 
  , paginatedMoveDamageClassSummaryListNext :: Maybe Text -- ^ 
  , paginatedMoveDamageClassSummaryListPrevious :: Maybe Text -- ^ 
  , paginatedMoveDamageClassSummaryListResults :: Maybe [MoveDamageClassSummary] -- ^ 
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
  { paginatedMoveLearnMethodSummaryListCount :: Maybe Int -- ^ 
  , paginatedMoveLearnMethodSummaryListNext :: Maybe Text -- ^ 
  , paginatedMoveLearnMethodSummaryListPrevious :: Maybe Text -- ^ 
  , paginatedMoveLearnMethodSummaryListResults :: Maybe [MoveLearnMethodSummary] -- ^ 
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
  { paginatedMoveMetaAilmentSummaryListCount :: Maybe Int -- ^ 
  , paginatedMoveMetaAilmentSummaryListNext :: Maybe Text -- ^ 
  , paginatedMoveMetaAilmentSummaryListPrevious :: Maybe Text -- ^ 
  , paginatedMoveMetaAilmentSummaryListResults :: Maybe [MoveMetaAilmentSummary] -- ^ 
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
  { paginatedMoveMetaCategorySummaryListCount :: Maybe Int -- ^ 
  , paginatedMoveMetaCategorySummaryListNext :: Maybe Text -- ^ 
  , paginatedMoveMetaCategorySummaryListPrevious :: Maybe Text -- ^ 
  , paginatedMoveMetaCategorySummaryListResults :: Maybe [MoveMetaCategorySummary] -- ^ 
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
  { paginatedMoveSummaryListCount :: Maybe Int -- ^ 
  , paginatedMoveSummaryListNext :: Maybe Text -- ^ 
  , paginatedMoveSummaryListPrevious :: Maybe Text -- ^ 
  , paginatedMoveSummaryListResults :: Maybe [MoveSummary] -- ^ 
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
  { paginatedMoveTargetSummaryListCount :: Maybe Int -- ^ 
  , paginatedMoveTargetSummaryListNext :: Maybe Text -- ^ 
  , paginatedMoveTargetSummaryListPrevious :: Maybe Text -- ^ 
  , paginatedMoveTargetSummaryListResults :: Maybe [MoveTargetSummary] -- ^ 
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
  { paginatedNatureSummaryListCount :: Maybe Int -- ^ 
  , paginatedNatureSummaryListNext :: Maybe Text -- ^ 
  , paginatedNatureSummaryListPrevious :: Maybe Text -- ^ 
  , paginatedNatureSummaryListResults :: Maybe [NatureSummary] -- ^ 
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
  { paginatedPalParkAreaSummaryListCount :: Maybe Int -- ^ 
  , paginatedPalParkAreaSummaryListNext :: Maybe Text -- ^ 
  , paginatedPalParkAreaSummaryListPrevious :: Maybe Text -- ^ 
  , paginatedPalParkAreaSummaryListResults :: Maybe [PalParkAreaSummary] -- ^ 
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
  { paginatedPokeathlonStatSummaryListCount :: Maybe Int -- ^ 
  , paginatedPokeathlonStatSummaryListNext :: Maybe Text -- ^ 
  , paginatedPokeathlonStatSummaryListPrevious :: Maybe Text -- ^ 
  , paginatedPokeathlonStatSummaryListResults :: Maybe [PokeathlonStatSummary] -- ^ 
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
  { paginatedPokedexSummaryListCount :: Maybe Int -- ^ 
  , paginatedPokedexSummaryListNext :: Maybe Text -- ^ 
  , paginatedPokedexSummaryListPrevious :: Maybe Text -- ^ 
  , paginatedPokedexSummaryListResults :: Maybe [PokedexSummary] -- ^ 
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
  { paginatedPokemonColorSummaryListCount :: Maybe Int -- ^ 
  , paginatedPokemonColorSummaryListNext :: Maybe Text -- ^ 
  , paginatedPokemonColorSummaryListPrevious :: Maybe Text -- ^ 
  , paginatedPokemonColorSummaryListResults :: Maybe [PokemonColorSummary] -- ^ 
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
  { paginatedPokemonFormSummaryListCount :: Maybe Int -- ^ 
  , paginatedPokemonFormSummaryListNext :: Maybe Text -- ^ 
  , paginatedPokemonFormSummaryListPrevious :: Maybe Text -- ^ 
  , paginatedPokemonFormSummaryListResults :: Maybe [PokemonFormSummary] -- ^ 
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
  { paginatedPokemonHabitatSummaryListCount :: Maybe Int -- ^ 
  , paginatedPokemonHabitatSummaryListNext :: Maybe Text -- ^ 
  , paginatedPokemonHabitatSummaryListPrevious :: Maybe Text -- ^ 
  , paginatedPokemonHabitatSummaryListResults :: Maybe [PokemonHabitatSummary] -- ^ 
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
  { paginatedPokemonShapeSummaryListCount :: Maybe Int -- ^ 
  , paginatedPokemonShapeSummaryListNext :: Maybe Text -- ^ 
  , paginatedPokemonShapeSummaryListPrevious :: Maybe Text -- ^ 
  , paginatedPokemonShapeSummaryListResults :: Maybe [PokemonShapeSummary] -- ^ 
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
  { paginatedPokemonSpeciesSummaryListCount :: Maybe Int -- ^ 
  , paginatedPokemonSpeciesSummaryListNext :: Maybe Text -- ^ 
  , paginatedPokemonSpeciesSummaryListPrevious :: Maybe Text -- ^ 
  , paginatedPokemonSpeciesSummaryListResults :: Maybe [PokemonSpeciesSummary] -- ^ 
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
  { paginatedPokemonSummaryListCount :: Maybe Int -- ^ 
  , paginatedPokemonSummaryListNext :: Maybe Text -- ^ 
  , paginatedPokemonSummaryListPrevious :: Maybe Text -- ^ 
  , paginatedPokemonSummaryListResults :: Maybe [PokemonSummary] -- ^ 
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
  { paginatedRegionSummaryListCount :: Maybe Int -- ^ 
  , paginatedRegionSummaryListNext :: Maybe Text -- ^ 
  , paginatedRegionSummaryListPrevious :: Maybe Text -- ^ 
  , paginatedRegionSummaryListResults :: Maybe [RegionSummary] -- ^ 
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
  { paginatedStatSummaryListCount :: Maybe Int -- ^ 
  , paginatedStatSummaryListNext :: Maybe Text -- ^ 
  , paginatedStatSummaryListPrevious :: Maybe Text -- ^ 
  , paginatedStatSummaryListResults :: Maybe [StatSummary] -- ^ 
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
  { paginatedSuperContestEffectSummaryListCount :: Maybe Int -- ^ 
  , paginatedSuperContestEffectSummaryListNext :: Maybe Text -- ^ 
  , paginatedSuperContestEffectSummaryListPrevious :: Maybe Text -- ^ 
  , paginatedSuperContestEffectSummaryListResults :: Maybe [SuperContestEffectSummary] -- ^ 
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
  { paginatedTypeSummaryListCount :: Maybe Int -- ^ 
  , paginatedTypeSummaryListNext :: Maybe Text -- ^ 
  , paginatedTypeSummaryListPrevious :: Maybe Text -- ^ 
  , paginatedTypeSummaryListResults :: Maybe [TypeSummary] -- ^ 
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
  { paginatedVersionGroupSummaryListCount :: Maybe Int -- ^ 
  , paginatedVersionGroupSummaryListNext :: Maybe Text -- ^ 
  , paginatedVersionGroupSummaryListPrevious :: Maybe Text -- ^ 
  , paginatedVersionGroupSummaryListResults :: Maybe [VersionGroupSummary] -- ^ 
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
  { paginatedVersionSummaryListCount :: Maybe Int -- ^ 
  , paginatedVersionSummaryListNext :: Maybe Text -- ^ 
  , paginatedVersionSummaryListPrevious :: Maybe Text -- ^ 
  , paginatedVersionSummaryListResults :: Maybe [VersionSummary] -- ^ 
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
  { palParkAreaDetailId :: Int -- ^ 
  , palParkAreaDetailName :: Text -- ^ 
  , palParkAreaDetailNames :: [PalParkAreaName] -- ^ 
  , palParkAreaDetailPokemonUnderscoreencounters :: [PalParkAreaDetailPokemonEncountersInner] -- ^ 
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
data PalParkAreaDetailPokemonEncountersInner = PalParkAreaDetailPokemonEncountersInner
  { palParkAreaDetailPokemonEncountersInnerBaseUnderscorescore :: Int -- ^ 
  , palParkAreaDetailPokemonEncountersInnerPokemonDashspecies :: AbilityDetailPokemonInnerPokemon -- ^ 
  , palParkAreaDetailPokemonEncountersInnerRate :: Int -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON PalParkAreaDetailPokemonEncountersInner where
  parseJSON = genericParseJSON optionsPalParkAreaDetailPokemonEncountersInner
instance ToJSON PalParkAreaDetailPokemonEncountersInner where
  toJSON = genericToJSON optionsPalParkAreaDetailPokemonEncountersInner

optionsPalParkAreaDetailPokemonEncountersInner :: Options
optionsPalParkAreaDetailPokemonEncountersInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("palParkAreaDetailPokemonEncountersInnerBaseUnderscorescore", "base_score")
      , ("palParkAreaDetailPokemonEncountersInnerPokemonDashspecies", "pokemon-species")
      , ("palParkAreaDetailPokemonEncountersInnerRate", "rate")
      ]


-- | 
data PalParkAreaName = PalParkAreaName
  { palParkAreaNameName :: Text -- ^ 
  , palParkAreaNameLanguage :: LanguageSummary -- ^ 
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
  { palParkAreaSummaryName :: Text -- ^ 
  , palParkAreaSummaryUrl :: Text -- ^ 
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
data PokeathlonStatDetail = PokeathlonStatDetail
  { pokeathlonStatDetailId :: Int -- ^ 
  , pokeathlonStatDetailName :: Text -- ^ 
  , pokeathlonStatDetailAffectingUnderscorenatures :: PokeathlonStatDetailAffectingNatures -- ^ 
  , pokeathlonStatDetailNames :: [PokeathlonStatName] -- ^ 
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
data PokeathlonStatDetailAffectingNatures = PokeathlonStatDetailAffectingNatures
  { pokeathlonStatDetailAffectingNaturesDecrease :: [PokeathlonStatDetailAffectingNaturesDecreaseInner] -- ^ 
  , pokeathlonStatDetailAffectingNaturesIncrease :: [PokeathlonStatDetailAffectingNaturesIncreaseInner] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON PokeathlonStatDetailAffectingNatures where
  parseJSON = genericParseJSON optionsPokeathlonStatDetailAffectingNatures
instance ToJSON PokeathlonStatDetailAffectingNatures where
  toJSON = genericToJSON optionsPokeathlonStatDetailAffectingNatures

optionsPokeathlonStatDetailAffectingNatures :: Options
optionsPokeathlonStatDetailAffectingNatures =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokeathlonStatDetailAffectingNaturesDecrease", "decrease")
      , ("pokeathlonStatDetailAffectingNaturesIncrease", "increase")
      ]


-- | 
data PokeathlonStatDetailAffectingNaturesDecreaseInner = PokeathlonStatDetailAffectingNaturesDecreaseInner
  { pokeathlonStatDetailAffectingNaturesDecreaseInnerMaxUnderscorechange :: Int -- ^ 
  , pokeathlonStatDetailAffectingNaturesDecreaseInnerNature :: AbilityDetailPokemonInnerPokemon -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON PokeathlonStatDetailAffectingNaturesDecreaseInner where
  parseJSON = genericParseJSON optionsPokeathlonStatDetailAffectingNaturesDecreaseInner
instance ToJSON PokeathlonStatDetailAffectingNaturesDecreaseInner where
  toJSON = genericToJSON optionsPokeathlonStatDetailAffectingNaturesDecreaseInner

optionsPokeathlonStatDetailAffectingNaturesDecreaseInner :: Options
optionsPokeathlonStatDetailAffectingNaturesDecreaseInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokeathlonStatDetailAffectingNaturesDecreaseInnerMaxUnderscorechange", "max_change")
      , ("pokeathlonStatDetailAffectingNaturesDecreaseInnerNature", "nature")
      ]


-- | 
data PokeathlonStatDetailAffectingNaturesIncreaseInner = PokeathlonStatDetailAffectingNaturesIncreaseInner
  { pokeathlonStatDetailAffectingNaturesIncreaseInnerMaxUnderscorechange :: Int -- ^ 
  , pokeathlonStatDetailAffectingNaturesIncreaseInnerNature :: AbilityDetailPokemonInnerPokemon -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON PokeathlonStatDetailAffectingNaturesIncreaseInner where
  parseJSON = genericParseJSON optionsPokeathlonStatDetailAffectingNaturesIncreaseInner
instance ToJSON PokeathlonStatDetailAffectingNaturesIncreaseInner where
  toJSON = genericToJSON optionsPokeathlonStatDetailAffectingNaturesIncreaseInner

optionsPokeathlonStatDetailAffectingNaturesIncreaseInner :: Options
optionsPokeathlonStatDetailAffectingNaturesIncreaseInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokeathlonStatDetailAffectingNaturesIncreaseInnerMaxUnderscorechange", "max_change")
      , ("pokeathlonStatDetailAffectingNaturesIncreaseInnerNature", "nature")
      ]


-- | 
data PokeathlonStatName = PokeathlonStatName
  { pokeathlonStatNameName :: Text -- ^ 
  , pokeathlonStatNameLanguage :: LanguageSummary -- ^ 
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
  { pokeathlonStatSummaryName :: Text -- ^ 
  , pokeathlonStatSummaryUrl :: Text -- ^ 
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
  { pokedexDescriptionDescription :: Maybe Text -- ^ 
  , pokedexDescriptionLanguage :: LanguageSummary -- ^ 
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
  { pokedexDetailId :: Int -- ^ 
  , pokedexDetailName :: Text -- ^ 
  , pokedexDetailIsUnderscoremainUnderscoreseries :: Maybe Bool -- ^ 
  , pokedexDetailDescriptions :: [PokedexDescription] -- ^ 
  , pokedexDetailNames :: [PokedexName] -- ^ 
  , pokedexDetailPokemonUnderscoreentries :: [PokedexDetailPokemonEntriesInner] -- ^ 
  , pokedexDetailRegion :: RegionSummary -- ^ 
  , pokedexDetailVersionUnderscoregroups :: [AbilityDetailPokemonInnerPokemon] -- ^ 
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
data PokedexDetailPokemonEntriesInner = PokedexDetailPokemonEntriesInner
  { pokedexDetailPokemonEntriesInnerEntryUnderscorenumber :: Int -- ^ 
  , pokedexDetailPokemonEntriesInnerPokemonUnderscorespecies :: AbilityDetailPokemonInnerPokemon -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON PokedexDetailPokemonEntriesInner where
  parseJSON = genericParseJSON optionsPokedexDetailPokemonEntriesInner
instance ToJSON PokedexDetailPokemonEntriesInner where
  toJSON = genericToJSON optionsPokedexDetailPokemonEntriesInner

optionsPokedexDetailPokemonEntriesInner :: Options
optionsPokedexDetailPokemonEntriesInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokedexDetailPokemonEntriesInnerEntryUnderscorenumber", "entry_number")
      , ("pokedexDetailPokemonEntriesInnerPokemonUnderscorespecies", "pokemon_species")
      ]


-- | 
data PokedexName = PokedexName
  { pokedexNameName :: Text -- ^ 
  , pokedexNameLanguage :: LanguageSummary -- ^ 
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
  { pokedexSummaryName :: Text -- ^ 
  , pokedexSummaryUrl :: Text -- ^ 
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
data PokemonColorDetail = PokemonColorDetail
  { pokemonColorDetailId :: Int -- ^ 
  , pokemonColorDetailName :: Text -- ^ 
  , pokemonColorDetailNames :: [PokemonColorName] -- ^ 
  , pokemonColorDetailPokemonUnderscorespecies :: [PokemonSpeciesSummary] -- ^ 
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
  { pokemonColorNameName :: Text -- ^ 
  , pokemonColorNameLanguage :: LanguageSummary -- ^ 
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
  { pokemonColorSummaryName :: Text -- ^ 
  , pokemonColorSummaryUrl :: Text -- ^ 
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
data PokemonDetail = PokemonDetail
  { pokemonDetailId :: Int -- ^ 
  , pokemonDetailName :: Text -- ^ 
  , pokemonDetailBaseUnderscoreexperience :: Maybe Int -- ^ 
  , pokemonDetailHeight :: Maybe Int -- ^ 
  , pokemonDetailIsUnderscoredefault :: Maybe Bool -- ^ 
  , pokemonDetailOrder :: Maybe Int -- ^ 
  , pokemonDetailWeight :: Maybe Int -- ^ 
  , pokemonDetailAbilities :: [PokemonDetailAbilitiesInner] -- ^ 
  , pokemonDetailPastUnderscoreabilities :: [PokemonDetailPastAbilitiesInner] -- ^ 
  , pokemonDetailForms :: [PokemonFormSummary] -- ^ 
  , pokemonDetailGameUnderscoreindices :: [PokemonGameIndex] -- ^ 
  , pokemonDetailHeldUnderscoreitems :: PokemonDetailHeldItems -- ^ 
  , pokemonDetailLocationUnderscoreareaUnderscoreencounters :: Text -- ^ 
  , pokemonDetailMoves :: [PokemonDetailMovesInner] -- ^ 
  , pokemonDetailSpecies :: PokemonSpeciesSummary -- ^ 
  , pokemonDetailSprites :: PokemonDetailSprites -- ^ 
  , pokemonDetailCries :: PokemonDetailCries -- ^ 
  , pokemonDetailStats :: [PokemonStat] -- ^ 
  , pokemonDetailTypes :: [PokemonDetailTypesInner] -- ^ 
  , pokemonDetailPastUnderscoretypes :: [PokemonDetailPastTypesInner] -- ^ 
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
      , ("pokemonDetailTypes", "types")
      , ("pokemonDetailPastUnderscoretypes", "past_types")
      ]


-- | 
data PokemonDetailAbilitiesInner = PokemonDetailAbilitiesInner
  { pokemonDetailAbilitiesInnerAbility :: AbilityDetailPokemonInnerPokemon -- ^ 
  , pokemonDetailAbilitiesInnerIsUnderscorehidden :: Bool -- ^ 
  , pokemonDetailAbilitiesInnerSlot :: Int -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonDetailAbilitiesInner where
  parseJSON = genericParseJSON optionsPokemonDetailAbilitiesInner
instance ToJSON PokemonDetailAbilitiesInner where
  toJSON = genericToJSON optionsPokemonDetailAbilitiesInner

optionsPokemonDetailAbilitiesInner :: Options
optionsPokemonDetailAbilitiesInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonDetailAbilitiesInnerAbility", "ability")
      , ("pokemonDetailAbilitiesInnerIsUnderscorehidden", "is_hidden")
      , ("pokemonDetailAbilitiesInnerSlot", "slot")
      ]


-- | 
data PokemonDetailCries = PokemonDetailCries
  { pokemonDetailCriesLatest :: Text -- ^ 
  , pokemonDetailCriesLegacy :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonDetailCries where
  parseJSON = genericParseJSON optionsPokemonDetailCries
instance ToJSON PokemonDetailCries where
  toJSON = genericToJSON optionsPokemonDetailCries

optionsPokemonDetailCries :: Options
optionsPokemonDetailCries =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonDetailCriesLatest", "latest")
      , ("pokemonDetailCriesLegacy", "legacy")
      ]


-- | 
data PokemonDetailHeldItems = PokemonDetailHeldItems
  { pokemonDetailHeldItemsItem :: AbilityDetailPokemonInnerPokemon -- ^ 
  , pokemonDetailHeldItemsVersionUnderscoredetails :: [ItemDetailHeldByPokemonInnerVersionDetailsInner] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonDetailHeldItems where
  parseJSON = genericParseJSON optionsPokemonDetailHeldItems
instance ToJSON PokemonDetailHeldItems where
  toJSON = genericToJSON optionsPokemonDetailHeldItems

optionsPokemonDetailHeldItems :: Options
optionsPokemonDetailHeldItems =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonDetailHeldItemsItem", "item")
      , ("pokemonDetailHeldItemsVersionUnderscoredetails", "version_details")
      ]


-- | 
data PokemonDetailMovesInner = PokemonDetailMovesInner
  { pokemonDetailMovesInnerMove :: AbilityDetailPokemonInnerPokemon -- ^ 
  , pokemonDetailMovesInnerVersionUnderscoregroupUnderscoredetails :: [PokemonDetailMovesInnerVersionGroupDetailsInner] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonDetailMovesInner where
  parseJSON = genericParseJSON optionsPokemonDetailMovesInner
instance ToJSON PokemonDetailMovesInner where
  toJSON = genericToJSON optionsPokemonDetailMovesInner

optionsPokemonDetailMovesInner :: Options
optionsPokemonDetailMovesInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonDetailMovesInnerMove", "move")
      , ("pokemonDetailMovesInnerVersionUnderscoregroupUnderscoredetails", "version_group_details")
      ]


-- | 
data PokemonDetailMovesInnerVersionGroupDetailsInner = PokemonDetailMovesInnerVersionGroupDetailsInner
  { pokemonDetailMovesInnerVersionGroupDetailsInnerLevelUnderscorelearnedUnderscoreat :: Int -- ^ 
  , pokemonDetailMovesInnerVersionGroupDetailsInnerMoveUnderscorelearnUnderscoremethod :: AbilityDetailPokemonInnerPokemon -- ^ 
  , pokemonDetailMovesInnerVersionGroupDetailsInnerVersionUnderscoregroup :: AbilityDetailPokemonInnerPokemon -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonDetailMovesInnerVersionGroupDetailsInner where
  parseJSON = genericParseJSON optionsPokemonDetailMovesInnerVersionGroupDetailsInner
instance ToJSON PokemonDetailMovesInnerVersionGroupDetailsInner where
  toJSON = genericToJSON optionsPokemonDetailMovesInnerVersionGroupDetailsInner

optionsPokemonDetailMovesInnerVersionGroupDetailsInner :: Options
optionsPokemonDetailMovesInnerVersionGroupDetailsInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonDetailMovesInnerVersionGroupDetailsInnerLevelUnderscorelearnedUnderscoreat", "level_learned_at")
      , ("pokemonDetailMovesInnerVersionGroupDetailsInnerMoveUnderscorelearnUnderscoremethod", "move_learn_method")
      , ("pokemonDetailMovesInnerVersionGroupDetailsInnerVersionUnderscoregroup", "version_group")
      ]


-- | 
data PokemonDetailPastAbilitiesInner = PokemonDetailPastAbilitiesInner
  { pokemonDetailPastAbilitiesInnerAbilities :: [PokemonDetailAbilitiesInner] -- ^ 
  , pokemonDetailPastAbilitiesInnerGeneration :: AbilityDetailPokemonInnerPokemon -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonDetailPastAbilitiesInner where
  parseJSON = genericParseJSON optionsPokemonDetailPastAbilitiesInner
instance ToJSON PokemonDetailPastAbilitiesInner where
  toJSON = genericToJSON optionsPokemonDetailPastAbilitiesInner

optionsPokemonDetailPastAbilitiesInner :: Options
optionsPokemonDetailPastAbilitiesInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonDetailPastAbilitiesInnerAbilities", "abilities")
      , ("pokemonDetailPastAbilitiesInnerGeneration", "generation")
      ]


-- | 
data PokemonDetailPastTypesInner = PokemonDetailPastTypesInner
  { pokemonDetailPastTypesInnerGeneration :: AbilityDetailPokemonInnerPokemon -- ^ 
  , pokemonDetailPastTypesInnerTypes :: [PokemonDetailTypesInner] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonDetailPastTypesInner where
  parseJSON = genericParseJSON optionsPokemonDetailPastTypesInner
instance ToJSON PokemonDetailPastTypesInner where
  toJSON = genericToJSON optionsPokemonDetailPastTypesInner

optionsPokemonDetailPastTypesInner :: Options
optionsPokemonDetailPastTypesInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonDetailPastTypesInnerGeneration", "generation")
      , ("pokemonDetailPastTypesInnerTypes", "types")
      ]


-- | 
newtype PokemonDetailSprites = PokemonDetailSprites { unPokemonDetailSprites :: (Map.Map Text Text) }
  deriving (Show, Eq, FromJSON, ToJSON, Generic)

-- | 
data PokemonDetailTypesInner = PokemonDetailTypesInner
  { pokemonDetailTypesInnerSlot :: Int -- ^ 
  , pokemonDetailTypesInnerType :: AbilityDetailPokemonInnerPokemon -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonDetailTypesInner where
  parseJSON = genericParseJSON optionsPokemonDetailTypesInner
instance ToJSON PokemonDetailTypesInner where
  toJSON = genericToJSON optionsPokemonDetailTypesInner

optionsPokemonDetailTypesInner :: Options
optionsPokemonDetailTypesInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonDetailTypesInnerSlot", "slot")
      , ("pokemonDetailTypesInnerType", "type")
      ]


-- | 
data PokemonDexEntry = PokemonDexEntry
  { pokemonDexEntryEntryUnderscorenumber :: Int -- ^ 
  , pokemonDexEntryPokedex :: PokedexSummary -- ^ 
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
data PokemonFormDetail = PokemonFormDetail
  { pokemonFormDetailId :: Int -- ^ 
  , pokemonFormDetailName :: Text -- ^ 
  , pokemonFormDetailOrder :: Maybe Int -- ^ 
  , pokemonFormDetailFormUnderscoreorder :: Maybe Int -- ^ 
  , pokemonFormDetailIsUnderscoredefault :: Maybe Bool -- ^ 
  , pokemonFormDetailIsUnderscorebattleUnderscoreonly :: Maybe Bool -- ^ 
  , pokemonFormDetailIsUnderscoremega :: Maybe Bool -- ^ 
  , pokemonFormDetailFormUnderscorename :: Text -- ^ 
  , pokemonFormDetailPokemon :: PokemonSummary -- ^ 
  , pokemonFormDetailSprites :: PokemonFormDetailSprites -- ^ 
  , pokemonFormDetailVersionUnderscoregroup :: VersionGroupSummary -- ^ 
  , pokemonFormDetailFormUnderscorenames :: [PokemonFormDetailFormNamesInner] -- ^ 
  , pokemonFormDetailNames :: [PokemonFormDetailFormNamesInner] -- ^ 
  , pokemonFormDetailTypes :: [PokemonDetailTypesInner] -- ^ 
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
      ]


-- | 
data PokemonFormDetailFormNamesInner = PokemonFormDetailFormNamesInner
  { pokemonFormDetailFormNamesInnerLanguage :: AbilityDetailPokemonInnerPokemon -- ^ 
  , pokemonFormDetailFormNamesInnerName :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonFormDetailFormNamesInner where
  parseJSON = genericParseJSON optionsPokemonFormDetailFormNamesInner
instance ToJSON PokemonFormDetailFormNamesInner where
  toJSON = genericToJSON optionsPokemonFormDetailFormNamesInner

optionsPokemonFormDetailFormNamesInner :: Options
optionsPokemonFormDetailFormNamesInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonFormDetailFormNamesInnerLanguage", "language")
      , ("pokemonFormDetailFormNamesInnerName", "name")
      ]


-- | 
newtype PokemonFormDetailSprites = PokemonFormDetailSprites { unPokemonFormDetailSprites :: (Map.Map Text Text) }
  deriving (Show, Eq, FromJSON, ToJSON, Generic)

-- | 
data PokemonFormSummary = PokemonFormSummary
  { pokemonFormSummaryName :: Text -- ^ 
  , pokemonFormSummaryUrl :: Text -- ^ 
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
data PokemonGameIndex = PokemonGameIndex
  { pokemonGameIndexGameUnderscoreindex :: Int -- ^ 
  , pokemonGameIndexVersion :: VersionSummary -- ^ 
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
  { pokemonHabitatDetailId :: Int -- ^ 
  , pokemonHabitatDetailName :: Text -- ^ 
  , pokemonHabitatDetailNames :: [PokemonHabitatName] -- ^ 
  , pokemonHabitatDetailPokemonUnderscorespecies :: [PokemonSpeciesSummary] -- ^ 
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
  { pokemonHabitatNameName :: Text -- ^ 
  , pokemonHabitatNameLanguage :: LanguageSummary -- ^ 
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
  { pokemonHabitatSummaryName :: Text -- ^ 
  , pokemonHabitatSummaryUrl :: Text -- ^ 
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
data PokemonShapeDetail = PokemonShapeDetail
  { pokemonShapeDetailId :: Int -- ^ 
  , pokemonShapeDetailName :: Text -- ^ 
  , pokemonShapeDetailAwesomeUnderscorenames :: [PokemonShapeDetailAwesomeNamesInner] -- ^ 
  , pokemonShapeDetailNames :: [PokemonShapeDetailNamesInner] -- ^ 
  , pokemonShapeDetailPokemonUnderscorespecies :: [PokemonSpeciesSummary] -- ^ 
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
data PokemonShapeDetailAwesomeNamesInner = PokemonShapeDetailAwesomeNamesInner
  { pokemonShapeDetailAwesomeNamesInnerAwesomeUnderscorename :: Text -- ^ 
  , pokemonShapeDetailAwesomeNamesInnerLanguage :: AbilityDetailPokemonInnerPokemon -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonShapeDetailAwesomeNamesInner where
  parseJSON = genericParseJSON optionsPokemonShapeDetailAwesomeNamesInner
instance ToJSON PokemonShapeDetailAwesomeNamesInner where
  toJSON = genericToJSON optionsPokemonShapeDetailAwesomeNamesInner

optionsPokemonShapeDetailAwesomeNamesInner :: Options
optionsPokemonShapeDetailAwesomeNamesInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonShapeDetailAwesomeNamesInnerAwesomeUnderscorename", "awesome_name")
      , ("pokemonShapeDetailAwesomeNamesInnerLanguage", "language")
      ]


-- | 
data PokemonShapeDetailNamesInner = PokemonShapeDetailNamesInner
  { pokemonShapeDetailNamesInnerUrl :: Text -- ^ 
  , pokemonShapeDetailNamesInnerName :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonShapeDetailNamesInner where
  parseJSON = genericParseJSON optionsPokemonShapeDetailNamesInner
instance ToJSON PokemonShapeDetailNamesInner where
  toJSON = genericToJSON optionsPokemonShapeDetailNamesInner

optionsPokemonShapeDetailNamesInner :: Options
optionsPokemonShapeDetailNamesInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonShapeDetailNamesInnerUrl", "url")
      , ("pokemonShapeDetailNamesInnerName", "name")
      ]


-- | 
data PokemonShapeSummary = PokemonShapeSummary
  { pokemonShapeSummaryName :: Text -- ^ 
  , pokemonShapeSummaryUrl :: Text -- ^ 
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
  { pokemonSpeciesDescriptionDescription :: Maybe Text -- ^ 
  , pokemonSpeciesDescriptionLanguage :: LanguageSummary -- ^ 
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
  { pokemonSpeciesDetailId :: Int -- ^ 
  , pokemonSpeciesDetailName :: Text -- ^ 
  , pokemonSpeciesDetailOrder :: Maybe Int -- ^ 
  , pokemonSpeciesDetailGenderUnderscorerate :: Maybe Int -- ^ 
  , pokemonSpeciesDetailCaptureUnderscorerate :: Maybe Int -- ^ 
  , pokemonSpeciesDetailBaseUnderscorehappiness :: Maybe Int -- ^ 
  , pokemonSpeciesDetailIsUnderscorebaby :: Maybe Bool -- ^ 
  , pokemonSpeciesDetailIsUnderscorelegendary :: Maybe Bool -- ^ 
  , pokemonSpeciesDetailIsUnderscoremythical :: Maybe Bool -- ^ 
  , pokemonSpeciesDetailHatchUnderscorecounter :: Maybe Int -- ^ 
  , pokemonSpeciesDetailHasUnderscoregenderUnderscoredifferences :: Maybe Bool -- ^ 
  , pokemonSpeciesDetailFormsUnderscoreswitchable :: Maybe Bool -- ^ 
  , pokemonSpeciesDetailGrowthUnderscorerate :: GrowthRateSummary -- ^ 
  , pokemonSpeciesDetailPokedexUnderscorenumbers :: [PokemonDexEntry] -- ^ 
  , pokemonSpeciesDetailEggUnderscoregroups :: [AbilityDetailPokemonInnerPokemon] -- ^ 
  , pokemonSpeciesDetailColor :: PokemonColorSummary -- ^ 
  , pokemonSpeciesDetailShape :: PokemonShapeSummary -- ^ 
  , pokemonSpeciesDetailEvolvesUnderscorefromUnderscorespecies :: PokemonSpeciesSummary -- ^ 
  , pokemonSpeciesDetailEvolutionUnderscorechain :: EvolutionChainSummary -- ^ 
  , pokemonSpeciesDetailHabitat :: PokemonHabitatSummary -- ^ 
  , pokemonSpeciesDetailGeneration :: GenerationSummary -- ^ 
  , pokemonSpeciesDetailNames :: [PokemonFormDetailFormNamesInner] -- ^ 
  , pokemonSpeciesDetailPalUnderscoreparkUnderscoreencounters :: [PokemonSpeciesDetailPalParkEncountersInner] -- ^ 
  , pokemonSpeciesDetailFormUnderscoredescriptions :: [PokemonSpeciesDescription] -- ^ 
  , pokemonSpeciesDetailFlavorUnderscoretextUnderscoreentries :: [PokemonSpeciesFlavorText] -- ^ 
  , pokemonSpeciesDetailGenera :: [PokemonSpeciesDetailGeneraInner] -- ^ 
  , pokemonSpeciesDetailVarieties :: [PokemonSpeciesDetailVarietiesInner] -- ^ 
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
data PokemonSpeciesDetailGeneraInner = PokemonSpeciesDetailGeneraInner
  { pokemonSpeciesDetailGeneraInnerGenus :: Text -- ^ 
  , pokemonSpeciesDetailGeneraInnerLanguage :: AbilityDetailPokemonInnerPokemon -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonSpeciesDetailGeneraInner where
  parseJSON = genericParseJSON optionsPokemonSpeciesDetailGeneraInner
instance ToJSON PokemonSpeciesDetailGeneraInner where
  toJSON = genericToJSON optionsPokemonSpeciesDetailGeneraInner

optionsPokemonSpeciesDetailGeneraInner :: Options
optionsPokemonSpeciesDetailGeneraInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonSpeciesDetailGeneraInnerGenus", "genus")
      , ("pokemonSpeciesDetailGeneraInnerLanguage", "language")
      ]


-- | 
data PokemonSpeciesDetailPalParkEncountersInner = PokemonSpeciesDetailPalParkEncountersInner
  { pokemonSpeciesDetailPalParkEncountersInnerArea :: AbilityDetailPokemonInnerPokemon -- ^ 
  , pokemonSpeciesDetailPalParkEncountersInnerBaseUnderscorescore :: Int -- ^ 
  , pokemonSpeciesDetailPalParkEncountersInnerRate :: Int -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonSpeciesDetailPalParkEncountersInner where
  parseJSON = genericParseJSON optionsPokemonSpeciesDetailPalParkEncountersInner
instance ToJSON PokemonSpeciesDetailPalParkEncountersInner where
  toJSON = genericToJSON optionsPokemonSpeciesDetailPalParkEncountersInner

optionsPokemonSpeciesDetailPalParkEncountersInner :: Options
optionsPokemonSpeciesDetailPalParkEncountersInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonSpeciesDetailPalParkEncountersInnerArea", "area")
      , ("pokemonSpeciesDetailPalParkEncountersInnerBaseUnderscorescore", "base_score")
      , ("pokemonSpeciesDetailPalParkEncountersInnerRate", "rate")
      ]


-- | 
data PokemonSpeciesDetailVarietiesInner = PokemonSpeciesDetailVarietiesInner
  { pokemonSpeciesDetailVarietiesInnerIsUnderscoredefault :: Bool -- ^ 
  , pokemonSpeciesDetailVarietiesInnerPokemon :: AbilityDetailPokemonInnerPokemon -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON PokemonSpeciesDetailVarietiesInner where
  parseJSON = genericParseJSON optionsPokemonSpeciesDetailVarietiesInner
instance ToJSON PokemonSpeciesDetailVarietiesInner where
  toJSON = genericToJSON optionsPokemonSpeciesDetailVarietiesInner

optionsPokemonSpeciesDetailVarietiesInner :: Options
optionsPokemonSpeciesDetailVarietiesInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pokemonSpeciesDetailVarietiesInnerIsUnderscoredefault", "is_default")
      , ("pokemonSpeciesDetailVarietiesInnerPokemon", "pokemon")
      ]


-- | 
data PokemonSpeciesFlavorText = PokemonSpeciesFlavorText
  { pokemonSpeciesFlavorTextFlavorUnderscoretext :: Text -- ^ 
  , pokemonSpeciesFlavorTextLanguage :: LanguageSummary -- ^ 
  , pokemonSpeciesFlavorTextVersion :: VersionSummary -- ^ 
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
data PokemonSpeciesSummary = PokemonSpeciesSummary
  { pokemonSpeciesSummaryName :: Text -- ^ 
  , pokemonSpeciesSummaryUrl :: Text -- ^ 
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
data PokemonStat = PokemonStat
  { pokemonStatBaseUnderscorestat :: Int -- ^ 
  , pokemonStatEffort :: Int -- ^ 
  , pokemonStatStat :: StatSummary -- ^ 
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
  { pokemonSummaryName :: Text -- ^ 
  , pokemonSummaryUrl :: Text -- ^ 
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
data RegionDetail = RegionDetail
  { regionDetailId :: Int -- ^ 
  , regionDetailName :: Text -- ^ 
  , regionDetailLocations :: [LocationSummary] -- ^ 
  , regionDetailMainUnderscoregeneration :: GenerationSummary -- ^ 
  , regionDetailNames :: [RegionName] -- ^ 
  , regionDetailPokedexes :: [PokedexSummary] -- ^ 
  , regionDetailVersionUnderscoregroups :: [AbilityDetailPokemonInnerPokemon] -- ^ 
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
  { regionNameName :: Text -- ^ 
  , regionNameLanguage :: LanguageSummary -- ^ 
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
  { regionSummaryName :: Text -- ^ 
  , regionSummaryUrl :: Text -- ^ 
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
data StatDetail = StatDetail
  { statDetailId :: Int -- ^ 
  , statDetailName :: Text -- ^ 
  , statDetailGameUnderscoreindex :: Int -- ^ 
  , statDetailIsUnderscorebattleUnderscoreonly :: Maybe Bool -- ^ 
  , statDetailAffectingUnderscoremoves :: StatDetailAffectingMoves -- ^ 
  , statDetailAffectingUnderscorenatures :: StatDetailAffectingNatures -- ^ 
  , statDetailCharacteristics :: [CharacteristicSummary] -- ^ 
  , statDetailMoveUnderscoredamageUnderscoreclass :: MoveDamageClassSummary -- ^ 
  , statDetailNames :: [StatName] -- ^ 
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
      , ("statDetailCharacteristics", "characteristics")
      , ("statDetailMoveUnderscoredamageUnderscoreclass", "move_damage_class")
      , ("statDetailNames", "names")
      ]


-- | 
data StatDetailAffectingMoves = StatDetailAffectingMoves
  { statDetailAffectingMovesIncrease :: [StatDetailAffectingMovesIncreaseInner] -- ^ 
  , statDetailAffectingMovesDecrease :: [StatDetailAffectingMovesIncreaseInner] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON StatDetailAffectingMoves where
  parseJSON = genericParseJSON optionsStatDetailAffectingMoves
instance ToJSON StatDetailAffectingMoves where
  toJSON = genericToJSON optionsStatDetailAffectingMoves

optionsStatDetailAffectingMoves :: Options
optionsStatDetailAffectingMoves =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("statDetailAffectingMovesIncrease", "increase")
      , ("statDetailAffectingMovesDecrease", "decrease")
      ]


-- | 
data StatDetailAffectingMovesIncreaseInner = StatDetailAffectingMovesIncreaseInner
  { statDetailAffectingMovesIncreaseInnerChange :: Int -- ^ 
  , statDetailAffectingMovesIncreaseInnerMove :: AbilityDetailPokemonInnerPokemon -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON StatDetailAffectingMovesIncreaseInner where
  parseJSON = genericParseJSON optionsStatDetailAffectingMovesIncreaseInner
instance ToJSON StatDetailAffectingMovesIncreaseInner where
  toJSON = genericToJSON optionsStatDetailAffectingMovesIncreaseInner

optionsStatDetailAffectingMovesIncreaseInner :: Options
optionsStatDetailAffectingMovesIncreaseInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("statDetailAffectingMovesIncreaseInnerChange", "change")
      , ("statDetailAffectingMovesIncreaseInnerMove", "move")
      ]


-- | 
data StatDetailAffectingNatures = StatDetailAffectingNatures
  { statDetailAffectingNaturesIncrease :: [AbilityDetailPokemonInnerPokemon] -- ^ 
  , statDetailAffectingNaturesDecrease :: [AbilityDetailPokemonInnerPokemon] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON StatDetailAffectingNatures where
  parseJSON = genericParseJSON optionsStatDetailAffectingNatures
instance ToJSON StatDetailAffectingNatures where
  toJSON = genericToJSON optionsStatDetailAffectingNatures

optionsStatDetailAffectingNatures :: Options
optionsStatDetailAffectingNatures =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("statDetailAffectingNaturesIncrease", "increase")
      , ("statDetailAffectingNaturesDecrease", "decrease")
      ]


-- | 
data StatName = StatName
  { statNameName :: Text -- ^ 
  , statNameLanguage :: LanguageSummary -- ^ 
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
  { statSummaryName :: Text -- ^ 
  , statSummaryUrl :: Text -- ^ 
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
  { superContestEffectDetailId :: Int -- ^ 
  , superContestEffectDetailAppeal :: Int -- ^ 
  , superContestEffectDetailFlavorUnderscoretextUnderscoreentries :: [SuperContestEffectFlavorText] -- ^ 
  , superContestEffectDetailMoves :: [MoveSummary] -- ^ 
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
  { superContestEffectFlavorTextFlavorUnderscoretext :: Text -- ^ 
  , superContestEffectFlavorTextLanguage :: LanguageSummary -- ^ 
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
  { superContestEffectSummaryUrl :: Text -- ^ 
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
  { typeDetailId :: Int -- ^ 
  , typeDetailName :: Text -- ^ 
  , typeDetailDamageUnderscorerelations :: TypeDetailDamageRelations -- ^ 
  , typeDetailPastUnderscoredamageUnderscorerelations :: [TypeDetailPastDamageRelationsInner] -- ^ 
  , typeDetailGameUnderscoreindices :: [TypeGameIndex] -- ^ 
  , typeDetailGeneration :: GenerationSummary -- ^ 
  , typeDetailMoveUnderscoredamageUnderscoreclass :: MoveDamageClassSummary -- ^ 
  , typeDetailNames :: [AbilityName] -- ^ 
  , typeDetailPokemon :: [TypeDetailPokemonInner] -- ^ 
  , typeDetailMoves :: [MoveSummary] -- ^ 
  , typeDetailSprites :: (Map.Map String (Map.Map String TypeDetailSpritesValueValue)) -- ^ 
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
data TypeDetailDamageRelations = TypeDetailDamageRelations
  { typeDetailDamageRelationsNoUnderscoredamageUnderscoreto :: [AbilityDetailPokemonInnerPokemon] -- ^ 
  , typeDetailDamageRelationsHalfUnderscoredamageUnderscoreto :: [AbilityDetailPokemonInnerPokemon] -- ^ 
  , typeDetailDamageRelationsDoubleUnderscoredamageUnderscoreto :: [AbilityDetailPokemonInnerPokemon] -- ^ 
  , typeDetailDamageRelationsNoUnderscoredamageUnderscorefrom :: [AbilityDetailPokemonInnerPokemon] -- ^ 
  , typeDetailDamageRelationsHalfUnderscoredamageUnderscorefrom :: [AbilityDetailPokemonInnerPokemon] -- ^ 
  , typeDetailDamageRelationsDoubleUnderscoredamageUnderscorefrom :: [AbilityDetailPokemonInnerPokemon] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON TypeDetailDamageRelations where
  parseJSON = genericParseJSON optionsTypeDetailDamageRelations
instance ToJSON TypeDetailDamageRelations where
  toJSON = genericToJSON optionsTypeDetailDamageRelations

optionsTypeDetailDamageRelations :: Options
optionsTypeDetailDamageRelations =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("typeDetailDamageRelationsNoUnderscoredamageUnderscoreto", "no_damage_to")
      , ("typeDetailDamageRelationsHalfUnderscoredamageUnderscoreto", "half_damage_to")
      , ("typeDetailDamageRelationsDoubleUnderscoredamageUnderscoreto", "double_damage_to")
      , ("typeDetailDamageRelationsNoUnderscoredamageUnderscorefrom", "no_damage_from")
      , ("typeDetailDamageRelationsHalfUnderscoredamageUnderscorefrom", "half_damage_from")
      , ("typeDetailDamageRelationsDoubleUnderscoredamageUnderscorefrom", "double_damage_from")
      ]


-- | 
data TypeDetailPastDamageRelationsInner = TypeDetailPastDamageRelationsInner
  { typeDetailPastDamageRelationsInnerGeneration :: AbilityDetailPokemonInnerPokemon -- ^ 
  , typeDetailPastDamageRelationsInnerDamageUnderscorerelations :: TypeDetailPastDamageRelationsInnerDamageRelations -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON TypeDetailPastDamageRelationsInner where
  parseJSON = genericParseJSON optionsTypeDetailPastDamageRelationsInner
instance ToJSON TypeDetailPastDamageRelationsInner where
  toJSON = genericToJSON optionsTypeDetailPastDamageRelationsInner

optionsTypeDetailPastDamageRelationsInner :: Options
optionsTypeDetailPastDamageRelationsInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("typeDetailPastDamageRelationsInnerGeneration", "generation")
      , ("typeDetailPastDamageRelationsInnerDamageUnderscorerelations", "damage_relations")
      ]


-- | 
data TypeDetailPastDamageRelationsInnerDamageRelations = TypeDetailPastDamageRelationsInnerDamageRelations
  { typeDetailPastDamageRelationsInnerDamageRelationsNoUnderscoredamageUnderscoreto :: [AbilityDetailPokemonInnerPokemon] -- ^ 
  , typeDetailPastDamageRelationsInnerDamageRelationsHalfUnderscoredamageUnderscoreto :: [AbilityDetailPokemonInnerPokemon] -- ^ 
  , typeDetailPastDamageRelationsInnerDamageRelationsDoubleUnderscoredamageUnderscoreto :: [AbilityDetailPokemonInnerPokemon] -- ^ 
  , typeDetailPastDamageRelationsInnerDamageRelationsNoUnderscoredamageUnderscorefrom :: [AbilityDetailPokemonInnerPokemon] -- ^ 
  , typeDetailPastDamageRelationsInnerDamageRelationsHalfUnderscoredamageUnderscorefrom :: [AbilityDetailPokemonInnerPokemon] -- ^ 
  , typeDetailPastDamageRelationsInnerDamageRelationsDoubleUnderscoredamageUnderscorefrom :: [AbilityDetailPokemonInnerPokemon] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON TypeDetailPastDamageRelationsInnerDamageRelations where
  parseJSON = genericParseJSON optionsTypeDetailPastDamageRelationsInnerDamageRelations
instance ToJSON TypeDetailPastDamageRelationsInnerDamageRelations where
  toJSON = genericToJSON optionsTypeDetailPastDamageRelationsInnerDamageRelations

optionsTypeDetailPastDamageRelationsInnerDamageRelations :: Options
optionsTypeDetailPastDamageRelationsInnerDamageRelations =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("typeDetailPastDamageRelationsInnerDamageRelationsNoUnderscoredamageUnderscoreto", "no_damage_to")
      , ("typeDetailPastDamageRelationsInnerDamageRelationsHalfUnderscoredamageUnderscoreto", "half_damage_to")
      , ("typeDetailPastDamageRelationsInnerDamageRelationsDoubleUnderscoredamageUnderscoreto", "double_damage_to")
      , ("typeDetailPastDamageRelationsInnerDamageRelationsNoUnderscoredamageUnderscorefrom", "no_damage_from")
      , ("typeDetailPastDamageRelationsInnerDamageRelationsHalfUnderscoredamageUnderscorefrom", "half_damage_from")
      , ("typeDetailPastDamageRelationsInnerDamageRelationsDoubleUnderscoredamageUnderscorefrom", "double_damage_from")
      ]


-- | 
data TypeDetailPokemonInner = TypeDetailPokemonInner
  { typeDetailPokemonInnerSlot :: Maybe Int -- ^ 
  , typeDetailPokemonInnerPokemon :: Maybe TypeDetailPokemonInnerPokemon -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON TypeDetailPokemonInner where
  parseJSON = genericParseJSON optionsTypeDetailPokemonInner
instance ToJSON TypeDetailPokemonInner where
  toJSON = genericToJSON optionsTypeDetailPokemonInner

optionsTypeDetailPokemonInner :: Options
optionsTypeDetailPokemonInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("typeDetailPokemonInnerSlot", "slot")
      , ("typeDetailPokemonInnerPokemon", "pokemon")
      ]


-- | 
data TypeDetailPokemonInnerPokemon = TypeDetailPokemonInnerPokemon
  { typeDetailPokemonInnerPokemonName :: Maybe Text -- ^ The name of the pokemon
  , typeDetailPokemonInnerPokemonUrl :: Maybe Text -- ^ The URL to get more information about the pokemon
  } deriving (Show, Eq, Generic)

instance FromJSON TypeDetailPokemonInnerPokemon where
  parseJSON = genericParseJSON optionsTypeDetailPokemonInnerPokemon
instance ToJSON TypeDetailPokemonInnerPokemon where
  toJSON = genericToJSON optionsTypeDetailPokemonInnerPokemon

optionsTypeDetailPokemonInnerPokemon :: Options
optionsTypeDetailPokemonInnerPokemon =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("typeDetailPokemonInnerPokemonName", "name")
      , ("typeDetailPokemonInnerPokemonUrl", "url")
      ]


-- | 
data TypeDetailSpritesValueValue = TypeDetailSpritesValueValue
  { typeDetailSpritesValueValueNameDashicon :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON TypeDetailSpritesValueValue where
  parseJSON = genericParseJSON optionsTypeDetailSpritesValueValue
instance ToJSON TypeDetailSpritesValueValue where
  toJSON = genericToJSON optionsTypeDetailSpritesValueValue

optionsTypeDetailSpritesValueValue :: Options
optionsTypeDetailSpritesValueValue =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("typeDetailSpritesValueValueNameDashicon", "name-icon")
      ]


-- | 
data TypeGameIndex = TypeGameIndex
  { typeGameIndexGameUnderscoreindex :: Int -- ^ 
  , typeGameIndexGeneration :: GenerationSummary -- ^ 
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
data TypeSummary = TypeSummary
  { typeSummaryName :: Text -- ^ 
  , typeSummaryUrl :: Text -- ^ 
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
  { versionDetailId :: Int -- ^ 
  , versionDetailName :: Text -- ^ 
  , versionDetailNames :: [VersionName] -- ^ 
  , versionDetailVersionUnderscoregroup :: VersionGroupSummary -- ^ 
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
  { versionGroupDetailId :: Int -- ^ 
  , versionGroupDetailName :: Text -- ^ 
  , versionGroupDetailOrder :: Maybe Int -- ^ 
  , versionGroupDetailGeneration :: GenerationSummary -- ^ 
  , versionGroupDetailMoveUnderscorelearnUnderscoremethods :: [AbilityDetailPokemonInnerPokemon] -- ^ 
  , versionGroupDetailPokedexes :: [AbilityDetailPokemonInnerPokemon] -- ^ 
  , versionGroupDetailRegions :: [AbilityDetailPokemonInnerPokemon] -- ^ 
  , versionGroupDetailVersions :: [VersionSummary] -- ^ 
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
  { versionGroupSummaryName :: Text -- ^ 
  , versionGroupSummaryUrl :: Text -- ^ 
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
  { versionNameName :: Text -- ^ 
  , versionNameLanguage :: LanguageSummary -- ^ 
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
  { versionSummaryName :: Text -- ^ 
  , versionSummaryUrl :: Text -- ^ 
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

