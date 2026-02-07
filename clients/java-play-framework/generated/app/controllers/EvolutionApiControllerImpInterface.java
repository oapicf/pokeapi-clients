package controllers;

import apimodels.EvolutionChainDetail;
import apimodels.EvolutionTriggerDetail;
import apimodels.PaginatedEvolutionChainSummaryList;
import apimodels.PaginatedEvolutionTriggerSummaryList;

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
public abstract class EvolutionApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result evolutionChainListHttp(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        PaginatedEvolutionChainSummaryList obj = evolutionChainList(request, limit, offset, q);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PaginatedEvolutionChainSummaryList evolutionChainList(Http.Request request, Integer limit, Integer offset, String q) throws Exception;

    public Result evolutionChainRetrieveHttp(Http.Request request, String id) throws Exception {
        EvolutionChainDetail obj = evolutionChainRetrieve(request, id);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EvolutionChainDetail evolutionChainRetrieve(Http.Request request, String id) throws Exception;

    public Result evolutionTriggerListHttp(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        PaginatedEvolutionTriggerSummaryList obj = evolutionTriggerList(request, limit, offset, q);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PaginatedEvolutionTriggerSummaryList evolutionTriggerList(Http.Request request, Integer limit, Integer offset, String q) throws Exception;

    public Result evolutionTriggerRetrieveHttp(Http.Request request, String id) throws Exception {
        EvolutionTriggerDetail obj = evolutionTriggerRetrieve(request, id);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract EvolutionTriggerDetail evolutionTriggerRetrieve(Http.Request request, String id) throws Exception;

}
