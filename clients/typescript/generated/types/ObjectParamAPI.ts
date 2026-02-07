import { ResponseContext, RequestContext, HttpFile, HttpInfo } from '../http/http';
import { Configuration, ConfigurationOptions } from '../configuration'
import type { Middleware } from '../middleware';

import { AbilityChange } from '../models/AbilityChange';
import { AbilityChangeEffectText } from '../models/AbilityChangeEffectText';
import { AbilityDetail } from '../models/AbilityDetail';
import { AbilityDetailPokemonInner } from '../models/AbilityDetailPokemonInner';
import { AbilityDetailPokemonInnerPokemon } from '../models/AbilityDetailPokemonInnerPokemon';
import { AbilityEffectText } from '../models/AbilityEffectText';
import { AbilityFlavorText } from '../models/AbilityFlavorText';
import { AbilityName } from '../models/AbilityName';
import { AbilitySummary } from '../models/AbilitySummary';
import { BerryDetail } from '../models/BerryDetail';
import { BerryDetailFlavorsInner } from '../models/BerryDetailFlavorsInner';
import { BerryDetailFlavorsInnerFlavor } from '../models/BerryDetailFlavorsInnerFlavor';
import { BerryFirmnessDetail } from '../models/BerryFirmnessDetail';
import { BerryFirmnessName } from '../models/BerryFirmnessName';
import { BerryFirmnessSummary } from '../models/BerryFirmnessSummary';
import { BerryFlavorDetail } from '../models/BerryFlavorDetail';
import { BerryFlavorDetailBerriesInner } from '../models/BerryFlavorDetailBerriesInner';
import { BerryFlavorDetailBerriesInnerBerry } from '../models/BerryFlavorDetailBerriesInnerBerry';
import { BerryFlavorName } from '../models/BerryFlavorName';
import { BerryFlavorSummary } from '../models/BerryFlavorSummary';
import { BerrySummary } from '../models/BerrySummary';
import { CharacteristicDescription } from '../models/CharacteristicDescription';
import { CharacteristicDetail } from '../models/CharacteristicDetail';
import { CharacteristicSummary } from '../models/CharacteristicSummary';
import { ContestEffectDetail } from '../models/ContestEffectDetail';
import { ContestEffectEffectText } from '../models/ContestEffectEffectText';
import { ContestEffectFlavorText } from '../models/ContestEffectFlavorText';
import { ContestEffectSummary } from '../models/ContestEffectSummary';
import { ContestTypeDetail } from '../models/ContestTypeDetail';
import { ContestTypeName } from '../models/ContestTypeName';
import { ContestTypeSummary } from '../models/ContestTypeSummary';
import { EggGroupDetail } from '../models/EggGroupDetail';
import { EggGroupDetailPokemonSpeciesInner } from '../models/EggGroupDetailPokemonSpeciesInner';
import { EggGroupName } from '../models/EggGroupName';
import { EggGroupSummary } from '../models/EggGroupSummary';
import { EncounterConditionDetail } from '../models/EncounterConditionDetail';
import { EncounterConditionName } from '../models/EncounterConditionName';
import { EncounterConditionSummary } from '../models/EncounterConditionSummary';
import { EncounterConditionValueDetail } from '../models/EncounterConditionValueDetail';
import { EncounterConditionValueName } from '../models/EncounterConditionValueName';
import { EncounterConditionValueSummary } from '../models/EncounterConditionValueSummary';
import { EncounterMethodDetail } from '../models/EncounterMethodDetail';
import { EncounterMethodName } from '../models/EncounterMethodName';
import { EncounterMethodSummary } from '../models/EncounterMethodSummary';
import { EvolutionChainDetail } from '../models/EvolutionChainDetail';
import { EvolutionChainDetailChain } from '../models/EvolutionChainDetailChain';
import { EvolutionChainDetailChainEvolvesToInner } from '../models/EvolutionChainDetailChainEvolvesToInner';
import { EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner } from '../models/EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner';
import { EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender } from '../models/EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender';
import { EvolutionChainSummary } from '../models/EvolutionChainSummary';
import { EvolutionTriggerDetail } from '../models/EvolutionTriggerDetail';
import { EvolutionTriggerName } from '../models/EvolutionTriggerName';
import { EvolutionTriggerSummary } from '../models/EvolutionTriggerSummary';
import { Experience } from '../models/Experience';
import { GenderDetail } from '../models/GenderDetail';
import { GenderDetailPokemonSpeciesDetailsInner } from '../models/GenderDetailPokemonSpeciesDetailsInner';
import { GenderSummary } from '../models/GenderSummary';
import { GenerationDetail } from '../models/GenerationDetail';
import { GenerationName } from '../models/GenerationName';
import { GenerationSummary } from '../models/GenerationSummary';
import { GrowthRateDescription } from '../models/GrowthRateDescription';
import { GrowthRateDetail } from '../models/GrowthRateDetail';
import { GrowthRateSummary } from '../models/GrowthRateSummary';
import { ItemAttributeDescription } from '../models/ItemAttributeDescription';
import { ItemAttributeDetail } from '../models/ItemAttributeDetail';
import { ItemAttributeName } from '../models/ItemAttributeName';
import { ItemAttributeSummary } from '../models/ItemAttributeSummary';
import { ItemCategoryDetail } from '../models/ItemCategoryDetail';
import { ItemCategoryName } from '../models/ItemCategoryName';
import { ItemCategorySummary } from '../models/ItemCategorySummary';
import { ItemDetail } from '../models/ItemDetail';
import { ItemDetailBabyTriggerFor } from '../models/ItemDetailBabyTriggerFor';
import { ItemDetailHeldByPokemonInner } from '../models/ItemDetailHeldByPokemonInner';
import { ItemDetailHeldByPokemonInnerVersionDetailsInner } from '../models/ItemDetailHeldByPokemonInnerVersionDetailsInner';
import { ItemDetailMachinesInner } from '../models/ItemDetailMachinesInner';
import { ItemDetailSprites } from '../models/ItemDetailSprites';
import { ItemEffectText } from '../models/ItemEffectText';
import { ItemFlavorText } from '../models/ItemFlavorText';
import { ItemFlingEffectDetail } from '../models/ItemFlingEffectDetail';
import { ItemFlingEffectEffectText } from '../models/ItemFlingEffectEffectText';
import { ItemFlingEffectSummary } from '../models/ItemFlingEffectSummary';
import { ItemGameIndex } from '../models/ItemGameIndex';
import { ItemName } from '../models/ItemName';
import { ItemPocketDetail } from '../models/ItemPocketDetail';
import { ItemPocketName } from '../models/ItemPocketName';
import { ItemPocketSummary } from '../models/ItemPocketSummary';
import { ItemSummary } from '../models/ItemSummary';
import { LanguageDetail } from '../models/LanguageDetail';
import { LanguageName } from '../models/LanguageName';
import { LanguageSummary } from '../models/LanguageSummary';
import { LocationAreaDetail } from '../models/LocationAreaDetail';
import { LocationAreaDetailEncounterMethodRatesInner } from '../models/LocationAreaDetailEncounterMethodRatesInner';
import { LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner } from '../models/LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner';
import { LocationAreaDetailPokemonEncountersInner } from '../models/LocationAreaDetailPokemonEncountersInner';
import { LocationAreaDetailPokemonEncountersInnerVersionDetailsInner } from '../models/LocationAreaDetailPokemonEncountersInnerVersionDetailsInner';
import { LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails } from '../models/LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails';
import { LocationAreaName } from '../models/LocationAreaName';
import { LocationAreaSummary } from '../models/LocationAreaSummary';
import { LocationDetail } from '../models/LocationDetail';
import { LocationGameIndex } from '../models/LocationGameIndex';
import { LocationName } from '../models/LocationName';
import { LocationSummary } from '../models/LocationSummary';
import { MachineDetail } from '../models/MachineDetail';
import { MachineSummary } from '../models/MachineSummary';
import { MoveBattleStyleDetail } from '../models/MoveBattleStyleDetail';
import { MoveBattleStyleName } from '../models/MoveBattleStyleName';
import { MoveBattleStyleSummary } from '../models/MoveBattleStyleSummary';
import { MoveChange } from '../models/MoveChange';
import { MoveChangeEffectEntriesInner } from '../models/MoveChangeEffectEntriesInner';
import { MoveDamageClassDescription } from '../models/MoveDamageClassDescription';
import { MoveDamageClassDetail } from '../models/MoveDamageClassDetail';
import { MoveDamageClassName } from '../models/MoveDamageClassName';
import { MoveDamageClassSummary } from '../models/MoveDamageClassSummary';
import { MoveDetail } from '../models/MoveDetail';
import { MoveDetailContestCombos } from '../models/MoveDetailContestCombos';
import { MoveDetailContestCombosNormal } from '../models/MoveDetailContestCombosNormal';
import { MoveDetailEffectChangesInner } from '../models/MoveDetailEffectChangesInner';
import { MoveDetailEffectChangesInnerEffectEntriesInner } from '../models/MoveDetailEffectChangesInnerEffectEntriesInner';
import { MoveDetailMachinesInner } from '../models/MoveDetailMachinesInner';
import { MoveDetailMachinesInnerMachine } from '../models/MoveDetailMachinesInnerMachine';
import { MoveDetailStatChangesInner } from '../models/MoveDetailStatChangesInner';
import { MoveFlavorText } from '../models/MoveFlavorText';
import { MoveLearnMethodDescription } from '../models/MoveLearnMethodDescription';
import { MoveLearnMethodDetail } from '../models/MoveLearnMethodDetail';
import { MoveLearnMethodName } from '../models/MoveLearnMethodName';
import { MoveLearnMethodSummary } from '../models/MoveLearnMethodSummary';
import { MoveMeta } from '../models/MoveMeta';
import { MoveMetaAilmentDetail } from '../models/MoveMetaAilmentDetail';
import { MoveMetaAilmentName } from '../models/MoveMetaAilmentName';
import { MoveMetaAilmentSummary } from '../models/MoveMetaAilmentSummary';
import { MoveMetaCategoryDescription } from '../models/MoveMetaCategoryDescription';
import { MoveMetaCategoryDetail } from '../models/MoveMetaCategoryDetail';
import { MoveMetaCategorySummary } from '../models/MoveMetaCategorySummary';
import { MoveName } from '../models/MoveName';
import { MoveSummary } from '../models/MoveSummary';
import { MoveTargetDescription } from '../models/MoveTargetDescription';
import { MoveTargetDetail } from '../models/MoveTargetDetail';
import { MoveTargetName } from '../models/MoveTargetName';
import { MoveTargetSummary } from '../models/MoveTargetSummary';
import { NatureBattleStylePreference } from '../models/NatureBattleStylePreference';
import { NatureDetail } from '../models/NatureDetail';
import { NatureDetailPokeathlonStatChangesInner } from '../models/NatureDetailPokeathlonStatChangesInner';
import { NatureName } from '../models/NatureName';
import { NatureSummary } from '../models/NatureSummary';
import { PaginatedAbilitySummaryList } from '../models/PaginatedAbilitySummaryList';
import { PaginatedBerryFirmnessSummaryList } from '../models/PaginatedBerryFirmnessSummaryList';
import { PaginatedBerryFlavorSummaryList } from '../models/PaginatedBerryFlavorSummaryList';
import { PaginatedBerrySummaryList } from '../models/PaginatedBerrySummaryList';
import { PaginatedCharacteristicSummaryList } from '../models/PaginatedCharacteristicSummaryList';
import { PaginatedContestEffectSummaryList } from '../models/PaginatedContestEffectSummaryList';
import { PaginatedContestTypeSummaryList } from '../models/PaginatedContestTypeSummaryList';
import { PaginatedEggGroupSummaryList } from '../models/PaginatedEggGroupSummaryList';
import { PaginatedEncounterConditionSummaryList } from '../models/PaginatedEncounterConditionSummaryList';
import { PaginatedEncounterConditionValueSummaryList } from '../models/PaginatedEncounterConditionValueSummaryList';
import { PaginatedEncounterMethodSummaryList } from '../models/PaginatedEncounterMethodSummaryList';
import { PaginatedEvolutionChainSummaryList } from '../models/PaginatedEvolutionChainSummaryList';
import { PaginatedEvolutionTriggerSummaryList } from '../models/PaginatedEvolutionTriggerSummaryList';
import { PaginatedGenderSummaryList } from '../models/PaginatedGenderSummaryList';
import { PaginatedGenerationSummaryList } from '../models/PaginatedGenerationSummaryList';
import { PaginatedGrowthRateSummaryList } from '../models/PaginatedGrowthRateSummaryList';
import { PaginatedItemAttributeSummaryList } from '../models/PaginatedItemAttributeSummaryList';
import { PaginatedItemCategorySummaryList } from '../models/PaginatedItemCategorySummaryList';
import { PaginatedItemFlingEffectSummaryList } from '../models/PaginatedItemFlingEffectSummaryList';
import { PaginatedItemPocketSummaryList } from '../models/PaginatedItemPocketSummaryList';
import { PaginatedItemSummaryList } from '../models/PaginatedItemSummaryList';
import { PaginatedLanguageSummaryList } from '../models/PaginatedLanguageSummaryList';
import { PaginatedLocationAreaSummaryList } from '../models/PaginatedLocationAreaSummaryList';
import { PaginatedLocationSummaryList } from '../models/PaginatedLocationSummaryList';
import { PaginatedMachineSummaryList } from '../models/PaginatedMachineSummaryList';
import { PaginatedMoveBattleStyleSummaryList } from '../models/PaginatedMoveBattleStyleSummaryList';
import { PaginatedMoveDamageClassSummaryList } from '../models/PaginatedMoveDamageClassSummaryList';
import { PaginatedMoveLearnMethodSummaryList } from '../models/PaginatedMoveLearnMethodSummaryList';
import { PaginatedMoveMetaAilmentSummaryList } from '../models/PaginatedMoveMetaAilmentSummaryList';
import { PaginatedMoveMetaCategorySummaryList } from '../models/PaginatedMoveMetaCategorySummaryList';
import { PaginatedMoveSummaryList } from '../models/PaginatedMoveSummaryList';
import { PaginatedMoveTargetSummaryList } from '../models/PaginatedMoveTargetSummaryList';
import { PaginatedNatureSummaryList } from '../models/PaginatedNatureSummaryList';
import { PaginatedPalParkAreaSummaryList } from '../models/PaginatedPalParkAreaSummaryList';
import { PaginatedPokeathlonStatSummaryList } from '../models/PaginatedPokeathlonStatSummaryList';
import { PaginatedPokedexSummaryList } from '../models/PaginatedPokedexSummaryList';
import { PaginatedPokemonColorSummaryList } from '../models/PaginatedPokemonColorSummaryList';
import { PaginatedPokemonFormSummaryList } from '../models/PaginatedPokemonFormSummaryList';
import { PaginatedPokemonHabitatSummaryList } from '../models/PaginatedPokemonHabitatSummaryList';
import { PaginatedPokemonShapeSummaryList } from '../models/PaginatedPokemonShapeSummaryList';
import { PaginatedPokemonSpeciesSummaryList } from '../models/PaginatedPokemonSpeciesSummaryList';
import { PaginatedPokemonSummaryList } from '../models/PaginatedPokemonSummaryList';
import { PaginatedRegionSummaryList } from '../models/PaginatedRegionSummaryList';
import { PaginatedStatSummaryList } from '../models/PaginatedStatSummaryList';
import { PaginatedSuperContestEffectSummaryList } from '../models/PaginatedSuperContestEffectSummaryList';
import { PaginatedTypeSummaryList } from '../models/PaginatedTypeSummaryList';
import { PaginatedVersionGroupSummaryList } from '../models/PaginatedVersionGroupSummaryList';
import { PaginatedVersionSummaryList } from '../models/PaginatedVersionSummaryList';
import { PalParkAreaDetail } from '../models/PalParkAreaDetail';
import { PalParkAreaDetailPokemonEncountersInner } from '../models/PalParkAreaDetailPokemonEncountersInner';
import { PalParkAreaName } from '../models/PalParkAreaName';
import { PalParkAreaSummary } from '../models/PalParkAreaSummary';
import { PokeathlonStatDetail } from '../models/PokeathlonStatDetail';
import { PokeathlonStatDetailAffectingNatures } from '../models/PokeathlonStatDetailAffectingNatures';
import { PokeathlonStatDetailAffectingNaturesDecreaseInner } from '../models/PokeathlonStatDetailAffectingNaturesDecreaseInner';
import { PokeathlonStatDetailAffectingNaturesIncreaseInner } from '../models/PokeathlonStatDetailAffectingNaturesIncreaseInner';
import { PokeathlonStatName } from '../models/PokeathlonStatName';
import { PokeathlonStatSummary } from '../models/PokeathlonStatSummary';
import { PokedexDescription } from '../models/PokedexDescription';
import { PokedexDetail } from '../models/PokedexDetail';
import { PokedexDetailPokemonEntriesInner } from '../models/PokedexDetailPokemonEntriesInner';
import { PokedexName } from '../models/PokedexName';
import { PokedexSummary } from '../models/PokedexSummary';
import { PokemonColorDetail } from '../models/PokemonColorDetail';
import { PokemonColorName } from '../models/PokemonColorName';
import { PokemonColorSummary } from '../models/PokemonColorSummary';
import { PokemonDetail } from '../models/PokemonDetail';
import { PokemonDetailAbilitiesInner } from '../models/PokemonDetailAbilitiesInner';
import { PokemonDetailCries } from '../models/PokemonDetailCries';
import { PokemonDetailHeldItems } from '../models/PokemonDetailHeldItems';
import { PokemonDetailMovesInner } from '../models/PokemonDetailMovesInner';
import { PokemonDetailMovesInnerVersionGroupDetailsInner } from '../models/PokemonDetailMovesInnerVersionGroupDetailsInner';
import { PokemonDetailPastAbilitiesInner } from '../models/PokemonDetailPastAbilitiesInner';
import { PokemonDetailPastTypesInner } from '../models/PokemonDetailPastTypesInner';
import { PokemonDetailSprites } from '../models/PokemonDetailSprites';
import { PokemonDetailTypesInner } from '../models/PokemonDetailTypesInner';
import { PokemonDexEntry } from '../models/PokemonDexEntry';
import { PokemonFormDetail } from '../models/PokemonFormDetail';
import { PokemonFormDetailFormNamesInner } from '../models/PokemonFormDetailFormNamesInner';
import { PokemonFormDetailSprites } from '../models/PokemonFormDetailSprites';
import { PokemonFormSummary } from '../models/PokemonFormSummary';
import { PokemonGameIndex } from '../models/PokemonGameIndex';
import { PokemonHabitatDetail } from '../models/PokemonHabitatDetail';
import { PokemonHabitatName } from '../models/PokemonHabitatName';
import { PokemonHabitatSummary } from '../models/PokemonHabitatSummary';
import { PokemonShapeDetail } from '../models/PokemonShapeDetail';
import { PokemonShapeDetailAwesomeNamesInner } from '../models/PokemonShapeDetailAwesomeNamesInner';
import { PokemonShapeDetailNamesInner } from '../models/PokemonShapeDetailNamesInner';
import { PokemonShapeSummary } from '../models/PokemonShapeSummary';
import { PokemonSpeciesDescription } from '../models/PokemonSpeciesDescription';
import { PokemonSpeciesDetail } from '../models/PokemonSpeciesDetail';
import { PokemonSpeciesDetailGeneraInner } from '../models/PokemonSpeciesDetailGeneraInner';
import { PokemonSpeciesDetailPalParkEncountersInner } from '../models/PokemonSpeciesDetailPalParkEncountersInner';
import { PokemonSpeciesDetailVarietiesInner } from '../models/PokemonSpeciesDetailVarietiesInner';
import { PokemonSpeciesFlavorText } from '../models/PokemonSpeciesFlavorText';
import { PokemonSpeciesSummary } from '../models/PokemonSpeciesSummary';
import { PokemonStat } from '../models/PokemonStat';
import { PokemonSummary } from '../models/PokemonSummary';
import { RegionDetail } from '../models/RegionDetail';
import { RegionName } from '../models/RegionName';
import { RegionSummary } from '../models/RegionSummary';
import { StatDetail } from '../models/StatDetail';
import { StatDetailAffectingMoves } from '../models/StatDetailAffectingMoves';
import { StatDetailAffectingMovesIncreaseInner } from '../models/StatDetailAffectingMovesIncreaseInner';
import { StatDetailAffectingNatures } from '../models/StatDetailAffectingNatures';
import { StatName } from '../models/StatName';
import { StatSummary } from '../models/StatSummary';
import { SuperContestEffectDetail } from '../models/SuperContestEffectDetail';
import { SuperContestEffectFlavorText } from '../models/SuperContestEffectFlavorText';
import { SuperContestEffectSummary } from '../models/SuperContestEffectSummary';
import { TypeDetail } from '../models/TypeDetail';
import { TypeDetailDamageRelations } from '../models/TypeDetailDamageRelations';
import { TypeDetailPastDamageRelationsInner } from '../models/TypeDetailPastDamageRelationsInner';
import { TypeDetailPastDamageRelationsInnerDamageRelations } from '../models/TypeDetailPastDamageRelationsInnerDamageRelations';
import { TypeDetailPokemonInner } from '../models/TypeDetailPokemonInner';
import { TypeDetailPokemonInnerPokemon } from '../models/TypeDetailPokemonInnerPokemon';
import { TypeDetailSpritesValueValue } from '../models/TypeDetailSpritesValueValue';
import { TypeGameIndex } from '../models/TypeGameIndex';
import { TypeSummary } from '../models/TypeSummary';
import { VersionDetail } from '../models/VersionDetail';
import { VersionGroupDetail } from '../models/VersionGroupDetail';
import { VersionGroupSummary } from '../models/VersionGroupSummary';
import { VersionName } from '../models/VersionName';
import { VersionSummary } from '../models/VersionSummary';

