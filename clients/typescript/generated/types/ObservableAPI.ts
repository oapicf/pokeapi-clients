import { ResponseContext, RequestContext, HttpFile, HttpInfo } from '../http/http';
import { Configuration, ConfigurationOptions, mergeConfiguration } from '../configuration'
import type { Middleware } from '../middleware';
import { Observable, of, from } from '../rxjsStub';
import {mergeMap, map} from  '../rxjsStub';
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

import { BerriesApiRequestFactory, BerriesApiResponseProcessor} from "../apis/BerriesApi";
export class ObservableBerriesApi {
    private requestFactory: BerriesApiRequestFactory;
    private responseProcessor: BerriesApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: BerriesApiRequestFactory,
        responseProcessor?: BerriesApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new BerriesApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new BerriesApiResponseProcessor();
    }

    /**
     * Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.
     * List berry firmness
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public berryFirmnessListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<HttpInfo<PaginatedBerryFirmnessSummaryList>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.berryFirmnessList(limit, offset, q, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.berryFirmnessListWithHttpInfo(rsp)));
            }));
    }

    /**
     * Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.
     * List berry firmness
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public berryFirmnessList(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<PaginatedBerryFirmnessSummaryList> {
        return this.berryFirmnessListWithHttpInfo(limit, offset, q, _options).pipe(map((apiResponse: HttpInfo<PaginatedBerryFirmnessSummaryList>) => apiResponse.data));
    }

    /**
     * Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.
     * Get berry by firmness
     * @param id This parameter can be a string or an integer.
     */
    public berryFirmnessRetrieveWithHttpInfo(id: string, _options?: ConfigurationOptions): Observable<HttpInfo<BerryFirmnessDetail>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.berryFirmnessRetrieve(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.berryFirmnessRetrieveWithHttpInfo(rsp)));
            }));
    }

    /**
     * Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.
     * Get berry by firmness
     * @param id This parameter can be a string or an integer.
     */
    public berryFirmnessRetrieve(id: string, _options?: ConfigurationOptions): Observable<BerryFirmnessDetail> {
        return this.berryFirmnessRetrieveWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<BerryFirmnessDetail>) => apiResponse.data));
    }

    /**
     * Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.
     * List berry flavors
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public berryFlavorListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<HttpInfo<PaginatedBerryFlavorSummaryList>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.berryFlavorList(limit, offset, q, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.berryFlavorListWithHttpInfo(rsp)));
            }));
    }

    /**
     * Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.
     * List berry flavors
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public berryFlavorList(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<PaginatedBerryFlavorSummaryList> {
        return this.berryFlavorListWithHttpInfo(limit, offset, q, _options).pipe(map((apiResponse: HttpInfo<PaginatedBerryFlavorSummaryList>) => apiResponse.data));
    }

    /**
     * Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.
     * Get berries by flavor
     * @param id This parameter can be a string or an integer.
     */
    public berryFlavorRetrieveWithHttpInfo(id: string, _options?: ConfigurationOptions): Observable<HttpInfo<BerryFlavorDetail>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.berryFlavorRetrieve(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.berryFlavorRetrieveWithHttpInfo(rsp)));
            }));
    }

    /**
     * Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.
     * Get berries by flavor
     * @param id This parameter can be a string or an integer.
     */
    public berryFlavorRetrieve(id: string, _options?: ConfigurationOptions): Observable<BerryFlavorDetail> {
        return this.berryFlavorRetrieveWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<BerryFlavorDetail>) => apiResponse.data));
    }

    /**
     * Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.
     * List berries
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public berryListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<HttpInfo<PaginatedBerrySummaryList>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.berryList(limit, offset, q, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.berryListWithHttpInfo(rsp)));
            }));
    }

    /**
     * Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.
     * List berries
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public berryList(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<PaginatedBerrySummaryList> {
        return this.berryListWithHttpInfo(limit, offset, q, _options).pipe(map((apiResponse: HttpInfo<PaginatedBerrySummaryList>) => apiResponse.data));
    }

    /**
     * Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.
     * Get a berry
     * @param id This parameter can be a string or an integer.
     */
    public berryRetrieveWithHttpInfo(id: string, _options?: ConfigurationOptions): Observable<HttpInfo<BerryDetail>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.berryRetrieve(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.berryRetrieveWithHttpInfo(rsp)));
            }));
    }

    /**
     * Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.
     * Get a berry
     * @param id This parameter can be a string or an integer.
     */
    public berryRetrieve(id: string, _options?: ConfigurationOptions): Observable<BerryDetail> {
        return this.berryRetrieveWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<BerryDetail>) => apiResponse.data));
    }

}

import { ContestsApiRequestFactory, ContestsApiResponseProcessor} from "../apis/ContestsApi";
export class ObservableContestsApi {
    private requestFactory: ContestsApiRequestFactory;
    private responseProcessor: ContestsApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: ContestsApiRequestFactory,
        responseProcessor?: ContestsApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new ContestsApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new ContestsApiResponseProcessor();
    }

    /**
     * Contest effects refer to the effects of moves when used in contests.
     * List contest effects
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public contestEffectListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<HttpInfo<PaginatedContestEffectSummaryList>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.contestEffectList(limit, offset, q, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.contestEffectListWithHttpInfo(rsp)));
            }));
    }

    /**
     * Contest effects refer to the effects of moves when used in contests.
     * List contest effects
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public contestEffectList(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<PaginatedContestEffectSummaryList> {
        return this.contestEffectListWithHttpInfo(limit, offset, q, _options).pipe(map((apiResponse: HttpInfo<PaginatedContestEffectSummaryList>) => apiResponse.data));
    }

    /**
     * Contest effects refer to the effects of moves when used in contests.
     * Get contest effect
     * @param id This parameter can be a string or an integer.
     */
    public contestEffectRetrieveWithHttpInfo(id: string, _options?: ConfigurationOptions): Observable<HttpInfo<ContestEffectDetail>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.contestEffectRetrieve(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.contestEffectRetrieveWithHttpInfo(rsp)));
            }));
    }

    /**
     * Contest effects refer to the effects of moves when used in contests.
     * Get contest effect
     * @param id This parameter can be a string or an integer.
     */
    public contestEffectRetrieve(id: string, _options?: ConfigurationOptions): Observable<ContestEffectDetail> {
        return this.contestEffectRetrieveWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<ContestEffectDetail>) => apiResponse.data));
    }

    /**
     * Contest types are categories judges used to weigh a Pokémon\'s condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.
     * List contest types
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public contestTypeListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<HttpInfo<PaginatedContestTypeSummaryList>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.contestTypeList(limit, offset, q, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.contestTypeListWithHttpInfo(rsp)));
            }));
    }

    /**
     * Contest types are categories judges used to weigh a Pokémon\'s condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.
     * List contest types
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public contestTypeList(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<PaginatedContestTypeSummaryList> {
        return this.contestTypeListWithHttpInfo(limit, offset, q, _options).pipe(map((apiResponse: HttpInfo<PaginatedContestTypeSummaryList>) => apiResponse.data));
    }

    /**
     * Contest types are categories judges used to weigh a Pokémon\'s condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.
     * Get contest type
     * @param id This parameter can be a string or an integer.
     */
    public contestTypeRetrieveWithHttpInfo(id: string, _options?: ConfigurationOptions): Observable<HttpInfo<ContestTypeDetail>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.contestTypeRetrieve(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.contestTypeRetrieveWithHttpInfo(rsp)));
            }));
    }

    /**
     * Contest types are categories judges used to weigh a Pokémon\'s condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.
     * Get contest type
     * @param id This parameter can be a string or an integer.
     */
    public contestTypeRetrieve(id: string, _options?: ConfigurationOptions): Observable<ContestTypeDetail> {
        return this.contestTypeRetrieveWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<ContestTypeDetail>) => apiResponse.data));
    }

    /**
     * Super contest effects refer to the effects of moves when used in super contests.
     * List super contest effects
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public superContestEffectListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<HttpInfo<PaginatedSuperContestEffectSummaryList>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.superContestEffectList(limit, offset, q, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.superContestEffectListWithHttpInfo(rsp)));
            }));
    }

    /**
     * Super contest effects refer to the effects of moves when used in super contests.
     * List super contest effects
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public superContestEffectList(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<PaginatedSuperContestEffectSummaryList> {
        return this.superContestEffectListWithHttpInfo(limit, offset, q, _options).pipe(map((apiResponse: HttpInfo<PaginatedSuperContestEffectSummaryList>) => apiResponse.data));
    }

    /**
     * Super contest effects refer to the effects of moves when used in super contests.
     * Get super contest effect
     * @param id This parameter can be a string or an integer.
     */
    public superContestEffectRetrieveWithHttpInfo(id: string, _options?: ConfigurationOptions): Observable<HttpInfo<SuperContestEffectDetail>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.superContestEffectRetrieve(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.superContestEffectRetrieveWithHttpInfo(rsp)));
            }));
    }

    /**
     * Super contest effects refer to the effects of moves when used in super contests.
     * Get super contest effect
     * @param id This parameter can be a string or an integer.
     */
    public superContestEffectRetrieve(id: string, _options?: ConfigurationOptions): Observable<SuperContestEffectDetail> {
        return this.superContestEffectRetrieveWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<SuperContestEffectDetail>) => apiResponse.data));
    }

}

