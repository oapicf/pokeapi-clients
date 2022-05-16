package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface PokemonApi  {
    //pokemon_list
    void pokemonList(Integer limit, Integer offset, Handler<AsyncResult<String>> handler);

    //pokemon_read
    void pokemonRead(Integer id, Handler<AsyncResult<String>> handler);

}
