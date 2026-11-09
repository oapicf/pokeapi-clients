import localVarRequest from 'request';

export * from './abilityChange';
export * from './abilityChangeEffectText';
export * from './abilityDetail';
export * from './abilityEffectText';
export * from './abilityFlavorText';
export * from './abilityName';
export * from './abilityPokemonDetail';
export * from './abilitySummary';
export * from './berryDetail';
export * from './berryFirmnessDetail';
export * from './berryFirmnessName';
export * from './berryFirmnessSummary';
export * from './berryFlavorBerryMap';
export * from './berryFlavorDetail';
export * from './berryFlavorMap';
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
export * from './currencyDetail';
export * from './currencyName';
export * from './currencySummary';
export * from './eggGroupDetail';
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
export * from './encounterPokemonDetail';
export * from './evolutionChainDetail';
export * from './evolutionChainLink';
export * from './evolutionChainSummary';
export * from './evolutionConditionExpression';
export * from './evolutionTriggerDetail';
export * from './evolutionTriggerName';
export * from './evolutionTriggerSummary';
export * from './evolutionVariableDescription';
export * from './evolutionVariableDetail';
export * from './evolutionVariableName';
export * from './evolutionVariableSummary';
export * from './experience';
export * from './genderDetail';
export * from './genderPokemonSpecies';
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
export * from './itemEffectText';
export * from './itemFlavorText';
export * from './itemFlingEffectDetail';
export * from './itemFlingEffectEffectText';
export * from './itemFlingEffectSummary';
export * from './itemGameIndex';
export * from './itemMachine';
export * from './itemName';
export * from './itemPocketDetail';
export * from './itemPocketName';
export * from './itemPocketSummary';
export * from './itemPrice';
export * from './itemSprites';
export * from './itemSummary';
export * from './languageDetail';
export * from './languageName';
export * from './languageSummary';
export * from './locationAreaDetail';
export * from './locationAreaEncounterDetail';
export * from './locationAreaEncounterRate';
export * from './locationAreaEncounterVersionDetail';
export * from './locationAreaName';
export * from './locationAreaPokemonEncounter';
export * from './locationAreaPokemonEncounterVersion';
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
export * from './moveComboUsage';
export * from './moveCombos';
export * from './moveDamageClassDescription';
export * from './moveDamageClassDetail';
export * from './moveDamageClassName';
export * from './moveDamageClassSummary';
export * from './moveDetail';
export * from './moveEffectChange';
export * from './moveEffectChangeEffectText';
export * from './moveEffectEffectText';
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
export * from './moveMetaStatChange';
export * from './moveName';
export * from './moveStatChange';
export * from './moveSummary';
export * from './moveTargetDescription';
export * from './moveTargetDetail';
export * from './moveTargetName';
export * from './moveTargetSummary';
export * from './natureBattleStylePreference';
export * from './natureDetail';
export * from './natureName';
export * from './naturePokeathlonStat';
export * from './natureSummary';
export * from './paginatedAbilitySummaryList';
export * from './paginatedBerryFirmnessSummaryList';
export * from './paginatedBerryFlavorSummaryList';
export * from './paginatedBerrySummaryList';
export * from './paginatedCharacteristicSummaryList';
export * from './paginatedContestEffectSummaryList';
export * from './paginatedContestTypeSummaryList';
export * from './paginatedCurrencySummaryList';
export * from './paginatedEggGroupSummaryList';
export * from './paginatedEncounterConditionSummaryList';
export * from './paginatedEncounterConditionValueSummaryList';
export * from './paginatedEncounterMethodSummaryList';
export * from './paginatedEvolutionChainSummaryList';
export * from './paginatedEvolutionTriggerSummaryList';
export * from './paginatedEvolutionVariableSummaryList';
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
export * from './palParkAreaName';
export * from './palParkAreaSummary';
export * from './palParkEncounter';
export * from './pokeapiMetaResponse';
export * from './pokeathlonStatAffectingNature';
export * from './pokeathlonStatAffectingNatures';
export * from './pokeathlonStatDetail';
export * from './pokeathlonStatName';
export * from './pokeathlonStatSummary';
export * from './pokedexDescription';
export * from './pokedexDetail';
export * from './pokedexName';
export * from './pokedexSummary';
export * from './pokemonAbility';
export * from './pokemonAbilityPast';
export * from './pokemonColorDetail';
export * from './pokemonColorName';
export * from './pokemonColorSummary';
export * from './pokemonCries';
export * from './pokemonDetail';
export * from './pokemonDexEntry';
export * from './pokemonDexNumber';
export * from './pokemonEncounterDetailResponse';
export * from './pokemonEncounterResponse';
export * from './pokemonEncounterVersionDetailResponse';
export * from './pokemonEvolution';
export * from './pokemonEvolutionKnownMove';
export * from './pokemonFormDetail';
export * from './pokemonFormFlavorText';
export * from './pokemonFormName';
export * from './pokemonFormSprites';
export * from './pokemonFormSummary';
export * from './pokemonFormTriggerCondition';
export * from './pokemonFormType';
export * from './pokemonGameIndex';
export * from './pokemonHabitatDetail';
export * from './pokemonHabitatName';
export * from './pokemonHabitatSummary';
export * from './pokemonHeldItem';
export * from './pokemonHeldItemSummary';
export * from './pokemonHeldItemVersion';
export * from './pokemonMove';
export * from './pokemonMoveVersionGroup';
export * from './pokemonPastAbility';
export * from './pokemonPastStat';
export * from './pokemonPastType';
export * from './pokemonShapeAwesomeName';
export * from './pokemonShapeDetail';
export * from './pokemonShapeName';
export * from './pokemonShapeSummary';
export * from './pokemonSpeciesDescription';
export * from './pokemonSpeciesDetail';
export * from './pokemonSpeciesFlavorText';
export * from './pokemonSpeciesGenus';
export * from './pokemonSpeciesName';
export * from './pokemonSpeciesPalParkEncounter';
export * from './pokemonSpeciesSummary';
export * from './pokemonSpeciesVariety';
export * from './pokemonSprites';
export * from './pokemonSpritesOther';
export * from './pokemonSpritesOtherDreamWorld';
export * from './pokemonSpritesOtherHome';
export * from './pokemonSpritesOtherOfficialArtwork';
export * from './pokemonSpritesOtherShowdown';
export * from './pokemonStat';
export * from './pokemonSummary';
export * from './pokemonType';
export * from './regionDetail';
export * from './regionName';
export * from './regionSummary';
export * from './statAffectingMoves';
export * from './statAffectingNatures';
export * from './statDetail';
export * from './statName';
export * from './statSummary';
export * from './superContestEffectDetail';
export * from './superContestEffectFlavorText';
export * from './superContestEffectSummary';
export * from './typeDetail';
export * from './typeGameIndex';
export * from './typeGameSprite';
export * from './typeName';
export * from './typePastRelationships';
export * from './typePokemon';
export * from './typeRelationships';
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
import { AbilityEffectText } from './abilityEffectText';
import { AbilityFlavorText } from './abilityFlavorText';
import { AbilityName } from './abilityName';
import { AbilityPokemonDetail } from './abilityPokemonDetail';
import { AbilitySummary } from './abilitySummary';
import { BerryDetail } from './berryDetail';
import { BerryFirmnessDetail } from './berryFirmnessDetail';
import { BerryFirmnessName } from './berryFirmnessName';
import { BerryFirmnessSummary } from './berryFirmnessSummary';
import { BerryFlavorBerryMap } from './berryFlavorBerryMap';
import { BerryFlavorDetail } from './berryFlavorDetail';
import { BerryFlavorMap } from './berryFlavorMap';
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
import { CurrencyDetail } from './currencyDetail';
import { CurrencyName } from './currencyName';
import { CurrencySummary } from './currencySummary';
import { EggGroupDetail } from './eggGroupDetail';
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
import { EncounterPokemonDetail } from './encounterPokemonDetail';
import { EvolutionChainDetail } from './evolutionChainDetail';
import { EvolutionChainLink } from './evolutionChainLink';
import { EvolutionChainSummary } from './evolutionChainSummary';
import { EvolutionConditionExpression } from './evolutionConditionExpression';
import { EvolutionTriggerDetail } from './evolutionTriggerDetail';
import { EvolutionTriggerName } from './evolutionTriggerName';
import { EvolutionTriggerSummary } from './evolutionTriggerSummary';
import { EvolutionVariableDescription } from './evolutionVariableDescription';
import { EvolutionVariableDetail } from './evolutionVariableDetail';
import { EvolutionVariableName } from './evolutionVariableName';
import { EvolutionVariableSummary } from './evolutionVariableSummary';
import { Experience } from './experience';
import { GenderDetail } from './genderDetail';
import { GenderPokemonSpecies } from './genderPokemonSpecies';
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
import { ItemEffectText } from './itemEffectText';
import { ItemFlavorText } from './itemFlavorText';
import { ItemFlingEffectDetail } from './itemFlingEffectDetail';
import { ItemFlingEffectEffectText } from './itemFlingEffectEffectText';
import { ItemFlingEffectSummary } from './itemFlingEffectSummary';
import { ItemGameIndex } from './itemGameIndex';
import { ItemMachine } from './itemMachine';
import { ItemName } from './itemName';
import { ItemPocketDetail } from './itemPocketDetail';
import { ItemPocketName } from './itemPocketName';
import { ItemPocketSummary } from './itemPocketSummary';
import { ItemPrice } from './itemPrice';
import { ItemSprites } from './itemSprites';
import { ItemSummary } from './itemSummary';
import { LanguageDetail } from './languageDetail';
import { LanguageName } from './languageName';
import { LanguageSummary } from './languageSummary';
import { LocationAreaDetail } from './locationAreaDetail';
import { LocationAreaEncounterDetail } from './locationAreaEncounterDetail';
import { LocationAreaEncounterRate } from './locationAreaEncounterRate';
import { LocationAreaEncounterVersionDetail } from './locationAreaEncounterVersionDetail';
import { LocationAreaName } from './locationAreaName';
import { LocationAreaPokemonEncounter } from './locationAreaPokemonEncounter';
import { LocationAreaPokemonEncounterVersion } from './locationAreaPokemonEncounterVersion';
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
import { MoveComboUsage } from './moveComboUsage';
import { MoveCombos } from './moveCombos';
import { MoveDamageClassDescription } from './moveDamageClassDescription';
import { MoveDamageClassDetail } from './moveDamageClassDetail';
import { MoveDamageClassName } from './moveDamageClassName';
import { MoveDamageClassSummary } from './moveDamageClassSummary';
import { MoveDetail } from './moveDetail';
import { MoveEffectChange } from './moveEffectChange';
import { MoveEffectChangeEffectText } from './moveEffectChangeEffectText';
import { MoveEffectEffectText } from './moveEffectEffectText';
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
import { MoveMetaStatChange } from './moveMetaStatChange';
import { MoveName } from './moveName';
import { MoveStatChange } from './moveStatChange';
import { MoveSummary } from './moveSummary';
import { MoveTargetDescription } from './moveTargetDescription';
import { MoveTargetDetail } from './moveTargetDetail';
import { MoveTargetName } from './moveTargetName';
import { MoveTargetSummary } from './moveTargetSummary';
import { NatureBattleStylePreference } from './natureBattleStylePreference';
import { NatureDetail } from './natureDetail';
import { NatureName } from './natureName';
import { NaturePokeathlonStat } from './naturePokeathlonStat';
import { NatureSummary } from './natureSummary';
import { PaginatedAbilitySummaryList } from './paginatedAbilitySummaryList';
import { PaginatedBerryFirmnessSummaryList } from './paginatedBerryFirmnessSummaryList';
import { PaginatedBerryFlavorSummaryList } from './paginatedBerryFlavorSummaryList';
import { PaginatedBerrySummaryList } from './paginatedBerrySummaryList';
import { PaginatedCharacteristicSummaryList } from './paginatedCharacteristicSummaryList';
import { PaginatedContestEffectSummaryList } from './paginatedContestEffectSummaryList';
import { PaginatedContestTypeSummaryList } from './paginatedContestTypeSummaryList';
import { PaginatedCurrencySummaryList } from './paginatedCurrencySummaryList';
import { PaginatedEggGroupSummaryList } from './paginatedEggGroupSummaryList';
import { PaginatedEncounterConditionSummaryList } from './paginatedEncounterConditionSummaryList';
import { PaginatedEncounterConditionValueSummaryList } from './paginatedEncounterConditionValueSummaryList';
import { PaginatedEncounterMethodSummaryList } from './paginatedEncounterMethodSummaryList';
import { PaginatedEvolutionChainSummaryList } from './paginatedEvolutionChainSummaryList';
import { PaginatedEvolutionTriggerSummaryList } from './paginatedEvolutionTriggerSummaryList';
import { PaginatedEvolutionVariableSummaryList } from './paginatedEvolutionVariableSummaryList';
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
import { PalParkAreaName } from './palParkAreaName';
import { PalParkAreaSummary } from './palParkAreaSummary';
import { PalParkEncounter } from './palParkEncounter';
import { PokeapiMetaResponse } from './pokeapiMetaResponse';
import { PokeathlonStatAffectingNature } from './pokeathlonStatAffectingNature';
import { PokeathlonStatAffectingNatures } from './pokeathlonStatAffectingNatures';
import { PokeathlonStatDetail } from './pokeathlonStatDetail';
import { PokeathlonStatName } from './pokeathlonStatName';
import { PokeathlonStatSummary } from './pokeathlonStatSummary';
import { PokedexDescription } from './pokedexDescription';
import { PokedexDetail } from './pokedexDetail';
import { PokedexName } from './pokedexName';
import { PokedexSummary } from './pokedexSummary';
import { PokemonAbility } from './pokemonAbility';
import { PokemonAbilityPast } from './pokemonAbilityPast';
import { PokemonColorDetail } from './pokemonColorDetail';
import { PokemonColorName } from './pokemonColorName';
import { PokemonColorSummary } from './pokemonColorSummary';
import { PokemonCries } from './pokemonCries';
import { PokemonDetail } from './pokemonDetail';
import { PokemonDexEntry } from './pokemonDexEntry';
import { PokemonDexNumber } from './pokemonDexNumber';
import { PokemonEncounterDetailResponse } from './pokemonEncounterDetailResponse';
import { PokemonEncounterResponse } from './pokemonEncounterResponse';
import { PokemonEncounterVersionDetailResponse } from './pokemonEncounterVersionDetailResponse';
import { PokemonEvolution } from './pokemonEvolution';
import { PokemonEvolutionKnownMove } from './pokemonEvolutionKnownMove';
import { PokemonFormDetail } from './pokemonFormDetail';
import { PokemonFormFlavorText } from './pokemonFormFlavorText';
import { PokemonFormName } from './pokemonFormName';
import { PokemonFormSprites } from './pokemonFormSprites';
import { PokemonFormSummary } from './pokemonFormSummary';
import { PokemonFormTriggerCondition } from './pokemonFormTriggerCondition';
import { PokemonFormType } from './pokemonFormType';
import { PokemonGameIndex } from './pokemonGameIndex';
import { PokemonHabitatDetail } from './pokemonHabitatDetail';
import { PokemonHabitatName } from './pokemonHabitatName';
import { PokemonHabitatSummary } from './pokemonHabitatSummary';
import { PokemonHeldItem } from './pokemonHeldItem';
import { PokemonHeldItemSummary } from './pokemonHeldItemSummary';
import { PokemonHeldItemVersion } from './pokemonHeldItemVersion';
import { PokemonMove } from './pokemonMove';
import { PokemonMoveVersionGroup } from './pokemonMoveVersionGroup';
import { PokemonPastAbility } from './pokemonPastAbility';
import { PokemonPastStat } from './pokemonPastStat';
import { PokemonPastType } from './pokemonPastType';
import { PokemonShapeAwesomeName } from './pokemonShapeAwesomeName';
import { PokemonShapeDetail } from './pokemonShapeDetail';
import { PokemonShapeName } from './pokemonShapeName';
import { PokemonShapeSummary } from './pokemonShapeSummary';
import { PokemonSpeciesDescription } from './pokemonSpeciesDescription';
import { PokemonSpeciesDetail } from './pokemonSpeciesDetail';
import { PokemonSpeciesFlavorText } from './pokemonSpeciesFlavorText';
import { PokemonSpeciesGenus } from './pokemonSpeciesGenus';
import { PokemonSpeciesName } from './pokemonSpeciesName';
import { PokemonSpeciesPalParkEncounter } from './pokemonSpeciesPalParkEncounter';
import { PokemonSpeciesSummary } from './pokemonSpeciesSummary';
import { PokemonSpeciesVariety } from './pokemonSpeciesVariety';
import { PokemonSprites } from './pokemonSprites';
import { PokemonSpritesOther } from './pokemonSpritesOther';
import { PokemonSpritesOtherDreamWorld } from './pokemonSpritesOtherDreamWorld';
import { PokemonSpritesOtherHome } from './pokemonSpritesOtherHome';
import { PokemonSpritesOtherOfficialArtwork } from './pokemonSpritesOtherOfficialArtwork';
import { PokemonSpritesOtherShowdown } from './pokemonSpritesOtherShowdown';
import { PokemonStat } from './pokemonStat';
import { PokemonSummary } from './pokemonSummary';
import { PokemonType } from './pokemonType';
import { RegionDetail } from './regionDetail';
import { RegionName } from './regionName';
import { RegionSummary } from './regionSummary';
import { StatAffectingMoves } from './statAffectingMoves';
import { StatAffectingNatures } from './statAffectingNatures';
import { StatDetail } from './statDetail';
import { StatName } from './statName';
import { StatSummary } from './statSummary';
import { SuperContestEffectDetail } from './superContestEffectDetail';
import { SuperContestEffectFlavorText } from './superContestEffectFlavorText';
import { SuperContestEffectSummary } from './superContestEffectSummary';
import { TypeDetail } from './typeDetail';
import { TypeGameIndex } from './typeGameIndex';
import { TypeGameSprite } from './typeGameSprite';
import { TypeName } from './typeName';
import { TypePastRelationships } from './typePastRelationships';
import { TypePokemon } from './typePokemon';
import { TypeRelationships } from './typeRelationships';
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
    "AbilityEffectText": AbilityEffectText,
    "AbilityFlavorText": AbilityFlavorText,
    "AbilityName": AbilityName,
    "AbilityPokemonDetail": AbilityPokemonDetail,
    "AbilitySummary": AbilitySummary,
    "BerryDetail": BerryDetail,
    "BerryFirmnessDetail": BerryFirmnessDetail,
    "BerryFirmnessName": BerryFirmnessName,
    "BerryFirmnessSummary": BerryFirmnessSummary,
    "BerryFlavorBerryMap": BerryFlavorBerryMap,
    "BerryFlavorDetail": BerryFlavorDetail,
    "BerryFlavorMap": BerryFlavorMap,
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
    "CurrencyDetail": CurrencyDetail,
    "CurrencyName": CurrencyName,
    "CurrencySummary": CurrencySummary,
    "EggGroupDetail": EggGroupDetail,
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
    "EncounterPokemonDetail": EncounterPokemonDetail,
    "EvolutionChainDetail": EvolutionChainDetail,
    "EvolutionChainLink": EvolutionChainLink,
    "EvolutionChainSummary": EvolutionChainSummary,
    "EvolutionConditionExpression": EvolutionConditionExpression,
    "EvolutionTriggerDetail": EvolutionTriggerDetail,
    "EvolutionTriggerName": EvolutionTriggerName,
    "EvolutionTriggerSummary": EvolutionTriggerSummary,
    "EvolutionVariableDescription": EvolutionVariableDescription,
    "EvolutionVariableDetail": EvolutionVariableDetail,
    "EvolutionVariableName": EvolutionVariableName,
    "EvolutionVariableSummary": EvolutionVariableSummary,
    "Experience": Experience,
    "GenderDetail": GenderDetail,
    "GenderPokemonSpecies": GenderPokemonSpecies,
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
    "ItemEffectText": ItemEffectText,
    "ItemFlavorText": ItemFlavorText,
    "ItemFlingEffectDetail": ItemFlingEffectDetail,
    "ItemFlingEffectEffectText": ItemFlingEffectEffectText,
    "ItemFlingEffectSummary": ItemFlingEffectSummary,
    "ItemGameIndex": ItemGameIndex,
    "ItemMachine": ItemMachine,
    "ItemName": ItemName,
    "ItemPocketDetail": ItemPocketDetail,
    "ItemPocketName": ItemPocketName,
    "ItemPocketSummary": ItemPocketSummary,
    "ItemPrice": ItemPrice,
    "ItemSprites": ItemSprites,
    "ItemSummary": ItemSummary,
    "LanguageDetail": LanguageDetail,
    "LanguageName": LanguageName,
    "LanguageSummary": LanguageSummary,
    "LocationAreaDetail": LocationAreaDetail,
    "LocationAreaEncounterDetail": LocationAreaEncounterDetail,
    "LocationAreaEncounterRate": LocationAreaEncounterRate,
    "LocationAreaEncounterVersionDetail": LocationAreaEncounterVersionDetail,
    "LocationAreaName": LocationAreaName,
    "LocationAreaPokemonEncounter": LocationAreaPokemonEncounter,
    "LocationAreaPokemonEncounterVersion": LocationAreaPokemonEncounterVersion,
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
    "MoveComboUsage": MoveComboUsage,
    "MoveCombos": MoveCombos,
    "MoveDamageClassDescription": MoveDamageClassDescription,
    "MoveDamageClassDetail": MoveDamageClassDetail,
    "MoveDamageClassName": MoveDamageClassName,
    "MoveDamageClassSummary": MoveDamageClassSummary,
    "MoveDetail": MoveDetail,
    "MoveEffectChange": MoveEffectChange,
    "MoveEffectChangeEffectText": MoveEffectChangeEffectText,
    "MoveEffectEffectText": MoveEffectEffectText,
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
    "MoveMetaStatChange": MoveMetaStatChange,
    "MoveName": MoveName,
    "MoveStatChange": MoveStatChange,
    "MoveSummary": MoveSummary,
    "MoveTargetDescription": MoveTargetDescription,
    "MoveTargetDetail": MoveTargetDetail,
    "MoveTargetName": MoveTargetName,
    "MoveTargetSummary": MoveTargetSummary,
    "NatureBattleStylePreference": NatureBattleStylePreference,
    "NatureDetail": NatureDetail,
    "NatureName": NatureName,
    "NaturePokeathlonStat": NaturePokeathlonStat,
    "NatureSummary": NatureSummary,
    "PaginatedAbilitySummaryList": PaginatedAbilitySummaryList,
    "PaginatedBerryFirmnessSummaryList": PaginatedBerryFirmnessSummaryList,
    "PaginatedBerryFlavorSummaryList": PaginatedBerryFlavorSummaryList,
    "PaginatedBerrySummaryList": PaginatedBerrySummaryList,
    "PaginatedCharacteristicSummaryList": PaginatedCharacteristicSummaryList,
    "PaginatedContestEffectSummaryList": PaginatedContestEffectSummaryList,
    "PaginatedContestTypeSummaryList": PaginatedContestTypeSummaryList,
    "PaginatedCurrencySummaryList": PaginatedCurrencySummaryList,
    "PaginatedEggGroupSummaryList": PaginatedEggGroupSummaryList,
    "PaginatedEncounterConditionSummaryList": PaginatedEncounterConditionSummaryList,
    "PaginatedEncounterConditionValueSummaryList": PaginatedEncounterConditionValueSummaryList,
    "PaginatedEncounterMethodSummaryList": PaginatedEncounterMethodSummaryList,
    "PaginatedEvolutionChainSummaryList": PaginatedEvolutionChainSummaryList,
    "PaginatedEvolutionTriggerSummaryList": PaginatedEvolutionTriggerSummaryList,
    "PaginatedEvolutionVariableSummaryList": PaginatedEvolutionVariableSummaryList,
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
    "PalParkAreaName": PalParkAreaName,
    "PalParkAreaSummary": PalParkAreaSummary,
    "PalParkEncounter": PalParkEncounter,
    "PokeapiMetaResponse": PokeapiMetaResponse,
    "PokeathlonStatAffectingNature": PokeathlonStatAffectingNature,
    "PokeathlonStatAffectingNatures": PokeathlonStatAffectingNatures,
    "PokeathlonStatDetail": PokeathlonStatDetail,
    "PokeathlonStatName": PokeathlonStatName,
    "PokeathlonStatSummary": PokeathlonStatSummary,
    "PokedexDescription": PokedexDescription,
    "PokedexDetail": PokedexDetail,
    "PokedexName": PokedexName,
    "PokedexSummary": PokedexSummary,
    "PokemonAbility": PokemonAbility,
    "PokemonAbilityPast": PokemonAbilityPast,
    "PokemonColorDetail": PokemonColorDetail,
    "PokemonColorName": PokemonColorName,
    "PokemonColorSummary": PokemonColorSummary,
    "PokemonCries": PokemonCries,
    "PokemonDetail": PokemonDetail,
    "PokemonDexEntry": PokemonDexEntry,
    "PokemonDexNumber": PokemonDexNumber,
    "PokemonEncounterDetailResponse": PokemonEncounterDetailResponse,
    "PokemonEncounterResponse": PokemonEncounterResponse,
    "PokemonEncounterVersionDetailResponse": PokemonEncounterVersionDetailResponse,
    "PokemonEvolution": PokemonEvolution,
    "PokemonEvolutionKnownMove": PokemonEvolutionKnownMove,
    "PokemonFormDetail": PokemonFormDetail,
    "PokemonFormFlavorText": PokemonFormFlavorText,
    "PokemonFormName": PokemonFormName,
    "PokemonFormSprites": PokemonFormSprites,
    "PokemonFormSummary": PokemonFormSummary,
    "PokemonFormTriggerCondition": PokemonFormTriggerCondition,
    "PokemonFormType": PokemonFormType,
    "PokemonGameIndex": PokemonGameIndex,
    "PokemonHabitatDetail": PokemonHabitatDetail,
    "PokemonHabitatName": PokemonHabitatName,
    "PokemonHabitatSummary": PokemonHabitatSummary,
    "PokemonHeldItem": PokemonHeldItem,
    "PokemonHeldItemSummary": PokemonHeldItemSummary,
    "PokemonHeldItemVersion": PokemonHeldItemVersion,
    "PokemonMove": PokemonMove,
    "PokemonMoveVersionGroup": PokemonMoveVersionGroup,
    "PokemonPastAbility": PokemonPastAbility,
    "PokemonPastStat": PokemonPastStat,
    "PokemonPastType": PokemonPastType,
    "PokemonShapeAwesomeName": PokemonShapeAwesomeName,
    "PokemonShapeDetail": PokemonShapeDetail,
    "PokemonShapeName": PokemonShapeName,
    "PokemonShapeSummary": PokemonShapeSummary,
    "PokemonSpeciesDescription": PokemonSpeciesDescription,
    "PokemonSpeciesDetail": PokemonSpeciesDetail,
    "PokemonSpeciesFlavorText": PokemonSpeciesFlavorText,
    "PokemonSpeciesGenus": PokemonSpeciesGenus,
    "PokemonSpeciesName": PokemonSpeciesName,
    "PokemonSpeciesPalParkEncounter": PokemonSpeciesPalParkEncounter,
    "PokemonSpeciesSummary": PokemonSpeciesSummary,
    "PokemonSpeciesVariety": PokemonSpeciesVariety,
    "PokemonSprites": PokemonSprites,
    "PokemonSpritesOther": PokemonSpritesOther,
    "PokemonSpritesOtherDreamWorld": PokemonSpritesOtherDreamWorld,
    "PokemonSpritesOtherHome": PokemonSpritesOtherHome,
    "PokemonSpritesOtherOfficialArtwork": PokemonSpritesOtherOfficialArtwork,
    "PokemonSpritesOtherShowdown": PokemonSpritesOtherShowdown,
    "PokemonStat": PokemonStat,
    "PokemonSummary": PokemonSummary,
    "PokemonType": PokemonType,
    "RegionDetail": RegionDetail,
    "RegionName": RegionName,
    "RegionSummary": RegionSummary,
    "StatAffectingMoves": StatAffectingMoves,
    "StatAffectingNatures": StatAffectingNatures,
    "StatDetail": StatDetail,
    "StatName": StatName,
    "StatSummary": StatSummary,
    "SuperContestEffectDetail": SuperContestEffectDetail,
    "SuperContestEffectFlavorText": SuperContestEffectFlavorText,
    "SuperContestEffectSummary": SuperContestEffectSummary,
    "TypeDetail": TypeDetail,
    "TypeGameIndex": TypeGameIndex,
    "TypeGameSprite": TypeGameSprite,
    "TypeName": TypeName,
    "TypePastRelationships": TypePastRelationships,
    "TypePokemon": TypePokemon,
    "TypeRelationships": TypeRelationships,
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
            if (!(data instanceof Date)) {
                return data;
            }
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
                const value = Object.prototype.hasOwnProperty.call(data, attributeType.name)
                    ? data[attributeType.name]
                    : Object.prototype.hasOwnProperty.call(data, attributeType.baseName)
                        ? data[attributeType.baseName]
                        : undefined;
                instance[attributeType.baseName] = ObjectSerializer.serialize(value, attributeType.type);
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
