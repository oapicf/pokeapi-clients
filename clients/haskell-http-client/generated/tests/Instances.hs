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
    <*> arbitraryReduced n -- abilityDetailPokemon :: [AbilityDetailPokemonInner]
  
instance Arbitrary AbilityDetailPokemonInner where
  arbitrary = sized genAbilityDetailPokemonInner

genAbilityDetailPokemonInner :: Int -> Gen AbilityDetailPokemonInner
genAbilityDetailPokemonInner n =
  AbilityDetailPokemonInner
    <$> arbitrary -- abilityDetailPokemonInnerIsHidden :: Bool
    <*> arbitrary -- abilityDetailPokemonInnerSlot :: Int
    <*> arbitraryReduced n -- abilityDetailPokemonInnerPokemon :: AbilityDetailPokemonInnerPokemon
  
instance Arbitrary AbilityDetailPokemonInnerPokemon where
  arbitrary = sized genAbilityDetailPokemonInnerPokemon

genAbilityDetailPokemonInnerPokemon :: Int -> Gen AbilityDetailPokemonInnerPokemon
genAbilityDetailPokemonInnerPokemon n =
  AbilityDetailPokemonInnerPokemon
    <$> arbitrary -- abilityDetailPokemonInnerPokemonName :: Text
    <*> arbitrary -- abilityDetailPokemonInnerPokemonUrl :: Text
  
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
    <*> arbitrary -- berryDetailGrowthTime :: Int
    <*> arbitrary -- berryDetailMaxHarvest :: Int
    <*> arbitrary -- berryDetailNaturalGiftPower :: Int
    <*> arbitrary -- berryDetailSize :: Int
    <*> arbitrary -- berryDetailSmoothness :: Int
    <*> arbitrary -- berryDetailSoilDryness :: Int
    <*> arbitraryReduced n -- berryDetailFirmness :: BerryFirmnessSummary
    <*> arbitraryReduced n -- berryDetailFlavors :: [BerryDetailFlavorsInner]
    <*> arbitraryReduced n -- berryDetailItem :: ItemSummary
    <*> arbitraryReduced n -- berryDetailNaturalGiftType :: TypeSummary
  
instance Arbitrary BerryDetailFlavorsInner where
  arbitrary = sized genBerryDetailFlavorsInner

genBerryDetailFlavorsInner :: Int -> Gen BerryDetailFlavorsInner
genBerryDetailFlavorsInner n =
  BerryDetailFlavorsInner
    <$> arbitrary -- berryDetailFlavorsInnerPotency :: Int
    <*> arbitraryReduced n -- berryDetailFlavorsInnerFlavor :: BerryDetailFlavorsInnerFlavor
  
instance Arbitrary BerryDetailFlavorsInnerFlavor where
  arbitrary = sized genBerryDetailFlavorsInnerFlavor

genBerryDetailFlavorsInnerFlavor :: Int -> Gen BerryDetailFlavorsInnerFlavor
genBerryDetailFlavorsInnerFlavor n =
  BerryDetailFlavorsInnerFlavor
    <$> arbitraryReducedMaybe n -- berryDetailFlavorsInnerFlavorName :: Maybe Text
    <*> arbitraryReducedMaybe n -- berryDetailFlavorsInnerFlavorUrl :: Maybe Text
  
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
  
instance Arbitrary BerryFlavorDetail where
  arbitrary = sized genBerryFlavorDetail

genBerryFlavorDetail :: Int -> Gen BerryFlavorDetail
genBerryFlavorDetail n =
  BerryFlavorDetail
    <$> arbitrary -- berryFlavorDetailId :: Int
    <*> arbitrary -- berryFlavorDetailName :: Text
    <*> arbitraryReduced n -- berryFlavorDetailBerries :: [BerryFlavorDetailBerriesInner]
    <*> arbitraryReduced n -- berryFlavorDetailContestType :: ContestTypeSummary
    <*> arbitraryReduced n -- berryFlavorDetailNames :: [BerryFlavorName]
  
instance Arbitrary BerryFlavorDetailBerriesInner where
  arbitrary = sized genBerryFlavorDetailBerriesInner

genBerryFlavorDetailBerriesInner :: Int -> Gen BerryFlavorDetailBerriesInner
genBerryFlavorDetailBerriesInner n =
  BerryFlavorDetailBerriesInner
    <$> arbitrary -- berryFlavorDetailBerriesInnerPotency :: Int
    <*> arbitraryReduced n -- berryFlavorDetailBerriesInnerBerry :: BerryFlavorDetailBerriesInnerBerry
  
instance Arbitrary BerryFlavorDetailBerriesInnerBerry where
  arbitrary = sized genBerryFlavorDetailBerriesInnerBerry

genBerryFlavorDetailBerriesInnerBerry :: Int -> Gen BerryFlavorDetailBerriesInnerBerry
genBerryFlavorDetailBerriesInnerBerry n =
  BerryFlavorDetailBerriesInnerBerry
    <$> arbitraryReducedMaybe n -- berryFlavorDetailBerriesInnerBerryName :: Maybe Text
    <*> arbitraryReducedMaybe n -- berryFlavorDetailBerriesInnerBerryUrl :: Maybe Text
  
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
  
instance Arbitrary EggGroupDetail where
  arbitrary = sized genEggGroupDetail

genEggGroupDetail :: Int -> Gen EggGroupDetail
genEggGroupDetail n =
  EggGroupDetail
    <$> arbitrary -- eggGroupDetailId :: Int
    <*> arbitrary -- eggGroupDetailName :: Text
    <*> arbitraryReduced n -- eggGroupDetailNames :: [EggGroupName]
    <*> arbitraryReduced n -- eggGroupDetailPokemonSpecies :: [EggGroupDetailPokemonSpeciesInner]
  
instance Arbitrary EggGroupDetailPokemonSpeciesInner where
  arbitrary = sized genEggGroupDetailPokemonSpeciesInner

genEggGroupDetailPokemonSpeciesInner :: Int -> Gen EggGroupDetailPokemonSpeciesInner
genEggGroupDetailPokemonSpeciesInner n =
  EggGroupDetailPokemonSpeciesInner
    <$> arbitraryReducedMaybe n -- eggGroupDetailPokemonSpeciesInnerName :: Maybe Text
    <*> arbitraryReducedMaybe n -- eggGroupDetailPokemonSpeciesInnerUrl :: Maybe Text
  
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
  
instance Arbitrary EvolutionChainDetail where
  arbitrary = sized genEvolutionChainDetail

genEvolutionChainDetail :: Int -> Gen EvolutionChainDetail
genEvolutionChainDetail n =
  EvolutionChainDetail
    <$> arbitrary -- evolutionChainDetailId :: Int
    <*> arbitraryReduced n -- evolutionChainDetailBabyTriggerItem :: ItemSummary
    <*> arbitraryReduced n -- evolutionChainDetailChain :: EvolutionChainDetailChain
  
instance Arbitrary EvolutionChainDetailChain where
  arbitrary = sized genEvolutionChainDetailChain

genEvolutionChainDetailChain :: Int -> Gen EvolutionChainDetailChain
genEvolutionChainDetailChain n =
  EvolutionChainDetailChain
    <$> arbitraryReduced n -- evolutionChainDetailChainEvolutionDetails :: [AnyType]
    <*> arbitraryReduced n -- evolutionChainDetailChainEvolvesTo :: [EvolutionChainDetailChainEvolvesToInner]
    <*> arbitrary -- evolutionChainDetailChainIsBaby :: Bool
    <*> arbitraryReduced n -- evolutionChainDetailChainSpecies :: AbilityDetailPokemonInnerPokemon
  
instance Arbitrary EvolutionChainDetailChainEvolvesToInner where
  arbitrary = sized genEvolutionChainDetailChainEvolvesToInner

genEvolutionChainDetailChainEvolvesToInner :: Int -> Gen EvolutionChainDetailChainEvolvesToInner
genEvolutionChainDetailChainEvolvesToInner n =
  EvolutionChainDetailChainEvolvesToInner
    <$> arbitraryReduced n -- evolutionChainDetailChainEvolvesToInnerEvolutionDetails :: [EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner]
    <*> arbitrary -- evolutionChainDetailChainEvolvesToInnerIsBaby :: Bool
    <*> arbitraryReduced n -- evolutionChainDetailChainEvolvesToInnerSpecies :: AbilityDetailPokemonInnerPokemon
  
instance Arbitrary EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner where
  arbitrary = sized genEvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner

genEvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner :: Int -> Gen EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner
genEvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner n =
  EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner
    <$> arbitraryReduced n -- evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender :: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender
    <*> arbitraryReduced n -- evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerHeldItem :: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender
    <*> arbitraryReduced n -- evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerItem :: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender
    <*> arbitraryReduced n -- evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerKnownMove :: A.Value
    <*> arbitraryReduced n -- evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerKnownMoveType :: A.Value
    <*> arbitraryReduced n -- evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerLocation :: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender
    <*> arbitrary -- evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerMinAffection :: Int
    <*> arbitrary -- evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerMinBeauty :: Int
    <*> arbitrary -- evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerMinHappiness :: Int
    <*> arbitrary -- evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerMinLevel :: Int
    <*> arbitrary -- evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerNeedsOverworldRain :: Bool
    <*> arbitrary -- evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerPartySpecies :: Text
    <*> arbitrary -- evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerPartyType :: Text
    <*> arbitrary -- evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerRelativePhysicalStats :: Text
    <*> arbitrary -- evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerTimeOfDay :: Text
    <*> arbitrary -- evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerTradeSpecies :: Text
    <*> arbitraryReduced n -- evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerTrigger :: AbilityDetailPokemonInnerPokemon
    <*> arbitrary -- evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerTurnUpsideDown :: Bool
  
instance Arbitrary EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender where
  arbitrary = sized genEvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender

genEvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender :: Int -> Gen EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender
genEvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender n =
  EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender
    <$> arbitrary -- evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGenderName :: Text
    <*> arbitrary -- evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGenderUrl :: Text
  
instance Arbitrary EvolutionChainSummary where
  arbitrary = sized genEvolutionChainSummary

genEvolutionChainSummary :: Int -> Gen EvolutionChainSummary
genEvolutionChainSummary n =
  EvolutionChainSummary
    <$> arbitrary -- evolutionChainSummaryUrl :: Text
  
instance Arbitrary EvolutionTriggerDetail where
  arbitrary = sized genEvolutionTriggerDetail

genEvolutionTriggerDetail :: Int -> Gen EvolutionTriggerDetail
genEvolutionTriggerDetail n =
  EvolutionTriggerDetail
    <$> arbitrary -- evolutionTriggerDetailId :: Int
    <*> arbitrary -- evolutionTriggerDetailName :: Text
    <*> arbitraryReduced n -- evolutionTriggerDetailNames :: [EvolutionTriggerName]
    <*> arbitraryReduced n -- evolutionTriggerDetailPokemonSpecies :: [AbilityDetailPokemonInnerPokemon]
  
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
    <*> arbitraryReduced n -- genderDetailPokemonSpeciesDetails :: [GenderDetailPokemonSpeciesDetailsInner]
    <*> arbitraryReduced n -- genderDetailRequiredForEvolution :: [AbilityDetailPokemonInnerPokemon]
  
