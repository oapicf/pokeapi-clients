package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface MoveDamageClassApi  {
    //move-damage-class_list
    void moveDamageClassList(Integer limit, Integer offset, Handler<AsyncResult<String>> handler);

    //move-damage-class_read
    void moveDamageClassRead(Integer id, Handler<AsyncResult<String>> handler);

}
