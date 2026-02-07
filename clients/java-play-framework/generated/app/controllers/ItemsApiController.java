package controllers;

import apimodels.ItemAttributeDetail;
import apimodels.ItemCategoryDetail;
import apimodels.ItemDetail;
import apimodels.ItemFlingEffectDetail;
import apimodels.ItemPocketDetail;
import apimodels.PaginatedItemAttributeSummaryList;
import apimodels.PaginatedItemCategorySummaryList;
import apimodels.PaginatedItemFlingEffectSummaryList;
import apimodels.PaginatedItemPocketSummaryList;
import apimodels.PaginatedItemSummaryList;

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
public class ItemsApiController extends Controller {
    private final ItemsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private ItemsApiController(Config configuration, ItemsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result itemAttributeList(Http.Request request) throws Exception {
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
        return imp.itemAttributeListHttp(request, limit, offset, q);
    }

    @ApiAction
    public Result itemAttributeRetrieve(Http.Request request, String id) throws Exception {
        return imp.itemAttributeRetrieveHttp(request, id);
    }

    @ApiAction
    public Result itemCategoryList(Http.Request request) throws Exception {
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
        return imp.itemCategoryListHttp(request, limit, offset, q);
    }

    @ApiAction
    public Result itemCategoryRetrieve(Http.Request request, String id) throws Exception {
        return imp.itemCategoryRetrieveHttp(request, id);
    }

    @ApiAction
    public Result itemFlingEffectList(Http.Request request) throws Exception {
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
        return imp.itemFlingEffectListHttp(request, limit, offset, q);
    }

    @ApiAction
    public Result itemFlingEffectRetrieve(Http.Request request, String id) throws Exception {
        return imp.itemFlingEffectRetrieveHttp(request, id);
    }

    @ApiAction
    public Result itemList(Http.Request request) throws Exception {
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
        return imp.itemListHttp(request, limit, offset, q);
    }

    @ApiAction
    public Result itemPocketList(Http.Request request) throws Exception {
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
        return imp.itemPocketListHttp(request, limit, offset, q);
    }

    @ApiAction
    public Result itemPocketRetrieve(Http.Request request, String id) throws Exception {
        return imp.itemPocketRetrieveHttp(request, id);
    }

    @ApiAction
    public Result itemRetrieve(Http.Request request, String id) throws Exception {
        return imp.itemRetrieveHttp(request, id);
    }

}
