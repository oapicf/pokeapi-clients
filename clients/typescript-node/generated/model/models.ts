import localVarRequest from 'request';

export * from './abilityChange';
export * from './abilityChangeEffectText';
export * from './abilityDetail';
export * from './abilityDetailPokemonInner';
export * from './abilityDetailPokemonInnerPokemon';
export * from './abilityEffectText';
export * from './abilityFlavorText';
export * from './abilityName';
export * from './abilitySummary';
export * from './berryDetail';
export * from './berryDetailFlavorsInner';
export * from './berryDetailFlavorsInnerFlavor';
export * from './berryFirmnessDetail';
export * from './berryFirmnessName';
export * from './berryFirmnessSummary';
export * from './berryFlavorDetail';
export * from './berryFlavorDetailBerriesInner';
export * from './berryFlavorDetailBerriesInnerBerry';
export * from './berryFlavorName';
export * from './berryFlavorSummary';
export * from './berrySummary';
export * from './characteristicDescription';
export * from './characteristicDetail';
export * from './characteristicSummary';
export * from './contestEffectDetail';
export * from './contestEffectEffectText';
export * from './contestEffectFlavorText';
export * from './contestEffectSummary';
export * from './contestTypeDetail';
export * from './contestTypeName';
export * from './contestTypeSummary';
export * from './eggGroupDetail';
export * from './eggGroupDetailPokemonSpeciesInner';
export * from './eggGroupName';
export * from './eggGroupSummary';
export * from './encounterConditionDetail';
export * from './encounterConditionName';
export * from './encounterConditionSummary';
export * from './encounterConditionValueDetail';
export * from './encounterConditionValueName';
export * from './encounterConditionValueSummary';
export * from './encounterMethodDetail';
export * from './encounterMethodName';
export * from './encounterMethodSummary';
export * from './evolutionChainDetail';
export * from './evolutionChainDetailChain';
export * from './evolutionChainDetailChainEvolvesToInner';
export * from './evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner';
export * from './evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender';
export * from './evolutionChainSummary';
export * from './evolutionTriggerDetail';
export * from './evolutionTriggerName';
export * from './evolutionTriggerSummary';
export * from './experience';
export * from './genderDetail';
export * from './genderDetailPokemonSpeciesDetailsInner';
export * from './genderSummary';
export * from './generationDetail';
export * from './generationName';
export * from './generationSummary';
export * from './growthRateDescription';
export * from './growthRateDetail';
export * from './growthRateSummary';
export * from './itemAttributeDescription';
export * from './itemAttributeDetail';
export * from './itemAttributeName';
export * from './itemAttributeSummary';
export * from './itemCategoryDetail';
export * from './itemCategoryName';
export * from './itemCategorySummary';
export * from './itemDetail';
export * from './itemDetailBabyTriggerFor';
export * from './itemDetailHeldByPokemonInner';
export * from './itemDetailHeldByPokemonInnerVersionDetailsInner';
export * from './itemDetailMachinesInner';
export * from './itemDetailSprites';
export * from './itemEffectText';
export * from './itemFlavorText';
export * from './itemFlingEffectDetail';
export * from './itemFlingEffectEffectText';
export * from './itemFlingEffectSummary';
export * from './itemGameIndex';
export * from './itemName';
export * from './itemPocketDetail';
export * from './itemPocketName';
export * from './itemPocketSummary';
export * from './itemSummary';
export * from './languageDetail';
export * from './languageName';
export * from './languageSummary';
export * from './locationAreaDetail';
export * from './locationAreaDetailEncounterMethodRatesInner';
export * from './locationAreaDetailEncounterMethodRatesInnerVersionDetailsInner';
export * from './locationAreaDetailPokemonEncountersInner';
export * from './locationAreaDetailPokemonEncountersInnerVersionDetailsInner';
export * from './locationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails';
export * from './locationAreaName';
export * from './locationAreaSummary';
export * from './locationDetail';
export * from './locationGameIndex';
export * from './locationName';
export * from './locationSummary';
export * from './machineDetail';
export * from './machineSummary';
export * from './moveBattleStyleDetail';
export * from './moveBattleStyleName';
export * from './moveBattleStyleSummary';
export * from './moveChange';
export * from './moveChangeEffectEntriesInner';
export * from './moveDamageClassDescription';
export * from './moveDamageClassDetail';
export * from './moveDamageClassName';
export * from './moveDamageClassSummary';
export * from './moveDetail';
export * from './moveDetailContestCombos';
export * from './moveDetailContestCombosNormal';
export * from './moveDetailEffectChangesInner';
export * from './moveDetailEffectChangesInnerEffectEntriesInner';
export * from './moveDetailMachinesInner';
export * from './moveDetailMachinesInnerMachine';
export * from './moveDetailStatChangesInner';
export * from './moveFlavorText';
export * from './moveLearnMethodDescription';
export * from './moveLearnMethodDetail';
export * from './moveLearnMethodName';
export * from './moveLearnMethodSummary';
export * from './moveMeta';
export * from './moveMetaAilmentDetail';
export * from './moveMetaAilmentName';
export * from './moveMetaAilmentSummary';
export * from './moveMetaCategoryDescription';
export * from './moveMetaCategoryDetail';
export * from './moveMetaCategorySummary';
export * from './moveName';
export * from './moveSummary';
export * from './moveTargetDescription';
export * from './moveTargetDetail';
export * from './moveTargetName';
export * from './moveTargetSummary';
export * from './natureBattleStylePreference';
export * from './natureDetail';
export * from './natureDetailPokeathlonStatChangesInner';
export * from './natureName';
export * from './natureSummary';
export * from './paginatedAbilitySummaryList';
export * from './paginatedBerryFirmnessSummaryList';
export * from './paginatedBerryFlavorSummaryList';
export * from './paginatedBerrySummaryList';
export * from './paginatedCharacteristicSummaryList';
export * from './paginatedContestEffectSummaryList';
export * from './paginatedContestTypeSummaryList';
export * from './paginatedEggGroupSummaryList';
export * from './paginatedEncounterConditionSummaryList';
export * from './paginatedEncounterConditionValueSummaryList';
export * from './paginatedEncounterMethodSummaryList';
export * from './paginatedEvolutionChainSummaryList';
export * from './paginatedEvolutionTriggerSummaryList';
export * from './paginatedGenderSummaryList';
export * from './paginatedGenerationSummaryList';
export * from './paginatedGrowthRateSummaryList';
export * from './paginatedItemAttributeSummaryList';
export * from './paginatedItemCategorySummaryList';
export * from './paginatedItemFlingEffectSummaryList';
export * from './paginatedItemPocketSummaryList';
export * from './paginatedItemSummaryList';
export * from './paginatedLanguageSummaryList';
export * from './paginatedLocationAreaSummaryList';
export * from './paginatedLocationSummaryList';
export * from './paginatedMachineSummaryList';
export * from './paginatedMoveBattleStyleSummaryList';
export * from './paginatedMoveDamageClassSummaryList';
export * from './paginatedMoveLearnMethodSummaryList';
export * from './paginatedMoveMetaAilmentSummaryList';
export * from './paginatedMoveMetaCategorySummaryList';
export * from './paginatedMoveSummaryList';
export * from './paginatedMoveTargetSummaryList';
export * from './paginatedNatureSummaryList';
export * from './paginatedPalParkAreaSummaryList';
export * from './paginatedPokeathlonStatSummaryList';
export * from './paginatedPokedexSummaryList';
export * from './paginatedPokemonColorSummaryList';
export * from './paginatedPokemonFormSummaryList';
export * from './paginatedPokemonHabitatSummaryList';
export * from './paginatedPokemonShapeSummaryList';
export * from './paginatedPokemonSpeciesSummaryList';
export * from './paginatedPokemonSummaryList';
export * from './paginatedRegionSummaryList';
export * from './paginatedStatSummaryList';
export * from './paginatedSuperContestEffectSummaryList';
export * from './paginatedTypeSummaryList';
export * from './paginatedVersionGroupSummaryList';
export * from './paginatedVersionSummaryList';
export * from './palParkAreaDetail';
export * from './palParkAreaDetailPokemonEncountersInner';
export * from './palParkAreaName';
export * from './palParkAreaSummary';
export * from './pokeathlonStatDetail';
export * from './pokeathlonStatDetailAffectingNatures';
export * from './pokeathlonStatDetailAffectingNaturesDecreaseInner';
export * from './pokeathlonStatDetailAffectingNaturesIncreaseInner';
export * from './pokeathlonStatName';
export * from './pokeathlonStatSummary';
export * from './pokedexDescription';
export * from './pokedexDetail';
export * from './pokedexDetailPokemonEntriesInner';
export * from './pokedexName';
export * from './pokedexSummary';
export * from './pokemonColorDetail';
export * from './pokemonColorName';
export * from './pokemonColorSummary';
export * from './pokemonDetail';
export * from './pokemonDetailAbilitiesInner';
export * from './pokemonDetailCries';
export * from './pokemonDetailHeldItems';
export * from './pokemonDetailMovesInner';
export * from './pokemonDetailMovesInnerVersionGroupDetailsInner';
export * from './pokemonDetailPastAbilitiesInner';
export * from './pokemonDetailPastTypesInner';
export * from './pokemonDetailSprites';
export * from './pokemonDetailTypesInner';
export * from './pokemonDexEntry';
export * from './pokemonEncountersRetrieve200ResponseInner';
export * from './pokemonEncountersRetrieve200ResponseInnerLocationArea';
export * from './pokemonEncountersRetrieve200ResponseInnerVersionDetailsInner';
export * from './pokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner';
export * from './pokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner';
export * from './pokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod';
export * from './pokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion';
export * from './pokemonFormDetail';
export * from './pokemonFormDetailFormNamesInner';
export * from './pokemonFormDetailSprites';
export * from './pokemonFormSummary';
export * from './pokemonGameIndex';
export * from './pokemonHabitatDetail';
export * from './pokemonHabitatName';
export * from './pokemonHabitatSummary';
export * from './pokemonShapeDetail';
export * from './pokemonShapeDetailAwesomeNamesInner';
export * from './pokemonShapeDetailNamesInner';
export * from './pokemonShapeSummary';
export * from './pokemonSpeciesDescription';
export * from './pokemonSpeciesDetail';
export * from './pokemonSpeciesDetailGeneraInner';
export * from './pokemonSpeciesDetailPalParkEncountersInner';
export * from './pokemonSpeciesDetailVarietiesInner';
export * from './pokemonSpeciesFlavorText';
export * from './pokemonSpeciesSummary';
export * from './pokemonStat';
export * from './pokemonSummary';
export * from './regionDetail';
export * from './regionName';
export * from './regionSummary';
export * from './statDetail';
export * from './statDetailAffectingMoves';
export * from './statDetailAffectingMovesIncreaseInner';
export * from './statDetailAffectingNatures';
export * from './statName';
export * from './statSummary';
export * from './superContestEffectDetail';
export * from './superContestEffectFlavorText';
export * from './superContestEffectSummary';
export * from './typeDetail';
export * from './typeDetailDamageRelations';
export * from './typeDetailPastDamageRelationsInner';
export * from './typeDetailPastDamageRelationsInnerDamageRelations';
export * from './typeDetailPokemonInner';
export * from './typeDetailPokemonInnerPokemon';
export * from './typeDetailSpritesValueValue';
export * from './typeGameIndex';
export * from './typeSummary';
export * from './versionDetail';
export * from './versionGroupDetail';
export * from './versionGroupSummary';
export * from './versionName';
export * from './versionSummary';

