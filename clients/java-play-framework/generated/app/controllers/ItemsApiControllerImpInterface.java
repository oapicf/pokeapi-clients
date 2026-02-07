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
public abstract class ItemsApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result itemAttributeListHttp(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        PaginatedItemAttributeSummaryList obj = itemAttributeList(request, limit, offset, q);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PaginatedItemAttributeSummaryList itemAttributeList(Http.Request request, Integer limit, Integer offset, String q) throws Exception;

    public Result itemAttributeRetrieveHttp(Http.Request request, String id) throws Exception {
        ItemAttributeDetail obj = itemAttributeRetrieve(request, id);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ItemAttributeDetail itemAttributeRetrieve(Http.Request request, String id) throws Exception;

    public Result itemCategoryListHttp(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        PaginatedItemCategorySummaryList obj = itemCategoryList(request, limit, offset, q);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PaginatedItemCategorySummaryList itemCategoryList(Http.Request request, Integer limit, Integer offset, String q) throws Exception;

    public Result itemCategoryRetrieveHttp(Http.Request request, String id) throws Exception {
        ItemCategoryDetail obj = itemCategoryRetrieve(request, id);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ItemCategoryDetail itemCategoryRetrieve(Http.Request request, String id) throws Exception;

    public Result itemFlingEffectListHttp(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        PaginatedItemFlingEffectSummaryList obj = itemFlingEffectList(request, limit, offset, q);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PaginatedItemFlingEffectSummaryList itemFlingEffectList(Http.Request request, Integer limit, Integer offset, String q) throws Exception;

    public Result itemFlingEffectRetrieveHttp(Http.Request request, String id) throws Exception {
        ItemFlingEffectDetail obj = itemFlingEffectRetrieve(request, id);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ItemFlingEffectDetail itemFlingEffectRetrieve(Http.Request request, String id) throws Exception;

    public Result itemListHttp(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        PaginatedItemSummaryList obj = itemList(request, limit, offset, q);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PaginatedItemSummaryList itemList(Http.Request request, Integer limit, Integer offset, String q) throws Exception;

    public Result itemPocketListHttp(Http.Request request, Integer limit, Integer offset, String q) throws Exception {
        PaginatedItemPocketSummaryList obj = itemPocketList(request, limit, offset, q);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract PaginatedItemPocketSummaryList itemPocketList(Http.Request request, Integer limit, Integer offset, String q) throws Exception;

    public Result itemPocketRetrieveHttp(Http.Request request, String id) throws Exception {
        ItemPocketDetail obj = itemPocketRetrieve(request, id);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ItemPocketDetail itemPocketRetrieve(Http.Request request, String id) throws Exception;

    public Result itemRetrieveHttp(Http.Request request, String id) throws Exception {
        ItemDetail obj = itemRetrieve(request, id);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ItemDetail itemRetrieve(Http.Request request, String id) throws Exception;

}