import { EncountersApiRequestFactory, EncountersApiResponseProcessor} from "../apis/EncountersApi";
export class ObservableEncountersApi {
    private requestFactory: EncountersApiRequestFactory;
    private responseProcessor: EncountersApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: EncountersApiRequestFactory,
        responseProcessor?: EncountersApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new EncountersApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new EncountersApiResponseProcessor();
    }

    /**
     * Conditions which affect what pokemon might appear in the wild, e.g., day or night.
     * List encounter conditions
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public encounterConditionListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<HttpInfo<PaginatedEncounterConditionSummaryList>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.encounterConditionList(limit, offset, q, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.encounterConditionListWithHttpInfo(rsp)));
            }));
    }

    /**
     * Conditions which affect what pokemon might appear in the wild, e.g., day or night.
     * List encounter conditions
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public encounterConditionList(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<PaginatedEncounterConditionSummaryList> {
        return this.encounterConditionListWithHttpInfo(limit, offset, q, _options).pipe(map((apiResponse: HttpInfo<PaginatedEncounterConditionSummaryList>) => apiResponse.data));
    }

    /**
     * Conditions which affect what pokemon might appear in the wild, e.g., day or night.
     * Get encounter condition
     * @param id This parameter can be a string or an integer.
     */
    public encounterConditionRetrieveWithHttpInfo(id: string, _options?: ConfigurationOptions): Observable<HttpInfo<EncounterConditionDetail>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.encounterConditionRetrieve(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.encounterConditionRetrieveWithHttpInfo(rsp)));
            }));
    }

    /**
     * Conditions which affect what pokemon might appear in the wild, e.g., day or night.
     * Get encounter condition
     * @param id This parameter can be a string or an integer.
     */
    public encounterConditionRetrieve(id: string, _options?: ConfigurationOptions): Observable<EncounterConditionDetail> {
        return this.encounterConditionRetrieveWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<EncounterConditionDetail>) => apiResponse.data));
    }

    /**
     * Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.
     * List encounter condition values
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public encounterConditionValueListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<HttpInfo<PaginatedEncounterConditionValueSummaryList>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.encounterConditionValueList(limit, offset, q, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.encounterConditionValueListWithHttpInfo(rsp)));
            }));
    }

    /**
     * Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.
     * List encounter condition values
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public encounterConditionValueList(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<PaginatedEncounterConditionValueSummaryList> {
        return this.encounterConditionValueListWithHttpInfo(limit, offset, q, _options).pipe(map((apiResponse: HttpInfo<PaginatedEncounterConditionValueSummaryList>) => apiResponse.data));
    }

    /**
     * Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.
     * Get encounter condition value
     * @param id This parameter can be a string or an integer.
     */
    public encounterConditionValueRetrieveWithHttpInfo(id: string, _options?: ConfigurationOptions): Observable<HttpInfo<EncounterConditionValueDetail>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.encounterConditionValueRetrieve(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.encounterConditionValueRetrieveWithHttpInfo(rsp)));
            }));
    }

    /**
     * Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.
     * Get encounter condition value
     * @param id This parameter can be a string or an integer.
     */
    public encounterConditionValueRetrieve(id: string, _options?: ConfigurationOptions): Observable<EncounterConditionValueDetail> {
        return this.encounterConditionValueRetrieveWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<EncounterConditionValueDetail>) => apiResponse.data));
    }

    /**
     * Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.
     * List encounter methods
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public encounterMethodListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<HttpInfo<PaginatedEncounterMethodSummaryList>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.encounterMethodList(limit, offset, q, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.encounterMethodListWithHttpInfo(rsp)));
            }));
    }

    /**
     * Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.
     * List encounter methods
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public encounterMethodList(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<PaginatedEncounterMethodSummaryList> {
        return this.encounterMethodListWithHttpInfo(limit, offset, q, _options).pipe(map((apiResponse: HttpInfo<PaginatedEncounterMethodSummaryList>) => apiResponse.data));
    }

    /**
     * Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.
     * Get encounter method
     * @param id This parameter can be a string or an integer.
     */
    public encounterMethodRetrieveWithHttpInfo(id: string, _options?: ConfigurationOptions): Observable<HttpInfo<EncounterMethodDetail>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.encounterMethodRetrieve(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.encounterMethodRetrieveWithHttpInfo(rsp)));
            }));
    }

    /**
     * Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.
     * Get encounter method
     * @param id This parameter can be a string or an integer.
     */
    public encounterMethodRetrieve(id: string, _options?: ConfigurationOptions): Observable<EncounterMethodDetail> {
        return this.encounterMethodRetrieveWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<EncounterMethodDetail>) => apiResponse.data));
    }

    /**
     * Handles Pokemon Encounters as a sub-resource.
     * Get pokemon encounter
     * @param pokemonId
     */
    public pokemonEncountersRetrieveWithHttpInfo(pokemonId: string, _options?: ConfigurationOptions): Observable<HttpInfo<Array<PokemonEncountersRetrieve200ResponseInner>>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.pokemonEncountersRetrieve(pokemonId, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.pokemonEncountersRetrieveWithHttpInfo(rsp)));
            }));
    }

    /**
     * Handles Pokemon Encounters as a sub-resource.
     * Get pokemon encounter
     * @param pokemonId
     */
    public pokemonEncountersRetrieve(pokemonId: string, _options?: ConfigurationOptions): Observable<Array<PokemonEncountersRetrieve200ResponseInner>> {
        return this.pokemonEncountersRetrieveWithHttpInfo(pokemonId, _options).pipe(map((apiResponse: HttpInfo<Array<PokemonEncountersRetrieve200ResponseInner>>) => apiResponse.data));
    }

}

import { EvolutionApiRequestFactory, EvolutionApiResponseProcessor} from "../apis/EvolutionApi";
export class ObservableEvolutionApi {
    private requestFactory: EvolutionApiRequestFactory;
    private responseProcessor: EvolutionApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: EvolutionApiRequestFactory,
        responseProcessor?: EvolutionApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new EvolutionApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new EvolutionApiResponseProcessor();
    }

    /**
     * Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.
     * List evolution chains
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public evolutionChainListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<HttpInfo<PaginatedEvolutionChainSummaryList>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.evolutionChainList(limit, offset, q, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.evolutionChainListWithHttpInfo(rsp)));
            }));
    }

    /**
     * Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.
     * List evolution chains
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public evolutionChainList(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<PaginatedEvolutionChainSummaryList> {
        return this.evolutionChainListWithHttpInfo(limit, offset, q, _options).pipe(map((apiResponse: HttpInfo<PaginatedEvolutionChainSummaryList>) => apiResponse.data));
    }

    /**
     * Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.
     * Get evolution chain
     * @param id This parameter can be a string or an integer.
     */
    public evolutionChainRetrieveWithHttpInfo(id: string, _options?: ConfigurationOptions): Observable<HttpInfo<EvolutionChainDetail>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.evolutionChainRetrieve(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.evolutionChainRetrieveWithHttpInfo(rsp)));
            }));
    }

    /**
     * Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.
     * Get evolution chain
     * @param id This parameter can be a string or an integer.
     */
    public evolutionChainRetrieve(id: string, _options?: ConfigurationOptions): Observable<EvolutionChainDetail> {
        return this.evolutionChainRetrieveWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<EvolutionChainDetail>) => apiResponse.data));
    }

    /**
     * Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.
     * List evolution triggers
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public evolutionTriggerListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<HttpInfo<PaginatedEvolutionTriggerSummaryList>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.evolutionTriggerList(limit, offset, q, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.evolutionTriggerListWithHttpInfo(rsp)));
            }));
    }

    /**
     * Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.
     * List evolution triggers
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public evolutionTriggerList(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<PaginatedEvolutionTriggerSummaryList> {
        return this.evolutionTriggerListWithHttpInfo(limit, offset, q, _options).pipe(map((apiResponse: HttpInfo<PaginatedEvolutionTriggerSummaryList>) => apiResponse.data));
    }

    /**
     * Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.
     * Get evolution trigger
     * @param id This parameter can be a string or an integer.
     */
    public evolutionTriggerRetrieveWithHttpInfo(id: string, _options?: ConfigurationOptions): Observable<HttpInfo<EvolutionTriggerDetail>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.evolutionTriggerRetrieve(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.evolutionTriggerRetrieveWithHttpInfo(rsp)));
            }));
    }

    /**
     * Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.
     * Get evolution trigger
     * @param id This parameter can be a string or an integer.
     */
    public evolutionTriggerRetrieve(id: string, _options?: ConfigurationOptions): Observable<EvolutionTriggerDetail> {
        return this.evolutionTriggerRetrieveWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<EvolutionTriggerDetail>) => apiResponse.data));
    }

}

