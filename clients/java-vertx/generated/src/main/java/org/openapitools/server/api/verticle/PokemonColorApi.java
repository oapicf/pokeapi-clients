package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface PokemonColorApi  {
    //pokemon-color_list
    void pokemonColorList(Integer limit, Integer offset, Handler<AsyncResult<String>> handler);

    //pokemon-color_read
    void pokemonColorRead(Integer id, Handler<AsyncResult<String>> handler);

}