instance Arbitrary GenderDetailPokemonSpeciesDetailsInner where
  arbitrary = sized genGenderDetailPokemonSpeciesDetailsInner

genGenderDetailPokemonSpeciesDetailsInner :: Int -> Gen GenderDetailPokemonSpeciesDetailsInner
genGenderDetailPokemonSpeciesDetailsInner n =
  GenderDetailPokemonSpeciesDetailsInner
    <$> arbitrary -- genderDetailPokemonSpeciesDetailsInnerRate :: Int
    <*> arbitraryReduced n -- genderDetailPokemonSpeciesDetailsInnerPokemonSpecies :: AbilityDetailPokemonInnerPokemon
  
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
    <*> arbitraryReduced n -- itemAttributeDetailItems :: [AbilityDetailPokemonInnerPokemon]
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
    <*> arbitraryReducedMaybe n -- itemDetailCost :: Maybe Int
    <*> arbitraryReducedMaybe n -- itemDetailFlingPower :: Maybe Int
    <*> arbitraryReduced n -- itemDetailFlingEffect :: ItemFlingEffectSummary
    <*> arbitraryReduced n -- itemDetailAttributes :: [AbilityDetailPokemonInnerPokemon]
    <*> arbitraryReduced n -- itemDetailCategory :: ItemCategorySummary
    <*> arbitraryReduced n -- itemDetailEffectEntries :: [ItemEffectText]
    <*> arbitraryReduced n -- itemDetailFlavorTextEntries :: [ItemFlavorText]
    <*> arbitraryReduced n -- itemDetailGameIndices :: [ItemGameIndex]
    <*> arbitraryReduced n -- itemDetailNames :: [ItemName]
    <*> arbitraryReduced n -- itemDetailHeldByPokemon :: [ItemDetailHeldByPokemonInner]
    <*> arbitraryReduced n -- itemDetailSprites :: ItemDetailSprites
    <*> arbitraryReduced n -- itemDetailBabyTriggerFor :: ItemDetailBabyTriggerFor
    <*> arbitraryReduced n -- itemDetailMachines :: [ItemDetailMachinesInner]
  
instance Arbitrary ItemDetailBabyTriggerFor where
  arbitrary = sized genItemDetailBabyTriggerFor

genItemDetailBabyTriggerFor :: Int -> Gen ItemDetailBabyTriggerFor
genItemDetailBabyTriggerFor n =
  ItemDetailBabyTriggerFor
    <$> arbitrary -- itemDetailBabyTriggerForUrl :: Text
  
instance Arbitrary ItemDetailHeldByPokemonInner where
  arbitrary = sized genItemDetailHeldByPokemonInner

genItemDetailHeldByPokemonInner :: Int -> Gen ItemDetailHeldByPokemonInner
genItemDetailHeldByPokemonInner n =
  ItemDetailHeldByPokemonInner
    <$> arbitraryReduced n -- itemDetailHeldByPokemonInnerPokemon :: AbilityDetailPokemonInnerPokemon
    <*> arbitraryReduced n -- itemDetailHeldByPokemonInnerVersionDetails :: [ItemDetailHeldByPokemonInnerVersionDetailsInner]
  
instance Arbitrary ItemDetailHeldByPokemonInnerVersionDetailsInner where
  arbitrary = sized genItemDetailHeldByPokemonInnerVersionDetailsInner

genItemDetailHeldByPokemonInnerVersionDetailsInner :: Int -> Gen ItemDetailHeldByPokemonInnerVersionDetailsInner
genItemDetailHeldByPokemonInnerVersionDetailsInner n =
  ItemDetailHeldByPokemonInnerVersionDetailsInner
    <$> arbitrary -- itemDetailHeldByPokemonInnerVersionDetailsInnerRarity :: Int
    <*> arbitraryReduced n -- itemDetailHeldByPokemonInnerVersionDetailsInnerVersion :: AbilityDetailPokemonInnerPokemon
  
instance Arbitrary ItemDetailMachinesInner where
  arbitrary = sized genItemDetailMachinesInner

genItemDetailMachinesInner :: Int -> Gen ItemDetailMachinesInner
genItemDetailMachinesInner n =
  ItemDetailMachinesInner
    <$> arbitrary -- itemDetailMachinesInnerMachine :: Text
    <*> arbitraryReduced n -- itemDetailMachinesInnerVersionGroup :: AbilityDetailPokemonInnerPokemon
  
instance Arbitrary ItemDetailSprites where
  arbitrary = sized genItemDetailSprites

genItemDetailSprites :: Int -> Gen ItemDetailSprites
genItemDetailSprites n =
  ItemDetailSprites
    <$> arbitrary -- itemDetailSpritesDefault :: Text
  
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
    <*> arbitraryReduced n -- locationAreaDetailEncounterMethodRates :: [LocationAreaDetailEncounterMethodRatesInner]
    <*> arbitraryReduced n -- locationAreaDetailLocation :: LocationSummary
    <*> arbitraryReduced n -- locationAreaDetailNames :: [LocationAreaName]
    <*> arbitraryReduced n -- locationAreaDetailPokemonEncounters :: [LocationAreaDetailPokemonEncountersInner]
  
instance Arbitrary LocationAreaDetailEncounterMethodRatesInner where
  arbitrary = sized genLocationAreaDetailEncounterMethodRatesInner

genLocationAreaDetailEncounterMethodRatesInner :: Int -> Gen LocationAreaDetailEncounterMethodRatesInner
genLocationAreaDetailEncounterMethodRatesInner n =
  LocationAreaDetailEncounterMethodRatesInner
    <$> arbitraryReduced n -- locationAreaDetailEncounterMethodRatesInnerEncounterMethod :: AbilityDetailPokemonInnerPokemon
    <*> arbitraryReduced n -- locationAreaDetailEncounterMethodRatesInnerVersionDetails :: [LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner]
  
instance Arbitrary LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner where
  arbitrary = sized genLocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner

genLocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner :: Int -> Gen LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner
genLocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner n =
  LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner
    <$> arbitrary -- locationAreaDetailEncounterMethodRatesInnerVersionDetailsInnerRate :: Int
    <*> arbitraryReduced n -- locationAreaDetailEncounterMethodRatesInnerVersionDetailsInnerVersion :: AbilityDetailPokemonInnerPokemon
  
instance Arbitrary LocationAreaDetailPokemonEncountersInner where
  arbitrary = sized genLocationAreaDetailPokemonEncountersInner

genLocationAreaDetailPokemonEncountersInner :: Int -> Gen LocationAreaDetailPokemonEncountersInner
genLocationAreaDetailPokemonEncountersInner n =
  LocationAreaDetailPokemonEncountersInner
    <$> arbitraryReduced n -- locationAreaDetailPokemonEncountersInnerPokemon :: AbilityDetailPokemonInnerPokemon
    <*> arbitraryReduced n -- locationAreaDetailPokemonEncountersInnerVersionDetails :: [LocationAreaDetailPokemonEncountersInnerVersionDetailsInner]
  
instance Arbitrary LocationAreaDetailPokemonEncountersInnerVersionDetailsInner where
  arbitrary = sized genLocationAreaDetailPokemonEncountersInnerVersionDetailsInner

genLocationAreaDetailPokemonEncountersInnerVersionDetailsInner :: Int -> Gen LocationAreaDetailPokemonEncountersInnerVersionDetailsInner
genLocationAreaDetailPokemonEncountersInnerVersionDetailsInner n =
  LocationAreaDetailPokemonEncountersInnerVersionDetailsInner
    <$> arbitraryReduced n -- locationAreaDetailPokemonEncountersInnerVersionDetailsInnerVersion :: AbilityDetailPokemonInnerPokemon
    <*> arbitrary -- locationAreaDetailPokemonEncountersInnerVersionDetailsInnerMaxChance :: Int
    <*> arbitraryReduced n -- locationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails :: LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails
  
instance Arbitrary LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails where
  arbitrary = sized genLocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails

genLocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails :: Int -> Gen LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails
genLocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails n =
  LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails
    <$> arbitrary -- locationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetailsMinLevel :: Int
    <*> arbitrary -- locationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetailsMaxLevel :: Int
    <*> arbitraryReducedMaybe n -- locationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetailsConditionValues :: Maybe AbilityDetailPokemonInnerPokemon
    <*> arbitrary -- locationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetailsChance :: Int
    <*> arbitraryReduced n -- locationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetailsMethod :: AbilityDetailPokemonInnerPokemon
  
instance Arbitrary LocationAreaName where
  arbitrary = sized genLocationAreaName

genLocationAreaName :: Int -> Gen LocationAreaName
genLocationAreaName n =
  LocationAreaName
    <$> arbitrary -- locationAreaNameName :: Text
    <*> arbitraryReduced n -- locationAreaNameLanguage :: LanguageSummary
  
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
    <*> arbitraryReduced n -- moveChangeEffectEntries :: [MoveChangeEffectEntriesInner]
    <*> arbitraryReduced n -- moveChangeType :: TypeSummary
    <*> arbitraryReduced n -- moveChangeVersionGroup :: VersionGroupSummary
  
instance Arbitrary MoveChangeEffectEntriesInner where
  arbitrary = sized genMoveChangeEffectEntriesInner

genMoveChangeEffectEntriesInner :: Int -> Gen MoveChangeEffectEntriesInner
genMoveChangeEffectEntriesInner n =
  MoveChangeEffectEntriesInner
    <$> arbitrary -- moveChangeEffectEntriesInnerEffect :: Text
    <*> arbitrary -- moveChangeEffectEntriesInnerShortEffect :: Text
    <*> arbitraryReduced n -- moveChangeEffectEntriesInnerLanguage :: AbilityDetailPokemonInnerPokemon
  
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
    <*> arbitraryReduced n -- moveDetailContestCombos :: MoveDetailContestCombos
    <*> arbitraryReduced n -- moveDetailContestType :: ContestTypeSummary
    <*> arbitraryReduced n -- moveDetailContestEffect :: ContestEffectSummary
    <*> arbitraryReduced n -- moveDetailDamageClass :: MoveDamageClassSummary
    <*> arbitraryReduced n -- moveDetailEffectEntries :: [MoveChangeEffectEntriesInner]
    <*> arbitraryReduced n -- moveDetailEffectChanges :: [MoveDetailEffectChangesInner]
    <*> arbitraryReduced n -- moveDetailGeneration :: GenerationSummary
    <*> arbitraryReduced n -- moveDetailMeta :: MoveMeta
    <*> arbitraryReduced n -- moveDetailNames :: [MoveName]
    <*> arbitraryReduced n -- moveDetailPastValues :: [MoveChange]
    <*> arbitraryReduced n -- moveDetailStatChanges :: [MoveDetailStatChangesInner]
    <*> arbitraryReduced n -- moveDetailSuperContestEffect :: SuperContestEffectSummary
    <*> arbitraryReduced n -- moveDetailTarget :: MoveTargetSummary
    <*> arbitraryReduced n -- moveDetailType :: TypeSummary
    <*> arbitraryReduced n -- moveDetailMachines :: [MoveDetailMachinesInner]
    <*> arbitraryReduced n -- moveDetailFlavorTextEntries :: [MoveFlavorText]
    <*> arbitraryReduced n -- moveDetailLearnedByPokemon :: [AbilityDetailPokemonInnerPokemon]
  
