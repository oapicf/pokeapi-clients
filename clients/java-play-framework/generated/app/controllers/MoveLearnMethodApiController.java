package controllers;


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
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2022-05-16T10:28:32.229352Z[Etc/UTC]")
public class MoveLearnMethodApiController extends Controller {
    private final MoveLearnMethodApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private MoveLearnMethodApiController(Config configuration, MoveLearnMethodApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
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
        return imp.moveLearnMethodListHttp(request, limit, offset);
    }

    @ApiAction
    public Result moveLearnMethodRead(Http.Request request, Integer id) throws Exception {
        return imp.moveLearnMethodReadHttp(request, id);
    }

}