import * as fs from 'fs';

export interface RequestDetailedFile {
    value: Buffer;
    options?: {
        filename?: string;
        contentType?: string;
    }
}

export type RequestFile = string | Buffer | fs.ReadStream | RequestDetailedFile;


import { AbilityChange } from './abilityChange';
import { AbilityChangeEffectText } from './abilityChangeEffectText';
import { AbilityDetail } from './abilityDetail';
import { AbilityDetailPokemonInner } from './abilityDetailPokemonInner';
import { AbilityDetailPokemonInnerPokemon } from './abilityDetailPokemonInnerPokemon';
import { AbilityEffectText } from './abilityEffectText';
import { AbilityFlavorText } from './abilityFlavorText';
import { AbilityName } from './abilityName';
import { AbilitySummary } from './abilitySummary';
import { BerryDetail } from './berryDetail';
import { BerryDetailFlavorsInner } from './berryDetailFlavorsInner';
import { BerryDetailFlavorsInnerFlavor } from './berryDetailFlavorsInnerFlavor';
import { BerryFirmnessDetail } from './berryFirmnessDetail';
import { BerryFirmnessName } from './berryFirmnessName';
import { BerryFirmnessSummary } from './berryFirmnessSummary';
import { BerryFlavorDetail } from './berryFlavorDetail';
import { BerryFlavorDetailBerriesInner } from './berryFlavorDetailBerriesInner';
import { BerryFlavorDetailBerriesInnerBerry } from './berryFlavorDetailBerriesInnerBerry';
import { BerryFlavorName } from './berryFlavorName';
import { BerryFlavorSummary } from './berryFlavorSummary';
import { BerrySummary } from './berrySummary';
import { CharacteristicDescription } from './characteristicDescription';
import { CharacteristicDetail } from './characteristicDetail';
import { CharacteristicSummary } from './characteristicSummary';
import { ContestEffectDetail } from './contestEffectDetail';
import { ContestEffectEffectText } from './contestEffectEffectText';
import { ContestEffectFlavorText } from './contestEffectFlavorText';
import { ContestEffectSummary } from './contestEffectSummary';
import { ContestTypeDetail } from './contestTypeDetail';
import { ContestTypeName } from './contestTypeName';
import { ContestTypeSummary } from './contestTypeSummary';
import { EggGroupDetail } from './eggGroupDetail';
import { EggGroupDetailPokemonSpeciesInner } from './eggGroupDetailPokemonSpeciesInner';
import { EggGroupName } from './eggGroupName';
import { EggGroupSummary } from './eggGroupSummary';
import { EncounterConditionDetail } from './encounterConditionDetail';
import { EncounterConditionName } from './encounterConditionName';
import { EncounterConditionSummary } from './encounterConditionSummary';
import { EncounterConditionValueDetail } from './encounterConditionValueDetail';
import { EncounterConditionValueName } from './encounterConditionValueName';
import { EncounterConditionValueSummary } from './encounterConditionValueSummary';
import { EncounterMethodDetail } from './encounterMethodDetail';
import { EncounterMethodName } from './encounterMethodName';
import { EncounterMethodSummary } from './encounterMethodSummary';
import { EvolutionChainDetail } from './evolutionChainDetail';
import { EvolutionChainDetailChain } from './evolutionChainDetailChain';
import { EvolutionChainDetailChainEvolvesToInner } from './evolutionChainDetailChainEvolvesToInner';
import { EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner } from './evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner';
import { EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender } from './evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender';
import { EvolutionChainSummary } from './evolutionChainSummary';
import { EvolutionTriggerDetail } from './evolutionTriggerDetail';
import { EvolutionTriggerName } from './evolutionTriggerName';
import { EvolutionTriggerSummary } from './evolutionTriggerSummary';
import { Experience } from './experience';
import { GenderDetail } from './genderDetail';
import { GenderDetailPokemonSpeciesDetailsInner } from './genderDetailPokemonSpeciesDetailsInner';
import { GenderSummary } from './genderSummary';
import { GenerationDetail } from './generationDetail';
import { GenerationName } from './generationName';
import { GenerationSummary } from './generationSummary';
import { GrowthRateDescription } from './growthRateDescription';
import { GrowthRateDetail } from './growthRateDetail';
import { GrowthRateSummary } from './growthRateSummary';
import { ItemAttributeDescription } from './itemAttributeDescription';
import { ItemAttributeDetail } from './itemAttributeDetail';
import { ItemAttributeName } from './itemAttributeName';
import { ItemAttributeSummary } from './itemAttributeSummary';
import { ItemCategoryDetail } from './itemCategoryDetail';
import { ItemCategoryName } from './itemCategoryName';
import { ItemCategorySummary } from './itemCategorySummary';
import { ItemDetail } from './itemDetail';
import { ItemDetailBabyTriggerFor } from './itemDetailBabyTriggerFor';
import { ItemDetailHeldByPokemonInner } from './itemDetailHeldByPokemonInner';
import { ItemDetailHeldByPokemonInnerVersionDetailsInner } from './itemDetailHeldByPokemonInnerVersionDetailsInner';
import { ItemDetailMachinesInner } from './itemDetailMachinesInner';
import { ItemDetailSprites } from './itemDetailSprites';
import { ItemEffectText } from './itemEffectText';
import { ItemFlavorText } from './itemFlavorText';
import { ItemFlingEffectDetail } from './itemFlingEffectDetail';
import { ItemFlingEffectEffectText } from './itemFlingEffectEffectText';
import { ItemFlingEffectSummary } from './itemFlingEffectSummary';
import { ItemGameIndex } from './itemGameIndex';
import { ItemName } from './itemName';
import { ItemPocketDetail } from './itemPocketDetail';
import { ItemPocketName } from './itemPocketName';
import { ItemPocketSummary } from './itemPocketSummary';
import { ItemSummary } from './itemSummary';
import { LanguageDetail } from './languageDetail';
import { LanguageName } from './languageName';
import { LanguageSummary } from './languageSummary';
import { LocationAreaDetail } from './locationAreaDetail';
import { LocationAreaDetailEncounterMethodRatesInner } from './locationAreaDetailEncounterMethodRatesInner';
import { LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner } from './locationAreaDetailEncounterMethodRatesInnerVersionDetailsInner';
import { LocationAreaDetailPokemonEncountersInner } from './locationAreaDetailPokemonEncountersInner';
import { LocationAreaDetailPokemonEncountersInnerVersionDetailsInner } from './locationAreaDetailPokemonEncountersInnerVersionDetailsInner';
import { LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails } from './locationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails';
import { LocationAreaName } from './locationAreaName';
import { LocationAreaSummary } from './locationAreaSummary';
import { LocationDetail } from './locationDetail';
import { LocationGameIndex } from './locationGameIndex';
import { LocationName } from './locationName';
import { LocationSummary } from './locationSummary';
import { MachineDetail } from './machineDetail';
import { MachineSummary } from './machineSummary';
import { MoveBattleStyleDetail } from './moveBattleStyleDetail';
import { MoveBattleStyleName } from './moveBattleStyleName';
import { MoveBattleStyleSummary } from './moveBattleStyleSummary';
import { MoveChange } from './moveChange';
import { MoveChangeEffectEntriesInner } from './moveChangeEffectEntriesInner';
import { MoveDamageClassDescription } from './moveDamageClassDescription';
import { MoveDamageClassDetail } from './moveDamageClassDetail';
import { MoveDamageClassName } from './moveDamageClassName';
import { MoveDamageClassSummary } from './moveDamageClassSummary';
import { MoveDetail } from './moveDetail';
import { MoveDetailContestCombos } from './moveDetailContestCombos';
import { MoveDetailContestCombosNormal } from './moveDetailContestCombosNormal';
import { MoveDetailEffectChangesInner } from './moveDetailEffectChangesInner';
import { MoveDetailEffectChangesInnerEffectEntriesInner } from './moveDetailEffectChangesInnerEffectEntriesInner';
import { MoveDetailMachinesInner } from './moveDetailMachinesInner';
import { MoveDetailMachinesInnerMachine } from './moveDetailMachinesInnerMachine';
import { MoveDetailStatChangesInner } from './moveDetailStatChangesInner';
import { MoveFlavorText } from './moveFlavorText';
import { MoveLearnMethodDescription } from './moveLearnMethodDescription';
import { MoveLearnMethodDetail } from './moveLearnMethodDetail';
import { MoveLearnMethodName } from './moveLearnMethodName';
import { MoveLearnMethodSummary } from './moveLearnMethodSummary';
import { MoveMeta } from './moveMeta';
import { MoveMetaAilmentDetail } from './moveMetaAilmentDetail';
import { MoveMetaAilmentName } from './moveMetaAilmentName';
import { MoveMetaAilmentSummary } from './moveMetaAilmentSummary';
import { MoveMetaCategoryDescription } from './moveMetaCategoryDescription';
import { MoveMetaCategoryDetail } from './moveMetaCategoryDetail';
import { MoveMetaCategorySummary } from './moveMetaCategorySummary';
import { MoveName } from './moveName';
import { MoveSummary } from './moveSummary';
import { MoveTargetDescription } from './moveTargetDescription';
import { MoveTargetDetail } from './moveTargetDetail';
import { MoveTargetName } from './moveTargetName';
import { MoveTargetSummary } from './moveTargetSummary';
import { NatureBattleStylePreference } from './natureBattleStylePreference';
import { NatureDetail } from './natureDetail';
import { NatureDetailPokeathlonStatChangesInner } from './natureDetailPokeathlonStatChangesInner';
import { NatureName } from './natureName';
import { NatureSummary } from './natureSummary';
import { PaginatedAbilitySummaryList } from './paginatedAbilitySummaryList';
import { PaginatedBerryFirmnessSummaryList } from './paginatedBerryFirmnessSummaryList';
import { PaginatedBerryFlavorSummaryList } from './paginatedBerryFlavorSummaryList';
import { PaginatedBerrySummaryList } from './paginatedBerrySummaryList';
import { PaginatedCharacteristicSummaryList } from './paginatedCharacteristicSummaryList';
import { PaginatedContestEffectSummaryList } from './paginatedContestEffectSummaryList';
import { PaginatedContestTypeSummaryList } from './paginatedContestTypeSummaryList';
import { PaginatedEggGroupSummaryList } from './paginatedEggGroupSummaryList';
import { PaginatedEncounterConditionSummaryList } from './paginatedEncounterConditionSummaryList';
import { PaginatedEncounterConditionValueSummaryList } from './paginatedEncounterConditionValueSummaryList';
import { PaginatedEncounterMethodSummaryList } from './paginatedEncounterMethodSummaryList';
import { PaginatedEvolutionChainSummaryList } from './paginatedEvolutionChainSummaryList';
import { PaginatedEvolutionTriggerSummaryList } from './paginatedEvolutionTriggerSummaryList';
import { PaginatedGenderSummaryList } from './paginatedGenderSummaryList';
import { PaginatedGenerationSummaryList } from './paginatedGenerationSummaryList';
import { PaginatedGrowthRateSummaryList } from './paginatedGrowthRateSummaryList';
import { PaginatedItemAttributeSummaryList } from './paginatedItemAttributeSummaryList';
import { PaginatedItemCategorySummaryList } from './paginatedItemCategorySummaryList';
import { PaginatedItemFlingEffectSummaryList } from './paginatedItemFlingEffectSummaryList';
import { PaginatedItemPocketSummaryList } from './paginatedItemPocketSummaryList';
import { PaginatedItemSummaryList } from './paginatedItemSummaryList';
import { PaginatedLanguageSummaryList } from './paginatedLanguageSummaryList';
import { PaginatedLocationAreaSummaryList } from './paginatedLocationAreaSummaryList';
import { PaginatedLocationSummaryList } from './paginatedLocationSummaryList';
import { PaginatedMachineSummaryList } from './paginatedMachineSummaryList';
import { PaginatedMoveBattleStyleSummaryList } from './paginatedMoveBattleStyleSummaryList';
import { PaginatedMoveDamageClassSummaryList } from './paginatedMoveDamageClassSummaryList';
import { PaginatedMoveLearnMethodSummaryList } from './paginatedMoveLearnMethodSummaryList';
import { PaginatedMoveMetaAilmentSummaryList } from './paginatedMoveMetaAilmentSummaryList';
import { PaginatedMoveMetaCategorySummaryList } from './paginatedMoveMetaCategorySummaryList';
import { PaginatedMoveSummaryList } from './paginatedMoveSummaryList';
import { PaginatedMoveTargetSummaryList } from './paginatedMoveTargetSummaryList';
import { PaginatedNatureSummaryList } from './paginatedNatureSummaryList';
import { PaginatedPalParkAreaSummaryList } from './paginatedPalParkAreaSummaryList';
import { PaginatedPokeathlonStatSummaryList } from './paginatedPokeathlonStatSummaryList';
import { PaginatedPokedexSummaryList } from './paginatedPokedexSummaryList';
import { PaginatedPokemonColorSummaryList } from './paginatedPokemonColorSummaryList';
import { PaginatedPokemonFormSummaryList } from './paginatedPokemonFormSummaryList';
import { PaginatedPokemonHabitatSummaryList } from './paginatedPokemonHabitatSummaryList';
import { PaginatedPokemonShapeSummaryList } from './paginatedPokemonShapeSummaryList';
import { PaginatedPokemonSpeciesSummaryList } from './paginatedPokemonSpeciesSummaryList';
import { PaginatedPokemonSummaryList } from './paginatedPokemonSummaryList';
import { PaginatedRegionSummaryList } from './paginatedRegionSummaryList';
import { PaginatedStatSummaryList } from './paginatedStatSummaryList';
import { PaginatedSuperContestEffectSummaryList } from './paginatedSuperContestEffectSummaryList';
import { PaginatedTypeSummaryList } from './paginatedTypeSummaryList';
import { PaginatedVersionGroupSummaryList } from './paginatedVersionGroupSummaryList';
import { PaginatedVersionSummaryList } from './paginatedVersionSummaryList';
import { PalParkAreaDetail } from './palParkAreaDetail';
import { PalParkAreaDetailPokemonEncountersInner } from './palParkAreaDetailPokemonEncountersInner';
import { PalParkAreaName } from './palParkAreaName';
import { PalParkAreaSummary } from './palParkAreaSummary';
import { PokeathlonStatDetail } from './pokeathlonStatDetail';
import { PokeathlonStatDetailAffectingNatures } from './pokeathlonStatDetailAffectingNatures';
import { PokeathlonStatDetailAffectingNaturesDecreaseInner } from './pokeathlonStatDetailAffectingNaturesDecreaseInner';
import { PokeathlonStatDetailAffectingNaturesIncreaseInner } from './pokeathlonStatDetailAffectingNaturesIncreaseInner';
import { PokeathlonStatName } from './pokeathlonStatName';
import { PokeathlonStatSummary } from './pokeathlonStatSummary';
import { PokedexDescription } from './pokedexDescription';
import { PokedexDetail } from './pokedexDetail';
import { PokedexDetailPokemonEntriesInner } from './pokedexDetailPokemonEntriesInner';
import { PokedexName } from './pokedexName';
import { PokedexSummary } from './pokedexSummary';
import { PokemonColorDetail } from './pokemonColorDetail';
import { PokemonColorName } from './pokemonColorName';
import { PokemonColorSummary } from './pokemonColorSummary';
import { PokemonDetail } from './pokemonDetail';
import { PokemonDetailAbilitiesInner } from './pokemonDetailAbilitiesInner';
import { PokemonDetailCries } from './pokemonDetailCries';
import { PokemonDetailHeldItems } from './pokemonDetailHeldItems';
import { PokemonDetailMovesInner } from './pokemonDetailMovesInner';
import { PokemonDetailMovesInnerVersionGroupDetailsInner } from './pokemonDetailMovesInnerVersionGroupDetailsInner';
import { PokemonDetailPastAbilitiesInner } from './pokemonDetailPastAbilitiesInner';
import { PokemonDetailPastTypesInner } from './pokemonDetailPastTypesInner';
import { PokemonDetailSprites } from './pokemonDetailSprites';
import { PokemonDetailTypesInner } from './pokemonDetailTypesInner';
import { PokemonDexEntry } from './pokemonDexEntry';
import { PokemonEncountersRetrieve200ResponseInner } from './pokemonEncountersRetrieve200ResponseInner';
import { PokemonEncountersRetrieve200ResponseInnerLocationArea } from './pokemonEncountersRetrieve200ResponseInnerLocationArea';
import { PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner } from './pokemonEncountersRetrieve200ResponseInnerVersionDetailsInner';
import { PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner } from './pokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner';
import { PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner } from './pokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner';
import { PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod } from './pokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod';
import { PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion } from './pokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion';
import { PokemonFormDetail } from './pokemonFormDetail';
import { PokemonFormDetailFormNamesInner } from './pokemonFormDetailFormNamesInner';
import { PokemonFormDetailSprites } from './pokemonFormDetailSprites';
import { PokemonFormSummary } from './pokemonFormSummary';
import { PokemonGameIndex } from './pokemonGameIndex';
import { PokemonHabitatDetail } from './pokemonHabitatDetail';
import { PokemonHabitatName } from './pokemonHabitatName';
import { PokemonHabitatSummary } from './pokemonHabitatSummary';
import { PokemonShapeDetail } from './pokemonShapeDetail';
import { PokemonShapeDetailAwesomeNamesInner } from './pokemonShapeDetailAwesomeNamesInner';
import { PokemonShapeDetailNamesInner } from './pokemonShapeDetailNamesInner';
import { PokemonShapeSummary } from './pokemonShapeSummary';
import { PokemonSpeciesDescription } from './pokemonSpeciesDescription';
import { PokemonSpeciesDetail } from './pokemonSpeciesDetail';
import { PokemonSpeciesDetailGeneraInner } from './pokemonSpeciesDetailGeneraInner';
import { PokemonSpeciesDetailPalParkEncountersInner } from './pokemonSpeciesDetailPalParkEncountersInner';
import { PokemonSpeciesDetailVarietiesInner } from './pokemonSpeciesDetailVarietiesInner';
import { PokemonSpeciesFlavorText } from './pokemonSpeciesFlavorText';
import { PokemonSpeciesSummary } from './pokemonSpeciesSummary';
import { PokemonStat } from './pokemonStat';
import { PokemonSummary } from './pokemonSummary';
import { RegionDetail } from './regionDetail';
import { RegionName } from './regionName';
import { RegionSummary } from './regionSummary';
import { StatDetail } from './statDetail';
import { StatDetailAffectingMoves } from './statDetailAffectingMoves';
import { StatDetailAffectingMovesIncreaseInner } from './statDetailAffectingMovesIncreaseInner';
import { StatDetailAffectingNatures } from './statDetailAffectingNatures';
import { StatName } from './statName';
import { StatSummary } from './statSummary';
import { SuperContestEffectDetail } from './superContestEffectDetail';
import { SuperContestEffectFlavorText } from './superContestEffectFlavorText';
import { SuperContestEffectSummary } from './superContestEffectSummary';
import { TypeDetail } from './typeDetail';
import { TypeDetailDamageRelations } from './typeDetailDamageRelations';
import { TypeDetailPastDamageRelationsInner } from './typeDetailPastDamageRelationsInner';
import { TypeDetailPastDamageRelationsInnerDamageRelations } from './typeDetailPastDamageRelationsInnerDamageRelations';
import { TypeDetailPokemonInner } from './typeDetailPokemonInner';
import { TypeDetailPokemonInnerPokemon } from './typeDetailPokemonInnerPokemon';
import { TypeDetailSpritesValueValue } from './typeDetailSpritesValueValue';
import { TypeGameIndex } from './typeGameIndex';
import { TypeSummary } from './typeSummary';
import { VersionDetail } from './versionDetail';
import { VersionGroupDetail } from './versionGroupDetail';
import { VersionGroupSummary } from './versionGroupSummary';
import { VersionName } from './versionName';
import { VersionSummary } from './versionSummary';

