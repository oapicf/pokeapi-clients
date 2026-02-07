package controllers;

import apimodels.LocationAreaDetail;
import apimodels.LocationDetail;
import apimodels.PaginatedLocationAreaSummaryList;
import apimodels.PaginatedLocationSummaryList;
import apimodels.PaginatedPalParkAreaSummaryList;
import apimodels.PaginatedRegionSummaryList;
import apimodels.PalParkAreaDetail;
import apimodels.RegionDetail;

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
public abstract class LocationApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result locationAreaListHttp(Http.Request request, Integer limit, Integer offset) throws Exception {
        PaginatedLocationAreaSummaryList obj = locationAreaList(request, limit, offset);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PaginatedLocationAreaSummaryList locationAreaList(Http.Request request, Integer limit, Integer offset) throws Exception;

    public Result locationAreaRetrieveHttp(Http.Request request, Integer id) throws Exception {
        LocationAreaDetail obj = locationAreaRetrieve(request, id);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract LocationAreaDetail locationAreaRetrieve(Http.Request request, Integer id) throws Exception;

    public Result locationListHttp(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        PaginatedLocationSummaryList obj = locationList(request, limit, offset, q);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PaginatedLocationSummaryList locationList(Http.Request request, Integer limit, Integer offset, String q) throws Exception;

    public Result locationRetrieveHttp(Http.Request request, String id) throws Exception {
        LocationDetail obj = locationRetrieve(request, id);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract LocationDetail locationRetrieve(Http.Request request, String id) throws Exception;

    public Result palParkAreaListHttp(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        PaginatedPalParkAreaSummaryList obj = palParkAreaList(request, limit, offset, q);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PaginatedPalParkAreaSummaryList palParkAreaList(Http.Request request, Integer limit, Integer offset, String q) throws Exception;

    public Result palParkAreaRetrieveHttp(Http.Request request, String id) throws Exception {
        PalParkAreaDetail obj = palParkAreaRetrieve(request, id);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PalParkAreaDetail palParkAreaRetrieve(Http.Request request, String id) throws Exception;

    public Result regionListHttp(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        PaginatedRegionSummaryList obj = regionList(request, limit, offset, q);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PaginatedRegionSummaryList regionList(Http.Request request, Integer limit, Integer offset, String q) throws Exception;

    public Result regionRetrieveHttp(Http.Request request, String id) throws Exception {
        RegionDetail obj = regionRetrieve(request, id);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract RegionDetail regionRetrieve(Http.Request request, String id) throws Exception;

}