import { GamesApiRequestFactory, GamesApiResponseProcessor} from "../apis/GamesApi";
export class ObservableGamesApi {
    private requestFactory: GamesApiRequestFactory;
    private responseProcessor: GamesApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: GamesApiRequestFactory,
        responseProcessor?: GamesApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new GamesApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new GamesApiResponseProcessor();
    }

    /**
     * A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.
     * List genrations
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public generationListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<HttpInfo<PaginatedGenerationSummaryList>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.generationList(limit, offset, q, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.generationListWithHttpInfo(rsp)));
            }));
    }

    /**
     * A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.
     * List genrations
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public generationList(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<PaginatedGenerationSummaryList> {
        return this.generationListWithHttpInfo(limit, offset, q, _options).pipe(map((apiResponse: HttpInfo<PaginatedGenerationSummaryList>) => apiResponse.data));
    }

    /**
     * A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.
     * Get genration
     * @param id This parameter can be a string or an integer.
     */
    public generationRetrieveWithHttpInfo(id: string, _options?: ConfigurationOptions): Observable<HttpInfo<GenerationDetail>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.generationRetrieve(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.generationRetrieveWithHttpInfo(rsp)));
            }));
    }

    /**
     * A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.
     * Get genration
     * @param id This parameter can be a string or an integer.
     */
    public generationRetrieve(id: string, _options?: ConfigurationOptions): Observable<GenerationDetail> {
        return this.generationRetrieveWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<GenerationDetail>) => apiResponse.data));
    }

    /**
     * A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.
     * List pokedex
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public pokedexListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<HttpInfo<PaginatedPokedexSummaryList>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.pokedexList(limit, offset, q, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.pokedexListWithHttpInfo(rsp)));
            }));
    }

    /**
     * A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.
     * List pokedex
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public pokedexList(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<PaginatedPokedexSummaryList> {
        return this.pokedexListWithHttpInfo(limit, offset, q, _options).pipe(map((apiResponse: HttpInfo<PaginatedPokedexSummaryList>) => apiResponse.data));
    }

    /**
     * A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.
     * Get pokedex
     * @param id This parameter can be a string or an integer.
     */
    public pokedexRetrieveWithHttpInfo(id: string, _options?: ConfigurationOptions): Observable<HttpInfo<PokedexDetail>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.pokedexRetrieve(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.pokedexRetrieveWithHttpInfo(rsp)));
            }));
    }

    /**
     * A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.
     * Get pokedex
     * @param id This parameter can be a string or an integer.
     */
    public pokedexRetrieve(id: string, _options?: ConfigurationOptions): Observable<PokedexDetail> {
        return this.pokedexRetrieveWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<PokedexDetail>) => apiResponse.data));
    }

    /**
     * Version groups categorize highly similar versions of the games.
     * List version groups
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public versionGroupListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<HttpInfo<PaginatedVersionGroupSummaryList>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.versionGroupList(limit, offset, q, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.versionGroupListWithHttpInfo(rsp)));
            }));
    }

    /**
     * Version groups categorize highly similar versions of the games.
     * List version groups
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public versionGroupList(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<PaginatedVersionGroupSummaryList> {
        return this.versionGroupListWithHttpInfo(limit, offset, q, _options).pipe(map((apiResponse: HttpInfo<PaginatedVersionGroupSummaryList>) => apiResponse.data));
    }

    /**
     * Version groups categorize highly similar versions of the games.
     * Get version group
     * @param id This parameter can be a string or an integer.
     */
    public versionGroupRetrieveWithHttpInfo(id: string, _options?: ConfigurationOptions): Observable<HttpInfo<VersionGroupDetail>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.versionGroupRetrieve(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.versionGroupRetrieveWithHttpInfo(rsp)));
            }));
    }

    /**
     * Version groups categorize highly similar versions of the games.
     * Get version group
     * @param id This parameter can be a string or an integer.
     */
    public versionGroupRetrieve(id: string, _options?: ConfigurationOptions): Observable<VersionGroupDetail> {
        return this.versionGroupRetrieveWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<VersionGroupDetail>) => apiResponse.data));
    }

    /**
     * Versions of the games, e.g., Red, Blue or Yellow.
     * List versions
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public versionListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<HttpInfo<PaginatedVersionSummaryList>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.versionList(limit, offset, q, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.versionListWithHttpInfo(rsp)));
            }));
    }

    /**
     * Versions of the games, e.g., Red, Blue or Yellow.
     * List versions
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public versionList(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<PaginatedVersionSummaryList> {
        return this.versionListWithHttpInfo(limit, offset, q, _options).pipe(map((apiResponse: HttpInfo<PaginatedVersionSummaryList>) => apiResponse.data));
    }

    /**
     * Versions of the games, e.g., Red, Blue or Yellow.
     * Get version
     * @param id This parameter can be a string or an integer.
     */
    public versionRetrieveWithHttpInfo(id: string, _options?: ConfigurationOptions): Observable<HttpInfo<VersionDetail>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.versionRetrieve(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.versionRetrieveWithHttpInfo(rsp)));
            }));
    }

    /**
     * Versions of the games, e.g., Red, Blue or Yellow.
     * Get version
     * @param id This parameter can be a string or an integer.
     */
    public versionRetrieve(id: string, _options?: ConfigurationOptions): Observable<VersionDetail> {
        return this.versionRetrieveWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<VersionDetail>) => apiResponse.data));
    }

}