/* tslint:disable:no-unused-variable */
let primitives = [
                    "string",
                    "boolean",
                    "double",
                    "integer",
                    "long",
                    "float",
                    "number",
                    "any"
                 ];

let enumsMap: {[index: string]: any} = {
}

let typeMap: {[index: string]: any} = {
    "AbilityChange": AbilityChange,
    "AbilityChangeEffectText": AbilityChangeEffectText,
    "AbilityDetail": AbilityDetail,
    "AbilityDetailPokemonInner": AbilityDetailPokemonInner,
    "AbilityDetailPokemonInnerPokemon": AbilityDetailPokemonInnerPokemon,
    "AbilityEffectText": AbilityEffectText,
    "AbilityFlavorText": AbilityFlavorText,
    "AbilityName": AbilityName,
    "AbilitySummary": AbilitySummary,
    "BerryDetail": BerryDetail,
    "BerryDetailFlavorsInner": BerryDetailFlavorsInner,
    "BerryDetailFlavorsInnerFlavor": BerryDetailFlavorsInnerFlavor,
    "BerryFirmnessDetail": BerryFirmnessDetail,
    "BerryFirmnessName": BerryFirmnessName,
    "BerryFirmnessSummary": BerryFirmnessSummary,
    "BerryFlavorDetail": BerryFlavorDetail,
    "BerryFlavorDetailBerriesInner": BerryFlavorDetailBerriesInner,
    "BerryFlavorDetailBerriesInnerBerry": BerryFlavorDetailBerriesInnerBerry,
    "BerryFlavorName": BerryFlavorName,
    "BerryFlavorSummary": BerryFlavorSummary,
    "BerrySummary": BerrySummary,
    "CharacteristicDescription": CharacteristicDescription,
    "CharacteristicDetail": CharacteristicDetail,
    "CharacteristicSummary": CharacteristicSummary,
    "ContestEffectDetail": ContestEffectDetail,
    "ContestEffectEffectText": ContestEffectEffectText,
    "ContestEffectFlavorText": ContestEffectFlavorText,
    "ContestEffectSummary": ContestEffectSummary,
    "ContestTypeDetail": ContestTypeDetail,
    "ContestTypeName": ContestTypeName,
    "ContestTypeSummary": ContestTypeSummary,
    "EggGroupDetail": EggGroupDetail,
    "EggGroupDetailPokemonSpeciesInner": EggGroupDetailPokemonSpeciesInner,
    "EggGroupName": EggGroupName,
    "EggGroupSummary": EggGroupSummary,
    "EncounterConditionDetail": EncounterConditionDetail,
    "EncounterConditionName": EncounterConditionName,
    "EncounterConditionSummary": EncounterConditionSummary,
    "EncounterConditionValueDetail": EncounterConditionValueDetail,
    "EncounterConditionValueName": EncounterConditionValueName,
    "EncounterConditionValueSummary": EncounterConditionValueSummary,
    "EncounterMethodDetail": EncounterMethodDetail,
    "EncounterMethodName": EncounterMethodName,
    "EncounterMethodSummary": EncounterMethodSummary,
    "EvolutionChainDetail": EvolutionChainDetail,
    "EvolutionChainDetailChain": EvolutionChainDetailChain,
    "EvolutionChainDetailChainEvolvesToInner": EvolutionChainDetailChainEvolvesToInner,
    "EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner": EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner,
    "EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender": EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender,
    "EvolutionChainSummary": EvolutionChainSummary,
    "EvolutionTriggerDetail": EvolutionTriggerDetail,
    "EvolutionTriggerName": EvolutionTriggerName,
    "EvolutionTriggerSummary": EvolutionTriggerSummary,
    "Experience": Experience,
    "GenderDetail": GenderDetail,
    "GenderDetailPokemonSpeciesDetailsInner": GenderDetailPokemonSpeciesDetailsInner,
    "GenderSummary": GenderSummary,
    "GenerationDetail": GenerationDetail,
    "GenerationName": GenerationName,
    "GenerationSummary": GenerationSummary,
    "GrowthRateDescription": GrowthRateDescription,
    "GrowthRateDetail": GrowthRateDetail,
    "GrowthRateSummary": GrowthRateSummary,
    "ItemAttributeDescription": ItemAttributeDescription,
    "ItemAttributeDetail": ItemAttributeDetail,
    "ItemAttributeName": ItemAttributeName,
    "ItemAttributeSummary": ItemAttributeSummary,
    "ItemCategoryDetail": ItemCategoryDetail,
    "ItemCategoryName": ItemCategoryName,
    "ItemCategorySummary": ItemCategorySummary,
    "ItemDetail": ItemDetail,
    "ItemDetailBabyTriggerFor": ItemDetailBabyTriggerFor,
    "ItemDetailHeldByPokemonInner": ItemDetailHeldByPokemonInner,
    "ItemDetailHeldByPokemonInnerVersionDetailsInner": ItemDetailHeldByPokemonInnerVersionDetailsInner,
    "ItemDetailMachinesInner": ItemDetailMachinesInner,
    "ItemDetailSprites": ItemDetailSprites,
    "ItemEffectText": ItemEffectText,
    "ItemFlavorText": ItemFlavorText,
    "ItemFlingEffectDetail": ItemFlingEffectDetail,
    "ItemFlingEffectEffectText": ItemFlingEffectEffectText,
    "ItemFlingEffectSummary": ItemFlingEffectSummary,
    "ItemGameIndex": ItemGameIndex,
    "ItemName": ItemName,
    "ItemPocketDetail": ItemPocketDetail,
    "ItemPocketName": ItemPocketName,
    "ItemPocketSummary": ItemPocketSummary,
    "ItemSummary": ItemSummary,
    "LanguageDetail": LanguageDetail,
    "LanguageName": LanguageName,
    "LanguageSummary": LanguageSummary,
    "LocationAreaDetail": LocationAreaDetail,
    "LocationAreaDetailEncounterMethodRatesInner": LocationAreaDetailEncounterMethodRatesInner,
    "LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner": LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner,
    "LocationAreaDetailPokemonEncountersInner": LocationAreaDetailPokemonEncountersInner,
    "LocationAreaDetailPokemonEncountersInnerVersionDetailsInner": LocationAreaDetailPokemonEncountersInnerVersionDetailsInner,
    "LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails": LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails,
    "LocationAreaName": LocationAreaName,
    "LocationAreaSummary": LocationAreaSummary,
    "LocationDetail": LocationDetail,
    "LocationGameIndex": LocationGameIndex,
    "LocationName": LocationName,
    "LocationSummary": LocationSummary,
    "MachineDetail": MachineDetail,
    "MachineSummary": MachineSummary,
    "MoveBattleStyleDetail": MoveBattleStyleDetail,
    "MoveBattleStyleName": MoveBattleStyleName,
    "MoveBattleStyleSummary": MoveBattleStyleSummary,
    "MoveChange": MoveChange,
    "MoveChangeEffectEntriesInner": MoveChangeEffectEntriesInner,
    "MoveDamageClassDescription": MoveDamageClassDescription,
    "MoveDamageClassDetail": MoveDamageClassDetail,
    "MoveDamageClassName": MoveDamageClassName,
    "MoveDamageClassSummary": MoveDamageClassSummary,
    "MoveDetail": MoveDetail,
    "MoveDetailContestCombos": MoveDetailContestCombos,
    "MoveDetailContestCombosNormal": MoveDetailContestCombosNormal,
    "MoveDetailEffectChangesInner": MoveDetailEffectChangesInner,
    "MoveDetailEffectChangesInnerEffectEntriesInner": MoveDetailEffectChangesInnerEffectEntriesInner,
    "MoveDetailMachinesInner": MoveDetailMachinesInner,
    "MoveDetailMachinesInnerMachine": MoveDetailMachinesInnerMachine,
    "MoveDetailStatChangesInner": MoveDetailStatChangesInner,
    "MoveFlavorText": MoveFlavorText,
    "MoveLearnMethodDescription": MoveLearnMethodDescription,
    "MoveLearnMethodDetail": MoveLearnMethodDetail,
    "MoveLearnMethodName": MoveLearnMethodName,
    "MoveLearnMethodSummary": MoveLearnMethodSummary,
    "MoveMeta": MoveMeta,
    "MoveMetaAilmentDetail": MoveMetaAilmentDetail,
    "MoveMetaAilmentName": MoveMetaAilmentName,
    "MoveMetaAilmentSummary": MoveMetaAilmentSummary,
    "MoveMetaCategoryDescription": MoveMetaCategoryDescription,
    "MoveMetaCategoryDetail": MoveMetaCategoryDetail,
    "MoveMetaCategorySummary": MoveMetaCategorySummary,
    "MoveName": MoveName,
    "MoveSummary": MoveSummary,
    "MoveTargetDescription": MoveTargetDescription,
    "MoveTargetDetail": MoveTargetDetail,
    "MoveTargetName": MoveTargetName,
    "MoveTargetSummary": MoveTargetSummary,
    "NatureBattleStylePreference": NatureBattleStylePreference,
    "NatureDetail": NatureDetail,
    "NatureDetailPokeathlonStatChangesInner": NatureDetailPokeathlonStatChangesInner,
    "NatureName": NatureName,
    "NatureSummary": NatureSummary,
    "PaginatedAbilitySummaryList": PaginatedAbilitySummaryList,
    "PaginatedBerryFirmnessSummaryList": PaginatedBerryFirmnessSummaryList,
    "PaginatedBerryFlavorSummaryList": PaginatedBerryFlavorSummaryList,
    "PaginatedBerrySummaryList": PaginatedBerrySummaryList,
    "PaginatedCharacteristicSummaryList": PaginatedCharacteristicSummaryList,
    "PaginatedContestEffectSummaryList": PaginatedContestEffectSummaryList,
    "PaginatedContestTypeSummaryList": PaginatedContestTypeSummaryList,
    "PaginatedEggGroupSummaryList": PaginatedEggGroupSummaryList,
    "PaginatedEncounterConditionSummaryList": PaginatedEncounterConditionSummaryList,
    "PaginatedEncounterConditionValueSummaryList": PaginatedEncounterConditionValueSummaryList,
    "PaginatedEncounterMethodSummaryList": PaginatedEncounterMethodSummaryList,
    "PaginatedEvolutionChainSummaryList": PaginatedEvolutionChainSummaryList,
    "PaginatedEvolutionTriggerSummaryList": PaginatedEvolutionTriggerSummaryList,
    "PaginatedGenderSummaryList": PaginatedGenderSummaryList,
    "PaginatedGenerationSummaryList": PaginatedGenerationSummaryList,
    "PaginatedGrowthRateSummaryList": PaginatedGrowthRateSummaryList,
    "PaginatedItemAttributeSummaryList": PaginatedItemAttributeSummaryList,
    "PaginatedItemCategorySummaryList": PaginatedItemCategorySummaryList,
    "PaginatedItemFlingEffectSummaryList": PaginatedItemFlingEffectSummaryList,
    "PaginatedItemPocketSummaryList": PaginatedItemPocketSummaryList,
    "PaginatedItemSummaryList": PaginatedItemSummaryList,
    "PaginatedLanguageSummaryList": PaginatedLanguageSummaryList,
    "PaginatedLocationAreaSummaryList": PaginatedLocationAreaSummaryList,
    "PaginatedLocationSummaryList": PaginatedLocationSummaryList,
    "PaginatedMachineSummaryList": PaginatedMachineSummaryList,
    "PaginatedMoveBattleStyleSummaryList": PaginatedMoveBattleStyleSummaryList,
    "PaginatedMoveDamageClassSummaryList": PaginatedMoveDamageClassSummaryList,
    "PaginatedMoveLearnMethodSummaryList": PaginatedMoveLearnMethodSummaryList,
    "PaginatedMoveMetaAilmentSummaryList": PaginatedMoveMetaAilmentSummaryList,
    "PaginatedMoveMetaCategorySummaryList": PaginatedMoveMetaCategorySummaryList,
    "PaginatedMoveSummaryList": PaginatedMoveSummaryList,
    "PaginatedMoveTargetSummaryList": PaginatedMoveTargetSummaryList,
    "PaginatedNatureSummaryList": PaginatedNatureSummaryList,
    "PaginatedPalParkAreaSummaryList": PaginatedPalParkAreaSummaryList,
    "PaginatedPokeathlonStatSummaryList": PaginatedPokeathlonStatSummaryList,
    "PaginatedPokedexSummaryList": PaginatedPokedexSummaryList,
    "PaginatedPokemonColorSummaryList": PaginatedPokemonColorSummaryList,
    "PaginatedPokemonFormSummaryList": PaginatedPokemonFormSummaryList,
    "PaginatedPokemonHabitatSummaryList": PaginatedPokemonHabitatSummaryList,
    "PaginatedPokemonShapeSummaryList": PaginatedPokemonShapeSummaryList,
    "PaginatedPokemonSpeciesSummaryList": PaginatedPokemonSpeciesSummaryList,
    "PaginatedPokemonSummaryList": PaginatedPokemonSummaryList,
    "PaginatedRegionSummaryList": PaginatedRegionSummaryList,
    "PaginatedStatSummaryList": PaginatedStatSummaryList,
    "PaginatedSuperContestEffectSummaryList": PaginatedSuperContestEffectSummaryList,
    "PaginatedTypeSummaryList": PaginatedTypeSummaryList,
    "PaginatedVersionGroupSummaryList": PaginatedVersionGroupSummaryList,
    "PaginatedVersionSummaryList": PaginatedVersionSummaryList,
    "PalParkAreaDetail": PalParkAreaDetail,
    "PalParkAreaDetailPokemonEncountersInner": PalParkAreaDetailPokemonEncountersInner,
    "PalParkAreaName": PalParkAreaName,
    "PalParkAreaSummary": PalParkAreaSummary,
    "PokeathlonStatDetail": PokeathlonStatDetail,
    "PokeathlonStatDetailAffectingNatures": PokeathlonStatDetailAffectingNatures,
    "PokeathlonStatDetailAffectingNaturesDecreaseInner": PokeathlonStatDetailAffectingNaturesDecreaseInner,
    "PokeathlonStatDetailAffectingNaturesIncreaseInner": PokeathlonStatDetailAffectingNaturesIncreaseInner,
    "PokeathlonStatName": PokeathlonStatName,
    "PokeathlonStatSummary": PokeathlonStatSummary,
    "PokedexDescription": PokedexDescription,
    "PokedexDetail": PokedexDetail,
    "PokedexDetailPokemonEntriesInner": PokedexDetailPokemonEntriesInner,
    "PokedexName": PokedexName,
    "PokedexSummary": PokedexSummary,
    "PokemonColorDetail": PokemonColorDetail,
    "PokemonColorName": PokemonColorName,
    "PokemonColorSummary": PokemonColorSummary,
    "PokemonDetail": PokemonDetail,
    "PokemonDetailAbilitiesInner": PokemonDetailAbilitiesInner,
    "PokemonDetailCries": PokemonDetailCries,
    "PokemonDetailHeldItems": PokemonDetailHeldItems,
    "PokemonDetailMovesInner": PokemonDetailMovesInner,
    "PokemonDetailMovesInnerVersionGroupDetailsInner": PokemonDetailMovesInnerVersionGroupDetailsInner,
    "PokemonDetailPastAbilitiesInner": PokemonDetailPastAbilitiesInner,
    "PokemonDetailPastTypesInner": PokemonDetailPastTypesInner,
    "PokemonDetailSprites": PokemonDetailSprites,
    "PokemonDetailTypesInner": PokemonDetailTypesInner,
    "PokemonDexEntry": PokemonDexEntry,
    "PokemonEncountersRetrieve200ResponseInner": PokemonEncountersRetrieve200ResponseInner,
    "PokemonEncountersRetrieve200ResponseInnerLocationArea": PokemonEncountersRetrieve200ResponseInnerLocationArea,
    "PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner": PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner,
    "PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner": PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner,
    "PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner": PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner,
    "PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod": PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod,
    "PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion": PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion,
    "PokemonFormDetail": PokemonFormDetail,
    "PokemonFormDetailFormNamesInner": PokemonFormDetailFormNamesInner,
    "PokemonFormDetailSprites": PokemonFormDetailSprites,
    "PokemonFormSummary": PokemonFormSummary,
    "PokemonGameIndex": PokemonGameIndex,
    "PokemonHabitatDetail": PokemonHabitatDetail,
    "PokemonHabitatName": PokemonHabitatName,
    "PokemonHabitatSummary": PokemonHabitatSummary,
    "PokemonShapeDetail": PokemonShapeDetail,
    "PokemonShapeDetailAwesomeNamesInner": PokemonShapeDetailAwesomeNamesInner,
    "PokemonShapeDetailNamesInner": PokemonShapeDetailNamesInner,
    "PokemonShapeSummary": PokemonShapeSummary,
    "PokemonSpeciesDescription": PokemonSpeciesDescription,
    "PokemonSpeciesDetail": PokemonSpeciesDetail,
    "PokemonSpeciesDetailGeneraInner": PokemonSpeciesDetailGeneraInner,
    "PokemonSpeciesDetailPalParkEncountersInner": PokemonSpeciesDetailPalParkEncountersInner,
    "PokemonSpeciesDetailVarietiesInner": PokemonSpeciesDetailVarietiesInner,
    "PokemonSpeciesFlavorText": PokemonSpeciesFlavorText,
    "PokemonSpeciesSummary": PokemonSpeciesSummary,
    "PokemonStat": PokemonStat,
    "PokemonSummary": PokemonSummary,
    "RegionDetail": RegionDetail,
    "RegionName": RegionName,
    "RegionSummary": RegionSummary,
    "StatDetail": StatDetail,
    "StatDetailAffectingMoves": StatDetailAffectingMoves,
    "StatDetailAffectingMovesIncreaseInner": StatDetailAffectingMovesIncreaseInner,
    "StatDetailAffectingNatures": StatDetailAffectingNatures,
    "StatName": StatName,
    "StatSummary": StatSummary,
    "SuperContestEffectDetail": SuperContestEffectDetail,
    "SuperContestEffectFlavorText": SuperContestEffectFlavorText,
    "SuperContestEffectSummary": SuperContestEffectSummary,
    "TypeDetail": TypeDetail,
    "TypeDetailDamageRelations": TypeDetailDamageRelations,
    "TypeDetailPastDamageRelationsInner": TypeDetailPastDamageRelationsInner,
    "TypeDetailPastDamageRelationsInnerDamageRelations": TypeDetailPastDamageRelationsInnerDamageRelations,
    "TypeDetailPokemonInner": TypeDetailPokemonInner,
    "TypeDetailPokemonInnerPokemon": TypeDetailPokemonInnerPokemon,
    "TypeDetailSpritesValueValue": TypeDetailSpritesValueValue,
    "TypeGameIndex": TypeGameIndex,
    "TypeSummary": TypeSummary,
    "VersionDetail": VersionDetail,
    "VersionGroupDetail": VersionGroupDetail,
    "VersionGroupSummary": VersionGroupSummary,
    "VersionName": VersionName,
    "VersionSummary": VersionSummary,
}

