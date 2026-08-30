package org.openapitools.api.consumer;

import org.openapitools.model.AbilityDetail;
import org.openapitools.model.BerryDetail;
import org.openapitools.model.BerryFirmnessDetail;
import org.openapitools.model.BerryFlavorDetail;
import org.openapitools.model.CharacteristicDetail;
import org.openapitools.model.ContestEffectDetail;
import org.openapitools.model.ContestTypeDetail;
import org.openapitools.model.EggGroupDetail;
import org.openapitools.model.EncounterConditionDetail;
import org.openapitools.model.EncounterConditionValueDetail;
import org.openapitools.model.EncounterMethodDetail;
import org.openapitools.model.EvolutionChainDetail;
import org.openapitools.model.EvolutionTriggerDetail;
import org.openapitools.model.GenderDetail;
import org.openapitools.model.GenerationDetail;
import org.openapitools.model.GrowthRateDetail;
import org.openapitools.model.ItemAttributeDetail;
import org.openapitools.model.ItemCategoryDetail;
import org.openapitools.model.ItemDetail;
import org.openapitools.model.ItemFlingEffectDetail;
import org.openapitools.model.ItemPocketDetail;
import org.openapitools.model.LanguageDetail;
import org.openapitools.model.LocationAreaDetail;
import org.openapitools.model.LocationDetail;
import org.openapitools.model.MachineDetail;
import org.openapitools.model.MoveBattleStyleDetail;
import org.openapitools.model.MoveDamageClassDetail;
import org.openapitools.model.MoveDetail;
import org.openapitools.model.MoveLearnMethodDetail;
import org.openapitools.model.MoveMetaAilmentDetail;
import org.openapitools.model.MoveMetaCategoryDetail;
import org.openapitools.model.MoveTargetDetail;
import org.openapitools.model.NatureDetail;
import org.openapitools.model.PaginatedAbilitySummaryList;
import org.openapitools.model.PaginatedBerryFirmnessSummaryList;
import org.openapitools.model.PaginatedBerryFlavorSummaryList;
import org.openapitools.model.PaginatedBerrySummaryList;
import org.openapitools.model.PaginatedCharacteristicSummaryList;
import org.openapitools.model.PaginatedContestEffectSummaryList;
import org.openapitools.model.PaginatedContestTypeSummaryList;
import org.openapitools.model.PaginatedEggGroupSummaryList;
import org.openapitools.model.PaginatedEncounterConditionSummaryList;
import org.openapitools.model.PaginatedEncounterConditionValueSummaryList;
import org.openapitools.model.PaginatedEncounterMethodSummaryList;
import org.openapitools.model.PaginatedEvolutionChainSummaryList;
import org.openapitools.model.PaginatedEvolutionTriggerSummaryList;
import org.openapitools.model.PaginatedGenderSummaryList;
import org.openapitools.model.PaginatedGenerationSummaryList;
import org.openapitools.model.PaginatedGrowthRateSummaryList;
import org.openapitools.model.PaginatedItemAttributeSummaryList;
import org.openapitools.model.PaginatedItemCategorySummaryList;
import org.openapitools.model.PaginatedItemFlingEffectSummaryList;
import org.openapitools.model.PaginatedItemPocketSummaryList;
import org.openapitools.model.PaginatedItemSummaryList;
import org.openapitools.model.PaginatedLanguageSummaryList;
import org.openapitools.model.PaginatedLocationAreaSummaryList;
import org.openapitools.model.PaginatedLocationSummaryList;
import org.openapitools.model.PaginatedMachineSummaryList;
import org.openapitools.model.PaginatedMoveBattleStyleSummaryList;
import org.openapitools.model.PaginatedMoveDamageClassSummaryList;
import org.openapitools.model.PaginatedMoveLearnMethodSummaryList;
import org.openapitools.model.PaginatedMoveMetaAilmentSummaryList;
import org.openapitools.model.PaginatedMoveMetaCategorySummaryList;
import org.openapitools.model.PaginatedMoveSummaryList;
import org.openapitools.model.PaginatedMoveTargetSummaryList;
import org.openapitools.model.PaginatedNatureSummaryList;
import org.openapitools.model.PaginatedPalParkAreaSummaryList;
import org.openapitools.model.PaginatedPokeathlonStatSummaryList;
import org.openapitools.model.PaginatedPokedexSummaryList;
import org.openapitools.model.PaginatedPokemonColorSummaryList;
import org.openapitools.model.PaginatedPokemonFormSummaryList;
import org.openapitools.model.PaginatedPokemonHabitatSummaryList;
import org.openapitools.model.PaginatedPokemonShapeSummaryList;
import org.openapitools.model.PaginatedPokemonSpeciesSummaryList;
import org.openapitools.model.PaginatedPokemonSummaryList;
import org.openapitools.model.PaginatedRegionSummaryList;
import org.openapitools.model.PaginatedStatSummaryList;
import org.openapitools.model.PaginatedSuperContestEffectSummaryList;
import org.openapitools.model.PaginatedTypeSummaryList;
import org.openapitools.model.PaginatedVersionGroupSummaryList;
import org.openapitools.model.PaginatedVersionSummaryList;
import org.openapitools.model.PalParkAreaDetail;
import org.openapitools.model.PokeathlonStatDetail;
import org.openapitools.model.PokedexDetail;
import org.openapitools.model.PokemonColorDetail;
import org.openapitools.model.PokemonDetail;
import org.openapitools.model.PokemonFormDetail;
import org.openapitools.model.PokemonHabitatDetail;
import org.openapitools.model.PokemonShapeDetail;
import org.openapitools.model.PokemonSpeciesDetail;
import org.openapitools.model.RegionDetail;
import org.openapitools.model.StatDetail;
import org.openapitools.model.SuperContestEffectDetail;
import org.openapitools.model.TypeDetail;
import org.openapitools.model.VersionDetail;
import org.openapitools.model.VersionGroupDetail;
import org.openapitools.model.*;
import org.openapitools.api.interfaces.ApiService;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

