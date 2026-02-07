import { ResponseContext, RequestContext, HttpFile, HttpInfo } from '../http/http';
import { Configuration, PromiseConfigurationOptions, wrapOptions } from '../configuration'
import { PromiseMiddleware, Middleware, PromiseMiddlewareWrapper } from '../middleware';

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
import { PokemonEncountersRetrieve200ResponseInner } from '../models/PokemonEncountersRetrieve200ResponseInner';
import { PokemonEncountersRetrieve200ResponseInnerLocationArea } from '../models/PokemonEncountersRetrieve200ResponseInnerLocationArea';
import { PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner } from '../models/PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner';
import { PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner } from '../models/PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner';
import { PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner } from '../models/PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner';
import { PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod } from '../models/PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod';
import { PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion } from '../models/PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion';
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
import { ObservableBerriesApi } from './ObservableAPI';

import { BerriesApiRequestFactory, BerriesApiResponseProcessor} from "../apis/BerriesApi";
export class PromiseBerriesApi {
    private api: ObservableBerriesApi

    public constructor(
        configuration: Configuration,
        requestFactory?: BerriesApiRequestFactory,
        responseProcessor?: BerriesApiResponseProcessor
    ) {
        this.api = new ObservableBerriesApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.
     * List berry firmness
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public berryFirmnessListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<PaginatedBerryFirmnessSummaryList>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.berryFirmnessListWithHttpInfo(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.
     * List berry firmness
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public berryFirmnessList(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<PaginatedBerryFirmnessSummaryList> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.berryFirmnessList(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.
     * Get berry by firmness
     * @param id This parameter can be a string or an integer.
     */
    public berryFirmnessRetrieveWithHttpInfo(id: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<BerryFirmnessDetail>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.berryFirmnessRetrieveWithHttpInfo(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.
     * Get berry by firmness
     * @param id This parameter can be a string or an integer.
     */
    public berryFirmnessRetrieve(id: string, _options?: PromiseConfigurationOptions): Promise<BerryFirmnessDetail> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.berryFirmnessRetrieve(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.
     * List berry flavors
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public berryFlavorListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<PaginatedBerryFlavorSummaryList>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.berryFlavorListWithHttpInfo(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.
     * List berry flavors
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public berryFlavorList(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<PaginatedBerryFlavorSummaryList> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.berryFlavorList(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.
     * Get berries by flavor
     * @param id This parameter can be a string or an integer.
     */
    public berryFlavorRetrieveWithHttpInfo(id: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<BerryFlavorDetail>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.berryFlavorRetrieveWithHttpInfo(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.
     * Get berries by flavor
     * @param id This parameter can be a string or an integer.
     */
    public berryFlavorRetrieve(id: string, _options?: PromiseConfigurationOptions): Promise<BerryFlavorDetail> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.berryFlavorRetrieve(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.
     * List berries
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public berryListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<PaginatedBerrySummaryList>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.berryListWithHttpInfo(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.
     * List berries
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public berryList(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<PaginatedBerrySummaryList> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.berryList(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.
     * Get a berry
     * @param id This parameter can be a string or an integer.
     */
    public berryRetrieveWithHttpInfo(id: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<BerryDetail>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.berryRetrieveWithHttpInfo(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.
     * Get a berry
     * @param id This parameter can be a string or an integer.
     */
    public berryRetrieve(id: string, _options?: PromiseConfigurationOptions): Promise<BerryDetail> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.berryRetrieve(id, observableOptions);
        return result.toPromise();
    }


}



import { ObservableContestsApi } from './ObservableAPI';

import { ContestsApiRequestFactory, ContestsApiResponseProcessor} from "../apis/ContestsApi";
export class PromiseContestsApi {
    private api: ObservableContestsApi

    public constructor(
        configuration: Configuration,
        requestFactory?: ContestsApiRequestFactory,
        responseProcessor?: ContestsApiResponseProcessor
    ) {
        this.api = new ObservableContestsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Contest effects refer to the effects of moves when used in contests.
     * List contest effects
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public contestEffectListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<PaginatedContestEffectSummaryList>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.contestEffectListWithHttpInfo(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Contest effects refer to the effects of moves when used in contests.
     * List contest effects
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public contestEffectList(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<PaginatedContestEffectSummaryList> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.contestEffectList(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Contest effects refer to the effects of moves when used in contests.
     * Get contest effect
     * @param id This parameter can be a string or an integer.
     */
    public contestEffectRetrieveWithHttpInfo(id: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<ContestEffectDetail>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.contestEffectRetrieveWithHttpInfo(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Contest effects refer to the effects of moves when used in contests.
     * Get contest effect
     * @param id This parameter can be a string or an integer.
     */
    public contestEffectRetrieve(id: string, _options?: PromiseConfigurationOptions): Promise<ContestEffectDetail> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.contestEffectRetrieve(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Contest types are categories judges used to weigh a Pokémon\'s condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.
     * List contest types
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public contestTypeListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<PaginatedContestTypeSummaryList>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.contestTypeListWithHttpInfo(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Contest types are categories judges used to weigh a Pokémon\'s condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.
     * List contest types
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public contestTypeList(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<PaginatedContestTypeSummaryList> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.contestTypeList(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Contest types are categories judges used to weigh a Pokémon\'s condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.
     * Get contest type
     * @param id This parameter can be a string or an integer.
     */
    public contestTypeRetrieveWithHttpInfo(id: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<ContestTypeDetail>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.contestTypeRetrieveWithHttpInfo(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Contest types are categories judges used to weigh a Pokémon\'s condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.
     * Get contest type
     * @param id This parameter can be a string or an integer.
     */
    public contestTypeRetrieve(id: string, _options?: PromiseConfigurationOptions): Promise<ContestTypeDetail> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.contestTypeRetrieve(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Super contest effects refer to the effects of moves when used in super contests.
     * List super contest effects
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public superContestEffectListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<PaginatedSuperContestEffectSummaryList>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.superContestEffectListWithHttpInfo(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Super contest effects refer to the effects of moves when used in super contests.
     * List super contest effects
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public superContestEffectList(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<PaginatedSuperContestEffectSummaryList> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.superContestEffectList(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Super contest effects refer to the effects of moves when used in super contests.
     * Get super contest effect
     * @param id This parameter can be a string or an integer.
     */
    public superContestEffectRetrieveWithHttpInfo(id: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<SuperContestEffectDetail>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.superContestEffectRetrieveWithHttpInfo(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Super contest effects refer to the effects of moves when used in super contests.
     * Get super contest effect
     * @param id This parameter can be a string or an integer.
     */
    public superContestEffectRetrieve(id: string, _options?: PromiseConfigurationOptions): Promise<SuperContestEffectDetail> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.superContestEffectRetrieve(id, observableOptions);
        return result.toPromise();
    }


}



import { ObservableEncountersApi } from './ObservableAPI';

import { EncountersApiRequestFactory, EncountersApiResponseProcessor} from "../apis/EncountersApi";
export class PromiseEncountersApi {
    private api: ObservableEncountersApi

    public constructor(
        configuration: Configuration,
        requestFactory?: EncountersApiRequestFactory,
        responseProcessor?: EncountersApiResponseProcessor
    ) {
        this.api = new ObservableEncountersApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Conditions which affect what pokemon might appear in the wild, e.g., day or night.
     * List encounter conditions
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public encounterConditionListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<PaginatedEncounterConditionSummaryList>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.encounterConditionListWithHttpInfo(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Conditions which affect what pokemon might appear in the wild, e.g., day or night.
     * List encounter conditions
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public encounterConditionList(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<PaginatedEncounterConditionSummaryList> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.encounterConditionList(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Conditions which affect what pokemon might appear in the wild, e.g., day or night.
     * Get encounter condition
     * @param id This parameter can be a string or an integer.
     */
    public encounterConditionRetrieveWithHttpInfo(id: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<EncounterConditionDetail>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.encounterConditionRetrieveWithHttpInfo(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Conditions which affect what pokemon might appear in the wild, e.g., day or night.
     * Get encounter condition
     * @param id This parameter can be a string or an integer.
     */
    public encounterConditionRetrieve(id: string, _options?: PromiseConfigurationOptions): Promise<EncounterConditionDetail> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.encounterConditionRetrieve(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.
     * List encounter condition values
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public encounterConditionValueListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<PaginatedEncounterConditionValueSummaryList>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.encounterConditionValueListWithHttpInfo(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.
     * List encounter condition values
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public encounterConditionValueList(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<PaginatedEncounterConditionValueSummaryList> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.encounterConditionValueList(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.
     * Get encounter condition value
     * @param id This parameter can be a string or an integer.
     */
    public encounterConditionValueRetrieveWithHttpInfo(id: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<EncounterConditionValueDetail>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.encounterConditionValueRetrieveWithHttpInfo(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.
     * Get encounter condition value
     * @param id This parameter can be a string or an integer.
     */
    public encounterConditionValueRetrieve(id: string, _options?: PromiseConfigurationOptions): Promise<EncounterConditionValueDetail> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.encounterConditionValueRetrieve(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.
     * List encounter methods
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public encounterMethodListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<PaginatedEncounterMethodSummaryList>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.encounterMethodListWithHttpInfo(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.
     * List encounter methods
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public encounterMethodList(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<PaginatedEncounterMethodSummaryList> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.encounterMethodList(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.
     * Get encounter method
     * @param id This parameter can be a string or an integer.
     */
    public encounterMethodRetrieveWithHttpInfo(id: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<EncounterMethodDetail>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.encounterMethodRetrieveWithHttpInfo(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.
     * Get encounter method
     * @param id This parameter can be a string or an integer.
     */
    public encounterMethodRetrieve(id: string, _options?: PromiseConfigurationOptions): Promise<EncounterMethodDetail> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.encounterMethodRetrieve(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Handles Pokemon Encounters as a sub-resource.
     * Get pokemon encounter
     * @param pokemonId
     */
    public pokemonEncountersRetrieveWithHttpInfo(pokemonId: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<Array<PokemonEncountersRetrieve200ResponseInner>>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.pokemonEncountersRetrieveWithHttpInfo(pokemonId, observableOptions);
        return result.toPromise();
    }

    /**
     * Handles Pokemon Encounters as a sub-resource.
     * Get pokemon encounter
     * @param pokemonId
     */
    public pokemonEncountersRetrieve(pokemonId: string, _options?: PromiseConfigurationOptions): Promise<Array<PokemonEncountersRetrieve200ResponseInner>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.pokemonEncountersRetrieve(pokemonId, observableOptions);
        return result.toPromise();
    }


}



import { ObservableEvolutionApi } from './ObservableAPI';

import { EvolutionApiRequestFactory, EvolutionApiResponseProcessor} from "../apis/EvolutionApi";
export class PromiseEvolutionApi {
    private api: ObservableEvolutionApi

    public constructor(
        configuration: Configuration,
        requestFactory?: EvolutionApiRequestFactory,
        responseProcessor?: EvolutionApiResponseProcessor
    ) {
        this.api = new ObservableEvolutionApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.
     * List evolution chains
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public evolutionChainListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<PaginatedEvolutionChainSummaryList>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.evolutionChainListWithHttpInfo(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.
     * List evolution chains
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public evolutionChainList(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<PaginatedEvolutionChainSummaryList> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.evolutionChainList(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.
     * Get evolution chain
     * @param id This parameter can be a string or an integer.
     */
    public evolutionChainRetrieveWithHttpInfo(id: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<EvolutionChainDetail>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.evolutionChainRetrieveWithHttpInfo(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.
     * Get evolution chain
     * @param id This parameter can be a string or an integer.
     */
    public evolutionChainRetrieve(id: string, _options?: PromiseConfigurationOptions): Promise<EvolutionChainDetail> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.evolutionChainRetrieve(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.
     * List evolution triggers
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public evolutionTriggerListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<PaginatedEvolutionTriggerSummaryList>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.evolutionTriggerListWithHttpInfo(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.
     * List evolution triggers
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public evolutionTriggerList(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<PaginatedEvolutionTriggerSummaryList> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.evolutionTriggerList(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.
     * Get evolution trigger
     * @param id This parameter can be a string or an integer.
     */
    public evolutionTriggerRetrieveWithHttpInfo(id: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<EvolutionTriggerDetail>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.evolutionTriggerRetrieveWithHttpInfo(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.
     * Get evolution trigger
     * @param id This parameter can be a string or an integer.
     */
    public evolutionTriggerRetrieve(id: string, _options?: PromiseConfigurationOptions): Promise<EvolutionTriggerDetail> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.evolutionTriggerRetrieve(id, observableOptions);
        return result.toPromise();
    }


}



import { ObservableGamesApi } from './ObservableAPI';

import { GamesApiRequestFactory, GamesApiResponseProcessor} from "../apis/GamesApi";
export class PromiseGamesApi {
    private api: ObservableGamesApi

    public constructor(
        configuration: Configuration,
        requestFactory?: GamesApiRequestFactory,
        responseProcessor?: GamesApiResponseProcessor
    ) {
        this.api = new ObservableGamesApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.
     * List genrations
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public generationListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<PaginatedGenerationSummaryList>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.generationListWithHttpInfo(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.
     * List genrations
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public generationList(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<PaginatedGenerationSummaryList> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.generationList(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.
     * Get genration
     * @param id This parameter can be a string or an integer.
     */
    public generationRetrieveWithHttpInfo(id: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<GenerationDetail>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.generationRetrieveWithHttpInfo(id, observableOptions);
        return result.toPromise();
    }

    /**
     * A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.
     * Get genration
     * @param id This parameter can be a string or an integer.
     */
    public generationRetrieve(id: string, _options?: PromiseConfigurationOptions): Promise<GenerationDetail> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.generationRetrieve(id, observableOptions);
        return result.toPromise();
    }

    /**
     * A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.
     * List pokedex
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public pokedexListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<PaginatedPokedexSummaryList>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.pokedexListWithHttpInfo(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.
     * List pokedex
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public pokedexList(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<PaginatedPokedexSummaryList> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.pokedexList(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.
     * Get pokedex
     * @param id This parameter can be a string or an integer.
     */
    public pokedexRetrieveWithHttpInfo(id: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<PokedexDetail>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.pokedexRetrieveWithHttpInfo(id, observableOptions);
        return result.toPromise();
    }

    /**
     * A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.
     * Get pokedex
     * @param id This parameter can be a string or an integer.
     */
    public pokedexRetrieve(id: string, _options?: PromiseConfigurationOptions): Promise<PokedexDetail> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.pokedexRetrieve(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Version groups categorize highly similar versions of the games.
     * List version groups
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public versionGroupListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<PaginatedVersionGroupSummaryList>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.versionGroupListWithHttpInfo(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Version groups categorize highly similar versions of the games.
     * List version groups
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public versionGroupList(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<PaginatedVersionGroupSummaryList> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.versionGroupList(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Version groups categorize highly similar versions of the games.
     * Get version group
     * @param id This parameter can be a string or an integer.
     */
    public versionGroupRetrieveWithHttpInfo(id: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<VersionGroupDetail>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.versionGroupRetrieveWithHttpInfo(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Version groups categorize highly similar versions of the games.
     * Get version group
     * @param id This parameter can be a string or an integer.
     */
    public versionGroupRetrieve(id: string, _options?: PromiseConfigurationOptions): Promise<VersionGroupDetail> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.versionGroupRetrieve(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Versions of the games, e.g., Red, Blue or Yellow.
     * List versions
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public versionListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<PaginatedVersionSummaryList>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.versionListWithHttpInfo(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Versions of the games, e.g., Red, Blue or Yellow.
     * List versions
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public versionList(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<PaginatedVersionSummaryList> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.versionList(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Versions of the games, e.g., Red, Blue or Yellow.
     * Get version
     * @param id This parameter can be a string or an integer.
     */
    public versionRetrieveWithHttpInfo(id: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<VersionDetail>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.versionRetrieveWithHttpInfo(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Versions of the games, e.g., Red, Blue or Yellow.
     * Get version
     * @param id This parameter can be a string or an integer.
     */
    public versionRetrieve(id: string, _options?: PromiseConfigurationOptions): Promise<VersionDetail> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.versionRetrieve(id, observableOptions);
        return result.toPromise();
    }


}



import { ObservableItemsApi } from './ObservableAPI';

import { ItemsApiRequestFactory, ItemsApiResponseProcessor} from "../apis/ItemsApi";
export class PromiseItemsApi {
    private api: ObservableItemsApi

    public constructor(
        configuration: Configuration,
        requestFactory?: ItemsApiRequestFactory,
        responseProcessor?: ItemsApiResponseProcessor
    ) {
        this.api = new ObservableItemsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Item attributes define particular aspects of items, e.g.\"usable in battle\" or \"consumable\".
     * List item attributes
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public itemAttributeListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<PaginatedItemAttributeSummaryList>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.itemAttributeListWithHttpInfo(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Item attributes define particular aspects of items, e.g.\"usable in battle\" or \"consumable\".
     * List item attributes
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public itemAttributeList(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<PaginatedItemAttributeSummaryList> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.itemAttributeList(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Item attributes define particular aspects of items, e.g.\"usable in battle\" or \"consumable\".
     * Get item attribute
     * @param id This parameter can be a string or an integer.
     */
    public itemAttributeRetrieveWithHttpInfo(id: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<ItemAttributeDetail>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.itemAttributeRetrieveWithHttpInfo(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Item attributes define particular aspects of items, e.g.\"usable in battle\" or \"consumable\".
     * Get item attribute
     * @param id This parameter can be a string or an integer.
     */
    public itemAttributeRetrieve(id: string, _options?: PromiseConfigurationOptions): Promise<ItemAttributeDetail> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.itemAttributeRetrieve(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Item categories determine where items will be placed in the players bag.
     * List item categories
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public itemCategoryListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<PaginatedItemCategorySummaryList>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.itemCategoryListWithHttpInfo(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Item categories determine where items will be placed in the players bag.
     * List item categories
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public itemCategoryList(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<PaginatedItemCategorySummaryList> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.itemCategoryList(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Item categories determine where items will be placed in the players bag.
     * Get item category
     * @param id This parameter can be a string or an integer.
     */
    public itemCategoryRetrieveWithHttpInfo(id: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<ItemCategoryDetail>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.itemCategoryRetrieveWithHttpInfo(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Item categories determine where items will be placed in the players bag.
     * Get item category
     * @param id This parameter can be a string or an integer.
     */
    public itemCategoryRetrieve(id: string, _options?: PromiseConfigurationOptions): Promise<ItemCategoryDetail> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.itemCategoryRetrieve(id, observableOptions);
        return result.toPromise();
    }

    /**
     * The various effects of the move\"Fling\" when used with different items.
     * List item fling effects
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public itemFlingEffectListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<PaginatedItemFlingEffectSummaryList>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.itemFlingEffectListWithHttpInfo(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * The various effects of the move\"Fling\" when used with different items.
     * List item fling effects
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public itemFlingEffectList(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<PaginatedItemFlingEffectSummaryList> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.itemFlingEffectList(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * The various effects of the move\"Fling\" when used with different items.
     * Get item fling effect
     * @param id This parameter can be a string or an integer.
     */
    public itemFlingEffectRetrieveWithHttpInfo(id: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<ItemFlingEffectDetail>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.itemFlingEffectRetrieveWithHttpInfo(id, observableOptions);
        return result.toPromise();
    }

    /**
     * The various effects of the move\"Fling\" when used with different items.
     * Get item fling effect
     * @param id This parameter can be a string or an integer.
     */
    public itemFlingEffectRetrieve(id: string, _options?: PromiseConfigurationOptions): Promise<ItemFlingEffectDetail> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.itemFlingEffectRetrieve(id, observableOptions);
        return result.toPromise();
    }

    /**
     * An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.
     * List items
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public itemListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<PaginatedItemSummaryList>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.itemListWithHttpInfo(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.
     * List items
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public itemList(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<PaginatedItemSummaryList> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.itemList(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Pockets within the players bag used for storing items by category.
     * List item pockets
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public itemPocketListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<PaginatedItemPocketSummaryList>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.itemPocketListWithHttpInfo(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Pockets within the players bag used for storing items by category.
     * List item pockets
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public itemPocketList(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<PaginatedItemPocketSummaryList> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.itemPocketList(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Pockets within the players bag used for storing items by category.
     * Get item pocket
     * @param id This parameter can be a string or an integer.
     */
    public itemPocketRetrieveWithHttpInfo(id: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<ItemPocketDetail>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.itemPocketRetrieveWithHttpInfo(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Pockets within the players bag used for storing items by category.
     * Get item pocket
     * @param id This parameter can be a string or an integer.
     */
    public itemPocketRetrieve(id: string, _options?: PromiseConfigurationOptions): Promise<ItemPocketDetail> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.itemPocketRetrieve(id, observableOptions);
        return result.toPromise();
    }

    /**
     * An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.
     * Get item
     * @param id This parameter can be a string or an integer.
     */
    public itemRetrieveWithHttpInfo(id: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<ItemDetail>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.itemRetrieveWithHttpInfo(id, observableOptions);
        return result.toPromise();
    }

    /**
     * An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.
     * Get item
     * @param id This parameter can be a string or an integer.
     */
    public itemRetrieve(id: string, _options?: PromiseConfigurationOptions): Promise<ItemDetail> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.itemRetrieve(id, observableOptions);
        return result.toPromise();
    }


}



import { ObservableLocationApi } from './ObservableAPI';

import { LocationApiRequestFactory, LocationApiResponseProcessor} from "../apis/LocationApi";
export class PromiseLocationApi {
    private api: ObservableLocationApi

    public constructor(
        configuration: Configuration,
        requestFactory?: LocationApiRequestFactory,
        responseProcessor?: LocationApiResponseProcessor
    ) {
        this.api = new ObservableLocationApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.
     * List location areas
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     */
    public locationAreaListWithHttpInfo(limit?: number, offset?: number, _options?: PromiseConfigurationOptions): Promise<HttpInfo<PaginatedLocationAreaSummaryList>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.locationAreaListWithHttpInfo(limit, offset, observableOptions);
        return result.toPromise();
    }

    /**
     * Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.
     * List location areas
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     */
    public locationAreaList(limit?: number, offset?: number, _options?: PromiseConfigurationOptions): Promise<PaginatedLocationAreaSummaryList> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.locationAreaList(limit, offset, observableOptions);
        return result.toPromise();
    }

    /**
     * Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.
     * Get location area
     * @param id A unique integer value identifying this location area.
     */
    public locationAreaRetrieveWithHttpInfo(id: number, _options?: PromiseConfigurationOptions): Promise<HttpInfo<LocationAreaDetail>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.locationAreaRetrieveWithHttpInfo(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.
     * Get location area
     * @param id A unique integer value identifying this location area.
     */
    public locationAreaRetrieve(id: number, _options?: PromiseConfigurationOptions): Promise<LocationAreaDetail> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.locationAreaRetrieve(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.
     * List locations
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public locationListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<PaginatedLocationSummaryList>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.locationListWithHttpInfo(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.
     * List locations
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public locationList(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<PaginatedLocationSummaryList> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.locationList(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.
     * Get location
     * @param id This parameter can be a string or an integer.
     */
    public locationRetrieveWithHttpInfo(id: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<LocationDetail>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.locationRetrieveWithHttpInfo(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.
     * Get location
     * @param id This parameter can be a string or an integer.
     */
    public locationRetrieve(id: string, _options?: PromiseConfigurationOptions): Promise<LocationDetail> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.locationRetrieve(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Areas used for grouping Pokémon encounters in Pal Park. They\'re like habitats that are specific to Pal Park.
     * List pal park areas
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public palParkAreaListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<PaginatedPalParkAreaSummaryList>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.palParkAreaListWithHttpInfo(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Areas used for grouping Pokémon encounters in Pal Park. They\'re like habitats that are specific to Pal Park.
     * List pal park areas
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public palParkAreaList(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<PaginatedPalParkAreaSummaryList> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.palParkAreaList(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Areas used for grouping Pokémon encounters in Pal Park. They\'re like habitats that are specific to Pal Park.
     * Get pal park area
     * @param id This parameter can be a string or an integer.
     */
    public palParkAreaRetrieveWithHttpInfo(id: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<PalParkAreaDetail>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.palParkAreaRetrieveWithHttpInfo(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Areas used for grouping Pokémon encounters in Pal Park. They\'re like habitats that are specific to Pal Park.
     * Get pal park area
     * @param id This parameter can be a string or an integer.
     */
    public palParkAreaRetrieve(id: string, _options?: PromiseConfigurationOptions): Promise<PalParkAreaDetail> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.palParkAreaRetrieve(id, observableOptions);
        return result.toPromise();
    }

    /**
     * A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.
     * List regions
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public regionListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<PaginatedRegionSummaryList>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.regionListWithHttpInfo(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.
     * List regions
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public regionList(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<PaginatedRegionSummaryList> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.regionList(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.
     * Get region
     * @param id This parameter can be a string or an integer.
     */
    public regionRetrieveWithHttpInfo(id: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<RegionDetail>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.regionRetrieveWithHttpInfo(id, observableOptions);
        return result.toPromise();
    }

    /**
     * A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.
     * Get region
     * @param id This parameter can be a string or an integer.
     */
    public regionRetrieve(id: string, _options?: PromiseConfigurationOptions): Promise<RegionDetail> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.regionRetrieve(id, observableOptions);
        return result.toPromise();
    }


}



import { ObservableMachinesApi } from './ObservableAPI';

import { MachinesApiRequestFactory, MachinesApiResponseProcessor} from "../apis/MachinesApi";
export class PromiseMachinesApi {
    private api: ObservableMachinesApi

    public constructor(
        configuration: Configuration,
        requestFactory?: MachinesApiRequestFactory,
        responseProcessor?: MachinesApiResponseProcessor
    ) {
        this.api = new ObservableMachinesApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.
     * List machines
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public machineListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<PaginatedMachineSummaryList>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.machineListWithHttpInfo(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.
     * List machines
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public machineList(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<PaginatedMachineSummaryList> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.machineList(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.
     * Get machine
     * @param id This parameter can be a string or an integer.
     */
    public machineRetrieveWithHttpInfo(id: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<MachineDetail>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.machineRetrieveWithHttpInfo(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.
     * Get machine
     * @param id This parameter can be a string or an integer.
     */
    public machineRetrieve(id: string, _options?: PromiseConfigurationOptions): Promise<MachineDetail> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.machineRetrieve(id, observableOptions);
        return result.toPromise();
    }


}



import { ObservableMovesApi } from './ObservableAPI';

import { MovesApiRequestFactory, MovesApiResponseProcessor} from "../apis/MovesApi";
export class PromiseMovesApi {
    private api: ObservableMovesApi

    public constructor(
        configuration: Configuration,
        requestFactory?: MovesApiRequestFactory,
        responseProcessor?: MovesApiResponseProcessor
    ) {
        this.api = new ObservableMovesApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.
     * List move meta ailments
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public moveAilmentListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<PaginatedMoveMetaAilmentSummaryList>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.moveAilmentListWithHttpInfo(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.
     * List move meta ailments
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public moveAilmentList(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<PaginatedMoveMetaAilmentSummaryList> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.moveAilmentList(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.
     * Get move meta ailment
     * @param id This parameter can be a string or an integer.
     */
    public moveAilmentRetrieveWithHttpInfo(id: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<MoveMetaAilmentDetail>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.moveAilmentRetrieveWithHttpInfo(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.
     * Get move meta ailment
     * @param id This parameter can be a string or an integer.
     */
    public moveAilmentRetrieve(id: string, _options?: PromiseConfigurationOptions): Promise<MoveMetaAilmentDetail> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.moveAilmentRetrieve(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.
     * List move battle styles
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public moveBattleStyleListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<PaginatedMoveBattleStyleSummaryList>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.moveBattleStyleListWithHttpInfo(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.
     * List move battle styles
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public moveBattleStyleList(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<PaginatedMoveBattleStyleSummaryList> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.moveBattleStyleList(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.
     * Get move battle style
     * @param id This parameter can be a string or an integer.
     */
    public moveBattleStyleRetrieveWithHttpInfo(id: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<MoveBattleStyleDetail>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.moveBattleStyleRetrieveWithHttpInfo(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.
     * Get move battle style
     * @param id This parameter can be a string or an integer.
     */
    public moveBattleStyleRetrieve(id: string, _options?: PromiseConfigurationOptions): Promise<MoveBattleStyleDetail> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.moveBattleStyleRetrieve(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Very general categories that loosely group move effects.
     * List move meta categories
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public moveCategoryListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<PaginatedMoveMetaCategorySummaryList>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.moveCategoryListWithHttpInfo(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Very general categories that loosely group move effects.
     * List move meta categories
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public moveCategoryList(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<PaginatedMoveMetaCategorySummaryList> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.moveCategoryList(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Very general categories that loosely group move effects.
     * Get move meta category
     * @param id This parameter can be a string or an integer.
     */
    public moveCategoryRetrieveWithHttpInfo(id: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<MoveMetaCategoryDetail>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.moveCategoryRetrieveWithHttpInfo(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Very general categories that loosely group move effects.
     * Get move meta category
     * @param id This parameter can be a string or an integer.
     */
    public moveCategoryRetrieve(id: string, _options?: PromiseConfigurationOptions): Promise<MoveMetaCategoryDetail> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.moveCategoryRetrieve(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Methods by which Pokémon can learn moves.
     * List move learn methods
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public moveLearnMethodListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<PaginatedMoveLearnMethodSummaryList>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.moveLearnMethodListWithHttpInfo(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Methods by which Pokémon can learn moves.
     * List move learn methods
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public moveLearnMethodList(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<PaginatedMoveLearnMethodSummaryList> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.moveLearnMethodList(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Methods by which Pokémon can learn moves.
     * Get move learn method
     * @param id This parameter can be a string or an integer.
     */
    public moveLearnMethodRetrieveWithHttpInfo(id: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<MoveLearnMethodDetail>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.moveLearnMethodRetrieveWithHttpInfo(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Methods by which Pokémon can learn moves.
     * Get move learn method
     * @param id This parameter can be a string or an integer.
     */
    public moveLearnMethodRetrieve(id: string, _options?: PromiseConfigurationOptions): Promise<MoveLearnMethodDetail> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.moveLearnMethodRetrieve(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.
     * List moves
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public moveListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<PaginatedMoveSummaryList>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.moveListWithHttpInfo(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.
     * List moves
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public moveList(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<PaginatedMoveSummaryList> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.moveList(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.
     * Get move
     * @param id This parameter can be a string or an integer.
     */
    public moveRetrieveWithHttpInfo(id: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<MoveDetail>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.moveRetrieveWithHttpInfo(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.
     * Get move
     * @param id This parameter can be a string or an integer.
     */
    public moveRetrieve(id: string, _options?: PromiseConfigurationOptions): Promise<MoveDetail> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.moveRetrieve(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.
     * List move targets
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public moveTargetListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<PaginatedMoveTargetSummaryList>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.moveTargetListWithHttpInfo(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.
     * List move targets
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public moveTargetList(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<PaginatedMoveTargetSummaryList> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.moveTargetList(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.
     * Get move target
     * @param id This parameter can be a string or an integer.
     */
    public moveTargetRetrieveWithHttpInfo(id: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<MoveTargetDetail>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.moveTargetRetrieveWithHttpInfo(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.
     * Get move target
     * @param id This parameter can be a string or an integer.
     */
    public moveTargetRetrieve(id: string, _options?: PromiseConfigurationOptions): Promise<MoveTargetDetail> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.moveTargetRetrieve(id, observableOptions);
        return result.toPromise();
    }


}



import { ObservablePokemonApi } from './ObservableAPI';

import { PokemonApiRequestFactory, PokemonApiResponseProcessor} from "../apis/PokemonApi";
export class PromisePokemonApi {
    private api: ObservablePokemonApi

    public constructor(
        configuration: Configuration,
        requestFactory?: PokemonApiRequestFactory,
        responseProcessor?: PokemonApiResponseProcessor
    ) {
        this.api = new ObservablePokemonApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public abilityListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<PaginatedAbilitySummaryList>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.abilityListWithHttpInfo(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public abilityList(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<PaginatedAbilitySummaryList> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.abilityList(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.
     * @param id This parameter can be a string or an integer.
     */
    public abilityRetrieveWithHttpInfo(id: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<AbilityDetail>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.abilityRetrieveWithHttpInfo(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.
     * @param id This parameter can be a string or an integer.
     */
    public abilityRetrieve(id: string, _options?: PromiseConfigurationOptions): Promise<AbilityDetail> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.abilityRetrieve(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Characteristics indicate which stat contains a Pokémon\'s highest IV. A Pokémon\'s Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.
     * List charecterictics
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public characteristicListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<PaginatedCharacteristicSummaryList>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.characteristicListWithHttpInfo(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Characteristics indicate which stat contains a Pokémon\'s highest IV. A Pokémon\'s Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.
     * List charecterictics
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public characteristicList(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<PaginatedCharacteristicSummaryList> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.characteristicList(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Characteristics indicate which stat contains a Pokémon\'s highest IV. A Pokémon\'s Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.
     * Get characteristic
     * @param id This parameter can be a string or an integer.
     */
    public characteristicRetrieveWithHttpInfo(id: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<CharacteristicDetail>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.characteristicRetrieveWithHttpInfo(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Characteristics indicate which stat contains a Pokémon\'s highest IV. A Pokémon\'s Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.
     * Get characteristic
     * @param id This parameter can be a string or an integer.
     */
    public characteristicRetrieve(id: string, _options?: PromiseConfigurationOptions): Promise<CharacteristicDetail> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.characteristicRetrieve(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.
     * List egg groups
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public eggGroupListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<PaginatedEggGroupSummaryList>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.eggGroupListWithHttpInfo(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.
     * List egg groups
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public eggGroupList(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<PaginatedEggGroupSummaryList> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.eggGroupList(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.
     * Get egg group
     * @param id This parameter can be a string or an integer.
     */
    public eggGroupRetrieveWithHttpInfo(id: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<EggGroupDetail>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.eggGroupRetrieveWithHttpInfo(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.
     * Get egg group
     * @param id This parameter can be a string or an integer.
     */
    public eggGroupRetrieve(id: string, _options?: PromiseConfigurationOptions): Promise<EggGroupDetail> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.eggGroupRetrieve(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.
     * List genders
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public genderListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<PaginatedGenderSummaryList>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.genderListWithHttpInfo(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.
     * List genders
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public genderList(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<PaginatedGenderSummaryList> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.genderList(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.
     * Get gender
     * @param id This parameter can be a string or an integer.
     */
    public genderRetrieveWithHttpInfo(id: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<GenderDetail>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.genderRetrieveWithHttpInfo(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.
     * Get gender
     * @param id This parameter can be a string or an integer.
     */
    public genderRetrieve(id: string, _options?: PromiseConfigurationOptions): Promise<GenderDetail> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.genderRetrieve(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.
     * List growth rates
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public growthRateListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<PaginatedGrowthRateSummaryList>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.growthRateListWithHttpInfo(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.
     * List growth rates
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public growthRateList(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<PaginatedGrowthRateSummaryList> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.growthRateList(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.
     * Get growth rate
     * @param id This parameter can be a string or an integer.
     */
    public growthRateRetrieveWithHttpInfo(id: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<GrowthRateDetail>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.growthRateRetrieveWithHttpInfo(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.
     * Get growth rate
     * @param id This parameter can be a string or an integer.
     */
    public growthRateRetrieve(id: string, _options?: PromiseConfigurationOptions): Promise<GrowthRateDetail> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.growthRateRetrieve(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Damage classes moves can have, e.g. physical, special, or non-damaging.
     * List move damage classes
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public moveDamageClassListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<PaginatedMoveDamageClassSummaryList>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.moveDamageClassListWithHttpInfo(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Damage classes moves can have, e.g. physical, special, or non-damaging.
     * List move damage classes
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public moveDamageClassList(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<PaginatedMoveDamageClassSummaryList> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.moveDamageClassList(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Damage classes moves can have, e.g. physical, special, or non-damaging.
     * Get move damage class
     * @param id This parameter can be a string or an integer.
     */
    public moveDamageClassRetrieveWithHttpInfo(id: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<MoveDamageClassDetail>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.moveDamageClassRetrieveWithHttpInfo(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Damage classes moves can have, e.g. physical, special, or non-damaging.
     * Get move damage class
     * @param id This parameter can be a string or an integer.
     */
    public moveDamageClassRetrieve(id: string, _options?: PromiseConfigurationOptions): Promise<MoveDamageClassDetail> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.moveDamageClassRetrieve(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Natures influence how a Pokémon\'s stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.
     * List natures
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public natureListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<PaginatedNatureSummaryList>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.natureListWithHttpInfo(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Natures influence how a Pokémon\'s stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.
     * List natures
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public natureList(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<PaginatedNatureSummaryList> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.natureList(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Natures influence how a Pokémon\'s stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.
     * Get nature
     * @param id This parameter can be a string or an integer.
     */
    public natureRetrieveWithHttpInfo(id: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<NatureDetail>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.natureRetrieveWithHttpInfo(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Natures influence how a Pokémon\'s stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.
     * Get nature
     * @param id This parameter can be a string or an integer.
     */
    public natureRetrieve(id: string, _options?: PromiseConfigurationOptions): Promise<NatureDetail> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.natureRetrieve(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Pokeathlon Stats are different attributes of a Pokémon\'s performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.
     * List pokeathlon stats
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public pokeathlonStatListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<PaginatedPokeathlonStatSummaryList>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.pokeathlonStatListWithHttpInfo(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Pokeathlon Stats are different attributes of a Pokémon\'s performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.
     * List pokeathlon stats
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public pokeathlonStatList(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<PaginatedPokeathlonStatSummaryList> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.pokeathlonStatList(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Pokeathlon Stats are different attributes of a Pokémon\'s performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.
     * Get pokeathlon stat
     * @param id This parameter can be a string or an integer.
     */
    public pokeathlonStatRetrieveWithHttpInfo(id: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<PokeathlonStatDetail>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.pokeathlonStatRetrieveWithHttpInfo(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Pokeathlon Stats are different attributes of a Pokémon\'s performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.
     * Get pokeathlon stat
     * @param id This parameter can be a string or an integer.
     */
    public pokeathlonStatRetrieve(id: string, _options?: PromiseConfigurationOptions): Promise<PokeathlonStatDetail> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.pokeathlonStatRetrieve(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon\'s body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.
     * List pokemon colors
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public pokemonColorListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<PaginatedPokemonColorSummaryList>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.pokemonColorListWithHttpInfo(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon\'s body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.
     * List pokemon colors
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public pokemonColorList(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<PaginatedPokemonColorSummaryList> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.pokemonColorList(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon\'s body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.
     * Get pokemon color
     * @param id This parameter can be a string or an integer.
     */
    public pokemonColorRetrieveWithHttpInfo(id: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<PokemonColorDetail>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.pokemonColorRetrieveWithHttpInfo(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon\'s body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.
     * Get pokemon color
     * @param id This parameter can be a string or an integer.
     */
    public pokemonColorRetrieve(id: string, _options?: PromiseConfigurationOptions): Promise<PokemonColorDetail> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.pokemonColorRetrieve(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the \'Pokémon\' entity is used to represent such a variety.
     * List pokemon forms
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public pokemonFormListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<PaginatedPokemonFormSummaryList>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.pokemonFormListWithHttpInfo(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the \'Pokémon\' entity is used to represent such a variety.
     * List pokemon forms
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public pokemonFormList(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<PaginatedPokemonFormSummaryList> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.pokemonFormList(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the \'Pokémon\' entity is used to represent such a variety.
     * Get pokemon form
     * @param id This parameter can be a string or an integer.
     */
    public pokemonFormRetrieveWithHttpInfo(id: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<PokemonFormDetail>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.pokemonFormRetrieveWithHttpInfo(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the \'Pokémon\' entity is used to represent such a variety.
     * Get pokemon form
     * @param id This parameter can be a string or an integer.
     */
    public pokemonFormRetrieve(id: string, _options?: PromiseConfigurationOptions): Promise<PokemonFormDetail> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.pokemonFormRetrieve(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.
     * List pokemom habitas
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public pokemonHabitatListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<PaginatedPokemonHabitatSummaryList>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.pokemonHabitatListWithHttpInfo(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.
     * List pokemom habitas
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public pokemonHabitatList(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<PaginatedPokemonHabitatSummaryList> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.pokemonHabitatList(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.
     * Get pokemom habita
     * @param id This parameter can be a string or an integer.
     */
    public pokemonHabitatRetrieveWithHttpInfo(id: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<PokemonHabitatDetail>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.pokemonHabitatRetrieveWithHttpInfo(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.
     * Get pokemom habita
     * @param id This parameter can be a string or an integer.
     */
    public pokemonHabitatRetrieve(id: string, _options?: PromiseConfigurationOptions): Promise<PokemonHabitatDetail> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.pokemonHabitatRetrieve(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.
     * List pokemon
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public pokemonListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<PaginatedPokemonSummaryList>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.pokemonListWithHttpInfo(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.
     * List pokemon
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public pokemonList(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<PaginatedPokemonSummaryList> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.pokemonList(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.
     * Get pokemon
     * @param id This parameter can be a string or an integer.
     */
    public pokemonRetrieveWithHttpInfo(id: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<PokemonDetail>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.pokemonRetrieveWithHttpInfo(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.
     * Get pokemon
     * @param id This parameter can be a string or an integer.
     */
    public pokemonRetrieve(id: string, _options?: PromiseConfigurationOptions): Promise<PokemonDetail> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.pokemonRetrieve(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Shapes used for sorting Pokémon in a Pokédex.
     * List pokemon shapes
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public pokemonShapeListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<PaginatedPokemonShapeSummaryList>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.pokemonShapeListWithHttpInfo(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Shapes used for sorting Pokémon in a Pokédex.
     * List pokemon shapes
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public pokemonShapeList(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<PaginatedPokemonShapeSummaryList> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.pokemonShapeList(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Shapes used for sorting Pokémon in a Pokédex.
     * Get pokemon shape
     * @param id This parameter can be a string or an integer.
     */
    public pokemonShapeRetrieveWithHttpInfo(id: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<PokemonShapeDetail>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.pokemonShapeRetrieveWithHttpInfo(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Shapes used for sorting Pokémon in a Pokédex.
     * Get pokemon shape
     * @param id This parameter can be a string or an integer.
     */
    public pokemonShapeRetrieve(id: string, _options?: PromiseConfigurationOptions): Promise<PokemonShapeDetail> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.pokemonShapeRetrieve(id, observableOptions);
        return result.toPromise();
    }

    /**
     * A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.
     * List pokemon species
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public pokemonSpeciesListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<PaginatedPokemonSpeciesSummaryList>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.pokemonSpeciesListWithHttpInfo(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.
     * List pokemon species
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public pokemonSpeciesList(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<PaginatedPokemonSpeciesSummaryList> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.pokemonSpeciesList(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.
     * Get pokemon species
     * @param id This parameter can be a string or an integer.
     */
    public pokemonSpeciesRetrieveWithHttpInfo(id: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<PokemonSpeciesDetail>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.pokemonSpeciesRetrieveWithHttpInfo(id, observableOptions);
        return result.toPromise();
    }

    /**
     * A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.
     * Get pokemon species
     * @param id This parameter can be a string or an integer.
     */
    public pokemonSpeciesRetrieve(id: string, _options?: PromiseConfigurationOptions): Promise<PokemonSpeciesDetail> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.pokemonSpeciesRetrieve(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.
     * List stats
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public statListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<PaginatedStatSummaryList>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.statListWithHttpInfo(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.
     * List stats
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public statList(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<PaginatedStatSummaryList> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.statList(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.
     * Get stat
     * @param id This parameter can be a string or an integer.
     */
    public statRetrieveWithHttpInfo(id: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<StatDetail>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.statRetrieveWithHttpInfo(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.
     * Get stat
     * @param id This parameter can be a string or an integer.
     */
    public statRetrieve(id: string, _options?: PromiseConfigurationOptions): Promise<StatDetail> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.statRetrieve(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.
     * List types
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public typeListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<PaginatedTypeSummaryList>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.typeListWithHttpInfo(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.
     * List types
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public typeList(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<PaginatedTypeSummaryList> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.typeList(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.
     * Get types
     * @param id This parameter can be a string or an integer.
     */
    public typeRetrieveWithHttpInfo(id: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<TypeDetail>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.typeRetrieveWithHttpInfo(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.
     * Get types
     * @param id This parameter can be a string or an integer.
     */
    public typeRetrieve(id: string, _options?: PromiseConfigurationOptions): Promise<TypeDetail> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.typeRetrieve(id, observableOptions);
        return result.toPromise();
    }


}



import { ObservableUtilityApi } from './ObservableAPI';

import { UtilityApiRequestFactory, UtilityApiResponseProcessor} from "../apis/UtilityApi";
export class PromiseUtilityApi {
    private api: ObservableUtilityApi

    public constructor(
        configuration: Configuration,
        requestFactory?: UtilityApiRequestFactory,
        responseProcessor?: UtilityApiResponseProcessor
    ) {
        this.api = new ObservableUtilityApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Languages for translations of API resource information.
     * List languages
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public languageListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<PaginatedLanguageSummaryList>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.languageListWithHttpInfo(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Languages for translations of API resource information.
     * List languages
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public languageList(limit?: number, offset?: number, q?: string, _options?: PromiseConfigurationOptions): Promise<PaginatedLanguageSummaryList> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.languageList(limit, offset, q, observableOptions);
        return result.toPromise();
    }

    /**
     * Languages for translations of API resource information.
     * Get language
     * @param id This parameter can be a string or an integer.
     */
    public languageRetrieveWithHttpInfo(id: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<LanguageDetail>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.languageRetrieveWithHttpInfo(id, observableOptions);
        return result.toPromise();
    }

    /**
     * Languages for translations of API resource information.
     * Get language
     * @param id This parameter can be a string or an integer.
     */
    public languageRetrieve(id: string, _options?: PromiseConfigurationOptions): Promise<LanguageDetail> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.languageRetrieve(id, observableOptions);
        return result.toPromise();
    }


}



