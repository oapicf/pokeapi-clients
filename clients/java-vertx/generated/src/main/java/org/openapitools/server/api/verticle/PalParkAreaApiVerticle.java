package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class PalParkAreaApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(PalParkAreaApiVerticle.class);

    static final String PAL-PARK-AREA_LIST_SERVICE_ID = "pal-park-area_list";
    static final String PAL-PARK-AREA_READ_SERVICE_ID = "pal-park-area_read";
    
    final PalParkAreaApi service;

    public PalParkAreaApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.PalParkAreaApiImpl");
            service = (PalParkAreaApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("PalParkAreaApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for pal-park-area_list
        vertx.eventBus().<JsonObject> consumer(PAL-PARK-AREA_LIST_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "pal-park-area_list";
                String limitParam = message.body().getString("limit");
                Integer limit = (limitParam == null) ? null : Json.mapper.readValue(limitParam, Integer.class);
                String offsetParam = message.body().getString("offset");
                Integer offset = (offsetParam == null) ? null : Json.mapper.readValue(offsetParam, Integer.class);
                service.palParkAreaList(limit, offset, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "pal-park-area_list");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("pal-park-area_list", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for pal-park-area_read
        vertx.eventBus().<JsonObject> consumer(PAL-PARK-AREA_READ_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "pal-park-area_read";
                String idParam = message.body().getString("id");
                if(idParam == null) {
                    manageError(message, new MainApiException(400, "id is required"), serviceId);
                    return;
                }
                Integer id = Json.mapper.readValue(idParam, Integer.class);
                service.palParkAreaRead(id, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "pal-park-area_read");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("pal-park-area_read", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
    }

    private void manageError(Message<JsonObject> message, Throwable cause, String serviceName) {
        int code = MainApiException.INTERNAL_SERVER_ERROR.getStatusCode();
        String statusMessage = MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage();
        if (cause instanceof MainApiException) {
            code = ((MainApiException)cause).getStatusCode();
            statusMessage = ((MainApiException)cause).getStatusMessage();
        } else {
            logUnexpectedError(serviceName, cause);
        }

        message.fail(code, statusMessage);
    }

    private void logUnexpectedError(String serviceName, Throwable cause) {
        LOGGER.error("Unexpected error in "+ serviceName, cause);
    }
}