instance Arbitrary MoveDetailContestCombos where
  arbitrary = sized genMoveDetailContestCombos

genMoveDetailContestCombos :: Int -> Gen MoveDetailContestCombos
genMoveDetailContestCombos n =
  MoveDetailContestCombos
    <$> arbitraryReduced n -- moveDetailContestCombosNormal :: MoveDetailContestCombosNormal
    <*> arbitraryReduced n -- moveDetailContestCombosSuper :: MoveDetailContestCombosNormal
  
instance Arbitrary MoveDetailContestCombosNormal where
  arbitrary = sized genMoveDetailContestCombosNormal

genMoveDetailContestCombosNormal :: Int -> Gen MoveDetailContestCombosNormal
genMoveDetailContestCombosNormal n =
  MoveDetailContestCombosNormal
    <$> arbitraryReduced n -- moveDetailContestCombosNormalUseBefore :: [AbilityDetailPokemonInnerPokemon]
    <*> arbitraryReduced n -- moveDetailContestCombosNormalUseAfter :: [AbilityDetailPokemonInnerPokemon]
  
instance Arbitrary MoveDetailEffectChangesInner where
  arbitrary = sized genMoveDetailEffectChangesInner

genMoveDetailEffectChangesInner :: Int -> Gen MoveDetailEffectChangesInner
genMoveDetailEffectChangesInner n =
  MoveDetailEffectChangesInner
    <$> arbitraryReduced n -- moveDetailEffectChangesInnerEffectEntries :: [MoveDetailEffectChangesInnerEffectEntriesInner]
    <*> arbitraryReduced n -- moveDetailEffectChangesInnerVersionGroup :: AbilityDetailPokemonInnerPokemon
  
instance Arbitrary MoveDetailEffectChangesInnerEffectEntriesInner where
  arbitrary = sized genMoveDetailEffectChangesInnerEffectEntriesInner

genMoveDetailEffectChangesInnerEffectEntriesInner :: Int -> Gen MoveDetailEffectChangesInnerEffectEntriesInner
genMoveDetailEffectChangesInnerEffectEntriesInner n =
  MoveDetailEffectChangesInnerEffectEntriesInner
    <$> arbitrary -- moveDetailEffectChangesInnerEffectEntriesInnerEffect :: Text
    <*> arbitraryReduced n -- moveDetailEffectChangesInnerEffectEntriesInnerLanguage :: AbilityDetailPokemonInnerPokemon
  
instance Arbitrary MoveDetailMachinesInner where
  arbitrary = sized genMoveDetailMachinesInner

genMoveDetailMachinesInner :: Int -> Gen MoveDetailMachinesInner
genMoveDetailMachinesInner n =
  MoveDetailMachinesInner
    <$> arbitraryReduced n -- moveDetailMachinesInnerMachine :: MoveDetailMachinesInnerMachine
    <*> arbitraryReduced n -- moveDetailMachinesInnerVersionGroup :: AbilityDetailPokemonInnerPokemon
  
instance Arbitrary MoveDetailMachinesInnerMachine where
  arbitrary = sized genMoveDetailMachinesInnerMachine

genMoveDetailMachinesInnerMachine :: Int -> Gen MoveDetailMachinesInnerMachine
genMoveDetailMachinesInnerMachine n =
  MoveDetailMachinesInnerMachine
    <$> arbitrary -- moveDetailMachinesInnerMachineUrl :: Text
  
instance Arbitrary MoveDetailStatChangesInner where
  arbitrary = sized genMoveDetailStatChangesInner

genMoveDetailStatChangesInner :: Int -> Gen MoveDetailStatChangesInner
genMoveDetailStatChangesInner n =
  MoveDetailStatChangesInner
    <$> arbitrary -- moveDetailStatChangesInnerChange :: Int
    <*> arbitraryReduced n -- moveDetailStatChangesInnerStat :: AbilityDetailPokemonInnerPokemon
  
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
    <*> arbitraryReduced n -- moveLearnMethodDetailVersionGroups :: [AbilityDetailPokemonInnerPokemon]
  
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
    <*> arbitraryReduced n -- moveMetaAilmentDetailMoves :: [AbilityDetailPokemonInnerPokemon]
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
    <*> arbitraryReduced n -- moveMetaCategoryDetailMoves :: [AbilityDetailPokemonInnerPokemon]
  
instance Arbitrary MoveMetaCategorySummary where
  arbitrary = sized genMoveMetaCategorySummary

genMoveMetaCategorySummary :: Int -> Gen MoveMetaCategorySummary
genMoveMetaCategorySummary n =
  MoveMetaCategorySummary
    <$> arbitrary -- moveMetaCategorySummaryName :: Text
    <*> arbitrary -- moveMetaCategorySummaryUrl :: Text
  
instance Arbitrary MoveName where
  arbitrary = sized genMoveName

genMoveName :: Int -> Gen MoveName
genMoveName n =
  MoveName
    <$> arbitrary -- moveNameName :: Text
    <*> arbitraryReduced n -- moveNameLanguage :: LanguageSummary
  
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
    <*> arbitraryReduced n -- natureDetailBerries :: [BerrySummary]
    <*> arbitraryReduced n -- natureDetailPokeathlonStatChanges :: [NatureDetailPokeathlonStatChangesInner]
    <*> arbitraryReduced n -- natureDetailMoveBattleStylePreferences :: [NatureBattleStylePreference]
    <*> arbitraryReduced n -- natureDetailNames :: [NatureName]
  
instance Arbitrary NatureDetailPokeathlonStatChangesInner where
  arbitrary = sized genNatureDetailPokeathlonStatChangesInner

genNatureDetailPokeathlonStatChangesInner :: Int -> Gen NatureDetailPokeathlonStatChangesInner
genNatureDetailPokeathlonStatChangesInner n =
  NatureDetailPokeathlonStatChangesInner
    <$> arbitrary -- natureDetailPokeathlonStatChangesInnerMaxChange :: Int
    <*> arbitraryReduced n -- natureDetailPokeathlonStatChangesInnerPokeathlonStat :: AbilityDetailPokemonInnerPokemon
  
instance Arbitrary NatureName where
  arbitrary = sized genNatureName

genNatureName :: Int -> Gen NatureName
genNatureName n =
  NatureName
    <$> arbitrary -- natureNameName :: Text
    <*> arbitraryReduced n -- natureNameLanguage :: LanguageSummary
  
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
    <$> arbitraryReducedMaybe n -- paginatedAbilitySummaryListCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- paginatedAbilitySummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedAbilitySummaryListPrevious :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedAbilitySummaryListResults :: Maybe [AbilitySummary]
  
instance Arbitrary PaginatedBerryFirmnessSummaryList where
  arbitrary = sized genPaginatedBerryFirmnessSummaryList

genPaginatedBerryFirmnessSummaryList :: Int -> Gen PaginatedBerryFirmnessSummaryList
genPaginatedBerryFirmnessSummaryList n =
  PaginatedBerryFirmnessSummaryList
    <$> arbitraryReducedMaybe n -- paginatedBerryFirmnessSummaryListCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- paginatedBerryFirmnessSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedBerryFirmnessSummaryListPrevious :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedBerryFirmnessSummaryListResults :: Maybe [BerryFirmnessSummary]
  
instance Arbitrary PaginatedBerryFlavorSummaryList where
  arbitrary = sized genPaginatedBerryFlavorSummaryList

genPaginatedBerryFlavorSummaryList :: Int -> Gen PaginatedBerryFlavorSummaryList
genPaginatedBerryFlavorSummaryList n =
  PaginatedBerryFlavorSummaryList
    <$> arbitraryReducedMaybe n -- paginatedBerryFlavorSummaryListCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- paginatedBerryFlavorSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedBerryFlavorSummaryListPrevious :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedBerryFlavorSummaryListResults :: Maybe [BerryFlavorSummary]
  
instance Arbitrary PaginatedBerrySummaryList where
  arbitrary = sized genPaginatedBerrySummaryList

genPaginatedBerrySummaryList :: Int -> Gen PaginatedBerrySummaryList
genPaginatedBerrySummaryList n =
  PaginatedBerrySummaryList
    <$> arbitraryReducedMaybe n -- paginatedBerrySummaryListCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- paginatedBerrySummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedBerrySummaryListPrevious :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedBerrySummaryListResults :: Maybe [BerrySummary]
  
instance Arbitrary PaginatedCharacteristicSummaryList where
  arbitrary = sized genPaginatedCharacteristicSummaryList

genPaginatedCharacteristicSummaryList :: Int -> Gen PaginatedCharacteristicSummaryList
genPaginatedCharacteristicSummaryList n =
  PaginatedCharacteristicSummaryList
    <$> arbitraryReducedMaybe n -- paginatedCharacteristicSummaryListCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- paginatedCharacteristicSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedCharacteristicSummaryListPrevious :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedCharacteristicSummaryListResults :: Maybe [CharacteristicSummary]
  
instance Arbitrary PaginatedContestEffectSummaryList where
  arbitrary = sized genPaginatedContestEffectSummaryList

genPaginatedContestEffectSummaryList :: Int -> Gen PaginatedContestEffectSummaryList
genPaginatedContestEffectSummaryList n =
  PaginatedContestEffectSummaryList
    <$> arbitraryReducedMaybe n -- paginatedContestEffectSummaryListCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- paginatedContestEffectSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedContestEffectSummaryListPrevious :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedContestEffectSummaryListResults :: Maybe [ContestEffectSummary]
  
instance Arbitrary PaginatedContestTypeSummaryList where
  arbitrary = sized genPaginatedContestTypeSummaryList

genPaginatedContestTypeSummaryList :: Int -> Gen PaginatedContestTypeSummaryList
genPaginatedContestTypeSummaryList n =
  PaginatedContestTypeSummaryList
    <$> arbitraryReducedMaybe n -- paginatedContestTypeSummaryListCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- paginatedContestTypeSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedContestTypeSummaryListPrevious :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedContestTypeSummaryListResults :: Maybe [ContestTypeSummary]
  
instance Arbitrary PaginatedEggGroupSummaryList where
  arbitrary = sized genPaginatedEggGroupSummaryList

genPaginatedEggGroupSummaryList :: Int -> Gen PaginatedEggGroupSummaryList
genPaginatedEggGroupSummaryList n =
  PaginatedEggGroupSummaryList
    <$> arbitraryReducedMaybe n -- paginatedEggGroupSummaryListCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- paginatedEggGroupSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedEggGroupSummaryListPrevious :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedEggGroupSummaryListResults :: Maybe [EggGroupSummary]
  
instance Arbitrary PaginatedEncounterConditionSummaryList where
  arbitrary = sized genPaginatedEncounterConditionSummaryList

