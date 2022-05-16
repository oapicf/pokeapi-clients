package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface EvolutionTriggerApi  {
    //evolution-trigger_list
    void evolutionTriggerList(Integer limit, Integer offset, Handler<AsyncResult<String>> handler);

    //evolution-trigger_read
    void evolutionTriggerRead(Integer id, Handler<AsyncResult<String>> handler);

}
