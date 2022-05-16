package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface PokemonShapeApi  {
    //pokemon-shape_list
    void pokemonShapeList(Integer limit, Integer offset, Handler<AsyncResult<String>> handler);

    //pokemon-shape_read
    void pokemonShapeRead(Integer id, Handler<AsyncResult<String>> handler);

}
