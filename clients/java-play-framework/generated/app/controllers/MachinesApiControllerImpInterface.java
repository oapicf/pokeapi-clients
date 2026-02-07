package controllers;

import apimodels.MachineDetail;
import apimodels.PaginatedMachineSummaryList;

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
public abstract class MachinesApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result machineListHttp(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        PaginatedMachineSummaryList obj = machineList(request, limit, offset, q);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PaginatedMachineSummaryList machineList(Http.Request request, Integer limit, Integer offset, String q) throws Exception;

    public Result machineRetrieveHttp(Http.Request request, String id) throws Exception {
        MachineDetail obj = machineRetrieve(request, id);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract MachineDetail machineRetrieve(Http.Request request, String id) throws Exception;

}
