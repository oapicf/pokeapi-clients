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
public abstract class EvolutionTriggerApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result evolutionTriggerListHttp(Http.Request request, Integer limit, Integer offset) throws Exception {
        String obj = evolutionTriggerList(request, limit, offset);
        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract String evolutionTriggerList(Http.Request request, Integer limit, Integer offset) throws Exception;

    public Result evolutionTriggerReadHttp(Http.Request request, Integer id) throws Exception {
        String obj = evolutionTriggerRead(request, id);
        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract String evolutionTriggerRead(Http.Request request, Integer id) throws Exception;

}
