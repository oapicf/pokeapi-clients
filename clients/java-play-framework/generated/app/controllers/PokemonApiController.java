package controllers;

import apimodels.AbilityDetail;
import apimodels.CharacteristicDetail;
import apimodels.EggGroupDetail;
import apimodels.GenderDetail;
import apimodels.GrowthRateDetail;
import apimodels.MoveDamageClassDetail;
import apimodels.NatureDetail;
import apimodels.PaginatedAbilitySummaryList;
import apimodels.PaginatedCharacteristicSummaryList;
import apimodels.PaginatedEggGroupSummaryList;
import apimodels.PaginatedGenderSummaryList;
import apimodels.PaginatedGrowthRateSummaryList;
import apimodels.PaginatedMoveDamageClassSummaryList;
import apimodels.PaginatedNatureSummaryList;
import apimodels.PaginatedPokeathlonStatSummaryList;
import apimodels.PaginatedPokemonColorSummaryList;
import apimodels.PaginatedPokemonFormSummaryList;
import apimodels.PaginatedPokemonHabitatSummaryList;
import apimodels.PaginatedPokemonShapeSummaryList;
import apimodels.PaginatedPokemonSpeciesSummaryList;
import apimodels.PaginatedPokemonSummaryList;
import apimodels.PaginatedStatSummaryList;
import apimodels.PaginatedTypeSummaryList;
import apimodels.PokeathlonStatDetail;
import apimodels.PokemonColorDetail;
import apimodels.PokemonDetail;
import apimodels.PokemonFormDetail;
import apimodels.PokemonHabitatDetail;
import apimodels.PokemonShapeDetail;
import apimodels.PokemonSpeciesDetail;
import apimodels.StatDetail;
import apimodels.TypeDetail;