// Check if a string starts with another string without using es6 features
function startsWith(str: string, match: string): boolean {
    return str.substring(0, match.length) === match;
}

// Check if a string ends with another string without using es6 features
function endsWith(str: string, match: string): boolean {
    return str.length >= match.length && str.substring(str.length - match.length) === match;
}

const nullableSuffix = " | null";
const optionalSuffix = " | undefined";
const arrayPrefix = "Array<";
const arraySuffix = ">";
const mapPrefix = "{ [key: string]: ";
const mapSuffix = "; }";

export class ObjectSerializer {
    public static findCorrectType(data: any, expectedType: string) {
        if (data == undefined) {
            return expectedType;
        } else if (primitives.indexOf(expectedType.toLowerCase()) !== -1) {
            return expectedType;
        } else if (expectedType === "Date") {
            return expectedType;
        } else {
            if (enumsMap[expectedType]) {
                return expectedType;
            }

            if (!typeMap[expectedType]) {
                return expectedType; // w/e we don't know the type
            }

            // Check the discriminator
            let discriminatorProperty = typeMap[expectedType].discriminator;
            if (discriminatorProperty == null) {
                return expectedType; // the type does not have a discriminator. use it.
            } else {
                if (data[discriminatorProperty]) {
                    var discriminatorType = data[discriminatorProperty];
                    if(typeMap[discriminatorType]){
                        return discriminatorType; // use the type given in the discriminator
                    } else {
                        return expectedType; // discriminator did not map to a type
                    }
                } else {
                    return expectedType; // discriminator was not present (or an empty string)
                }
            }
        }
    }

