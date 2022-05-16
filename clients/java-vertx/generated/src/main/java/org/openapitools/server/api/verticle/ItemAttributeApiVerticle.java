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

public class ItemAttributeApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(ItemAttributeApiVerticle.class);

    static final String ITEM-ATTRIBUTE_LIST_SERVICE_ID = "item-attribute_list";
    static final String ITEM-ATTRIBUTE_READ_SERVICE_ID = "item-attribute_read";
    
    final ItemAttributeApi service;

    public ItemAttributeApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.ItemAttributeApiImpl");
            service = (ItemAttributeApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("ItemAttributeApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for item-attribute_list
        vertx.eventBus().<JsonObject> consumer(ITEM-ATTRIBUTE_LIST_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "item-attribute_list";
                String limitParam = message.body().getString("limit");
                Integer limit = (limitParam == null) ? null : Json.mapper.readValue(limitParam, Integer.class);
                String offsetParam = message.body().getString("offset");
                Integer offset = (offsetParam == null) ? null : Json.mapper.readValue(offsetParam, Integer.class);
                service.itemAttributeList(limit, offset, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "item-attribute_list");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("item-attribute_list", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for item-attribute_read
        vertx.eventBus().<JsonObject> consumer(ITEM-ATTRIBUTE_READ_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "item-attribute_read";
                String idParam = message.body().getString("id");
                if(idParam == null) {
                    manageError(message, new MainApiException(400, "id is required"), serviceId);
                    return;
                }
                Integer id = Json.mapper.readValue(idParam, Integer.class);
                service.itemAttributeRead(id, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "item-attribute_read");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("item-attribute_read", e);
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
