{-# LANGUAGE CPP #-}
{-# OPTIONS_GHC -fno-warn-unused-imports -fno-warn-unused-matches #-}

module Instances where

import Poké.Model
import Poké.Core

import qualified Data.Aeson as A
import qualified Data.ByteString.Lazy as BL
import qualified Data.HashMap.Strict as HM
import qualified Data.Set as Set
import qualified Data.Text as T
import qualified Data.Time as TI
import qualified Data.Vector as V
import Data.String (fromString)

import Control.Monad
import Data.Char (isSpace)
import Data.List (sort)
import Test.QuickCheck

import ApproxEq

instance Arbitrary T.Text where
  arbitrary = T.pack <$> arbitrary

instance Arbitrary TI.Day where
  arbitrary = TI.ModifiedJulianDay . (2000 +) <$> arbitrary
  shrink = (TI.ModifiedJulianDay <$>) . shrink . TI.toModifiedJulianDay

instance Arbitrary TI.UTCTime where
  arbitrary =
    TI.UTCTime <$> arbitrary <*> (TI.secondsToDiffTime <$> choose (0, 86401))

instance Arbitrary BL.ByteString where
    arbitrary = BL.pack <$> arbitrary
    shrink xs = BL.pack <$> shrink (BL.unpack xs)

instance Arbitrary ByteArray where
    arbitrary = ByteArray <$> arbitrary
    shrink (ByteArray xs) = ByteArray <$> shrink xs

instance Arbitrary Binary where
    arbitrary = Binary <$> arbitrary
    shrink (Binary xs) = Binary <$> shrink xs

instance Arbitrary DateTime where
    arbitrary = DateTime <$> arbitrary
    shrink (DateTime xs) = DateTime <$> shrink xs

instance Arbitrary Date where
    arbitrary = Date <$> arbitrary
    shrink (Date xs) = Date <$> shrink xs

#if MIN_VERSION_aeson(2,0,0)
#else
-- | A naive Arbitrary instance for A.Value:
instance Arbitrary A.Value where
  arbitrary = arbitraryValue
#endif

arbitraryValue :: Gen A.Value
arbitraryValue =
  frequency [(3, simpleTypes), (1, arrayTypes), (1, objectTypes)]
    where
      simpleTypes :: Gen A.Value
      simpleTypes =
        frequency
          [ (1, return A.Null)
          , (2, liftM A.Bool (arbitrary :: Gen Bool))
          , (2, liftM (A.Number . fromIntegral) (arbitrary :: Gen Int))
          , (2, liftM (A.String . T.pack) (arbitrary :: Gen String))
          ]
      mapF (k, v) = (fromString k, v)
      simpleAndArrays = frequency [(1, sized sizedArray), (4, simpleTypes)]
      arrayTypes = sized sizedArray
      objectTypes = sized sizedObject
      sizedArray n = liftM (A.Array . V.fromList) $ replicateM n simpleTypes
      sizedObject n =
        liftM (A.object . map mapF) $
        replicateM n $ (,) <$> (arbitrary :: Gen String) <*> simpleAndArrays

-- | Checks if a given list has no duplicates in _O(n log n)_.
hasNoDups
  :: (Ord a)
  => [a] -> Bool
hasNoDups = go Set.empty
  where
    go _ [] = True
    go s (x:xs)
      | s' <- Set.insert x s
      , Set.size s' > Set.size s = go s' xs
      | otherwise = False

instance ApproxEq TI.Day where
  (=~) = (==)

arbitraryReduced :: Arbitrary a => Int -> Gen a
arbitraryReduced n = resize (n `div` 2) arbitrary

arbitraryReducedMaybe :: Arbitrary a => Int -> Gen (Maybe a)
arbitraryReducedMaybe 0 = elements [Nothing]
arbitraryReducedMaybe n = arbitraryReduced n

arbitraryReducedMaybeValue :: Int -> Gen (Maybe A.Value)
arbitraryReducedMaybeValue 0 = elements [Nothing]
arbitraryReducedMaybeValue n = do
  generated <- arbitraryReduced n
  if generated == Just A.Null
    then return Nothing
    else return generated

-- * Models

instance Arbitrary AbilityChange where
  arbitrary = sized genAbilityChange

genAbilityChange :: Int -> Gen AbilityChange
genAbilityChange n =
  AbilityChange
    <$> arbitraryReduced n -- abilityChangeVersionGroup :: VersionGroupSummary
    <*> arbitraryReduced n -- abilityChangeEffectEntries :: [AbilityChangeEffectText]
  
instance Arbitrary AbilityChangeEffectText where
  arbitrary = sized genAbilityChangeEffectText

genAbilityChangeEffectText :: Int -> Gen AbilityChangeEffectText
genAbilityChangeEffectText n =
  AbilityChangeEffectText
    <$> arbitrary -- abilityChangeEffectTextEffect :: Text
    <*> arbitraryReduced n -- abilityChangeEffectTextLanguage :: LanguageSummary
  
instance Arbitrary AbilityDetail where
  arbitrary = sized genAbilityDetail

genAbilityDetail :: Int -> Gen AbilityDetail
genAbilityDetail n =
  AbilityDetail
    <$> arbitrary -- abilityDetailId :: Int
    <*> arbitrary -- abilityDetailName :: Text
    <*> arbitraryReducedMaybe n -- abilityDetailIsMainSeries :: Maybe Bool
    <*> arbitraryReduced n -- abilityDetailGeneration :: GenerationSummary
    <*> arbitraryReduced n -- abilityDetailNames :: [AbilityName]
    <*> arbitraryReduced n -- abilityDetailEffectEntries :: [AbilityEffectText]
    <*> arbitraryReduced n -- abilityDetailEffectChanges :: [AbilityChange]
    <*> arbitraryReduced n -- abilityDetailFlavorTextEntries :: [AbilityFlavorText]
    <*> arbitraryReduced n -- abilityDetailPokemon :: [AbilityPokemonDetail]
  
instance Arbitrary AbilityEffectText where
  arbitrary = sized genAbilityEffectText

genAbilityEffectText :: Int -> Gen AbilityEffectText
genAbilityEffectText n =
  AbilityEffectText
    <$> arbitrary -- abilityEffectTextEffect :: Text
    <*> arbitrary -- abilityEffectTextShortEffect :: Text
    <*> arbitraryReduced n -- abilityEffectTextLanguage :: LanguageSummary
  
instance Arbitrary AbilityFlavorText where
  arbitrary = sized genAbilityFlavorText

genAbilityFlavorText :: Int -> Gen AbilityFlavorText
genAbilityFlavorText n =
  AbilityFlavorText
    <$> arbitrary -- abilityFlavorTextFlavorText :: Text
    <*> arbitraryReduced n -- abilityFlavorTextLanguage :: LanguageSummary
    <*> arbitraryReduced n -- abilityFlavorTextVersionGroup :: VersionGroupSummary
  
instance Arbitrary AbilityName where
  arbitrary = sized genAbilityName

genAbilityName :: Int -> Gen AbilityName
genAbilityName n =
  AbilityName
    <$> arbitrary -- abilityNameName :: Text
    <*> arbitraryReduced n -- abilityNameLanguage :: LanguageSummary
  
instance Arbitrary AbilityPokemonDetail where
  arbitrary = sized genAbilityPokemonDetail

genAbilityPokemonDetail :: Int -> Gen AbilityPokemonDetail
genAbilityPokemonDetail n =
  AbilityPokemonDetail
    <$> arbitraryReducedMaybe n -- abilityPokemonDetailIsHidden :: Maybe Bool
    <*> arbitrary -- abilityPokemonDetailSlot :: Int
    <*> arbitraryReduced n -- abilityPokemonDetailPokemon :: PokemonSummary
  
instance Arbitrary AbilitySummary where
  arbitrary = sized genAbilitySummary

genAbilitySummary :: Int -> Gen AbilitySummary
genAbilitySummary n =
  AbilitySummary
    <$> arbitrary -- abilitySummaryName :: Text
    <*> arbitrary -- abilitySummaryUrl :: Text
  
instance Arbitrary BerryDetail where
  arbitrary = sized genBerryDetail

genBerryDetail :: Int -> Gen BerryDetail
genBerryDetail n =
  BerryDetail
    <$> arbitrary -- berryDetailId :: Int
    <*> arbitrary -- berryDetailName :: Text
    <*> arbitraryReducedMaybe n -- berryDetailGrowthTime :: Maybe Int
    <*> arbitraryReducedMaybe n -- berryDetailMaxHarvest :: Maybe Int
    <*> arbitraryReducedMaybe n -- berryDetailNaturalGiftPower :: Maybe Int
    <*> arbitraryReducedMaybe n -- berryDetailSize :: Maybe Int
    <*> arbitraryReducedMaybe n -- berryDetailSmoothness :: Maybe Int
    <*> arbitraryReducedMaybe n -- berryDetailSoilDryness :: Maybe Int
    <*> arbitraryReduced n -- berryDetailFirmness :: BerryFirmnessSummary
    <*> arbitraryReduced n -- berryDetailFlavors :: [BerryFlavorMap]
    <*> arbitraryReduced n -- berryDetailItem :: ItemSummary
    <*> arbitraryReduced n -- berryDetailNaturalGiftType :: TypeSummary
  
instance Arbitrary BerryFirmnessDetail where
  arbitrary = sized genBerryFirmnessDetail

genBerryFirmnessDetail :: Int -> Gen BerryFirmnessDetail
genBerryFirmnessDetail n =
  BerryFirmnessDetail
    <$> arbitrary -- berryFirmnessDetailId :: Int
    <*> arbitrary -- berryFirmnessDetailName :: Text
    <*> arbitraryReduced n -- berryFirmnessDetailBerries :: [BerrySummary]
    <*> arbitraryReduced n -- berryFirmnessDetailNames :: [BerryFirmnessName]
  
instance Arbitrary BerryFirmnessName where
  arbitrary = sized genBerryFirmnessName

genBerryFirmnessName :: Int -> Gen BerryFirmnessName
genBerryFirmnessName n =
  BerryFirmnessName
    <$> arbitrary -- berryFirmnessNameName :: Text
    <*> arbitraryReduced n -- berryFirmnessNameLanguage :: LanguageSummary
  
instance Arbitrary BerryFirmnessSummary where
  arbitrary = sized genBerryFirmnessSummary

genBerryFirmnessSummary :: Int -> Gen BerryFirmnessSummary
genBerryFirmnessSummary n =
  BerryFirmnessSummary
    <$> arbitrary -- berryFirmnessSummaryName :: Text
    <*> arbitrary -- berryFirmnessSummaryUrl :: Text
  
instance Arbitrary BerryFlavorBerryMap where
  arbitrary = sized genBerryFlavorBerryMap

genBerryFlavorBerryMap :: Int -> Gen BerryFlavorBerryMap
genBerryFlavorBerryMap n =
  BerryFlavorBerryMap
    <$> arbitrary -- berryFlavorBerryMapPotency :: Int
    <*> arbitraryReduced n -- berryFlavorBerryMapBerry :: BerrySummary
  
instance Arbitrary BerryFlavorDetail where
  arbitrary = sized genBerryFlavorDetail

genBerryFlavorDetail :: Int -> Gen BerryFlavorDetail
genBerryFlavorDetail n =
  BerryFlavorDetail
    <$> arbitrary -- berryFlavorDetailId :: Int
    <*> arbitrary -- berryFlavorDetailName :: Text
    <*> arbitraryReduced n -- berryFlavorDetailBerries :: [BerryFlavorBerryMap]
    <*> arbitraryReduced n -- berryFlavorDetailContestType :: ContestTypeSummary
    <*> arbitraryReduced n -- berryFlavorDetailNames :: [BerryFlavorName]
  
instance Arbitrary BerryFlavorMap where
  arbitrary = sized genBerryFlavorMap

genBerryFlavorMap :: Int -> Gen BerryFlavorMap
genBerryFlavorMap n =
  BerryFlavorMap
    <$> arbitrary -- berryFlavorMapPotency :: Int
    <*> arbitraryReduced n -- berryFlavorMapFlavor :: BerryFlavorSummary
  
instance Arbitrary BerryFlavorName where
  arbitrary = sized genBerryFlavorName

genBerryFlavorName :: Int -> Gen BerryFlavorName
genBerryFlavorName n =
  BerryFlavorName
    <$> arbitrary -- berryFlavorNameName :: Text
    <*> arbitraryReduced n -- berryFlavorNameLanguage :: LanguageSummary
  
instance Arbitrary BerryFlavorSummary where
  arbitrary = sized genBerryFlavorSummary

genBerryFlavorSummary :: Int -> Gen BerryFlavorSummary
genBerryFlavorSummary n =
  BerryFlavorSummary
    <$> arbitrary -- berryFlavorSummaryName :: Text
    <*> arbitrary -- berryFlavorSummaryUrl :: Text
  
instance Arbitrary BerrySummary where
  arbitrary = sized genBerrySummary

genBerrySummary :: Int -> Gen BerrySummary
genBerrySummary n =
  BerrySummary
    <$> arbitrary -- berrySummaryName :: Text
    <*> arbitrary -- berrySummaryUrl :: Text
  
instance Arbitrary CharacteristicDescription where
  arbitrary = sized genCharacteristicDescription

genCharacteristicDescription :: Int -> Gen CharacteristicDescription
genCharacteristicDescription n =
  CharacteristicDescription
    <$> arbitraryReducedMaybe n -- characteristicDescriptionDescription :: Maybe Text
    <*> arbitraryReduced n -- characteristicDescriptionLanguage :: LanguageSummary
  
instance Arbitrary CharacteristicDetail where
  arbitrary = sized genCharacteristicDetail

genCharacteristicDetail :: Int -> Gen CharacteristicDetail
genCharacteristicDetail n =
  CharacteristicDetail
    <$> arbitrary -- characteristicDetailId :: Int
    <*> arbitrary -- characteristicDetailGeneModulo :: Int
    <*> arbitrary -- characteristicDetailPossibleValues :: [Int]
    <*> arbitraryReduced n -- characteristicDetailHighestStat :: StatSummary
    <*> arbitraryReduced n -- characteristicDetailDescriptions :: [CharacteristicDescription]
  
instance Arbitrary CharacteristicSummary where
  arbitrary = sized genCharacteristicSummary

genCharacteristicSummary :: Int -> Gen CharacteristicSummary
genCharacteristicSummary n =
  CharacteristicSummary
    <$> arbitrary -- characteristicSummaryUrl :: Text
  
instance Arbitrary ContestEffectDetail where
  arbitrary = sized genContestEffectDetail

genContestEffectDetail :: Int -> Gen ContestEffectDetail
genContestEffectDetail n =
  ContestEffectDetail
    <$> arbitrary -- contestEffectDetailId :: Int
    <*> arbitrary -- contestEffectDetailAppeal :: Int
    <*> arbitrary -- contestEffectDetailJam :: Int
    <*> arbitraryReduced n -- contestEffectDetailEffectEntries :: [ContestEffectEffectText]
    <*> arbitraryReduced n -- contestEffectDetailFlavorTextEntries :: [ContestEffectFlavorText]
  
instance Arbitrary ContestEffectEffectText where
  arbitrary = sized genContestEffectEffectText

genContestEffectEffectText :: Int -> Gen ContestEffectEffectText
genContestEffectEffectText n =
  ContestEffectEffectText
    <$> arbitrary -- contestEffectEffectTextEffect :: Text
    <*> arbitraryReduced n -- contestEffectEffectTextLanguage :: LanguageSummary
  
instance Arbitrary ContestEffectFlavorText where
  arbitrary = sized genContestEffectFlavorText

genContestEffectFlavorText :: Int -> Gen ContestEffectFlavorText
genContestEffectFlavorText n =
  ContestEffectFlavorText
    <$> arbitrary -- contestEffectFlavorTextFlavorText :: Text
    <*> arbitraryReduced n -- contestEffectFlavorTextLanguage :: LanguageSummary
  
instance Arbitrary ContestEffectSummary where
  arbitrary = sized genContestEffectSummary

genContestEffectSummary :: Int -> Gen ContestEffectSummary
genContestEffectSummary n =
  ContestEffectSummary
    <$> arbitrary -- contestEffectSummaryUrl :: Text
  
instance Arbitrary ContestTypeDetail where
  arbitrary = sized genContestTypeDetail

genContestTypeDetail :: Int -> Gen ContestTypeDetail
genContestTypeDetail n =
  ContestTypeDetail
    <$> arbitrary -- contestTypeDetailId :: Int
    <*> arbitrary -- contestTypeDetailName :: Text
    <*> arbitraryReduced n -- contestTypeDetailBerryFlavor :: BerryFlavorSummary
    <*> arbitraryReduced n -- contestTypeDetailNames :: [ContestTypeName]
  
instance Arbitrary ContestTypeName where
  arbitrary = sized genContestTypeName

genContestTypeName :: Int -> Gen ContestTypeName
genContestTypeName n =
  ContestTypeName
    <$> arbitrary -- contestTypeNameName :: Text
    <*> arbitrary -- contestTypeNameColor :: Text
    <*> arbitraryReduced n -- contestTypeNameLanguage :: LanguageSummary
  
instance Arbitrary ContestTypeSummary where
  arbitrary = sized genContestTypeSummary

genContestTypeSummary :: Int -> Gen ContestTypeSummary
genContestTypeSummary n =
  ContestTypeSummary
    <$> arbitrary -- contestTypeSummaryName :: Text
    <*> arbitrary -- contestTypeSummaryUrl :: Text
  
instance Arbitrary CurrencyDetail where
  arbitrary = sized genCurrencyDetail

genCurrencyDetail :: Int -> Gen CurrencyDetail
genCurrencyDetail n =
  CurrencyDetail
    <$> arbitrary -- currencyDetailId :: Int
    <*> arbitrary -- currencyDetailName :: Text
    <*> arbitraryReduced n -- currencyDetailNames :: [CurrencyName]
  
instance Arbitrary CurrencyName where
  arbitrary = sized genCurrencyName

genCurrencyName :: Int -> Gen CurrencyName
genCurrencyName n =
  CurrencyName
    <$> arbitrary -- currencyNameName :: Text
    <*> arbitraryReduced n -- currencyNameLanguage :: LanguageSummary
  
instance Arbitrary CurrencySummary where
  arbitrary = sized genCurrencySummary

genCurrencySummary :: Int -> Gen CurrencySummary
genCurrencySummary n =
  CurrencySummary
    <$> arbitrary -- currencySummaryName :: Text
    <*> arbitrary -- currencySummaryUrl :: Text
  
instance Arbitrary EggGroupDetail where
  arbitrary = sized genEggGroupDetail

genEggGroupDetail :: Int -> Gen EggGroupDetail
genEggGroupDetail n =
  EggGroupDetail
    <$> arbitrary -- eggGroupDetailId :: Int
    <*> arbitrary -- eggGroupDetailName :: Text
    <*> arbitraryReduced n -- eggGroupDetailNames :: [EggGroupName]
    <*> arbitraryReduced n -- eggGroupDetailPokemonSpecies :: [PokemonSpeciesSummary]
  
instance Arbitrary EggGroupName where
  arbitrary = sized genEggGroupName

genEggGroupName :: Int -> Gen EggGroupName
genEggGroupName n =
  EggGroupName
    <$> arbitrary -- eggGroupNameName :: Text
    <*> arbitraryReduced n -- eggGroupNameLanguage :: LanguageSummary
  
instance Arbitrary EggGroupSummary where
  arbitrary = sized genEggGroupSummary

genEggGroupSummary :: Int -> Gen EggGroupSummary
genEggGroupSummary n =
  EggGroupSummary
    <$> arbitrary -- eggGroupSummaryName :: Text
    <*> arbitrary -- eggGroupSummaryUrl :: Text
  
instance Arbitrary EncounterConditionDetail where
  arbitrary = sized genEncounterConditionDetail

genEncounterConditionDetail :: Int -> Gen EncounterConditionDetail
genEncounterConditionDetail n =
  EncounterConditionDetail
    <$> arbitrary -- encounterConditionDetailId :: Int
    <*> arbitrary -- encounterConditionDetailName :: Text
    <*> arbitraryReduced n -- encounterConditionDetailValues :: [EncounterConditionValueSummary]
    <*> arbitraryReduced n -- encounterConditionDetailNames :: [EncounterConditionName]
  
instance Arbitrary EncounterConditionName where
  arbitrary = sized genEncounterConditionName

genEncounterConditionName :: Int -> Gen EncounterConditionName
genEncounterConditionName n =
  EncounterConditionName
    <$> arbitrary -- encounterConditionNameName :: Text
    <*> arbitraryReduced n -- encounterConditionNameLanguage :: LanguageSummary
  
instance Arbitrary EncounterConditionSummary where
  arbitrary = sized genEncounterConditionSummary

genEncounterConditionSummary :: Int -> Gen EncounterConditionSummary
genEncounterConditionSummary n =
  EncounterConditionSummary
    <$> arbitrary -- encounterConditionSummaryName :: Text
    <*> arbitrary -- encounterConditionSummaryUrl :: Text
  
instance Arbitrary EncounterConditionValueDetail where
  arbitrary = sized genEncounterConditionValueDetail

genEncounterConditionValueDetail :: Int -> Gen EncounterConditionValueDetail
genEncounterConditionValueDetail n =
  EncounterConditionValueDetail
    <$> arbitrary -- encounterConditionValueDetailId :: Int
    <*> arbitrary -- encounterConditionValueDetailName :: Text
    <*> arbitraryReduced n -- encounterConditionValueDetailCondition :: EncounterConditionSummary
    <*> arbitraryReduced n -- encounterConditionValueDetailNames :: [EncounterConditionValueName]
  
instance Arbitrary EncounterConditionValueName where
  arbitrary = sized genEncounterConditionValueName

genEncounterConditionValueName :: Int -> Gen EncounterConditionValueName
genEncounterConditionValueName n =
  EncounterConditionValueName
    <$> arbitrary -- encounterConditionValueNameName :: Text
    <*> arbitraryReduced n -- encounterConditionValueNameLanguage :: LanguageSummary
  
instance Arbitrary EncounterConditionValueSummary where
  arbitrary = sized genEncounterConditionValueSummary

genEncounterConditionValueSummary :: Int -> Gen EncounterConditionValueSummary
genEncounterConditionValueSummary n =
  EncounterConditionValueSummary
    <$> arbitrary -- encounterConditionValueSummaryName :: Text
    <*> arbitrary -- encounterConditionValueSummaryUrl :: Text
  
instance Arbitrary EncounterMethodDetail where
  arbitrary = sized genEncounterMethodDetail

genEncounterMethodDetail :: Int -> Gen EncounterMethodDetail
genEncounterMethodDetail n =
  EncounterMethodDetail
    <$> arbitrary -- encounterMethodDetailId :: Int
    <*> arbitrary -- encounterMethodDetailName :: Text
    <*> arbitraryReducedMaybe n -- encounterMethodDetailOrder :: Maybe Int
    <*> arbitraryReduced n -- encounterMethodDetailNames :: [EncounterMethodName]
  
instance Arbitrary EncounterMethodName where
  arbitrary = sized genEncounterMethodName

genEncounterMethodName :: Int -> Gen EncounterMethodName
genEncounterMethodName n =
  EncounterMethodName
    <$> arbitrary -- encounterMethodNameName :: Text
    <*> arbitraryReduced n -- encounterMethodNameLanguage :: LanguageSummary
  
instance Arbitrary EncounterMethodSummary where
  arbitrary = sized genEncounterMethodSummary

genEncounterMethodSummary :: Int -> Gen EncounterMethodSummary
genEncounterMethodSummary n =
  EncounterMethodSummary
    <$> arbitrary -- encounterMethodSummaryName :: Text
    <*> arbitrary -- encounterMethodSummaryUrl :: Text
  
instance Arbitrary EncounterPokemonDetail where
  arbitrary = sized genEncounterPokemonDetail

genEncounterPokemonDetail :: Int -> Gen EncounterPokemonDetail
genEncounterPokemonDetail n =
  EncounterPokemonDetail
    <$> arbitraryReducedMaybe n -- encounterPokemonDetailMinPerfectIvs :: Maybe Int
    <*> arbitraryReducedMaybe n -- encounterPokemonDetailAlwaysShiny :: Maybe Bool
    <*> arbitraryReducedMaybe n -- encounterPokemonDetailNeverShiny :: Maybe Bool
    <*> arbitraryReducedMaybe n -- encounterPokemonDetailIsAlpha :: Maybe Bool
  
instance Arbitrary EvolutionChainDetail where
  arbitrary = sized genEvolutionChainDetail

genEvolutionChainDetail :: Int -> Gen EvolutionChainDetail
genEvolutionChainDetail n =
  EvolutionChainDetail
    <$> arbitrary -- evolutionChainDetailId :: Int
    <*> arbitraryReduced n -- evolutionChainDetailBabyTriggerItem :: ItemSummary
    <*> arbitraryReduced n -- evolutionChainDetailChain :: EvolutionChainLink
  
instance Arbitrary EvolutionChainLink where
  arbitrary = sized genEvolutionChainLink

genEvolutionChainLink :: Int -> Gen EvolutionChainLink
genEvolutionChainLink n =
  EvolutionChainLink
    <$> arbitrary -- evolutionChainLinkIsBaby :: Bool
    <*> arbitraryReduced n -- evolutionChainLinkSpecies :: PokemonSpeciesSummary
    <*> arbitraryReduced n -- evolutionChainLinkEvolutionDetails :: [PokemonEvolution]
    <*> arbitraryReduced n -- evolutionChainLinkEvolvesTo :: [EvolutionChainLink]
  
instance Arbitrary EvolutionChainSummary where
  arbitrary = sized genEvolutionChainSummary

genEvolutionChainSummary :: Int -> Gen EvolutionChainSummary
genEvolutionChainSummary n =
  EvolutionChainSummary
    <$> arbitrary -- evolutionChainSummaryUrl :: Text
  
instance Arbitrary EvolutionConditionExpression where
  arbitrary = sized genEvolutionConditionExpression

genEvolutionConditionExpression :: Int -> Gen EvolutionConditionExpression
genEvolutionConditionExpression n =
  EvolutionConditionExpression
    <$> arbitrary -- evolutionConditionExpressionExpression :: Text
    <*> arbitrary -- evolutionConditionExpressionPercentageChance :: Double
    <*> arbitraryReduced n -- evolutionConditionExpressionVariables :: [EvolutionVariableSummary]
  
instance Arbitrary EvolutionTriggerDetail where
  arbitrary = sized genEvolutionTriggerDetail

genEvolutionTriggerDetail :: Int -> Gen EvolutionTriggerDetail
genEvolutionTriggerDetail n =
  EvolutionTriggerDetail
    <$> arbitrary -- evolutionTriggerDetailId :: Int
    <*> arbitrary -- evolutionTriggerDetailName :: Text
    <*> arbitraryReduced n -- evolutionTriggerDetailNames :: [EvolutionTriggerName]
    <*> arbitraryReduced n -- evolutionTriggerDetailPokemonSpecies :: [PokemonSpeciesSummary]
  
instance Arbitrary EvolutionTriggerName where
  arbitrary = sized genEvolutionTriggerName

genEvolutionTriggerName :: Int -> Gen EvolutionTriggerName
genEvolutionTriggerName n =
  EvolutionTriggerName
    <$> arbitrary -- evolutionTriggerNameName :: Text
    <*> arbitraryReduced n -- evolutionTriggerNameLanguage :: LanguageSummary
  
instance Arbitrary EvolutionTriggerSummary where
  arbitrary = sized genEvolutionTriggerSummary

genEvolutionTriggerSummary :: Int -> Gen EvolutionTriggerSummary
genEvolutionTriggerSummary n =
  EvolutionTriggerSummary
    <$> arbitrary -- evolutionTriggerSummaryName :: Text
    <*> arbitrary -- evolutionTriggerSummaryUrl :: Text
  
instance Arbitrary EvolutionVariableDescription where
  arbitrary = sized genEvolutionVariableDescription

genEvolutionVariableDescription :: Int -> Gen EvolutionVariableDescription
genEvolutionVariableDescription n =
  EvolutionVariableDescription
    <$> arbitraryReducedMaybe n -- evolutionVariableDescriptionDescription :: Maybe Text
    <*> arbitraryReduced n -- evolutionVariableDescriptionLanguage :: LanguageSummary
  
instance Arbitrary EvolutionVariableDetail where
  arbitrary = sized genEvolutionVariableDetail

genEvolutionVariableDetail :: Int -> Gen EvolutionVariableDetail
genEvolutionVariableDetail n =
  EvolutionVariableDetail
    <$> arbitrary -- evolutionVariableDetailId :: Int
    <*> arbitrary -- evolutionVariableDetailName :: Text
    <*> arbitrary -- evolutionVariableDetailSymbol :: Text
    <*> arbitraryReducedMaybe n -- evolutionVariableDetailDataType :: Maybe Text
    <*> arbitraryReducedMaybe n -- evolutionVariableDetailSource :: Maybe Text
    <*> arbitraryReduced n -- evolutionVariableDetailVersionGroup :: VersionGroupSummary
    <*> arbitraryReduced n -- evolutionVariableDetailNames :: [EvolutionVariableName]
    <*> arbitraryReduced n -- evolutionVariableDetailDescriptions :: [EvolutionVariableDescription]
  
instance Arbitrary EvolutionVariableName where
  arbitrary = sized genEvolutionVariableName

genEvolutionVariableName :: Int -> Gen EvolutionVariableName
genEvolutionVariableName n =
  EvolutionVariableName
    <$> arbitrary -- evolutionVariableNameName :: Text
    <*> arbitraryReduced n -- evolutionVariableNameLanguage :: LanguageSummary
  
instance Arbitrary EvolutionVariableSummary where
  arbitrary = sized genEvolutionVariableSummary

genEvolutionVariableSummary :: Int -> Gen EvolutionVariableSummary
genEvolutionVariableSummary n =
  EvolutionVariableSummary
    <$> arbitrary -- evolutionVariableSummaryName :: Text
    <*> arbitrary -- evolutionVariableSummaryUrl :: Text
  
instance Arbitrary Experience where
  arbitrary = sized genExperience

genExperience :: Int -> Gen Experience
genExperience n =
  Experience
    <$> arbitrary -- experienceLevel :: Int
    <*> arbitrary -- experienceExperience :: Int
  
instance Arbitrary GenderDetail where
  arbitrary = sized genGenderDetail

genGenderDetail :: Int -> Gen GenderDetail
genGenderDetail n =
  GenderDetail
    <$> arbitrary -- genderDetailId :: Int
    <*> arbitrary -- genderDetailName :: Text
    <*> arbitraryReduced n -- genderDetailPokemonSpeciesDetails :: [GenderPokemonSpecies]
    <*> arbitraryReduced n -- genderDetailRequiredForEvolution :: [PokemonSpeciesSummary]
  
instance Arbitrary GenderPokemonSpecies where
  arbitrary = sized genGenderPokemonSpecies

genGenderPokemonSpecies :: Int -> Gen GenderPokemonSpecies
genGenderPokemonSpecies n =
  GenderPokemonSpecies
    <$> arbitrary -- genderPokemonSpeciesRate :: Int
    <*> arbitraryReduced n -- genderPokemonSpeciesPokemonSpecies :: PokemonSpeciesSummary
  
instance Arbitrary GenderSummary where
  arbitrary = sized genGenderSummary

genGenderSummary :: Int -> Gen GenderSummary
genGenderSummary n =
  GenderSummary
    <$> arbitrary -- genderSummaryName :: Text
    <*> arbitrary -- genderSummaryUrl :: Text
  
instance Arbitrary GenerationDetail where
  arbitrary = sized genGenerationDetail

genGenerationDetail :: Int -> Gen GenerationDetail
genGenerationDetail n =
  GenerationDetail
    <$> arbitrary -- generationDetailId :: Int
    <*> arbitrary -- generationDetailName :: Text
    <*> arbitraryReduced n -- generationDetailAbilities :: [AbilitySummary]
    <*> arbitraryReduced n -- generationDetailMainRegion :: RegionSummary
    <*> arbitraryReduced n -- generationDetailMoves :: [MoveSummary]
    <*> arbitraryReduced n -- generationDetailNames :: [GenerationName]
    <*> arbitraryReduced n -- generationDetailPokemonSpecies :: [PokemonSpeciesSummary]
    <*> arbitraryReduced n -- generationDetailTypes :: [TypeSummary]
    <*> arbitraryReduced n -- generationDetailVersionGroups :: [VersionGroupSummary]
  
instance Arbitrary GenerationName where
  arbitrary = sized genGenerationName

genGenerationName :: Int -> Gen GenerationName
genGenerationName n =
  GenerationName
    <$> arbitrary -- generationNameName :: Text
    <*> arbitraryReduced n -- generationNameLanguage :: LanguageSummary
  
instance Arbitrary GenerationSummary where
  arbitrary = sized genGenerationSummary

genGenerationSummary :: Int -> Gen GenerationSummary
genGenerationSummary n =
  GenerationSummary
    <$> arbitrary -- generationSummaryName :: Text
    <*> arbitrary -- generationSummaryUrl :: Text
  
instance Arbitrary GrowthRateDescription where
  arbitrary = sized genGrowthRateDescription

genGrowthRateDescription :: Int -> Gen GrowthRateDescription
genGrowthRateDescription n =
  GrowthRateDescription
    <$> arbitraryReducedMaybe n -- growthRateDescriptionDescription :: Maybe Text
    <*> arbitraryReduced n -- growthRateDescriptionLanguage :: LanguageSummary
  
instance Arbitrary GrowthRateDetail where
  arbitrary = sized genGrowthRateDetail

genGrowthRateDetail :: Int -> Gen GrowthRateDetail
genGrowthRateDetail n =
  GrowthRateDetail
    <$> arbitrary -- growthRateDetailId :: Int
    <*> arbitrary -- growthRateDetailName :: Text
    <*> arbitrary -- growthRateDetailFormula :: Text
    <*> arbitraryReduced n -- growthRateDetailDescriptions :: [GrowthRateDescription]
    <*> arbitraryReduced n -- growthRateDetailLevels :: [Experience]
    <*> arbitraryReduced n -- growthRateDetailPokemonSpecies :: [PokemonSpeciesSummary]
  
instance Arbitrary GrowthRateSummary where
  arbitrary = sized genGrowthRateSummary

genGrowthRateSummary :: Int -> Gen GrowthRateSummary
genGrowthRateSummary n =
  GrowthRateSummary
    <$> arbitrary -- growthRateSummaryName :: Text
    <*> arbitrary -- growthRateSummaryUrl :: Text
  
instance Arbitrary ItemAttributeDescription where
  arbitrary = sized genItemAttributeDescription

genItemAttributeDescription :: Int -> Gen ItemAttributeDescription
genItemAttributeDescription n =
  ItemAttributeDescription
    <$> arbitraryReducedMaybe n -- itemAttributeDescriptionDescription :: Maybe Text
    <*> arbitraryReduced n -- itemAttributeDescriptionLanguage :: LanguageSummary
  
instance Arbitrary ItemAttributeDetail where
  arbitrary = sized genItemAttributeDetail

genItemAttributeDetail :: Int -> Gen ItemAttributeDetail
genItemAttributeDetail n =
  ItemAttributeDetail
    <$> arbitrary -- itemAttributeDetailId :: Int
    <*> arbitrary -- itemAttributeDetailName :: Text
    <*> arbitraryReduced n -- itemAttributeDetailDescriptions :: [ItemAttributeDescription]
    <*> arbitraryReduced n -- itemAttributeDetailItems :: [ItemSummary]
    <*> arbitraryReduced n -- itemAttributeDetailNames :: [ItemAttributeName]
  
instance Arbitrary ItemAttributeName where
  arbitrary = sized genItemAttributeName

genItemAttributeName :: Int -> Gen ItemAttributeName
genItemAttributeName n =
  ItemAttributeName
    <$> arbitrary -- itemAttributeNameName :: Text
    <*> arbitraryReduced n -- itemAttributeNameLanguage :: LanguageSummary
  
instance Arbitrary ItemAttributeSummary where
  arbitrary = sized genItemAttributeSummary

genItemAttributeSummary :: Int -> Gen ItemAttributeSummary
genItemAttributeSummary n =
  ItemAttributeSummary
    <$> arbitrary -- itemAttributeSummaryName :: Text
    <*> arbitrary -- itemAttributeSummaryUrl :: Text
  
instance Arbitrary ItemCategoryDetail where
  arbitrary = sized genItemCategoryDetail

genItemCategoryDetail :: Int -> Gen ItemCategoryDetail
genItemCategoryDetail n =
  ItemCategoryDetail
    <$> arbitrary -- itemCategoryDetailId :: Int
    <*> arbitrary -- itemCategoryDetailName :: Text
    <*> arbitraryReduced n -- itemCategoryDetailItems :: [ItemSummary]
    <*> arbitraryReduced n -- itemCategoryDetailNames :: [ItemCategoryName]
    <*> arbitraryReduced n -- itemCategoryDetailPocket :: ItemPocketSummary
  
instance Arbitrary ItemCategoryName where
  arbitrary = sized genItemCategoryName

genItemCategoryName :: Int -> Gen ItemCategoryName
genItemCategoryName n =
  ItemCategoryName
    <$> arbitrary -- itemCategoryNameName :: Text
    <*> arbitraryReduced n -- itemCategoryNameLanguage :: LanguageSummary
  
instance Arbitrary ItemCategorySummary where
  arbitrary = sized genItemCategorySummary

genItemCategorySummary :: Int -> Gen ItemCategorySummary
genItemCategorySummary n =
  ItemCategorySummary
    <$> arbitrary -- itemCategorySummaryName :: Text
    <*> arbitrary -- itemCategorySummaryUrl :: Text
  
instance Arbitrary ItemDetail where
  arbitrary = sized genItemDetail

genItemDetail :: Int -> Gen ItemDetail
genItemDetail n =
  ItemDetail
    <$> arbitrary -- itemDetailId :: Int
    <*> arbitrary -- itemDetailName :: Text
    <*> arbitraryReducedMaybe n -- itemDetailFlingPower :: Maybe Int
    <*> arbitraryReduced n -- itemDetailFlingEffect :: ItemFlingEffectSummary
    <*> arbitraryReduced n -- itemDetailAttributes :: [ItemAttributeSummary]
    <*> arbitraryReduced n -- itemDetailCategory :: ItemCategorySummary
    <*> arbitraryReduced n -- itemDetailEffectEntries :: [ItemEffectText]
    <*> arbitraryReduced n -- itemDetailFlavorTextEntries :: [ItemFlavorText]
    <*> arbitraryReduced n -- itemDetailGameIndices :: [ItemGameIndex]
    <*> arbitraryReduced n -- itemDetailPrices :: [ItemPrice]
    <*> arbitraryReduced n -- itemDetailNames :: [ItemName]
    <*> arbitraryReduced n -- itemDetailHeldByPokemon :: [PokemonHeldItem]
    <*> arbitraryReduced n -- itemDetailSprites :: ItemSprites
    <*> arbitraryReduced n -- itemDetailBabyTriggerFor :: EvolutionChainSummary
    <*> arbitraryReduced n -- itemDetailMachines :: [ItemMachine]
  
instance Arbitrary ItemEffectText where
  arbitrary = sized genItemEffectText

genItemEffectText :: Int -> Gen ItemEffectText
genItemEffectText n =
  ItemEffectText
    <$> arbitrary -- itemEffectTextEffect :: Text
    <*> arbitrary -- itemEffectTextShortEffect :: Text
    <*> arbitraryReduced n -- itemEffectTextLanguage :: LanguageSummary
  
instance Arbitrary ItemFlavorText where
  arbitrary = sized genItemFlavorText

genItemFlavorText :: Int -> Gen ItemFlavorText
genItemFlavorText n =
  ItemFlavorText
    <$> arbitrary -- itemFlavorTextText :: Text
    <*> arbitraryReduced n -- itemFlavorTextVersionGroup :: VersionGroupSummary
    <*> arbitraryReduced n -- itemFlavorTextLanguage :: LanguageSummary
  
instance Arbitrary ItemFlingEffectDetail where
  arbitrary = sized genItemFlingEffectDetail

genItemFlingEffectDetail :: Int -> Gen ItemFlingEffectDetail
genItemFlingEffectDetail n =
  ItemFlingEffectDetail
    <$> arbitrary -- itemFlingEffectDetailId :: Int
    <*> arbitrary -- itemFlingEffectDetailName :: Text
    <*> arbitraryReduced n -- itemFlingEffectDetailEffectEntries :: [ItemFlingEffectEffectText]
    <*> arbitraryReduced n -- itemFlingEffectDetailItems :: [ItemSummary]
  
instance Arbitrary ItemFlingEffectEffectText where
  arbitrary = sized genItemFlingEffectEffectText

genItemFlingEffectEffectText :: Int -> Gen ItemFlingEffectEffectText
genItemFlingEffectEffectText n =
  ItemFlingEffectEffectText
    <$> arbitrary -- itemFlingEffectEffectTextEffect :: Text
    <*> arbitraryReduced n -- itemFlingEffectEffectTextLanguage :: LanguageSummary
  
instance Arbitrary ItemFlingEffectSummary where
  arbitrary = sized genItemFlingEffectSummary

genItemFlingEffectSummary :: Int -> Gen ItemFlingEffectSummary
genItemFlingEffectSummary n =
  ItemFlingEffectSummary
    <$> arbitrary -- itemFlingEffectSummaryName :: Text
    <*> arbitrary -- itemFlingEffectSummaryUrl :: Text
  
instance Arbitrary ItemGameIndex where
  arbitrary = sized genItemGameIndex

genItemGameIndex :: Int -> Gen ItemGameIndex
genItemGameIndex n =
  ItemGameIndex
    <$> arbitrary -- itemGameIndexGameIndex :: Int
    <*> arbitraryReduced n -- itemGameIndexGeneration :: GenerationSummary
  
instance Arbitrary ItemMachine where
  arbitrary = sized genItemMachine

genItemMachine :: Int -> Gen ItemMachine
genItemMachine n =
  ItemMachine
    <$> arbitraryReduced n -- itemMachineMachine :: MachineSummary
    <*> arbitraryReduced n -- itemMachineVersionGroup :: VersionGroupSummary
  
instance Arbitrary ItemName where
  arbitrary = sized genItemName

genItemName :: Int -> Gen ItemName
genItemName n =
  ItemName
    <$> arbitrary -- itemNameName :: Text
    <*> arbitraryReduced n -- itemNameLanguage :: LanguageSummary
  
instance Arbitrary ItemPocketDetail where
  arbitrary = sized genItemPocketDetail

genItemPocketDetail :: Int -> Gen ItemPocketDetail
genItemPocketDetail n =
  ItemPocketDetail
    <$> arbitrary -- itemPocketDetailId :: Int
    <*> arbitrary -- itemPocketDetailName :: Text
    <*> arbitraryReduced n -- itemPocketDetailCategories :: [ItemCategorySummary]
    <*> arbitraryReduced n -- itemPocketDetailNames :: [ItemPocketName]
  
instance Arbitrary ItemPocketName where
  arbitrary = sized genItemPocketName

genItemPocketName :: Int -> Gen ItemPocketName
genItemPocketName n =
  ItemPocketName
    <$> arbitrary -- itemPocketNameName :: Text
    <*> arbitraryReduced n -- itemPocketNameLanguage :: LanguageSummary
  
instance Arbitrary ItemPocketSummary where
  arbitrary = sized genItemPocketSummary

genItemPocketSummary :: Int -> Gen ItemPocketSummary
genItemPocketSummary n =
  ItemPocketSummary
    <$> arbitrary -- itemPocketSummaryName :: Text
    <*> arbitrary -- itemPocketSummaryUrl :: Text
  
instance Arbitrary ItemPrice where
  arbitrary = sized genItemPrice

genItemPrice :: Int -> Gen ItemPrice
genItemPrice n =
  ItemPrice
    <$> arbitraryReducedMaybe n -- itemPricePurchasePrice :: Maybe Int
    <*> arbitraryReducedMaybe n -- itemPriceSellPrice :: Maybe Int
    <*> arbitraryReduced n -- itemPriceCurrency :: CurrencySummary
    <*> arbitraryReduced n -- itemPriceVersionGroup :: VersionGroupSummary
  
instance Arbitrary ItemSprites where
  arbitrary = sized genItemSprites

genItemSprites :: Int -> Gen ItemSprites
genItemSprites n =
  ItemSprites
    <$> arbitrary -- itemSpritesDefault :: Text
  
instance Arbitrary ItemSummary where
  arbitrary = sized genItemSummary

genItemSummary :: Int -> Gen ItemSummary
genItemSummary n =
  ItemSummary
    <$> arbitrary -- itemSummaryName :: Text
    <*> arbitrary -- itemSummaryUrl :: Text
  
instance Arbitrary LanguageDetail where
  arbitrary = sized genLanguageDetail

genLanguageDetail :: Int -> Gen LanguageDetail
genLanguageDetail n =
  LanguageDetail
    <$> arbitrary -- languageDetailId :: Int
    <*> arbitrary -- languageDetailName :: Text
    <*> arbitraryReducedMaybe n -- languageDetailOfficial :: Maybe Bool
    <*> arbitrary -- languageDetailIso639 :: Text
    <*> arbitrary -- languageDetailIso3166 :: Text
    <*> arbitraryReduced n -- languageDetailNames :: [LanguageName]
  
instance Arbitrary LanguageName where
  arbitrary = sized genLanguageName

genLanguageName :: Int -> Gen LanguageName
genLanguageName n =
  LanguageName
    <$> arbitrary -- languageNameName :: Text
    <*> arbitraryReduced n -- languageNameLanguage :: LanguageSummary
  
instance Arbitrary LanguageSummary where
  arbitrary = sized genLanguageSummary

genLanguageSummary :: Int -> Gen LanguageSummary
genLanguageSummary n =
  LanguageSummary
    <$> arbitrary -- languageSummaryName :: Text
    <*> arbitrary -- languageSummaryUrl :: Text
  
instance Arbitrary LocationAreaDetail where
  arbitrary = sized genLocationAreaDetail

genLocationAreaDetail :: Int -> Gen LocationAreaDetail
genLocationAreaDetail n =
  LocationAreaDetail
    <$> arbitrary -- locationAreaDetailId :: Int
    <*> arbitrary -- locationAreaDetailName :: Text
    <*> arbitrary -- locationAreaDetailGameIndex :: Int
    <*> arbitraryReduced n -- locationAreaDetailEncounterMethodRates :: [LocationAreaEncounterRate]
    <*> arbitraryReduced n -- locationAreaDetailLocation :: LocationSummary
    <*> arbitraryReduced n -- locationAreaDetailNames :: [LocationAreaName]
    <*> arbitraryReduced n -- locationAreaDetailPokemonEncounters :: [LocationAreaPokemonEncounter]
  
instance Arbitrary LocationAreaEncounterDetail where
  arbitrary = sized genLocationAreaEncounterDetail

genLocationAreaEncounterDetail :: Int -> Gen LocationAreaEncounterDetail
genLocationAreaEncounterDetail n =
  LocationAreaEncounterDetail
    <$> arbitrary -- locationAreaEncounterDetailMinLevel :: Int
    <*> arbitrary -- locationAreaEncounterDetailMaxLevel :: Int
    <*> arbitraryReducedMaybe n -- locationAreaEncounterDetailChance :: Maybe Int
    <*> arbitraryReducedMaybe n -- locationAreaEncounterDetailMethod :: Maybe EncounterMethodSummary
    <*> arbitraryReduced n -- locationAreaEncounterDetailConditionValues :: [EncounterConditionValueSummary]
    <*> arbitraryReduced n -- locationAreaEncounterDetailPokemonDetails :: EncounterPokemonDetail
  
instance Arbitrary LocationAreaEncounterRate where
  arbitrary = sized genLocationAreaEncounterRate

genLocationAreaEncounterRate :: Int -> Gen LocationAreaEncounterRate
genLocationAreaEncounterRate n =
  LocationAreaEncounterRate
    <$> arbitraryReduced n -- locationAreaEncounterRateEncounterMethod :: EncounterMethodSummary
    <*> arbitraryReduced n -- locationAreaEncounterRateVersionDetails :: [LocationAreaEncounterVersionDetail]
  
instance Arbitrary LocationAreaEncounterVersionDetail where
  arbitrary = sized genLocationAreaEncounterVersionDetail

genLocationAreaEncounterVersionDetail :: Int -> Gen LocationAreaEncounterVersionDetail
genLocationAreaEncounterVersionDetail n =
  LocationAreaEncounterVersionDetail
    <$> arbitrary -- locationAreaEncounterVersionDetailRate :: Int
    <*> arbitraryReduced n -- locationAreaEncounterVersionDetailVersion :: VersionSummary
  
instance Arbitrary LocationAreaName where
  arbitrary = sized genLocationAreaName

genLocationAreaName :: Int -> Gen LocationAreaName
genLocationAreaName n =
  LocationAreaName
    <$> arbitrary -- locationAreaNameName :: Text
    <*> arbitraryReduced n -- locationAreaNameLanguage :: LanguageSummary
  
instance Arbitrary LocationAreaPokemonEncounter where
  arbitrary = sized genLocationAreaPokemonEncounter

genLocationAreaPokemonEncounter :: Int -> Gen LocationAreaPokemonEncounter
genLocationAreaPokemonEncounter n =
  LocationAreaPokemonEncounter
    <$> arbitraryReduced n -- locationAreaPokemonEncounterPokemon :: PokemonSummary
    <*> arbitraryReduced n -- locationAreaPokemonEncounterVersionDetails :: [LocationAreaPokemonEncounterVersion]
  
instance Arbitrary LocationAreaPokemonEncounterVersion where
  arbitrary = sized genLocationAreaPokemonEncounterVersion

genLocationAreaPokemonEncounterVersion :: Int -> Gen LocationAreaPokemonEncounterVersion
genLocationAreaPokemonEncounterVersion n =
  LocationAreaPokemonEncounterVersion
    <$> arbitraryReduced n -- locationAreaPokemonEncounterVersionVersion :: VersionSummary
    <*> arbitrary -- locationAreaPokemonEncounterVersionMaxChance :: Int
    <*> arbitraryReduced n -- locationAreaPokemonEncounterVersionEncounterDetails :: [LocationAreaEncounterDetail]
  
instance Arbitrary LocationAreaSummary where
  arbitrary = sized genLocationAreaSummary

genLocationAreaSummary :: Int -> Gen LocationAreaSummary
genLocationAreaSummary n =
  LocationAreaSummary
    <$> arbitrary -- locationAreaSummaryName :: Text
    <*> arbitrary -- locationAreaSummaryUrl :: Text
  
instance Arbitrary LocationDetail where
  arbitrary = sized genLocationDetail

genLocationDetail :: Int -> Gen LocationDetail
genLocationDetail n =
  LocationDetail
    <$> arbitrary -- locationDetailId :: Int
    <*> arbitrary -- locationDetailName :: Text
    <*> arbitraryReduced n -- locationDetailRegion :: RegionSummary
    <*> arbitraryReduced n -- locationDetailNames :: [LocationName]
    <*> arbitraryReduced n -- locationDetailGameIndices :: [LocationGameIndex]
    <*> arbitraryReduced n -- locationDetailAreas :: [LocationAreaSummary]
  
instance Arbitrary LocationGameIndex where
  arbitrary = sized genLocationGameIndex

genLocationGameIndex :: Int -> Gen LocationGameIndex
genLocationGameIndex n =
  LocationGameIndex
    <$> arbitrary -- locationGameIndexGameIndex :: Int
    <*> arbitraryReduced n -- locationGameIndexGeneration :: GenerationSummary
  
instance Arbitrary LocationName where
  arbitrary = sized genLocationName

genLocationName :: Int -> Gen LocationName
genLocationName n =
  LocationName
    <$> arbitrary -- locationNameName :: Text
    <*> arbitraryReduced n -- locationNameLanguage :: LanguageSummary
  
instance Arbitrary LocationSummary where
  arbitrary = sized genLocationSummary

genLocationSummary :: Int -> Gen LocationSummary
genLocationSummary n =
  LocationSummary
    <$> arbitrary -- locationSummaryName :: Text
    <*> arbitrary -- locationSummaryUrl :: Text
  
instance Arbitrary MachineDetail where
  arbitrary = sized genMachineDetail

genMachineDetail :: Int -> Gen MachineDetail
genMachineDetail n =
  MachineDetail
    <$> arbitrary -- machineDetailId :: Int
    <*> arbitraryReduced n -- machineDetailItem :: ItemSummary
    <*> arbitraryReduced n -- machineDetailVersionGroup :: VersionGroupSummary
    <*> arbitraryReduced n -- machineDetailMove :: MoveSummary
  
instance Arbitrary MachineSummary where
  arbitrary = sized genMachineSummary

genMachineSummary :: Int -> Gen MachineSummary
genMachineSummary n =
  MachineSummary
    <$> arbitrary -- machineSummaryUrl :: Text
  
instance Arbitrary MoveBattleStyleDetail where
  arbitrary = sized genMoveBattleStyleDetail

genMoveBattleStyleDetail :: Int -> Gen MoveBattleStyleDetail
genMoveBattleStyleDetail n =
  MoveBattleStyleDetail
    <$> arbitrary -- moveBattleStyleDetailId :: Int
    <*> arbitrary -- moveBattleStyleDetailName :: Text
    <*> arbitraryReduced n -- moveBattleStyleDetailNames :: [MoveBattleStyleName]
  
instance Arbitrary MoveBattleStyleName where
  arbitrary = sized genMoveBattleStyleName

genMoveBattleStyleName :: Int -> Gen MoveBattleStyleName
genMoveBattleStyleName n =
  MoveBattleStyleName
    <$> arbitrary -- moveBattleStyleNameName :: Text
    <*> arbitraryReduced n -- moveBattleStyleNameLanguage :: LanguageSummary
  
instance Arbitrary MoveBattleStyleSummary where
  arbitrary = sized genMoveBattleStyleSummary

genMoveBattleStyleSummary :: Int -> Gen MoveBattleStyleSummary
genMoveBattleStyleSummary n =
  MoveBattleStyleSummary
    <$> arbitrary -- moveBattleStyleSummaryName :: Text
    <*> arbitrary -- moveBattleStyleSummaryUrl :: Text
  
instance Arbitrary MoveChange where
  arbitrary = sized genMoveChange

genMoveChange :: Int -> Gen MoveChange
genMoveChange n =
  MoveChange
    <$> arbitraryReducedMaybe n -- moveChangeAccuracy :: Maybe Int
    <*> arbitraryReducedMaybe n -- moveChangePower :: Maybe Int
    <*> arbitraryReducedMaybe n -- moveChangePp :: Maybe Int
    <*> arbitrary -- moveChangeEffectChance :: Int
    <*> arbitraryReduced n -- moveChangeEffectEntries :: [MoveEffectEffectText]
    <*> arbitraryReduced n -- moveChangeType :: TypeSummary
    <*> arbitraryReduced n -- moveChangeVersionGroup :: VersionGroupSummary
  
instance Arbitrary MoveComboUsage where
  arbitrary = sized genMoveComboUsage

genMoveComboUsage :: Int -> Gen MoveComboUsage
genMoveComboUsage n =
  MoveComboUsage
    <$> arbitraryReduced n -- moveComboUsageUseBefore :: [MoveSummary]
    <*> arbitraryReduced n -- moveComboUsageUseAfter :: [MoveSummary]
  
instance Arbitrary MoveCombos where
  arbitrary = sized genMoveCombos

genMoveCombos :: Int -> Gen MoveCombos
genMoveCombos n =
  MoveCombos
    <$> arbitraryReduced n -- moveCombosNormal :: MoveComboUsage
    <*> arbitraryReduced n -- moveCombosSuper :: MoveComboUsage
  
instance Arbitrary MoveDamageClassDescription where
  arbitrary = sized genMoveDamageClassDescription

genMoveDamageClassDescription :: Int -> Gen MoveDamageClassDescription
genMoveDamageClassDescription n =
  MoveDamageClassDescription
    <$> arbitraryReducedMaybe n -- moveDamageClassDescriptionDescription :: Maybe Text
    <*> arbitraryReduced n -- moveDamageClassDescriptionLanguage :: LanguageSummary
  
instance Arbitrary MoveDamageClassDetail where
  arbitrary = sized genMoveDamageClassDetail

genMoveDamageClassDetail :: Int -> Gen MoveDamageClassDetail
genMoveDamageClassDetail n =
  MoveDamageClassDetail
    <$> arbitrary -- moveDamageClassDetailId :: Int
    <*> arbitrary -- moveDamageClassDetailName :: Text
    <*> arbitraryReduced n -- moveDamageClassDetailDescriptions :: [MoveDamageClassDescription]
    <*> arbitraryReduced n -- moveDamageClassDetailMoves :: [MoveSummary]
    <*> arbitraryReduced n -- moveDamageClassDetailNames :: [MoveDamageClassName]
  
instance Arbitrary MoveDamageClassName where
  arbitrary = sized genMoveDamageClassName

genMoveDamageClassName :: Int -> Gen MoveDamageClassName
genMoveDamageClassName n =
  MoveDamageClassName
    <$> arbitrary -- moveDamageClassNameName :: Text
    <*> arbitraryReduced n -- moveDamageClassNameLanguage :: LanguageSummary
  
instance Arbitrary MoveDamageClassSummary where
  arbitrary = sized genMoveDamageClassSummary

genMoveDamageClassSummary :: Int -> Gen MoveDamageClassSummary
genMoveDamageClassSummary n =
  MoveDamageClassSummary
    <$> arbitrary -- moveDamageClassSummaryName :: Text
    <*> arbitrary -- moveDamageClassSummaryUrl :: Text
  
instance Arbitrary MoveDetail where
  arbitrary = sized genMoveDetail

genMoveDetail :: Int -> Gen MoveDetail
genMoveDetail n =
  MoveDetail
    <$> arbitrary -- moveDetailId :: Int
    <*> arbitrary -- moveDetailName :: Text
    <*> arbitraryReducedMaybe n -- moveDetailAccuracy :: Maybe Int
    <*> arbitrary -- moveDetailEffectChance :: Int
    <*> arbitraryReducedMaybe n -- moveDetailPp :: Maybe Int
    <*> arbitraryReducedMaybe n -- moveDetailPriority :: Maybe Int
    <*> arbitraryReducedMaybe n -- moveDetailPower :: Maybe Int
    <*> arbitraryReduced n -- moveDetailContestCombos :: MoveCombos
    <*> arbitraryReduced n -- moveDetailContestType :: ContestTypeSummary
    <*> arbitraryReduced n -- moveDetailContestEffect :: ContestEffectSummary
    <*> arbitraryReduced n -- moveDetailDamageClass :: MoveDamageClassSummary
    <*> arbitraryReduced n -- moveDetailEffectEntries :: [MoveEffectEffectText]
    <*> arbitraryReduced n -- moveDetailEffectChanges :: [MoveEffectChange]
    <*> arbitraryReduced n -- moveDetailGeneration :: GenerationSummary
    <*> arbitraryReduced n -- moveDetailMeta :: MoveMeta
    <*> arbitraryReduced n -- moveDetailNames :: [MoveName]
    <*> arbitraryReduced n -- moveDetailPastValues :: [MoveChange]
    <*> arbitraryReduced n -- moveDetailStatChanges :: [MoveMetaStatChange]
    <*> arbitraryReduced n -- moveDetailSuperContestEffect :: SuperContestEffectSummary
    <*> arbitraryReduced n -- moveDetailTarget :: MoveTargetSummary
    <*> arbitraryReduced n -- moveDetailType :: TypeSummary
    <*> arbitraryReduced n -- moveDetailMachines :: [ItemMachine]
    <*> arbitraryReduced n -- moveDetailFlavorTextEntries :: [MoveFlavorText]
    <*> arbitraryReduced n -- moveDetailLearnedByPokemon :: [PokemonSummary]
  
instance Arbitrary MoveEffectChange where
  arbitrary = sized genMoveEffectChange

genMoveEffectChange :: Int -> Gen MoveEffectChange
genMoveEffectChange n =
  MoveEffectChange
    <$> arbitraryReduced n -- moveEffectChangeVersionGroup :: VersionGroupSummary
    <*> arbitraryReduced n -- moveEffectChangeEffectEntries :: [MoveEffectChangeEffectText]
  
instance Arbitrary MoveEffectChangeEffectText where
  arbitrary = sized genMoveEffectChangeEffectText

genMoveEffectChangeEffectText :: Int -> Gen MoveEffectChangeEffectText
genMoveEffectChangeEffectText n =
  MoveEffectChangeEffectText
    <$> arbitrary -- moveEffectChangeEffectTextEffect :: Text
    <*> arbitraryReduced n -- moveEffectChangeEffectTextLanguage :: LanguageSummary
  
instance Arbitrary MoveEffectEffectText where
  arbitrary = sized genMoveEffectEffectText

genMoveEffectEffectText :: Int -> Gen MoveEffectEffectText
genMoveEffectEffectText n =
  MoveEffectEffectText
    <$> arbitrary -- moveEffectEffectTextEffect :: Text
    <*> arbitrary -- moveEffectEffectTextShortEffect :: Text
    <*> arbitraryReduced n -- moveEffectEffectTextLanguage :: LanguageSummary
  
instance Arbitrary MoveFlavorText where
  arbitrary = sized genMoveFlavorText

genMoveFlavorText :: Int -> Gen MoveFlavorText
genMoveFlavorText n =
  MoveFlavorText
    <$> arbitrary -- moveFlavorTextFlavorText :: Text
    <*> arbitraryReduced n -- moveFlavorTextLanguage :: LanguageSummary
    <*> arbitraryReduced n -- moveFlavorTextVersionGroup :: VersionGroupSummary
  
instance Arbitrary MoveLearnMethodDescription where
  arbitrary = sized genMoveLearnMethodDescription

genMoveLearnMethodDescription :: Int -> Gen MoveLearnMethodDescription
genMoveLearnMethodDescription n =
  MoveLearnMethodDescription
    <$> arbitraryReducedMaybe n -- moveLearnMethodDescriptionDescription :: Maybe Text
    <*> arbitraryReduced n -- moveLearnMethodDescriptionLanguage :: LanguageSummary
  
instance Arbitrary MoveLearnMethodDetail where
  arbitrary = sized genMoveLearnMethodDetail

genMoveLearnMethodDetail :: Int -> Gen MoveLearnMethodDetail
genMoveLearnMethodDetail n =
  MoveLearnMethodDetail
    <$> arbitrary -- moveLearnMethodDetailId :: Int
    <*> arbitrary -- moveLearnMethodDetailName :: Text
    <*> arbitraryReduced n -- moveLearnMethodDetailNames :: [MoveLearnMethodName]
    <*> arbitraryReduced n -- moveLearnMethodDetailDescriptions :: [MoveLearnMethodDescription]
    <*> arbitraryReduced n -- moveLearnMethodDetailVersionGroups :: [VersionGroupSummary]
  
instance Arbitrary MoveLearnMethodName where
  arbitrary = sized genMoveLearnMethodName

genMoveLearnMethodName :: Int -> Gen MoveLearnMethodName
genMoveLearnMethodName n =
  MoveLearnMethodName
    <$> arbitrary -- moveLearnMethodNameName :: Text
    <*> arbitraryReduced n -- moveLearnMethodNameLanguage :: LanguageSummary
  
instance Arbitrary MoveLearnMethodSummary where
  arbitrary = sized genMoveLearnMethodSummary

genMoveLearnMethodSummary :: Int -> Gen MoveLearnMethodSummary
genMoveLearnMethodSummary n =
  MoveLearnMethodSummary
    <$> arbitrary -- moveLearnMethodSummaryName :: Text
    <*> arbitrary -- moveLearnMethodSummaryUrl :: Text
  
instance Arbitrary MoveMeta where
  arbitrary = sized genMoveMeta

genMoveMeta :: Int -> Gen MoveMeta
genMoveMeta n =
  MoveMeta
    <$> arbitraryReduced n -- moveMetaAilment :: MoveMetaAilmentSummary
    <*> arbitraryReduced n -- moveMetaCategory :: MoveMetaCategorySummary
    <*> arbitraryReducedMaybe n -- moveMetaMinHits :: Maybe Int
    <*> arbitraryReducedMaybe n -- moveMetaMaxHits :: Maybe Int
    <*> arbitraryReducedMaybe n -- moveMetaMinTurns :: Maybe Int
    <*> arbitraryReducedMaybe n -- moveMetaMaxTurns :: Maybe Int
    <*> arbitraryReducedMaybe n -- moveMetaDrain :: Maybe Int
    <*> arbitraryReducedMaybe n -- moveMetaHealing :: Maybe Int
    <*> arbitraryReducedMaybe n -- moveMetaCritRate :: Maybe Int
    <*> arbitraryReducedMaybe n -- moveMetaAilmentChance :: Maybe Int
    <*> arbitraryReducedMaybe n -- moveMetaFlinchChance :: Maybe Int
    <*> arbitraryReducedMaybe n -- moveMetaStatChance :: Maybe Int
  
instance Arbitrary MoveMetaAilmentDetail where
  arbitrary = sized genMoveMetaAilmentDetail

genMoveMetaAilmentDetail :: Int -> Gen MoveMetaAilmentDetail
genMoveMetaAilmentDetail n =
  MoveMetaAilmentDetail
    <$> arbitrary -- moveMetaAilmentDetailId :: Int
    <*> arbitrary -- moveMetaAilmentDetailName :: Text
    <*> arbitraryReduced n -- moveMetaAilmentDetailMoves :: [MoveSummary]
    <*> arbitraryReduced n -- moveMetaAilmentDetailNames :: [MoveMetaAilmentName]
  
instance Arbitrary MoveMetaAilmentName where
  arbitrary = sized genMoveMetaAilmentName

genMoveMetaAilmentName :: Int -> Gen MoveMetaAilmentName
genMoveMetaAilmentName n =
  MoveMetaAilmentName
    <$> arbitrary -- moveMetaAilmentNameName :: Text
    <*> arbitraryReduced n -- moveMetaAilmentNameLanguage :: LanguageSummary
  
instance Arbitrary MoveMetaAilmentSummary where
  arbitrary = sized genMoveMetaAilmentSummary

genMoveMetaAilmentSummary :: Int -> Gen MoveMetaAilmentSummary
genMoveMetaAilmentSummary n =
  MoveMetaAilmentSummary
    <$> arbitrary -- moveMetaAilmentSummaryName :: Text
    <*> arbitrary -- moveMetaAilmentSummaryUrl :: Text
  
instance Arbitrary MoveMetaCategoryDescription where
  arbitrary = sized genMoveMetaCategoryDescription

genMoveMetaCategoryDescription :: Int -> Gen MoveMetaCategoryDescription
genMoveMetaCategoryDescription n =
  MoveMetaCategoryDescription
    <$> arbitraryReducedMaybe n -- moveMetaCategoryDescriptionDescription :: Maybe Text
    <*> arbitraryReduced n -- moveMetaCategoryDescriptionLanguage :: LanguageSummary
  
instance Arbitrary MoveMetaCategoryDetail where
  arbitrary = sized genMoveMetaCategoryDetail

genMoveMetaCategoryDetail :: Int -> Gen MoveMetaCategoryDetail
genMoveMetaCategoryDetail n =
  MoveMetaCategoryDetail
    <$> arbitrary -- moveMetaCategoryDetailId :: Int
    <*> arbitrary -- moveMetaCategoryDetailName :: Text
    <*> arbitraryReduced n -- moveMetaCategoryDetailDescriptions :: [MoveMetaCategoryDescription]
    <*> arbitraryReduced n -- moveMetaCategoryDetailMoves :: [MoveSummary]
  
instance Arbitrary MoveMetaCategorySummary where
  arbitrary = sized genMoveMetaCategorySummary

genMoveMetaCategorySummary :: Int -> Gen MoveMetaCategorySummary
genMoveMetaCategorySummary n =
  MoveMetaCategorySummary
    <$> arbitrary -- moveMetaCategorySummaryName :: Text
    <*> arbitrary -- moveMetaCategorySummaryUrl :: Text
  
instance Arbitrary MoveMetaStatChange where
  arbitrary = sized genMoveMetaStatChange

genMoveMetaStatChange :: Int -> Gen MoveMetaStatChange
genMoveMetaStatChange n =
  MoveMetaStatChange
    <$> arbitrary -- moveMetaStatChangeChange :: Int
    <*> arbitraryReduced n -- moveMetaStatChangeStat :: StatSummary
  
instance Arbitrary MoveName where
  arbitrary = sized genMoveName

genMoveName :: Int -> Gen MoveName
genMoveName n =
  MoveName
    <$> arbitrary -- moveNameName :: Text
    <*> arbitraryReduced n -- moveNameLanguage :: LanguageSummary
  
instance Arbitrary MoveStatChange where
  arbitrary = sized genMoveStatChange

genMoveStatChange :: Int -> Gen MoveStatChange
genMoveStatChange n =
  MoveStatChange
    <$> arbitrary -- moveStatChangeChange :: Int
    <*> arbitraryReduced n -- moveStatChangeMove :: MoveSummary
  
instance Arbitrary MoveSummary where
  arbitrary = sized genMoveSummary

genMoveSummary :: Int -> Gen MoveSummary
genMoveSummary n =
  MoveSummary
    <$> arbitrary -- moveSummaryName :: Text
    <*> arbitrary -- moveSummaryUrl :: Text
  
instance Arbitrary MoveTargetDescription where
  arbitrary = sized genMoveTargetDescription

genMoveTargetDescription :: Int -> Gen MoveTargetDescription
genMoveTargetDescription n =
  MoveTargetDescription
    <$> arbitraryReducedMaybe n -- moveTargetDescriptionDescription :: Maybe Text
    <*> arbitraryReduced n -- moveTargetDescriptionLanguage :: LanguageSummary
  
instance Arbitrary MoveTargetDetail where
  arbitrary = sized genMoveTargetDetail

genMoveTargetDetail :: Int -> Gen MoveTargetDetail
genMoveTargetDetail n =
  MoveTargetDetail
    <$> arbitrary -- moveTargetDetailId :: Int
    <*> arbitrary -- moveTargetDetailName :: Text
    <*> arbitraryReduced n -- moveTargetDetailDescriptions :: [MoveTargetDescription]
    <*> arbitraryReduced n -- moveTargetDetailMoves :: [MoveSummary]
    <*> arbitraryReduced n -- moveTargetDetailNames :: [MoveTargetName]
  
instance Arbitrary MoveTargetName where
  arbitrary = sized genMoveTargetName

genMoveTargetName :: Int -> Gen MoveTargetName
genMoveTargetName n =
  MoveTargetName
    <$> arbitrary -- moveTargetNameName :: Text
    <*> arbitraryReduced n -- moveTargetNameLanguage :: LanguageSummary
  
instance Arbitrary MoveTargetSummary where
  arbitrary = sized genMoveTargetSummary

genMoveTargetSummary :: Int -> Gen MoveTargetSummary
genMoveTargetSummary n =
  MoveTargetSummary
    <$> arbitrary -- moveTargetSummaryName :: Text
    <*> arbitrary -- moveTargetSummaryUrl :: Text
  
instance Arbitrary NatureBattleStylePreference where
  arbitrary = sized genNatureBattleStylePreference

genNatureBattleStylePreference :: Int -> Gen NatureBattleStylePreference
genNatureBattleStylePreference n =
  NatureBattleStylePreference
    <$> arbitrary -- natureBattleStylePreferenceLowHpPreference :: Int
    <*> arbitrary -- natureBattleStylePreferenceHighHpPreference :: Int
    <*> arbitraryReduced n -- natureBattleStylePreferenceMoveBattleStyle :: MoveBattleStyleSummary
  
instance Arbitrary NatureDetail where
  arbitrary = sized genNatureDetail

genNatureDetail :: Int -> Gen NatureDetail
genNatureDetail n =
  NatureDetail
    <$> arbitrary -- natureDetailId :: Int
    <*> arbitrary -- natureDetailName :: Text
    <*> arbitraryReduced n -- natureDetailDecreasedStat :: StatSummary
    <*> arbitraryReduced n -- natureDetailIncreasedStat :: StatSummary
    <*> arbitraryReduced n -- natureDetailLikesFlavor :: BerryFlavorSummary
    <*> arbitraryReduced n -- natureDetailHatesFlavor :: BerryFlavorSummary
    <*> arbitraryReduced n -- natureDetailPokeathlonStatChanges :: [NaturePokeathlonStat]
    <*> arbitraryReduced n -- natureDetailMoveBattleStylePreferences :: [NatureBattleStylePreference]
    <*> arbitraryReduced n -- natureDetailNames :: [NatureName]
  
instance Arbitrary NatureName where
  arbitrary = sized genNatureName

genNatureName :: Int -> Gen NatureName
genNatureName n =
  NatureName
    <$> arbitrary -- natureNameName :: Text
    <*> arbitraryReduced n -- natureNameLanguage :: LanguageSummary
  
instance Arbitrary NaturePokeathlonStat where
  arbitrary = sized genNaturePokeathlonStat

genNaturePokeathlonStat :: Int -> Gen NaturePokeathlonStat
genNaturePokeathlonStat n =
  NaturePokeathlonStat
    <$> arbitrary -- naturePokeathlonStatMaxChange :: Int
    <*> arbitraryReduced n -- naturePokeathlonStatPokeathlonStat :: PokeathlonStatSummary
  
instance Arbitrary NatureSummary where
  arbitrary = sized genNatureSummary

genNatureSummary :: Int -> Gen NatureSummary
genNatureSummary n =
  NatureSummary
    <$> arbitrary -- natureSummaryName :: Text
    <*> arbitrary -- natureSummaryUrl :: Text
  
instance Arbitrary PaginatedAbilitySummaryList where
  arbitrary = sized genPaginatedAbilitySummaryList

genPaginatedAbilitySummaryList :: Int -> Gen PaginatedAbilitySummaryList
genPaginatedAbilitySummaryList n =
  PaginatedAbilitySummaryList
    <$> arbitrary -- paginatedAbilitySummaryListCount :: Int
    <*> arbitraryReducedMaybe n -- paginatedAbilitySummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedAbilitySummaryListPrevious :: Maybe Text
    <*> arbitraryReduced n -- paginatedAbilitySummaryListResults :: [AbilitySummary]
  
instance Arbitrary PaginatedBerryFirmnessSummaryList where
  arbitrary = sized genPaginatedBerryFirmnessSummaryList

genPaginatedBerryFirmnessSummaryList :: Int -> Gen PaginatedBerryFirmnessSummaryList
genPaginatedBerryFirmnessSummaryList n =
  PaginatedBerryFirmnessSummaryList
    <$> arbitrary -- paginatedBerryFirmnessSummaryListCount :: Int
    <*> arbitraryReducedMaybe n -- paginatedBerryFirmnessSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedBerryFirmnessSummaryListPrevious :: Maybe Text
    <*> arbitraryReduced n -- paginatedBerryFirmnessSummaryListResults :: [BerryFirmnessSummary]
  
instance Arbitrary PaginatedBerryFlavorSummaryList where
  arbitrary = sized genPaginatedBerryFlavorSummaryList

genPaginatedBerryFlavorSummaryList :: Int -> Gen PaginatedBerryFlavorSummaryList
genPaginatedBerryFlavorSummaryList n =
  PaginatedBerryFlavorSummaryList
    <$> arbitrary -- paginatedBerryFlavorSummaryListCount :: Int
    <*> arbitraryReducedMaybe n -- paginatedBerryFlavorSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedBerryFlavorSummaryListPrevious :: Maybe Text
    <*> arbitraryReduced n -- paginatedBerryFlavorSummaryListResults :: [BerryFlavorSummary]
  
instance Arbitrary PaginatedBerrySummaryList where
  arbitrary = sized genPaginatedBerrySummaryList

genPaginatedBerrySummaryList :: Int -> Gen PaginatedBerrySummaryList
genPaginatedBerrySummaryList n =
  PaginatedBerrySummaryList
    <$> arbitrary -- paginatedBerrySummaryListCount :: Int
    <*> arbitraryReducedMaybe n -- paginatedBerrySummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedBerrySummaryListPrevious :: Maybe Text
    <*> arbitraryReduced n -- paginatedBerrySummaryListResults :: [BerrySummary]
  
instance Arbitrary PaginatedCharacteristicSummaryList where
  arbitrary = sized genPaginatedCharacteristicSummaryList

genPaginatedCharacteristicSummaryList :: Int -> Gen PaginatedCharacteristicSummaryList
genPaginatedCharacteristicSummaryList n =
  PaginatedCharacteristicSummaryList
    <$> arbitrary -- paginatedCharacteristicSummaryListCount :: Int
    <*> arbitraryReducedMaybe n -- paginatedCharacteristicSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedCharacteristicSummaryListPrevious :: Maybe Text
    <*> arbitraryReduced n -- paginatedCharacteristicSummaryListResults :: [CharacteristicSummary]
  
instance Arbitrary PaginatedContestEffectSummaryList where
  arbitrary = sized genPaginatedContestEffectSummaryList

genPaginatedContestEffectSummaryList :: Int -> Gen PaginatedContestEffectSummaryList
genPaginatedContestEffectSummaryList n =
  PaginatedContestEffectSummaryList
    <$> arbitrary -- paginatedContestEffectSummaryListCount :: Int
    <*> arbitraryReducedMaybe n -- paginatedContestEffectSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedContestEffectSummaryListPrevious :: Maybe Text
    <*> arbitraryReduced n -- paginatedContestEffectSummaryListResults :: [ContestEffectSummary]
  
instance Arbitrary PaginatedContestTypeSummaryList where
  arbitrary = sized genPaginatedContestTypeSummaryList

genPaginatedContestTypeSummaryList :: Int -> Gen PaginatedContestTypeSummaryList
genPaginatedContestTypeSummaryList n =
  PaginatedContestTypeSummaryList
    <$> arbitrary -- paginatedContestTypeSummaryListCount :: Int
    <*> arbitraryReducedMaybe n -- paginatedContestTypeSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedContestTypeSummaryListPrevious :: Maybe Text
    <*> arbitraryReduced n -- paginatedContestTypeSummaryListResults :: [ContestTypeSummary]
  
instance Arbitrary PaginatedCurrencySummaryList where
  arbitrary = sized genPaginatedCurrencySummaryList

genPaginatedCurrencySummaryList :: Int -> Gen PaginatedCurrencySummaryList
genPaginatedCurrencySummaryList n =
  PaginatedCurrencySummaryList
    <$> arbitrary -- paginatedCurrencySummaryListCount :: Int
    <*> arbitraryReducedMaybe n -- paginatedCurrencySummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedCurrencySummaryListPrevious :: Maybe Text
    <*> arbitraryReduced n -- paginatedCurrencySummaryListResults :: [CurrencySummary]
  
instance Arbitrary PaginatedEggGroupSummaryList where
  arbitrary = sized genPaginatedEggGroupSummaryList

genPaginatedEggGroupSummaryList :: Int -> Gen PaginatedEggGroupSummaryList
genPaginatedEggGroupSummaryList n =
  PaginatedEggGroupSummaryList
    <$> arbitrary -- paginatedEggGroupSummaryListCount :: Int
    <*> arbitraryReducedMaybe n -- paginatedEggGroupSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedEggGroupSummaryListPrevious :: Maybe Text
    <*> arbitraryReduced n -- paginatedEggGroupSummaryListResults :: [EggGroupSummary]
  
instance Arbitrary PaginatedEncounterConditionSummaryList where
  arbitrary = sized genPaginatedEncounterConditionSummaryList

genPaginatedEncounterConditionSummaryList :: Int -> Gen PaginatedEncounterConditionSummaryList
genPaginatedEncounterConditionSummaryList n =
  PaginatedEncounterConditionSummaryList
    <$> arbitrary -- paginatedEncounterConditionSummaryListCount :: Int
    <*> arbitraryReducedMaybe n -- paginatedEncounterConditionSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedEncounterConditionSummaryListPrevious :: Maybe Text
    <*> arbitraryReduced n -- paginatedEncounterConditionSummaryListResults :: [EncounterConditionSummary]
  
instance Arbitrary PaginatedEncounterConditionValueSummaryList where
  arbitrary = sized genPaginatedEncounterConditionValueSummaryList

genPaginatedEncounterConditionValueSummaryList :: Int -> Gen PaginatedEncounterConditionValueSummaryList
genPaginatedEncounterConditionValueSummaryList n =
  PaginatedEncounterConditionValueSummaryList
    <$> arbitrary -- paginatedEncounterConditionValueSummaryListCount :: Int
    <*> arbitraryReducedMaybe n -- paginatedEncounterConditionValueSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedEncounterConditionValueSummaryListPrevious :: Maybe Text
    <*> arbitraryReduced n -- paginatedEncounterConditionValueSummaryListResults :: [EncounterConditionValueSummary]
  
instance Arbitrary PaginatedEncounterMethodSummaryList where
  arbitrary = sized genPaginatedEncounterMethodSummaryList

genPaginatedEncounterMethodSummaryList :: Int -> Gen PaginatedEncounterMethodSummaryList
genPaginatedEncounterMethodSummaryList n =
  PaginatedEncounterMethodSummaryList
    <$> arbitrary -- paginatedEncounterMethodSummaryListCount :: Int
    <*> arbitraryReducedMaybe n -- paginatedEncounterMethodSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedEncounterMethodSummaryListPrevious :: Maybe Text
    <*> arbitraryReduced n -- paginatedEncounterMethodSummaryListResults :: [EncounterMethodSummary]
  
instance Arbitrary PaginatedEvolutionChainSummaryList where
  arbitrary = sized genPaginatedEvolutionChainSummaryList

genPaginatedEvolutionChainSummaryList :: Int -> Gen PaginatedEvolutionChainSummaryList
genPaginatedEvolutionChainSummaryList n =
  PaginatedEvolutionChainSummaryList
    <$> arbitrary -- paginatedEvolutionChainSummaryListCount :: Int
    <*> arbitraryReducedMaybe n -- paginatedEvolutionChainSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedEvolutionChainSummaryListPrevious :: Maybe Text
    <*> arbitraryReduced n -- paginatedEvolutionChainSummaryListResults :: [EvolutionChainSummary]
  
instance Arbitrary PaginatedEvolutionTriggerSummaryList where
  arbitrary = sized genPaginatedEvolutionTriggerSummaryList

genPaginatedEvolutionTriggerSummaryList :: Int -> Gen PaginatedEvolutionTriggerSummaryList
genPaginatedEvolutionTriggerSummaryList n =
  PaginatedEvolutionTriggerSummaryList
    <$> arbitrary -- paginatedEvolutionTriggerSummaryListCount :: Int
    <*> arbitraryReducedMaybe n -- paginatedEvolutionTriggerSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedEvolutionTriggerSummaryListPrevious :: Maybe Text
    <*> arbitraryReduced n -- paginatedEvolutionTriggerSummaryListResults :: [EvolutionTriggerSummary]
  
instance Arbitrary PaginatedEvolutionVariableSummaryList where
  arbitrary = sized genPaginatedEvolutionVariableSummaryList

genPaginatedEvolutionVariableSummaryList :: Int -> Gen PaginatedEvolutionVariableSummaryList
genPaginatedEvolutionVariableSummaryList n =
  PaginatedEvolutionVariableSummaryList
    <$> arbitrary -- paginatedEvolutionVariableSummaryListCount :: Int
    <*> arbitraryReducedMaybe n -- paginatedEvolutionVariableSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedEvolutionVariableSummaryListPrevious :: Maybe Text
    <*> arbitraryReduced n -- paginatedEvolutionVariableSummaryListResults :: [EvolutionVariableSummary]
  
instance Arbitrary PaginatedGenderSummaryList where
  arbitrary = sized genPaginatedGenderSummaryList

genPaginatedGenderSummaryList :: Int -> Gen PaginatedGenderSummaryList
genPaginatedGenderSummaryList n =
  PaginatedGenderSummaryList
    <$> arbitrary -- paginatedGenderSummaryListCount :: Int
    <*> arbitraryReducedMaybe n -- paginatedGenderSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedGenderSummaryListPrevious :: Maybe Text
    <*> arbitraryReduced n -- paginatedGenderSummaryListResults :: [GenderSummary]
  
instance Arbitrary PaginatedGenerationSummaryList where
  arbitrary = sized genPaginatedGenerationSummaryList

genPaginatedGenerationSummaryList :: Int -> Gen PaginatedGenerationSummaryList
genPaginatedGenerationSummaryList n =
  PaginatedGenerationSummaryList
    <$> arbitrary -- paginatedGenerationSummaryListCount :: Int
    <*> arbitraryReducedMaybe n -- paginatedGenerationSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedGenerationSummaryListPrevious :: Maybe Text
    <*> arbitraryReduced n -- paginatedGenerationSummaryListResults :: [GenerationSummary]
  
instance Arbitrary PaginatedGrowthRateSummaryList where
  arbitrary = sized genPaginatedGrowthRateSummaryList

genPaginatedGrowthRateSummaryList :: Int -> Gen PaginatedGrowthRateSummaryList
genPaginatedGrowthRateSummaryList n =
  PaginatedGrowthRateSummaryList
    <$> arbitrary -- paginatedGrowthRateSummaryListCount :: Int
    <*> arbitraryReducedMaybe n -- paginatedGrowthRateSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedGrowthRateSummaryListPrevious :: Maybe Text
    <*> arbitraryReduced n -- paginatedGrowthRateSummaryListResults :: [GrowthRateSummary]
  
instance Arbitrary PaginatedItemAttributeSummaryList where
  arbitrary = sized genPaginatedItemAttributeSummaryList

genPaginatedItemAttributeSummaryList :: Int -> Gen PaginatedItemAttributeSummaryList
genPaginatedItemAttributeSummaryList n =
  PaginatedItemAttributeSummaryList
    <$> arbitrary -- paginatedItemAttributeSummaryListCount :: Int
    <*> arbitraryReducedMaybe n -- paginatedItemAttributeSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedItemAttributeSummaryListPrevious :: Maybe Text
    <*> arbitraryReduced n -- paginatedItemAttributeSummaryListResults :: [ItemAttributeSummary]
  
instance Arbitrary PaginatedItemCategorySummaryList where
  arbitrary = sized genPaginatedItemCategorySummaryList

genPaginatedItemCategorySummaryList :: Int -> Gen PaginatedItemCategorySummaryList
genPaginatedItemCategorySummaryList n =
  PaginatedItemCategorySummaryList
    <$> arbitrary -- paginatedItemCategorySummaryListCount :: Int
    <*> arbitraryReducedMaybe n -- paginatedItemCategorySummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedItemCategorySummaryListPrevious :: Maybe Text
    <*> arbitraryReduced n -- paginatedItemCategorySummaryListResults :: [ItemCategorySummary]
  
instance Arbitrary PaginatedItemFlingEffectSummaryList where
  arbitrary = sized genPaginatedItemFlingEffectSummaryList

genPaginatedItemFlingEffectSummaryList :: Int -> Gen PaginatedItemFlingEffectSummaryList
genPaginatedItemFlingEffectSummaryList n =
  PaginatedItemFlingEffectSummaryList
    <$> arbitrary -- paginatedItemFlingEffectSummaryListCount :: Int
    <*> arbitraryReducedMaybe n -- paginatedItemFlingEffectSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedItemFlingEffectSummaryListPrevious :: Maybe Text
    <*> arbitraryReduced n -- paginatedItemFlingEffectSummaryListResults :: [ItemFlingEffectSummary]
  
instance Arbitrary PaginatedItemPocketSummaryList where
  arbitrary = sized genPaginatedItemPocketSummaryList

genPaginatedItemPocketSummaryList :: Int -> Gen PaginatedItemPocketSummaryList
genPaginatedItemPocketSummaryList n =
  PaginatedItemPocketSummaryList
    <$> arbitrary -- paginatedItemPocketSummaryListCount :: Int
    <*> arbitraryReducedMaybe n -- paginatedItemPocketSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedItemPocketSummaryListPrevious :: Maybe Text
    <*> arbitraryReduced n -- paginatedItemPocketSummaryListResults :: [ItemPocketSummary]
  
instance Arbitrary PaginatedItemSummaryList where
  arbitrary = sized genPaginatedItemSummaryList

genPaginatedItemSummaryList :: Int -> Gen PaginatedItemSummaryList
genPaginatedItemSummaryList n =
  PaginatedItemSummaryList
    <$> arbitrary -- paginatedItemSummaryListCount :: Int
    <*> arbitraryReducedMaybe n -- paginatedItemSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedItemSummaryListPrevious :: Maybe Text
    <*> arbitraryReduced n -- paginatedItemSummaryListResults :: [ItemSummary]
  
instance Arbitrary PaginatedLanguageSummaryList where
  arbitrary = sized genPaginatedLanguageSummaryList

genPaginatedLanguageSummaryList :: Int -> Gen PaginatedLanguageSummaryList
genPaginatedLanguageSummaryList n =
  PaginatedLanguageSummaryList
    <$> arbitrary -- paginatedLanguageSummaryListCount :: Int
    <*> arbitraryReducedMaybe n -- paginatedLanguageSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedLanguageSummaryListPrevious :: Maybe Text
    <*> arbitraryReduced n -- paginatedLanguageSummaryListResults :: [LanguageSummary]
  
instance Arbitrary PaginatedLocationAreaSummaryList where
  arbitrary = sized genPaginatedLocationAreaSummaryList

genPaginatedLocationAreaSummaryList :: Int -> Gen PaginatedLocationAreaSummaryList
genPaginatedLocationAreaSummaryList n =
  PaginatedLocationAreaSummaryList
    <$> arbitrary -- paginatedLocationAreaSummaryListCount :: Int
    <*> arbitraryReducedMaybe n -- paginatedLocationAreaSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedLocationAreaSummaryListPrevious :: Maybe Text
    <*> arbitraryReduced n -- paginatedLocationAreaSummaryListResults :: [LocationAreaSummary]
  
instance Arbitrary PaginatedLocationSummaryList where
  arbitrary = sized genPaginatedLocationSummaryList

genPaginatedLocationSummaryList :: Int -> Gen PaginatedLocationSummaryList
genPaginatedLocationSummaryList n =
  PaginatedLocationSummaryList
    <$> arbitrary -- paginatedLocationSummaryListCount :: Int
    <*> arbitraryReducedMaybe n -- paginatedLocationSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedLocationSummaryListPrevious :: Maybe Text
    <*> arbitraryReduced n -- paginatedLocationSummaryListResults :: [LocationSummary]
  
instance Arbitrary PaginatedMachineSummaryList where
  arbitrary = sized genPaginatedMachineSummaryList

genPaginatedMachineSummaryList :: Int -> Gen PaginatedMachineSummaryList
genPaginatedMachineSummaryList n =
  PaginatedMachineSummaryList
    <$> arbitrary -- paginatedMachineSummaryListCount :: Int
    <*> arbitraryReducedMaybe n -- paginatedMachineSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedMachineSummaryListPrevious :: Maybe Text
    <*> arbitraryReduced n -- paginatedMachineSummaryListResults :: [MachineSummary]
  
instance Arbitrary PaginatedMoveBattleStyleSummaryList where
  arbitrary = sized genPaginatedMoveBattleStyleSummaryList

genPaginatedMoveBattleStyleSummaryList :: Int -> Gen PaginatedMoveBattleStyleSummaryList
genPaginatedMoveBattleStyleSummaryList n =
  PaginatedMoveBattleStyleSummaryList
    <$> arbitrary -- paginatedMoveBattleStyleSummaryListCount :: Int
    <*> arbitraryReducedMaybe n -- paginatedMoveBattleStyleSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedMoveBattleStyleSummaryListPrevious :: Maybe Text
    <*> arbitraryReduced n -- paginatedMoveBattleStyleSummaryListResults :: [MoveBattleStyleSummary]
  
instance Arbitrary PaginatedMoveDamageClassSummaryList where
  arbitrary = sized genPaginatedMoveDamageClassSummaryList

genPaginatedMoveDamageClassSummaryList :: Int -> Gen PaginatedMoveDamageClassSummaryList
genPaginatedMoveDamageClassSummaryList n =
  PaginatedMoveDamageClassSummaryList
    <$> arbitrary -- paginatedMoveDamageClassSummaryListCount :: Int
    <*> arbitraryReducedMaybe n -- paginatedMoveDamageClassSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedMoveDamageClassSummaryListPrevious :: Maybe Text
    <*> arbitraryReduced n -- paginatedMoveDamageClassSummaryListResults :: [MoveDamageClassSummary]
  
instance Arbitrary PaginatedMoveLearnMethodSummaryList where
  arbitrary = sized genPaginatedMoveLearnMethodSummaryList

genPaginatedMoveLearnMethodSummaryList :: Int -> Gen PaginatedMoveLearnMethodSummaryList
genPaginatedMoveLearnMethodSummaryList n =
  PaginatedMoveLearnMethodSummaryList
    <$> arbitrary -- paginatedMoveLearnMethodSummaryListCount :: Int
    <*> arbitraryReducedMaybe n -- paginatedMoveLearnMethodSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedMoveLearnMethodSummaryListPrevious :: Maybe Text
    <*> arbitraryReduced n -- paginatedMoveLearnMethodSummaryListResults :: [MoveLearnMethodSummary]
  
instance Arbitrary PaginatedMoveMetaAilmentSummaryList where
  arbitrary = sized genPaginatedMoveMetaAilmentSummaryList

genPaginatedMoveMetaAilmentSummaryList :: Int -> Gen PaginatedMoveMetaAilmentSummaryList
genPaginatedMoveMetaAilmentSummaryList n =
  PaginatedMoveMetaAilmentSummaryList
    <$> arbitrary -- paginatedMoveMetaAilmentSummaryListCount :: Int
    <*> arbitraryReducedMaybe n -- paginatedMoveMetaAilmentSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedMoveMetaAilmentSummaryListPrevious :: Maybe Text
    <*> arbitraryReduced n -- paginatedMoveMetaAilmentSummaryListResults :: [MoveMetaAilmentSummary]
  
instance Arbitrary PaginatedMoveMetaCategorySummaryList where
  arbitrary = sized genPaginatedMoveMetaCategorySummaryList

genPaginatedMoveMetaCategorySummaryList :: Int -> Gen PaginatedMoveMetaCategorySummaryList
genPaginatedMoveMetaCategorySummaryList n =
  PaginatedMoveMetaCategorySummaryList
    <$> arbitrary -- paginatedMoveMetaCategorySummaryListCount :: Int
    <*> arbitraryReducedMaybe n -- paginatedMoveMetaCategorySummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedMoveMetaCategorySummaryListPrevious :: Maybe Text
    <*> arbitraryReduced n -- paginatedMoveMetaCategorySummaryListResults :: [MoveMetaCategorySummary]
  
instance Arbitrary PaginatedMoveSummaryList where
  arbitrary = sized genPaginatedMoveSummaryList

genPaginatedMoveSummaryList :: Int -> Gen PaginatedMoveSummaryList
genPaginatedMoveSummaryList n =
  PaginatedMoveSummaryList
    <$> arbitrary -- paginatedMoveSummaryListCount :: Int
    <*> arbitraryReducedMaybe n -- paginatedMoveSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedMoveSummaryListPrevious :: Maybe Text
    <*> arbitraryReduced n -- paginatedMoveSummaryListResults :: [MoveSummary]
  
instance Arbitrary PaginatedMoveTargetSummaryList where
  arbitrary = sized genPaginatedMoveTargetSummaryList

genPaginatedMoveTargetSummaryList :: Int -> Gen PaginatedMoveTargetSummaryList
genPaginatedMoveTargetSummaryList n =
  PaginatedMoveTargetSummaryList
    <$> arbitrary -- paginatedMoveTargetSummaryListCount :: Int
    <*> arbitraryReducedMaybe n -- paginatedMoveTargetSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedMoveTargetSummaryListPrevious :: Maybe Text
    <*> arbitraryReduced n -- paginatedMoveTargetSummaryListResults :: [MoveTargetSummary]
  
instance Arbitrary PaginatedNatureSummaryList where
  arbitrary = sized genPaginatedNatureSummaryList

genPaginatedNatureSummaryList :: Int -> Gen PaginatedNatureSummaryList
genPaginatedNatureSummaryList n =
  PaginatedNatureSummaryList
    <$> arbitrary -- paginatedNatureSummaryListCount :: Int
    <*> arbitraryReducedMaybe n -- paginatedNatureSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedNatureSummaryListPrevious :: Maybe Text
    <*> arbitraryReduced n -- paginatedNatureSummaryListResults :: [NatureSummary]
  
instance Arbitrary PaginatedPalParkAreaSummaryList where
  arbitrary = sized genPaginatedPalParkAreaSummaryList

genPaginatedPalParkAreaSummaryList :: Int -> Gen PaginatedPalParkAreaSummaryList
genPaginatedPalParkAreaSummaryList n =
  PaginatedPalParkAreaSummaryList
    <$> arbitrary -- paginatedPalParkAreaSummaryListCount :: Int
    <*> arbitraryReducedMaybe n -- paginatedPalParkAreaSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedPalParkAreaSummaryListPrevious :: Maybe Text
    <*> arbitraryReduced n -- paginatedPalParkAreaSummaryListResults :: [PalParkAreaSummary]
  
instance Arbitrary PaginatedPokeathlonStatSummaryList where
  arbitrary = sized genPaginatedPokeathlonStatSummaryList

genPaginatedPokeathlonStatSummaryList :: Int -> Gen PaginatedPokeathlonStatSummaryList
genPaginatedPokeathlonStatSummaryList n =
  PaginatedPokeathlonStatSummaryList
    <$> arbitrary -- paginatedPokeathlonStatSummaryListCount :: Int
    <*> arbitraryReducedMaybe n -- paginatedPokeathlonStatSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedPokeathlonStatSummaryListPrevious :: Maybe Text
    <*> arbitraryReduced n -- paginatedPokeathlonStatSummaryListResults :: [PokeathlonStatSummary]
  
instance Arbitrary PaginatedPokedexSummaryList where
  arbitrary = sized genPaginatedPokedexSummaryList

genPaginatedPokedexSummaryList :: Int -> Gen PaginatedPokedexSummaryList
genPaginatedPokedexSummaryList n =
  PaginatedPokedexSummaryList
    <$> arbitrary -- paginatedPokedexSummaryListCount :: Int
    <*> arbitraryReducedMaybe n -- paginatedPokedexSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedPokedexSummaryListPrevious :: Maybe Text
    <*> arbitraryReduced n -- paginatedPokedexSummaryListResults :: [PokedexSummary]
  
instance Arbitrary PaginatedPokemonColorSummaryList where
  arbitrary = sized genPaginatedPokemonColorSummaryList

genPaginatedPokemonColorSummaryList :: Int -> Gen PaginatedPokemonColorSummaryList
genPaginatedPokemonColorSummaryList n =
  PaginatedPokemonColorSummaryList
    <$> arbitrary -- paginatedPokemonColorSummaryListCount :: Int
    <*> arbitraryReducedMaybe n -- paginatedPokemonColorSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedPokemonColorSummaryListPrevious :: Maybe Text
    <*> arbitraryReduced n -- paginatedPokemonColorSummaryListResults :: [PokemonColorSummary]
  
instance Arbitrary PaginatedPokemonFormSummaryList where
  arbitrary = sized genPaginatedPokemonFormSummaryList

genPaginatedPokemonFormSummaryList :: Int -> Gen PaginatedPokemonFormSummaryList
genPaginatedPokemonFormSummaryList n =
  PaginatedPokemonFormSummaryList
    <$> arbitrary -- paginatedPokemonFormSummaryListCount :: Int
    <*> arbitraryReducedMaybe n -- paginatedPokemonFormSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedPokemonFormSummaryListPrevious :: Maybe Text
    <*> arbitraryReduced n -- paginatedPokemonFormSummaryListResults :: [PokemonFormSummary]
  
instance Arbitrary PaginatedPokemonHabitatSummaryList where
  arbitrary = sized genPaginatedPokemonHabitatSummaryList

genPaginatedPokemonHabitatSummaryList :: Int -> Gen PaginatedPokemonHabitatSummaryList
genPaginatedPokemonHabitatSummaryList n =
  PaginatedPokemonHabitatSummaryList
    <$> arbitrary -- paginatedPokemonHabitatSummaryListCount :: Int
    <*> arbitraryReducedMaybe n -- paginatedPokemonHabitatSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedPokemonHabitatSummaryListPrevious :: Maybe Text
    <*> arbitraryReduced n -- paginatedPokemonHabitatSummaryListResults :: [PokemonHabitatSummary]
  
instance Arbitrary PaginatedPokemonShapeSummaryList where
  arbitrary = sized genPaginatedPokemonShapeSummaryList

genPaginatedPokemonShapeSummaryList :: Int -> Gen PaginatedPokemonShapeSummaryList
genPaginatedPokemonShapeSummaryList n =
  PaginatedPokemonShapeSummaryList
    <$> arbitrary -- paginatedPokemonShapeSummaryListCount :: Int
    <*> arbitraryReducedMaybe n -- paginatedPokemonShapeSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedPokemonShapeSummaryListPrevious :: Maybe Text
    <*> arbitraryReduced n -- paginatedPokemonShapeSummaryListResults :: [PokemonShapeSummary]
  
instance Arbitrary PaginatedPokemonSpeciesSummaryList where
  arbitrary = sized genPaginatedPokemonSpeciesSummaryList

genPaginatedPokemonSpeciesSummaryList :: Int -> Gen PaginatedPokemonSpeciesSummaryList
genPaginatedPokemonSpeciesSummaryList n =
  PaginatedPokemonSpeciesSummaryList
    <$> arbitrary -- paginatedPokemonSpeciesSummaryListCount :: Int
    <*> arbitraryReducedMaybe n -- paginatedPokemonSpeciesSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedPokemonSpeciesSummaryListPrevious :: Maybe Text
    <*> arbitraryReduced n -- paginatedPokemonSpeciesSummaryListResults :: [PokemonSpeciesSummary]
  
instance Arbitrary PaginatedPokemonSummaryList where
  arbitrary = sized genPaginatedPokemonSummaryList

genPaginatedPokemonSummaryList :: Int -> Gen PaginatedPokemonSummaryList
genPaginatedPokemonSummaryList n =
  PaginatedPokemonSummaryList
    <$> arbitrary -- paginatedPokemonSummaryListCount :: Int
    <*> arbitraryReducedMaybe n -- paginatedPokemonSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedPokemonSummaryListPrevious :: Maybe Text
    <*> arbitraryReduced n -- paginatedPokemonSummaryListResults :: [PokemonSummary]
  
instance Arbitrary PaginatedRegionSummaryList where
  arbitrary = sized genPaginatedRegionSummaryList

genPaginatedRegionSummaryList :: Int -> Gen PaginatedRegionSummaryList
genPaginatedRegionSummaryList n =
  PaginatedRegionSummaryList
    <$> arbitrary -- paginatedRegionSummaryListCount :: Int
    <*> arbitraryReducedMaybe n -- paginatedRegionSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedRegionSummaryListPrevious :: Maybe Text
    <*> arbitraryReduced n -- paginatedRegionSummaryListResults :: [RegionSummary]
  
instance Arbitrary PaginatedStatSummaryList where
  arbitrary = sized genPaginatedStatSummaryList

genPaginatedStatSummaryList :: Int -> Gen PaginatedStatSummaryList
genPaginatedStatSummaryList n =
  PaginatedStatSummaryList
    <$> arbitrary -- paginatedStatSummaryListCount :: Int
    <*> arbitraryReducedMaybe n -- paginatedStatSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedStatSummaryListPrevious :: Maybe Text
    <*> arbitraryReduced n -- paginatedStatSummaryListResults :: [StatSummary]
  
instance Arbitrary PaginatedSuperContestEffectSummaryList where
  arbitrary = sized genPaginatedSuperContestEffectSummaryList

genPaginatedSuperContestEffectSummaryList :: Int -> Gen PaginatedSuperContestEffectSummaryList
genPaginatedSuperContestEffectSummaryList n =
  PaginatedSuperContestEffectSummaryList
    <$> arbitrary -- paginatedSuperContestEffectSummaryListCount :: Int
    <*> arbitraryReducedMaybe n -- paginatedSuperContestEffectSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedSuperContestEffectSummaryListPrevious :: Maybe Text
    <*> arbitraryReduced n -- paginatedSuperContestEffectSummaryListResults :: [SuperContestEffectSummary]
  
instance Arbitrary PaginatedTypeSummaryList where
  arbitrary = sized genPaginatedTypeSummaryList

genPaginatedTypeSummaryList :: Int -> Gen PaginatedTypeSummaryList
genPaginatedTypeSummaryList n =
  PaginatedTypeSummaryList
    <$> arbitrary -- paginatedTypeSummaryListCount :: Int
    <*> arbitraryReducedMaybe n -- paginatedTypeSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedTypeSummaryListPrevious :: Maybe Text
    <*> arbitraryReduced n -- paginatedTypeSummaryListResults :: [TypeSummary]
  
instance Arbitrary PaginatedVersionGroupSummaryList where
  arbitrary = sized genPaginatedVersionGroupSummaryList

genPaginatedVersionGroupSummaryList :: Int -> Gen PaginatedVersionGroupSummaryList
genPaginatedVersionGroupSummaryList n =
  PaginatedVersionGroupSummaryList
    <$> arbitrary -- paginatedVersionGroupSummaryListCount :: Int
    <*> arbitraryReducedMaybe n -- paginatedVersionGroupSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedVersionGroupSummaryListPrevious :: Maybe Text
    <*> arbitraryReduced n -- paginatedVersionGroupSummaryListResults :: [VersionGroupSummary]
  
instance Arbitrary PaginatedVersionSummaryList where
  arbitrary = sized genPaginatedVersionSummaryList

genPaginatedVersionSummaryList :: Int -> Gen PaginatedVersionSummaryList
genPaginatedVersionSummaryList n =
  PaginatedVersionSummaryList
    <$> arbitrary -- paginatedVersionSummaryListCount :: Int
    <*> arbitraryReducedMaybe n -- paginatedVersionSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedVersionSummaryListPrevious :: Maybe Text
    <*> arbitraryReduced n -- paginatedVersionSummaryListResults :: [VersionSummary]
  
instance Arbitrary PalParkAreaDetail where
  arbitrary = sized genPalParkAreaDetail

genPalParkAreaDetail :: Int -> Gen PalParkAreaDetail
genPalParkAreaDetail n =
  PalParkAreaDetail
    <$> arbitrary -- palParkAreaDetailId :: Int
    <*> arbitrary -- palParkAreaDetailName :: Text
    <*> arbitraryReduced n -- palParkAreaDetailNames :: [PalParkAreaName]
    <*> arbitraryReduced n -- palParkAreaDetailPokemonEncounters :: [PalParkEncounter]
  
instance Arbitrary PalParkAreaName where
  arbitrary = sized genPalParkAreaName

genPalParkAreaName :: Int -> Gen PalParkAreaName
genPalParkAreaName n =
  PalParkAreaName
    <$> arbitrary -- palParkAreaNameName :: Text
    <*> arbitraryReduced n -- palParkAreaNameLanguage :: LanguageSummary
  
instance Arbitrary PalParkAreaSummary where
  arbitrary = sized genPalParkAreaSummary

genPalParkAreaSummary :: Int -> Gen PalParkAreaSummary
genPalParkAreaSummary n =
  PalParkAreaSummary
    <$> arbitrary -- palParkAreaSummaryName :: Text
    <*> arbitrary -- palParkAreaSummaryUrl :: Text
  
instance Arbitrary PalParkEncounter where
  arbitrary = sized genPalParkEncounter

genPalParkEncounter :: Int -> Gen PalParkEncounter
genPalParkEncounter n =
  PalParkEncounter
    <$> arbitraryReducedMaybe n -- palParkEncounterBaseScore :: Maybe Int
    <*> arbitrary -- palParkEncounterRate :: Int
    <*> arbitraryReduced n -- palParkEncounterPokemonSpecies :: PokemonSpeciesSummary
  
instance Arbitrary PokeapiMetaResponse where
  arbitrary = sized genPokeapiMetaResponse

genPokeapiMetaResponse :: Int -> Gen PokeapiMetaResponse
genPokeapiMetaResponse n =
  PokeapiMetaResponse
    <$> arbitrary -- pokeapiMetaResponseDeployDate :: Text
    <*> arbitrary -- pokeapiMetaResponseHash :: Text
    <*> arbitrary -- pokeapiMetaResponseTag :: Text
  
instance Arbitrary PokeathlonStatAffectingNature where
  arbitrary = sized genPokeathlonStatAffectingNature

genPokeathlonStatAffectingNature :: Int -> Gen PokeathlonStatAffectingNature
genPokeathlonStatAffectingNature n =
  PokeathlonStatAffectingNature
    <$> arbitrary -- pokeathlonStatAffectingNatureMaxChange :: Int
    <*> arbitraryReduced n -- pokeathlonStatAffectingNatureNature :: NatureSummary
  
instance Arbitrary PokeathlonStatAffectingNatures where
  arbitrary = sized genPokeathlonStatAffectingNatures

genPokeathlonStatAffectingNatures :: Int -> Gen PokeathlonStatAffectingNatures
genPokeathlonStatAffectingNatures n =
  PokeathlonStatAffectingNatures
    <$> arbitraryReduced n -- pokeathlonStatAffectingNaturesIncrease :: [PokeathlonStatAffectingNature]
    <*> arbitraryReduced n -- pokeathlonStatAffectingNaturesDecrease :: [PokeathlonStatAffectingNature]
  
instance Arbitrary PokeathlonStatDetail where
  arbitrary = sized genPokeathlonStatDetail

genPokeathlonStatDetail :: Int -> Gen PokeathlonStatDetail
genPokeathlonStatDetail n =
  PokeathlonStatDetail
    <$> arbitrary -- pokeathlonStatDetailId :: Int
    <*> arbitrary -- pokeathlonStatDetailName :: Text
    <*> arbitraryReduced n -- pokeathlonStatDetailAffectingNatures :: PokeathlonStatAffectingNatures
    <*> arbitraryReduced n -- pokeathlonStatDetailNames :: [PokeathlonStatName]
  
instance Arbitrary PokeathlonStatName where
  arbitrary = sized genPokeathlonStatName

genPokeathlonStatName :: Int -> Gen PokeathlonStatName
genPokeathlonStatName n =
  PokeathlonStatName
    <$> arbitrary -- pokeathlonStatNameName :: Text
    <*> arbitraryReduced n -- pokeathlonStatNameLanguage :: LanguageSummary
  
instance Arbitrary PokeathlonStatSummary where
  arbitrary = sized genPokeathlonStatSummary

genPokeathlonStatSummary :: Int -> Gen PokeathlonStatSummary
genPokeathlonStatSummary n =
  PokeathlonStatSummary
    <$> arbitrary -- pokeathlonStatSummaryName :: Text
    <*> arbitrary -- pokeathlonStatSummaryUrl :: Text
  
instance Arbitrary PokedexDescription where
  arbitrary = sized genPokedexDescription

genPokedexDescription :: Int -> Gen PokedexDescription
genPokedexDescription n =
  PokedexDescription
    <$> arbitraryReducedMaybe n -- pokedexDescriptionDescription :: Maybe Text
    <*> arbitraryReduced n -- pokedexDescriptionLanguage :: LanguageSummary
  
instance Arbitrary PokedexDetail where
  arbitrary = sized genPokedexDetail

genPokedexDetail :: Int -> Gen PokedexDetail
genPokedexDetail n =
  PokedexDetail
    <$> arbitrary -- pokedexDetailId :: Int
    <*> arbitrary -- pokedexDetailName :: Text
    <*> arbitraryReducedMaybe n -- pokedexDetailIsMainSeries :: Maybe Bool
    <*> arbitraryReduced n -- pokedexDetailDescriptions :: [PokedexDescription]
    <*> arbitraryReduced n -- pokedexDetailNames :: [PokedexName]
    <*> arbitraryReduced n -- pokedexDetailPokemonEntries :: [PokemonDexNumber]
    <*> arbitraryReduced n -- pokedexDetailRegion :: RegionSummary
    <*> arbitraryReduced n -- pokedexDetailVersionGroups :: [VersionGroupSummary]
  
instance Arbitrary PokedexName where
  arbitrary = sized genPokedexName

genPokedexName :: Int -> Gen PokedexName
genPokedexName n =
  PokedexName
    <$> arbitrary -- pokedexNameName :: Text
    <*> arbitraryReduced n -- pokedexNameLanguage :: LanguageSummary
  
instance Arbitrary PokedexSummary where
  arbitrary = sized genPokedexSummary

genPokedexSummary :: Int -> Gen PokedexSummary
genPokedexSummary n =
  PokedexSummary
    <$> arbitrary -- pokedexSummaryName :: Text
    <*> arbitrary -- pokedexSummaryUrl :: Text
  
instance Arbitrary PokemonAbility where
  arbitrary = sized genPokemonAbility

genPokemonAbility :: Int -> Gen PokemonAbility
genPokemonAbility n =
  PokemonAbility
    <$> arbitraryReducedMaybe n -- pokemonAbilityIsHidden :: Maybe Bool
    <*> arbitrary -- pokemonAbilitySlot :: Int
    <*> arbitraryReduced n -- pokemonAbilityAbility :: AbilitySummary
  
instance Arbitrary PokemonAbilityPast where
  arbitrary = sized genPokemonAbilityPast

genPokemonAbilityPast :: Int -> Gen PokemonAbilityPast
genPokemonAbilityPast n =
  PokemonAbilityPast
    <$> arbitraryReducedMaybe n -- pokemonAbilityPastIsHidden :: Maybe Bool
    <*> arbitrary -- pokemonAbilityPastSlot :: Int
    <*> arbitraryReduced n -- pokemonAbilityPastAbility :: AbilitySummary
  
instance Arbitrary PokemonColorDetail where
  arbitrary = sized genPokemonColorDetail

genPokemonColorDetail :: Int -> Gen PokemonColorDetail
genPokemonColorDetail n =
  PokemonColorDetail
    <$> arbitrary -- pokemonColorDetailId :: Int
    <*> arbitrary -- pokemonColorDetailName :: Text
    <*> arbitraryReduced n -- pokemonColorDetailNames :: [PokemonColorName]
    <*> arbitraryReduced n -- pokemonColorDetailPokemonSpecies :: [PokemonSpeciesSummary]
  
instance Arbitrary PokemonColorName where
  arbitrary = sized genPokemonColorName

genPokemonColorName :: Int -> Gen PokemonColorName
genPokemonColorName n =
  PokemonColorName
    <$> arbitrary -- pokemonColorNameName :: Text
    <*> arbitraryReduced n -- pokemonColorNameLanguage :: LanguageSummary
  
instance Arbitrary PokemonColorSummary where
  arbitrary = sized genPokemonColorSummary

genPokemonColorSummary :: Int -> Gen PokemonColorSummary
genPokemonColorSummary n =
  PokemonColorSummary
    <$> arbitrary -- pokemonColorSummaryName :: Text
    <*> arbitrary -- pokemonColorSummaryUrl :: Text
  
instance Arbitrary PokemonCries where
  arbitrary = sized genPokemonCries

genPokemonCries :: Int -> Gen PokemonCries
genPokemonCries n =
  PokemonCries
    <$> arbitrary -- pokemonCriesLatest :: Text
    <*> arbitrary -- pokemonCriesLegacy :: Text
  
instance Arbitrary PokemonDetail where
  arbitrary = sized genPokemonDetail

genPokemonDetail :: Int -> Gen PokemonDetail
genPokemonDetail n =
  PokemonDetail
    <$> arbitrary -- pokemonDetailId :: Int
    <*> arbitrary -- pokemonDetailName :: Text
    <*> arbitraryReducedMaybe n -- pokemonDetailBaseExperience :: Maybe Int
    <*> arbitraryReducedMaybe n -- pokemonDetailHeight :: Maybe Int
    <*> arbitraryReducedMaybe n -- pokemonDetailIsDefault :: Maybe Bool
    <*> arbitraryReducedMaybe n -- pokemonDetailOrder :: Maybe Int
    <*> arbitraryReducedMaybe n -- pokemonDetailWeight :: Maybe Int
    <*> arbitraryReduced n -- pokemonDetailAbilities :: [PokemonAbility]
    <*> arbitraryReduced n -- pokemonDetailPastAbilities :: [PokemonPastAbility]
    <*> arbitraryReduced n -- pokemonDetailForms :: [PokemonFormSummary]
    <*> arbitraryReduced n -- pokemonDetailGameIndices :: [PokemonGameIndex]
    <*> arbitraryReduced n -- pokemonDetailHeldItems :: [PokemonHeldItemSummary]
    <*> arbitrary -- pokemonDetailLocationAreaEncounters :: Text
    <*> arbitraryReduced n -- pokemonDetailMoves :: [PokemonMove]
    <*> arbitraryReduced n -- pokemonDetailSpecies :: PokemonSpeciesSummary
    <*> arbitraryReduced n -- pokemonDetailSprites :: PokemonSprites
    <*> arbitraryReduced n -- pokemonDetailCries :: PokemonCries
    <*> arbitraryReduced n -- pokemonDetailStats :: [PokemonStat]
    <*> arbitraryReduced n -- pokemonDetailPastStats :: [PokemonPastStat]
    <*> arbitraryReduced n -- pokemonDetailTypes :: [PokemonType]
    <*> arbitraryReduced n -- pokemonDetailPastTypes :: [PokemonPastType]
  
instance Arbitrary PokemonDexEntry where
  arbitrary = sized genPokemonDexEntry

genPokemonDexEntry :: Int -> Gen PokemonDexEntry
genPokemonDexEntry n =
  PokemonDexEntry
    <$> arbitrary -- pokemonDexEntryEntryNumber :: Int
    <*> arbitraryReduced n -- pokemonDexEntryPokedex :: PokedexSummary
  
instance Arbitrary PokemonDexNumber where
  arbitrary = sized genPokemonDexNumber

genPokemonDexNumber :: Int -> Gen PokemonDexNumber
genPokemonDexNumber n =
  PokemonDexNumber
    <$> arbitrary -- pokemonDexNumberEntryNumber :: Int
    <*> arbitraryReduced n -- pokemonDexNumberPokemonSpecies :: PokemonSpeciesSummary
  
instance Arbitrary PokemonEncounterDetailResponse where
  arbitrary = sized genPokemonEncounterDetailResponse

genPokemonEncounterDetailResponse :: Int -> Gen PokemonEncounterDetailResponse
genPokemonEncounterDetailResponse n =
  PokemonEncounterDetailResponse
    <$> arbitrary -- pokemonEncounterDetailResponseChance :: Int
    <*> arbitraryReduced n -- pokemonEncounterDetailResponseConditionValues :: [EncounterConditionValueSummary]
    <*> arbitrary -- pokemonEncounterDetailResponseMaxLevel :: Int
    <*> arbitraryReduced n -- pokemonEncounterDetailResponseMethod :: EncounterMethodSummary
    <*> arbitrary -- pokemonEncounterDetailResponseMinLevel :: Int
  
instance Arbitrary PokemonEncounterResponse where
  arbitrary = sized genPokemonEncounterResponse

genPokemonEncounterResponse :: Int -> Gen PokemonEncounterResponse
genPokemonEncounterResponse n =
  PokemonEncounterResponse
    <$> arbitraryReduced n -- pokemonEncounterResponseLocationArea :: LocationAreaSummary
    <*> arbitraryReduced n -- pokemonEncounterResponseVersionDetails :: [PokemonEncounterVersionDetailResponse]
  
instance Arbitrary PokemonEncounterVersionDetailResponse where
  arbitrary = sized genPokemonEncounterVersionDetailResponse

genPokemonEncounterVersionDetailResponse :: Int -> Gen PokemonEncounterVersionDetailResponse
genPokemonEncounterVersionDetailResponse n =
  PokemonEncounterVersionDetailResponse
    <$> arbitraryReduced n -- pokemonEncounterVersionDetailResponseVersion :: VersionSummary
    <*> arbitrary -- pokemonEncounterVersionDetailResponseMaxChance :: Int
    <*> arbitraryReduced n -- pokemonEncounterVersionDetailResponseEncounterDetails :: [PokemonEncounterDetailResponse]
  
instance Arbitrary PokemonEvolution where
  arbitrary = sized genPokemonEvolution

genPokemonEvolution :: Int -> Gen PokemonEvolution
genPokemonEvolution n =
  PokemonEvolution
    <$> arbitraryReduced n -- pokemonEvolutionVersionGroup :: VersionGroupSummary
    <*> arbitraryReducedMaybe n -- pokemonEvolutionIsDefault :: Maybe Bool
    <*> arbitraryReduced n -- pokemonEvolutionItem :: ItemSummary
    <*> arbitraryReduced n -- pokemonEvolutionTrigger :: EvolutionTriggerSummary
    <*> arbitraryReducedMaybe n -- pokemonEvolutionGender :: Maybe Int
    <*> arbitraryReduced n -- pokemonEvolutionHeldItem :: ItemSummary
    <*> arbitraryReduced n -- pokemonEvolutionKnownMove :: PokemonEvolutionKnownMove
    <*> arbitraryReduced n -- pokemonEvolutionKnownMoveType :: PokemonEvolutionKnownMove
    <*> arbitraryReduced n -- pokemonEvolutionLocation :: LocationSummary
    <*> arbitraryReducedMaybe n -- pokemonEvolutionMinLevel :: Maybe Int
    <*> arbitraryReducedMaybe n -- pokemonEvolutionMinHappiness :: Maybe Int
    <*> arbitraryReducedMaybe n -- pokemonEvolutionMinBeauty :: Maybe Int
    <*> arbitraryReducedMaybe n -- pokemonEvolutionMinAffection :: Maybe Int
    <*> arbitraryReducedMaybe n -- pokemonEvolutionNearSpecialRock :: Maybe Bool
    <*> arbitraryReducedMaybe n -- pokemonEvolutionNeedsMultiplayer :: Maybe Bool
    <*> arbitraryReducedMaybe n -- pokemonEvolutionNeedsOverworldRain :: Maybe Bool
    <*> arbitraryReduced n -- pokemonEvolutionPartySpecies :: PokemonSpeciesSummary
    <*> arbitraryReduced n -- pokemonEvolutionPartyType :: TypeSummary
    <*> arbitraryReducedMaybe n -- pokemonEvolutionRelativePhysicalStats :: Maybe Int
    <*> arbitraryReducedMaybe n -- pokemonEvolutionTimeOfDay :: Maybe Text
    <*> arbitraryReduced n -- pokemonEvolutionTradeSpecies :: PokemonSpeciesSummary
    <*> arbitraryReducedMaybe n -- pokemonEvolutionTurnUpsideDown :: Maybe Bool
    <*> arbitraryReduced n -- pokemonEvolutionRegion :: RegionSummary
    <*> arbitraryReduced n -- pokemonEvolutionRequiredPokemonForm :: PokemonFormSummary
    <*> arbitraryReduced n -- pokemonEvolutionEvolvedPokemonForm :: PokemonFormSummary
    <*> arbitraryReduced n -- pokemonEvolutionUsedMove :: MoveSummary
    <*> arbitraryReducedMaybe n -- pokemonEvolutionMinMoveCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- pokemonEvolutionMinSteps :: Maybe Int
    <*> arbitraryReducedMaybe n -- pokemonEvolutionMinDamageTaken :: Maybe Int
    <*> arbitraryReduced n -- pokemonEvolutionAllowedNatures :: [NatureSummary]
    <*> arbitraryReduced n -- pokemonEvolutionConditionExpression :: EvolutionConditionExpression
  
instance Arbitrary PokemonEvolutionKnownMove where
  arbitrary = sized genPokemonEvolutionKnownMove

genPokemonEvolutionKnownMove :: Int -> Gen PokemonEvolutionKnownMove
genPokemonEvolutionKnownMove n =
  PokemonEvolutionKnownMove
    <$> arbitrary -- pokemonEvolutionKnownMoveName :: Text
    <*> arbitrary -- pokemonEvolutionKnownMoveUrl :: Text
  
instance Arbitrary PokemonFormDetail where
  arbitrary = sized genPokemonFormDetail

genPokemonFormDetail :: Int -> Gen PokemonFormDetail
genPokemonFormDetail n =
  PokemonFormDetail
    <$> arbitrary -- pokemonFormDetailId :: Int
    <*> arbitrary -- pokemonFormDetailName :: Text
    <*> arbitraryReducedMaybe n -- pokemonFormDetailOrder :: Maybe Int
    <*> arbitraryReducedMaybe n -- pokemonFormDetailFormOrder :: Maybe Int
    <*> arbitraryReducedMaybe n -- pokemonFormDetailIsDefault :: Maybe Bool
    <*> arbitraryReducedMaybe n -- pokemonFormDetailIsBattleOnly :: Maybe Bool
    <*> arbitraryReducedMaybe n -- pokemonFormDetailIsMega :: Maybe Bool
    <*> arbitrary -- pokemonFormDetailFormName :: Text
    <*> arbitraryReduced n -- pokemonFormDetailPokemon :: PokemonSummary
    <*> arbitraryReduced n -- pokemonFormDetailSprites :: PokemonFormSprites
    <*> arbitraryReduced n -- pokemonFormDetailVersionGroup :: VersionGroupSummary
    <*> arbitraryReduced n -- pokemonFormDetailFormNames :: [PokemonFormName]
    <*> arbitraryReduced n -- pokemonFormDetailNames :: [PokemonFormName]
    <*> arbitraryReduced n -- pokemonFormDetailTypes :: [PokemonFormType]
    <*> arbitraryReduced n -- pokemonFormDetailTriggerConditions :: [PokemonFormTriggerCondition]
    <*> arbitraryReduced n -- pokemonFormDetailFlavorTextEntries :: [PokemonFormFlavorText]
  
instance Arbitrary PokemonFormFlavorText where
  arbitrary = sized genPokemonFormFlavorText

genPokemonFormFlavorText :: Int -> Gen PokemonFormFlavorText
genPokemonFormFlavorText n =
  PokemonFormFlavorText
    <$> arbitrary -- pokemonFormFlavorTextFlavorText :: Text
    <*> arbitraryReduced n -- pokemonFormFlavorTextLanguage :: LanguageSummary
    <*> arbitraryReduced n -- pokemonFormFlavorTextVersion :: VersionSummary
  
instance Arbitrary PokemonFormName where
  arbitrary = sized genPokemonFormName

genPokemonFormName :: Int -> Gen PokemonFormName
genPokemonFormName n =
  PokemonFormName
    <$> arbitrary -- pokemonFormNameName :: Text
    <*> arbitraryReduced n -- pokemonFormNameLanguage :: LanguageSummary
  
instance Arbitrary PokemonFormSprites where
  arbitrary = sized genPokemonFormSprites

genPokemonFormSprites :: Int -> Gen PokemonFormSprites
genPokemonFormSprites n =
  PokemonFormSprites
    <$> arbitrary -- pokemonFormSpritesFrontDefault :: Text
    <*> arbitrary -- pokemonFormSpritesFrontShiny :: Text
    <*> arbitrary -- pokemonFormSpritesFrontFemale :: Text
    <*> arbitrary -- pokemonFormSpritesFrontShinyFemale :: Text
    <*> arbitrary -- pokemonFormSpritesBackDefault :: Text
    <*> arbitrary -- pokemonFormSpritesBackShiny :: Text
    <*> arbitrary -- pokemonFormSpritesBackFemale :: Text
    <*> arbitrary -- pokemonFormSpritesBackShinyFemale :: Text
    <*> arbitraryReducedMaybe n -- pokemonFormSpritesOther :: Maybe PokemonSpritesOther
    <*> arbitraryReducedMaybe n -- pokemonFormSpritesVersions :: Maybe (Map.Map String (Map.Map String AnyType))
  
instance Arbitrary PokemonFormSummary where
  arbitrary = sized genPokemonFormSummary

genPokemonFormSummary :: Int -> Gen PokemonFormSummary
genPokemonFormSummary n =
  PokemonFormSummary
    <$> arbitrary -- pokemonFormSummaryName :: Text
    <*> arbitrary -- pokemonFormSummaryUrl :: Text
  
instance Arbitrary PokemonFormTriggerCondition where
  arbitrary = sized genPokemonFormTriggerCondition

genPokemonFormTriggerCondition :: Int -> Gen PokemonFormTriggerCondition
genPokemonFormTriggerCondition n =
  PokemonFormTriggerCondition
    <$> arbitrary -- pokemonFormTriggerConditionTrigger :: Text
    <*> arbitraryReducedMaybe n -- pokemonFormTriggerConditionName :: Maybe Text
    <*> arbitraryReducedMaybe n -- pokemonFormTriggerConditionUrl :: Maybe Text
    <*> arbitraryReducedMaybe n -- pokemonFormTriggerConditionBaseForm :: Maybe PokemonFormSummary
  
instance Arbitrary PokemonFormType where
  arbitrary = sized genPokemonFormType

genPokemonFormType :: Int -> Gen PokemonFormType
genPokemonFormType n =
  PokemonFormType
    <$> arbitrary -- pokemonFormTypeSlot :: Int
    <*> arbitraryReduced n -- pokemonFormTypeType :: TypeSummary
  
instance Arbitrary PokemonGameIndex where
  arbitrary = sized genPokemonGameIndex

genPokemonGameIndex :: Int -> Gen PokemonGameIndex
genPokemonGameIndex n =
  PokemonGameIndex
    <$> arbitrary -- pokemonGameIndexGameIndex :: Int
    <*> arbitraryReduced n -- pokemonGameIndexVersion :: VersionSummary
  
instance Arbitrary PokemonHabitatDetail where
  arbitrary = sized genPokemonHabitatDetail

genPokemonHabitatDetail :: Int -> Gen PokemonHabitatDetail
genPokemonHabitatDetail n =
  PokemonHabitatDetail
    <$> arbitrary -- pokemonHabitatDetailId :: Int
    <*> arbitrary -- pokemonHabitatDetailName :: Text
    <*> arbitraryReduced n -- pokemonHabitatDetailNames :: [PokemonHabitatName]
    <*> arbitraryReduced n -- pokemonHabitatDetailPokemonSpecies :: [PokemonSpeciesSummary]
  
instance Arbitrary PokemonHabitatName where
  arbitrary = sized genPokemonHabitatName

genPokemonHabitatName :: Int -> Gen PokemonHabitatName
genPokemonHabitatName n =
  PokemonHabitatName
    <$> arbitrary -- pokemonHabitatNameName :: Text
    <*> arbitraryReduced n -- pokemonHabitatNameLanguage :: LanguageSummary
  
instance Arbitrary PokemonHabitatSummary where
  arbitrary = sized genPokemonHabitatSummary

genPokemonHabitatSummary :: Int -> Gen PokemonHabitatSummary
genPokemonHabitatSummary n =
  PokemonHabitatSummary
    <$> arbitrary -- pokemonHabitatSummaryName :: Text
    <*> arbitrary -- pokemonHabitatSummaryUrl :: Text
  
instance Arbitrary PokemonHeldItem where
  arbitrary = sized genPokemonHeldItem

genPokemonHeldItem :: Int -> Gen PokemonHeldItem
genPokemonHeldItem n =
  PokemonHeldItem
    <$> arbitraryReduced n -- pokemonHeldItemPokemon :: PokemonSummary
    <*> arbitraryReduced n -- pokemonHeldItemVersionDetails :: [PokemonHeldItemVersion]
  
instance Arbitrary PokemonHeldItemSummary where
  arbitrary = sized genPokemonHeldItemSummary

genPokemonHeldItemSummary :: Int -> Gen PokemonHeldItemSummary
genPokemonHeldItemSummary n =
  PokemonHeldItemSummary
    <$> arbitraryReduced n -- pokemonHeldItemSummaryItem :: ItemSummary
    <*> arbitraryReduced n -- pokemonHeldItemSummaryVersionDetails :: [PokemonHeldItemVersion]
  
instance Arbitrary PokemonHeldItemVersion where
  arbitrary = sized genPokemonHeldItemVersion

genPokemonHeldItemVersion :: Int -> Gen PokemonHeldItemVersion
genPokemonHeldItemVersion n =
  PokemonHeldItemVersion
    <$> arbitrary -- pokemonHeldItemVersionRarity :: Int
    <*> arbitraryReduced n -- pokemonHeldItemVersionVersion :: VersionSummary
  
instance Arbitrary PokemonMove where
  arbitrary = sized genPokemonMove

genPokemonMove :: Int -> Gen PokemonMove
genPokemonMove n =
  PokemonMove
    <$> arbitraryReduced n -- pokemonMoveMove :: MoveSummary
    <*> arbitraryReduced n -- pokemonMoveVersionGroupDetails :: [PokemonMoveVersionGroup]
  
instance Arbitrary PokemonMoveVersionGroup where
  arbitrary = sized genPokemonMoveVersionGroup

genPokemonMoveVersionGroup :: Int -> Gen PokemonMoveVersionGroup
genPokemonMoveVersionGroup n =
  PokemonMoveVersionGroup
    <$> arbitrary -- pokemonMoveVersionGroupLevelLearnedAt :: Int
    <*> arbitraryReduced n -- pokemonMoveVersionGroupMoveLearnMethod :: MoveLearnMethodSummary
    <*> arbitraryReduced n -- pokemonMoveVersionGroupVersionGroup :: VersionGroupSummary
    <*> arbitraryReducedMaybe n -- pokemonMoveVersionGroupOrder :: Maybe Int
  
instance Arbitrary PokemonPastAbility where
  arbitrary = sized genPokemonPastAbility

genPokemonPastAbility :: Int -> Gen PokemonPastAbility
genPokemonPastAbility n =
  PokemonPastAbility
    <$> arbitraryReduced n -- pokemonPastAbilityAbilities :: [PokemonAbilityPast]
    <*> arbitraryReduced n -- pokemonPastAbilityGeneration :: GenerationSummary
  
instance Arbitrary PokemonPastStat where
  arbitrary = sized genPokemonPastStat

genPokemonPastStat :: Int -> Gen PokemonPastStat
genPokemonPastStat n =
  PokemonPastStat
    <$> arbitraryReduced n -- pokemonPastStatGeneration :: GenerationSummary
    <*> arbitraryReduced n -- pokemonPastStatStats :: [PokemonStat]
  
instance Arbitrary PokemonPastType where
  arbitrary = sized genPokemonPastType

genPokemonPastType :: Int -> Gen PokemonPastType
genPokemonPastType n =
  PokemonPastType
    <$> arbitraryReduced n -- pokemonPastTypeGeneration :: GenerationSummary
    <*> arbitraryReduced n -- pokemonPastTypeTypes :: [PokemonType]
  
instance Arbitrary PokemonShapeAwesomeName where
  arbitrary = sized genPokemonShapeAwesomeName

genPokemonShapeAwesomeName :: Int -> Gen PokemonShapeAwesomeName
genPokemonShapeAwesomeName n =
  PokemonShapeAwesomeName
    <$> arbitrary -- pokemonShapeAwesomeNameAwesomeName :: Text
    <*> arbitraryReduced n -- pokemonShapeAwesomeNameLanguage :: LanguageSummary
  
instance Arbitrary PokemonShapeDetail where
  arbitrary = sized genPokemonShapeDetail

genPokemonShapeDetail :: Int -> Gen PokemonShapeDetail
genPokemonShapeDetail n =
  PokemonShapeDetail
    <$> arbitrary -- pokemonShapeDetailId :: Int
    <*> arbitrary -- pokemonShapeDetailName :: Text
    <*> arbitraryReduced n -- pokemonShapeDetailAwesomeNames :: [PokemonShapeAwesomeName]
    <*> arbitraryReduced n -- pokemonShapeDetailNames :: [PokemonShapeName]
    <*> arbitraryReduced n -- pokemonShapeDetailPokemonSpecies :: [PokemonSpeciesSummary]
  
instance Arbitrary PokemonShapeName where
  arbitrary = sized genPokemonShapeName

genPokemonShapeName :: Int -> Gen PokemonShapeName
genPokemonShapeName n =
  PokemonShapeName
    <$> arbitrary -- pokemonShapeNameName :: Text
    <*> arbitraryReduced n -- pokemonShapeNameLanguage :: LanguageSummary
  
instance Arbitrary PokemonShapeSummary where
  arbitrary = sized genPokemonShapeSummary

genPokemonShapeSummary :: Int -> Gen PokemonShapeSummary
genPokemonShapeSummary n =
  PokemonShapeSummary
    <$> arbitrary -- pokemonShapeSummaryName :: Text
    <*> arbitrary -- pokemonShapeSummaryUrl :: Text
  
instance Arbitrary PokemonSpeciesDescription where
  arbitrary = sized genPokemonSpeciesDescription

genPokemonSpeciesDescription :: Int -> Gen PokemonSpeciesDescription
genPokemonSpeciesDescription n =
  PokemonSpeciesDescription
    <$> arbitraryReducedMaybe n -- pokemonSpeciesDescriptionDescription :: Maybe Text
    <*> arbitraryReduced n -- pokemonSpeciesDescriptionLanguage :: LanguageSummary
  
instance Arbitrary PokemonSpeciesDetail where
  arbitrary = sized genPokemonSpeciesDetail

genPokemonSpeciesDetail :: Int -> Gen PokemonSpeciesDetail
genPokemonSpeciesDetail n =
  PokemonSpeciesDetail
    <$> arbitrary -- pokemonSpeciesDetailId :: Int
    <*> arbitrary -- pokemonSpeciesDetailName :: Text
    <*> arbitraryReducedMaybe n -- pokemonSpeciesDetailOrder :: Maybe Int
    <*> arbitraryReducedMaybe n -- pokemonSpeciesDetailGenderRate :: Maybe Int
    <*> arbitraryReducedMaybe n -- pokemonSpeciesDetailCaptureRate :: Maybe Int
    <*> arbitraryReducedMaybe n -- pokemonSpeciesDetailBaseHappiness :: Maybe Int
    <*> arbitraryReducedMaybe n -- pokemonSpeciesDetailIsBaby :: Maybe Bool
    <*> arbitraryReducedMaybe n -- pokemonSpeciesDetailIsLegendary :: Maybe Bool
    <*> arbitraryReducedMaybe n -- pokemonSpeciesDetailIsMythical :: Maybe Bool
    <*> arbitraryReducedMaybe n -- pokemonSpeciesDetailHatchCounter :: Maybe Int
    <*> arbitraryReducedMaybe n -- pokemonSpeciesDetailHasGenderDifferences :: Maybe Bool
    <*> arbitraryReducedMaybe n -- pokemonSpeciesDetailFormsSwitchable :: Maybe Bool
    <*> arbitraryReduced n -- pokemonSpeciesDetailGrowthRate :: GrowthRateSummary
    <*> arbitraryReduced n -- pokemonSpeciesDetailPokedexNumbers :: [PokemonDexEntry]
    <*> arbitraryReduced n -- pokemonSpeciesDetailEggGroups :: [EggGroupSummary]
    <*> arbitraryReduced n -- pokemonSpeciesDetailColor :: PokemonColorSummary
    <*> arbitraryReduced n -- pokemonSpeciesDetailShape :: PokemonShapeSummary
    <*> arbitraryReduced n -- pokemonSpeciesDetailEvolvesFromSpecies :: PokemonSpeciesSummary
    <*> arbitraryReduced n -- pokemonSpeciesDetailEvolutionChain :: EvolutionChainSummary
    <*> arbitraryReduced n -- pokemonSpeciesDetailHabitat :: PokemonHabitatSummary
    <*> arbitraryReduced n -- pokemonSpeciesDetailGeneration :: GenerationSummary
    <*> arbitraryReduced n -- pokemonSpeciesDetailNames :: [PokemonSpeciesName]
    <*> arbitraryReduced n -- pokemonSpeciesDetailPalParkEncounters :: [PokemonSpeciesPalParkEncounter]
    <*> arbitraryReduced n -- pokemonSpeciesDetailFormDescriptions :: [PokemonSpeciesDescription]
    <*> arbitraryReduced n -- pokemonSpeciesDetailFlavorTextEntries :: [PokemonSpeciesFlavorText]
    <*> arbitraryReduced n -- pokemonSpeciesDetailGenera :: [PokemonSpeciesGenus]
    <*> arbitraryReduced n -- pokemonSpeciesDetailVarieties :: [PokemonSpeciesVariety]
  
instance Arbitrary PokemonSpeciesFlavorText where
  arbitrary = sized genPokemonSpeciesFlavorText

genPokemonSpeciesFlavorText :: Int -> Gen PokemonSpeciesFlavorText
genPokemonSpeciesFlavorText n =
  PokemonSpeciesFlavorText
    <$> arbitrary -- pokemonSpeciesFlavorTextFlavorText :: Text
    <*> arbitraryReduced n -- pokemonSpeciesFlavorTextLanguage :: LanguageSummary
    <*> arbitraryReduced n -- pokemonSpeciesFlavorTextVersion :: VersionSummary
  
instance Arbitrary PokemonSpeciesGenus where
  arbitrary = sized genPokemonSpeciesGenus

genPokemonSpeciesGenus :: Int -> Gen PokemonSpeciesGenus
genPokemonSpeciesGenus n =
  PokemonSpeciesGenus
    <$> arbitrary -- pokemonSpeciesGenusGenus :: Text
    <*> arbitraryReduced n -- pokemonSpeciesGenusLanguage :: LanguageSummary
  
instance Arbitrary PokemonSpeciesName where
  arbitrary = sized genPokemonSpeciesName

genPokemonSpeciesName :: Int -> Gen PokemonSpeciesName
genPokemonSpeciesName n =
  PokemonSpeciesName
    <$> arbitrary -- pokemonSpeciesNameName :: Text
    <*> arbitraryReduced n -- pokemonSpeciesNameLanguage :: LanguageSummary
  
instance Arbitrary PokemonSpeciesPalParkEncounter where
  arbitrary = sized genPokemonSpeciesPalParkEncounter

genPokemonSpeciesPalParkEncounter :: Int -> Gen PokemonSpeciesPalParkEncounter
genPokemonSpeciesPalParkEncounter n =
  PokemonSpeciesPalParkEncounter
    <$> arbitraryReducedMaybe n -- pokemonSpeciesPalParkEncounterBaseScore :: Maybe Int
    <*> arbitrary -- pokemonSpeciesPalParkEncounterRate :: Int
    <*> arbitraryReduced n -- pokemonSpeciesPalParkEncounterArea :: PalParkAreaSummary
  
instance Arbitrary PokemonSpeciesSummary where
  arbitrary = sized genPokemonSpeciesSummary

genPokemonSpeciesSummary :: Int -> Gen PokemonSpeciesSummary
genPokemonSpeciesSummary n =
  PokemonSpeciesSummary
    <$> arbitrary -- pokemonSpeciesSummaryName :: Text
    <*> arbitrary -- pokemonSpeciesSummaryUrl :: Text
  
instance Arbitrary PokemonSpeciesVariety where
  arbitrary = sized genPokemonSpeciesVariety

genPokemonSpeciesVariety :: Int -> Gen PokemonSpeciesVariety
genPokemonSpeciesVariety n =
  PokemonSpeciesVariety
    <$> arbitrary -- pokemonSpeciesVarietyIsDefault :: Bool
    <*> arbitraryReduced n -- pokemonSpeciesVarietyPokemon :: PokemonSummary
  
instance Arbitrary PokemonSprites where
  arbitrary = sized genPokemonSprites

genPokemonSprites :: Int -> Gen PokemonSprites
genPokemonSprites n =
  PokemonSprites
    <$> arbitrary -- pokemonSpritesFrontDefault :: Text
    <*> arbitrary -- pokemonSpritesFrontShiny :: Text
    <*> arbitrary -- pokemonSpritesFrontFemale :: Text
    <*> arbitrary -- pokemonSpritesFrontShinyFemale :: Text
    <*> arbitrary -- pokemonSpritesBackDefault :: Text
    <*> arbitrary -- pokemonSpritesBackShiny :: Text
    <*> arbitrary -- pokemonSpritesBackFemale :: Text
    <*> arbitrary -- pokemonSpritesBackShinyFemale :: Text
    <*> arbitraryReducedMaybe n -- pokemonSpritesOther :: Maybe PokemonSpritesOther
    <*> arbitraryReducedMaybe n -- pokemonSpritesVersions :: Maybe (Map.Map String (Map.Map String AnyType))
  
instance Arbitrary PokemonSpritesOther where
  arbitrary = sized genPokemonSpritesOther

genPokemonSpritesOther :: Int -> Gen PokemonSpritesOther
genPokemonSpritesOther n =
  PokemonSpritesOther
    <$> arbitraryReducedMaybe n -- pokemonSpritesOtherDreamWorld :: Maybe PokemonSpritesOtherDreamWorld
    <*> arbitraryReducedMaybe n -- pokemonSpritesOtherHome :: Maybe PokemonSpritesOtherHome
    <*> arbitraryReducedMaybe n -- pokemonSpritesOtherShowdown :: Maybe PokemonSpritesOtherShowdown
    <*> arbitraryReducedMaybe n -- pokemonSpritesOtherOfficialArtwork :: Maybe PokemonSpritesOtherOfficialArtwork
  
instance Arbitrary PokemonSpritesOtherDreamWorld where
  arbitrary = sized genPokemonSpritesOtherDreamWorld

genPokemonSpritesOtherDreamWorld :: Int -> Gen PokemonSpritesOtherDreamWorld
genPokemonSpritesOtherDreamWorld n =
  PokemonSpritesOtherDreamWorld
    <$> arbitrary -- pokemonSpritesOtherDreamWorldFrontDefault :: Text
    <*> arbitrary -- pokemonSpritesOtherDreamWorldFrontFemale :: Text
  
instance Arbitrary PokemonSpritesOtherHome where
  arbitrary = sized genPokemonSpritesOtherHome

genPokemonSpritesOtherHome :: Int -> Gen PokemonSpritesOtherHome
genPokemonSpritesOtherHome n =
  PokemonSpritesOtherHome
    <$> arbitrary -- pokemonSpritesOtherHomeFrontDefault :: Text
    <*> arbitrary -- pokemonSpritesOtherHomeFrontFemale :: Text
    <*> arbitrary -- pokemonSpritesOtherHomeFrontShiny :: Text
    <*> arbitrary -- pokemonSpritesOtherHomeFrontShinyFemale :: Text
  
instance Arbitrary PokemonSpritesOtherOfficialArtwork where
  arbitrary = sized genPokemonSpritesOtherOfficialArtwork

genPokemonSpritesOtherOfficialArtwork :: Int -> Gen PokemonSpritesOtherOfficialArtwork
genPokemonSpritesOtherOfficialArtwork n =
  PokemonSpritesOtherOfficialArtwork
    <$> arbitrary -- pokemonSpritesOtherOfficialArtworkFrontDefault :: Text
    <*> arbitrary -- pokemonSpritesOtherOfficialArtworkFrontShiny :: Text
    <*> arbitraryReducedMaybe n -- pokemonSpritesOtherOfficialArtworkVersions :: Maybe (Map.Map String (Map.Map String AnyType))
  
instance Arbitrary PokemonSpritesOtherShowdown where
  arbitrary = sized genPokemonSpritesOtherShowdown

genPokemonSpritesOtherShowdown :: Int -> Gen PokemonSpritesOtherShowdown
genPokemonSpritesOtherShowdown n =
  PokemonSpritesOtherShowdown
    <$> arbitrary -- pokemonSpritesOtherShowdownFrontDefault :: Text
    <*> arbitrary -- pokemonSpritesOtherShowdownFrontFemale :: Text
    <*> arbitrary -- pokemonSpritesOtherShowdownFrontShiny :: Text
    <*> arbitrary -- pokemonSpritesOtherShowdownFrontShinyFemale :: Text
    <*> arbitrary -- pokemonSpritesOtherShowdownBackDefault :: Text
    <*> arbitrary -- pokemonSpritesOtherShowdownBackFemale :: Text
    <*> arbitrary -- pokemonSpritesOtherShowdownBackShiny :: Text
    <*> arbitrary -- pokemonSpritesOtherShowdownBackShinyFemale :: Text
  
instance Arbitrary PokemonStat where
  arbitrary = sized genPokemonStat

genPokemonStat :: Int -> Gen PokemonStat
genPokemonStat n =
  PokemonStat
    <$> arbitrary -- pokemonStatBaseStat :: Int
    <*> arbitrary -- pokemonStatEffort :: Int
    <*> arbitraryReduced n -- pokemonStatStat :: StatSummary
  
instance Arbitrary PokemonSummary where
  arbitrary = sized genPokemonSummary

genPokemonSummary :: Int -> Gen PokemonSummary
genPokemonSummary n =
  PokemonSummary
    <$> arbitrary -- pokemonSummaryName :: Text
    <*> arbitrary -- pokemonSummaryUrl :: Text
  
instance Arbitrary PokemonType where
  arbitrary = sized genPokemonType

genPokemonType :: Int -> Gen PokemonType
genPokemonType n =
  PokemonType
    <$> arbitrary -- pokemonTypeSlot :: Int
    <*> arbitraryReduced n -- pokemonTypeType :: TypeSummary
  
instance Arbitrary RegionDetail where
  arbitrary = sized genRegionDetail

genRegionDetail :: Int -> Gen RegionDetail
genRegionDetail n =
  RegionDetail
    <$> arbitrary -- regionDetailId :: Int
    <*> arbitrary -- regionDetailName :: Text
    <*> arbitraryReduced n -- regionDetailLocations :: [LocationSummary]
    <*> arbitraryReduced n -- regionDetailMainGeneration :: GenerationSummary
    <*> arbitraryReduced n -- regionDetailNames :: [RegionName]
    <*> arbitraryReduced n -- regionDetailPokedexes :: [PokedexSummary]
    <*> arbitraryReduced n -- regionDetailVersionGroups :: [VersionGroupSummary]
  
instance Arbitrary RegionName where
  arbitrary = sized genRegionName

genRegionName :: Int -> Gen RegionName
genRegionName n =
  RegionName
    <$> arbitrary -- regionNameName :: Text
    <*> arbitraryReduced n -- regionNameLanguage :: LanguageSummary
  
instance Arbitrary RegionSummary where
  arbitrary = sized genRegionSummary

genRegionSummary :: Int -> Gen RegionSummary
genRegionSummary n =
  RegionSummary
    <$> arbitrary -- regionSummaryName :: Text
    <*> arbitrary -- regionSummaryUrl :: Text
  
instance Arbitrary StatAffectingMoves where
  arbitrary = sized genStatAffectingMoves

genStatAffectingMoves :: Int -> Gen StatAffectingMoves
genStatAffectingMoves n =
  StatAffectingMoves
    <$> arbitraryReduced n -- statAffectingMovesIncrease :: [MoveStatChange]
    <*> arbitraryReduced n -- statAffectingMovesDecrease :: [MoveStatChange]
  
instance Arbitrary StatAffectingNatures where
  arbitrary = sized genStatAffectingNatures

genStatAffectingNatures :: Int -> Gen StatAffectingNatures
genStatAffectingNatures n =
  StatAffectingNatures
    <$> arbitraryReduced n -- statAffectingNaturesIncrease :: [NatureSummary]
    <*> arbitraryReduced n -- statAffectingNaturesDecrease :: [NatureSummary]
  
instance Arbitrary StatDetail where
  arbitrary = sized genStatDetail

genStatDetail :: Int -> Gen StatDetail
genStatDetail n =
  StatDetail
    <$> arbitrary -- statDetailId :: Int
    <*> arbitrary -- statDetailName :: Text
    <*> arbitrary -- statDetailGameIndex :: Int
    <*> arbitraryReducedMaybe n -- statDetailIsBattleOnly :: Maybe Bool
    <*> arbitraryReduced n -- statDetailAffectingMoves :: StatAffectingMoves
    <*> arbitraryReduced n -- statDetailAffectingNatures :: StatAffectingNatures
    <*> arbitraryReduced n -- statDetailAffectingItems :: [ItemSummary]
    <*> arbitraryReduced n -- statDetailCharacteristics :: [CharacteristicSummary]
    <*> arbitraryReduced n -- statDetailMoveDamageClass :: MoveDamageClassSummary
    <*> arbitraryReduced n -- statDetailNames :: [StatName]
  
instance Arbitrary StatName where
  arbitrary = sized genStatName

genStatName :: Int -> Gen StatName
genStatName n =
  StatName
    <$> arbitrary -- statNameName :: Text
    <*> arbitraryReduced n -- statNameLanguage :: LanguageSummary
  
instance Arbitrary StatSummary where
  arbitrary = sized genStatSummary

genStatSummary :: Int -> Gen StatSummary
genStatSummary n =
  StatSummary
    <$> arbitrary -- statSummaryName :: Text
    <*> arbitrary -- statSummaryUrl :: Text
  
instance Arbitrary SuperContestEffectDetail where
  arbitrary = sized genSuperContestEffectDetail

genSuperContestEffectDetail :: Int -> Gen SuperContestEffectDetail
genSuperContestEffectDetail n =
  SuperContestEffectDetail
    <$> arbitrary -- superContestEffectDetailId :: Int
    <*> arbitrary -- superContestEffectDetailAppeal :: Int
    <*> arbitraryReduced n -- superContestEffectDetailFlavorTextEntries :: [SuperContestEffectFlavorText]
    <*> arbitraryReduced n -- superContestEffectDetailMoves :: [MoveSummary]
  
instance Arbitrary SuperContestEffectFlavorText where
  arbitrary = sized genSuperContestEffectFlavorText

genSuperContestEffectFlavorText :: Int -> Gen SuperContestEffectFlavorText
genSuperContestEffectFlavorText n =
  SuperContestEffectFlavorText
    <$> arbitrary -- superContestEffectFlavorTextFlavorText :: Text
    <*> arbitraryReduced n -- superContestEffectFlavorTextLanguage :: LanguageSummary
  
instance Arbitrary SuperContestEffectSummary where
  arbitrary = sized genSuperContestEffectSummary

genSuperContestEffectSummary :: Int -> Gen SuperContestEffectSummary
genSuperContestEffectSummary n =
  SuperContestEffectSummary
    <$> arbitrary -- superContestEffectSummaryUrl :: Text
  
instance Arbitrary TypeDetail where
  arbitrary = sized genTypeDetail

genTypeDetail :: Int -> Gen TypeDetail
genTypeDetail n =
  TypeDetail
    <$> arbitrary -- typeDetailId :: Int
    <*> arbitrary -- typeDetailName :: Text
    <*> arbitraryReduced n -- typeDetailDamageRelations :: TypeRelationships
    <*> arbitraryReduced n -- typeDetailPastDamageRelations :: [TypePastRelationships]
    <*> arbitraryReduced n -- typeDetailGameIndices :: [TypeGameIndex]
    <*> arbitraryReduced n -- typeDetailGeneration :: GenerationSummary
    <*> arbitraryReduced n -- typeDetailMoveDamageClass :: MoveDamageClassSummary
    <*> arbitraryReduced n -- typeDetailNames :: [TypeName]
    <*> arbitraryReduced n -- typeDetailPokemon :: [TypePokemon]
    <*> arbitraryReduced n -- typeDetailMoves :: [MoveSummary]
    <*> arbitraryReduced n -- typeDetailSprites :: (Map.Map String (Map.Map String TypeGameSprite))
  
instance Arbitrary TypeGameIndex where
  arbitrary = sized genTypeGameIndex

genTypeGameIndex :: Int -> Gen TypeGameIndex
genTypeGameIndex n =
  TypeGameIndex
    <$> arbitrary -- typeGameIndexGameIndex :: Int
    <*> arbitraryReduced n -- typeGameIndexGeneration :: GenerationSummary
  
instance Arbitrary TypeGameSprite where
  arbitrary = sized genTypeGameSprite

genTypeGameSprite :: Int -> Gen TypeGameSprite
genTypeGameSprite n =
  TypeGameSprite
    <$> arbitraryReducedMaybe n -- typeGameSpriteNameIcon :: Maybe Text
    <*> arbitraryReducedMaybe n -- typeGameSpriteSymbolIcon :: Maybe Text
  
instance Arbitrary TypeName where
  arbitrary = sized genTypeName

genTypeName :: Int -> Gen TypeName
genTypeName n =
  TypeName
    <$> arbitrary -- typeNameName :: Text
    <*> arbitraryReduced n -- typeNameLanguage :: LanguageSummary
  
instance Arbitrary TypePastRelationships where
  arbitrary = sized genTypePastRelationships

genTypePastRelationships :: Int -> Gen TypePastRelationships
genTypePastRelationships n =
  TypePastRelationships
    <$> arbitraryReduced n -- typePastRelationshipsGeneration :: GenerationSummary
    <*> arbitraryReduced n -- typePastRelationshipsDamageRelations :: TypeRelationships
  
instance Arbitrary TypePokemon where
  arbitrary = sized genTypePokemon

genTypePokemon :: Int -> Gen TypePokemon
genTypePokemon n =
  TypePokemon
    <$> arbitrary -- typePokemonSlot :: Int
    <*> arbitraryReduced n -- typePokemonPokemon :: PokemonSummary
  
instance Arbitrary TypeRelationships where
  arbitrary = sized genTypeRelationships

genTypeRelationships :: Int -> Gen TypeRelationships
genTypeRelationships n =
  TypeRelationships
    <$> arbitraryReduced n -- typeRelationshipsNoDamageTo :: [TypeSummary]
    <*> arbitraryReduced n -- typeRelationshipsHalfDamageTo :: [TypeSummary]
    <*> arbitraryReduced n -- typeRelationshipsDoubleDamageTo :: [TypeSummary]
    <*> arbitraryReduced n -- typeRelationshipsNoDamageFrom :: [TypeSummary]
    <*> arbitraryReduced n -- typeRelationshipsHalfDamageFrom :: [TypeSummary]
    <*> arbitraryReduced n -- typeRelationshipsDoubleDamageFrom :: [TypeSummary]
  
instance Arbitrary TypeSummary where
  arbitrary = sized genTypeSummary

genTypeSummary :: Int -> Gen TypeSummary
genTypeSummary n =
  TypeSummary
    <$> arbitrary -- typeSummaryName :: Text
    <*> arbitrary -- typeSummaryUrl :: Text
  
instance Arbitrary VersionDetail where
  arbitrary = sized genVersionDetail

genVersionDetail :: Int -> Gen VersionDetail
genVersionDetail n =
  VersionDetail
    <$> arbitrary -- versionDetailId :: Int
    <*> arbitrary -- versionDetailName :: Text
    <*> arbitraryReduced n -- versionDetailNames :: [VersionName]
    <*> arbitraryReduced n -- versionDetailVersionGroup :: VersionGroupSummary
  
instance Arbitrary VersionGroupDetail where
  arbitrary = sized genVersionGroupDetail

genVersionGroupDetail :: Int -> Gen VersionGroupDetail
genVersionGroupDetail n =
  VersionGroupDetail
    <$> arbitrary -- versionGroupDetailId :: Int
    <*> arbitrary -- versionGroupDetailName :: Text
    <*> arbitraryReducedMaybe n -- versionGroupDetailOrder :: Maybe Int
    <*> arbitraryReduced n -- versionGroupDetailGeneration :: GenerationSummary
    <*> arbitraryReduced n -- versionGroupDetailMoveLearnMethods :: [MoveLearnMethodSummary]
    <*> arbitraryReduced n -- versionGroupDetailPokedexes :: [PokedexSummary]
    <*> arbitraryReduced n -- versionGroupDetailRegions :: [RegionSummary]
    <*> arbitraryReduced n -- versionGroupDetailVersions :: [VersionSummary]
  
instance Arbitrary VersionGroupSummary where
  arbitrary = sized genVersionGroupSummary

genVersionGroupSummary :: Int -> Gen VersionGroupSummary
genVersionGroupSummary n =
  VersionGroupSummary
    <$> arbitrary -- versionGroupSummaryName :: Text
    <*> arbitrary -- versionGroupSummaryUrl :: Text
  
instance Arbitrary VersionName where
  arbitrary = sized genVersionName

genVersionName :: Int -> Gen VersionName
genVersionName n =
  VersionName
    <$> arbitrary -- versionNameName :: Text
    <*> arbitraryReduced n -- versionNameLanguage :: LanguageSummary
  
instance Arbitrary VersionSummary where
  arbitrary = sized genVersionSummary

genVersionSummary :: Int -> Gen VersionSummary
genVersionSummary n =
  VersionSummary
    <$> arbitrary -- versionSummaryName :: Text
    <*> arbitrary -- versionSummaryUrl :: Text
  



