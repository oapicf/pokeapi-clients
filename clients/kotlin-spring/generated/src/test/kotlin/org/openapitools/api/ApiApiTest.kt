package org.openapitools.api

import org.openapitools.model.AbilityDetail
import org.openapitools.model.BerryDetail
import org.openapitools.model.BerryFirmnessDetail
import org.openapitools.model.BerryFlavorDetail
import org.openapitools.model.CharacteristicDetail
import org.openapitools.model.ContestEffectDetail
import org.openapitools.model.ContestTypeDetail
import org.openapitools.model.EggGroupDetail
import org.openapitools.model.EncounterConditionDetail
import org.openapitools.model.EncounterConditionValueDetail
import org.openapitools.model.EncounterMethodDetail
import org.openapitools.model.EvolutionChainDetail
import org.openapitools.model.EvolutionTriggerDetail
import org.openapitools.model.GenderDetail
import org.openapitools.model.GenerationDetail
import org.openapitools.model.GrowthRateDetail
import org.openapitools.model.ItemAttributeDetail
import org.openapitools.model.ItemCategoryDetail
import org.openapitools.model.ItemDetail
import org.openapitools.model.ItemFlingEffectDetail
import org.openapitools.model.ItemPocketDetail
import org.openapitools.model.LanguageDetail
import org.openapitools.model.LocationAreaDetail
import org.openapitools.model.LocationDetail
import org.openapitools.model.MachineDetail
import org.openapitools.model.MoveBattleStyleDetail
import org.openapitools.model.MoveDamageClassDetail
import org.openapitools.model.MoveDetail
import org.openapitools.model.MoveLearnMethodDetail
import org.openapitools.model.MoveMetaAilmentDetail
import org.openapitools.model.MoveMetaCategoryDetail
import org.openapitools.model.MoveTargetDetail
import org.openapitools.model.NatureDetail
import org.openapitools.model.PaginatedAbilitySummaryList
import org.openapitools.model.PaginatedBerryFirmnessSummaryList
import org.openapitools.model.PaginatedBerryFlavorSummaryList
import org.openapitools.model.PaginatedBerrySummaryList
import org.openapitools.model.PaginatedCharacteristicSummaryList
import org.openapitools.model.PaginatedContestEffectSummaryList
import org.openapitools.model.PaginatedContestTypeSummaryList
import org.openapitools.model.PaginatedEggGroupSummaryList
import org.openapitools.model.PaginatedEncounterConditionSummaryList
import org.openapitools.model.PaginatedEncounterConditionValueSummaryList
import org.openapitools.model.PaginatedEncounterMethodSummaryList
import org.openapitools.model.PaginatedEvolutionChainSummaryList
import org.openapitools.model.PaginatedEvolutionTriggerSummaryList
import org.openapitools.model.PaginatedGenderSummaryList
import org.openapitools.model.PaginatedGenerationSummaryList
import org.openapitools.model.PaginatedGrowthRateSummaryList
import org.openapitools.model.PaginatedItemAttributeSummaryList
import org.openapitools.model.PaginatedItemCategorySummaryList
import org.openapitools.model.PaginatedItemFlingEffectSummaryList
import org.openapitools.model.PaginatedItemPocketSummaryList
import org.openapitools.model.PaginatedItemSummaryList
import org.openapitools.model.PaginatedLanguageSummaryList
import org.openapitools.model.PaginatedLocationAreaSummaryList
import org.openapitools.model.PaginatedLocationSummaryList
import org.openapitools.model.PaginatedMachineSummaryList
import org.openapitools.model.PaginatedMoveBattleStyleSummaryList
import org.openapitools.model.PaginatedMoveDamageClassSummaryList
import org.openapitools.model.PaginatedMoveLearnMethodSummaryList
import org.openapitools.model.PaginatedMoveMetaAilmentSummaryList
import org.openapitools.model.PaginatedMoveMetaCategorySummaryList
import org.openapitools.model.PaginatedMoveSummaryList
import org.openapitools.model.PaginatedMoveTargetSummaryList
import org.openapitools.model.PaginatedNatureSummaryList
import org.openapitools.model.PaginatedPalParkAreaSummaryList
import org.openapitools.model.PaginatedPokeathlonStatSummaryList
import org.openapitools.model.PaginatedPokedexSummaryList
import org.openapitools.model.PaginatedPokemonColorSummaryList
import org.openapitools.model.PaginatedPokemonFormSummaryList
import org.openapitools.model.PaginatedPokemonHabitatSummaryList
import org.openapitools.model.PaginatedPokemonShapeSummaryList
import org.openapitools.model.PaginatedPokemonSpeciesSummaryList
import org.openapitools.model.PaginatedPokemonSummaryList
import org.openapitools.model.PaginatedRegionSummaryList
import org.openapitools.model.PaginatedStatSummaryList
import org.openapitools.model.PaginatedSuperContestEffectSummaryList
import org.openapitools.model.PaginatedTypeSummaryList
import org.openapitools.model.PaginatedVersionGroupSummaryList
import org.openapitools.model.PaginatedVersionSummaryList
import org.openapitools.model.PalParkAreaDetail
import org.openapitools.model.PokeathlonStatDetail
import org.openapitools.model.PokedexDetail
import org.openapitools.model.PokemonColorDetail
import org.openapitools.model.PokemonDetail
import org.openapitools.model.PokemonFormDetail
import org.openapitools.model.PokemonHabitatDetail
import org.openapitools.model.PokemonShapeDetail
import org.openapitools.model.PokemonSpeciesDetail
import org.openapitools.model.RegionDetail
import org.openapitools.model.StatDetail
import org.openapitools.model.SuperContestEffectDetail
import org.openapitools.model.TypeDetail
import org.openapitools.model.VersionDetail
import org.openapitools.model.VersionGroupDetail
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class ApiApiTest {

    private val api: ApiApiController = ApiApiController()

    /**
     * To test ApiApiController.abilityList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun abilityListTest() {
        val limit: kotlin.Int? = TODO()
        val offset: kotlin.Int? = TODO()
        val q: kotlin.String? = TODO()
        
        val response: ResponseEntity<PaginatedAbilitySummaryList> = api.abilityList(limit, offset, q)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.abilityRetrieve
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun abilityRetrieveTest() {
        val id: kotlin.String = TODO()
        
        val response: ResponseEntity<AbilityDetail> = api.abilityRetrieve(id)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.berryFirmnessList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun berryFirmnessListTest() {
        val limit: kotlin.Int? = TODO()
        val offset: kotlin.Int? = TODO()
        val q: kotlin.String? = TODO()
        
        val response: ResponseEntity<PaginatedBerryFirmnessSummaryList> = api.berryFirmnessList(limit, offset, q)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.berryFirmnessRetrieve
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun berryFirmnessRetrieveTest() {
        val id: kotlin.String = TODO()
        
        val response: ResponseEntity<BerryFirmnessDetail> = api.berryFirmnessRetrieve(id)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.berryFlavorList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun berryFlavorListTest() {
        val limit: kotlin.Int? = TODO()
        val offset: kotlin.Int? = TODO()
        val q: kotlin.String? = TODO()
        
        val response: ResponseEntity<PaginatedBerryFlavorSummaryList> = api.berryFlavorList(limit, offset, q)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.berryFlavorRetrieve
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun berryFlavorRetrieveTest() {
        val id: kotlin.String = TODO()
        
        val response: ResponseEntity<BerryFlavorDetail> = api.berryFlavorRetrieve(id)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.berryList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun berryListTest() {
        val limit: kotlin.Int? = TODO()
        val offset: kotlin.Int? = TODO()
        val q: kotlin.String? = TODO()
        
        val response: ResponseEntity<PaginatedBerrySummaryList> = api.berryList(limit, offset, q)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.berryRetrieve
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun berryRetrieveTest() {
        val id: kotlin.String = TODO()
        
        val response: ResponseEntity<BerryDetail> = api.berryRetrieve(id)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.characteristicList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun characteristicListTest() {
        val limit: kotlin.Int? = TODO()
        val offset: kotlin.Int? = TODO()
        val q: kotlin.String? = TODO()
        
        val response: ResponseEntity<PaginatedCharacteristicSummaryList> = api.characteristicList(limit, offset, q)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.characteristicRetrieve
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun characteristicRetrieveTest() {
        val id: kotlin.String = TODO()
        
        val response: ResponseEntity<CharacteristicDetail> = api.characteristicRetrieve(id)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.contestEffectList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun contestEffectListTest() {
        val limit: kotlin.Int? = TODO()
        val offset: kotlin.Int? = TODO()
        val q: kotlin.String? = TODO()
        
        val response: ResponseEntity<PaginatedContestEffectSummaryList> = api.contestEffectList(limit, offset, q)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.contestEffectRetrieve
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun contestEffectRetrieveTest() {
        val id: kotlin.String = TODO()
        
        val response: ResponseEntity<ContestEffectDetail> = api.contestEffectRetrieve(id)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.contestTypeList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun contestTypeListTest() {
        val limit: kotlin.Int? = TODO()
        val offset: kotlin.Int? = TODO()
        val q: kotlin.String? = TODO()
        
        val response: ResponseEntity<PaginatedContestTypeSummaryList> = api.contestTypeList(limit, offset, q)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.contestTypeRetrieve
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun contestTypeRetrieveTest() {
        val id: kotlin.String = TODO()
        
        val response: ResponseEntity<ContestTypeDetail> = api.contestTypeRetrieve(id)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.eggGroupList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun eggGroupListTest() {
        val limit: kotlin.Int? = TODO()
        val offset: kotlin.Int? = TODO()
        val q: kotlin.String? = TODO()
        
        val response: ResponseEntity<PaginatedEggGroupSummaryList> = api.eggGroupList(limit, offset, q)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.eggGroupRetrieve
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun eggGroupRetrieveTest() {
        val id: kotlin.String = TODO()
        
        val response: ResponseEntity<EggGroupDetail> = api.eggGroupRetrieve(id)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.encounterConditionList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun encounterConditionListTest() {
        val limit: kotlin.Int? = TODO()
        val offset: kotlin.Int? = TODO()
        val q: kotlin.String? = TODO()
        
        val response: ResponseEntity<PaginatedEncounterConditionSummaryList> = api.encounterConditionList(limit, offset, q)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.encounterConditionRetrieve
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun encounterConditionRetrieveTest() {
        val id: kotlin.String = TODO()
        
        val response: ResponseEntity<EncounterConditionDetail> = api.encounterConditionRetrieve(id)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.encounterConditionValueList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun encounterConditionValueListTest() {
        val limit: kotlin.Int? = TODO()
        val offset: kotlin.Int? = TODO()
        val q: kotlin.String? = TODO()
        
        val response: ResponseEntity<PaginatedEncounterConditionValueSummaryList> = api.encounterConditionValueList(limit, offset, q)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.encounterConditionValueRetrieve
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun encounterConditionValueRetrieveTest() {
        val id: kotlin.String = TODO()
        
        val response: ResponseEntity<EncounterConditionValueDetail> = api.encounterConditionValueRetrieve(id)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.encounterMethodList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun encounterMethodListTest() {
        val limit: kotlin.Int? = TODO()
        val offset: kotlin.Int? = TODO()
        val q: kotlin.String? = TODO()
        
        val response: ResponseEntity<PaginatedEncounterMethodSummaryList> = api.encounterMethodList(limit, offset, q)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.encounterMethodRetrieve
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun encounterMethodRetrieveTest() {
        val id: kotlin.String = TODO()
        
        val response: ResponseEntity<EncounterMethodDetail> = api.encounterMethodRetrieve(id)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.evolutionChainList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun evolutionChainListTest() {
        val limit: kotlin.Int? = TODO()
        val offset: kotlin.Int? = TODO()
        val q: kotlin.String? = TODO()
        
        val response: ResponseEntity<PaginatedEvolutionChainSummaryList> = api.evolutionChainList(limit, offset, q)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.evolutionChainRetrieve
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun evolutionChainRetrieveTest() {
        val id: kotlin.String = TODO()
        
        val response: ResponseEntity<EvolutionChainDetail> = api.evolutionChainRetrieve(id)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.evolutionTriggerList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun evolutionTriggerListTest() {
        val limit: kotlin.Int? = TODO()
        val offset: kotlin.Int? = TODO()
        val q: kotlin.String? = TODO()
        
        val response: ResponseEntity<PaginatedEvolutionTriggerSummaryList> = api.evolutionTriggerList(limit, offset, q)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.evolutionTriggerRetrieve
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun evolutionTriggerRetrieveTest() {
        val id: kotlin.String = TODO()
        
        val response: ResponseEntity<EvolutionTriggerDetail> = api.evolutionTriggerRetrieve(id)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.genderList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun genderListTest() {
        val limit: kotlin.Int? = TODO()
        val offset: kotlin.Int? = TODO()
        val q: kotlin.String? = TODO()
        
        val response: ResponseEntity<PaginatedGenderSummaryList> = api.genderList(limit, offset, q)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.genderRetrieve
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun genderRetrieveTest() {
        val id: kotlin.String = TODO()
        
        val response: ResponseEntity<GenderDetail> = api.genderRetrieve(id)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.generationList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun generationListTest() {
        val limit: kotlin.Int? = TODO()
        val offset: kotlin.Int? = TODO()
        val q: kotlin.String? = TODO()
        
        val response: ResponseEntity<PaginatedGenerationSummaryList> = api.generationList(limit, offset, q)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.generationRetrieve
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun generationRetrieveTest() {
        val id: kotlin.String = TODO()
        
        val response: ResponseEntity<GenerationDetail> = api.generationRetrieve(id)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.growthRateList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun growthRateListTest() {
        val limit: kotlin.Int? = TODO()
        val offset: kotlin.Int? = TODO()
        val q: kotlin.String? = TODO()
        
        val response: ResponseEntity<PaginatedGrowthRateSummaryList> = api.growthRateList(limit, offset, q)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.growthRateRetrieve
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun growthRateRetrieveTest() {
        val id: kotlin.String = TODO()
        
        val response: ResponseEntity<GrowthRateDetail> = api.growthRateRetrieve(id)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.itemAttributeList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun itemAttributeListTest() {
        val limit: kotlin.Int? = TODO()
        val offset: kotlin.Int? = TODO()
        val q: kotlin.String? = TODO()
        
        val response: ResponseEntity<PaginatedItemAttributeSummaryList> = api.itemAttributeList(limit, offset, q)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.itemAttributeRetrieve
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun itemAttributeRetrieveTest() {
        val id: kotlin.String = TODO()
        
        val response: ResponseEntity<ItemAttributeDetail> = api.itemAttributeRetrieve(id)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.itemCategoryList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun itemCategoryListTest() {
        val limit: kotlin.Int? = TODO()
        val offset: kotlin.Int? = TODO()
        val q: kotlin.String? = TODO()
        
        val response: ResponseEntity<PaginatedItemCategorySummaryList> = api.itemCategoryList(limit, offset, q)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.itemCategoryRetrieve
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun itemCategoryRetrieveTest() {
        val id: kotlin.String = TODO()
        
        val response: ResponseEntity<ItemCategoryDetail> = api.itemCategoryRetrieve(id)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.itemFlingEffectList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun itemFlingEffectListTest() {
        val limit: kotlin.Int? = TODO()
        val offset: kotlin.Int? = TODO()
        val q: kotlin.String? = TODO()
        
        val response: ResponseEntity<PaginatedItemFlingEffectSummaryList> = api.itemFlingEffectList(limit, offset, q)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.itemFlingEffectRetrieve
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun itemFlingEffectRetrieveTest() {
        val id: kotlin.String = TODO()
        
        val response: ResponseEntity<ItemFlingEffectDetail> = api.itemFlingEffectRetrieve(id)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.itemList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun itemListTest() {
        val limit: kotlin.Int? = TODO()
        val offset: kotlin.Int? = TODO()
        val q: kotlin.String? = TODO()
        
        val response: ResponseEntity<PaginatedItemSummaryList> = api.itemList(limit, offset, q)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.itemPocketList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun itemPocketListTest() {
        val limit: kotlin.Int? = TODO()
        val offset: kotlin.Int? = TODO()
        val q: kotlin.String? = TODO()
        
        val response: ResponseEntity<PaginatedItemPocketSummaryList> = api.itemPocketList(limit, offset, q)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.itemPocketRetrieve
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun itemPocketRetrieveTest() {
        val id: kotlin.String = TODO()
        
        val response: ResponseEntity<ItemPocketDetail> = api.itemPocketRetrieve(id)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.itemRetrieve
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun itemRetrieveTest() {
        val id: kotlin.String = TODO()
        
        val response: ResponseEntity<ItemDetail> = api.itemRetrieve(id)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.languageList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun languageListTest() {
        val limit: kotlin.Int? = TODO()
        val offset: kotlin.Int? = TODO()
        val q: kotlin.String? = TODO()
        
        val response: ResponseEntity<PaginatedLanguageSummaryList> = api.languageList(limit, offset, q)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.languageRetrieve
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun languageRetrieveTest() {
        val id: kotlin.String = TODO()
        
        val response: ResponseEntity<LanguageDetail> = api.languageRetrieve(id)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.locationAreaList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun locationAreaListTest() {
        val limit: kotlin.Int? = TODO()
        val offset: kotlin.Int? = TODO()
        
        val response: ResponseEntity<PaginatedLocationAreaSummaryList> = api.locationAreaList(limit, offset)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.locationAreaRetrieve
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun locationAreaRetrieveTest() {
        val id: kotlin.Int = TODO()
        
        val response: ResponseEntity<LocationAreaDetail> = api.locationAreaRetrieve(id)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.locationList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun locationListTest() {
        val limit: kotlin.Int? = TODO()
        val offset: kotlin.Int? = TODO()
        val q: kotlin.String? = TODO()
        
        val response: ResponseEntity<PaginatedLocationSummaryList> = api.locationList(limit, offset, q)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.locationRetrieve
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun locationRetrieveTest() {
        val id: kotlin.String = TODO()
        
        val response: ResponseEntity<LocationDetail> = api.locationRetrieve(id)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.machineList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun machineListTest() {
        val limit: kotlin.Int? = TODO()
        val offset: kotlin.Int? = TODO()
        val q: kotlin.String? = TODO()
        
        val response: ResponseEntity<PaginatedMachineSummaryList> = api.machineList(limit, offset, q)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.machineRetrieve
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun machineRetrieveTest() {
        val id: kotlin.String = TODO()
        
        val response: ResponseEntity<MachineDetail> = api.machineRetrieve(id)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.moveAilmentList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun moveAilmentListTest() {
        val limit: kotlin.Int? = TODO()
        val offset: kotlin.Int? = TODO()
        val q: kotlin.String? = TODO()
        
        val response: ResponseEntity<PaginatedMoveMetaAilmentSummaryList> = api.moveAilmentList(limit, offset, q)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.moveAilmentRetrieve
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun moveAilmentRetrieveTest() {
        val id: kotlin.String = TODO()
        
        val response: ResponseEntity<MoveMetaAilmentDetail> = api.moveAilmentRetrieve(id)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.moveBattleStyleList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun moveBattleStyleListTest() {
        val limit: kotlin.Int? = TODO()
        val offset: kotlin.Int? = TODO()
        val q: kotlin.String? = TODO()
        
        val response: ResponseEntity<PaginatedMoveBattleStyleSummaryList> = api.moveBattleStyleList(limit, offset, q)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.moveBattleStyleRetrieve
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun moveBattleStyleRetrieveTest() {
        val id: kotlin.String = TODO()
        
        val response: ResponseEntity<MoveBattleStyleDetail> = api.moveBattleStyleRetrieve(id)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.moveCategoryList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun moveCategoryListTest() {
        val limit: kotlin.Int? = TODO()
        val offset: kotlin.Int? = TODO()
        val q: kotlin.String? = TODO()
        
        val response: ResponseEntity<PaginatedMoveMetaCategorySummaryList> = api.moveCategoryList(limit, offset, q)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.moveCategoryRetrieve
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun moveCategoryRetrieveTest() {
        val id: kotlin.String = TODO()
        
        val response: ResponseEntity<MoveMetaCategoryDetail> = api.moveCategoryRetrieve(id)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.moveDamageClassList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun moveDamageClassListTest() {
        val limit: kotlin.Int? = TODO()
        val offset: kotlin.Int? = TODO()
        val q: kotlin.String? = TODO()
        
        val response: ResponseEntity<PaginatedMoveDamageClassSummaryList> = api.moveDamageClassList(limit, offset, q)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.moveDamageClassRetrieve
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun moveDamageClassRetrieveTest() {
        val id: kotlin.String = TODO()
        
        val response: ResponseEntity<MoveDamageClassDetail> = api.moveDamageClassRetrieve(id)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.moveLearnMethodList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun moveLearnMethodListTest() {
        val limit: kotlin.Int? = TODO()
        val offset: kotlin.Int? = TODO()
        val q: kotlin.String? = TODO()
        
        val response: ResponseEntity<PaginatedMoveLearnMethodSummaryList> = api.moveLearnMethodList(limit, offset, q)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.moveLearnMethodRetrieve
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun moveLearnMethodRetrieveTest() {
        val id: kotlin.String = TODO()
        
        val response: ResponseEntity<MoveLearnMethodDetail> = api.moveLearnMethodRetrieve(id)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.moveList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun moveListTest() {
        val limit: kotlin.Int? = TODO()
        val offset: kotlin.Int? = TODO()
        val q: kotlin.String? = TODO()
        
        val response: ResponseEntity<PaginatedMoveSummaryList> = api.moveList(limit, offset, q)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.moveRetrieve
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun moveRetrieveTest() {
        val id: kotlin.String = TODO()
        
        val response: ResponseEntity<MoveDetail> = api.moveRetrieve(id)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.moveTargetList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun moveTargetListTest() {
        val limit: kotlin.Int? = TODO()
        val offset: kotlin.Int? = TODO()
        val q: kotlin.String? = TODO()
        
        val response: ResponseEntity<PaginatedMoveTargetSummaryList> = api.moveTargetList(limit, offset, q)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.moveTargetRetrieve
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun moveTargetRetrieveTest() {
        val id: kotlin.String = TODO()
        
        val response: ResponseEntity<MoveTargetDetail> = api.moveTargetRetrieve(id)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.natureList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun natureListTest() {
        val limit: kotlin.Int? = TODO()
        val offset: kotlin.Int? = TODO()
        val q: kotlin.String? = TODO()
        
        val response: ResponseEntity<PaginatedNatureSummaryList> = api.natureList(limit, offset, q)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.natureRetrieve
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun natureRetrieveTest() {
        val id: kotlin.String = TODO()
        
        val response: ResponseEntity<NatureDetail> = api.natureRetrieve(id)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.palParkAreaList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun palParkAreaListTest() {
        val limit: kotlin.Int? = TODO()
        val offset: kotlin.Int? = TODO()
        val q: kotlin.String? = TODO()
        
        val response: ResponseEntity<PaginatedPalParkAreaSummaryList> = api.palParkAreaList(limit, offset, q)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.palParkAreaRetrieve
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun palParkAreaRetrieveTest() {
        val id: kotlin.String = TODO()
        
        val response: ResponseEntity<PalParkAreaDetail> = api.palParkAreaRetrieve(id)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.pokeathlonStatList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun pokeathlonStatListTest() {
        val limit: kotlin.Int? = TODO()
        val offset: kotlin.Int? = TODO()
        val q: kotlin.String? = TODO()
        
        val response: ResponseEntity<PaginatedPokeathlonStatSummaryList> = api.pokeathlonStatList(limit, offset, q)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.pokeathlonStatRetrieve
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun pokeathlonStatRetrieveTest() {
        val id: kotlin.String = TODO()
        
        val response: ResponseEntity<PokeathlonStatDetail> = api.pokeathlonStatRetrieve(id)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.pokedexList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun pokedexListTest() {
        val limit: kotlin.Int? = TODO()
        val offset: kotlin.Int? = TODO()
        val q: kotlin.String? = TODO()
        
        val response: ResponseEntity<PaginatedPokedexSummaryList> = api.pokedexList(limit, offset, q)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.pokedexRetrieve
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun pokedexRetrieveTest() {
        val id: kotlin.String = TODO()
        
        val response: ResponseEntity<PokedexDetail> = api.pokedexRetrieve(id)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.pokemonColorList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun pokemonColorListTest() {
        val limit: kotlin.Int? = TODO()
        val offset: kotlin.Int? = TODO()
        val q: kotlin.String? = TODO()
        
        val response: ResponseEntity<PaginatedPokemonColorSummaryList> = api.pokemonColorList(limit, offset, q)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.pokemonColorRetrieve
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun pokemonColorRetrieveTest() {
        val id: kotlin.String = TODO()
        
        val response: ResponseEntity<PokemonColorDetail> = api.pokemonColorRetrieve(id)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.pokemonFormList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun pokemonFormListTest() {
        val limit: kotlin.Int? = TODO()
        val offset: kotlin.Int? = TODO()
        val q: kotlin.String? = TODO()
        
        val response: ResponseEntity<PaginatedPokemonFormSummaryList> = api.pokemonFormList(limit, offset, q)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.pokemonFormRetrieve
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun pokemonFormRetrieveTest() {
        val id: kotlin.String = TODO()
        
        val response: ResponseEntity<PokemonFormDetail> = api.pokemonFormRetrieve(id)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.pokemonHabitatList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun pokemonHabitatListTest() {
        val limit: kotlin.Int? = TODO()
        val offset: kotlin.Int? = TODO()
        val q: kotlin.String? = TODO()
        
        val response: ResponseEntity<PaginatedPokemonHabitatSummaryList> = api.pokemonHabitatList(limit, offset, q)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.pokemonHabitatRetrieve
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun pokemonHabitatRetrieveTest() {
        val id: kotlin.String = TODO()
        
        val response: ResponseEntity<PokemonHabitatDetail> = api.pokemonHabitatRetrieve(id)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.pokemonList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun pokemonListTest() {
        val limit: kotlin.Int? = TODO()
        val offset: kotlin.Int? = TODO()
        val q: kotlin.String? = TODO()
        
        val response: ResponseEntity<PaginatedPokemonSummaryList> = api.pokemonList(limit, offset, q)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.pokemonRetrieve
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun pokemonRetrieveTest() {
        val id: kotlin.String = TODO()
        
        val response: ResponseEntity<PokemonDetail> = api.pokemonRetrieve(id)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.pokemonShapeList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun pokemonShapeListTest() {
        val limit: kotlin.Int? = TODO()
        val offset: kotlin.Int? = TODO()
        val q: kotlin.String? = TODO()
        
        val response: ResponseEntity<PaginatedPokemonShapeSummaryList> = api.pokemonShapeList(limit, offset, q)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.pokemonShapeRetrieve
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun pokemonShapeRetrieveTest() {
        val id: kotlin.String = TODO()
        
        val response: ResponseEntity<PokemonShapeDetail> = api.pokemonShapeRetrieve(id)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.pokemonSpeciesList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun pokemonSpeciesListTest() {
        val limit: kotlin.Int? = TODO()
        val offset: kotlin.Int? = TODO()
        val q: kotlin.String? = TODO()
        
        val response: ResponseEntity<PaginatedPokemonSpeciesSummaryList> = api.pokemonSpeciesList(limit, offset, q)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.pokemonSpeciesRetrieve
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun pokemonSpeciesRetrieveTest() {
        val id: kotlin.String = TODO()
        
        val response: ResponseEntity<PokemonSpeciesDetail> = api.pokemonSpeciesRetrieve(id)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.regionList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun regionListTest() {
        val limit: kotlin.Int? = TODO()
        val offset: kotlin.Int? = TODO()
        val q: kotlin.String? = TODO()
        
        val response: ResponseEntity<PaginatedRegionSummaryList> = api.regionList(limit, offset, q)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.regionRetrieve
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun regionRetrieveTest() {
        val id: kotlin.String = TODO()
        
        val response: ResponseEntity<RegionDetail> = api.regionRetrieve(id)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.statList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun statListTest() {
        val limit: kotlin.Int? = TODO()
        val offset: kotlin.Int? = TODO()
        val q: kotlin.String? = TODO()
        
        val response: ResponseEntity<PaginatedStatSummaryList> = api.statList(limit, offset, q)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.statRetrieve
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun statRetrieveTest() {
        val id: kotlin.String = TODO()
        
        val response: ResponseEntity<StatDetail> = api.statRetrieve(id)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.superContestEffectList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun superContestEffectListTest() {
        val limit: kotlin.Int? = TODO()
        val offset: kotlin.Int? = TODO()
        val q: kotlin.String? = TODO()
        
        val response: ResponseEntity<PaginatedSuperContestEffectSummaryList> = api.superContestEffectList(limit, offset, q)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.superContestEffectRetrieve
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun superContestEffectRetrieveTest() {
        val id: kotlin.String = TODO()
        
        val response: ResponseEntity<SuperContestEffectDetail> = api.superContestEffectRetrieve(id)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.typeList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun typeListTest() {
        val limit: kotlin.Int? = TODO()
        val offset: kotlin.Int? = TODO()
        val q: kotlin.String? = TODO()
        
        val response: ResponseEntity<PaginatedTypeSummaryList> = api.typeList(limit, offset, q)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.typeRetrieve
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun typeRetrieveTest() {
        val id: kotlin.String = TODO()
        
        val response: ResponseEntity<TypeDetail> = api.typeRetrieve(id)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.versionGroupList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun versionGroupListTest() {
        val limit: kotlin.Int? = TODO()
        val offset: kotlin.Int? = TODO()
        val q: kotlin.String? = TODO()
        
        val response: ResponseEntity<PaginatedVersionGroupSummaryList> = api.versionGroupList(limit, offset, q)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.versionGroupRetrieve
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun versionGroupRetrieveTest() {
        val id: kotlin.String = TODO()
        
        val response: ResponseEntity<VersionGroupDetail> = api.versionGroupRetrieve(id)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.versionList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun versionListTest() {
        val limit: kotlin.Int? = TODO()
        val offset: kotlin.Int? = TODO()
        val q: kotlin.String? = TODO()
        
        val response: ResponseEntity<PaginatedVersionSummaryList> = api.versionList(limit, offset, q)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.versionRetrieve
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun versionRetrieveTest() {
        val id: kotlin.String = TODO()
        
        val response: ResponseEntity<VersionDetail> = api.versionRetrieve(id)

        // TODO: test validations
    }
}
