package controllers;

import apimodels.ContestEffectDetail;
import apimodels.ContestTypeDetail;
import apimodels.PaginatedContestEffectSummaryList;
import apimodels.PaginatedContestTypeSummaryList;
import apimodels.PaginatedSuperContestEffectSummaryList;
import apimodels.SuperContestEffectDetail;

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
public abstract class ContestsApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result contestEffectListHttp(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        PaginatedContestEffectSummaryList obj = contestEffectList(request, limit, offset, q);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PaginatedContestEffectSummaryList contestEffectList(Http.Request request, Integer limit, Integer offset, String q) throws Exception;

    public Result contestEffectRetrieveHttp(Http.Request request, String id) throws Exception {
        ContestEffectDetail obj = contestEffectRetrieve(request, id);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ContestEffectDetail contestEffectRetrieve(Http.Request request, String id) throws Exception;

    public Result contestTypeListHttp(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        PaginatedContestTypeSummaryList obj = contestTypeList(request, limit, offset, q);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PaginatedContestTypeSummaryList contestTypeList(Http.Request request, Integer limit, Integer offset, String q) throws Exception;

    public Result contestTypeRetrieveHttp(Http.Request request, String id) throws Exception {
        ContestTypeDetail obj = contestTypeRetrieve(request, id);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ContestTypeDetail contestTypeRetrieve(Http.Request request, String id) throws Exception;

    public Result superContestEffectListHttp(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        PaginatedSuperContestEffectSummaryList obj = superContestEffectList(request, limit, offset, q);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PaginatedSuperContestEffectSummaryList superContestEffectList(Http.Request request, Integer limit, Integer offset, String q) throws Exception;

    public Result superContestEffectRetrieveHttp(Http.Request request, String id) throws Exception {
        SuperContestEffectDetail obj = superContestEffectRetrieve(request, id);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract SuperContestEffectDetail superContestEffectRetrieve(Http.Request request, String id) throws Exception;

}
