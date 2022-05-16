package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface PokemonHabitatApi  {
    //pokemon-habitat_list
    void pokemonHabitatList(Integer limit, Integer offset, Handler<AsyncResult<String>> handler);

    //pokemon-habitat_read
    void pokemonHabitatRead(Integer id, Handler<AsyncResult<String>> handler);

}
