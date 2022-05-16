package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface PokemonFormApi  {
    //pokemon-form_list
    void pokemonFormList(Integer limit, Integer offset, Handler<AsyncResult<String>> handler);

    //pokemon-form_read
    void pokemonFormRead(Integer id, Handler<AsyncResult<String>> handler);

}
