const AbilityApi = require('../apis/AbilityApi');
const BerryApi = require('../apis/BerryApi');
const BerryFirmnessApi = require('../apis/BerryFirmnessApi');
const BerryFlavorApi = require('../apis/BerryFlavorApi');
const CharacteristicApi = require('../apis/CharacteristicApi');
const ContestEffectApi = require('../apis/ContestEffectApi');
const ContestTypeApi = require('../apis/ContestTypeApi');
const EggGroupApi = require('../apis/EggGroupApi');
const EncounterConditionApi = require('../apis/EncounterConditionApi');
const EncounterConditionValueApi = require('../apis/EncounterConditionValueApi');
const EncounterMethodApi = require('../apis/EncounterMethodApi');
const EvolutionChainApi = require('../apis/EvolutionChainApi');
const EvolutionTriggerApi = require('../apis/EvolutionTriggerApi');
const GenderApi = require('../apis/GenderApi');
const GenerationApi = require('../apis/GenerationApi');
const GrowthRateApi = require('../apis/GrowthRateApi');
const ItemApi = require('../apis/ItemApi');
const ItemAttributeApi = require('../apis/ItemAttributeApi');
const ItemCategoryApi = require('../apis/ItemCategoryApi');
const ItemFlingEffectApi = require('../apis/ItemFlingEffectApi');
const ItemPocketApi = require('../apis/ItemPocketApi');
const LanguageApi = require('../apis/LanguageApi');
const LocationApi = require('../apis/LocationApi');
const LocationAreaApi = require('../apis/LocationAreaApi');
const MachineApi = require('../apis/MachineApi');
const MoveApi = require('../apis/MoveApi');
const MoveAilmentApi = require('../apis/MoveAilmentApi');
const MoveBattleStyleApi = require('../apis/MoveBattleStyleApi');
const MoveCategoryApi = require('../apis/MoveCategoryApi');
const MoveDamageClassApi = require('../apis/MoveDamageClassApi');
const MoveLearnMethodApi = require('../apis/MoveLearnMethodApi');
const MoveTargetApi = require('../apis/MoveTargetApi');
const NatureApi = require('../apis/NatureApi');
const PalParkAreaApi = require('../apis/PalParkAreaApi');
const PokeathlonStatApi = require('../apis/PokeathlonStatApi');
const PokedexApi = require('../apis/PokedexApi');
const PokemonApi = require('../apis/PokemonApi');
const PokemonColorApi = require('../apis/PokemonColorApi');
const PokemonFormApi = require('../apis/PokemonFormApi');
const PokemonHabitatApi = require('../apis/PokemonHabitatApi');
const PokemonShapeApi = require('../apis/PokemonShapeApi');
const PokemonSpeciesApi = require('../apis/PokemonSpeciesApi');
const RegionApi = require('../apis/RegionApi');
const StatApi = require('../apis/StatApi');
const SuperContestEffectApi = require('../apis/SuperContestEffectApi');
const TypeApi = require('../apis/TypeApi');
const VersionApi = require('../apis/VersionApi');
const VersionGroupApi = require('../apis/VersionGroupApi');
const { triggerMiddleware, isTrigger, searchMiddleware, hasSearchRequisites, isSearchAction, isCreateAction, createMiddleware } = require('../utils/utils');

