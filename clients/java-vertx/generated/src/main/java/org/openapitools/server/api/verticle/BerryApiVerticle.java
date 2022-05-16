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

public class BerryApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(BerryApiVerticle.class);

    static final String BERRY_LIST_SERVICE_ID = "berry_list";
    static final String BERRY_READ_SERVICE_ID = "berry_read";
    
    final BerryApi service;

    public BerryApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.BerryApiImpl");
            service = (BerryApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("BerryApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for berry_list
        vertx.eventBus().<JsonObject> consumer(BERRY_LIST_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "berry_list";
                String limitParam = message.body().getString("limit");
                Integer limit = (limitParam == null) ? null : Json.mapper.readValue(limitParam, Integer.class);
                String offsetParam = message.body().getString("offset");
                Integer offset = (offsetParam == null) ? null : Json.mapper.readValue(offsetParam, Integer.class);
                service.berryList(limit, offset, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "berry_list");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("berry_list", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for berry_read
        vertx.eventBus().<JsonObject> consumer(BERRY_READ_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "berry_read";
                String idParam = message.body().getString("id");
                if(idParam == null) {
                    manageError(message, new MainApiException(400, "id is required"), serviceId);
                    return;
                }
                Integer id = Json.mapper.readValue(idParam, Integer.class);
                service.berryRead(id, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "berry_read");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("berry_read", e);
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