genPaginatedEncounterConditionSummaryList :: Int -> Gen PaginatedEncounterConditionSummaryList
genPaginatedEncounterConditionSummaryList n =
  PaginatedEncounterConditionSummaryList
    <$> arbitraryReducedMaybe n -- paginatedEncounterConditionSummaryListCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- paginatedEncounterConditionSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedEncounterConditionSummaryListPrevious :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedEncounterConditionSummaryListResults :: Maybe [EncounterConditionSummary]
  
instance Arbitrary PaginatedEncounterConditionValueSummaryList where
  arbitrary = sized genPaginatedEncounterConditionValueSummaryList

genPaginatedEncounterConditionValueSummaryList :: Int -> Gen PaginatedEncounterConditionValueSummaryList
genPaginatedEncounterConditionValueSummaryList n =
  PaginatedEncounterConditionValueSummaryList
    <$> arbitraryReducedMaybe n -- paginatedEncounterConditionValueSummaryListCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- paginatedEncounterConditionValueSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedEncounterConditionValueSummaryListPrevious :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedEncounterConditionValueSummaryListResults :: Maybe [EncounterConditionValueSummary]
  
instance Arbitrary PaginatedEncounterMethodSummaryList where
  arbitrary = sized genPaginatedEncounterMethodSummaryList

genPaginatedEncounterMethodSummaryList :: Int -> Gen PaginatedEncounterMethodSummaryList
genPaginatedEncounterMethodSummaryList n =
  PaginatedEncounterMethodSummaryList
    <$> arbitraryReducedMaybe n -- paginatedEncounterMethodSummaryListCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- paginatedEncounterMethodSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedEncounterMethodSummaryListPrevious :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedEncounterMethodSummaryListResults :: Maybe [EncounterMethodSummary]
  
instance Arbitrary PaginatedEvolutionChainSummaryList where
  arbitrary = sized genPaginatedEvolutionChainSummaryList

genPaginatedEvolutionChainSummaryList :: Int -> Gen PaginatedEvolutionChainSummaryList
genPaginatedEvolutionChainSummaryList n =
  PaginatedEvolutionChainSummaryList
    <$> arbitraryReducedMaybe n -- paginatedEvolutionChainSummaryListCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- paginatedEvolutionChainSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedEvolutionChainSummaryListPrevious :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedEvolutionChainSummaryListResults :: Maybe [EvolutionChainSummary]
  
instance Arbitrary PaginatedEvolutionTriggerSummaryList where
  arbitrary = sized genPaginatedEvolutionTriggerSummaryList

genPaginatedEvolutionTriggerSummaryList :: Int -> Gen PaginatedEvolutionTriggerSummaryList
genPaginatedEvolutionTriggerSummaryList n =
  PaginatedEvolutionTriggerSummaryList
    <$> arbitraryReducedMaybe n -- paginatedEvolutionTriggerSummaryListCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- paginatedEvolutionTriggerSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedEvolutionTriggerSummaryListPrevious :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedEvolutionTriggerSummaryListResults :: Maybe [EvolutionTriggerSummary]
  
instance Arbitrary PaginatedGenderSummaryList where
  arbitrary = sized genPaginatedGenderSummaryList

genPaginatedGenderSummaryList :: Int -> Gen PaginatedGenderSummaryList
genPaginatedGenderSummaryList n =
  PaginatedGenderSummaryList
    <$> arbitraryReducedMaybe n -- paginatedGenderSummaryListCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- paginatedGenderSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedGenderSummaryListPrevious :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedGenderSummaryListResults :: Maybe [GenderSummary]
  
instance Arbitrary PaginatedGenerationSummaryList where
  arbitrary = sized genPaginatedGenerationSummaryList

genPaginatedGenerationSummaryList :: Int -> Gen PaginatedGenerationSummaryList
genPaginatedGenerationSummaryList n =
  PaginatedGenerationSummaryList
    <$> arbitraryReducedMaybe n -- paginatedGenerationSummaryListCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- paginatedGenerationSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedGenerationSummaryListPrevious :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedGenerationSummaryListResults :: Maybe [GenerationSummary]
  
instance Arbitrary PaginatedGrowthRateSummaryList where
  arbitrary = sized genPaginatedGrowthRateSummaryList

genPaginatedGrowthRateSummaryList :: Int -> Gen PaginatedGrowthRateSummaryList
genPaginatedGrowthRateSummaryList n =
  PaginatedGrowthRateSummaryList
    <$> arbitraryReducedMaybe n -- paginatedGrowthRateSummaryListCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- paginatedGrowthRateSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedGrowthRateSummaryListPrevious :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedGrowthRateSummaryListResults :: Maybe [GrowthRateSummary]
  
instance Arbitrary PaginatedItemAttributeSummaryList where
  arbitrary = sized genPaginatedItemAttributeSummaryList

genPaginatedItemAttributeSummaryList :: Int -> Gen PaginatedItemAttributeSummaryList
genPaginatedItemAttributeSummaryList n =
  PaginatedItemAttributeSummaryList
    <$> arbitraryReducedMaybe n -- paginatedItemAttributeSummaryListCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- paginatedItemAttributeSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedItemAttributeSummaryListPrevious :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedItemAttributeSummaryListResults :: Maybe [ItemAttributeSummary]
  
instance Arbitrary PaginatedItemCategorySummaryList where
  arbitrary = sized genPaginatedItemCategorySummaryList

genPaginatedItemCategorySummaryList :: Int -> Gen PaginatedItemCategorySummaryList
genPaginatedItemCategorySummaryList n =
  PaginatedItemCategorySummaryList
    <$> arbitraryReducedMaybe n -- paginatedItemCategorySummaryListCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- paginatedItemCategorySummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedItemCategorySummaryListPrevious :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedItemCategorySummaryListResults :: Maybe [ItemCategorySummary]
  
instance Arbitrary PaginatedItemFlingEffectSummaryList where
  arbitrary = sized genPaginatedItemFlingEffectSummaryList

genPaginatedItemFlingEffectSummaryList :: Int -> Gen PaginatedItemFlingEffectSummaryList
genPaginatedItemFlingEffectSummaryList n =
  PaginatedItemFlingEffectSummaryList
    <$> arbitraryReducedMaybe n -- paginatedItemFlingEffectSummaryListCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- paginatedItemFlingEffectSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedItemFlingEffectSummaryListPrevious :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedItemFlingEffectSummaryListResults :: Maybe [ItemFlingEffectSummary]
  
instance Arbitrary PaginatedItemPocketSummaryList where
  arbitrary = sized genPaginatedItemPocketSummaryList

genPaginatedItemPocketSummaryList :: Int -> Gen PaginatedItemPocketSummaryList
genPaginatedItemPocketSummaryList n =
  PaginatedItemPocketSummaryList
    <$> arbitraryReducedMaybe n -- paginatedItemPocketSummaryListCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- paginatedItemPocketSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedItemPocketSummaryListPrevious :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedItemPocketSummaryListResults :: Maybe [ItemPocketSummary]
  
instance Arbitrary PaginatedItemSummaryList where
  arbitrary = sized genPaginatedItemSummaryList

genPaginatedItemSummaryList :: Int -> Gen PaginatedItemSummaryList
genPaginatedItemSummaryList n =
  PaginatedItemSummaryList
    <$> arbitraryReducedMaybe n -- paginatedItemSummaryListCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- paginatedItemSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedItemSummaryListPrevious :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedItemSummaryListResults :: Maybe [ItemSummary]
  
instance Arbitrary PaginatedLanguageSummaryList where
  arbitrary = sized genPaginatedLanguageSummaryList

genPaginatedLanguageSummaryList :: Int -> Gen PaginatedLanguageSummaryList
genPaginatedLanguageSummaryList n =
  PaginatedLanguageSummaryList
    <$> arbitraryReducedMaybe n -- paginatedLanguageSummaryListCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- paginatedLanguageSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedLanguageSummaryListPrevious :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedLanguageSummaryListResults :: Maybe [LanguageSummary]
  
instance Arbitrary PaginatedLocationAreaSummaryList where
  arbitrary = sized genPaginatedLocationAreaSummaryList

genPaginatedLocationAreaSummaryList :: Int -> Gen PaginatedLocationAreaSummaryList
genPaginatedLocationAreaSummaryList n =
  PaginatedLocationAreaSummaryList
    <$> arbitraryReducedMaybe n -- paginatedLocationAreaSummaryListCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- paginatedLocationAreaSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedLocationAreaSummaryListPrevious :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedLocationAreaSummaryListResults :: Maybe [LocationAreaSummary]
  
instance Arbitrary PaginatedLocationSummaryList where
  arbitrary = sized genPaginatedLocationSummaryList

genPaginatedLocationSummaryList :: Int -> Gen PaginatedLocationSummaryList
genPaginatedLocationSummaryList n =
  PaginatedLocationSummaryList
    <$> arbitraryReducedMaybe n -- paginatedLocationSummaryListCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- paginatedLocationSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedLocationSummaryListPrevious :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedLocationSummaryListResults :: Maybe [LocationSummary]
  
instance Arbitrary PaginatedMachineSummaryList where
  arbitrary = sized genPaginatedMachineSummaryList

genPaginatedMachineSummaryList :: Int -> Gen PaginatedMachineSummaryList
genPaginatedMachineSummaryList n =
  PaginatedMachineSummaryList
    <$> arbitraryReducedMaybe n -- paginatedMachineSummaryListCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- paginatedMachineSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedMachineSummaryListPrevious :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedMachineSummaryListResults :: Maybe [MachineSummary]
  
instance Arbitrary PaginatedMoveBattleStyleSummaryList where
  arbitrary = sized genPaginatedMoveBattleStyleSummaryList

genPaginatedMoveBattleStyleSummaryList :: Int -> Gen PaginatedMoveBattleStyleSummaryList
genPaginatedMoveBattleStyleSummaryList n =
  PaginatedMoveBattleStyleSummaryList
    <$> arbitraryReducedMaybe n -- paginatedMoveBattleStyleSummaryListCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- paginatedMoveBattleStyleSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedMoveBattleStyleSummaryListPrevious :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedMoveBattleStyleSummaryListResults :: Maybe [MoveBattleStyleSummary]
  
instance Arbitrary PaginatedMoveDamageClassSummaryList where
  arbitrary = sized genPaginatedMoveDamageClassSummaryList

genPaginatedMoveDamageClassSummaryList :: Int -> Gen PaginatedMoveDamageClassSummaryList
genPaginatedMoveDamageClassSummaryList n =
  PaginatedMoveDamageClassSummaryList
    <$> arbitraryReducedMaybe n -- paginatedMoveDamageClassSummaryListCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- paginatedMoveDamageClassSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedMoveDamageClassSummaryListPrevious :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedMoveDamageClassSummaryListResults :: Maybe [MoveDamageClassSummary]
  
instance Arbitrary PaginatedMoveLearnMethodSummaryList where
  arbitrary = sized genPaginatedMoveLearnMethodSummaryList

genPaginatedMoveLearnMethodSummaryList :: Int -> Gen PaginatedMoveLearnMethodSummaryList
genPaginatedMoveLearnMethodSummaryList n =
  PaginatedMoveLearnMethodSummaryList
    <$> arbitraryReducedMaybe n -- paginatedMoveLearnMethodSummaryListCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- paginatedMoveLearnMethodSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedMoveLearnMethodSummaryListPrevious :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedMoveLearnMethodSummaryListResults :: Maybe [MoveLearnMethodSummary]
  
