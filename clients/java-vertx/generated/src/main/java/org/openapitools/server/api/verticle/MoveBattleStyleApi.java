package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface MoveBattleStyleApi  {
    //move-battle-style_list
    void moveBattleStyleList(Integer limit, Integer offset, Handler<AsyncResult<String>> handler);

    //move-battle-style_read
    void moveBattleStyleRead(Integer id, Handler<AsyncResult<String>> handler);

}