import { ItemsApiRequestFactory, ItemsApiResponseProcessor} from "../apis/ItemsApi";
export class ObservableItemsApi {
    private requestFactory: ItemsApiRequestFactory;
    private responseProcessor: ItemsApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: ItemsApiRequestFactory,
        responseProcessor?: ItemsApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new ItemsApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new ItemsApiResponseProcessor();
    }

    /**
     * Item attributes define particular aspects of items, e.g.\"usable in battle\" or \"consumable\".
     * List item attributes
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public itemAttributeListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<HttpInfo<PaginatedItemAttributeSummaryList>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.itemAttributeList(limit, offset, q, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.itemAttributeListWithHttpInfo(rsp)));
            }));
    }

    /**
     * Item attributes define particular aspects of items, e.g.\"usable in battle\" or \"consumable\".
     * List item attributes
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public itemAttributeList(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<PaginatedItemAttributeSummaryList> {
        return this.itemAttributeListWithHttpInfo(limit, offset, q, _options).pipe(map((apiResponse: HttpInfo<PaginatedItemAttributeSummaryList>) => apiResponse.data));
    }

    /**
     * Item attributes define particular aspects of items, e.g.\"usable in battle\" or \"consumable\".
     * Get item attribute
     * @param id This parameter can be a string or an integer.
     */
    public itemAttributeRetrieveWithHttpInfo(id: string, _options?: ConfigurationOptions): Observable<HttpInfo<ItemAttributeDetail>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.itemAttributeRetrieve(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.itemAttributeRetrieveWithHttpInfo(rsp)));
            }));
    }

    /**
     * Item attributes define particular aspects of items, e.g.\"usable in battle\" or \"consumable\".
     * Get item attribute
     * @param id This parameter can be a string or an integer.
     */
    public itemAttributeRetrieve(id: string, _options?: ConfigurationOptions): Observable<ItemAttributeDetail> {
        return this.itemAttributeRetrieveWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<ItemAttributeDetail>) => apiResponse.data));
    }

    /**
     * Item categories determine where items will be placed in the players bag.
     * List item categories
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public itemCategoryListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<HttpInfo<PaginatedItemCategorySummaryList>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.itemCategoryList(limit, offset, q, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.itemCategoryListWithHttpInfo(rsp)));
            }));
    }

    /**
     * Item categories determine where items will be placed in the players bag.
     * List item categories
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public itemCategoryList(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<PaginatedItemCategorySummaryList> {
        return this.itemCategoryListWithHttpInfo(limit, offset, q, _options).pipe(map((apiResponse: HttpInfo<PaginatedItemCategorySummaryList>) => apiResponse.data));
    }

    /**
     * Item categories determine where items will be placed in the players bag.
     * Get item category
     * @param id This parameter can be a string or an integer.
     */
    public itemCategoryRetrieveWithHttpInfo(id: string, _options?: ConfigurationOptions): Observable<HttpInfo<ItemCategoryDetail>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.itemCategoryRetrieve(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.itemCategoryRetrieveWithHttpInfo(rsp)));
            }));
    }

    /**
     * Item categories determine where items will be placed in the players bag.
     * Get item category
     * @param id This parameter can be a string or an integer.
     */
    public itemCategoryRetrieve(id: string, _options?: ConfigurationOptions): Observable<ItemCategoryDetail> {
        return this.itemCategoryRetrieveWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<ItemCategoryDetail>) => apiResponse.data));
    }

    /**
     * The various effects of the move\"Fling\" when used with different items.
     * List item fling effects
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public itemFlingEffectListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<HttpInfo<PaginatedItemFlingEffectSummaryList>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.itemFlingEffectList(limit, offset, q, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.itemFlingEffectListWithHttpInfo(rsp)));
            }));
    }

    /**
     * The various effects of the move\"Fling\" when used with different items.
     * List item fling effects
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public itemFlingEffectList(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<PaginatedItemFlingEffectSummaryList> {
        return this.itemFlingEffectListWithHttpInfo(limit, offset, q, _options).pipe(map((apiResponse: HttpInfo<PaginatedItemFlingEffectSummaryList>) => apiResponse.data));
    }

    /**
     * The various effects of the move\"Fling\" when used with different items.
     * Get item fling effect
     * @param id This parameter can be a string or an integer.
     */
    public itemFlingEffectRetrieveWithHttpInfo(id: string, _options?: ConfigurationOptions): Observable<HttpInfo<ItemFlingEffectDetail>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.itemFlingEffectRetrieve(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.itemFlingEffectRetrieveWithHttpInfo(rsp)));
            }));
    }

    /**
     * The various effects of the move\"Fling\" when used with different items.
     * Get item fling effect
     * @param id This parameter can be a string or an integer.
     */
    public itemFlingEffectRetrieve(id: string, _options?: ConfigurationOptions): Observable<ItemFlingEffectDetail> {
        return this.itemFlingEffectRetrieveWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<ItemFlingEffectDetail>) => apiResponse.data));
    }

    /**
     * An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.
     * List items
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public itemListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<HttpInfo<PaginatedItemSummaryList>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.itemList(limit, offset, q, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.itemListWithHttpInfo(rsp)));
            }));
    }

    /**
     * An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.
     * List items
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public itemList(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<PaginatedItemSummaryList> {
        return this.itemListWithHttpInfo(limit, offset, q, _options).pipe(map((apiResponse: HttpInfo<PaginatedItemSummaryList>) => apiResponse.data));
    }

    /**
     * Pockets within the players bag used for storing items by category.
     * List item pockets
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public itemPocketListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<HttpInfo<PaginatedItemPocketSummaryList>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.itemPocketList(limit, offset, q, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.itemPocketListWithHttpInfo(rsp)));
            }));
    }

    /**
     * Pockets within the players bag used for storing items by category.
     * List item pockets
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public itemPocketList(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<PaginatedItemPocketSummaryList> {
        return this.itemPocketListWithHttpInfo(limit, offset, q, _options).pipe(map((apiResponse: HttpInfo<PaginatedItemPocketSummaryList>) => apiResponse.data));
    }

    /**
     * Pockets within the players bag used for storing items by category.
     * Get item pocket
     * @param id This parameter can be a string or an integer.
     */
    public itemPocketRetrieveWithHttpInfo(id: string, _options?: ConfigurationOptions): Observable<HttpInfo<ItemPocketDetail>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.itemPocketRetrieve(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.itemPocketRetrieveWithHttpInfo(rsp)));
            }));
    }

    /**
     * Pockets within the players bag used for storing items by category.
     * Get item pocket
     * @param id This parameter can be a string or an integer.
     */
    public itemPocketRetrieve(id: string, _options?: ConfigurationOptions): Observable<ItemPocketDetail> {
        return this.itemPocketRetrieveWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<ItemPocketDetail>) => apiResponse.data));
    }

    /**
     * An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.
     * Get item
     * @param id This parameter can be a string or an integer.
     */
    public itemRetrieveWithHttpInfo(id: string, _options?: ConfigurationOptions): Observable<HttpInfo<ItemDetail>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.itemRetrieve(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.itemRetrieveWithHttpInfo(rsp)));
            }));
    }

    /**
     * An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.
     * Get item
     * @param id This parameter can be a string or an integer.
     */
    public itemRetrieve(id: string, _options?: ConfigurationOptions): Observable<ItemDetail> {
        return this.itemRetrieveWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<ItemDetail>) => apiResponse.data));
    }

}

import { LocationApiRequestFactory, LocationApiResponseProcessor} from "../apis/LocationApi";
export class ObservableLocationApi {
    private requestFactory: LocationApiRequestFactory;
    private responseProcessor: LocationApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: LocationApiRequestFactory,
        responseProcessor?: LocationApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new LocationApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new LocationApiResponseProcessor();
    }

    /**
     * Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.
     * List location areas
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     */
    public locationAreaListWithHttpInfo(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<HttpInfo<PaginatedLocationAreaSummaryList>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.locationAreaList(limit, offset, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.locationAreaListWithHttpInfo(rsp)));
            }));
    }

    /**
     * Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.
     * List location areas
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     */
    public locationAreaList(limit?: number, offset?: number, _options?: ConfigurationOptions): Observable<PaginatedLocationAreaSummaryList> {
        return this.locationAreaListWithHttpInfo(limit, offset, _options).pipe(map((apiResponse: HttpInfo<PaginatedLocationAreaSummaryList>) => apiResponse.data));
    }

    /**
     * Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.
     * Get location area
     * @param id A unique integer value identifying this location area.
     */
    public locationAreaRetrieveWithHttpInfo(id: number, _options?: ConfigurationOptions): Observable<HttpInfo<LocationAreaDetail>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.locationAreaRetrieve(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.locationAreaRetrieveWithHttpInfo(rsp)));
            }));
    }

    /**
     * Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.
     * Get location area
     * @param id A unique integer value identifying this location area.
     */
    public locationAreaRetrieve(id: number, _options?: ConfigurationOptions): Observable<LocationAreaDetail> {
        return this.locationAreaRetrieveWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<LocationAreaDetail>) => apiResponse.data));
    }

    /**
     * Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.
     * List locations
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public locationListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<HttpInfo<PaginatedLocationSummaryList>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.locationList(limit, offset, q, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.locationListWithHttpInfo(rsp)));
            }));
    }

    /**
     * Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.
     * List locations
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public locationList(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<PaginatedLocationSummaryList> {
        return this.locationListWithHttpInfo(limit, offset, q, _options).pipe(map((apiResponse: HttpInfo<PaginatedLocationSummaryList>) => apiResponse.data));
    }

    /**
     * Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.
     * Get location
     * @param id This parameter can be a string or an integer.
     */
    public locationRetrieveWithHttpInfo(id: string, _options?: ConfigurationOptions): Observable<HttpInfo<LocationDetail>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.locationRetrieve(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.locationRetrieveWithHttpInfo(rsp)));
            }));
    }

    /**
     * Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.
     * Get location
     * @param id This parameter can be a string or an integer.
     */
    public locationRetrieve(id: string, _options?: ConfigurationOptions): Observable<LocationDetail> {
        return this.locationRetrieveWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<LocationDetail>) => apiResponse.data));
    }

    /**
     * Areas used for grouping Pokémon encounters in Pal Park. They\'re like habitats that are specific to Pal Park.
     * List pal park areas
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public palParkAreaListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<HttpInfo<PaginatedPalParkAreaSummaryList>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.palParkAreaList(limit, offset, q, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.palParkAreaListWithHttpInfo(rsp)));
            }));
    }

    /**
     * Areas used for grouping Pokémon encounters in Pal Park. They\'re like habitats that are specific to Pal Park.
     * List pal park areas
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public palParkAreaList(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<PaginatedPalParkAreaSummaryList> {
        return this.palParkAreaListWithHttpInfo(limit, offset, q, _options).pipe(map((apiResponse: HttpInfo<PaginatedPalParkAreaSummaryList>) => apiResponse.data));
    }

    /**
     * Areas used for grouping Pokémon encounters in Pal Park. They\'re like habitats that are specific to Pal Park.
     * Get pal park area
     * @param id This parameter can be a string or an integer.
     */
    public palParkAreaRetrieveWithHttpInfo(id: string, _options?: ConfigurationOptions): Observable<HttpInfo<PalParkAreaDetail>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.palParkAreaRetrieve(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.palParkAreaRetrieveWithHttpInfo(rsp)));
            }));
    }

    /**
     * Areas used for grouping Pokémon encounters in Pal Park. They\'re like habitats that are specific to Pal Park.
     * Get pal park area
     * @param id This parameter can be a string or an integer.
     */
    public palParkAreaRetrieve(id: string, _options?: ConfigurationOptions): Observable<PalParkAreaDetail> {
        return this.palParkAreaRetrieveWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<PalParkAreaDetail>) => apiResponse.data));
    }

    /**
     * A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.
     * List regions
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public regionListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<HttpInfo<PaginatedRegionSummaryList>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.regionList(limit, offset, q, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.regionListWithHttpInfo(rsp)));
            }));
    }

    /**
     * A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.
     * List regions
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public regionList(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<PaginatedRegionSummaryList> {
        return this.regionListWithHttpInfo(limit, offset, q, _options).pipe(map((apiResponse: HttpInfo<PaginatedRegionSummaryList>) => apiResponse.data));
    }

    /**
     * A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.
     * Get region
     * @param id This parameter can be a string or an integer.
     */
    public regionRetrieveWithHttpInfo(id: string, _options?: ConfigurationOptions): Observable<HttpInfo<RegionDetail>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.regionRetrieve(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.regionRetrieveWithHttpInfo(rsp)));
            }));
    }

    /**
     * A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.
     * Get region
     * @param id This parameter can be a string or an integer.
     */
    public regionRetrieve(id: string, _options?: ConfigurationOptions): Observable<RegionDetail> {
        return this.regionRetrieveWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<RegionDetail>) => apiResponse.data));
    }

}

