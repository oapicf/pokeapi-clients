package controllers;

import apimodels.GenerationDetail;
import apimodels.PaginatedGenerationSummaryList;
import apimodels.PaginatedPokedexSummaryList;
import apimodels.PaginatedVersionGroupSummaryList;
import apimodels.PaginatedVersionSummaryList;
import apimodels.PokedexDetail;
import apimodels.VersionDetail;
import apimodels.VersionGroupDetail;

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
public class GamesApiController extends Controller {
    private final GamesApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private GamesApiController(Config configuration, GamesApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result generationList(Http.Request request) throws Exception {
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
        return imp.generationListHttp(request, limit, offset, q);
    }

    @ApiAction
    public Result generationRetrieve(Http.Request request, String id) throws Exception {
        return imp.generationRetrieveHttp(request, id);
    }

    @ApiAction
    public Result pokedexList(Http.Request request) throws Exception {
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
        return imp.pokedexListHttp(request, limit, offset, q);
    }

    @ApiAction
    public Result pokedexRetrieve(Http.Request request, String id) throws Exception {
        return imp.pokedexRetrieveHttp(request, id);
    }

    @ApiAction
    public Result versionGroupList(Http.Request request) throws Exception {
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
        return imp.versionGroupListHttp(request, limit, offset, q);
    }

    @ApiAction
    public Result versionGroupRetrieve(Http.Request request, String id) throws Exception {
        return imp.versionGroupRetrieveHttp(request, id);
    }

    @ApiAction
    public Result versionList(Http.Request request) throws Exception {
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
        return imp.versionListHttp(request, limit, offset, q);
    }

    @ApiAction
    public Result versionRetrieve(Http.Request request, String id) throws Exception {
        return imp.versionRetrieveHttp(request, id);
    }

}