import { ObservableBerriesApi } from "./ObservableAPI";
import { BerriesApiRequestFactory, BerriesApiResponseProcessor} from "../apis/BerriesApi";

export interface BerriesApiBerryFirmnessListRequest {
    /**
     * Number of results to return per page.
     * Defaults to: undefined
     * @type number
     * @memberof BerriesApiberryFirmnessList
     */
    limit?: number
    /**
     * The initial index from which to return the results.
     * Defaults to: undefined
     * @type number
     * @memberof BerriesApiberryFirmnessList
     */
    offset?: number
    /**
     * &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     * Defaults to: undefined
     * @type string
     * @memberof BerriesApiberryFirmnessList
     */
    q?: string
}

export interface BerriesApiBerryFirmnessRetrieveRequest {
    /**
     * This parameter can be a string or an integer.
     * Defaults to: undefined
     * @type string
     * @memberof BerriesApiberryFirmnessRetrieve
     */
    id: string
}

export interface BerriesApiBerryFlavorListRequest {
    /**
     * Number of results to return per page.
     * Defaults to: undefined
     * @type number
     * @memberof BerriesApiberryFlavorList
     */
    limit?: number
    /**
     * The initial index from which to return the results.
     * Defaults to: undefined
     * @type number
     * @memberof BerriesApiberryFlavorList
     */
    offset?: number
    /**
     * &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     * Defaults to: undefined
     * @type string
     * @memberof BerriesApiberryFlavorList
     */
    q?: string
}

export interface BerriesApiBerryFlavorRetrieveRequest {
    /**
     * This parameter can be a string or an integer.
     * Defaults to: undefined
     * @type string
     * @memberof BerriesApiberryFlavorRetrieve
     */
    id: string
}

export interface BerriesApiBerryListRequest {
    /**
     * Number of results to return per page.
     * Defaults to: undefined
     * @type number
     * @memberof BerriesApiberryList
     */
    limit?: number
    /**
     * The initial index from which to return the results.
     * Defaults to: undefined
     * @type number
     * @memberof BerriesApiberryList
     */
    offset?: number
    /**
     * &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     * Defaults to: undefined
     * @type string
     * @memberof BerriesApiberryList
     */
    q?: string
}

export interface BerriesApiBerryRetrieveRequest {
    /**
     * This parameter can be a string or an integer.
     * Defaults to: undefined
     * @type string
     * @memberof BerriesApiberryRetrieve
     */
    id: string
}

export class ObjectBerriesApi {
    private api: ObservableBerriesApi

