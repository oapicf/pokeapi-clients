package org.openapitools.vertxweb.server.api;


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

public class GrowthRateApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(GrowthRateApiHandler.class);

    private final GrowthRateApi api;

    public GrowthRateApiHandler(GrowthRateApi api) {
        this.api = api;
    }

    @Deprecated
    public GrowthRateApiHandler() {
        this(new GrowthRateApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("growthRateList").handler(this::growthRateList);
        builder.operation("growthRateRead").handler(this::growthRateRead);
    }

    private void growthRateList(RoutingContext routingContext) {
        logger.info("growthRateList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;
        Integer offset = requestParameters.queryParameter("offset") != null ? requestParameters.queryParameter("offset").getInteger() : null;

        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter offset is {}", offset);

        api.growthRateList(limit, offset)
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

    private void growthRateRead(RoutingContext routingContext) {
        logger.info("growthRateRead()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer id = requestParameters.pathParameter("id") != null ? requestParameters.pathParameter("id").getInteger() : null;

        logger.debug("Parameter id is {}", id);

        api.growthRateRead(id)
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