instance Arbitrary PaginatedMoveMetaAilmentSummaryList where
  arbitrary = sized genPaginatedMoveMetaAilmentSummaryList

genPaginatedMoveMetaAilmentSummaryList :: Int -> Gen PaginatedMoveMetaAilmentSummaryList
genPaginatedMoveMetaAilmentSummaryList n =
  PaginatedMoveMetaAilmentSummaryList
    <$> arbitraryReducedMaybe n -- paginatedMoveMetaAilmentSummaryListCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- paginatedMoveMetaAilmentSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedMoveMetaAilmentSummaryListPrevious :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedMoveMetaAilmentSummaryListResults :: Maybe [MoveMetaAilmentSummary]
  
instance Arbitrary PaginatedMoveMetaCategorySummaryList where
  arbitrary = sized genPaginatedMoveMetaCategorySummaryList

genPaginatedMoveMetaCategorySummaryList :: Int -> Gen PaginatedMoveMetaCategorySummaryList
genPaginatedMoveMetaCategorySummaryList n =
  PaginatedMoveMetaCategorySummaryList
    <$> arbitraryReducedMaybe n -- paginatedMoveMetaCategorySummaryListCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- paginatedMoveMetaCategorySummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedMoveMetaCategorySummaryListPrevious :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedMoveMetaCategorySummaryListResults :: Maybe [MoveMetaCategorySummary]
  
instance Arbitrary PaginatedMoveSummaryList where
  arbitrary = sized genPaginatedMoveSummaryList

genPaginatedMoveSummaryList :: Int -> Gen PaginatedMoveSummaryList
genPaginatedMoveSummaryList n =
  PaginatedMoveSummaryList
    <$> arbitraryReducedMaybe n -- paginatedMoveSummaryListCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- paginatedMoveSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedMoveSummaryListPrevious :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedMoveSummaryListResults :: Maybe [MoveSummary]
  
instance Arbitrary PaginatedMoveTargetSummaryList where
  arbitrary = sized genPaginatedMoveTargetSummaryList

genPaginatedMoveTargetSummaryList :: Int -> Gen PaginatedMoveTargetSummaryList
genPaginatedMoveTargetSummaryList n =
  PaginatedMoveTargetSummaryList
    <$> arbitraryReducedMaybe n -- paginatedMoveTargetSummaryListCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- paginatedMoveTargetSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedMoveTargetSummaryListPrevious :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedMoveTargetSummaryListResults :: Maybe [MoveTargetSummary]
  
instance Arbitrary PaginatedNatureSummaryList where
  arbitrary = sized genPaginatedNatureSummaryList

genPaginatedNatureSummaryList :: Int -> Gen PaginatedNatureSummaryList
genPaginatedNatureSummaryList n =
  PaginatedNatureSummaryList
    <$> arbitraryReducedMaybe n -- paginatedNatureSummaryListCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- paginatedNatureSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedNatureSummaryListPrevious :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedNatureSummaryListResults :: Maybe [NatureSummary]
  
instance Arbitrary PaginatedPalParkAreaSummaryList where
  arbitrary = sized genPaginatedPalParkAreaSummaryList

genPaginatedPalParkAreaSummaryList :: Int -> Gen PaginatedPalParkAreaSummaryList
genPaginatedPalParkAreaSummaryList n =
  PaginatedPalParkAreaSummaryList
    <$> arbitraryReducedMaybe n -- paginatedPalParkAreaSummaryListCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- paginatedPalParkAreaSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedPalParkAreaSummaryListPrevious :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedPalParkAreaSummaryListResults :: Maybe [PalParkAreaSummary]
  
instance Arbitrary PaginatedPokeathlonStatSummaryList where
  arbitrary = sized genPaginatedPokeathlonStatSummaryList

genPaginatedPokeathlonStatSummaryList :: Int -> Gen PaginatedPokeathlonStatSummaryList
genPaginatedPokeathlonStatSummaryList n =
  PaginatedPokeathlonStatSummaryList
    <$> arbitraryReducedMaybe n -- paginatedPokeathlonStatSummaryListCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- paginatedPokeathlonStatSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedPokeathlonStatSummaryListPrevious :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedPokeathlonStatSummaryListResults :: Maybe [PokeathlonStatSummary]
  
instance Arbitrary PaginatedPokedexSummaryList where
  arbitrary = sized genPaginatedPokedexSummaryList

genPaginatedPokedexSummaryList :: Int -> Gen PaginatedPokedexSummaryList
genPaginatedPokedexSummaryList n =
  PaginatedPokedexSummaryList
    <$> arbitraryReducedMaybe n -- paginatedPokedexSummaryListCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- paginatedPokedexSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedPokedexSummaryListPrevious :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedPokedexSummaryListResults :: Maybe [PokedexSummary]
  
instance Arbitrary PaginatedPokemonColorSummaryList where
  arbitrary = sized genPaginatedPokemonColorSummaryList

genPaginatedPokemonColorSummaryList :: Int -> Gen PaginatedPokemonColorSummaryList
genPaginatedPokemonColorSummaryList n =
  PaginatedPokemonColorSummaryList
    <$> arbitraryReducedMaybe n -- paginatedPokemonColorSummaryListCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- paginatedPokemonColorSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedPokemonColorSummaryListPrevious :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedPokemonColorSummaryListResults :: Maybe [PokemonColorSummary]
  
instance Arbitrary PaginatedPokemonFormSummaryList where
  arbitrary = sized genPaginatedPokemonFormSummaryList

genPaginatedPokemonFormSummaryList :: Int -> Gen PaginatedPokemonFormSummaryList
genPaginatedPokemonFormSummaryList n =
  PaginatedPokemonFormSummaryList
    <$> arbitraryReducedMaybe n -- paginatedPokemonFormSummaryListCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- paginatedPokemonFormSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedPokemonFormSummaryListPrevious :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedPokemonFormSummaryListResults :: Maybe [PokemonFormSummary]
  
instance Arbitrary PaginatedPokemonHabitatSummaryList where
  arbitrary = sized genPaginatedPokemonHabitatSummaryList

genPaginatedPokemonHabitatSummaryList :: Int -> Gen PaginatedPokemonHabitatSummaryList
genPaginatedPokemonHabitatSummaryList n =
  PaginatedPokemonHabitatSummaryList
    <$> arbitraryReducedMaybe n -- paginatedPokemonHabitatSummaryListCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- paginatedPokemonHabitatSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedPokemonHabitatSummaryListPrevious :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedPokemonHabitatSummaryListResults :: Maybe [PokemonHabitatSummary]
  
instance Arbitrary PaginatedPokemonShapeSummaryList where
  arbitrary = sized genPaginatedPokemonShapeSummaryList

genPaginatedPokemonShapeSummaryList :: Int -> Gen PaginatedPokemonShapeSummaryList
genPaginatedPokemonShapeSummaryList n =
  PaginatedPokemonShapeSummaryList
    <$> arbitraryReducedMaybe n -- paginatedPokemonShapeSummaryListCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- paginatedPokemonShapeSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedPokemonShapeSummaryListPrevious :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedPokemonShapeSummaryListResults :: Maybe [PokemonShapeSummary]
  
instance Arbitrary PaginatedPokemonSpeciesSummaryList where
  arbitrary = sized genPaginatedPokemonSpeciesSummaryList

genPaginatedPokemonSpeciesSummaryList :: Int -> Gen PaginatedPokemonSpeciesSummaryList
genPaginatedPokemonSpeciesSummaryList n =
  PaginatedPokemonSpeciesSummaryList
    <$> arbitraryReducedMaybe n -- paginatedPokemonSpeciesSummaryListCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- paginatedPokemonSpeciesSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedPokemonSpeciesSummaryListPrevious :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedPokemonSpeciesSummaryListResults :: Maybe [PokemonSpeciesSummary]
  
instance Arbitrary PaginatedPokemonSummaryList where
  arbitrary = sized genPaginatedPokemonSummaryList

genPaginatedPokemonSummaryList :: Int -> Gen PaginatedPokemonSummaryList
genPaginatedPokemonSummaryList n =
  PaginatedPokemonSummaryList
    <$> arbitraryReducedMaybe n -- paginatedPokemonSummaryListCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- paginatedPokemonSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedPokemonSummaryListPrevious :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedPokemonSummaryListResults :: Maybe [PokemonSummary]
  
instance Arbitrary PaginatedRegionSummaryList where
  arbitrary = sized genPaginatedRegionSummaryList

genPaginatedRegionSummaryList :: Int -> Gen PaginatedRegionSummaryList
genPaginatedRegionSummaryList n =
  PaginatedRegionSummaryList
    <$> arbitraryReducedMaybe n -- paginatedRegionSummaryListCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- paginatedRegionSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedRegionSummaryListPrevious :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedRegionSummaryListResults :: Maybe [RegionSummary]
  
instance Arbitrary PaginatedStatSummaryList where
  arbitrary = sized genPaginatedStatSummaryList

genPaginatedStatSummaryList :: Int -> Gen PaginatedStatSummaryList
genPaginatedStatSummaryList n =
  PaginatedStatSummaryList
    <$> arbitraryReducedMaybe n -- paginatedStatSummaryListCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- paginatedStatSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedStatSummaryListPrevious :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedStatSummaryListResults :: Maybe [StatSummary]
  
instance Arbitrary PaginatedSuperContestEffectSummaryList where
  arbitrary = sized genPaginatedSuperContestEffectSummaryList

genPaginatedSuperContestEffectSummaryList :: Int -> Gen PaginatedSuperContestEffectSummaryList
genPaginatedSuperContestEffectSummaryList n =
  PaginatedSuperContestEffectSummaryList
    <$> arbitraryReducedMaybe n -- paginatedSuperContestEffectSummaryListCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- paginatedSuperContestEffectSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedSuperContestEffectSummaryListPrevious :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedSuperContestEffectSummaryListResults :: Maybe [SuperContestEffectSummary]
  
instance Arbitrary PaginatedTypeSummaryList where
  arbitrary = sized genPaginatedTypeSummaryList

genPaginatedTypeSummaryList :: Int -> Gen PaginatedTypeSummaryList
genPaginatedTypeSummaryList n =
  PaginatedTypeSummaryList
    <$> arbitraryReducedMaybe n -- paginatedTypeSummaryListCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- paginatedTypeSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedTypeSummaryListPrevious :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedTypeSummaryListResults :: Maybe [TypeSummary]
  
instance Arbitrary PaginatedVersionGroupSummaryList where
  arbitrary = sized genPaginatedVersionGroupSummaryList

genPaginatedVersionGroupSummaryList :: Int -> Gen PaginatedVersionGroupSummaryList
genPaginatedVersionGroupSummaryList n =
  PaginatedVersionGroupSummaryList
    <$> arbitraryReducedMaybe n -- paginatedVersionGroupSummaryListCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- paginatedVersionGroupSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedVersionGroupSummaryListPrevious :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedVersionGroupSummaryListResults :: Maybe [VersionGroupSummary]
  
instance Arbitrary PaginatedVersionSummaryList where
  arbitrary = sized genPaginatedVersionSummaryList

