package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface PokedexApi  {
    //pokedex_list
    void pokedexList(Integer limit, Integer offset, Handler<AsyncResult<String>> handler);

    //pokedex_read
    void pokedexRead(Integer id, Handler<AsyncResult<String>> handler);

}
