package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.LocationAreaDetail;
import org.openapitools.vertxweb.server.model.LocationDetail;
import org.openapitools.vertxweb.server.model.PaginatedLocationAreaSummaryList;
import org.openapitools.vertxweb.server.model.PaginatedLocationSummaryList;
import org.openapitools.vertxweb.server.model.PaginatedPalParkAreaSummaryList;
import org.openapitools.vertxweb.server.model.PaginatedRegionSummaryList;
import org.openapitools.vertxweb.server.model.PalParkAreaDetail;
import org.openapitools.vertxweb.server.model.RegionDetail;

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

public class LocationApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(LocationApiHandler.class);

    private final LocationApi api;

    public LocationApiHandler(LocationApi api) {
        this.api = api;
    }

    @Deprecated
    public LocationApiHandler() {
        this(new LocationApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("locationAreaList").handler(this::locationAreaList);
        builder.operation("locationAreaRetrieve").handler(this::locationAreaRetrieve);
        builder.operation("locationList").handler(this::locationList);
        builder.operation("locationRetrieve").handler(this::locationRetrieve);
        builder.operation("palParkAreaList").handler(this::palParkAreaList);
        builder.operation("palParkAreaRetrieve").handler(this::palParkAreaRetrieve);
        builder.operation("regionList").handler(this::regionList);
        builder.operation("regionRetrieve").handler(this::regionRetrieve);
    }

    private void locationAreaList(RoutingContext routingContext) {
        logger.info("locationAreaList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;
        Integer offset = requestParameters.queryParameter("offset") != null ? requestParameters.queryParameter("offset").getInteger() : null;

        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter offset is {}", offset);

        api.locationAreaList(limit, offset)
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

    private void locationAreaRetrieve(RoutingContext routingContext) {
        logger.info("locationAreaRetrieve()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer id = requestParameters.pathParameter("id") != null ? requestParameters.pathParameter("id").getInteger() : null;

        logger.debug("Parameter id is {}", id);

        api.locationAreaRetrieve(id)
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

    private void locationList(RoutingContext routingContext) {
        logger.info("locationList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;
        Integer offset = requestParameters.queryParameter("offset") != null ? requestParameters.queryParameter("offset").getInteger() : null;
        String q = requestParameters.queryParameter("q") != null ? requestParameters.queryParameter("q").getString() : null;

        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter offset is {}", offset);
        logger.debug("Parameter q is {}", q);

        api.locationList(limit, offset, q)
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

    private void locationRetrieve(RoutingContext routingContext) {
        logger.info("locationRetrieve()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String id = requestParameters.pathParameter("id") != null ? requestParameters.pathParameter("id").getString() : null;

        logger.debug("Parameter id is {}", id);

        api.locationRetrieve(id)
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

    private void palParkAreaList(RoutingContext routingContext) {
        logger.info("palParkAreaList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;
        Integer offset = requestParameters.queryParameter("offset") != null ? requestParameters.queryParameter("offset").getInteger() : null;
        String q = requestParameters.queryParameter("q") != null ? requestParameters.queryParameter("q").getString() : null;

        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter offset is {}", offset);
        logger.debug("Parameter q is {}", q);

        api.palParkAreaList(limit, offset, q)
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

    private void palParkAreaRetrieve(RoutingContext routingContext) {
        logger.info("palParkAreaRetrieve()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String id = requestParameters.pathParameter("id") != null ? requestParameters.pathParameter("id").getString() : null;

        logger.debug("Parameter id is {}", id);

        api.palParkAreaRetrieve(id)
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

    private void regionList(RoutingContext routingContext) {
        logger.info("regionList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;
        Integer offset = requestParameters.queryParameter("offset") != null ? requestParameters.queryParameter("offset").getInteger() : null;
        String q = requestParameters.queryParameter("q") != null ? requestParameters.queryParameter("q").getString() : null;

        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter offset is {}", offset);
        logger.debug("Parameter q is {}", q);

        api.regionList(limit, offset, q)
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

    private void regionRetrieve(RoutingContext routingContext) {
        logger.info("regionRetrieve()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String id = requestParameters.pathParameter("id") != null ? requestParameters.pathParameter("id").getString() : null;

        logger.debug("Parameter id is {}", id);

        api.regionRetrieve(id)
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
