package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface PokeathlonStatApi  {
    //pokeathlon-stat_list
    void pokeathlonStatList(Integer limit, Integer offset, Handler<AsyncResult<String>> handler);

    //pokeathlon-stat_read
    void pokeathlonStatRead(Integer id, Handler<AsyncResult<String>> handler);

}
