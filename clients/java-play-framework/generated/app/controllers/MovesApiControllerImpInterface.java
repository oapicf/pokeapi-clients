package controllers;

import apimodels.MoveBattleStyleDetail;
import apimodels.MoveDetail;
import apimodels.MoveLearnMethodDetail;
import apimodels.MoveMetaAilmentDetail;
import apimodels.MoveMetaCategoryDetail;
import apimodels.MoveTargetDetail;
import apimodels.PaginatedMoveBattleStyleSummaryList;
import apimodels.PaginatedMoveLearnMethodSummaryList;
import apimodels.PaginatedMoveMetaAilmentSummaryList;
import apimodels.PaginatedMoveMetaCategorySummaryList;
import apimodels.PaginatedMoveSummaryList;
import apimodels.PaginatedMoveTargetSummaryList;

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
public abstract class MovesApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result moveAilmentListHttp(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        PaginatedMoveMetaAilmentSummaryList obj = moveAilmentList(request, limit, offset, q);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PaginatedMoveMetaAilmentSummaryList moveAilmentList(Http.Request request, Integer limit, Integer offset, String q) throws Exception;

    public Result moveAilmentRetrieveHttp(Http.Request request, String id) throws Exception {
        MoveMetaAilmentDetail obj = moveAilmentRetrieve(request, id);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract MoveMetaAilmentDetail moveAilmentRetrieve(Http.Request request, String id) throws Exception;

    public Result moveBattleStyleListHttp(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        PaginatedMoveBattleStyleSummaryList obj = moveBattleStyleList(request, limit, offset, q);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PaginatedMoveBattleStyleSummaryList moveBattleStyleList(Http.Request request, Integer limit, Integer offset, String q) throws Exception;

    public Result moveBattleStyleRetrieveHttp(Http.Request request, String id) throws Exception {
        MoveBattleStyleDetail obj = moveBattleStyleRetrieve(request, id);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract MoveBattleStyleDetail moveBattleStyleRetrieve(Http.Request request, String id) throws Exception;

    public Result moveCategoryListHttp(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        PaginatedMoveMetaCategorySummaryList obj = moveCategoryList(request, limit, offset, q);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PaginatedMoveMetaCategorySummaryList moveCategoryList(Http.Request request, Integer limit, Integer offset, String q) throws Exception;

    public Result moveCategoryRetrieveHttp(Http.Request request, String id) throws Exception {
        MoveMetaCategoryDetail obj = moveCategoryRetrieve(request, id);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract MoveMetaCategoryDetail moveCategoryRetrieve(Http.Request request, String id) throws Exception;

    public Result moveLearnMethodListHttp(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        PaginatedMoveLearnMethodSummaryList obj = moveLearnMethodList(request, limit, offset, q);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PaginatedMoveLearnMethodSummaryList moveLearnMethodList(Http.Request request, Integer limit, Integer offset, String q) throws Exception;

    public Result moveLearnMethodRetrieveHttp(Http.Request request, String id) throws Exception {
        MoveLearnMethodDetail obj = moveLearnMethodRetrieve(request, id);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract MoveLearnMethodDetail moveLearnMethodRetrieve(Http.Request request, String id) throws Exception;

    public Result moveListHttp(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        PaginatedMoveSummaryList obj = moveList(request, limit, offset, q);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PaginatedMoveSummaryList moveList(Http.Request request, Integer limit, Integer offset, String q) throws Exception;

    public Result moveRetrieveHttp(Http.Request request, String id) throws Exception {
        MoveDetail obj = moveRetrieve(request, id);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract MoveDetail moveRetrieve(Http.Request request, String id) throws Exception;

    public Result moveTargetListHttp(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        PaginatedMoveTargetSummaryList obj = moveTargetList(request, limit, offset, q);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PaginatedMoveTargetSummaryList moveTargetList(Http.Request request, Integer limit, Integer offset, String q) throws Exception;

    public Result moveTargetRetrieveHttp(Http.Request request, String id) throws Exception {
        MoveTargetDetail obj = moveTargetRetrieve(request, id);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract MoveTargetDetail moveTargetRetrieve(Http.Request request, String id) throws Exception;

}
