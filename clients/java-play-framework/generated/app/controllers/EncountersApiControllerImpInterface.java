package controllers;

import apimodels.EncounterConditionDetail;
import apimodels.EncounterConditionValueDetail;
import apimodels.EncounterMethodDetail;
import apimodels.PaginatedEncounterConditionSummaryList;
import apimodels.PaginatedEncounterConditionValueSummaryList;
import apimodels.PaginatedEncounterMethodSummaryList;
import apimodels.PokemonEncountersRetrieve200ResponseInner;

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
public abstract class EncountersApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result encounterConditionListHttp(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        PaginatedEncounterConditionSummaryList obj = encounterConditionList(request, limit, offset, q);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PaginatedEncounterConditionSummaryList encounterConditionList(Http.Request request, Integer limit, Integer offset, String q) throws Exception;

    public Result encounterConditionRetrieveHttp(Http.Request request, String id) throws Exception {
        EncounterConditionDetail obj = encounterConditionRetrieve(request, id);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EncounterConditionDetail encounterConditionRetrieve(Http.Request request, String id) throws Exception;

    public Result encounterConditionValueListHttp(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        PaginatedEncounterConditionValueSummaryList obj = encounterConditionValueList(request, limit, offset, q);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PaginatedEncounterConditionValueSummaryList encounterConditionValueList(Http.Request request, Integer limit, Integer offset, String q) throws Exception;

    public Result encounterConditionValueRetrieveHttp(Http.Request request, String id) throws Exception {
        EncounterConditionValueDetail obj = encounterConditionValueRetrieve(request, id);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EncounterConditionValueDetail encounterConditionValueRetrieve(Http.Request request, String id) throws Exception;

    public Result encounterMethodListHttp(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        PaginatedEncounterMethodSummaryList obj = encounterMethodList(request, limit, offset, q);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PaginatedEncounterMethodSummaryList encounterMethodList(Http.Request request, Integer limit, Integer offset, String q) throws Exception;

    public Result encounterMethodRetrieveHttp(Http.Request request, String id) throws Exception {
        EncounterMethodDetail obj = encounterMethodRetrieve(request, id);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EncounterMethodDetail encounterMethodRetrieve(Http.Request request, String id) throws Exception;

    public Result pokemonEncountersRetrieveHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String pokemonId) throws Exception {
        List<PokemonEncountersRetrieve200ResponseInner> obj = pokemonEncountersRetrieve(request, pokemonId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (PokemonEncountersRetrieve200ResponseInner curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<PokemonEncountersRetrieve200ResponseInner> pokemonEncountersRetrieve(Http.Request request,  @Pattern(regexp="^\\d+$")String pokemonId) throws Exception;

}
