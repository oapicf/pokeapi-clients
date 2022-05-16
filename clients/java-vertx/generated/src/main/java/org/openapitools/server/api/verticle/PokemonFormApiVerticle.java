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

public class PokemonFormApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(PokemonFormApiVerticle.class);

    static final String POKEMON-FORM_LIST_SERVICE_ID = "pokemon-form_list";
    static final String POKEMON-FORM_READ_SERVICE_ID = "pokemon-form_read";
    
    final PokemonFormApi service;

    public PokemonFormApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.PokemonFormApiImpl");
            service = (PokemonFormApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("PokemonFormApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for pokemon-form_list
        vertx.eventBus().<JsonObject> consumer(POKEMON-FORM_LIST_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "pokemon-form_list";
                String limitParam = message.body().getString("limit");
                Integer limit = (limitParam == null) ? null : Json.mapper.readValue(limitParam, Integer.class);
                String offsetParam = message.body().getString("offset");
                Integer offset = (offsetParam == null) ? null : Json.mapper.readValue(offsetParam, Integer.class);
                service.pokemonFormList(limit, offset, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "pokemon-form_list");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("pokemon-form_list", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for pokemon-form_read
        vertx.eventBus().<JsonObject> consumer(POKEMON-FORM_READ_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "pokemon-form_read";
                String idParam = message.body().getString("id");
                if(idParam == null) {
                    manageError(message, new MainApiException(400, "id is required"), serviceId);
                    return;
                }
                Integer id = Json.mapper.readValue(idParam, Integer.class);
                service.pokemonFormRead(id, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "pokemon-form_read");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("pokemon-form_read", e);
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