    public static serialize(data: any, type: string): any {
        if (data == undefined) {
            return data;
        } else if (primitives.indexOf(type.toLowerCase()) !== -1) {
            return data;
        } else if (endsWith(type, nullableSuffix)) {
            let subType: string = type.slice(0, -nullableSuffix.length); // Type | null => Type
            return ObjectSerializer.serialize(data, subType);
        } else if (endsWith(type, optionalSuffix)) {
            let subType: string = type.slice(0, -optionalSuffix.length); // Type | undefined => Type
            return ObjectSerializer.serialize(data, subType);
        } else if (startsWith(type, arrayPrefix)) {
            let subType: string = type.slice(arrayPrefix.length, -arraySuffix.length); // Array<Type> => Type
            let transformedData: any[] = [];
            for (let index = 0; index < data.length; index++) {
                let datum = data[index];
                transformedData.push(ObjectSerializer.serialize(datum, subType));
            }
            return transformedData;
        } else if (startsWith(type, mapPrefix)) {
            let subType: string = type.slice(mapPrefix.length, -mapSuffix.length); // { [key: string]: Type; } => Type
            let transformedData: { [key: string]: any } = {};
            for (let key in data) {
                transformedData[key] = ObjectSerializer.serialize(
                    data[key],
                    subType,
                );
            }
            return transformedData;
        } else if (type === "Date") {
            return data.toISOString();
        } else {
            if (enumsMap[type]) {
                return data;
            }
            if (!typeMap[type]) { // in case we dont know the type
                return data;
            }

            // Get the actual type of this object
            type = this.findCorrectType(data, type);

            // get the map for the correct type.
            let attributeTypes = typeMap[type].getAttributeTypeMap();
            let instance: {[index: string]: any} = {};
            for (let index = 0; index < attributeTypes.length; index++) {
                let attributeType = attributeTypes[index];
                instance[attributeType.baseName] = ObjectSerializer.serialize(data[attributeType.name], attributeType.type);
            }
            return instance;
        }
    }