genPaginatedVersionSummaryList :: Int -> Gen PaginatedVersionSummaryList
genPaginatedVersionSummaryList n =
  PaginatedVersionSummaryList
    <$> arbitraryReducedMaybe n -- paginatedVersionSummaryListCount :: Maybe Int
    <*> arbitraryReducedMaybe n -- paginatedVersionSummaryListNext :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedVersionSummaryListPrevious :: Maybe Text
    <*> arbitraryReducedMaybe n -- paginatedVersionSummaryListResults :: Maybe [VersionSummary]
  
instance Arbitrary PalParkAreaDetail where
  arbitrary = sized genPalParkAreaDetail

genPalParkAreaDetail :: Int -> Gen PalParkAreaDetail
genPalParkAreaDetail n =
  PalParkAreaDetail
    <$> arbitrary -- palParkAreaDetailId :: Int
    <*> arbitrary -- palParkAreaDetailName :: Text
    <*> arbitraryReduced n -- palParkAreaDetailNames :: [PalParkAreaName]
    <*> arbitraryReduced n -- palParkAreaDetailPokemonEncounters :: [PalParkAreaDetailPokemonEncountersInner]
  
instance Arbitrary PalParkAreaDetailPokemonEncountersInner where
  arbitrary = sized genPalParkAreaDetailPokemonEncountersInner

genPalParkAreaDetailPokemonEncountersInner :: Int -> Gen PalParkAreaDetailPokemonEncountersInner
genPalParkAreaDetailPokemonEncountersInner n =
  PalParkAreaDetailPokemonEncountersInner
    <$> arbitrary -- palParkAreaDetailPokemonEncountersInnerBaseScore :: Int
    <*> arbitraryReduced n -- palParkAreaDetailPokemonEncountersInnerPokemonSpecies :: AbilityDetailPokemonInnerPokemon
    <*> arbitrary -- palParkAreaDetailPokemonEncountersInnerRate :: Int
  
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
  
instance Arbitrary PokeathlonStatDetail where
  arbitrary = sized genPokeathlonStatDetail

genPokeathlonStatDetail :: Int -> Gen PokeathlonStatDetail
genPokeathlonStatDetail n =
  PokeathlonStatDetail
    <$> arbitrary -- pokeathlonStatDetailId :: Int
    <*> arbitrary -- pokeathlonStatDetailName :: Text
    <*> arbitraryReduced n -- pokeathlonStatDetailAffectingNatures :: PokeathlonStatDetailAffectingNatures
    <*> arbitraryReduced n -- pokeathlonStatDetailNames :: [PokeathlonStatName]
  
instance Arbitrary PokeathlonStatDetailAffectingNatures where
  arbitrary = sized genPokeathlonStatDetailAffectingNatures

genPokeathlonStatDetailAffectingNatures :: Int -> Gen PokeathlonStatDetailAffectingNatures
genPokeathlonStatDetailAffectingNatures n =
  PokeathlonStatDetailAffectingNatures
    <$> arbitraryReduced n -- pokeathlonStatDetailAffectingNaturesDecrease :: [PokeathlonStatDetailAffectingNaturesDecreaseInner]
    <*> arbitraryReduced n -- pokeathlonStatDetailAffectingNaturesIncrease :: [PokeathlonStatDetailAffectingNaturesIncreaseInner]
  
instance Arbitrary PokeathlonStatDetailAffectingNaturesDecreaseInner where
  arbitrary = sized genPokeathlonStatDetailAffectingNaturesDecreaseInner

genPokeathlonStatDetailAffectingNaturesDecreaseInner :: Int -> Gen PokeathlonStatDetailAffectingNaturesDecreaseInner
genPokeathlonStatDetailAffectingNaturesDecreaseInner n =
  PokeathlonStatDetailAffectingNaturesDecreaseInner
    <$> arbitrary -- pokeathlonStatDetailAffectingNaturesDecreaseInnerMaxChange :: Int
    <*> arbitraryReduced n -- pokeathlonStatDetailAffectingNaturesDecreaseInnerNature :: AbilityDetailPokemonInnerPokemon
  
instance Arbitrary PokeathlonStatDetailAffectingNaturesIncreaseInner where
  arbitrary = sized genPokeathlonStatDetailAffectingNaturesIncreaseInner

genPokeathlonStatDetailAffectingNaturesIncreaseInner :: Int -> Gen PokeathlonStatDetailAffectingNaturesIncreaseInner
genPokeathlonStatDetailAffectingNaturesIncreaseInner n =
  PokeathlonStatDetailAffectingNaturesIncreaseInner
    <$> arbitrary -- pokeathlonStatDetailAffectingNaturesIncreaseInnerMaxChange :: Int
    <*> arbitraryReduced n -- pokeathlonStatDetailAffectingNaturesIncreaseInnerNature :: AbilityDetailPokemonInnerPokemon
  
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
    <*> arbitraryReduced n -- pokedexDetailPokemonEntries :: [PokedexDetailPokemonEntriesInner]
    <*> arbitraryReduced n -- pokedexDetailRegion :: RegionSummary
    <*> arbitraryReduced n -- pokedexDetailVersionGroups :: [AbilityDetailPokemonInnerPokemon]
  
instance Arbitrary PokedexDetailPokemonEntriesInner where
  arbitrary = sized genPokedexDetailPokemonEntriesInner

genPokedexDetailPokemonEntriesInner :: Int -> Gen PokedexDetailPokemonEntriesInner
genPokedexDetailPokemonEntriesInner n =
  PokedexDetailPokemonEntriesInner
    <$> arbitrary -- pokedexDetailPokemonEntriesInnerEntryNumber :: Int
    <*> arbitraryReduced n -- pokedexDetailPokemonEntriesInnerPokemonSpecies :: AbilityDetailPokemonInnerPokemon
  
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
    <*> arbitraryReduced n -- pokemonDetailAbilities :: [PokemonDetailAbilitiesInner]
    <*> arbitraryReduced n -- pokemonDetailPastAbilities :: [PokemonDetailPastAbilitiesInner]
    <*> arbitraryReduced n -- pokemonDetailForms :: [PokemonFormSummary]
    <*> arbitraryReduced n -- pokemonDetailGameIndices :: [PokemonGameIndex]
    <*> arbitraryReduced n -- pokemonDetailHeldItems :: PokemonDetailHeldItems
    <*> arbitrary -- pokemonDetailLocationAreaEncounters :: Text
    <*> arbitraryReduced n -- pokemonDetailMoves :: [PokemonDetailMovesInner]
    <*> arbitraryReduced n -- pokemonDetailSpecies :: PokemonSpeciesSummary
    <*> arbitraryReduced n -- pokemonDetailSprites :: PokemonDetailSprites
    <*> arbitraryReduced n -- pokemonDetailCries :: PokemonDetailCries
    <*> arbitraryReduced n -- pokemonDetailStats :: [PokemonStat]
    <*> arbitraryReduced n -- pokemonDetailTypes :: [PokemonDetailTypesInner]
    <*> arbitraryReduced n -- pokemonDetailPastTypes :: [PokemonDetailPastTypesInner]
  
instance Arbitrary PokemonDetailAbilitiesInner where
  arbitrary = sized genPokemonDetailAbilitiesInner

genPokemonDetailAbilitiesInner :: Int -> Gen PokemonDetailAbilitiesInner
genPokemonDetailAbilitiesInner n =
  PokemonDetailAbilitiesInner
    <$> arbitraryReduced n -- pokemonDetailAbilitiesInnerAbility :: AbilityDetailPokemonInnerPokemon
    <*> arbitrary -- pokemonDetailAbilitiesInnerIsHidden :: Bool
    <*> arbitrary -- pokemonDetailAbilitiesInnerSlot :: Int
  
instance Arbitrary PokemonDetailCries where
  arbitrary = sized genPokemonDetailCries

genPokemonDetailCries :: Int -> Gen PokemonDetailCries
genPokemonDetailCries n =
  PokemonDetailCries
    <$> arbitrary -- pokemonDetailCriesLatest :: Text
    <*> arbitrary -- pokemonDetailCriesLegacy :: Text
  
instance Arbitrary PokemonDetailHeldItems where
  arbitrary = sized genPokemonDetailHeldItems

genPokemonDetailHeldItems :: Int -> Gen PokemonDetailHeldItems
genPokemonDetailHeldItems n =
  PokemonDetailHeldItems
    <$> arbitraryReduced n -- pokemonDetailHeldItemsItem :: AbilityDetailPokemonInnerPokemon
    <*> arbitraryReduced n -- pokemonDetailHeldItemsVersionDetails :: [ItemDetailHeldByPokemonInnerVersionDetailsInner]
  
instance Arbitrary PokemonDetailMovesInner where
  arbitrary = sized genPokemonDetailMovesInner

genPokemonDetailMovesInner :: Int -> Gen PokemonDetailMovesInner
genPokemonDetailMovesInner n =
  PokemonDetailMovesInner
    <$> arbitraryReduced n -- pokemonDetailMovesInnerMove :: AbilityDetailPokemonInnerPokemon
    <*> arbitraryReduced n -- pokemonDetailMovesInnerVersionGroupDetails :: [PokemonDetailMovesInnerVersionGroupDetailsInner]
  
instance Arbitrary PokemonDetailMovesInnerVersionGroupDetailsInner where
  arbitrary = sized genPokemonDetailMovesInnerVersionGroupDetailsInner

genPokemonDetailMovesInnerVersionGroupDetailsInner :: Int -> Gen PokemonDetailMovesInnerVersionGroupDetailsInner
genPokemonDetailMovesInnerVersionGroupDetailsInner n =
  PokemonDetailMovesInnerVersionGroupDetailsInner
    <$> arbitrary -- pokemonDetailMovesInnerVersionGroupDetailsInnerLevelLearnedAt :: Int
    <*> arbitraryReduced n -- pokemonDetailMovesInnerVersionGroupDetailsInnerMoveLearnMethod :: AbilityDetailPokemonInnerPokemon
    <*> arbitraryReduced n -- pokemonDetailMovesInnerVersionGroupDetailsInnerVersionGroup :: AbilityDetailPokemonInnerPokemon
  
instance Arbitrary PokemonDetailPastAbilitiesInner where
  arbitrary = sized genPokemonDetailPastAbilitiesInner

genPokemonDetailPastAbilitiesInner :: Int -> Gen PokemonDetailPastAbilitiesInner
genPokemonDetailPastAbilitiesInner n =
  PokemonDetailPastAbilitiesInner
    <$> arbitraryReduced n -- pokemonDetailPastAbilitiesInnerAbilities :: [PokemonDetailAbilitiesInner]
    <*> arbitraryReduced n -- pokemonDetailPastAbilitiesInnerGeneration :: AbilityDetailPokemonInnerPokemon
  
instance Arbitrary PokemonDetailPastTypesInner where
  arbitrary = sized genPokemonDetailPastTypesInner

genPokemonDetailPastTypesInner :: Int -> Gen PokemonDetailPastTypesInner
genPokemonDetailPastTypesInner n =
  PokemonDetailPastTypesInner
    <$> arbitraryReduced n -- pokemonDetailPastTypesInnerGeneration :: AbilityDetailPokemonInnerPokemon
    <*> arbitraryReduced n -- pokemonDetailPastTypesInnerTypes :: [PokemonDetailTypesInner]
  
