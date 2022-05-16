package controllers;


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

@SuppressWarnings("RedundantThrows")
public abstract class EncounterMethodApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result encounterMethodListHttp(Http.Request request, Integer limit, Integer offset) throws Exception {
        String obj = encounterMethodList(request, limit, offset);
        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract String encounterMethodList(Http.Request request, Integer limit, Integer offset) throws Exception;

    public Result encounterMethodReadHttp(Http.Request request, Integer id) throws Exception {
        String obj = encounterMethodRead(request, id);
        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract String encounterMethodRead(Http.Request request, Integer id) throws Exception;

}
