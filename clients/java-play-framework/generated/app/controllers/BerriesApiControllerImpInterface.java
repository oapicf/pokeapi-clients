package controllers;

import apimodels.BerryDetail;
import apimodels.BerryFirmnessDetail;
import apimodels.BerryFlavorDetail;
import apimodels.PaginatedBerryFirmnessSummaryList;
import apimodels.PaginatedBerryFlavorSummaryList;
import apimodels.PaginatedBerrySummaryList;

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
public abstract class BerriesApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result berryFirmnessListHttp(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        PaginatedBerryFirmnessSummaryList obj = berryFirmnessList(request, limit, offset, q);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PaginatedBerryFirmnessSummaryList berryFirmnessList(Http.Request request, Integer limit, Integer offset, String q) throws Exception;

    public Result berryFirmnessRetrieveHttp(Http.Request request, String id) throws Exception {
        BerryFirmnessDetail obj = berryFirmnessRetrieve(request, id);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract BerryFirmnessDetail berryFirmnessRetrieve(Http.Request request, String id) throws Exception;

    public Result berryFlavorListHttp(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        PaginatedBerryFlavorSummaryList obj = berryFlavorList(request, limit, offset, q);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PaginatedBerryFlavorSummaryList berryFlavorList(Http.Request request, Integer limit, Integer offset, String q) throws Exception;

    public Result berryFlavorRetrieveHttp(Http.Request request, String id) throws Exception {
        BerryFlavorDetail obj = berryFlavorRetrieve(request, id);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract BerryFlavorDetail berryFlavorRetrieve(Http.Request request, String id) throws Exception;

    public Result berryListHttp(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        PaginatedBerrySummaryList obj = berryList(request, limit, offset, q);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PaginatedBerrySummaryList berryList(Http.Request request, Integer limit, Integer offset, String q) throws Exception;

    public Result berryRetrieveHttp(Http.Request request, String id) throws Exception {
        BerryDetail obj = berryRetrieve(request, id);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract BerryDetail berryRetrieve(Http.Request request, String id) throws Exception;

}
