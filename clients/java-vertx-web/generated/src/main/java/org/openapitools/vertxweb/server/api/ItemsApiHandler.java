package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ItemAttributeDetail;
import org.openapitools.vertxweb.server.model.ItemCategoryDetail;
import org.openapitools.vertxweb.server.model.ItemDetail;
import org.openapitools.vertxweb.server.model.ItemFlingEffectDetail;
import org.openapitools.vertxweb.server.model.ItemPocketDetail;
import org.openapitools.vertxweb.server.model.PaginatedItemAttributeSummaryList;
import org.openapitools.vertxweb.server.model.PaginatedItemCategorySummaryList;
import org.openapitools.vertxweb.server.model.PaginatedItemFlingEffectSummaryList;
import org.openapitools.vertxweb.server.model.PaginatedItemPocketSummaryList;
import org.openapitools.vertxweb.server.model.PaginatedItemSummaryList;

import com.fasterxml.jackson.core.type.TypeReference;
import io.vertx.core.json.jackson.DatabindCodec;
import io.vertx.ext.web.openapi.RouterBuilder;
import io.vertx.ext.web.validation.RequestParameters;
import io.vertx.ext.web.validation.RequestParameter;
import io.vertx.ext.web.validation.ValidationHandler;
import io.vertx.ext.web.RoutingContext;
import io.vertx.core.json.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

public class ItemsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(ItemsApiHandler.class);

    private final ItemsApi api;

    public ItemsApiHandler(ItemsApi api) {
        this.api = api;
    }

    @Deprecated
    public ItemsApiHandler() {
        this(new ItemsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("itemAttributeList").handler(this::itemAttributeList);
        builder.operation("itemAttributeRetrieve").handler(this::itemAttributeRetrieve);
        builder.operation("itemCategoryList").handler(this::itemCategoryList);
        builder.operation("itemCategoryRetrieve").handler(this::itemCategoryRetrieve);
        builder.operation("itemFlingEffectList").handler(this::itemFlingEffectList);
        builder.operation("itemFlingEffectRetrieve").handler(this::itemFlingEffectRetrieve);
        builder.operation("itemList").handler(this::itemList);
        builder.operation("itemPocketList").handler(this::itemPocketList);
        builder.operation("itemPocketRetrieve").handler(this::itemPocketRetrieve);
        builder.operation("itemRetrieve").handler(this::itemRetrieve);
    }

    private void itemAttributeList(RoutingContext routingContext) {
        logger.info("itemAttributeList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;
        Integer offset = requestParameters.queryParameter("offset") != null ? requestParameters.queryParameter("offset").getInteger() : null;
        String q = requestParameters.queryParameter("q") != null ? requestParameters.queryParameter("q").getString() : null;

        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter offset is {}", offset);
        logger.debug("Parameter q is {}", q);

        api.itemAttributeList(limit, offset, q)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void itemAttributeRetrieve(RoutingContext routingContext) {
        logger.info("itemAttributeRetrieve()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String id = requestParameters.pathParameter("id") != null ? requestParameters.pathParameter("id").getString() : null;

        logger.debug("Parameter id is {}", id);

        api.itemAttributeRetrieve(id)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void itemCategoryList(RoutingContext routingContext) {
        logger.info("itemCategoryList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;
        Integer offset = requestParameters.queryParameter("offset") != null ? requestParameters.queryParameter("offset").getInteger() : null;
        String q = requestParameters.queryParameter("q") != null ? requestParameters.queryParameter("q").getString() : null;

        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter offset is {}", offset);
        logger.debug("Parameter q is {}", q);

        api.itemCategoryList(limit, offset, q)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void itemCategoryRetrieve(RoutingContext routingContext) {
        logger.info("itemCategoryRetrieve()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String id = requestParameters.pathParameter("id") != null ? requestParameters.pathParameter("id").getString() : null;

        logger.debug("Parameter id is {}", id);

        api.itemCategoryRetrieve(id)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void itemFlingEffectList(RoutingContext routingContext) {
        logger.info("itemFlingEffectList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;
        Integer offset = requestParameters.queryParameter("offset") != null ? requestParameters.queryParameter("offset").getInteger() : null;
        String q = requestParameters.queryParameter("q") != null ? requestParameters.queryParameter("q").getString() : null;

        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter offset is {}", offset);
        logger.debug("Parameter q is {}", q);

        api.itemFlingEffectList(limit, offset, q)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void itemFlingEffectRetrieve(RoutingContext routingContext) {
        logger.info("itemFlingEffectRetrieve()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String id = requestParameters.pathParameter("id") != null ? requestParameters.pathParameter("id").getString() : null;

        logger.debug("Parameter id is {}", id);

        api.itemFlingEffectRetrieve(id)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void itemList(RoutingContext routingContext) {
        logger.info("itemList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;
        Integer offset = requestParameters.queryParameter("offset") != null ? requestParameters.queryParameter("offset").getInteger() : null;
        String q = requestParameters.queryParameter("q") != null ? requestParameters.queryParameter("q").getString() : null;

        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter offset is {}", offset);
        logger.debug("Parameter q is {}", q);

        api.itemList(limit, offset, q)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void itemPocketList(RoutingContext routingContext) {
        logger.info("itemPocketList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;
        Integer offset = requestParameters.queryParameter("offset") != null ? requestParameters.queryParameter("offset").getInteger() : null;
        String q = requestParameters.queryParameter("q") != null ? requestParameters.queryParameter("q").getString() : null;

        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter offset is {}", offset);
        logger.debug("Parameter q is {}", q);

        api.itemPocketList(limit, offset, q)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void itemPocketRetrieve(RoutingContext routingContext) {
        logger.info("itemPocketRetrieve()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String id = requestParameters.pathParameter("id") != null ? requestParameters.pathParameter("id").getString() : null;

        logger.debug("Parameter id is {}", id);

        api.itemPocketRetrieve(id)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void itemRetrieve(RoutingContext routingContext) {
        logger.info("itemRetrieve()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String id = requestParameters.pathParameter("id") != null ? requestParameters.pathParameter("id").getString() : null;

        logger.debug("Parameter id is {}", id);

        api.itemRetrieve(id)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

}
