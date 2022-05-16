package org.openapitools.vertxweb.server.api;


import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.impl.HttpStatusException;

import java.util.List;
import java.util.Map;

// Implement this class

public class PokemonSpeciesApiImpl implements PokemonSpeciesApi {
    public Future<ApiResponse<String>> pokemonSpeciesList(Integer limit, Integer offset) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<String>> pokemonSpeciesRead(Integer id) {
        return Future.failedFuture(new HttpStatusException(501));
    }

}
