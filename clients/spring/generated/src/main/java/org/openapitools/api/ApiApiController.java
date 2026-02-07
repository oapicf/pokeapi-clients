package org.openapitools.api;

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
import org.springframework.lang.Nullable;
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
import org.openapitools.model.PokemonEncountersRetrieve200ResponseInner;
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


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-07T04:22:27.168374474Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@Controller
@RequestMapping("${openapi.pok.base-path:}")
public class ApiApiController implements ApiApi {

    private final NativeWebRequest request;

    @Autowired
    public ApiApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