import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import play.libs.Files.TemporaryFile;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import javax.validation.Valid;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-07T15:23:19.397731995Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PokemonApiController extends Controller {
    private final PokemonApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private PokemonApiController(Config configuration, PokemonApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result abilityList(Http.Request request) throws Exception {
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        String valueoffset = request.getQueryString("offset");
        Integer offset;
        if (valueoffset != null) {
            offset = Integer.parseInt(valueoffset);
        } else {
            offset = null;
        }
        String valueq = request.getQueryString("q");
        String q;
        if (valueq != null) {
            q = valueq;
        } else {
            q = null;
        }
        return imp.abilityListHttp(request, limit, offset, q);
    }

    @ApiAction
    public Result abilityRetrieve(Http.Request request, String id) throws Exception {
        return imp.abilityRetrieveHttp(request, id);
    }

    @ApiAction
    public Result characteristicList(Http.Request request) throws Exception {
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        String valueoffset = request.getQueryString("offset");
        Integer offset;
        if (valueoffset != null) {
            offset = Integer.parseInt(valueoffset);
        } else {
            offset = null;
        }
        String valueq = request.getQueryString("q");
        String q;
        if (valueq != null) {
            q = valueq;
        } else {
            q = null;
        }
        return imp.characteristicListHttp(request, limit, offset, q);
    }

    @ApiAction
    public Result characteristicRetrieve(Http.Request request, String id) throws Exception {
        return imp.characteristicRetrieveHttp(request, id);
    }

    @ApiAction
    public Result eggGroupList(Http.Request request) throws Exception {
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        String valueoffset = request.getQueryString("offset");
        Integer offset;
        if (valueoffset != null) {
            offset = Integer.parseInt(valueoffset);
        } else {
            offset = null;
        }
        String valueq = request.getQueryString("q");
        String q;
        if (valueq != null) {
            q = valueq;
        } else {
            q = null;
        }
        return imp.eggGroupListHttp(request, limit, offset, q);
    }

    @ApiAction
    public Result eggGroupRetrieve(Http.Request request, String id) throws Exception {
        return imp.eggGroupRetrieveHttp(request, id);
    }

    @ApiAction
    public Result genderList(Http.Request request) throws Exception {
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        String valueoffset = request.getQueryString("offset");
        Integer offset;
        if (valueoffset != null) {
            offset = Integer.parseInt(valueoffset);
        } else {
            offset = null;
        }
        String valueq = request.getQueryString("q");
        String q;
        if (valueq != null) {
            q = valueq;
        } else {
            q = null;
        }
        return imp.genderListHttp(request, limit, offset, q);
    }

    @ApiAction
    public Result genderRetrieve(Http.Request request, String id) throws Exception {
        return imp.genderRetrieveHttp(request, id);
    }

    @ApiAction
    public Result growthRateList(Http.Request request) throws Exception {
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        String valueoffset = request.getQueryString("offset");
        Integer offset;
        if (valueoffset != null) {
            offset = Integer.parseInt(valueoffset);
        } else {
            offset = null;
        }
        String valueq = request.getQueryString("q");
        String q;
        if (valueq != null) {
            q = valueq;
        } else {
            q = null;
        }
        return imp.growthRateListHttp(request, limit, offset, q);
    }

    @ApiAction
    public Result growthRateRetrieve(Http.Request request, String id) throws Exception {
        return imp.growthRateRetrieveHttp(request, id);
    }

    @ApiAction
    public Result moveDamageClassList(Http.Request request) throws Exception {
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        String valueoffset = request.getQueryString("offset");
        Integer offset;
        if (valueoffset != null) {
            offset = Integer.parseInt(valueoffset);
        } else {
            offset = null;
        }
        String valueq = request.getQueryString("q");
        String q;
        if (valueq != null) {
            q = valueq;
        } else {
            q = null;
        }
        return imp.moveDamageClassListHttp(request, limit, offset, q);
    }

    @ApiAction
    public Result moveDamageClassRetrieve(Http.Request request, String id) throws Exception {
        return imp.moveDamageClassRetrieveHttp(request, id);
    }

    @ApiAction
    public Result natureList(Http.Request request) throws Exception {
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        String valueoffset = request.getQueryString("offset");
        Integer offset;
        if (valueoffset != null) {
            offset = Integer.parseInt(valueoffset);
        } else {
            offset = null;
        }
        String valueq = request.getQueryString("q");
        String q;
        if (valueq != null) {
            q = valueq;
        } else {
            q = null;
        }
        return imp.natureListHttp(request, limit, offset, q);
    }

    @ApiAction
    public Result natureRetrieve(Http.Request request, String id) throws Exception {
        return imp.natureRetrieveHttp(request, id);
    }

    @ApiAction
    public Result pokeathlonStatList(Http.Request request) throws Exception {
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        String valueoffset = request.getQueryString("offset");
        Integer offset;
        if (valueoffset != null) {
            offset = Integer.parseInt(valueoffset);
        } else {
            offset = null;
        }
        String valueq = request.getQueryString("q");
        String q;
        if (valueq != null) {
            q = valueq;
        } else {
            q = null;
        }
        return imp.pokeathlonStatListHttp(request, limit, offset, q);
    }

    @ApiAction
    public Result pokeathlonStatRetrieve(Http.Request request, String id) throws Exception {
        return imp.pokeathlonStatRetrieveHttp(request, id);
    }

    @ApiAction
    public Result pokemonColorList(Http.Request request) throws Exception {
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        String valueoffset = request.getQueryString("offset");
        Integer offset;
        if (valueoffset != null) {
            offset = Integer.parseInt(valueoffset);
        } else {
            offset = null;
        }
        String valueq = request.getQueryString("q");
        String q;
        if (valueq != null) {
            q = valueq;
        } else {
            q = null;
        }
        return imp.pokemonColorListHttp(request, limit, offset, q);
    }

    @ApiAction
    public Result pokemonColorRetrieve(Http.Request request, String id) throws Exception {
        return imp.pokemonColorRetrieveHttp(request, id);
    }

    @ApiAction
    public Result pokemonFormList(Http.Request request) throws Exception {
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        String valueoffset = request.getQueryString("offset");
        Integer offset;
        if (valueoffset != null) {
            offset = Integer.parseInt(valueoffset);
        } else {
            offset = null;
        }
        String valueq = request.getQueryString("q");
        String q;
        if (valueq != null) {
            q = valueq;
        } else {
            q = null;
        }
        return imp.pokemonFormListHttp(request, limit, offset, q);
    }

    @ApiAction
    public Result pokemonFormRetrieve(Http.Request request, String id) throws Exception {
        return imp.pokemonFormRetrieveHttp(request, id);
    }

    @ApiAction
    public Result pokemonHabitatList(Http.Request request) throws Exception {
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        String valueoffset = request.getQueryString("offset");
        Integer offset;
        if (valueoffset != null) {
            offset = Integer.parseInt(valueoffset);
        } else {
            offset = null;
        }
        String valueq = request.getQueryString("q");
        String q;
        if (valueq != null) {
            q = valueq;
        } else {
            q = null;
        }
        return imp.pokemonHabitatListHttp(request, limit, offset, q);
    }

    @ApiAction
    public Result pokemonHabitatRetrieve(Http.Request request, String id) throws Exception {
        return imp.pokemonHabitatRetrieveHttp(request, id);
    }

    @ApiAction
    public Result pokemonList(Http.Request request) throws Exception {
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        String valueoffset = request.getQueryString("offset");
        Integer offset;
        if (valueoffset != null) {
            offset = Integer.parseInt(valueoffset);
        } else {
            offset = null;
        }
        String valueq = request.getQueryString("q");
        String q;
        if (valueq != null) {
            q = valueq;
        } else {
            q = null;
        }
        return imp.pokemonListHttp(request, limit, offset, q);
    }

    @ApiAction
    public Result pokemonRetrieve(Http.Request request, String id) throws Exception {
        return imp.pokemonRetrieveHttp(request, id);
    }

    @ApiAction
    public Result pokemonShapeList(Http.Request request) throws Exception {
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        String valueoffset = request.getQueryString("offset");
        Integer offset;
        if (valueoffset != null) {
            offset = Integer.parseInt(valueoffset);
        } else {
            offset = null;
        }
        String valueq = request.getQueryString("q");
        String q;
        if (valueq != null) {
            q = valueq;
        } else {
            q = null;
        }
        return imp.pokemonShapeListHttp(request, limit, offset, q);
    }

    @ApiAction
    public Result pokemonShapeRetrieve(Http.Request request, String id) throws Exception {
        return imp.pokemonShapeRetrieveHttp(request, id);
    }

    @ApiAction
    public Result pokemonSpeciesList(Http.Request request) throws Exception {
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        String valueoffset = request.getQueryString("offset");
        Integer offset;
        if (valueoffset != null) {
            offset = Integer.parseInt(valueoffset);
        } else {
            offset = null;
        }
        String valueq = request.getQueryString("q");
        String q;
        if (valueq != null) {
            q = valueq;
        } else {
            q = null;
        }
        return imp.pokemonSpeciesListHttp(request, limit, offset, q);
    }

    @ApiAction
    public Result pokemonSpeciesRetrieve(Http.Request request, String id) throws Exception {
        return imp.pokemonSpeciesRetrieveHttp(request, id);
    }

    @ApiAction
    public Result statList(Http.Request request) throws Exception {
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        String valueoffset = request.getQueryString("offset");
        Integer offset;
        if (valueoffset != null) {
            offset = Integer.parseInt(valueoffset);
        } else {
            offset = null;
        }
        String valueq = request.getQueryString("q");
        String q;
        if (valueq != null) {
            q = valueq;
        } else {
            q = null;
        }
        return imp.statListHttp(request, limit, offset, q);
    }

    @ApiAction
    public Result statRetrieve(Http.Request request, String id) throws Exception {
        return imp.statRetrieveHttp(request, id);
    }

    @ApiAction
    public Result typeList(Http.Request request) throws Exception {
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        String valueoffset = request.getQueryString("offset");
        Integer offset;
        if (valueoffset != null) {
            offset = Integer.parseInt(valueoffset);
        } else {
            offset = null;
        }
        String valueq = request.getQueryString("q");
        String q;
        if (valueq != null) {
            q = valueq;
        } else {
            q = null;
        }
        return imp.typeListHttp(request, limit, offset, q);
    }

    @ApiAction
    public Result typeRetrieve(Http.Request request, String id) throws Exception {
        return imp.typeRetrieveHttp(request, id);
    }

}
