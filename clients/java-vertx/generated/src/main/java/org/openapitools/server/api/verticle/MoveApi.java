package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface MoveApi  {
    //move_list
    void moveList(Integer limit, Integer offset, Handler<AsyncResult<String>> handler);

    //move_read
    void moveRead(Integer id, Handler<AsyncResult<String>> handler);

}
