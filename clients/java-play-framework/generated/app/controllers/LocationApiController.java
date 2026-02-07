package controllers;

import apimodels.LocationAreaDetail;
import apimodels.LocationDetail;
import apimodels.PaginatedLocationAreaSummaryList;
import apimodels.PaginatedLocationSummaryList;
import apimodels.PaginatedPalParkAreaSummaryList;
import apimodels.PaginatedRegionSummaryList;
import apimodels.PalParkAreaDetail;
import apimodels.RegionDetail;

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
public class LocationApiController extends Controller {
    private final LocationApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private LocationApiController(Config configuration, LocationApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result locationAreaList(Http.Request request) throws Exception {
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
        return imp.locationAreaListHttp(request, limit, offset);
    }

    @ApiAction
    public Result locationAreaRetrieve(Http.Request request, Integer id) throws Exception {
        return imp.locationAreaRetrieveHttp(request, id);
    }

    @ApiAction
    public Result locationList(Http.Request request) throws Exception {
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
        return imp.locationListHttp(request, limit, offset, q);
    }

    @ApiAction
    public Result locationRetrieve(Http.Request request, String id) throws Exception {
        return imp.locationRetrieveHttp(request, id);
    }

    @ApiAction
    public Result palParkAreaList(Http.Request request) throws Exception {
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
        return imp.palParkAreaListHttp(request, limit, offset, q);
    }

    @ApiAction
    public Result palParkAreaRetrieve(Http.Request request, String id) throws Exception {
        return imp.palParkAreaRetrieveHttp(request, id);
    }

    @ApiAction
    public Result regionList(Http.Request request) throws Exception {
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
        return imp.regionListHttp(request, limit, offset, q);
    }

    @ApiAction
    public Result regionRetrieve(Http.Request request, String id) throws Exception {
        return imp.regionRetrieveHttp(request, id);
    }

}