    public static deserialize(data: any, type: string): any {
        // polymorphism may change the actual type.
        type = ObjectSerializer.findCorrectType(data, type);
        if (data == undefined) {
            return data;
        } else if (primitives.indexOf(type.toLowerCase()) !== -1) {
            return data;
        } else if (endsWith(type, nullableSuffix)) {
            let subType: string = type.slice(0, -nullableSuffix.length); // Type | null => Type
            return ObjectSerializer.deserialize(data, subType);
        } else if (endsWith(type, optionalSuffix)) {
            let subType: string = type.slice(0, -optionalSuffix.length); // Type | undefined => Type
            return ObjectSerializer.deserialize(data, subType);
        } else if (startsWith(type, arrayPrefix)) {
            let subType: string = type.slice(arrayPrefix.length, -arraySuffix.length); // Array<Type> => Type
            let transformedData: any[] = [];
            for (let index = 0; index < data.length; index++) {
                let datum = data[index];
                transformedData.push(ObjectSerializer.deserialize(datum, subType));
            }
            return transformedData;
        } else if (startsWith(type, mapPrefix)) {
            let subType: string = type.slice(mapPrefix.length, -mapSuffix.length); // { [key: string]: Type; } => Type
            let transformedData: { [key: string]: any } = {};
            for (let key in data) {
                transformedData[key] = ObjectSerializer.deserialize(
                    data[key],
                    subType,
                );
            }
            return transformedData;
        } else if (type === "Date") {
            return new Date(data);
        } else {
            if (enumsMap[type]) {// is Enum
                return data;
            }

            if (!typeMap[type]) { // dont know the type
                return data;
            }
            let instance = new typeMap[type]();
            let attributeTypes = typeMap[type].getAttributeTypeMap();
            for (let index = 0; index < attributeTypes.length; index++) {
                let attributeType = attributeTypes[index];
                instance[attributeType.name] = ObjectSerializer.deserialize(data[attributeType.baseName], attributeType.type);
            }
            return instance;
        }
    }
}

