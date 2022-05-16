package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface MoveTargetApi  {
    //move-target_list
    void moveTargetList(Integer limit, Integer offset, Handler<AsyncResult<String>> handler);

    //move-target_read
    void moveTargetRead(Integer id, Handler<AsyncResult<String>> handler);

}
