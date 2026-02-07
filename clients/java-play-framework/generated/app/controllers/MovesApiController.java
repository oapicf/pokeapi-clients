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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-07T04:17:12.303882205Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MovesApiController extends Controller {
    private final MovesApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private MovesApiController(Config configuration, MovesApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result moveAilmentList(Http.Request request) throws Exception {
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
        return imp.moveAilmentListHttp(request, limit, offset, q);
    }

    @ApiAction
    public Result moveAilmentRetrieve(Http.Request request, String id) throws Exception {
        return imp.moveAilmentRetrieveHttp(request, id);
    }

    @ApiAction
    public Result moveBattleStyleList(Http.Request request) throws Exception {
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
        return imp.moveBattleStyleListHttp(request, limit, offset, q);
    }

    @ApiAction
    public Result moveBattleStyleRetrieve(Http.Request request, String id) throws Exception {
        return imp.moveBattleStyleRetrieveHttp(request, id);
    }

    @ApiAction
    public Result moveCategoryList(Http.Request request) throws Exception {
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
        return imp.moveCategoryListHttp(request, limit, offset, q);
    }

    @ApiAction
    public Result moveCategoryRetrieve(Http.Request request, String id) throws Exception {
        return imp.moveCategoryRetrieveHttp(request, id);
    }

    @ApiAction
    public Result moveLearnMethodList(Http.Request request) throws Exception {
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
        return imp.moveLearnMethodListHttp(request, limit, offset, q);
    }

    @ApiAction
    public Result moveLearnMethodRetrieve(Http.Request request, String id) throws Exception {
        return imp.moveLearnMethodRetrieveHttp(request, id);
    }

    @ApiAction
    public Result moveList(Http.Request request) throws Exception {
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
        return imp.moveListHttp(request, limit, offset, q);
    }

    @ApiAction
    public Result moveRetrieve(Http.Request request, String id) throws Exception {
        return imp.moveRetrieveHttp(request, id);
    }

    @ApiAction
    public Result moveTargetList(Http.Request request) throws Exception {
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
        return imp.moveTargetListHttp(request, limit, offset, q);
    }

    @ApiAction
    public Result moveTargetRetrieve(Http.Request request, String id) throws Exception {
        return imp.moveTargetRetrieveHttp(request, id);
    }

}
