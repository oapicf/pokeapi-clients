package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.EncounterConditionDetail;
import org.openapitools.vertxweb.server.model.EncounterConditionValueDetail;
import org.openapitools.vertxweb.server.model.EncounterMethodDetail;
import org.openapitools.vertxweb.server.model.PaginatedEncounterConditionSummaryList;
import org.openapitools.vertxweb.server.model.PaginatedEncounterConditionValueSummaryList;
import org.openapitools.vertxweb.server.model.PaginatedEncounterMethodSummaryList;
import org.openapitools.vertxweb.server.model.PokemonEncountersRetrieve200ResponseInner;

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

public class EncountersApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(EncountersApiHandler.class);

    private final EncountersApi api;

    public EncountersApiHandler(EncountersApi api) {
        this.api = api;
    }

    @Deprecated
    public EncountersApiHandler() {
        this(new EncountersApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("encounterConditionList").handler(this::encounterConditionList);
        builder.operation("encounterConditionRetrieve").handler(this::encounterConditionRetrieve);
        builder.operation("encounterConditionValueList").handler(this::encounterConditionValueList);
        builder.operation("encounterConditionValueRetrieve").handler(this::encounterConditionValueRetrieve);
        builder.operation("encounterMethodList").handler(this::encounterMethodList);
        builder.operation("encounterMethodRetrieve").handler(this::encounterMethodRetrieve);
        builder.operation("pokemonEncountersRetrieve").handler(this::pokemonEncountersRetrieve);
    }

    private void encounterConditionList(RoutingContext routingContext) {
        logger.info("encounterConditionList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;
        Integer offset = requestParameters.queryParameter("offset") != null ? requestParameters.queryParameter("offset").getInteger() : null;
        String q = requestParameters.queryParameter("q") != null ? requestParameters.queryParameter("q").getString() : null;

        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter offset is {}", offset);
        logger.debug("Parameter q is {}", q);

        api.encounterConditionList(limit, offset, q)
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

    private void encounterConditionRetrieve(RoutingContext routingContext) {
        logger.info("encounterConditionRetrieve()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String id = requestParameters.pathParameter("id") != null ? requestParameters.pathParameter("id").getString() : null;

        logger.debug("Parameter id is {}", id);

        api.encounterConditionRetrieve(id)
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

    private void encounterConditionValueList(RoutingContext routingContext) {
        logger.info("encounterConditionValueList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;
        Integer offset = requestParameters.queryParameter("offset") != null ? requestParameters.queryParameter("offset").getInteger() : null;
        String q = requestParameters.queryParameter("q") != null ? requestParameters.queryParameter("q").getString() : null;

        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter offset is {}", offset);
        logger.debug("Parameter q is {}", q);

        api.encounterConditionValueList(limit, offset, q)
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

    private void encounterConditionValueRetrieve(RoutingContext routingContext) {
        logger.info("encounterConditionValueRetrieve()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String id = requestParameters.pathParameter("id") != null ? requestParameters.pathParameter("id").getString() : null;

        logger.debug("Parameter id is {}", id);

        api.encounterConditionValueRetrieve(id)
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

    private void encounterMethodList(RoutingContext routingContext) {
        logger.info("encounterMethodList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;
        Integer offset = requestParameters.queryParameter("offset") != null ? requestParameters.queryParameter("offset").getInteger() : null;
        String q = requestParameters.queryParameter("q") != null ? requestParameters.queryParameter("q").getString() : null;

        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter offset is {}", offset);
        logger.debug("Parameter q is {}", q);

        api.encounterMethodList(limit, offset, q)
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

    private void encounterMethodRetrieve(RoutingContext routingContext) {
        logger.info("encounterMethodRetrieve()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String id = requestParameters.pathParameter("id") != null ? requestParameters.pathParameter("id").getString() : null;

        logger.debug("Parameter id is {}", id);

        api.encounterMethodRetrieve(id)
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

    private void pokemonEncountersRetrieve(RoutingContext routingContext) {
        logger.info("pokemonEncountersRetrieve()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String pokemonId = requestParameters.pathParameter("pokemon_id") != null ? requestParameters.pathParameter("pokemon_id").getString() : null;

        logger.debug("Parameter pokemonId is {}", pokemonId);

        api.pokemonEncountersRetrieve(pokemonId)
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