import { MachinesApiRequestFactory, MachinesApiResponseProcessor} from "../apis/MachinesApi";
export class ObservableMachinesApi {
    private requestFactory: MachinesApiRequestFactory;
    private responseProcessor: MachinesApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: MachinesApiRequestFactory,
        responseProcessor?: MachinesApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new MachinesApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new MachinesApiResponseProcessor();
    }

    /**
     * Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.
     * List machines
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public machineListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<HttpInfo<PaginatedMachineSummaryList>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.machineList(limit, offset, q, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.machineListWithHttpInfo(rsp)));
            }));
    }

    /**
     * Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.
     * List machines
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public machineList(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<PaginatedMachineSummaryList> {
        return this.machineListWithHttpInfo(limit, offset, q, _options).pipe(map((apiResponse: HttpInfo<PaginatedMachineSummaryList>) => apiResponse.data));
    }

    /**
     * Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.
     * Get machine
     * @param id This parameter can be a string or an integer.
     */
    public machineRetrieveWithHttpInfo(id: string, _options?: ConfigurationOptions): Observable<HttpInfo<MachineDetail>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.machineRetrieve(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.machineRetrieveWithHttpInfo(rsp)));
            }));
    }

    /**
     * Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.
     * Get machine
     * @param id This parameter can be a string or an integer.
     */
    public machineRetrieve(id: string, _options?: ConfigurationOptions): Observable<MachineDetail> {
        return this.machineRetrieveWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<MachineDetail>) => apiResponse.data));
    }

}

import { MovesApiRequestFactory, MovesApiResponseProcessor} from "../apis/MovesApi";
export class ObservableMovesApi {
    private requestFactory: MovesApiRequestFactory;
    private responseProcessor: MovesApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: MovesApiRequestFactory,
        responseProcessor?: MovesApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new MovesApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new MovesApiResponseProcessor();
    }

    /**
     * Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.
     * List move meta ailments
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public moveAilmentListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<HttpInfo<PaginatedMoveMetaAilmentSummaryList>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.moveAilmentList(limit, offset, q, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.moveAilmentListWithHttpInfo(rsp)));
            }));
    }

    /**
     * Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.
     * List move meta ailments
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public moveAilmentList(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<PaginatedMoveMetaAilmentSummaryList> {
        return this.moveAilmentListWithHttpInfo(limit, offset, q, _options).pipe(map((apiResponse: HttpInfo<PaginatedMoveMetaAilmentSummaryList>) => apiResponse.data));
    }

    /**
     * Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.
     * Get move meta ailment
     * @param id This parameter can be a string or an integer.
     */
    public moveAilmentRetrieveWithHttpInfo(id: string, _options?: ConfigurationOptions): Observable<HttpInfo<MoveMetaAilmentDetail>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.moveAilmentRetrieve(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.moveAilmentRetrieveWithHttpInfo(rsp)));
            }));
    }

    /**
     * Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.
     * Get move meta ailment
     * @param id This parameter can be a string or an integer.
     */
    public moveAilmentRetrieve(id: string, _options?: ConfigurationOptions): Observable<MoveMetaAilmentDetail> {
        return this.moveAilmentRetrieveWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<MoveMetaAilmentDetail>) => apiResponse.data));
    }

    /**
     * Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.
     * List move battle styles
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public moveBattleStyleListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<HttpInfo<PaginatedMoveBattleStyleSummaryList>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.moveBattleStyleList(limit, offset, q, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.moveBattleStyleListWithHttpInfo(rsp)));
            }));
    }

    /**
     * Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.
     * List move battle styles
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public moveBattleStyleList(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<PaginatedMoveBattleStyleSummaryList> {
        return this.moveBattleStyleListWithHttpInfo(limit, offset, q, _options).pipe(map((apiResponse: HttpInfo<PaginatedMoveBattleStyleSummaryList>) => apiResponse.data));
    }

    /**
     * Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.
     * Get move battle style
     * @param id This parameter can be a string or an integer.
     */
    public moveBattleStyleRetrieveWithHttpInfo(id: string, _options?: ConfigurationOptions): Observable<HttpInfo<MoveBattleStyleDetail>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.moveBattleStyleRetrieve(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.moveBattleStyleRetrieveWithHttpInfo(rsp)));
            }));
    }

    /**
     * Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.
     * Get move battle style
     * @param id This parameter can be a string or an integer.
     */
    public moveBattleStyleRetrieve(id: string, _options?: ConfigurationOptions): Observable<MoveBattleStyleDetail> {
        return this.moveBattleStyleRetrieveWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<MoveBattleStyleDetail>) => apiResponse.data));
    }

    /**
     * Very general categories that loosely group move effects.
     * List move meta categories
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public moveCategoryListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<HttpInfo<PaginatedMoveMetaCategorySummaryList>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.moveCategoryList(limit, offset, q, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.moveCategoryListWithHttpInfo(rsp)));
            }));
    }

    /**
     * Very general categories that loosely group move effects.
     * List move meta categories
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public moveCategoryList(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<PaginatedMoveMetaCategorySummaryList> {
        return this.moveCategoryListWithHttpInfo(limit, offset, q, _options).pipe(map((apiResponse: HttpInfo<PaginatedMoveMetaCategorySummaryList>) => apiResponse.data));
    }

    /**
     * Very general categories that loosely group move effects.
     * Get move meta category
     * @param id This parameter can be a string or an integer.
     */
    public moveCategoryRetrieveWithHttpInfo(id: string, _options?: ConfigurationOptions): Observable<HttpInfo<MoveMetaCategoryDetail>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.moveCategoryRetrieve(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.moveCategoryRetrieveWithHttpInfo(rsp)));
            }));
    }

    /**
     * Very general categories that loosely group move effects.
     * Get move meta category
     * @param id This parameter can be a string or an integer.
     */
    public moveCategoryRetrieve(id: string, _options?: ConfigurationOptions): Observable<MoveMetaCategoryDetail> {
        return this.moveCategoryRetrieveWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<MoveMetaCategoryDetail>) => apiResponse.data));
    }

    /**
     * Methods by which Pokémon can learn moves.
     * List move learn methods
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public moveLearnMethodListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<HttpInfo<PaginatedMoveLearnMethodSummaryList>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.moveLearnMethodList(limit, offset, q, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.moveLearnMethodListWithHttpInfo(rsp)));
            }));
    }

    /**
     * Methods by which Pokémon can learn moves.
     * List move learn methods
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public moveLearnMethodList(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<PaginatedMoveLearnMethodSummaryList> {
        return this.moveLearnMethodListWithHttpInfo(limit, offset, q, _options).pipe(map((apiResponse: HttpInfo<PaginatedMoveLearnMethodSummaryList>) => apiResponse.data));
    }

    /**
     * Methods by which Pokémon can learn moves.
     * Get move learn method
     * @param id This parameter can be a string or an integer.
     */
    public moveLearnMethodRetrieveWithHttpInfo(id: string, _options?: ConfigurationOptions): Observable<HttpInfo<MoveLearnMethodDetail>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.moveLearnMethodRetrieve(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.moveLearnMethodRetrieveWithHttpInfo(rsp)));
            }));
    }

    /**
     * Methods by which Pokémon can learn moves.
     * Get move learn method
     * @param id This parameter can be a string or an integer.
     */
    public moveLearnMethodRetrieve(id: string, _options?: ConfigurationOptions): Observable<MoveLearnMethodDetail> {
        return this.moveLearnMethodRetrieveWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<MoveLearnMethodDetail>) => apiResponse.data));
    }

    /**
     * Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.
     * List moves
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public moveListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<HttpInfo<PaginatedMoveSummaryList>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.moveList(limit, offset, q, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.moveListWithHttpInfo(rsp)));
            }));
    }

    /**
     * Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.
     * List moves
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public moveList(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<PaginatedMoveSummaryList> {
        return this.moveListWithHttpInfo(limit, offset, q, _options).pipe(map((apiResponse: HttpInfo<PaginatedMoveSummaryList>) => apiResponse.data));
    }

    /**
     * Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.
     * Get move
     * @param id This parameter can be a string or an integer.
     */
    public moveRetrieveWithHttpInfo(id: string, _options?: ConfigurationOptions): Observable<HttpInfo<MoveDetail>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.moveRetrieve(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.moveRetrieveWithHttpInfo(rsp)));
            }));
    }

    /**
     * Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.
     * Get move
     * @param id This parameter can be a string or an integer.
     */
    public moveRetrieve(id: string, _options?: ConfigurationOptions): Observable<MoveDetail> {
        return this.moveRetrieveWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<MoveDetail>) => apiResponse.data));
    }

    /**
     * Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.
     * List move targets
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public moveTargetListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<HttpInfo<PaginatedMoveTargetSummaryList>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.moveTargetList(limit, offset, q, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.moveTargetListWithHttpInfo(rsp)));
            }));
    }

    /**
     * Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.
     * List move targets
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public moveTargetList(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<PaginatedMoveTargetSummaryList> {
        return this.moveTargetListWithHttpInfo(limit, offset, q, _options).pipe(map((apiResponse: HttpInfo<PaginatedMoveTargetSummaryList>) => apiResponse.data));
    }

    /**
     * Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.
     * Get move target
     * @param id This parameter can be a string or an integer.
     */
    public moveTargetRetrieveWithHttpInfo(id: string, _options?: ConfigurationOptions): Observable<HttpInfo<MoveTargetDetail>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.moveTargetRetrieve(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.moveTargetRetrieveWithHttpInfo(rsp)));
            }));
    }

    /**
     * Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.
     * Get move target
     * @param id This parameter can be a string or an integer.
     */
    public moveTargetRetrieve(id: string, _options?: ConfigurationOptions): Observable<MoveTargetDetail> {
        return this.moveTargetRetrieveWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<MoveTargetDetail>) => apiResponse.data));
    }

}