    public constructor(configuration: Configuration, requestFactory?: BerriesApiRequestFactory, responseProcessor?: BerriesApiResponseProcessor) {
        this.api = new ObservableBerriesApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.
     * List berry firmness
     * @param param the request object
     */
    public berryFirmnessListWithHttpInfo(param: BerriesApiBerryFirmnessListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<PaginatedBerryFirmnessSummaryList>> {
        return this.api.berryFirmnessListWithHttpInfo(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.
     * List berry firmness
     * @param param the request object
     */
    public berryFirmnessList(param: BerriesApiBerryFirmnessListRequest = {}, options?: ConfigurationOptions): Promise<PaginatedBerryFirmnessSummaryList> {
        return this.api.berryFirmnessList(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.
     * Get berry by firmness
     * @param param the request object
     */
    public berryFirmnessRetrieveWithHttpInfo(param: BerriesApiBerryFirmnessRetrieveRequest, options?: ConfigurationOptions): Promise<HttpInfo<BerryFirmnessDetail>> {
        return this.api.berryFirmnessRetrieveWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.
     * Get berry by firmness
     * @param param the request object
     */
    public berryFirmnessRetrieve(param: BerriesApiBerryFirmnessRetrieveRequest, options?: ConfigurationOptions): Promise<BerryFirmnessDetail> {
        return this.api.berryFirmnessRetrieve(param.id,  options).toPromise();
    }

    /**
     * Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.
     * List berry flavors
     * @param param the request object
     */
    public berryFlavorListWithHttpInfo(param: BerriesApiBerryFlavorListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<PaginatedBerryFlavorSummaryList>> {
        return this.api.berryFlavorListWithHttpInfo(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.
     * List berry flavors
     * @param param the request object
     */
    public berryFlavorList(param: BerriesApiBerryFlavorListRequest = {}, options?: ConfigurationOptions): Promise<PaginatedBerryFlavorSummaryList> {
        return this.api.berryFlavorList(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.
     * Get berries by flavor
     * @param param the request object
     */
    public berryFlavorRetrieveWithHttpInfo(param: BerriesApiBerryFlavorRetrieveRequest, options?: ConfigurationOptions): Promise<HttpInfo<BerryFlavorDetail>> {
        return this.api.berryFlavorRetrieveWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.
     * Get berries by flavor
     * @param param the request object
     */
    public berryFlavorRetrieve(param: BerriesApiBerryFlavorRetrieveRequest, options?: ConfigurationOptions): Promise<BerryFlavorDetail> {
        return this.api.berryFlavorRetrieve(param.id,  options).toPromise();
    }

    /**
     * Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.
     * List berries
     * @param param the request object
     */
    public berryListWithHttpInfo(param: BerriesApiBerryListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<PaginatedBerrySummaryList>> {
        return this.api.berryListWithHttpInfo(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.
     * List berries
     * @param param the request object
     */
    public berryList(param: BerriesApiBerryListRequest = {}, options?: ConfigurationOptions): Promise<PaginatedBerrySummaryList> {
        return this.api.berryList(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.
     * Get a berry
     * @param param the request object
     */
    public berryRetrieveWithHttpInfo(param: BerriesApiBerryRetrieveRequest, options?: ConfigurationOptions): Promise<HttpInfo<BerryDetail>> {
        return this.api.berryRetrieveWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.
     * Get a berry
     * @param param the request object
     */
    public berryRetrieve(param: BerriesApiBerryRetrieveRequest, options?: ConfigurationOptions): Promise<BerryDetail> {
        return this.api.berryRetrieve(param.id,  options).toPromise();
    }

}

import { ObservableContestsApi } from "./ObservableAPI";
import { ContestsApiRequestFactory, ContestsApiResponseProcessor} from "../apis/ContestsApi";

export interface ContestsApiContestEffectListRequest {
    /**
     * Number of results to return per page.
     * Defaults to: undefined
     * @type number
     * @memberof ContestsApicontestEffectList
     */
    limit?: number
    /**
     * The initial index from which to return the results.
     * Defaults to: undefined
     * @type number
     * @memberof ContestsApicontestEffectList
     */
    offset?: number
    /**
     * &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     * Defaults to: undefined
     * @type string
     * @memberof ContestsApicontestEffectList
     */
    q?: string
}

export interface ContestsApiContestEffectRetrieveRequest {
    /**
     * This parameter can be a string or an integer.
     * Defaults to: undefined
     * @type string
     * @memberof ContestsApicontestEffectRetrieve
     */
    id: string
}

export interface ContestsApiContestTypeListRequest {
    /**
     * Number of results to return per page.
     * Defaults to: undefined
     * @type number
     * @memberof ContestsApicontestTypeList
     */
    limit?: number
    /**
     * The initial index from which to return the results.
     * Defaults to: undefined
     * @type number
     * @memberof ContestsApicontestTypeList
     */
    offset?: number
    /**
     * &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     * Defaults to: undefined
     * @type string
     * @memberof ContestsApicontestTypeList
     */
    q?: string
}

export interface ContestsApiContestTypeRetrieveRequest {
    /**
     * This parameter can be a string or an integer.
     * Defaults to: undefined
     * @type string
     * @memberof ContestsApicontestTypeRetrieve
     */
    id: string
}

export interface ContestsApiSuperContestEffectListRequest {
    /**
     * Number of results to return per page.
     * Defaults to: undefined
     * @type number
     * @memberof ContestsApisuperContestEffectList
     */
    limit?: number
    /**
     * The initial index from which to return the results.
     * Defaults to: undefined
     * @type number
     * @memberof ContestsApisuperContestEffectList
     */
    offset?: number
    /**
     * &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     * Defaults to: undefined
     * @type string
     * @memberof ContestsApisuperContestEffectList
     */
    q?: string
}

export interface ContestsApiSuperContestEffectRetrieveRequest {
    /**
     * This parameter can be a string or an integer.
     * Defaults to: undefined
     * @type string
     * @memberof ContestsApisuperContestEffectRetrieve
     */
    id: string
}

export class ObjectContestsApi {
    private api: ObservableContestsApi

    public constructor(configuration: Configuration, requestFactory?: ContestsApiRequestFactory, responseProcessor?: ContestsApiResponseProcessor) {
        this.api = new ObservableContestsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Contest effects refer to the effects of moves when used in contests.
     * List contest effects
     * @param param the request object
     */
    public contestEffectListWithHttpInfo(param: ContestsApiContestEffectListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<PaginatedContestEffectSummaryList>> {
        return this.api.contestEffectListWithHttpInfo(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Contest effects refer to the effects of moves when used in contests.
     * List contest effects
     * @param param the request object
     */
    public contestEffectList(param: ContestsApiContestEffectListRequest = {}, options?: ConfigurationOptions): Promise<PaginatedContestEffectSummaryList> {
        return this.api.contestEffectList(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Contest effects refer to the effects of moves when used in contests.
     * Get contest effect
     * @param param the request object
     */
    public contestEffectRetrieveWithHttpInfo(param: ContestsApiContestEffectRetrieveRequest, options?: ConfigurationOptions): Promise<HttpInfo<ContestEffectDetail>> {
        return this.api.contestEffectRetrieveWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * Contest effects refer to the effects of moves when used in contests.
     * Get contest effect
     * @param param the request object
     */
    public contestEffectRetrieve(param: ContestsApiContestEffectRetrieveRequest, options?: ConfigurationOptions): Promise<ContestEffectDetail> {
        return this.api.contestEffectRetrieve(param.id,  options).toPromise();
    }

    /**
     * Contest types are categories judges used to weigh a Pokémon\'s condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.
     * List contest types
     * @param param the request object
     */
    public contestTypeListWithHttpInfo(param: ContestsApiContestTypeListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<PaginatedContestTypeSummaryList>> {
        return this.api.contestTypeListWithHttpInfo(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Contest types are categories judges used to weigh a Pokémon\'s condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.
     * List contest types
     * @param param the request object
     */
    public contestTypeList(param: ContestsApiContestTypeListRequest = {}, options?: ConfigurationOptions): Promise<PaginatedContestTypeSummaryList> {
        return this.api.contestTypeList(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Contest types are categories judges used to weigh a Pokémon\'s condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.
     * Get contest type
     * @param param the request object
     */
    public contestTypeRetrieveWithHttpInfo(param: ContestsApiContestTypeRetrieveRequest, options?: ConfigurationOptions): Promise<HttpInfo<ContestTypeDetail>> {
        return this.api.contestTypeRetrieveWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * Contest types are categories judges used to weigh a Pokémon\'s condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.
     * Get contest type
     * @param param the request object
     */
    public contestTypeRetrieve(param: ContestsApiContestTypeRetrieveRequest, options?: ConfigurationOptions): Promise<ContestTypeDetail> {
        return this.api.contestTypeRetrieve(param.id,  options).toPromise();
    }

    /**
     * Super contest effects refer to the effects of moves when used in super contests.
     * List super contest effects
     * @param param the request object
     */
    public superContestEffectListWithHttpInfo(param: ContestsApiSuperContestEffectListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<PaginatedSuperContestEffectSummaryList>> {
        return this.api.superContestEffectListWithHttpInfo(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Super contest effects refer to the effects of moves when used in super contests.
     * List super contest effects
     * @param param the request object
     */
    public superContestEffectList(param: ContestsApiSuperContestEffectListRequest = {}, options?: ConfigurationOptions): Promise<PaginatedSuperContestEffectSummaryList> {
        return this.api.superContestEffectList(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Super contest effects refer to the effects of moves when used in super contests.
     * Get super contest effect
     * @param param the request object
     */
    public superContestEffectRetrieveWithHttpInfo(param: ContestsApiSuperContestEffectRetrieveRequest, options?: ConfigurationOptions): Promise<HttpInfo<SuperContestEffectDetail>> {
        return this.api.superContestEffectRetrieveWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * Super contest effects refer to the effects of moves when used in super contests.
     * Get super contest effect
     * @param param the request object
     */
    public superContestEffectRetrieve(param: ContestsApiSuperContestEffectRetrieveRequest, options?: ConfigurationOptions): Promise<SuperContestEffectDetail> {
        return this.api.superContestEffectRetrieve(param.id,  options).toPromise();
    }

}

import { ObservableEncountersApi } from "./ObservableAPI";
import { EncountersApiRequestFactory, EncountersApiResponseProcessor} from "../apis/EncountersApi";

export interface EncountersApiEncounterConditionListRequest {
    /**
     * Number of results to return per page.
     * Defaults to: undefined
     * @type number
     * @memberof EncountersApiencounterConditionList
     */
    limit?: number
    /**
     * The initial index from which to return the results.
     * Defaults to: undefined
     * @type number
     * @memberof EncountersApiencounterConditionList
     */
    offset?: number
    /**
     * &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     * Defaults to: undefined
     * @type string
     * @memberof EncountersApiencounterConditionList
     */
    q?: string
}

export interface EncountersApiEncounterConditionRetrieveRequest {
    /**
     * This parameter can be a string or an integer.
     * Defaults to: undefined
     * @type string
     * @memberof EncountersApiencounterConditionRetrieve
     */
    id: string
}

export interface EncountersApiEncounterConditionValueListRequest {
    /**
     * Number of results to return per page.
     * Defaults to: undefined
     * @type number
     * @memberof EncountersApiencounterConditionValueList
     */
    limit?: number
    /**
     * The initial index from which to return the results.
     * Defaults to: undefined
     * @type number
     * @memberof EncountersApiencounterConditionValueList
     */
    offset?: number
    /**
     * &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     * Defaults to: undefined
     * @type string
     * @memberof EncountersApiencounterConditionValueList
     */
    q?: string
}

export interface EncountersApiEncounterConditionValueRetrieveRequest {
    /**
     * This parameter can be a string or an integer.
     * Defaults to: undefined
     * @type string
     * @memberof EncountersApiencounterConditionValueRetrieve
     */
    id: string
}

export interface EncountersApiEncounterMethodListRequest {
    /**
     * Number of results to return per page.
     * Defaults to: undefined
     * @type number
     * @memberof EncountersApiencounterMethodList
     */
    limit?: number
    /**
     * The initial index from which to return the results.
     * Defaults to: undefined
     * @type number
     * @memberof EncountersApiencounterMethodList
     */
    offset?: number
    /**
     * &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     * Defaults to: undefined
     * @type string
     * @memberof EncountersApiencounterMethodList
     */
    q?: string
}

export interface EncountersApiEncounterMethodRetrieveRequest {
    /**
     * This parameter can be a string or an integer.
     * Defaults to: undefined
     * @type string
     * @memberof EncountersApiencounterMethodRetrieve
     */
    id: string
}

export class ObjectEncountersApi {
    private api: ObservableEncountersApi

    public constructor(configuration: Configuration, requestFactory?: EncountersApiRequestFactory, responseProcessor?: EncountersApiResponseProcessor) {
        this.api = new ObservableEncountersApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Conditions which affect what pokemon might appear in the wild, e.g., day or night.
     * List encounter conditions
     * @param param the request object
     */
    public encounterConditionListWithHttpInfo(param: EncountersApiEncounterConditionListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<PaginatedEncounterConditionSummaryList>> {
        return this.api.encounterConditionListWithHttpInfo(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Conditions which affect what pokemon might appear in the wild, e.g., day or night.
     * List encounter conditions
     * @param param the request object
     */
    public encounterConditionList(param: EncountersApiEncounterConditionListRequest = {}, options?: ConfigurationOptions): Promise<PaginatedEncounterConditionSummaryList> {
        return this.api.encounterConditionList(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Conditions which affect what pokemon might appear in the wild, e.g., day or night.
     * Get encounter condition
     * @param param the request object
     */
    public encounterConditionRetrieveWithHttpInfo(param: EncountersApiEncounterConditionRetrieveRequest, options?: ConfigurationOptions): Promise<HttpInfo<EncounterConditionDetail>> {
        return this.api.encounterConditionRetrieveWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * Conditions which affect what pokemon might appear in the wild, e.g., day or night.
     * Get encounter condition
     * @param param the request object
     */
    public encounterConditionRetrieve(param: EncountersApiEncounterConditionRetrieveRequest, options?: ConfigurationOptions): Promise<EncounterConditionDetail> {
        return this.api.encounterConditionRetrieve(param.id,  options).toPromise();
    }

    /**
     * Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.
     * List encounter condition values
     * @param param the request object
     */
    public encounterConditionValueListWithHttpInfo(param: EncountersApiEncounterConditionValueListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<PaginatedEncounterConditionValueSummaryList>> {
        return this.api.encounterConditionValueListWithHttpInfo(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.
     * List encounter condition values
     * @param param the request object
     */
    public encounterConditionValueList(param: EncountersApiEncounterConditionValueListRequest = {}, options?: ConfigurationOptions): Promise<PaginatedEncounterConditionValueSummaryList> {
        return this.api.encounterConditionValueList(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.
     * Get encounter condition value
     * @param param the request object
     */
    public encounterConditionValueRetrieveWithHttpInfo(param: EncountersApiEncounterConditionValueRetrieveRequest, options?: ConfigurationOptions): Promise<HttpInfo<EncounterConditionValueDetail>> {
        return this.api.encounterConditionValueRetrieveWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.
     * Get encounter condition value
     * @param param the request object
     */
    public encounterConditionValueRetrieve(param: EncountersApiEncounterConditionValueRetrieveRequest, options?: ConfigurationOptions): Promise<EncounterConditionValueDetail> {
        return this.api.encounterConditionValueRetrieve(param.id,  options).toPromise();
    }

    /**
     * Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.
     * List encounter methods
     * @param param the request object
     */
    public encounterMethodListWithHttpInfo(param: EncountersApiEncounterMethodListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<PaginatedEncounterMethodSummaryList>> {
        return this.api.encounterMethodListWithHttpInfo(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.
     * List encounter methods
     * @param param the request object
     */
    public encounterMethodList(param: EncountersApiEncounterMethodListRequest = {}, options?: ConfigurationOptions): Promise<PaginatedEncounterMethodSummaryList> {
        return this.api.encounterMethodList(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.
     * Get encounter method
     * @param param the request object
     */
    public encounterMethodRetrieveWithHttpInfo(param: EncountersApiEncounterMethodRetrieveRequest, options?: ConfigurationOptions): Promise<HttpInfo<EncounterMethodDetail>> {
        return this.api.encounterMethodRetrieveWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.
     * Get encounter method
     * @param param the request object
     */
    public encounterMethodRetrieve(param: EncountersApiEncounterMethodRetrieveRequest, options?: ConfigurationOptions): Promise<EncounterMethodDetail> {
        return this.api.encounterMethodRetrieve(param.id,  options).toPromise();
    }

}

import { ObservableEvolutionApi } from "./ObservableAPI";
import { EvolutionApiRequestFactory, EvolutionApiResponseProcessor} from "../apis/EvolutionApi";

export interface EvolutionApiEvolutionChainListRequest {
    /**
     * Number of results to return per page.
     * Defaults to: undefined
     * @type number
     * @memberof EvolutionApievolutionChainList
     */
    limit?: number
    /**
     * The initial index from which to return the results.
     * Defaults to: undefined
     * @type number
     * @memberof EvolutionApievolutionChainList
     */
    offset?: number
    /**
     * &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     * Defaults to: undefined
     * @type string
     * @memberof EvolutionApievolutionChainList
     */
    q?: string
}

export interface EvolutionApiEvolutionChainRetrieveRequest {
    /**
     * This parameter can be a string or an integer.
     * Defaults to: undefined
     * @type string
     * @memberof EvolutionApievolutionChainRetrieve
     */
    id: string
}

export interface EvolutionApiEvolutionTriggerListRequest {
    /**
     * Number of results to return per page.
     * Defaults to: undefined
     * @type number
     * @memberof EvolutionApievolutionTriggerList
     */
    limit?: number
    /**
     * The initial index from which to return the results.
     * Defaults to: undefined
     * @type number
     * @memberof EvolutionApievolutionTriggerList
     */
    offset?: number
    /**
     * &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     * Defaults to: undefined
     * @type string
     * @memberof EvolutionApievolutionTriggerList
     */
    q?: string
}

export interface EvolutionApiEvolutionTriggerRetrieveRequest {
    /**
     * This parameter can be a string or an integer.
     * Defaults to: undefined
     * @type string
     * @memberof EvolutionApievolutionTriggerRetrieve
     */
    id: string
}

export class ObjectEvolutionApi {
    private api: ObservableEvolutionApi

    public constructor(configuration: Configuration, requestFactory?: EvolutionApiRequestFactory, responseProcessor?: EvolutionApiResponseProcessor) {
        this.api = new ObservableEvolutionApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.
     * List evolution chains
     * @param param the request object
     */
    public evolutionChainListWithHttpInfo(param: EvolutionApiEvolutionChainListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<PaginatedEvolutionChainSummaryList>> {
        return this.api.evolutionChainListWithHttpInfo(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.
     * List evolution chains
     * @param param the request object
     */
    public evolutionChainList(param: EvolutionApiEvolutionChainListRequest = {}, options?: ConfigurationOptions): Promise<PaginatedEvolutionChainSummaryList> {
        return this.api.evolutionChainList(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.
     * Get evolution chain
     * @param param the request object
     */
    public evolutionChainRetrieveWithHttpInfo(param: EvolutionApiEvolutionChainRetrieveRequest, options?: ConfigurationOptions): Promise<HttpInfo<EvolutionChainDetail>> {
        return this.api.evolutionChainRetrieveWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.
     * Get evolution chain
     * @param param the request object
     */
    public evolutionChainRetrieve(param: EvolutionApiEvolutionChainRetrieveRequest, options?: ConfigurationOptions): Promise<EvolutionChainDetail> {
        return this.api.evolutionChainRetrieve(param.id,  options).toPromise();
    }

    /**
     * Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.
     * List evolution triggers
     * @param param the request object
     */
    public evolutionTriggerListWithHttpInfo(param: EvolutionApiEvolutionTriggerListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<PaginatedEvolutionTriggerSummaryList>> {
        return this.api.evolutionTriggerListWithHttpInfo(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.
     * List evolution triggers
     * @param param the request object
     */
    public evolutionTriggerList(param: EvolutionApiEvolutionTriggerListRequest = {}, options?: ConfigurationOptions): Promise<PaginatedEvolutionTriggerSummaryList> {
        return this.api.evolutionTriggerList(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.
     * Get evolution trigger
     * @param param the request object
     */
    public evolutionTriggerRetrieveWithHttpInfo(param: EvolutionApiEvolutionTriggerRetrieveRequest, options?: ConfigurationOptions): Promise<HttpInfo<EvolutionTriggerDetail>> {
        return this.api.evolutionTriggerRetrieveWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.
     * Get evolution trigger
     * @param param the request object
     */
    public evolutionTriggerRetrieve(param: EvolutionApiEvolutionTriggerRetrieveRequest, options?: ConfigurationOptions): Promise<EvolutionTriggerDetail> {
        return this.api.evolutionTriggerRetrieve(param.id,  options).toPromise();
    }

}

import { ObservableGamesApi } from "./ObservableAPI";
import { GamesApiRequestFactory, GamesApiResponseProcessor} from "../apis/GamesApi";

export interface GamesApiGenerationListRequest {
    /**
     * Number of results to return per page.
     * Defaults to: undefined
     * @type number
     * @memberof GamesApigenerationList
     */
    limit?: number
    /**
     * The initial index from which to return the results.
     * Defaults to: undefined
     * @type number
     * @memberof GamesApigenerationList
     */
    offset?: number
    /**
     * &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     * Defaults to: undefined
     * @type string
     * @memberof GamesApigenerationList
     */
    q?: string
}

export interface GamesApiGenerationRetrieveRequest {
    /**
     * This parameter can be a string or an integer.
     * Defaults to: undefined
     * @type string
     * @memberof GamesApigenerationRetrieve
     */
    id: string
}

export interface GamesApiPokedexListRequest {
    /**
     * Number of results to return per page.
     * Defaults to: undefined
     * @type number
     * @memberof GamesApipokedexList
     */
    limit?: number
    /**
     * The initial index from which to return the results.
     * Defaults to: undefined
     * @type number
     * @memberof GamesApipokedexList
     */
    offset?: number
    /**
     * &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     * Defaults to: undefined
     * @type string
     * @memberof GamesApipokedexList
     */
    q?: string
}

export interface GamesApiPokedexRetrieveRequest {
    /**
     * This parameter can be a string or an integer.
     * Defaults to: undefined
     * @type string
     * @memberof GamesApipokedexRetrieve
     */
    id: string
}

export interface GamesApiVersionGroupListRequest {
    /**
     * Number of results to return per page.
     * Defaults to: undefined
     * @type number
     * @memberof GamesApiversionGroupList
     */
    limit?: number
    /**
     * The initial index from which to return the results.
     * Defaults to: undefined
     * @type number
     * @memberof GamesApiversionGroupList
     */
    offset?: number
    /**
     * &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     * Defaults to: undefined
     * @type string
     * @memberof GamesApiversionGroupList
     */
    q?: string
}

export interface GamesApiVersionGroupRetrieveRequest {
    /**
     * This parameter can be a string or an integer.
     * Defaults to: undefined
     * @type string
     * @memberof GamesApiversionGroupRetrieve
     */
    id: string
}

export interface GamesApiVersionListRequest {
    /**
     * Number of results to return per page.
     * Defaults to: undefined
     * @type number
     * @memberof GamesApiversionList
     */
    limit?: number
    /**
     * The initial index from which to return the results.
     * Defaults to: undefined
     * @type number
     * @memberof GamesApiversionList
     */
    offset?: number
    /**
     * &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     * Defaults to: undefined
     * @type string
     * @memberof GamesApiversionList
     */
    q?: string
}

export interface GamesApiVersionRetrieveRequest {
    /**
     * This parameter can be a string or an integer.
     * Defaults to: undefined
     * @type string
     * @memberof GamesApiversionRetrieve
     */
    id: string
}

export class ObjectGamesApi {
    private api: ObservableGamesApi

    public constructor(configuration: Configuration, requestFactory?: GamesApiRequestFactory, responseProcessor?: GamesApiResponseProcessor) {
        this.api = new ObservableGamesApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.
     * List genrations
     * @param param the request object
     */
    public generationListWithHttpInfo(param: GamesApiGenerationListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<PaginatedGenerationSummaryList>> {
        return this.api.generationListWithHttpInfo(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.
     * List genrations
     * @param param the request object
     */
    public generationList(param: GamesApiGenerationListRequest = {}, options?: ConfigurationOptions): Promise<PaginatedGenerationSummaryList> {
        return this.api.generationList(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.
     * Get genration
     * @param param the request object
     */
    public generationRetrieveWithHttpInfo(param: GamesApiGenerationRetrieveRequest, options?: ConfigurationOptions): Promise<HttpInfo<GenerationDetail>> {
        return this.api.generationRetrieveWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.
     * Get genration
     * @param param the request object
     */
    public generationRetrieve(param: GamesApiGenerationRetrieveRequest, options?: ConfigurationOptions): Promise<GenerationDetail> {
        return this.api.generationRetrieve(param.id,  options).toPromise();
    }

    /**
     * A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.
     * List pokedex
     * @param param the request object
     */
    public pokedexListWithHttpInfo(param: GamesApiPokedexListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<PaginatedPokedexSummaryList>> {
        return this.api.pokedexListWithHttpInfo(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.
     * List pokedex
     * @param param the request object
     */
    public pokedexList(param: GamesApiPokedexListRequest = {}, options?: ConfigurationOptions): Promise<PaginatedPokedexSummaryList> {
        return this.api.pokedexList(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.
     * Get pokedex
     * @param param the request object
     */
    public pokedexRetrieveWithHttpInfo(param: GamesApiPokedexRetrieveRequest, options?: ConfigurationOptions): Promise<HttpInfo<PokedexDetail>> {
        return this.api.pokedexRetrieveWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.
     * Get pokedex
     * @param param the request object
     */
    public pokedexRetrieve(param: GamesApiPokedexRetrieveRequest, options?: ConfigurationOptions): Promise<PokedexDetail> {
        return this.api.pokedexRetrieve(param.id,  options).toPromise();
    }

    /**
     * Version groups categorize highly similar versions of the games.
     * List version groups
     * @param param the request object
     */
    public versionGroupListWithHttpInfo(param: GamesApiVersionGroupListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<PaginatedVersionGroupSummaryList>> {
        return this.api.versionGroupListWithHttpInfo(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Version groups categorize highly similar versions of the games.
     * List version groups
     * @param param the request object
     */
    public versionGroupList(param: GamesApiVersionGroupListRequest = {}, options?: ConfigurationOptions): Promise<PaginatedVersionGroupSummaryList> {
        return this.api.versionGroupList(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Version groups categorize highly similar versions of the games.
     * Get version group
     * @param param the request object
     */
    public versionGroupRetrieveWithHttpInfo(param: GamesApiVersionGroupRetrieveRequest, options?: ConfigurationOptions): Promise<HttpInfo<VersionGroupDetail>> {
        return this.api.versionGroupRetrieveWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * Version groups categorize highly similar versions of the games.
     * Get version group
     * @param param the request object
     */
    public versionGroupRetrieve(param: GamesApiVersionGroupRetrieveRequest, options?: ConfigurationOptions): Promise<VersionGroupDetail> {
        return this.api.versionGroupRetrieve(param.id,  options).toPromise();
    }

    /**
     * Versions of the games, e.g., Red, Blue or Yellow.
     * List versions
     * @param param the request object
     */
    public versionListWithHttpInfo(param: GamesApiVersionListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<PaginatedVersionSummaryList>> {
        return this.api.versionListWithHttpInfo(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Versions of the games, e.g., Red, Blue or Yellow.
     * List versions
     * @param param the request object
     */
    public versionList(param: GamesApiVersionListRequest = {}, options?: ConfigurationOptions): Promise<PaginatedVersionSummaryList> {
        return this.api.versionList(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Versions of the games, e.g., Red, Blue or Yellow.
     * Get version
     * @param param the request object
     */
    public versionRetrieveWithHttpInfo(param: GamesApiVersionRetrieveRequest, options?: ConfigurationOptions): Promise<HttpInfo<VersionDetail>> {
        return this.api.versionRetrieveWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * Versions of the games, e.g., Red, Blue or Yellow.
     * Get version
     * @param param the request object
     */
    public versionRetrieve(param: GamesApiVersionRetrieveRequest, options?: ConfigurationOptions): Promise<VersionDetail> {
        return this.api.versionRetrieve(param.id,  options).toPromise();
    }

}

import { ObservableItemsApi } from "./ObservableAPI";
import { ItemsApiRequestFactory, ItemsApiResponseProcessor} from "../apis/ItemsApi";

export interface ItemsApiItemAttributeListRequest {
    /**
     * Number of results to return per page.
     * Defaults to: undefined
     * @type number
     * @memberof ItemsApiitemAttributeList
     */
    limit?: number
    /**
     * The initial index from which to return the results.
     * Defaults to: undefined
     * @type number
     * @memberof ItemsApiitemAttributeList
     */
    offset?: number
    /**
     * &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     * Defaults to: undefined
     * @type string
     * @memberof ItemsApiitemAttributeList
     */
    q?: string
}

export interface ItemsApiItemAttributeRetrieveRequest {
    /**
     * This parameter can be a string or an integer.
     * Defaults to: undefined
     * @type string
     * @memberof ItemsApiitemAttributeRetrieve
     */
    id: string
}

export interface ItemsApiItemCategoryListRequest {
    /**
     * Number of results to return per page.
     * Defaults to: undefined
     * @type number
     * @memberof ItemsApiitemCategoryList
     */
    limit?: number
    /**
     * The initial index from which to return the results.
     * Defaults to: undefined
     * @type number
     * @memberof ItemsApiitemCategoryList
     */
    offset?: number
    /**
     * &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     * Defaults to: undefined
     * @type string
     * @memberof ItemsApiitemCategoryList
     */
    q?: string
}

export interface ItemsApiItemCategoryRetrieveRequest {
    /**
     * This parameter can be a string or an integer.
     * Defaults to: undefined
     * @type string
     * @memberof ItemsApiitemCategoryRetrieve
     */
    id: string
}

export interface ItemsApiItemFlingEffectListRequest {
    /**
     * Number of results to return per page.
     * Defaults to: undefined
     * @type number
     * @memberof ItemsApiitemFlingEffectList
     */
    limit?: number
    /**
     * The initial index from which to return the results.
     * Defaults to: undefined
     * @type number
     * @memberof ItemsApiitemFlingEffectList
     */
    offset?: number
    /**
     * &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     * Defaults to: undefined
     * @type string
     * @memberof ItemsApiitemFlingEffectList
     */
    q?: string
}

export interface ItemsApiItemFlingEffectRetrieveRequest {
    /**
     * This parameter can be a string or an integer.
     * Defaults to: undefined
     * @type string
     * @memberof ItemsApiitemFlingEffectRetrieve
     */
    id: string
}

export interface ItemsApiItemListRequest {
    /**
     * Number of results to return per page.
     * Defaults to: undefined
     * @type number
     * @memberof ItemsApiitemList
     */
    limit?: number
    /**
     * The initial index from which to return the results.
     * Defaults to: undefined
     * @type number
     * @memberof ItemsApiitemList
     */
    offset?: number
    /**
     * &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     * Defaults to: undefined
     * @type string
     * @memberof ItemsApiitemList
     */
    q?: string
}

export interface ItemsApiItemPocketListRequest {
    /**
     * Number of results to return per page.
     * Defaults to: undefined
     * @type number
     * @memberof ItemsApiitemPocketList
     */
    limit?: number
    /**
     * The initial index from which to return the results.
     * Defaults to: undefined
     * @type number
     * @memberof ItemsApiitemPocketList
     */
    offset?: number
    /**
     * &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     * Defaults to: undefined
     * @type string
     * @memberof ItemsApiitemPocketList
     */
    q?: string
}

export interface ItemsApiItemPocketRetrieveRequest {
    /**
     * This parameter can be a string or an integer.
     * Defaults to: undefined
     * @type string
     * @memberof ItemsApiitemPocketRetrieve
     */
    id: string
}

export interface ItemsApiItemRetrieveRequest {
    /**
     * This parameter can be a string or an integer.
     * Defaults to: undefined
     * @type string
     * @memberof ItemsApiitemRetrieve
     */
    id: string
}

export class ObjectItemsApi {
    private api: ObservableItemsApi

    public constructor(configuration: Configuration, requestFactory?: ItemsApiRequestFactory, responseProcessor?: ItemsApiResponseProcessor) {
        this.api = new ObservableItemsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Item attributes define particular aspects of items, e.g.\"usable in battle\" or \"consumable\".
     * List item attributes
     * @param param the request object
     */
    public itemAttributeListWithHttpInfo(param: ItemsApiItemAttributeListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<PaginatedItemAttributeSummaryList>> {
        return this.api.itemAttributeListWithHttpInfo(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Item attributes define particular aspects of items, e.g.\"usable in battle\" or \"consumable\".
     * List item attributes
     * @param param the request object
     */
    public itemAttributeList(param: ItemsApiItemAttributeListRequest = {}, options?: ConfigurationOptions): Promise<PaginatedItemAttributeSummaryList> {
        return this.api.itemAttributeList(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Item attributes define particular aspects of items, e.g.\"usable in battle\" or \"consumable\".
     * Get item attribute
     * @param param the request object
     */
    public itemAttributeRetrieveWithHttpInfo(param: ItemsApiItemAttributeRetrieveRequest, options?: ConfigurationOptions): Promise<HttpInfo<ItemAttributeDetail>> {
        return this.api.itemAttributeRetrieveWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * Item attributes define particular aspects of items, e.g.\"usable in battle\" or \"consumable\".
     * Get item attribute
     * @param param the request object
     */
    public itemAttributeRetrieve(param: ItemsApiItemAttributeRetrieveRequest, options?: ConfigurationOptions): Promise<ItemAttributeDetail> {
        return this.api.itemAttributeRetrieve(param.id,  options).toPromise();
    }

    /**
     * Item categories determine where items will be placed in the players bag.
     * List item categories
     * @param param the request object
     */
    public itemCategoryListWithHttpInfo(param: ItemsApiItemCategoryListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<PaginatedItemCategorySummaryList>> {
        return this.api.itemCategoryListWithHttpInfo(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Item categories determine where items will be placed in the players bag.
     * List item categories
     * @param param the request object
     */
    public itemCategoryList(param: ItemsApiItemCategoryListRequest = {}, options?: ConfigurationOptions): Promise<PaginatedItemCategorySummaryList> {
        return this.api.itemCategoryList(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Item categories determine where items will be placed in the players bag.
     * Get item category
     * @param param the request object
     */
    public itemCategoryRetrieveWithHttpInfo(param: ItemsApiItemCategoryRetrieveRequest, options?: ConfigurationOptions): Promise<HttpInfo<ItemCategoryDetail>> {
        return this.api.itemCategoryRetrieveWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * Item categories determine where items will be placed in the players bag.
     * Get item category
     * @param param the request object
     */
    public itemCategoryRetrieve(param: ItemsApiItemCategoryRetrieveRequest, options?: ConfigurationOptions): Promise<ItemCategoryDetail> {
        return this.api.itemCategoryRetrieve(param.id,  options).toPromise();
    }

    /**
     * The various effects of the move\"Fling\" when used with different items.
     * List item fling effects
     * @param param the request object
     */
    public itemFlingEffectListWithHttpInfo(param: ItemsApiItemFlingEffectListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<PaginatedItemFlingEffectSummaryList>> {
        return this.api.itemFlingEffectListWithHttpInfo(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * The various effects of the move\"Fling\" when used with different items.
     * List item fling effects
     * @param param the request object
     */
    public itemFlingEffectList(param: ItemsApiItemFlingEffectListRequest = {}, options?: ConfigurationOptions): Promise<PaginatedItemFlingEffectSummaryList> {
        return this.api.itemFlingEffectList(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * The various effects of the move\"Fling\" when used with different items.
     * Get item fling effect
     * @param param the request object
     */
    public itemFlingEffectRetrieveWithHttpInfo(param: ItemsApiItemFlingEffectRetrieveRequest, options?: ConfigurationOptions): Promise<HttpInfo<ItemFlingEffectDetail>> {
        return this.api.itemFlingEffectRetrieveWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * The various effects of the move\"Fling\" when used with different items.
     * Get item fling effect
     * @param param the request object
     */
    public itemFlingEffectRetrieve(param: ItemsApiItemFlingEffectRetrieveRequest, options?: ConfigurationOptions): Promise<ItemFlingEffectDetail> {
        return this.api.itemFlingEffectRetrieve(param.id,  options).toPromise();
    }

    /**
     * An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.
     * List items
     * @param param the request object
     */
    public itemListWithHttpInfo(param: ItemsApiItemListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<PaginatedItemSummaryList>> {
        return this.api.itemListWithHttpInfo(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.
     * List items
     * @param param the request object
     */
    public itemList(param: ItemsApiItemListRequest = {}, options?: ConfigurationOptions): Promise<PaginatedItemSummaryList> {
        return this.api.itemList(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Pockets within the players bag used for storing items by category.
     * List item pockets
     * @param param the request object
     */
    public itemPocketListWithHttpInfo(param: ItemsApiItemPocketListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<PaginatedItemPocketSummaryList>> {
        return this.api.itemPocketListWithHttpInfo(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Pockets within the players bag used for storing items by category.
     * List item pockets
     * @param param the request object
     */
    public itemPocketList(param: ItemsApiItemPocketListRequest = {}, options?: ConfigurationOptions): Promise<PaginatedItemPocketSummaryList> {
        return this.api.itemPocketList(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Pockets within the players bag used for storing items by category.
     * Get item pocket
     * @param param the request object
     */
    public itemPocketRetrieveWithHttpInfo(param: ItemsApiItemPocketRetrieveRequest, options?: ConfigurationOptions): Promise<HttpInfo<ItemPocketDetail>> {
        return this.api.itemPocketRetrieveWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * Pockets within the players bag used for storing items by category.
     * Get item pocket
     * @param param the request object
     */
    public itemPocketRetrieve(param: ItemsApiItemPocketRetrieveRequest, options?: ConfigurationOptions): Promise<ItemPocketDetail> {
        return this.api.itemPocketRetrieve(param.id,  options).toPromise();
    }

    /**
     * An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.
     * Get item
     * @param param the request object
     */
    public itemRetrieveWithHttpInfo(param: ItemsApiItemRetrieveRequest, options?: ConfigurationOptions): Promise<HttpInfo<ItemDetail>> {
        return this.api.itemRetrieveWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.
     * Get item
     * @param param the request object
     */
    public itemRetrieve(param: ItemsApiItemRetrieveRequest, options?: ConfigurationOptions): Promise<ItemDetail> {
        return this.api.itemRetrieve(param.id,  options).toPromise();
    }

}

import { ObservableLocationApi } from "./ObservableAPI";
import { LocationApiRequestFactory, LocationApiResponseProcessor} from "../apis/LocationApi";

export interface LocationApiLocationAreaListRequest {
    /**
     * Number of results to return per page.
     * Defaults to: undefined
     * @type number
     * @memberof LocationApilocationAreaList
     */
    limit?: number
    /**
     * The initial index from which to return the results.
     * Defaults to: undefined
     * @type number
     * @memberof LocationApilocationAreaList
     */
    offset?: number
}

export interface LocationApiLocationAreaRetrieveRequest {
    /**
     * A unique integer value identifying this location area.
     * Defaults to: undefined
     * @type number
     * @memberof LocationApilocationAreaRetrieve
     */
    id: number
}

export interface LocationApiLocationListRequest {
    /**
     * Number of results to return per page.
     * Defaults to: undefined
     * @type number
     * @memberof LocationApilocationList
     */
    limit?: number
    /**
     * The initial index from which to return the results.
     * Defaults to: undefined
     * @type number
     * @memberof LocationApilocationList
     */
    offset?: number
    /**
     * &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     * Defaults to: undefined
     * @type string
     * @memberof LocationApilocationList
     */
    q?: string
}

export interface LocationApiLocationRetrieveRequest {
    /**
     * This parameter can be a string or an integer.
     * Defaults to: undefined
     * @type string
     * @memberof LocationApilocationRetrieve
     */
    id: string
}

export interface LocationApiPalParkAreaListRequest {
    /**
     * Number of results to return per page.
     * Defaults to: undefined
     * @type number
     * @memberof LocationApipalParkAreaList
     */
    limit?: number
    /**
     * The initial index from which to return the results.
     * Defaults to: undefined
     * @type number
     * @memberof LocationApipalParkAreaList
     */
    offset?: number
    /**
     * &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     * Defaults to: undefined
     * @type string
     * @memberof LocationApipalParkAreaList
     */
    q?: string
}

export interface LocationApiPalParkAreaRetrieveRequest {
    /**
     * This parameter can be a string or an integer.
     * Defaults to: undefined
     * @type string
     * @memberof LocationApipalParkAreaRetrieve
     */
    id: string
}

export interface LocationApiRegionListRequest {
    /**
     * Number of results to return per page.
     * Defaults to: undefined
     * @type number
     * @memberof LocationApiregionList
     */
    limit?: number
    /**
     * The initial index from which to return the results.
     * Defaults to: undefined
     * @type number
     * @memberof LocationApiregionList
     */
    offset?: number
    /**
     * &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     * Defaults to: undefined
     * @type string
     * @memberof LocationApiregionList
     */
    q?: string
}

export interface LocationApiRegionRetrieveRequest {
    /**
     * This parameter can be a string or an integer.
     * Defaults to: undefined
     * @type string
     * @memberof LocationApiregionRetrieve
     */
    id: string
}

export class ObjectLocationApi {
    private api: ObservableLocationApi

    public constructor(configuration: Configuration, requestFactory?: LocationApiRequestFactory, responseProcessor?: LocationApiResponseProcessor) {
        this.api = new ObservableLocationApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.
     * List location areas
     * @param param the request object
     */
    public locationAreaListWithHttpInfo(param: LocationApiLocationAreaListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<PaginatedLocationAreaSummaryList>> {
        return this.api.locationAreaListWithHttpInfo(param.limit, param.offset,  options).toPromise();
    }

    /**
     * Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.
     * List location areas
     * @param param the request object
     */
    public locationAreaList(param: LocationApiLocationAreaListRequest = {}, options?: ConfigurationOptions): Promise<PaginatedLocationAreaSummaryList> {
        return this.api.locationAreaList(param.limit, param.offset,  options).toPromise();
    }

    /**
     * Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.
     * Get location area
     * @param param the request object
     */
    public locationAreaRetrieveWithHttpInfo(param: LocationApiLocationAreaRetrieveRequest, options?: ConfigurationOptions): Promise<HttpInfo<LocationAreaDetail>> {
        return this.api.locationAreaRetrieveWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.
     * Get location area
     * @param param the request object
     */
    public locationAreaRetrieve(param: LocationApiLocationAreaRetrieveRequest, options?: ConfigurationOptions): Promise<LocationAreaDetail> {
        return this.api.locationAreaRetrieve(param.id,  options).toPromise();
    }

    /**
     * Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.
     * List locations
     * @param param the request object
     */
    public locationListWithHttpInfo(param: LocationApiLocationListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<PaginatedLocationSummaryList>> {
        return this.api.locationListWithHttpInfo(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.
     * List locations
     * @param param the request object
     */
    public locationList(param: LocationApiLocationListRequest = {}, options?: ConfigurationOptions): Promise<PaginatedLocationSummaryList> {
        return this.api.locationList(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.
     * Get location
     * @param param the request object
     */
    public locationRetrieveWithHttpInfo(param: LocationApiLocationRetrieveRequest, options?: ConfigurationOptions): Promise<HttpInfo<LocationDetail>> {
        return this.api.locationRetrieveWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.
     * Get location
     * @param param the request object
     */
    public locationRetrieve(param: LocationApiLocationRetrieveRequest, options?: ConfigurationOptions): Promise<LocationDetail> {
        return this.api.locationRetrieve(param.id,  options).toPromise();
    }

    /**
     * Areas used for grouping Pokémon encounters in Pal Park. They\'re like habitats that are specific to Pal Park.
     * List pal park areas
     * @param param the request object
     */
    public palParkAreaListWithHttpInfo(param: LocationApiPalParkAreaListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<PaginatedPalParkAreaSummaryList>> {
        return this.api.palParkAreaListWithHttpInfo(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Areas used for grouping Pokémon encounters in Pal Park. They\'re like habitats that are specific to Pal Park.
     * List pal park areas
     * @param param the request object
     */
    public palParkAreaList(param: LocationApiPalParkAreaListRequest = {}, options?: ConfigurationOptions): Promise<PaginatedPalParkAreaSummaryList> {
        return this.api.palParkAreaList(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Areas used for grouping Pokémon encounters in Pal Park. They\'re like habitats that are specific to Pal Park.
     * Get pal park area
     * @param param the request object
     */
    public palParkAreaRetrieveWithHttpInfo(param: LocationApiPalParkAreaRetrieveRequest, options?: ConfigurationOptions): Promise<HttpInfo<PalParkAreaDetail>> {
        return this.api.palParkAreaRetrieveWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * Areas used for grouping Pokémon encounters in Pal Park. They\'re like habitats that are specific to Pal Park.
     * Get pal park area
     * @param param the request object
     */
    public palParkAreaRetrieve(param: LocationApiPalParkAreaRetrieveRequest, options?: ConfigurationOptions): Promise<PalParkAreaDetail> {
        return this.api.palParkAreaRetrieve(param.id,  options).toPromise();
    }

    /**
     * A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.
     * List regions
     * @param param the request object
     */
    public regionListWithHttpInfo(param: LocationApiRegionListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<PaginatedRegionSummaryList>> {
        return this.api.regionListWithHttpInfo(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.
     * List regions
     * @param param the request object
     */
    public regionList(param: LocationApiRegionListRequest = {}, options?: ConfigurationOptions): Promise<PaginatedRegionSummaryList> {
        return this.api.regionList(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.
     * Get region
     * @param param the request object
     */
    public regionRetrieveWithHttpInfo(param: LocationApiRegionRetrieveRequest, options?: ConfigurationOptions): Promise<HttpInfo<RegionDetail>> {
        return this.api.regionRetrieveWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.
     * Get region
     * @param param the request object
     */
    public regionRetrieve(param: LocationApiRegionRetrieveRequest, options?: ConfigurationOptions): Promise<RegionDetail> {
        return this.api.regionRetrieve(param.id,  options).toPromise();
    }

}

import { ObservableMachinesApi } from "./ObservableAPI";
import { MachinesApiRequestFactory, MachinesApiResponseProcessor} from "../apis/MachinesApi";

export interface MachinesApiMachineListRequest {
    /**
     * Number of results to return per page.
     * Defaults to: undefined
     * @type number
     * @memberof MachinesApimachineList
     */
    limit?: number
    /**
     * The initial index from which to return the results.
     * Defaults to: undefined
     * @type number
     * @memberof MachinesApimachineList
     */
    offset?: number
    /**
     * &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     * Defaults to: undefined
     * @type string
     * @memberof MachinesApimachineList
     */
    q?: string
}

export interface MachinesApiMachineRetrieveRequest {
    /**
     * This parameter can be a string or an integer.
     * Defaults to: undefined
     * @type string
     * @memberof MachinesApimachineRetrieve
     */
    id: string
}

export class ObjectMachinesApi {
    private api: ObservableMachinesApi

    public constructor(configuration: Configuration, requestFactory?: MachinesApiRequestFactory, responseProcessor?: MachinesApiResponseProcessor) {
        this.api = new ObservableMachinesApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.
     * List machines
     * @param param the request object
     */
    public machineListWithHttpInfo(param: MachinesApiMachineListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<PaginatedMachineSummaryList>> {
        return this.api.machineListWithHttpInfo(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.
     * List machines
     * @param param the request object
     */
    public machineList(param: MachinesApiMachineListRequest = {}, options?: ConfigurationOptions): Promise<PaginatedMachineSummaryList> {
        return this.api.machineList(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.
     * Get machine
     * @param param the request object
     */
    public machineRetrieveWithHttpInfo(param: MachinesApiMachineRetrieveRequest, options?: ConfigurationOptions): Promise<HttpInfo<MachineDetail>> {
        return this.api.machineRetrieveWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.
     * Get machine
     * @param param the request object
     */
    public machineRetrieve(param: MachinesApiMachineRetrieveRequest, options?: ConfigurationOptions): Promise<MachineDetail> {
        return this.api.machineRetrieve(param.id,  options).toPromise();
    }

}

import { ObservableMovesApi } from "./ObservableAPI";
import { MovesApiRequestFactory, MovesApiResponseProcessor} from "../apis/MovesApi";

export interface MovesApiMoveAilmentListRequest {
    /**
     * Number of results to return per page.
     * Defaults to: undefined
     * @type number
     * @memberof MovesApimoveAilmentList
     */
    limit?: number
    /**
     * The initial index from which to return the results.
     * Defaults to: undefined
     * @type number
     * @memberof MovesApimoveAilmentList
     */
    offset?: number
    /**
     * &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     * Defaults to: undefined
     * @type string
     * @memberof MovesApimoveAilmentList
     */
    q?: string
}

export interface MovesApiMoveAilmentRetrieveRequest {
    /**
     * This parameter can be a string or an integer.
     * Defaults to: undefined
     * @type string
     * @memberof MovesApimoveAilmentRetrieve
     */
    id: string
}

export interface MovesApiMoveBattleStyleListRequest {
    /**
     * Number of results to return per page.
     * Defaults to: undefined
     * @type number
     * @memberof MovesApimoveBattleStyleList
     */
    limit?: number
    /**
     * The initial index from which to return the results.
     * Defaults to: undefined
     * @type number
     * @memberof MovesApimoveBattleStyleList
     */
    offset?: number
    /**
     * &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     * Defaults to: undefined
     * @type string
     * @memberof MovesApimoveBattleStyleList
     */
    q?: string
}

export interface MovesApiMoveBattleStyleRetrieveRequest {
    /**
     * This parameter can be a string or an integer.
     * Defaults to: undefined
     * @type string
     * @memberof MovesApimoveBattleStyleRetrieve
     */
    id: string
}

export interface MovesApiMoveCategoryListRequest {
    /**
     * Number of results to return per page.
     * Defaults to: undefined
     * @type number
     * @memberof MovesApimoveCategoryList
     */
    limit?: number
    /**
     * The initial index from which to return the results.
     * Defaults to: undefined
     * @type number
     * @memberof MovesApimoveCategoryList
     */
    offset?: number
    /**
     * &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     * Defaults to: undefined
     * @type string
     * @memberof MovesApimoveCategoryList
     */
    q?: string
}

export interface MovesApiMoveCategoryRetrieveRequest {
    /**
     * This parameter can be a string or an integer.
     * Defaults to: undefined
     * @type string
     * @memberof MovesApimoveCategoryRetrieve
     */
    id: string
}

export interface MovesApiMoveLearnMethodListRequest {
    /**
     * Number of results to return per page.
     * Defaults to: undefined
     * @type number
     * @memberof MovesApimoveLearnMethodList
     */
    limit?: number
    /**
     * The initial index from which to return the results.
     * Defaults to: undefined
     * @type number
     * @memberof MovesApimoveLearnMethodList
     */
    offset?: number
    /**
     * &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     * Defaults to: undefined
     * @type string
     * @memberof MovesApimoveLearnMethodList
     */
    q?: string
}

export interface MovesApiMoveLearnMethodRetrieveRequest {
    /**
     * This parameter can be a string or an integer.
     * Defaults to: undefined
     * @type string
     * @memberof MovesApimoveLearnMethodRetrieve
     */
    id: string
}

export interface MovesApiMoveListRequest {
    /**
     * Number of results to return per page.
     * Defaults to: undefined
     * @type number
     * @memberof MovesApimoveList
     */
    limit?: number
    /**
     * The initial index from which to return the results.
     * Defaults to: undefined
     * @type number
     * @memberof MovesApimoveList
     */
    offset?: number
    /**
     * &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     * Defaults to: undefined
     * @type string
     * @memberof MovesApimoveList
     */
    q?: string
}

export interface MovesApiMoveRetrieveRequest {
    /**
     * This parameter can be a string or an integer.
     * Defaults to: undefined
     * @type string
     * @memberof MovesApimoveRetrieve
     */
    id: string
}

export interface MovesApiMoveTargetListRequest {
    /**
     * Number of results to return per page.
     * Defaults to: undefined
     * @type number
     * @memberof MovesApimoveTargetList
     */
    limit?: number
    /**
     * The initial index from which to return the results.
     * Defaults to: undefined
     * @type number
     * @memberof MovesApimoveTargetList
     */
    offset?: number
    /**
     * &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     * Defaults to: undefined
     * @type string
     * @memberof MovesApimoveTargetList
     */
    q?: string
}

export interface MovesApiMoveTargetRetrieveRequest {
    /**
     * This parameter can be a string or an integer.
     * Defaults to: undefined
     * @type string
     * @memberof MovesApimoveTargetRetrieve
     */
    id: string
}

export class ObjectMovesApi {
    private api: ObservableMovesApi

    public constructor(configuration: Configuration, requestFactory?: MovesApiRequestFactory, responseProcessor?: MovesApiResponseProcessor) {
        this.api = new ObservableMovesApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.
     * List move meta ailments
     * @param param the request object
     */
    public moveAilmentListWithHttpInfo(param: MovesApiMoveAilmentListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<PaginatedMoveMetaAilmentSummaryList>> {
        return this.api.moveAilmentListWithHttpInfo(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.
     * List move meta ailments
     * @param param the request object
     */
    public moveAilmentList(param: MovesApiMoveAilmentListRequest = {}, options?: ConfigurationOptions): Promise<PaginatedMoveMetaAilmentSummaryList> {
        return this.api.moveAilmentList(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.
     * Get move meta ailment
     * @param param the request object
     */
    public moveAilmentRetrieveWithHttpInfo(param: MovesApiMoveAilmentRetrieveRequest, options?: ConfigurationOptions): Promise<HttpInfo<MoveMetaAilmentDetail>> {
        return this.api.moveAilmentRetrieveWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.
     * Get move meta ailment
     * @param param the request object
     */
    public moveAilmentRetrieve(param: MovesApiMoveAilmentRetrieveRequest, options?: ConfigurationOptions): Promise<MoveMetaAilmentDetail> {
        return this.api.moveAilmentRetrieve(param.id,  options).toPromise();
    }

    /**
     * Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.
     * List move battle styles
     * @param param the request object
     */
    public moveBattleStyleListWithHttpInfo(param: MovesApiMoveBattleStyleListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<PaginatedMoveBattleStyleSummaryList>> {
        return this.api.moveBattleStyleListWithHttpInfo(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.
     * List move battle styles
     * @param param the request object
     */
    public moveBattleStyleList(param: MovesApiMoveBattleStyleListRequest = {}, options?: ConfigurationOptions): Promise<PaginatedMoveBattleStyleSummaryList> {
        return this.api.moveBattleStyleList(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.
     * Get move battle style
     * @param param the request object
     */
    public moveBattleStyleRetrieveWithHttpInfo(param: MovesApiMoveBattleStyleRetrieveRequest, options?: ConfigurationOptions): Promise<HttpInfo<MoveBattleStyleDetail>> {
        return this.api.moveBattleStyleRetrieveWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.
     * Get move battle style
     * @param param the request object
     */
    public moveBattleStyleRetrieve(param: MovesApiMoveBattleStyleRetrieveRequest, options?: ConfigurationOptions): Promise<MoveBattleStyleDetail> {
        return this.api.moveBattleStyleRetrieve(param.id,  options).toPromise();
    }

    /**
     * Very general categories that loosely group move effects.
     * List move meta categories
     * @param param the request object
     */
    public moveCategoryListWithHttpInfo(param: MovesApiMoveCategoryListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<PaginatedMoveMetaCategorySummaryList>> {
        return this.api.moveCategoryListWithHttpInfo(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Very general categories that loosely group move effects.
     * List move meta categories
     * @param param the request object
     */
    public moveCategoryList(param: MovesApiMoveCategoryListRequest = {}, options?: ConfigurationOptions): Promise<PaginatedMoveMetaCategorySummaryList> {
        return this.api.moveCategoryList(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Very general categories that loosely group move effects.
     * Get move meta category
     * @param param the request object
     */
    public moveCategoryRetrieveWithHttpInfo(param: MovesApiMoveCategoryRetrieveRequest, options?: ConfigurationOptions): Promise<HttpInfo<MoveMetaCategoryDetail>> {
        return this.api.moveCategoryRetrieveWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * Very general categories that loosely group move effects.
     * Get move meta category
     * @param param the request object
     */
    public moveCategoryRetrieve(param: MovesApiMoveCategoryRetrieveRequest, options?: ConfigurationOptions): Promise<MoveMetaCategoryDetail> {
        return this.api.moveCategoryRetrieve(param.id,  options).toPromise();
    }

    /**
     * Methods by which Pokémon can learn moves.
     * List move learn methods
     * @param param the request object
     */
    public moveLearnMethodListWithHttpInfo(param: MovesApiMoveLearnMethodListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<PaginatedMoveLearnMethodSummaryList>> {
        return this.api.moveLearnMethodListWithHttpInfo(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Methods by which Pokémon can learn moves.
     * List move learn methods
     * @param param the request object
     */
    public moveLearnMethodList(param: MovesApiMoveLearnMethodListRequest = {}, options?: ConfigurationOptions): Promise<PaginatedMoveLearnMethodSummaryList> {
        return this.api.moveLearnMethodList(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Methods by which Pokémon can learn moves.
     * Get move learn method
     * @param param the request object
     */
    public moveLearnMethodRetrieveWithHttpInfo(param: MovesApiMoveLearnMethodRetrieveRequest, options?: ConfigurationOptions): Promise<HttpInfo<MoveLearnMethodDetail>> {
        return this.api.moveLearnMethodRetrieveWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * Methods by which Pokémon can learn moves.
     * Get move learn method
     * @param param the request object
     */
    public moveLearnMethodRetrieve(param: MovesApiMoveLearnMethodRetrieveRequest, options?: ConfigurationOptions): Promise<MoveLearnMethodDetail> {
        return this.api.moveLearnMethodRetrieve(param.id,  options).toPromise();
    }

    /**
     * Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.
     * List moves
     * @param param the request object
     */
    public moveListWithHttpInfo(param: MovesApiMoveListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<PaginatedMoveSummaryList>> {
        return this.api.moveListWithHttpInfo(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.
     * List moves
     * @param param the request object
     */
    public moveList(param: MovesApiMoveListRequest = {}, options?: ConfigurationOptions): Promise<PaginatedMoveSummaryList> {
        return this.api.moveList(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.
     * Get move
     * @param param the request object
     */
    public moveRetrieveWithHttpInfo(param: MovesApiMoveRetrieveRequest, options?: ConfigurationOptions): Promise<HttpInfo<MoveDetail>> {
        return this.api.moveRetrieveWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.
     * Get move
     * @param param the request object
     */
    public moveRetrieve(param: MovesApiMoveRetrieveRequest, options?: ConfigurationOptions): Promise<MoveDetail> {
        return this.api.moveRetrieve(param.id,  options).toPromise();
    }

    /**
     * Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.
     * List move targets
     * @param param the request object
     */
    public moveTargetListWithHttpInfo(param: MovesApiMoveTargetListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<PaginatedMoveTargetSummaryList>> {
        return this.api.moveTargetListWithHttpInfo(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.
     * List move targets
     * @param param the request object
     */
    public moveTargetList(param: MovesApiMoveTargetListRequest = {}, options?: ConfigurationOptions): Promise<PaginatedMoveTargetSummaryList> {
        return this.api.moveTargetList(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.
     * Get move target
     * @param param the request object
     */
    public moveTargetRetrieveWithHttpInfo(param: MovesApiMoveTargetRetrieveRequest, options?: ConfigurationOptions): Promise<HttpInfo<MoveTargetDetail>> {
        return this.api.moveTargetRetrieveWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.
     * Get move target
     * @param param the request object
     */
    public moveTargetRetrieve(param: MovesApiMoveTargetRetrieveRequest, options?: ConfigurationOptions): Promise<MoveTargetDetail> {
        return this.api.moveTargetRetrieve(param.id,  options).toPromise();
    }

}

import { ObservablePokemonApi } from "./ObservableAPI";
import { PokemonApiRequestFactory, PokemonApiResponseProcessor} from "../apis/PokemonApi";

export interface PokemonApiAbilityListRequest {
    /**
     * Number of results to return per page.
     * Defaults to: undefined
     * @type number
     * @memberof PokemonApiabilityList
     */
    limit?: number
    /**
     * The initial index from which to return the results.
     * Defaults to: undefined
     * @type number
     * @memberof PokemonApiabilityList
     */
    offset?: number
    /**
     * &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     * Defaults to: undefined
     * @type string
     * @memberof PokemonApiabilityList
     */
    q?: string
}

export interface PokemonApiAbilityRetrieveRequest {
    /**
     * This parameter can be a string or an integer.
     * Defaults to: undefined
     * @type string
     * @memberof PokemonApiabilityRetrieve
     */
    id: string
}

export interface PokemonApiCharacteristicListRequest {
    /**
     * Number of results to return per page.
     * Defaults to: undefined
     * @type number
     * @memberof PokemonApicharacteristicList
     */
    limit?: number
    /**
     * The initial index from which to return the results.
     * Defaults to: undefined
     * @type number
     * @memberof PokemonApicharacteristicList
     */
    offset?: number
    /**
     * &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     * Defaults to: undefined
     * @type string
     * @memberof PokemonApicharacteristicList
     */
    q?: string
}

export interface PokemonApiCharacteristicRetrieveRequest {
    /**
     * This parameter can be a string or an integer.
     * Defaults to: undefined
     * @type string
     * @memberof PokemonApicharacteristicRetrieve
     */
    id: string
}

export interface PokemonApiEggGroupListRequest {
    /**
     * Number of results to return per page.
     * Defaults to: undefined
     * @type number
     * @memberof PokemonApieggGroupList
     */
    limit?: number
    /**
     * The initial index from which to return the results.
     * Defaults to: undefined
     * @type number
     * @memberof PokemonApieggGroupList
     */
    offset?: number
    /**
     * &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     * Defaults to: undefined
     * @type string
     * @memberof PokemonApieggGroupList
     */
    q?: string
}

export interface PokemonApiEggGroupRetrieveRequest {
    /**
     * This parameter can be a string or an integer.
     * Defaults to: undefined
     * @type string
     * @memberof PokemonApieggGroupRetrieve
     */
    id: string
}

export interface PokemonApiGenderListRequest {
    /**
     * Number of results to return per page.
     * Defaults to: undefined
     * @type number
     * @memberof PokemonApigenderList
     */
    limit?: number
    /**
     * The initial index from which to return the results.
     * Defaults to: undefined
     * @type number
     * @memberof PokemonApigenderList
     */
    offset?: number
    /**
     * &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     * Defaults to: undefined
     * @type string
     * @memberof PokemonApigenderList
     */
    q?: string
}

export interface PokemonApiGenderRetrieveRequest {
    /**
     * This parameter can be a string or an integer.
     * Defaults to: undefined
     * @type string
     * @memberof PokemonApigenderRetrieve
     */
    id: string
}

export interface PokemonApiGrowthRateListRequest {
    /**
     * Number of results to return per page.
     * Defaults to: undefined
     * @type number
     * @memberof PokemonApigrowthRateList
     */
    limit?: number
    /**
     * The initial index from which to return the results.
     * Defaults to: undefined
     * @type number
     * @memberof PokemonApigrowthRateList
     */
    offset?: number
    /**
     * &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     * Defaults to: undefined
     * @type string
     * @memberof PokemonApigrowthRateList
     */
    q?: string
}

export interface PokemonApiGrowthRateRetrieveRequest {
    /**
     * This parameter can be a string or an integer.
     * Defaults to: undefined
     * @type string
     * @memberof PokemonApigrowthRateRetrieve
     */
    id: string
}

export interface PokemonApiMoveDamageClassListRequest {
    /**
     * Number of results to return per page.
     * Defaults to: undefined
     * @type number
     * @memberof PokemonApimoveDamageClassList
     */
    limit?: number
    /**
     * The initial index from which to return the results.
     * Defaults to: undefined
     * @type number
     * @memberof PokemonApimoveDamageClassList
     */
    offset?: number
    /**
     * &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     * Defaults to: undefined
     * @type string
     * @memberof PokemonApimoveDamageClassList
     */
    q?: string
}

export interface PokemonApiMoveDamageClassRetrieveRequest {
    /**
     * This parameter can be a string or an integer.
     * Defaults to: undefined
     * @type string
     * @memberof PokemonApimoveDamageClassRetrieve
     */
    id: string
}

export interface PokemonApiNatureListRequest {
    /**
     * Number of results to return per page.
     * Defaults to: undefined
     * @type number
     * @memberof PokemonApinatureList
     */
    limit?: number
    /**
     * The initial index from which to return the results.
     * Defaults to: undefined
     * @type number
     * @memberof PokemonApinatureList
     */
    offset?: number
    /**
     * &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     * Defaults to: undefined
     * @type string
     * @memberof PokemonApinatureList
     */
    q?: string
}

export interface PokemonApiNatureRetrieveRequest {
    /**
     * This parameter can be a string or an integer.
     * Defaults to: undefined
     * @type string
     * @memberof PokemonApinatureRetrieve
     */
    id: string
}

export interface PokemonApiPokeathlonStatListRequest {
    /**
     * Number of results to return per page.
     * Defaults to: undefined
     * @type number
     * @memberof PokemonApipokeathlonStatList
     */
    limit?: number
    /**
     * The initial index from which to return the results.
     * Defaults to: undefined
     * @type number
     * @memberof PokemonApipokeathlonStatList
     */
    offset?: number
    /**
     * &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     * Defaults to: undefined
     * @type string
     * @memberof PokemonApipokeathlonStatList
     */
    q?: string
}

export interface PokemonApiPokeathlonStatRetrieveRequest {
    /**
     * This parameter can be a string or an integer.
     * Defaults to: undefined
     * @type string
     * @memberof PokemonApipokeathlonStatRetrieve
     */
    id: string
}

export interface PokemonApiPokemonColorListRequest {
    /**
     * Number of results to return per page.
     * Defaults to: undefined
     * @type number
     * @memberof PokemonApipokemonColorList
     */
    limit?: number
    /**
     * The initial index from which to return the results.
     * Defaults to: undefined
     * @type number
     * @memberof PokemonApipokemonColorList
     */
    offset?: number
    /**
     * &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     * Defaults to: undefined
     * @type string
     * @memberof PokemonApipokemonColorList
     */
    q?: string
}

export interface PokemonApiPokemonColorRetrieveRequest {
    /**
     * This parameter can be a string or an integer.
     * Defaults to: undefined
     * @type string
     * @memberof PokemonApipokemonColorRetrieve
     */
    id: string
}

export interface PokemonApiPokemonFormListRequest {
    /**
     * Number of results to return per page.
     * Defaults to: undefined
     * @type number
     * @memberof PokemonApipokemonFormList
     */
    limit?: number
    /**
     * The initial index from which to return the results.
     * Defaults to: undefined
     * @type number
     * @memberof PokemonApipokemonFormList
     */
    offset?: number
    /**
     * &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     * Defaults to: undefined
     * @type string
     * @memberof PokemonApipokemonFormList
     */
    q?: string
}

export interface PokemonApiPokemonFormRetrieveRequest {
    /**
     * This parameter can be a string or an integer.
     * Defaults to: undefined
     * @type string
     * @memberof PokemonApipokemonFormRetrieve
     */
    id: string
}

export interface PokemonApiPokemonHabitatListRequest {
    /**
     * Number of results to return per page.
     * Defaults to: undefined
     * @type number
     * @memberof PokemonApipokemonHabitatList
     */
    limit?: number
    /**
     * The initial index from which to return the results.
     * Defaults to: undefined
     * @type number
     * @memberof PokemonApipokemonHabitatList
     */
    offset?: number
    /**
     * &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     * Defaults to: undefined
     * @type string
     * @memberof PokemonApipokemonHabitatList
     */
    q?: string
}

export interface PokemonApiPokemonHabitatRetrieveRequest {
    /**
     * This parameter can be a string or an integer.
     * Defaults to: undefined
     * @type string
     * @memberof PokemonApipokemonHabitatRetrieve
     */
    id: string
}

export interface PokemonApiPokemonListRequest {
    /**
     * Number of results to return per page.
     * Defaults to: undefined
     * @type number
     * @memberof PokemonApipokemonList
     */
    limit?: number
    /**
     * The initial index from which to return the results.
     * Defaults to: undefined
     * @type number
     * @memberof PokemonApipokemonList
     */
    offset?: number
    /**
     * &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     * Defaults to: undefined
     * @type string
     * @memberof PokemonApipokemonList
     */
    q?: string
}

export interface PokemonApiPokemonRetrieveRequest {
    /**
     * This parameter can be a string or an integer.
     * Defaults to: undefined
     * @type string
     * @memberof PokemonApipokemonRetrieve
     */
    id: string
}

export interface PokemonApiPokemonShapeListRequest {
    /**
     * Number of results to return per page.
     * Defaults to: undefined
     * @type number
     * @memberof PokemonApipokemonShapeList
     */
    limit?: number
    /**
     * The initial index from which to return the results.
     * Defaults to: undefined
     * @type number
     * @memberof PokemonApipokemonShapeList
     */
    offset?: number
    /**
     * &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     * Defaults to: undefined
     * @type string
     * @memberof PokemonApipokemonShapeList
     */
    q?: string
}

export interface PokemonApiPokemonShapeRetrieveRequest {
    /**
     * This parameter can be a string or an integer.
     * Defaults to: undefined
     * @type string
     * @memberof PokemonApipokemonShapeRetrieve
     */
    id: string
}

export interface PokemonApiPokemonSpeciesListRequest {
    /**
     * Number of results to return per page.
     * Defaults to: undefined
     * @type number
     * @memberof PokemonApipokemonSpeciesList
     */
    limit?: number
    /**
     * The initial index from which to return the results.
     * Defaults to: undefined
     * @type number
     * @memberof PokemonApipokemonSpeciesList
     */
    offset?: number
    /**
     * &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     * Defaults to: undefined
     * @type string
     * @memberof PokemonApipokemonSpeciesList
     */
    q?: string
}

export interface PokemonApiPokemonSpeciesRetrieveRequest {
    /**
     * This parameter can be a string or an integer.
     * Defaults to: undefined
     * @type string
     * @memberof PokemonApipokemonSpeciesRetrieve
     */
    id: string
}

export interface PokemonApiStatListRequest {
    /**
     * Number of results to return per page.
     * Defaults to: undefined
     * @type number
     * @memberof PokemonApistatList
     */
    limit?: number
    /**
     * The initial index from which to return the results.
     * Defaults to: undefined
     * @type number
     * @memberof PokemonApistatList
     */
    offset?: number
    /**
     * &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     * Defaults to: undefined
     * @type string
     * @memberof PokemonApistatList
     */
    q?: string
}

export interface PokemonApiStatRetrieveRequest {
    /**
     * This parameter can be a string or an integer.
     * Defaults to: undefined
     * @type string
     * @memberof PokemonApistatRetrieve
     */
    id: string
}

export interface PokemonApiTypeListRequest {
    /**
     * Number of results to return per page.
     * Defaults to: undefined
     * @type number
     * @memberof PokemonApitypeList
     */
    limit?: number
    /**
     * The initial index from which to return the results.
     * Defaults to: undefined
     * @type number
     * @memberof PokemonApitypeList
     */
    offset?: number
    /**
     * &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     * Defaults to: undefined
     * @type string
     * @memberof PokemonApitypeList
     */
    q?: string
}

export interface PokemonApiTypeRetrieveRequest {
    /**
     * This parameter can be a string or an integer.
     * Defaults to: undefined
     * @type string
     * @memberof PokemonApitypeRetrieve
     */
    id: string
}

export class ObjectPokemonApi {
    private api: ObservablePokemonApi

    public constructor(configuration: Configuration, requestFactory?: PokemonApiRequestFactory, responseProcessor?: PokemonApiResponseProcessor) {
        this.api = new ObservablePokemonApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.
     * @param param the request object
     */
    public abilityListWithHttpInfo(param: PokemonApiAbilityListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<PaginatedAbilitySummaryList>> {
        return this.api.abilityListWithHttpInfo(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.
     * @param param the request object
     */
    public abilityList(param: PokemonApiAbilityListRequest = {}, options?: ConfigurationOptions): Promise<PaginatedAbilitySummaryList> {
        return this.api.abilityList(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.
     * @param param the request object
     */
    public abilityRetrieveWithHttpInfo(param: PokemonApiAbilityRetrieveRequest, options?: ConfigurationOptions): Promise<HttpInfo<AbilityDetail>> {
        return this.api.abilityRetrieveWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.
     * @param param the request object
     */
    public abilityRetrieve(param: PokemonApiAbilityRetrieveRequest, options?: ConfigurationOptions): Promise<AbilityDetail> {
        return this.api.abilityRetrieve(param.id,  options).toPromise();
    }

    /**
     * Characteristics indicate which stat contains a Pokémon\'s highest IV. A Pokémon\'s Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.
     * List charecterictics
     * @param param the request object
     */
    public characteristicListWithHttpInfo(param: PokemonApiCharacteristicListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<PaginatedCharacteristicSummaryList>> {
        return this.api.characteristicListWithHttpInfo(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Characteristics indicate which stat contains a Pokémon\'s highest IV. A Pokémon\'s Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.
     * List charecterictics
     * @param param the request object
     */
    public characteristicList(param: PokemonApiCharacteristicListRequest = {}, options?: ConfigurationOptions): Promise<PaginatedCharacteristicSummaryList> {
        return this.api.characteristicList(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Characteristics indicate which stat contains a Pokémon\'s highest IV. A Pokémon\'s Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.
     * Get characteristic
     * @param param the request object
     */
    public characteristicRetrieveWithHttpInfo(param: PokemonApiCharacteristicRetrieveRequest, options?: ConfigurationOptions): Promise<HttpInfo<CharacteristicDetail>> {
        return this.api.characteristicRetrieveWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * Characteristics indicate which stat contains a Pokémon\'s highest IV. A Pokémon\'s Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.
     * Get characteristic
     * @param param the request object
     */
    public characteristicRetrieve(param: PokemonApiCharacteristicRetrieveRequest, options?: ConfigurationOptions): Promise<CharacteristicDetail> {
        return this.api.characteristicRetrieve(param.id,  options).toPromise();
    }

    /**
     * Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.
     * List egg groups
     * @param param the request object
     */
    public eggGroupListWithHttpInfo(param: PokemonApiEggGroupListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<PaginatedEggGroupSummaryList>> {
        return this.api.eggGroupListWithHttpInfo(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.
     * List egg groups
     * @param param the request object
     */
    public eggGroupList(param: PokemonApiEggGroupListRequest = {}, options?: ConfigurationOptions): Promise<PaginatedEggGroupSummaryList> {
        return this.api.eggGroupList(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.
     * Get egg group
     * @param param the request object
     */
    public eggGroupRetrieveWithHttpInfo(param: PokemonApiEggGroupRetrieveRequest, options?: ConfigurationOptions): Promise<HttpInfo<EggGroupDetail>> {
        return this.api.eggGroupRetrieveWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.
     * Get egg group
     * @param param the request object
     */
    public eggGroupRetrieve(param: PokemonApiEggGroupRetrieveRequest, options?: ConfigurationOptions): Promise<EggGroupDetail> {
        return this.api.eggGroupRetrieve(param.id,  options).toPromise();
    }

    /**
     * Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.
     * List genders
     * @param param the request object
     */
    public genderListWithHttpInfo(param: PokemonApiGenderListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<PaginatedGenderSummaryList>> {
        return this.api.genderListWithHttpInfo(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.
     * List genders
     * @param param the request object
     */
    public genderList(param: PokemonApiGenderListRequest = {}, options?: ConfigurationOptions): Promise<PaginatedGenderSummaryList> {
        return this.api.genderList(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.
     * Get gender
     * @param param the request object
     */
    public genderRetrieveWithHttpInfo(param: PokemonApiGenderRetrieveRequest, options?: ConfigurationOptions): Promise<HttpInfo<GenderDetail>> {
        return this.api.genderRetrieveWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.
     * Get gender
     * @param param the request object
     */
    public genderRetrieve(param: PokemonApiGenderRetrieveRequest, options?: ConfigurationOptions): Promise<GenderDetail> {
        return this.api.genderRetrieve(param.id,  options).toPromise();
    }

    /**
     * Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.
     * List growth rates
     * @param param the request object
     */
    public growthRateListWithHttpInfo(param: PokemonApiGrowthRateListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<PaginatedGrowthRateSummaryList>> {
        return this.api.growthRateListWithHttpInfo(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.
     * List growth rates
     * @param param the request object
     */
    public growthRateList(param: PokemonApiGrowthRateListRequest = {}, options?: ConfigurationOptions): Promise<PaginatedGrowthRateSummaryList> {
        return this.api.growthRateList(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.
     * Get growth rate
     * @param param the request object
     */
    public growthRateRetrieveWithHttpInfo(param: PokemonApiGrowthRateRetrieveRequest, options?: ConfigurationOptions): Promise<HttpInfo<GrowthRateDetail>> {
        return this.api.growthRateRetrieveWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.
     * Get growth rate
     * @param param the request object
     */
    public growthRateRetrieve(param: PokemonApiGrowthRateRetrieveRequest, options?: ConfigurationOptions): Promise<GrowthRateDetail> {
        return this.api.growthRateRetrieve(param.id,  options).toPromise();
    }

    /**
     * Damage classes moves can have, e.g. physical, special, or non-damaging.
     * List move damage classes
     * @param param the request object
     */
    public moveDamageClassListWithHttpInfo(param: PokemonApiMoveDamageClassListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<PaginatedMoveDamageClassSummaryList>> {
        return this.api.moveDamageClassListWithHttpInfo(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Damage classes moves can have, e.g. physical, special, or non-damaging.
     * List move damage classes
     * @param param the request object
     */
    public moveDamageClassList(param: PokemonApiMoveDamageClassListRequest = {}, options?: ConfigurationOptions): Promise<PaginatedMoveDamageClassSummaryList> {
        return this.api.moveDamageClassList(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Damage classes moves can have, e.g. physical, special, or non-damaging.
     * Get move damage class
     * @param param the request object
     */
    public moveDamageClassRetrieveWithHttpInfo(param: PokemonApiMoveDamageClassRetrieveRequest, options?: ConfigurationOptions): Promise<HttpInfo<MoveDamageClassDetail>> {
        return this.api.moveDamageClassRetrieveWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * Damage classes moves can have, e.g. physical, special, or non-damaging.
     * Get move damage class
     * @param param the request object
     */
    public moveDamageClassRetrieve(param: PokemonApiMoveDamageClassRetrieveRequest, options?: ConfigurationOptions): Promise<MoveDamageClassDetail> {
        return this.api.moveDamageClassRetrieve(param.id,  options).toPromise();
    }

    /**
     * Natures influence how a Pokémon\'s stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.
     * List natures
     * @param param the request object
     */
    public natureListWithHttpInfo(param: PokemonApiNatureListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<PaginatedNatureSummaryList>> {
        return this.api.natureListWithHttpInfo(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Natures influence how a Pokémon\'s stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.
     * List natures
     * @param param the request object
     */
    public natureList(param: PokemonApiNatureListRequest = {}, options?: ConfigurationOptions): Promise<PaginatedNatureSummaryList> {
        return this.api.natureList(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Natures influence how a Pokémon\'s stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.
     * Get nature
     * @param param the request object
     */
    public natureRetrieveWithHttpInfo(param: PokemonApiNatureRetrieveRequest, options?: ConfigurationOptions): Promise<HttpInfo<NatureDetail>> {
        return this.api.natureRetrieveWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * Natures influence how a Pokémon\'s stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.
     * Get nature
     * @param param the request object
     */
    public natureRetrieve(param: PokemonApiNatureRetrieveRequest, options?: ConfigurationOptions): Promise<NatureDetail> {
        return this.api.natureRetrieve(param.id,  options).toPromise();
    }

    /**
     * Pokeathlon Stats are different attributes of a Pokémon\'s performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.
     * List pokeathlon stats
     * @param param the request object
     */
    public pokeathlonStatListWithHttpInfo(param: PokemonApiPokeathlonStatListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<PaginatedPokeathlonStatSummaryList>> {
        return this.api.pokeathlonStatListWithHttpInfo(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Pokeathlon Stats are different attributes of a Pokémon\'s performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.
     * List pokeathlon stats
     * @param param the request object
     */
    public pokeathlonStatList(param: PokemonApiPokeathlonStatListRequest = {}, options?: ConfigurationOptions): Promise<PaginatedPokeathlonStatSummaryList> {
        return this.api.pokeathlonStatList(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Pokeathlon Stats are different attributes of a Pokémon\'s performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.
     * Get pokeathlon stat
     * @param param the request object
     */
    public pokeathlonStatRetrieveWithHttpInfo(param: PokemonApiPokeathlonStatRetrieveRequest, options?: ConfigurationOptions): Promise<HttpInfo<PokeathlonStatDetail>> {
        return this.api.pokeathlonStatRetrieveWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * Pokeathlon Stats are different attributes of a Pokémon\'s performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.
     * Get pokeathlon stat
     * @param param the request object
     */
    public pokeathlonStatRetrieve(param: PokemonApiPokeathlonStatRetrieveRequest, options?: ConfigurationOptions): Promise<PokeathlonStatDetail> {
        return this.api.pokeathlonStatRetrieve(param.id,  options).toPromise();
    }

    /**
     * Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon\'s body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.
     * List pokemon colors
     * @param param the request object
     */
    public pokemonColorListWithHttpInfo(param: PokemonApiPokemonColorListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<PaginatedPokemonColorSummaryList>> {
        return this.api.pokemonColorListWithHttpInfo(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon\'s body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.
     * List pokemon colors
     * @param param the request object
     */
    public pokemonColorList(param: PokemonApiPokemonColorListRequest = {}, options?: ConfigurationOptions): Promise<PaginatedPokemonColorSummaryList> {
        return this.api.pokemonColorList(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon\'s body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.
     * Get pokemon color
     * @param param the request object
     */
    public pokemonColorRetrieveWithHttpInfo(param: PokemonApiPokemonColorRetrieveRequest, options?: ConfigurationOptions): Promise<HttpInfo<PokemonColorDetail>> {
        return this.api.pokemonColorRetrieveWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon\'s body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.
     * Get pokemon color
     * @param param the request object
     */
    public pokemonColorRetrieve(param: PokemonApiPokemonColorRetrieveRequest, options?: ConfigurationOptions): Promise<PokemonColorDetail> {
        return this.api.pokemonColorRetrieve(param.id,  options).toPromise();
    }

    /**
     * Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the \'Pokémon\' entity is used to represent such a variety.
     * List pokemon forms
     * @param param the request object
     */
    public pokemonFormListWithHttpInfo(param: PokemonApiPokemonFormListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<PaginatedPokemonFormSummaryList>> {
        return this.api.pokemonFormListWithHttpInfo(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the \'Pokémon\' entity is used to represent such a variety.
     * List pokemon forms
     * @param param the request object
     */
    public pokemonFormList(param: PokemonApiPokemonFormListRequest = {}, options?: ConfigurationOptions): Promise<PaginatedPokemonFormSummaryList> {
        return this.api.pokemonFormList(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the \'Pokémon\' entity is used to represent such a variety.
     * Get pokemon form
     * @param param the request object
     */
    public pokemonFormRetrieveWithHttpInfo(param: PokemonApiPokemonFormRetrieveRequest, options?: ConfigurationOptions): Promise<HttpInfo<PokemonFormDetail>> {
        return this.api.pokemonFormRetrieveWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the \'Pokémon\' entity is used to represent such a variety.
     * Get pokemon form
     * @param param the request object
     */
    public pokemonFormRetrieve(param: PokemonApiPokemonFormRetrieveRequest, options?: ConfigurationOptions): Promise<PokemonFormDetail> {
        return this.api.pokemonFormRetrieve(param.id,  options).toPromise();
    }

    /**
     * Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.
     * List pokemom habitas
     * @param param the request object
     */
    public pokemonHabitatListWithHttpInfo(param: PokemonApiPokemonHabitatListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<PaginatedPokemonHabitatSummaryList>> {
        return this.api.pokemonHabitatListWithHttpInfo(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.
     * List pokemom habitas
     * @param param the request object
     */
    public pokemonHabitatList(param: PokemonApiPokemonHabitatListRequest = {}, options?: ConfigurationOptions): Promise<PaginatedPokemonHabitatSummaryList> {
        return this.api.pokemonHabitatList(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.
     * Get pokemom habita
     * @param param the request object
     */
    public pokemonHabitatRetrieveWithHttpInfo(param: PokemonApiPokemonHabitatRetrieveRequest, options?: ConfigurationOptions): Promise<HttpInfo<PokemonHabitatDetail>> {
        return this.api.pokemonHabitatRetrieveWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.
     * Get pokemom habita
     * @param param the request object
     */
    public pokemonHabitatRetrieve(param: PokemonApiPokemonHabitatRetrieveRequest, options?: ConfigurationOptions): Promise<PokemonHabitatDetail> {
        return this.api.pokemonHabitatRetrieve(param.id,  options).toPromise();
    }

    /**
     * Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.
     * List pokemon
     * @param param the request object
     */
    public pokemonListWithHttpInfo(param: PokemonApiPokemonListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<PaginatedPokemonSummaryList>> {
        return this.api.pokemonListWithHttpInfo(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.
     * List pokemon
     * @param param the request object
     */
    public pokemonList(param: PokemonApiPokemonListRequest = {}, options?: ConfigurationOptions): Promise<PaginatedPokemonSummaryList> {
        return this.api.pokemonList(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.
     * Get pokemon
     * @param param the request object
     */
    public pokemonRetrieveWithHttpInfo(param: PokemonApiPokemonRetrieveRequest, options?: ConfigurationOptions): Promise<HttpInfo<PokemonDetail>> {
        return this.api.pokemonRetrieveWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.
     * Get pokemon
     * @param param the request object
     */
    public pokemonRetrieve(param: PokemonApiPokemonRetrieveRequest, options?: ConfigurationOptions): Promise<PokemonDetail> {
        return this.api.pokemonRetrieve(param.id,  options).toPromise();
    }

    /**
     * Shapes used for sorting Pokémon in a Pokédex.
     * List pokemon shapes
     * @param param the request object
     */
    public pokemonShapeListWithHttpInfo(param: PokemonApiPokemonShapeListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<PaginatedPokemonShapeSummaryList>> {
        return this.api.pokemonShapeListWithHttpInfo(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Shapes used for sorting Pokémon in a Pokédex.
     * List pokemon shapes
     * @param param the request object
     */
    public pokemonShapeList(param: PokemonApiPokemonShapeListRequest = {}, options?: ConfigurationOptions): Promise<PaginatedPokemonShapeSummaryList> {
        return this.api.pokemonShapeList(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Shapes used for sorting Pokémon in a Pokédex.
     * Get pokemon shape
     * @param param the request object
     */
    public pokemonShapeRetrieveWithHttpInfo(param: PokemonApiPokemonShapeRetrieveRequest, options?: ConfigurationOptions): Promise<HttpInfo<PokemonShapeDetail>> {
        return this.api.pokemonShapeRetrieveWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * Shapes used for sorting Pokémon in a Pokédex.
     * Get pokemon shape
     * @param param the request object
     */
    public pokemonShapeRetrieve(param: PokemonApiPokemonShapeRetrieveRequest, options?: ConfigurationOptions): Promise<PokemonShapeDetail> {
        return this.api.pokemonShapeRetrieve(param.id,  options).toPromise();
    }

    /**
     * A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.
     * List pokemon species
     * @param param the request object
     */
    public pokemonSpeciesListWithHttpInfo(param: PokemonApiPokemonSpeciesListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<PaginatedPokemonSpeciesSummaryList>> {
        return this.api.pokemonSpeciesListWithHttpInfo(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.
     * List pokemon species
     * @param param the request object
     */
    public pokemonSpeciesList(param: PokemonApiPokemonSpeciesListRequest = {}, options?: ConfigurationOptions): Promise<PaginatedPokemonSpeciesSummaryList> {
        return this.api.pokemonSpeciesList(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.
     * Get pokemon species
     * @param param the request object
     */
    public pokemonSpeciesRetrieveWithHttpInfo(param: PokemonApiPokemonSpeciesRetrieveRequest, options?: ConfigurationOptions): Promise<HttpInfo<PokemonSpeciesDetail>> {
        return this.api.pokemonSpeciesRetrieveWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.
     * Get pokemon species
     * @param param the request object
     */
    public pokemonSpeciesRetrieve(param: PokemonApiPokemonSpeciesRetrieveRequest, options?: ConfigurationOptions): Promise<PokemonSpeciesDetail> {
        return this.api.pokemonSpeciesRetrieve(param.id,  options).toPromise();
    }

    /**
     * Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.
     * List stats
     * @param param the request object
     */
    public statListWithHttpInfo(param: PokemonApiStatListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<PaginatedStatSummaryList>> {
        return this.api.statListWithHttpInfo(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.
     * List stats
     * @param param the request object
     */
    public statList(param: PokemonApiStatListRequest = {}, options?: ConfigurationOptions): Promise<PaginatedStatSummaryList> {
        return this.api.statList(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.
     * Get stat
     * @param param the request object
     */
    public statRetrieveWithHttpInfo(param: PokemonApiStatRetrieveRequest, options?: ConfigurationOptions): Promise<HttpInfo<StatDetail>> {
        return this.api.statRetrieveWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.
     * Get stat
     * @param param the request object
     */
    public statRetrieve(param: PokemonApiStatRetrieveRequest, options?: ConfigurationOptions): Promise<StatDetail> {
        return this.api.statRetrieve(param.id,  options).toPromise();
    }

    /**
     * Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.
     * List types
     * @param param the request object
     */
    public typeListWithHttpInfo(param: PokemonApiTypeListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<PaginatedTypeSummaryList>> {
        return this.api.typeListWithHttpInfo(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.
     * List types
     * @param param the request object
     */
    public typeList(param: PokemonApiTypeListRequest = {}, options?: ConfigurationOptions): Promise<PaginatedTypeSummaryList> {
        return this.api.typeList(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.
     * Get types
     * @param param the request object
     */
    public typeRetrieveWithHttpInfo(param: PokemonApiTypeRetrieveRequest, options?: ConfigurationOptions): Promise<HttpInfo<TypeDetail>> {
        return this.api.typeRetrieveWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.
     * Get types
     * @param param the request object
     */
    public typeRetrieve(param: PokemonApiTypeRetrieveRequest, options?: ConfigurationOptions): Promise<TypeDetail> {
        return this.api.typeRetrieve(param.id,  options).toPromise();
    }

}

import { ObservableUtilityApi } from "./ObservableAPI";
import { UtilityApiRequestFactory, UtilityApiResponseProcessor} from "../apis/UtilityApi";

export interface UtilityApiLanguageListRequest {
    /**
     * Number of results to return per page.
     * Defaults to: undefined
     * @type number
     * @memberof UtilityApilanguageList
     */
    limit?: number
    /**
     * The initial index from which to return the results.
     * Defaults to: undefined
     * @type number
     * @memberof UtilityApilanguageList
     */
    offset?: number
    /**
     * &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     * Defaults to: undefined
     * @type string
     * @memberof UtilityApilanguageList
     */
    q?: string
}

export interface UtilityApiLanguageRetrieveRequest {
    /**
     * This parameter can be a string or an integer.
     * Defaults to: undefined
     * @type string
     * @memberof UtilityApilanguageRetrieve
     */
    id: string
}

export class ObjectUtilityApi {
    private api: ObservableUtilityApi

    public constructor(configuration: Configuration, requestFactory?: UtilityApiRequestFactory, responseProcessor?: UtilityApiResponseProcessor) {
        this.api = new ObservableUtilityApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Languages for translations of API resource information.
     * List languages
     * @param param the request object
     */
    public languageListWithHttpInfo(param: UtilityApiLanguageListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<PaginatedLanguageSummaryList>> {
        return this.api.languageListWithHttpInfo(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Languages for translations of API resource information.
     * List languages
     * @param param the request object
     */
    public languageList(param: UtilityApiLanguageListRequest = {}, options?: ConfigurationOptions): Promise<PaginatedLanguageSummaryList> {
        return this.api.languageList(param.limit, param.offset, param.q,  options).toPromise();
    }

    /**
     * Languages for translations of API resource information.
     * Get language
     * @param param the request object
     */
    public languageRetrieveWithHttpInfo(param: UtilityApiLanguageRetrieveRequest, options?: ConfigurationOptions): Promise<HttpInfo<LanguageDetail>> {
        return this.api.languageRetrieveWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * Languages for translations of API resource information.
     * Get language
     * @param param the request object
     */
    public languageRetrieve(param: UtilityApiLanguageRetrieveRequest, options?: ConfigurationOptions): Promise<LanguageDetail> {
        return this.api.languageRetrieve(param.id,  options).toPromise();
    }

}
