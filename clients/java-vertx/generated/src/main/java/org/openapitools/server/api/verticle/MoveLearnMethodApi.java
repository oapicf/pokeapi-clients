package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface MoveLearnMethodApi  {
    //move-learn-method_list
    void moveLearnMethodList(Integer limit, Integer offset, Handler<AsyncResult<String>> handler);

    //move-learn-method_read
    void moveLearnMethodRead(Integer id, Handler<AsyncResult<String>> handler);

}