import { PokemonApiRequestFactory, PokemonApiResponseProcessor} from "../apis/PokemonApi";
export class ObservablePokemonApi {
    private requestFactory: PokemonApiRequestFactory;
    private responseProcessor: PokemonApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: PokemonApiRequestFactory,
        responseProcessor?: PokemonApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new PokemonApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new PokemonApiResponseProcessor();
    }

    /**
     * Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public abilityListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<HttpInfo<PaginatedAbilitySummaryList>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.abilityList(limit, offset, q, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.abilityListWithHttpInfo(rsp)));
            }));
    }

    /**
     * Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public abilityList(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<PaginatedAbilitySummaryList> {
        return this.abilityListWithHttpInfo(limit, offset, q, _options).pipe(map((apiResponse: HttpInfo<PaginatedAbilitySummaryList>) => apiResponse.data));
    }

    /**
     * Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.
     * @param id This parameter can be a string or an integer.
     */
    public abilityRetrieveWithHttpInfo(id: string, _options?: ConfigurationOptions): Observable<HttpInfo<AbilityDetail>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.abilityRetrieve(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.abilityRetrieveWithHttpInfo(rsp)));
            }));
    }

    /**
     * Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.
     * @param id This parameter can be a string or an integer.
     */
    public abilityRetrieve(id: string, _options?: ConfigurationOptions): Observable<AbilityDetail> {
        return this.abilityRetrieveWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<AbilityDetail>) => apiResponse.data));
    }

    /**
     * Characteristics indicate which stat contains a Pokémon\'s highest IV. A Pokémon\'s Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.
     * List charecterictics
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public characteristicListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<HttpInfo<PaginatedCharacteristicSummaryList>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.characteristicList(limit, offset, q, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.characteristicListWithHttpInfo(rsp)));
            }));
    }

    /**
     * Characteristics indicate which stat contains a Pokémon\'s highest IV. A Pokémon\'s Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.
     * List charecterictics
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public characteristicList(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<PaginatedCharacteristicSummaryList> {
        return this.characteristicListWithHttpInfo(limit, offset, q, _options).pipe(map((apiResponse: HttpInfo<PaginatedCharacteristicSummaryList>) => apiResponse.data));
    }

    /**
     * Characteristics indicate which stat contains a Pokémon\'s highest IV. A Pokémon\'s Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.
     * Get characteristic
     * @param id This parameter can be a string or an integer.
     */
    public characteristicRetrieveWithHttpInfo(id: string, _options?: ConfigurationOptions): Observable<HttpInfo<CharacteristicDetail>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.characteristicRetrieve(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.characteristicRetrieveWithHttpInfo(rsp)));
            }));
    }

    /**
     * Characteristics indicate which stat contains a Pokémon\'s highest IV. A Pokémon\'s Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.
     * Get characteristic
     * @param id This parameter can be a string or an integer.
     */
    public characteristicRetrieve(id: string, _options?: ConfigurationOptions): Observable<CharacteristicDetail> {
        return this.characteristicRetrieveWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<CharacteristicDetail>) => apiResponse.data));
    }

    /**
     * Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.
     * List egg groups
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public eggGroupListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<HttpInfo<PaginatedEggGroupSummaryList>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.eggGroupList(limit, offset, q, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.eggGroupListWithHttpInfo(rsp)));
            }));
    }

    /**
     * Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.
     * List egg groups
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public eggGroupList(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<PaginatedEggGroupSummaryList> {
        return this.eggGroupListWithHttpInfo(limit, offset, q, _options).pipe(map((apiResponse: HttpInfo<PaginatedEggGroupSummaryList>) => apiResponse.data));
    }

    /**
     * Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.
     * Get egg group
     * @param id This parameter can be a string or an integer.
     */
    public eggGroupRetrieveWithHttpInfo(id: string, _options?: ConfigurationOptions): Observable<HttpInfo<EggGroupDetail>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.eggGroupRetrieve(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.eggGroupRetrieveWithHttpInfo(rsp)));
            }));
    }

    /**
     * Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.
     * Get egg group
     * @param id This parameter can be a string or an integer.
     */
    public eggGroupRetrieve(id: string, _options?: ConfigurationOptions): Observable<EggGroupDetail> {
        return this.eggGroupRetrieveWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<EggGroupDetail>) => apiResponse.data));
    }

    /**
     * Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.
     * List genders
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public genderListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<HttpInfo<PaginatedGenderSummaryList>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.genderList(limit, offset, q, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.genderListWithHttpInfo(rsp)));
            }));
    }

    /**
     * Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.
     * List genders
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public genderList(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<PaginatedGenderSummaryList> {
        return this.genderListWithHttpInfo(limit, offset, q, _options).pipe(map((apiResponse: HttpInfo<PaginatedGenderSummaryList>) => apiResponse.data));
    }

    /**
     * Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.
     * Get gender
     * @param id This parameter can be a string or an integer.
     */
    public genderRetrieveWithHttpInfo(id: string, _options?: ConfigurationOptions): Observable<HttpInfo<GenderDetail>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.genderRetrieve(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.genderRetrieveWithHttpInfo(rsp)));
            }));
    }

    /**
     * Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.
     * Get gender
     * @param id This parameter can be a string or an integer.
     */
    public genderRetrieve(id: string, _options?: ConfigurationOptions): Observable<GenderDetail> {
        return this.genderRetrieveWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<GenderDetail>) => apiResponse.data));
    }

    /**
     * Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.
     * List growth rates
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public growthRateListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<HttpInfo<PaginatedGrowthRateSummaryList>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.growthRateList(limit, offset, q, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.growthRateListWithHttpInfo(rsp)));
            }));
    }

    /**
     * Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.
     * List growth rates
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public growthRateList(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<PaginatedGrowthRateSummaryList> {
        return this.growthRateListWithHttpInfo(limit, offset, q, _options).pipe(map((apiResponse: HttpInfo<PaginatedGrowthRateSummaryList>) => apiResponse.data));
    }

    /**
     * Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.
     * Get growth rate
     * @param id This parameter can be a string or an integer.
     */
    public growthRateRetrieveWithHttpInfo(id: string, _options?: ConfigurationOptions): Observable<HttpInfo<GrowthRateDetail>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.growthRateRetrieve(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.growthRateRetrieveWithHttpInfo(rsp)));
            }));
    }

    /**
     * Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.
     * Get growth rate
     * @param id This parameter can be a string or an integer.
     */
    public growthRateRetrieve(id: string, _options?: ConfigurationOptions): Observable<GrowthRateDetail> {
        return this.growthRateRetrieveWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<GrowthRateDetail>) => apiResponse.data));
    }

    /**
     * Damage classes moves can have, e.g. physical, special, or non-damaging.
     * List move damage classes
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public moveDamageClassListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<HttpInfo<PaginatedMoveDamageClassSummaryList>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.moveDamageClassList(limit, offset, q, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.moveDamageClassListWithHttpInfo(rsp)));
            }));
    }

    /**
     * Damage classes moves can have, e.g. physical, special, or non-damaging.
     * List move damage classes
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public moveDamageClassList(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<PaginatedMoveDamageClassSummaryList> {
        return this.moveDamageClassListWithHttpInfo(limit, offset, q, _options).pipe(map((apiResponse: HttpInfo<PaginatedMoveDamageClassSummaryList>) => apiResponse.data));
    }

    /**
     * Damage classes moves can have, e.g. physical, special, or non-damaging.
     * Get move damage class
     * @param id This parameter can be a string or an integer.
     */
    public moveDamageClassRetrieveWithHttpInfo(id: string, _options?: ConfigurationOptions): Observable<HttpInfo<MoveDamageClassDetail>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.moveDamageClassRetrieve(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.moveDamageClassRetrieveWithHttpInfo(rsp)));
            }));
    }

    /**
     * Damage classes moves can have, e.g. physical, special, or non-damaging.
     * Get move damage class
     * @param id This parameter can be a string or an integer.
     */
    public moveDamageClassRetrieve(id: string, _options?: ConfigurationOptions): Observable<MoveDamageClassDetail> {
        return this.moveDamageClassRetrieveWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<MoveDamageClassDetail>) => apiResponse.data));
    }

    /**
     * Natures influence how a Pokémon\'s stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.
     * List natures
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public natureListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<HttpInfo<PaginatedNatureSummaryList>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.natureList(limit, offset, q, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.natureListWithHttpInfo(rsp)));
            }));
    }

    /**
     * Natures influence how a Pokémon\'s stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.
     * List natures
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public natureList(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<PaginatedNatureSummaryList> {
        return this.natureListWithHttpInfo(limit, offset, q, _options).pipe(map((apiResponse: HttpInfo<PaginatedNatureSummaryList>) => apiResponse.data));
    }

    /**
     * Natures influence how a Pokémon\'s stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.
     * Get nature
     * @param id This parameter can be a string or an integer.
     */
    public natureRetrieveWithHttpInfo(id: string, _options?: ConfigurationOptions): Observable<HttpInfo<NatureDetail>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.natureRetrieve(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.natureRetrieveWithHttpInfo(rsp)));
            }));
    }

    /**
     * Natures influence how a Pokémon\'s stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.
     * Get nature
     * @param id This parameter can be a string or an integer.
     */
    public natureRetrieve(id: string, _options?: ConfigurationOptions): Observable<NatureDetail> {
        return this.natureRetrieveWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<NatureDetail>) => apiResponse.data));
    }

    /**
     * Pokeathlon Stats are different attributes of a Pokémon\'s performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.
     * List pokeathlon stats
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public pokeathlonStatListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<HttpInfo<PaginatedPokeathlonStatSummaryList>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.pokeathlonStatList(limit, offset, q, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.pokeathlonStatListWithHttpInfo(rsp)));
            }));
    }

    /**
     * Pokeathlon Stats are different attributes of a Pokémon\'s performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.
     * List pokeathlon stats
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public pokeathlonStatList(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<PaginatedPokeathlonStatSummaryList> {
        return this.pokeathlonStatListWithHttpInfo(limit, offset, q, _options).pipe(map((apiResponse: HttpInfo<PaginatedPokeathlonStatSummaryList>) => apiResponse.data));
    }

    /**
     * Pokeathlon Stats are different attributes of a Pokémon\'s performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.
     * Get pokeathlon stat
     * @param id This parameter can be a string or an integer.
     */
    public pokeathlonStatRetrieveWithHttpInfo(id: string, _options?: ConfigurationOptions): Observable<HttpInfo<PokeathlonStatDetail>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.pokeathlonStatRetrieve(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.pokeathlonStatRetrieveWithHttpInfo(rsp)));
            }));
    }

    /**
     * Pokeathlon Stats are different attributes of a Pokémon\'s performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.
     * Get pokeathlon stat
     * @param id This parameter can be a string or an integer.
     */
    public pokeathlonStatRetrieve(id: string, _options?: ConfigurationOptions): Observable<PokeathlonStatDetail> {
        return this.pokeathlonStatRetrieveWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<PokeathlonStatDetail>) => apiResponse.data));
    }

    /**
     * Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon\'s body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.
     * List pokemon colors
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public pokemonColorListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<HttpInfo<PaginatedPokemonColorSummaryList>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.pokemonColorList(limit, offset, q, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.pokemonColorListWithHttpInfo(rsp)));
            }));
    }

    /**
     * Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon\'s body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.
     * List pokemon colors
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public pokemonColorList(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<PaginatedPokemonColorSummaryList> {
        return this.pokemonColorListWithHttpInfo(limit, offset, q, _options).pipe(map((apiResponse: HttpInfo<PaginatedPokemonColorSummaryList>) => apiResponse.data));
    }

    /**
     * Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon\'s body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.
     * Get pokemon color
     * @param id This parameter can be a string or an integer.
     */
    public pokemonColorRetrieveWithHttpInfo(id: string, _options?: ConfigurationOptions): Observable<HttpInfo<PokemonColorDetail>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.pokemonColorRetrieve(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.pokemonColorRetrieveWithHttpInfo(rsp)));
            }));
    }

    /**
     * Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon\'s body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.
     * Get pokemon color
     * @param id This parameter can be a string or an integer.
     */
    public pokemonColorRetrieve(id: string, _options?: ConfigurationOptions): Observable<PokemonColorDetail> {
        return this.pokemonColorRetrieveWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<PokemonColorDetail>) => apiResponse.data));
    }

    /**
     * Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the \'Pokémon\' entity is used to represent such a variety.
     * List pokemon forms
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public pokemonFormListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<HttpInfo<PaginatedPokemonFormSummaryList>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.pokemonFormList(limit, offset, q, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.pokemonFormListWithHttpInfo(rsp)));
            }));
    }

    /**
     * Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the \'Pokémon\' entity is used to represent such a variety.
     * List pokemon forms
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public pokemonFormList(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<PaginatedPokemonFormSummaryList> {
        return this.pokemonFormListWithHttpInfo(limit, offset, q, _options).pipe(map((apiResponse: HttpInfo<PaginatedPokemonFormSummaryList>) => apiResponse.data));
    }

    /**
     * Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the \'Pokémon\' entity is used to represent such a variety.
     * Get pokemon form
     * @param id This parameter can be a string or an integer.
     */
    public pokemonFormRetrieveWithHttpInfo(id: string, _options?: ConfigurationOptions): Observable<HttpInfo<PokemonFormDetail>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.pokemonFormRetrieve(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.pokemonFormRetrieveWithHttpInfo(rsp)));
            }));
    }

    /**
     * Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the \'Pokémon\' entity is used to represent such a variety.
     * Get pokemon form
     * @param id This parameter can be a string or an integer.
     */
    public pokemonFormRetrieve(id: string, _options?: ConfigurationOptions): Observable<PokemonFormDetail> {
        return this.pokemonFormRetrieveWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<PokemonFormDetail>) => apiResponse.data));
    }

    /**
     * Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.
     * List pokemom habitas
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public pokemonHabitatListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<HttpInfo<PaginatedPokemonHabitatSummaryList>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.pokemonHabitatList(limit, offset, q, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.pokemonHabitatListWithHttpInfo(rsp)));
            }));
    }

    /**
     * Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.
     * List pokemom habitas
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public pokemonHabitatList(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<PaginatedPokemonHabitatSummaryList> {
        return this.pokemonHabitatListWithHttpInfo(limit, offset, q, _options).pipe(map((apiResponse: HttpInfo<PaginatedPokemonHabitatSummaryList>) => apiResponse.data));
    }

    /**
     * Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.
     * Get pokemom habita
     * @param id This parameter can be a string or an integer.
     */
    public pokemonHabitatRetrieveWithHttpInfo(id: string, _options?: ConfigurationOptions): Observable<HttpInfo<PokemonHabitatDetail>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.pokemonHabitatRetrieve(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.pokemonHabitatRetrieveWithHttpInfo(rsp)));
            }));
    }

    /**
     * Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.
     * Get pokemom habita
     * @param id This parameter can be a string or an integer.
     */
    public pokemonHabitatRetrieve(id: string, _options?: ConfigurationOptions): Observable<PokemonHabitatDetail> {
        return this.pokemonHabitatRetrieveWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<PokemonHabitatDetail>) => apiResponse.data));
    }

    /**
     * Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.
     * List pokemon
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public pokemonListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<HttpInfo<PaginatedPokemonSummaryList>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.pokemonList(limit, offset, q, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.pokemonListWithHttpInfo(rsp)));
            }));
    }

    /**
     * Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.
     * List pokemon
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public pokemonList(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<PaginatedPokemonSummaryList> {
        return this.pokemonListWithHttpInfo(limit, offset, q, _options).pipe(map((apiResponse: HttpInfo<PaginatedPokemonSummaryList>) => apiResponse.data));
    }

    /**
     * Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.
     * Get pokemon
     * @param id This parameter can be a string or an integer.
     */
    public pokemonRetrieveWithHttpInfo(id: string, _options?: ConfigurationOptions): Observable<HttpInfo<PokemonDetail>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.pokemonRetrieve(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.pokemonRetrieveWithHttpInfo(rsp)));
            }));
    }

    /**
     * Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.
     * Get pokemon
     * @param id This parameter can be a string or an integer.
     */
    public pokemonRetrieve(id: string, _options?: ConfigurationOptions): Observable<PokemonDetail> {
        return this.pokemonRetrieveWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<PokemonDetail>) => apiResponse.data));
    }

    /**
     * Shapes used for sorting Pokémon in a Pokédex.
     * List pokemon shapes
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public pokemonShapeListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<HttpInfo<PaginatedPokemonShapeSummaryList>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.pokemonShapeList(limit, offset, q, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.pokemonShapeListWithHttpInfo(rsp)));
            }));
    }

    /**
     * Shapes used for sorting Pokémon in a Pokédex.
     * List pokemon shapes
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public pokemonShapeList(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<PaginatedPokemonShapeSummaryList> {
        return this.pokemonShapeListWithHttpInfo(limit, offset, q, _options).pipe(map((apiResponse: HttpInfo<PaginatedPokemonShapeSummaryList>) => apiResponse.data));
    }

    /**
     * Shapes used for sorting Pokémon in a Pokédex.
     * Get pokemon shape
     * @param id This parameter can be a string or an integer.
     */
    public pokemonShapeRetrieveWithHttpInfo(id: string, _options?: ConfigurationOptions): Observable<HttpInfo<PokemonShapeDetail>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.pokemonShapeRetrieve(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.pokemonShapeRetrieveWithHttpInfo(rsp)));
            }));
    }

    /**
     * Shapes used for sorting Pokémon in a Pokédex.
     * Get pokemon shape
     * @param id This parameter can be a string or an integer.
     */
    public pokemonShapeRetrieve(id: string, _options?: ConfigurationOptions): Observable<PokemonShapeDetail> {
        return this.pokemonShapeRetrieveWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<PokemonShapeDetail>) => apiResponse.data));
    }

    /**
     * A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.
     * List pokemon species
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public pokemonSpeciesListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<HttpInfo<PaginatedPokemonSpeciesSummaryList>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.pokemonSpeciesList(limit, offset, q, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.pokemonSpeciesListWithHttpInfo(rsp)));
            }));
    }

    /**
     * A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.
     * List pokemon species
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public pokemonSpeciesList(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<PaginatedPokemonSpeciesSummaryList> {
        return this.pokemonSpeciesListWithHttpInfo(limit, offset, q, _options).pipe(map((apiResponse: HttpInfo<PaginatedPokemonSpeciesSummaryList>) => apiResponse.data));
    }

    /**
     * A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.
     * Get pokemon species
     * @param id This parameter can be a string or an integer.
     */
    public pokemonSpeciesRetrieveWithHttpInfo(id: string, _options?: ConfigurationOptions): Observable<HttpInfo<PokemonSpeciesDetail>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.pokemonSpeciesRetrieve(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.pokemonSpeciesRetrieveWithHttpInfo(rsp)));
            }));
    }

    /**
     * A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.
     * Get pokemon species
     * @param id This parameter can be a string or an integer.
     */
    public pokemonSpeciesRetrieve(id: string, _options?: ConfigurationOptions): Observable<PokemonSpeciesDetail> {
        return this.pokemonSpeciesRetrieveWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<PokemonSpeciesDetail>) => apiResponse.data));
    }

    /**
     * Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.
     * List stats
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public statListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<HttpInfo<PaginatedStatSummaryList>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.statList(limit, offset, q, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.statListWithHttpInfo(rsp)));
            }));
    }

    /**
     * Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.
     * List stats
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public statList(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<PaginatedStatSummaryList> {
        return this.statListWithHttpInfo(limit, offset, q, _options).pipe(map((apiResponse: HttpInfo<PaginatedStatSummaryList>) => apiResponse.data));
    }

    /**
     * Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.
     * Get stat
     * @param id This parameter can be a string or an integer.
     */
    public statRetrieveWithHttpInfo(id: string, _options?: ConfigurationOptions): Observable<HttpInfo<StatDetail>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.statRetrieve(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.statRetrieveWithHttpInfo(rsp)));
            }));
    }

    /**
     * Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.
     * Get stat
     * @param id This parameter can be a string or an integer.
     */
    public statRetrieve(id: string, _options?: ConfigurationOptions): Observable<StatDetail> {
        return this.statRetrieveWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<StatDetail>) => apiResponse.data));
    }

    /**
     * Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.
     * List types
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public typeListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<HttpInfo<PaginatedTypeSummaryList>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.typeList(limit, offset, q, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.typeListWithHttpInfo(rsp)));
            }));
    }

    /**
     * Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.
     * List types
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public typeList(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<PaginatedTypeSummaryList> {
        return this.typeListWithHttpInfo(limit, offset, q, _options).pipe(map((apiResponse: HttpInfo<PaginatedTypeSummaryList>) => apiResponse.data));
    }

    /**
     * Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.
     * Get types
     * @param id This parameter can be a string or an integer.
     */
    public typeRetrieveWithHttpInfo(id: string, _options?: ConfigurationOptions): Observable<HttpInfo<TypeDetail>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.typeRetrieve(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.typeRetrieveWithHttpInfo(rsp)));
            }));
    }

    /**
     * Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.
     * Get types
     * @param id This parameter can be a string or an integer.
     */
    public typeRetrieve(id: string, _options?: ConfigurationOptions): Observable<TypeDetail> {
        return this.typeRetrieveWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<TypeDetail>) => apiResponse.data));
    }

}

