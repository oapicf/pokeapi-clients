package org.openapitools.vertxweb.server.api;


import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.impl.HttpStatusException;

import java.util.List;
import java.util.Map;

// Implement this class

public class PokedexApiImpl implements PokedexApi {
    public Future<ApiResponse<String>> pokedexList(Integer limit, Integer offset) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<String>> pokedexRead(Integer id) {
        return Future.failedFuture(new HttpStatusException(501));
    }

}
