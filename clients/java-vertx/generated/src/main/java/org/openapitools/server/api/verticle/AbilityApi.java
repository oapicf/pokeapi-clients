package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface AbilityApi  {
    //ability_list
    void abilityList(Integer limit, Integer offset, Handler<AsyncResult<String>> handler);

    //ability_read
    void abilityRead(Integer id, Handler<AsyncResult<String>> handler);

}
