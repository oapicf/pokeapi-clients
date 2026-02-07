package controllers;

import apimodels.GenerationDetail;
import apimodels.PaginatedGenerationSummaryList;
import apimodels.PaginatedPokedexSummaryList;
import apimodels.PaginatedVersionGroupSummaryList;
import apimodels.PaginatedVersionSummaryList;
import apimodels.PokedexDetail;
import apimodels.VersionDetail;
import apimodels.VersionGroupDetail;

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
public abstract class GamesApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result generationListHttp(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        PaginatedGenerationSummaryList obj = generationList(request, limit, offset, q);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PaginatedGenerationSummaryList generationList(Http.Request request, Integer limit, Integer offset, String q) throws Exception;

    public Result generationRetrieveHttp(Http.Request request, String id) throws Exception {
        GenerationDetail obj = generationRetrieve(request, id);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract GenerationDetail generationRetrieve(Http.Request request, String id) throws Exception;

    public Result pokedexListHttp(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        PaginatedPokedexSummaryList obj = pokedexList(request, limit, offset, q);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PaginatedPokedexSummaryList pokedexList(Http.Request request, Integer limit, Integer offset, String q) throws Exception;

    public Result pokedexRetrieveHttp(Http.Request request, String id) throws Exception {
        PokedexDetail obj = pokedexRetrieve(request, id);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PokedexDetail pokedexRetrieve(Http.Request request, String id) throws Exception;

    public Result versionGroupListHttp(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        PaginatedVersionGroupSummaryList obj = versionGroupList(request, limit, offset, q);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PaginatedVersionGroupSummaryList versionGroupList(Http.Request request, Integer limit, Integer offset, String q) throws Exception;

    public Result versionGroupRetrieveHttp(Http.Request request, String id) throws Exception {
        VersionGroupDetail obj = versionGroupRetrieve(request, id);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract VersionGroupDetail versionGroupRetrieve(Http.Request request, String id) throws Exception;

    public Result versionListHttp(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        PaginatedVersionSummaryList obj = versionList(request, limit, offset, q);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PaginatedVersionSummaryList versionList(Http.Request request, Integer limit, Integer offset, String q) throws Exception;

    public Result versionRetrieveHttp(Http.Request request, String id) throws Exception {
        VersionDetail obj = versionRetrieve(request, id);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract VersionDetail versionRetrieve(Http.Request request, String id) throws Exception;

}