@RestController
@RequestMapping("/api")
public class ApiServiceController {

    @DubboReference
    private ApiService apiService;

    @RequestMapping(method = RequestMethod.GET, value = "/v2/ability/")
    public PaginatedAbilitySummaryList abilityList(
        @RequestParam(name = "limit") Integer limit,
        @RequestParam(name = "offset") Integer offset,
        @RequestParam(name = "q") String q
    ) {
        return apiService.abilityList(limit, offset, q);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/ability/{id}/")
    public AbilityDetail abilityRetrieve(
        @RequestParam(name = "id") String id
    ) {
        return apiService.abilityRetrieve(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/berry-firmness/")
    public PaginatedBerryFirmnessSummaryList berryFirmnessList(
        @RequestParam(name = "limit") Integer limit,
        @RequestParam(name = "offset") Integer offset,
        @RequestParam(name = "q") String q
    ) {
        return apiService.berryFirmnessList(limit, offset, q);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/berry-firmness/{id}/")
    public BerryFirmnessDetail berryFirmnessRetrieve(
        @RequestParam(name = "id") String id
    ) {
        return apiService.berryFirmnessRetrieve(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/berry-flavor/")
    public PaginatedBerryFlavorSummaryList berryFlavorList(
        @RequestParam(name = "limit") Integer limit,
        @RequestParam(name = "offset") Integer offset,
        @RequestParam(name = "q") String q
    ) {
        return apiService.berryFlavorList(limit, offset, q);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/berry-flavor/{id}/")
    public BerryFlavorDetail berryFlavorRetrieve(
        @RequestParam(name = "id") String id
    ) {
        return apiService.berryFlavorRetrieve(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/berry/")
    public PaginatedBerrySummaryList berryList(
        @RequestParam(name = "limit") Integer limit,
        @RequestParam(name = "offset") Integer offset,
        @RequestParam(name = "q") String q
    ) {
        return apiService.berryList(limit, offset, q);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/berry/{id}/")
    public BerryDetail berryRetrieve(
        @RequestParam(name = "id") String id
    ) {
        return apiService.berryRetrieve(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/characteristic/")
    public PaginatedCharacteristicSummaryList characteristicList(
        @RequestParam(name = "limit") Integer limit,
        @RequestParam(name = "offset") Integer offset,
        @RequestParam(name = "q") String q
    ) {
        return apiService.characteristicList(limit, offset, q);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/characteristic/{id}/")
    public CharacteristicDetail characteristicRetrieve(
        @RequestParam(name = "id") String id
    ) {
        return apiService.characteristicRetrieve(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/contest-effect/")
    public PaginatedContestEffectSummaryList contestEffectList(
        @RequestParam(name = "limit") Integer limit,
        @RequestParam(name = "offset") Integer offset,
        @RequestParam(name = "q") String q
    ) {
        return apiService.contestEffectList(limit, offset, q);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/contest-effect/{id}/")
    public ContestEffectDetail contestEffectRetrieve(
        @RequestParam(name = "id") String id
    ) {
        return apiService.contestEffectRetrieve(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/contest-type/")
    public PaginatedContestTypeSummaryList contestTypeList(
        @RequestParam(name = "limit") Integer limit,
        @RequestParam(name = "offset") Integer offset,
        @RequestParam(name = "q") String q
    ) {
        return apiService.contestTypeList(limit, offset, q);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/contest-type/{id}/")
    public ContestTypeDetail contestTypeRetrieve(
        @RequestParam(name = "id") String id
    ) {
        return apiService.contestTypeRetrieve(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/egg-group/")
    public PaginatedEggGroupSummaryList eggGroupList(
        @RequestParam(name = "limit") Integer limit,
        @RequestParam(name = "offset") Integer offset,
        @RequestParam(name = "q") String q
    ) {
        return apiService.eggGroupList(limit, offset, q);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/egg-group/{id}/")
    public EggGroupDetail eggGroupRetrieve(
        @RequestParam(name = "id") String id
    ) {
        return apiService.eggGroupRetrieve(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/encounter-condition/")
    public PaginatedEncounterConditionSummaryList encounterConditionList(
        @RequestParam(name = "limit") Integer limit,
        @RequestParam(name = "offset") Integer offset,
        @RequestParam(name = "q") String q
    ) {
        return apiService.encounterConditionList(limit, offset, q);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/encounter-condition/{id}/")
    public EncounterConditionDetail encounterConditionRetrieve(
        @RequestParam(name = "id") String id
    ) {
        return apiService.encounterConditionRetrieve(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/encounter-condition-value/")
    public PaginatedEncounterConditionValueSummaryList encounterConditionValueList(
        @RequestParam(name = "limit") Integer limit,
        @RequestParam(name = "offset") Integer offset,
        @RequestParam(name = "q") String q
    ) {
        return apiService.encounterConditionValueList(limit, offset, q);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/encounter-condition-value/{id}/")
    public EncounterConditionValueDetail encounterConditionValueRetrieve(
        @RequestParam(name = "id") String id
    ) {
        return apiService.encounterConditionValueRetrieve(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/encounter-method/")
    public PaginatedEncounterMethodSummaryList encounterMethodList(
        @RequestParam(name = "limit") Integer limit,
        @RequestParam(name = "offset") Integer offset,
        @RequestParam(name = "q") String q
    ) {
        return apiService.encounterMethodList(limit, offset, q);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/encounter-method/{id}/")
    public EncounterMethodDetail encounterMethodRetrieve(
        @RequestParam(name = "id") String id
    ) {
        return apiService.encounterMethodRetrieve(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/evolution-chain/")
    public PaginatedEvolutionChainSummaryList evolutionChainList(
        @RequestParam(name = "limit") Integer limit,
        @RequestParam(name = "offset") Integer offset,
        @RequestParam(name = "q") String q
    ) {
        return apiService.evolutionChainList(limit, offset, q);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/evolution-chain/{id}/")
    public EvolutionChainDetail evolutionChainRetrieve(
        @RequestParam(name = "id") String id
    ) {
        return apiService.evolutionChainRetrieve(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/evolution-trigger/")
    public PaginatedEvolutionTriggerSummaryList evolutionTriggerList(
        @RequestParam(name = "limit") Integer limit,
        @RequestParam(name = "offset") Integer offset,
        @RequestParam(name = "q") String q
    ) {
        return apiService.evolutionTriggerList(limit, offset, q);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/evolution-trigger/{id}/")
    public EvolutionTriggerDetail evolutionTriggerRetrieve(
        @RequestParam(name = "id") String id
    ) {
        return apiService.evolutionTriggerRetrieve(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/gender/")
    public PaginatedGenderSummaryList genderList(
        @RequestParam(name = "limit") Integer limit,
        @RequestParam(name = "offset") Integer offset,
        @RequestParam(name = "q") String q
    ) {
        return apiService.genderList(limit, offset, q);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/gender/{id}/")
    public GenderDetail genderRetrieve(
        @RequestParam(name = "id") String id
    ) {
        return apiService.genderRetrieve(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/generation/")
    public PaginatedGenerationSummaryList generationList(
        @RequestParam(name = "limit") Integer limit,
        @RequestParam(name = "offset") Integer offset,
        @RequestParam(name = "q") String q
    ) {
        return apiService.generationList(limit, offset, q);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/generation/{id}/")
    public GenerationDetail generationRetrieve(
        @RequestParam(name = "id") String id
    ) {
        return apiService.generationRetrieve(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/growth-rate/")
    public PaginatedGrowthRateSummaryList growthRateList(
        @RequestParam(name = "limit") Integer limit,
        @RequestParam(name = "offset") Integer offset,
        @RequestParam(name = "q") String q
    ) {
        return apiService.growthRateList(limit, offset, q);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/growth-rate/{id}/")
    public GrowthRateDetail growthRateRetrieve(
        @RequestParam(name = "id") String id
    ) {
        return apiService.growthRateRetrieve(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/item-attribute/")
    public PaginatedItemAttributeSummaryList itemAttributeList(
        @RequestParam(name = "limit") Integer limit,
        @RequestParam(name = "offset") Integer offset,
        @RequestParam(name = "q") String q
    ) {
        return apiService.itemAttributeList(limit, offset, q);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/item-attribute/{id}/")
    public ItemAttributeDetail itemAttributeRetrieve(
        @RequestParam(name = "id") String id
    ) {
        return apiService.itemAttributeRetrieve(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/item-category/")
    public PaginatedItemCategorySummaryList itemCategoryList(
        @RequestParam(name = "limit") Integer limit,
        @RequestParam(name = "offset") Integer offset,
        @RequestParam(name = "q") String q
    ) {
        return apiService.itemCategoryList(limit, offset, q);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/item-category/{id}/")
    public ItemCategoryDetail itemCategoryRetrieve(
        @RequestParam(name = "id") String id
    ) {
        return apiService.itemCategoryRetrieve(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/item-fling-effect/")
    public PaginatedItemFlingEffectSummaryList itemFlingEffectList(
        @RequestParam(name = "limit") Integer limit,
        @RequestParam(name = "offset") Integer offset,
        @RequestParam(name = "q") String q
    ) {
        return apiService.itemFlingEffectList(limit, offset, q);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/item-fling-effect/{id}/")
    public ItemFlingEffectDetail itemFlingEffectRetrieve(
        @RequestParam(name = "id") String id
    ) {
        return apiService.itemFlingEffectRetrieve(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/item/")
    public PaginatedItemSummaryList itemList(
        @RequestParam(name = "limit") Integer limit,
        @RequestParam(name = "offset") Integer offset,
        @RequestParam(name = "q") String q
    ) {
        return apiService.itemList(limit, offset, q);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/item-pocket/")
    public PaginatedItemPocketSummaryList itemPocketList(
        @RequestParam(name = "limit") Integer limit,
        @RequestParam(name = "offset") Integer offset,
        @RequestParam(name = "q") String q
    ) {
        return apiService.itemPocketList(limit, offset, q);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/item-pocket/{id}/")
    public ItemPocketDetail itemPocketRetrieve(
        @RequestParam(name = "id") String id
    ) {
        return apiService.itemPocketRetrieve(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/item/{id}/")
    public ItemDetail itemRetrieve(
        @RequestParam(name = "id") String id
    ) {
        return apiService.itemRetrieve(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/language/")
    public PaginatedLanguageSummaryList languageList(
        @RequestParam(name = "limit") Integer limit,
        @RequestParam(name = "offset") Integer offset,
        @RequestParam(name = "q") String q
    ) {
        return apiService.languageList(limit, offset, q);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/language/{id}/")
    public LanguageDetail languageRetrieve(
        @RequestParam(name = "id") String id
    ) {
        return apiService.languageRetrieve(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/location-area/")
    public PaginatedLocationAreaSummaryList locationAreaList(
        @RequestParam(name = "limit") Integer limit,
        @RequestParam(name = "offset") Integer offset
    ) {
        return apiService.locationAreaList(limit, offset);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/location-area/{id}/")
    public LocationAreaDetail locationAreaRetrieve(
        @RequestParam(name = "id") Integer id
    ) {
        return apiService.locationAreaRetrieve(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/location/")
    public PaginatedLocationSummaryList locationList(
        @RequestParam(name = "limit") Integer limit,
        @RequestParam(name = "offset") Integer offset,
        @RequestParam(name = "q") String q
    ) {
        return apiService.locationList(limit, offset, q);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/location/{id}/")
    public LocationDetail locationRetrieve(
        @RequestParam(name = "id") String id
    ) {
        return apiService.locationRetrieve(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/machine/")
    public PaginatedMachineSummaryList machineList(
        @RequestParam(name = "limit") Integer limit,
        @RequestParam(name = "offset") Integer offset,
        @RequestParam(name = "q") String q
    ) {
        return apiService.machineList(limit, offset, q);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/machine/{id}/")
    public MachineDetail machineRetrieve(
        @RequestParam(name = "id") String id
    ) {
        return apiService.machineRetrieve(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/move-ailment/")
    public PaginatedMoveMetaAilmentSummaryList moveAilmentList(
        @RequestParam(name = "limit") Integer limit,
        @RequestParam(name = "offset") Integer offset,
        @RequestParam(name = "q") String q
    ) {
        return apiService.moveAilmentList(limit, offset, q);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/move-ailment/{id}/")
    public MoveMetaAilmentDetail moveAilmentRetrieve(
        @RequestParam(name = "id") String id
    ) {
        return apiService.moveAilmentRetrieve(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/move-battle-style/")
    public PaginatedMoveBattleStyleSummaryList moveBattleStyleList(
        @RequestParam(name = "limit") Integer limit,
        @RequestParam(name = "offset") Integer offset,
        @RequestParam(name = "q") String q
    ) {
        return apiService.moveBattleStyleList(limit, offset, q);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/move-battle-style/{id}/")
    public MoveBattleStyleDetail moveBattleStyleRetrieve(
        @RequestParam(name = "id") String id
    ) {
        return apiService.moveBattleStyleRetrieve(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/move-category/")
    public PaginatedMoveMetaCategorySummaryList moveCategoryList(
        @RequestParam(name = "limit") Integer limit,
        @RequestParam(name = "offset") Integer offset,
        @RequestParam(name = "q") String q
    ) {
        return apiService.moveCategoryList(limit, offset, q);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/move-category/{id}/")
    public MoveMetaCategoryDetail moveCategoryRetrieve(
        @RequestParam(name = "id") String id
    ) {
        return apiService.moveCategoryRetrieve(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/move-damage-class/")
    public PaginatedMoveDamageClassSummaryList moveDamageClassList(
        @RequestParam(name = "limit") Integer limit,
        @RequestParam(name = "offset") Integer offset,
        @RequestParam(name = "q") String q
    ) {
        return apiService.moveDamageClassList(limit, offset, q);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/move-damage-class/{id}/")
    public MoveDamageClassDetail moveDamageClassRetrieve(
        @RequestParam(name = "id") String id
    ) {
        return apiService.moveDamageClassRetrieve(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/move-learn-method/")
    public PaginatedMoveLearnMethodSummaryList moveLearnMethodList(
        @RequestParam(name = "limit") Integer limit,
        @RequestParam(name = "offset") Integer offset,
        @RequestParam(name = "q") String q
    ) {
        return apiService.moveLearnMethodList(limit, offset, q);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/move-learn-method/{id}/")
    public MoveLearnMethodDetail moveLearnMethodRetrieve(
        @RequestParam(name = "id") String id
    ) {
        return apiService.moveLearnMethodRetrieve(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/move/")
    public PaginatedMoveSummaryList moveList(
        @RequestParam(name = "limit") Integer limit,
        @RequestParam(name = "offset") Integer offset,
        @RequestParam(name = "q") String q
    ) {
        return apiService.moveList(limit, offset, q);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/move/{id}/")
    public MoveDetail moveRetrieve(
        @RequestParam(name = "id") String id
    ) {
        return apiService.moveRetrieve(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/move-target/")
    public PaginatedMoveTargetSummaryList moveTargetList(
        @RequestParam(name = "limit") Integer limit,
        @RequestParam(name = "offset") Integer offset,
        @RequestParam(name = "q") String q
    ) {
        return apiService.moveTargetList(limit, offset, q);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/move-target/{id}/")
    public MoveTargetDetail moveTargetRetrieve(
        @RequestParam(name = "id") String id
    ) {
        return apiService.moveTargetRetrieve(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/nature/")
    public PaginatedNatureSummaryList natureList(
        @RequestParam(name = "limit") Integer limit,
        @RequestParam(name = "offset") Integer offset,
        @RequestParam(name = "q") String q
    ) {
        return apiService.natureList(limit, offset, q);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/nature/{id}/")
    public NatureDetail natureRetrieve(
        @RequestParam(name = "id") String id
    ) {
        return apiService.natureRetrieve(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/pal-park-area/")
    public PaginatedPalParkAreaSummaryList palParkAreaList(
        @RequestParam(name = "limit") Integer limit,
        @RequestParam(name = "offset") Integer offset,
        @RequestParam(name = "q") String q
    ) {
        return apiService.palParkAreaList(limit, offset, q);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/pal-park-area/{id}/")
    public PalParkAreaDetail palParkAreaRetrieve(
        @RequestParam(name = "id") String id
    ) {
        return apiService.palParkAreaRetrieve(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/pokeathlon-stat/")
    public PaginatedPokeathlonStatSummaryList pokeathlonStatList(
        @RequestParam(name = "limit") Integer limit,
        @RequestParam(name = "offset") Integer offset,
        @RequestParam(name = "q") String q
    ) {
        return apiService.pokeathlonStatList(limit, offset, q);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/pokeathlon-stat/{id}/")
    public PokeathlonStatDetail pokeathlonStatRetrieve(
        @RequestParam(name = "id") String id
    ) {
        return apiService.pokeathlonStatRetrieve(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/pokedex/")
    public PaginatedPokedexSummaryList pokedexList(
        @RequestParam(name = "limit") Integer limit,
        @RequestParam(name = "offset") Integer offset,
        @RequestParam(name = "q") String q
    ) {
        return apiService.pokedexList(limit, offset, q);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/pokedex/{id}/")
    public PokedexDetail pokedexRetrieve(
        @RequestParam(name = "id") String id
    ) {
        return apiService.pokedexRetrieve(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/pokemon-color/")
    public PaginatedPokemonColorSummaryList pokemonColorList(
        @RequestParam(name = "limit") Integer limit,
        @RequestParam(name = "offset") Integer offset,
        @RequestParam(name = "q") String q
    ) {
        return apiService.pokemonColorList(limit, offset, q);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/pokemon-color/{id}/")
    public PokemonColorDetail pokemonColorRetrieve(
        @RequestParam(name = "id") String id
    ) {
        return apiService.pokemonColorRetrieve(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/pokemon-form/")
    public PaginatedPokemonFormSummaryList pokemonFormList(
        @RequestParam(name = "limit") Integer limit,
        @RequestParam(name = "offset") Integer offset,
        @RequestParam(name = "q") String q
    ) {
        return apiService.pokemonFormList(limit, offset, q);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/pokemon-form/{id}/")
    public PokemonFormDetail pokemonFormRetrieve(
        @RequestParam(name = "id") String id
    ) {
        return apiService.pokemonFormRetrieve(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/pokemon-habitat/")
    public PaginatedPokemonHabitatSummaryList pokemonHabitatList(
        @RequestParam(name = "limit") Integer limit,
        @RequestParam(name = "offset") Integer offset,
        @RequestParam(name = "q") String q
    ) {
        return apiService.pokemonHabitatList(limit, offset, q);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/pokemon-habitat/{id}/")
    public PokemonHabitatDetail pokemonHabitatRetrieve(
        @RequestParam(name = "id") String id
    ) {
        return apiService.pokemonHabitatRetrieve(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/pokemon/")
    public PaginatedPokemonSummaryList pokemonList(
        @RequestParam(name = "limit") Integer limit,
        @RequestParam(name = "offset") Integer offset,
        @RequestParam(name = "q") String q
    ) {
        return apiService.pokemonList(limit, offset, q);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/pokemon/{id}/")
    public PokemonDetail pokemonRetrieve(
        @RequestParam(name = "id") String id
    ) {
        return apiService.pokemonRetrieve(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/pokemon-shape/")
    public PaginatedPokemonShapeSummaryList pokemonShapeList(
        @RequestParam(name = "limit") Integer limit,
        @RequestParam(name = "offset") Integer offset,
        @RequestParam(name = "q") String q
    ) {
        return apiService.pokemonShapeList(limit, offset, q);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/pokemon-shape/{id}/")
    public PokemonShapeDetail pokemonShapeRetrieve(
        @RequestParam(name = "id") String id
    ) {
        return apiService.pokemonShapeRetrieve(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/pokemon-species/")
    public PaginatedPokemonSpeciesSummaryList pokemonSpeciesList(
        @RequestParam(name = "limit") Integer limit,
        @RequestParam(name = "offset") Integer offset,
        @RequestParam(name = "q") String q
    ) {
        return apiService.pokemonSpeciesList(limit, offset, q);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/pokemon-species/{id}/")
    public PokemonSpeciesDetail pokemonSpeciesRetrieve(
        @RequestParam(name = "id") String id
    ) {
        return apiService.pokemonSpeciesRetrieve(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/region/")
    public PaginatedRegionSummaryList regionList(
        @RequestParam(name = "limit") Integer limit,
        @RequestParam(name = "offset") Integer offset,
        @RequestParam(name = "q") String q
    ) {
        return apiService.regionList(limit, offset, q);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/region/{id}/")
    public RegionDetail regionRetrieve(
        @RequestParam(name = "id") String id
    ) {
        return apiService.regionRetrieve(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/stat/")
    public PaginatedStatSummaryList statList(
        @RequestParam(name = "limit") Integer limit,
        @RequestParam(name = "offset") Integer offset,
        @RequestParam(name = "q") String q
    ) {
        return apiService.statList(limit, offset, q);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/stat/{id}/")
    public StatDetail statRetrieve(
        @RequestParam(name = "id") String id
    ) {
        return apiService.statRetrieve(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/super-contest-effect/")
    public PaginatedSuperContestEffectSummaryList superContestEffectList(
        @RequestParam(name = "limit") Integer limit,
        @RequestParam(name = "offset") Integer offset,
        @RequestParam(name = "q") String q
    ) {
        return apiService.superContestEffectList(limit, offset, q);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/super-contest-effect/{id}/")
    public SuperContestEffectDetail superContestEffectRetrieve(
        @RequestParam(name = "id") String id
    ) {
        return apiService.superContestEffectRetrieve(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/type/")
    public PaginatedTypeSummaryList typeList(
        @RequestParam(name = "limit") Integer limit,
        @RequestParam(name = "offset") Integer offset,
        @RequestParam(name = "q") String q
    ) {
        return apiService.typeList(limit, offset, q);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/type/{id}/")
    public TypeDetail typeRetrieve(
        @RequestParam(name = "id") String id
    ) {
        return apiService.typeRetrieve(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/version-group/")
    public PaginatedVersionGroupSummaryList versionGroupList(
        @RequestParam(name = "limit") Integer limit,
        @RequestParam(name = "offset") Integer offset,
        @RequestParam(name = "q") String q
    ) {
        return apiService.versionGroupList(limit, offset, q);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/version-group/{id}/")
    public VersionGroupDetail versionGroupRetrieve(
        @RequestParam(name = "id") String id
    ) {
        return apiService.versionGroupRetrieve(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/version/")
    public PaginatedVersionSummaryList versionList(
        @RequestParam(name = "limit") Integer limit,
        @RequestParam(name = "offset") Integer offset,
        @RequestParam(name = "q") String q
    ) {
        return apiService.versionList(limit, offset, q);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/v2/version/{id}/")
    public VersionDetail versionRetrieve(
        @RequestParam(name = "id") String id
    ) {
        return apiService.versionRetrieve(id);
    }
}