export interface Authentication {
    /**
    * Apply authentication settings to header and query params.
    */
    applyToRequest(requestOptions: localVarRequest.Options): Promise<void> | void;
}

export class HttpBasicAuth implements Authentication {
    public username: string = '';
    public password: string = '';

    applyToRequest(requestOptions: localVarRequest.Options): void {
        requestOptions.auth = {
            username: this.username, password: this.password
        }
    }
}

export class HttpBearerAuth implements Authentication {
    public accessToken: string | (() => string) = '';

    applyToRequest(requestOptions: localVarRequest.Options): void {
        if (requestOptions && requestOptions.headers) {
            const accessToken = typeof this.accessToken === 'function'
                            ? this.accessToken()
                            : this.accessToken;
            requestOptions.headers["Authorization"] = "Bearer " + accessToken;
        }
    }
}

export class ApiKeyAuth implements Authentication {
    public apiKey: string = '';

    constructor(private location: string, private paramName: string) {
    }

    applyToRequest(requestOptions: localVarRequest.Options): void {
        if (this.location == "query") {
            (<any>requestOptions.qs)[this.paramName] = this.apiKey;
        } else if (this.location == "header" && requestOptions && requestOptions.headers) {
            requestOptions.headers[this.paramName] = this.apiKey;
        } else if (this.location == 'cookie' && requestOptions && requestOptions.headers) {
            if (requestOptions.headers['Cookie']) {
                requestOptions.headers['Cookie'] += '; ' + this.paramName + '=' + encodeURIComponent(this.apiKey);
            }
            else {
                requestOptions.headers['Cookie'] = this.paramName + '=' + encodeURIComponent(this.apiKey);
            }
        }
    }
}

export class OAuth implements Authentication {
    public accessToken: string = '';

    applyToRequest(requestOptions: localVarRequest.Options): void {
        if (requestOptions && requestOptions.headers) {
            requestOptions.headers["Authorization"] = "Bearer " + this.accessToken;
        }
    }
}

export class VoidAuth implements Authentication {
    public username: string = '';
    public password: string = '';

    applyToRequest(_: localVarRequest.Options): void {
        // Do nothing
    }
}

export type Interceptor = (requestOptions: localVarRequest.Options) => (Promise<void> | void);
