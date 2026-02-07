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

import com.google.inject.Inject;
import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import openapitools.OpenAPIUtils;
import openapitools.SecurityAPIUtils;
import static play.mvc.Results.ok;
import static play.mvc.Results.unauthorized;
import play.libs.Files.TemporaryFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

@SuppressWarnings("RedundantThrows")
public abstract class PokemonApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result abilityListHttp(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        PaginatedAbilitySummaryList obj = abilityList(request, limit, offset, q);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PaginatedAbilitySummaryList abilityList(Http.Request request, Integer limit, Integer offset, String q) throws Exception;

    public Result abilityRetrieveHttp(Http.Request request, String id) throws Exception {
        AbilityDetail obj = abilityRetrieve(request, id);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AbilityDetail abilityRetrieve(Http.Request request, String id) throws Exception;

    public Result characteristicListHttp(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        PaginatedCharacteristicSummaryList obj = characteristicList(request, limit, offset, q);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PaginatedCharacteristicSummaryList characteristicList(Http.Request request, Integer limit, Integer offset, String q) throws Exception;

    public Result characteristicRetrieveHttp(Http.Request request, String id) throws Exception {
        CharacteristicDetail obj = characteristicRetrieve(request, id);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CharacteristicDetail characteristicRetrieve(Http.Request request, String id) throws Exception;

    public Result eggGroupListHttp(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        PaginatedEggGroupSummaryList obj = eggGroupList(request, limit, offset, q);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PaginatedEggGroupSummaryList eggGroupList(Http.Request request, Integer limit, Integer offset, String q) throws Exception;

    public Result eggGroupRetrieveHttp(Http.Request request, String id) throws Exception {
        EggGroupDetail obj = eggGroupRetrieve(request, id);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EggGroupDetail eggGroupRetrieve(Http.Request request, String id) throws Exception;

    public Result genderListHttp(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        PaginatedGenderSummaryList obj = genderList(request, limit, offset, q);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PaginatedGenderSummaryList genderList(Http.Request request, Integer limit, Integer offset, String q) throws Exception;

    public Result genderRetrieveHttp(Http.Request request, String id) throws Exception {
        GenderDetail obj = genderRetrieve(request, id);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GenderDetail genderRetrieve(Http.Request request, String id) throws Exception;

    public Result growthRateListHttp(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        PaginatedGrowthRateSummaryList obj = growthRateList(request, limit, offset, q);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PaginatedGrowthRateSummaryList growthRateList(Http.Request request, Integer limit, Integer offset, String q) throws Exception;

    public Result growthRateRetrieveHttp(Http.Request request, String id) throws Exception {
        GrowthRateDetail obj = growthRateRetrieve(request, id);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GrowthRateDetail growthRateRetrieve(Http.Request request, String id) throws Exception;

    public Result moveDamageClassListHttp(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        PaginatedMoveDamageClassSummaryList obj = moveDamageClassList(request, limit, offset, q);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PaginatedMoveDamageClassSummaryList moveDamageClassList(Http.Request request, Integer limit, Integer offset, String q) throws Exception;

    public Result moveDamageClassRetrieveHttp(Http.Request request, String id) throws Exception {
        MoveDamageClassDetail obj = moveDamageClassRetrieve(request, id);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract MoveDamageClassDetail moveDamageClassRetrieve(Http.Request request, String id) throws Exception;

    public Result natureListHttp(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        PaginatedNatureSummaryList obj = natureList(request, limit, offset, q);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PaginatedNatureSummaryList natureList(Http.Request request, Integer limit, Integer offset, String q) throws Exception;

    public Result natureRetrieveHttp(Http.Request request, String id) throws Exception {
        NatureDetail obj = natureRetrieve(request, id);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract NatureDetail natureRetrieve(Http.Request request, String id) throws Exception;

    public Result pokeathlonStatListHttp(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        PaginatedPokeathlonStatSummaryList obj = pokeathlonStatList(request, limit, offset, q);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PaginatedPokeathlonStatSummaryList pokeathlonStatList(Http.Request request, Integer limit, Integer offset, String q) throws Exception;

    public Result pokeathlonStatRetrieveHttp(Http.Request request, String id) throws Exception {
        PokeathlonStatDetail obj = pokeathlonStatRetrieve(request, id);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PokeathlonStatDetail pokeathlonStatRetrieve(Http.Request request, String id) throws Exception;

    public Result pokemonColorListHttp(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        PaginatedPokemonColorSummaryList obj = pokemonColorList(request, limit, offset, q);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PaginatedPokemonColorSummaryList pokemonColorList(Http.Request request, Integer limit, Integer offset, String q) throws Exception;

    public Result pokemonColorRetrieveHttp(Http.Request request, String id) throws Exception {
        PokemonColorDetail obj = pokemonColorRetrieve(request, id);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PokemonColorDetail pokemonColorRetrieve(Http.Request request, String id) throws Exception;

    public Result pokemonFormListHttp(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        PaginatedPokemonFormSummaryList obj = pokemonFormList(request, limit, offset, q);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PaginatedPokemonFormSummaryList pokemonFormList(Http.Request request, Integer limit, Integer offset, String q) throws Exception;

    public Result pokemonFormRetrieveHttp(Http.Request request, String id) throws Exception {
        PokemonFormDetail obj = pokemonFormRetrieve(request, id);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PokemonFormDetail pokemonFormRetrieve(Http.Request request, String id) throws Exception;

    public Result pokemonHabitatListHttp(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        PaginatedPokemonHabitatSummaryList obj = pokemonHabitatList(request, limit, offset, q);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PaginatedPokemonHabitatSummaryList pokemonHabitatList(Http.Request request, Integer limit, Integer offset, String q) throws Exception;

    public Result pokemonHabitatRetrieveHttp(Http.Request request, String id) throws Exception {
        PokemonHabitatDetail obj = pokemonHabitatRetrieve(request, id);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PokemonHabitatDetail pokemonHabitatRetrieve(Http.Request request, String id) throws Exception;

    public Result pokemonListHttp(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        PaginatedPokemonSummaryList obj = pokemonList(request, limit, offset, q);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PaginatedPokemonSummaryList pokemonList(Http.Request request, Integer limit, Integer offset, String q) throws Exception;

    public Result pokemonRetrieveHttp(Http.Request request, String id) throws Exception {
        PokemonDetail obj = pokemonRetrieve(request, id);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PokemonDetail pokemonRetrieve(Http.Request request, String id) throws Exception;

    public Result pokemonShapeListHttp(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        PaginatedPokemonShapeSummaryList obj = pokemonShapeList(request, limit, offset, q);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PaginatedPokemonShapeSummaryList pokemonShapeList(Http.Request request, Integer limit, Integer offset, String q) throws Exception;

    public Result pokemonShapeRetrieveHttp(Http.Request request, String id) throws Exception {
        PokemonShapeDetail obj = pokemonShapeRetrieve(request, id);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PokemonShapeDetail pokemonShapeRetrieve(Http.Request request, String id) throws Exception;

    public Result pokemonSpeciesListHttp(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        PaginatedPokemonSpeciesSummaryList obj = pokemonSpeciesList(request, limit, offset, q);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PaginatedPokemonSpeciesSummaryList pokemonSpeciesList(Http.Request request, Integer limit, Integer offset, String q) throws Exception;

    public Result pokemonSpeciesRetrieveHttp(Http.Request request, String id) throws Exception {
        PokemonSpeciesDetail obj = pokemonSpeciesRetrieve(request, id);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PokemonSpeciesDetail pokemonSpeciesRetrieve(Http.Request request, String id) throws Exception;

    public Result statListHttp(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        PaginatedStatSummaryList obj = statList(request, limit, offset, q);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PaginatedStatSummaryList statList(Http.Request request, Integer limit, Integer offset, String q) throws Exception;

    public Result statRetrieveHttp(Http.Request request, String id) throws Exception {
        StatDetail obj = statRetrieve(request, id);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract StatDetail statRetrieve(Http.Request request, String id) throws Exception;

    public Result typeListHttp(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        PaginatedTypeSummaryList obj = typeList(request, limit, offset, q);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PaginatedTypeSummaryList typeList(Http.Request request, Integer limit, Integer offset, String q) throws Exception;

    public Result typeRetrieveHttp(Http.Request request, String id) throws Exception {
        TypeDetail obj = typeRetrieve(request, id);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract TypeDetail typeRetrieve(Http.Request request, String id) throws Exception;

}
