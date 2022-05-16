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

public class BerryFirmnessApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(BerryFirmnessApiHandler.class);

    private final BerryFirmnessApi api;

    public BerryFirmnessApiHandler(BerryFirmnessApi api) {
        this.api = api;
    }

    @Deprecated
    public BerryFirmnessApiHandler() {
        this(new BerryFirmnessApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("berryFirmnessList").handler(this::berryFirmnessList);
        builder.operation("berryFirmnessRead").handler(this::berryFirmnessRead);
    }

    private void berryFirmnessList(RoutingContext routingContext) {
        logger.info("berryFirmnessList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;
        Integer offset = requestParameters.queryParameter("offset") != null ? requestParameters.queryParameter("offset").getInteger() : null;

        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter offset is {}", offset);

        api.berryFirmnessList(limit, offset)
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

    private void berryFirmnessRead(RoutingContext routingContext) {
        logger.info("berryFirmnessRead()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer id = requestParameters.pathParameter("id") != null ? requestParameters.pathParameter("id").getInteger() : null;

        logger.debug("Parameter id is {}", id);

        api.berryFirmnessRead(id)
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
