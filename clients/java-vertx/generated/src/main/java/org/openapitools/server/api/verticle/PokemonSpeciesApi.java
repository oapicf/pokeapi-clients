package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface PokemonSpeciesApi  {
    //pokemon-species_list
    void pokemonSpeciesList(Integer limit, Integer offset, Handler<AsyncResult<String>> handler);

    //pokemon-species_read
    void pokemonSpeciesRead(Integer id, Handler<AsyncResult<String>> handler);

}
