package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.LanguageDetail;
import org.openapitools.vertxweb.server.model.PaginatedLanguageSummaryList;

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

public class UtilityApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(UtilityApiHandler.class);

    private final UtilityApi api;

    public UtilityApiHandler(UtilityApi api) {
        this.api = api;
    }

    @Deprecated
    public UtilityApiHandler() {
        this(new UtilityApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("languageList").handler(this::languageList);
        builder.operation("languageRetrieve").handler(this::languageRetrieve);
    }

    private void languageList(RoutingContext routingContext) {
        logger.info("languageList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;
        Integer offset = requestParameters.queryParameter("offset") != null ? requestParameters.queryParameter("offset").getInteger() : null;
        String q = requestParameters.queryParameter("q") != null ? requestParameters.queryParameter("q").getString() : null;

        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter offset is {}", offset);
        logger.debug("Parameter q is {}", q);

        api.languageList(limit, offset, q)
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

    private void languageRetrieve(RoutingContext routingContext) {
        logger.info("languageRetrieve()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String id = requestParameters.pathParameter("id") != null ? requestParameters.pathParameter("id").getString() : null;

        logger.debug("Parameter id is {}", id);

        api.languageRetrieve(id)
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