instance Arbitrary PokemonDetailSprites where
  arbitrary = sized genPokemonDetailSprites

genPokemonDetailSprites :: Int -> Gen PokemonDetailSprites
genPokemonDetailSprites n =
  PokemonDetailSprites
    <$> arbitraryReducedMaybe n -- pokemonDetailSpritesFrontDefault :: Maybe Text
  
instance Arbitrary PokemonDetailTypesInner where
  arbitrary = sized genPokemonDetailTypesInner

genPokemonDetailTypesInner :: Int -> Gen PokemonDetailTypesInner
genPokemonDetailTypesInner n =
  PokemonDetailTypesInner
    <$> arbitrary -- pokemonDetailTypesInnerSlot :: Int
    <*> arbitraryReduced n -- pokemonDetailTypesInnerType :: AbilityDetailPokemonInnerPokemon
  
instance Arbitrary PokemonDexEntry where
  arbitrary = sized genPokemonDexEntry

genPokemonDexEntry :: Int -> Gen PokemonDexEntry
genPokemonDexEntry n =
  PokemonDexEntry
    <$> arbitrary -- pokemonDexEntryEntryNumber :: Int
    <*> arbitraryReduced n -- pokemonDexEntryPokedex :: PokedexSummary
  
instance Arbitrary PokemonEncountersRetrieve200ResponseInner where
  arbitrary = sized genPokemonEncountersRetrieve200ResponseInner

genPokemonEncountersRetrieve200ResponseInner :: Int -> Gen PokemonEncountersRetrieve200ResponseInner
genPokemonEncountersRetrieve200ResponseInner n =
  PokemonEncountersRetrieve200ResponseInner
    <$> arbitraryReduced n -- pokemonEncountersRetrieve200ResponseInnerLocationArea :: PokemonEncountersRetrieve200ResponseInnerLocationArea
    <*> arbitraryReduced n -- pokemonEncountersRetrieve200ResponseInnerVersionDetails :: [PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner]
  
instance Arbitrary PokemonEncountersRetrieve200ResponseInnerLocationArea where
  arbitrary = sized genPokemonEncountersRetrieve200ResponseInnerLocationArea

genPokemonEncountersRetrieve200ResponseInnerLocationArea :: Int -> Gen PokemonEncountersRetrieve200ResponseInnerLocationArea
genPokemonEncountersRetrieve200ResponseInnerLocationArea n =
  PokemonEncountersRetrieve200ResponseInnerLocationArea
    <$> arbitrary -- pokemonEncountersRetrieve200ResponseInnerLocationAreaName :: Text
    <*> arbitrary -- pokemonEncountersRetrieve200ResponseInnerLocationAreaUrl :: Text
  
instance Arbitrary PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner where
  arbitrary = sized genPokemonEncountersRetrieve200ResponseInnerVersionDetailsInner

genPokemonEncountersRetrieve200ResponseInnerVersionDetailsInner :: Int -> Gen PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner
genPokemonEncountersRetrieve200ResponseInnerVersionDetailsInner n =
  PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner
    <$> arbitraryReduced n -- pokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetails :: [PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner]
    <*> arbitrary -- pokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerMaxChance :: Double
    <*> arbitraryReduced n -- pokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion :: PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion
  
instance Arbitrary PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner where
  arbitrary = sized genPokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner

genPokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner :: Int -> Gen PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner
genPokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner n =
  PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner
    <$> arbitrary -- pokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerChance :: Double
    <*> arbitraryReduced n -- pokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValues :: [PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner]
    <*> arbitrary -- pokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMaxLevel :: Double
    <*> arbitraryReduced n -- pokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod :: PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod
    <*> arbitrary -- pokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMinLevel :: Double
  
instance Arbitrary PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner where
  arbitrary = sized genPokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner

genPokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner :: Int -> Gen PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner
genPokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner n =
  PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner
    <$> arbitrary -- pokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInnerName :: Text
    <*> arbitrary -- pokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInnerUrl :: Text
  
instance Arbitrary PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod where
  arbitrary = sized genPokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod

genPokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod :: Int -> Gen PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod
genPokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod n =
  PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod
    <$> arbitrary -- pokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethodName :: Text
    <*> arbitrary -- pokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethodUrl :: Text
  
instance Arbitrary PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion where
  arbitrary = sized genPokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion

genPokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion :: Int -> Gen PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion
genPokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion n =
  PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion
    <$> arbitrary -- pokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersionName :: Text
    <*> arbitrary -- pokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersionUrl :: Text
  
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
    <*> arbitraryReduced n -- pokemonFormDetailSprites :: PokemonFormDetailSprites
    <*> arbitraryReduced n -- pokemonFormDetailVersionGroup :: VersionGroupSummary
    <*> arbitraryReduced n -- pokemonFormDetailFormNames :: [PokemonFormDetailFormNamesInner]
    <*> arbitraryReduced n -- pokemonFormDetailNames :: [PokemonFormDetailFormNamesInner]
    <*> arbitraryReduced n -- pokemonFormDetailTypes :: [PokemonDetailTypesInner]
  
instance Arbitrary PokemonFormDetailFormNamesInner where
  arbitrary = sized genPokemonFormDetailFormNamesInner

genPokemonFormDetailFormNamesInner :: Int -> Gen PokemonFormDetailFormNamesInner
genPokemonFormDetailFormNamesInner n =
  PokemonFormDetailFormNamesInner
    <$> arbitraryReduced n -- pokemonFormDetailFormNamesInnerLanguage :: AbilityDetailPokemonInnerPokemon
    <*> arbitrary -- pokemonFormDetailFormNamesInnerName :: Text
  
instance Arbitrary PokemonFormDetailSprites where
  arbitrary = sized genPokemonFormDetailSprites

genPokemonFormDetailSprites :: Int -> Gen PokemonFormDetailSprites
genPokemonFormDetailSprites n =
  PokemonFormDetailSprites
    <$> arbitraryReducedMaybe n -- pokemonFormDetailSpritesDefault :: Maybe Text
  
instance Arbitrary PokemonFormSummary where
  arbitrary = sized genPokemonFormSummary

genPokemonFormSummary :: Int -> Gen PokemonFormSummary
genPokemonFormSummary n =
  PokemonFormSummary
    <$> arbitrary -- pokemonFormSummaryName :: Text
    <*> arbitrary -- pokemonFormSummaryUrl :: Text
  
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
  
instance Arbitrary PokemonShapeDetail where
  arbitrary = sized genPokemonShapeDetail

genPokemonShapeDetail :: Int -> Gen PokemonShapeDetail
genPokemonShapeDetail n =
  PokemonShapeDetail
    <$> arbitrary -- pokemonShapeDetailId :: Int
    <*> arbitrary -- pokemonShapeDetailName :: Text
    <*> arbitraryReduced n -- pokemonShapeDetailAwesomeNames :: [PokemonShapeDetailAwesomeNamesInner]
    <*> arbitraryReduced n -- pokemonShapeDetailNames :: [PokemonShapeDetailNamesInner]
    <*> arbitraryReduced n -- pokemonShapeDetailPokemonSpecies :: [PokemonSpeciesSummary]
  
instance Arbitrary PokemonShapeDetailAwesomeNamesInner where
  arbitrary = sized genPokemonShapeDetailAwesomeNamesInner

genPokemonShapeDetailAwesomeNamesInner :: Int -> Gen PokemonShapeDetailAwesomeNamesInner
genPokemonShapeDetailAwesomeNamesInner n =
  PokemonShapeDetailAwesomeNamesInner
    <$> arbitrary -- pokemonShapeDetailAwesomeNamesInnerAwesomeName :: Text
    <*> arbitraryReduced n -- pokemonShapeDetailAwesomeNamesInnerLanguage :: AbilityDetailPokemonInnerPokemon
  
instance Arbitrary PokemonShapeDetailNamesInner where
  arbitrary = sized genPokemonShapeDetailNamesInner

genPokemonShapeDetailNamesInner :: Int -> Gen PokemonShapeDetailNamesInner
genPokemonShapeDetailNamesInner n =
  PokemonShapeDetailNamesInner
    <$> arbitrary -- pokemonShapeDetailNamesInnerUrl :: Text
    <*> arbitrary -- pokemonShapeDetailNamesInnerName :: Text
  
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
    <*> arbitraryReduced n -- pokemonSpeciesDetailEggGroups :: [AbilityDetailPokemonInnerPokemon]
    <*> arbitraryReduced n -- pokemonSpeciesDetailColor :: PokemonColorSummary
    <*> arbitraryReduced n -- pokemonSpeciesDetailShape :: PokemonShapeSummary
    <*> arbitraryReduced n -- pokemonSpeciesDetailEvolvesFromSpecies :: PokemonSpeciesSummary
    <*> arbitraryReduced n -- pokemonSpeciesDetailEvolutionChain :: EvolutionChainSummary
    <*> arbitraryReduced n -- pokemonSpeciesDetailHabitat :: PokemonHabitatSummary
    <*> arbitraryReduced n -- pokemonSpeciesDetailGeneration :: GenerationSummary
    <*> arbitraryReduced n -- pokemonSpeciesDetailNames :: [PokemonFormDetailFormNamesInner]
    <*> arbitraryReduced n -- pokemonSpeciesDetailPalParkEncounters :: [PokemonSpeciesDetailPalParkEncountersInner]
    <*> arbitraryReduced n -- pokemonSpeciesDetailFormDescriptions :: [PokemonSpeciesDescription]
    <*> arbitraryReduced n -- pokemonSpeciesDetailFlavorTextEntries :: [PokemonSpeciesFlavorText]
    <*> arbitraryReduced n -- pokemonSpeciesDetailGenera :: [PokemonSpeciesDetailGeneraInner]
    <*> arbitraryReduced n -- pokemonSpeciesDetailVarieties :: [PokemonSpeciesDetailVarietiesInner]
  
instance Arbitrary PokemonSpeciesDetailGeneraInner where
  arbitrary = sized genPokemonSpeciesDetailGeneraInner

genPokemonSpeciesDetailGeneraInner :: Int -> Gen PokemonSpeciesDetailGeneraInner
genPokemonSpeciesDetailGeneraInner n =
  PokemonSpeciesDetailGeneraInner
    <$> arbitrary -- pokemonSpeciesDetailGeneraInnerGenus :: Text
    <*> arbitraryReduced n -- pokemonSpeciesDetailGeneraInnerLanguage :: AbilityDetailPokemonInnerPokemon
  
instance Arbitrary PokemonSpeciesDetailPalParkEncountersInner where
  arbitrary = sized genPokemonSpeciesDetailPalParkEncountersInner

genPokemonSpeciesDetailPalParkEncountersInner :: Int -> Gen PokemonSpeciesDetailPalParkEncountersInner
genPokemonSpeciesDetailPalParkEncountersInner n =
  PokemonSpeciesDetailPalParkEncountersInner
    <$> arbitraryReduced n -- pokemonSpeciesDetailPalParkEncountersInnerArea :: AbilityDetailPokemonInnerPokemon
    <*> arbitrary -- pokemonSpeciesDetailPalParkEncountersInnerBaseScore :: Int
    <*> arbitrary -- pokemonSpeciesDetailPalParkEncountersInnerRate :: Int
  
