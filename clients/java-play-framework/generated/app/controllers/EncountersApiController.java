package controllers;

import apimodels.EncounterConditionDetail;
import apimodels.EncounterConditionValueDetail;
import apimodels.EncounterMethodDetail;
import apimodels.PaginatedEncounterConditionSummaryList;
import apimodels.PaginatedEncounterConditionValueSummaryList;
import apimodels.PaginatedEncounterMethodSummaryList;

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
public class EncountersApiController extends Controller {
    private final EncountersApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private EncountersApiController(Config configuration, EncountersApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result encounterConditionList(Http.Request request) throws Exception {
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
        return imp.encounterConditionListHttp(request, limit, offset, q);
    }

    @ApiAction
    public Result encounterConditionRetrieve(Http.Request request, String id) throws Exception {
        return imp.encounterConditionRetrieveHttp(request, id);
    }

    @ApiAction
    public Result encounterConditionValueList(Http.Request request) throws Exception {
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
        return imp.encounterConditionValueListHttp(request, limit, offset, q);
    }

    @ApiAction
    public Result encounterConditionValueRetrieve(Http.Request request, String id) throws Exception {
        return imp.encounterConditionValueRetrieveHttp(request, id);
    }

    @ApiAction
    public Result encounterMethodList(Http.Request request) throws Exception {
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
        return imp.encounterMethodListHttp(request, limit, offset, q);
    }

    @ApiAction
    public Result encounterMethodRetrieve(Http.Request request, String id) throws Exception {
        return imp.encounterMethodRetrieveHttp(request, id);
    }

}