import { UtilityApiRequestFactory, UtilityApiResponseProcessor} from "../apis/UtilityApi";
export class ObservableUtilityApi {
    private requestFactory: UtilityApiRequestFactory;
    private responseProcessor: UtilityApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: UtilityApiRequestFactory,
        responseProcessor?: UtilityApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new UtilityApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new UtilityApiResponseProcessor();
    }

    /**
     * Languages for translations of API resource information.
     * List languages
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public languageListWithHttpInfo(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<HttpInfo<PaginatedLanguageSummaryList>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.languageList(limit, offset, q, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.languageListWithHttpInfo(rsp)));
            }));
    }

    /**
     * Languages for translations of API resource information.
     * List languages
     * @param [limit] Number of results to return per page.
     * @param [offset] The initial index from which to return the results.
     * @param [q] &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
     */
    public languageList(limit?: number, offset?: number, q?: string, _options?: ConfigurationOptions): Observable<PaginatedLanguageSummaryList> {
        return this.languageListWithHttpInfo(limit, offset, q, _options).pipe(map((apiResponse: HttpInfo<PaginatedLanguageSummaryList>) => apiResponse.data));
    }

    /**
     * Languages for translations of API resource information.
     * Get language
     * @param id This parameter can be a string or an integer.
     */
    public languageRetrieveWithHttpInfo(id: string, _options?: ConfigurationOptions): Observable<HttpInfo<LanguageDetail>> {
        const _config = mergeConfiguration(this.configuration, _options);

        const requestContextPromise = this.requestFactory.languageRetrieve(id, _config);
        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of _config.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => _config.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of _config.middleware.reverse()) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.languageRetrieveWithHttpInfo(rsp)));
            }));
    }

    /**
     * Languages for translations of API resource information.
     * Get language
     * @param id This parameter can be a string or an integer.
     */
    public languageRetrieve(id: string, _options?: ConfigurationOptions): Observable<LanguageDetail> {
        return this.languageRetrieveWithHttpInfo(id, _options).pipe(map((apiResponse: HttpInfo<LanguageDetail>) => apiResponse.data));
    }

}