instance Arbitrary PokemonSpeciesDetailVarietiesInner where
  arbitrary = sized genPokemonSpeciesDetailVarietiesInner

genPokemonSpeciesDetailVarietiesInner :: Int -> Gen PokemonSpeciesDetailVarietiesInner
genPokemonSpeciesDetailVarietiesInner n =
  PokemonSpeciesDetailVarietiesInner
    <$> arbitrary -- pokemonSpeciesDetailVarietiesInnerIsDefault :: Bool
    <*> arbitraryReduced n -- pokemonSpeciesDetailVarietiesInnerPokemon :: AbilityDetailPokemonInnerPokemon
  
instance Arbitrary PokemonSpeciesFlavorText where
  arbitrary = sized genPokemonSpeciesFlavorText

genPokemonSpeciesFlavorText :: Int -> Gen PokemonSpeciesFlavorText
genPokemonSpeciesFlavorText n =
  PokemonSpeciesFlavorText
    <$> arbitrary -- pokemonSpeciesFlavorTextFlavorText :: Text
    <*> arbitraryReduced n -- pokemonSpeciesFlavorTextLanguage :: LanguageSummary
    <*> arbitraryReduced n -- pokemonSpeciesFlavorTextVersion :: VersionSummary
  
instance Arbitrary PokemonSpeciesSummary where
  arbitrary = sized genPokemonSpeciesSummary

genPokemonSpeciesSummary :: Int -> Gen PokemonSpeciesSummary
genPokemonSpeciesSummary n =
  PokemonSpeciesSummary
    <$> arbitrary -- pokemonSpeciesSummaryName :: Text
    <*> arbitrary -- pokemonSpeciesSummaryUrl :: Text
  
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
    <*> arbitraryReduced n -- regionDetailVersionGroups :: [AbilityDetailPokemonInnerPokemon]
  
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
  
instance Arbitrary StatDetail where
  arbitrary = sized genStatDetail

genStatDetail :: Int -> Gen StatDetail
genStatDetail n =
  StatDetail
    <$> arbitrary -- statDetailId :: Int
    <*> arbitrary -- statDetailName :: Text
    <*> arbitrary -- statDetailGameIndex :: Int
    <*> arbitraryReducedMaybe n -- statDetailIsBattleOnly :: Maybe Bool
    <*> arbitraryReduced n -- statDetailAffectingMoves :: StatDetailAffectingMoves
    <*> arbitraryReduced n -- statDetailAffectingNatures :: StatDetailAffectingNatures
    <*> arbitraryReduced n -- statDetailCharacteristics :: [CharacteristicSummary]
    <*> arbitraryReduced n -- statDetailMoveDamageClass :: MoveDamageClassSummary
    <*> arbitraryReduced n -- statDetailNames :: [StatName]
  
instance Arbitrary StatDetailAffectingMoves where
  arbitrary = sized genStatDetailAffectingMoves

genStatDetailAffectingMoves :: Int -> Gen StatDetailAffectingMoves
genStatDetailAffectingMoves n =
  StatDetailAffectingMoves
    <$> arbitraryReduced n -- statDetailAffectingMovesIncrease :: [StatDetailAffectingMovesIncreaseInner]
    <*> arbitraryReduced n -- statDetailAffectingMovesDecrease :: [StatDetailAffectingMovesIncreaseInner]
  
instance Arbitrary StatDetailAffectingMovesIncreaseInner where
  arbitrary = sized genStatDetailAffectingMovesIncreaseInner

genStatDetailAffectingMovesIncreaseInner :: Int -> Gen StatDetailAffectingMovesIncreaseInner
genStatDetailAffectingMovesIncreaseInner n =
  StatDetailAffectingMovesIncreaseInner
    <$> arbitrary -- statDetailAffectingMovesIncreaseInnerChange :: Int
    <*> arbitraryReduced n -- statDetailAffectingMovesIncreaseInnerMove :: AbilityDetailPokemonInnerPokemon
  
instance Arbitrary StatDetailAffectingNatures where
  arbitrary = sized genStatDetailAffectingNatures

genStatDetailAffectingNatures :: Int -> Gen StatDetailAffectingNatures
genStatDetailAffectingNatures n =
  StatDetailAffectingNatures
    <$> arbitraryReduced n -- statDetailAffectingNaturesIncrease :: [AbilityDetailPokemonInnerPokemon]
    <*> arbitraryReduced n -- statDetailAffectingNaturesDecrease :: [AbilityDetailPokemonInnerPokemon]
  
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
    <*> arbitraryReduced n -- typeDetailDamageRelations :: TypeDetailDamageRelations
    <*> arbitraryReduced n -- typeDetailPastDamageRelations :: [TypeDetailPastDamageRelationsInner]
    <*> arbitraryReduced n -- typeDetailGameIndices :: [TypeGameIndex]
    <*> arbitraryReduced n -- typeDetailGeneration :: GenerationSummary
    <*> arbitraryReduced n -- typeDetailMoveDamageClass :: MoveDamageClassSummary
    <*> arbitraryReduced n -- typeDetailNames :: [AbilityName]
    <*> arbitraryReduced n -- typeDetailPokemon :: [TypeDetailPokemonInner]
    <*> arbitraryReduced n -- typeDetailMoves :: [MoveSummary]
    <*> arbitraryReduced n -- typeDetailSprites :: (Map.Map String (Map.Map String TypeDetailSpritesValueValue))
  
instance Arbitrary TypeDetailDamageRelations where
  arbitrary = sized genTypeDetailDamageRelations

genTypeDetailDamageRelations :: Int -> Gen TypeDetailDamageRelations
genTypeDetailDamageRelations n =
  TypeDetailDamageRelations
    <$> arbitraryReduced n -- typeDetailDamageRelationsNoDamageTo :: [AbilityDetailPokemonInnerPokemon]
    <*> arbitraryReduced n -- typeDetailDamageRelationsHalfDamageTo :: [AbilityDetailPokemonInnerPokemon]
    <*> arbitraryReduced n -- typeDetailDamageRelationsDoubleDamageTo :: [AbilityDetailPokemonInnerPokemon]
    <*> arbitraryReduced n -- typeDetailDamageRelationsNoDamageFrom :: [AbilityDetailPokemonInnerPokemon]
    <*> arbitraryReduced n -- typeDetailDamageRelationsHalfDamageFrom :: [AbilityDetailPokemonInnerPokemon]
    <*> arbitraryReduced n -- typeDetailDamageRelationsDoubleDamageFrom :: [AbilityDetailPokemonInnerPokemon]
  
instance Arbitrary TypeDetailPastDamageRelationsInner where
  arbitrary = sized genTypeDetailPastDamageRelationsInner

genTypeDetailPastDamageRelationsInner :: Int -> Gen TypeDetailPastDamageRelationsInner
genTypeDetailPastDamageRelationsInner n =
  TypeDetailPastDamageRelationsInner
    <$> arbitraryReduced n -- typeDetailPastDamageRelationsInnerGeneration :: AbilityDetailPokemonInnerPokemon
    <*> arbitraryReduced n -- typeDetailPastDamageRelationsInnerDamageRelations :: TypeDetailPastDamageRelationsInnerDamageRelations
  
instance Arbitrary TypeDetailPastDamageRelationsInnerDamageRelations where
  arbitrary = sized genTypeDetailPastDamageRelationsInnerDamageRelations

genTypeDetailPastDamageRelationsInnerDamageRelations :: Int -> Gen TypeDetailPastDamageRelationsInnerDamageRelations
genTypeDetailPastDamageRelationsInnerDamageRelations n =
  TypeDetailPastDamageRelationsInnerDamageRelations
    <$> arbitraryReduced n -- typeDetailPastDamageRelationsInnerDamageRelationsNoDamageTo :: [AbilityDetailPokemonInnerPokemon]
    <*> arbitraryReduced n -- typeDetailPastDamageRelationsInnerDamageRelationsHalfDamageTo :: [AbilityDetailPokemonInnerPokemon]
    <*> arbitraryReduced n -- typeDetailPastDamageRelationsInnerDamageRelationsDoubleDamageTo :: [AbilityDetailPokemonInnerPokemon]
    <*> arbitraryReduced n -- typeDetailPastDamageRelationsInnerDamageRelationsNoDamageFrom :: [AbilityDetailPokemonInnerPokemon]
    <*> arbitraryReduced n -- typeDetailPastDamageRelationsInnerDamageRelationsHalfDamageFrom :: [AbilityDetailPokemonInnerPokemon]
    <*> arbitraryReduced n -- typeDetailPastDamageRelationsInnerDamageRelationsDoubleDamageFrom :: [AbilityDetailPokemonInnerPokemon]
  
instance Arbitrary TypeDetailPokemonInner where
  arbitrary = sized genTypeDetailPokemonInner

genTypeDetailPokemonInner :: Int -> Gen TypeDetailPokemonInner
genTypeDetailPokemonInner n =
  TypeDetailPokemonInner
    <$> arbitraryReducedMaybe n -- typeDetailPokemonInnerSlot :: Maybe Int
    <*> arbitraryReducedMaybe n -- typeDetailPokemonInnerPokemon :: Maybe TypeDetailPokemonInnerPokemon
  
instance Arbitrary TypeDetailPokemonInnerPokemon where
  arbitrary = sized genTypeDetailPokemonInnerPokemon

genTypeDetailPokemonInnerPokemon :: Int -> Gen TypeDetailPokemonInnerPokemon
genTypeDetailPokemonInnerPokemon n =
  TypeDetailPokemonInnerPokemon
    <$> arbitraryReducedMaybe n -- typeDetailPokemonInnerPokemonName :: Maybe Text
    <*> arbitraryReducedMaybe n -- typeDetailPokemonInnerPokemonUrl :: Maybe Text
  
instance Arbitrary TypeDetailSpritesValueValue where
  arbitrary = sized genTypeDetailSpritesValueValue

genTypeDetailSpritesValueValue :: Int -> Gen TypeDetailSpritesValueValue
genTypeDetailSpritesValueValue n =
  TypeDetailSpritesValueValue
    <$> arbitraryReducedMaybe n -- typeDetailSpritesValueValueNameIcon :: Maybe Text
  
instance Arbitrary TypeGameIndex where
  arbitrary = sized genTypeGameIndex

genTypeGameIndex :: Int -> Gen TypeGameIndex
genTypeGameIndex n =
  TypeGameIndex
    <$> arbitrary -- typeGameIndexGameIndex :: Int
    <*> arbitraryReduced n -- typeGameIndexGeneration :: GenerationSummary
  
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
    <*> arbitraryReduced n -- versionGroupDetailMoveLearnMethods :: [AbilityDetailPokemonInnerPokemon]
    <*> arbitraryReduced n -- versionGroupDetailPokedexes :: [AbilityDetailPokemonInnerPokemon]
    <*> arbitraryReduced n -- versionGroupDetailRegions :: [AbilityDetailPokemonInnerPokemon]
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
  



