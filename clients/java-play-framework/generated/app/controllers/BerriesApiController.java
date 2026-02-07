package controllers;

import apimodels.BerryDetail;
import apimodels.BerryFirmnessDetail;
import apimodels.BerryFlavorDetail;
import apimodels.PaginatedBerryFirmnessSummaryList;
import apimodels.PaginatedBerryFlavorSummaryList;
import apimodels.PaginatedBerrySummaryList;

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
public class BerriesApiController extends Controller {
    private final BerriesApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private BerriesApiController(Config configuration, BerriesApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result berryFirmnessList(Http.Request request) throws Exception {
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
        return imp.berryFirmnessListHttp(request, limit, offset, q);
    }

    @ApiAction
    public Result berryFirmnessRetrieve(Http.Request request, String id) throws Exception {
        return imp.berryFirmnessRetrieveHttp(request, id);
    }

    @ApiAction
    public Result berryFlavorList(Http.Request request) throws Exception {
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
        return imp.berryFlavorListHttp(request, limit, offset, q);
    }

    @ApiAction
    public Result berryFlavorRetrieve(Http.Request request, String id) throws Exception {
        return imp.berryFlavorRetrieveHttp(request, id);
    }

    @ApiAction
    public Result berryList(Http.Request request) throws Exception {
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
        return imp.berryListHttp(request, limit, offset, q);
    }

    @ApiAction
    public Result berryRetrieve(Http.Request request, String id) throws Exception {
        return imp.berryRetrieveHttp(request, id);
    }

}