const actions = {
    [AbilityApi.abilityList.key]: AbilityApi.abilityList,
    [AbilityApi.abilityRead.key]: AbilityApi.abilityRead,
    [BerryApi.berryList.key]: BerryApi.berryList,
    [BerryApi.berryRead.key]: BerryApi.berryRead,
    [BerryFirmnessApi.berryFirmnessList.key]: BerryFirmnessApi.berryFirmnessList,
    [BerryFirmnessApi.berryFirmnessRead.key]: BerryFirmnessApi.berryFirmnessRead,
    [BerryFlavorApi.berryFlavorList.key]: BerryFlavorApi.berryFlavorList,
    [BerryFlavorApi.berryFlavorRead.key]: BerryFlavorApi.berryFlavorRead,
    [CharacteristicApi.characteristicList.key]: CharacteristicApi.characteristicList,
    [CharacteristicApi.characteristicRead.key]: CharacteristicApi.characteristicRead,
    [ContestEffectApi.contestEffectList.key]: ContestEffectApi.contestEffectList,
    [ContestEffectApi.contestEffectRead.key]: ContestEffectApi.contestEffectRead,
    [ContestTypeApi.contestTypeList.key]: ContestTypeApi.contestTypeList,
    [ContestTypeApi.contestTypeRead.key]: ContestTypeApi.contestTypeRead,
    [EggGroupApi.eggGroupList.key]: EggGroupApi.eggGroupList,
    [EggGroupApi.eggGroupRead.key]: EggGroupApi.eggGroupRead,
    [EncounterConditionApi.encounterConditionList.key]: EncounterConditionApi.encounterConditionList,
    [EncounterConditionApi.encounterConditionRead.key]: EncounterConditionApi.encounterConditionRead,
    [EncounterConditionValueApi.encounterConditionValueList.key]: EncounterConditionValueApi.encounterConditionValueList,
    [EncounterConditionValueApi.encounterConditionValueRead.key]: EncounterConditionValueApi.encounterConditionValueRead,
    [EncounterMethodApi.encounterMethodList.key]: EncounterMethodApi.encounterMethodList,
    [EncounterMethodApi.encounterMethodRead.key]: EncounterMethodApi.encounterMethodRead,
    [EvolutionChainApi.evolutionChainList.key]: EvolutionChainApi.evolutionChainList,
    [EvolutionChainApi.evolutionChainRead.key]: EvolutionChainApi.evolutionChainRead,
    [EvolutionTriggerApi.evolutionTriggerList.key]: EvolutionTriggerApi.evolutionTriggerList,
    [EvolutionTriggerApi.evolutionTriggerRead.key]: EvolutionTriggerApi.evolutionTriggerRead,
    [GenderApi.genderList.key]: GenderApi.genderList,
    [GenderApi.genderRead.key]: GenderApi.genderRead,
    [GenerationApi.generationList.key]: GenerationApi.generationList,
    [GenerationApi.generationRead.key]: GenerationApi.generationRead,
    [GrowthRateApi.growthRateList.key]: GrowthRateApi.growthRateList,
    [GrowthRateApi.growthRateRead.key]: GrowthRateApi.growthRateRead,
    [ItemApi.itemList.key]: ItemApi.itemList,
    [ItemApi.itemRead.key]: ItemApi.itemRead,
    [ItemAttributeApi.itemAttributeList.key]: ItemAttributeApi.itemAttributeList,
    [ItemAttributeApi.itemAttributeRead.key]: ItemAttributeApi.itemAttributeRead,
    [ItemCategoryApi.itemCategoryList.key]: ItemCategoryApi.itemCategoryList,
    [ItemCategoryApi.itemCategoryRead.key]: ItemCategoryApi.itemCategoryRead,
    [ItemFlingEffectApi.itemFlingEffectList.key]: ItemFlingEffectApi.itemFlingEffectList,
    [ItemFlingEffectApi.itemFlingEffectRead.key]: ItemFlingEffectApi.itemFlingEffectRead,
    [ItemPocketApi.itemPocketList.key]: ItemPocketApi.itemPocketList,
    [ItemPocketApi.itemPocketRead.key]: ItemPocketApi.itemPocketRead,
    [LanguageApi.languageList.key]: LanguageApi.languageList,
    [LanguageApi.languageRead.key]: LanguageApi.languageRead,
    [LocationApi.locationList.key]: LocationApi.locationList,
    [LocationApi.locationRead.key]: LocationApi.locationRead,
    [LocationAreaApi.locationAreaList.key]: LocationAreaApi.locationAreaList,
    [LocationAreaApi.locationAreaRead.key]: LocationAreaApi.locationAreaRead,
    [MachineApi.machineList.key]: MachineApi.machineList,
    [MachineApi.machineRead.key]: MachineApi.machineRead,
    [MoveApi.moveList.key]: MoveApi.moveList,
    [MoveApi.moveRead.key]: MoveApi.moveRead,
    [MoveAilmentApi.moveAilmentList.key]: MoveAilmentApi.moveAilmentList,
    [MoveAilmentApi.moveAilmentRead.key]: MoveAilmentApi.moveAilmentRead,
    [MoveBattleStyleApi.moveBattleStyleList.key]: MoveBattleStyleApi.moveBattleStyleList,
    [MoveBattleStyleApi.moveBattleStyleRead.key]: MoveBattleStyleApi.moveBattleStyleRead,
    [MoveCategoryApi.moveCategoryList.key]: MoveCategoryApi.moveCategoryList,
    [MoveCategoryApi.moveCategoryRead.key]: MoveCategoryApi.moveCategoryRead,
    [MoveDamageClassApi.moveDamageClassList.key]: MoveDamageClassApi.moveDamageClassList,
    [MoveDamageClassApi.moveDamageClassRead.key]: MoveDamageClassApi.moveDamageClassRead,
    [MoveLearnMethodApi.moveLearnMethodList.key]: MoveLearnMethodApi.moveLearnMethodList,
    [MoveLearnMethodApi.moveLearnMethodRead.key]: MoveLearnMethodApi.moveLearnMethodRead,
    [MoveTargetApi.moveTargetList.key]: MoveTargetApi.moveTargetList,
    [MoveTargetApi.moveTargetRead.key]: MoveTargetApi.moveTargetRead,
    [NatureApi.natureList.key]: NatureApi.natureList,
    [NatureApi.natureRead.key]: NatureApi.natureRead,
    [PalParkAreaApi.palParkAreaList.key]: PalParkAreaApi.palParkAreaList,
    [PalParkAreaApi.palParkAreaRead.key]: PalParkAreaApi.palParkAreaRead,
    [PokeathlonStatApi.pokeathlonStatList.key]: PokeathlonStatApi.pokeathlonStatList,
    [PokeathlonStatApi.pokeathlonStatRead.key]: PokeathlonStatApi.pokeathlonStatRead,
    [PokedexApi.pokedexList.key]: PokedexApi.pokedexList,
    [PokedexApi.pokedexRead.key]: PokedexApi.pokedexRead,
    [PokemonApi.pokemonList.key]: PokemonApi.pokemonList,
    [PokemonApi.pokemonRead.key]: PokemonApi.pokemonRead,
    [PokemonColorApi.pokemonColorList.key]: PokemonColorApi.pokemonColorList,
    [PokemonColorApi.pokemonColorRead.key]: PokemonColorApi.pokemonColorRead,
    [PokemonFormApi.pokemonFormList.key]: PokemonFormApi.pokemonFormList,
    [PokemonFormApi.pokemonFormRead.key]: PokemonFormApi.pokemonFormRead,
    [PokemonHabitatApi.pokemonHabitatList.key]: PokemonHabitatApi.pokemonHabitatList,
    [PokemonHabitatApi.pokemonHabitatRead.key]: PokemonHabitatApi.pokemonHabitatRead,
    [PokemonShapeApi.pokemonShapeList.key]: PokemonShapeApi.pokemonShapeList,
    [PokemonShapeApi.pokemonShapeRead.key]: PokemonShapeApi.pokemonShapeRead,
    [PokemonSpeciesApi.pokemonSpeciesList.key]: PokemonSpeciesApi.pokemonSpeciesList,
    [PokemonSpeciesApi.pokemonSpeciesRead.key]: PokemonSpeciesApi.pokemonSpeciesRead,
    [RegionApi.regionList.key]: RegionApi.regionList,
    [RegionApi.regionRead.key]: RegionApi.regionRead,
    [StatApi.statList.key]: StatApi.statList,
    [StatApi.statRead.key]: StatApi.statRead,
    [SuperContestEffectApi.superContestEffectList.key]: SuperContestEffectApi.superContestEffectList,
    [SuperContestEffectApi.superContestEffectRead.key]: SuperContestEffectApi.superContestEffectRead,
    [TypeApi.typeList.key]: TypeApi.typeList,
    [TypeApi.typeRead.key]: TypeApi.typeRead,
    [VersionApi.versionList.key]: VersionApi.versionList,
    [VersionApi.versionRead.key]: VersionApi.versionRead,
    [VersionGroupApi.versionGroupList.key]: VersionGroupApi.versionGroupList,
    [VersionGroupApi.versionGroupRead.key]: VersionGroupApi.versionGroupRead,
}

module.exports = {
    searchActions: () => Object.entries(actions).reduce((actions, [key, value]) => isSearchAction(key) && hasSearchRequisites(value) ? {...actions, [key]: searchMiddleware(value)} : actions, {}),
    createActions: () => Object.entries(actions).reduce((actions, [key, value]) => isCreateAction(key) ? {...actions, [key]: createMiddleware(value)} : actions, {}),
    triggers: () => Object.entries(actions).reduce((actions, [key, value]) => isTrigger(key) ? {...actions, [key]: triggerMiddleware(value)} : actions, {}),
}
