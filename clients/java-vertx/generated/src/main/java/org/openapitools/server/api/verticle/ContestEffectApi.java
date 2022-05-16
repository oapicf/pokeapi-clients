package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface ContestEffectApi  {
    //contest-effect_list
    void contestEffectList(Integer limit, Integer offset, Handler<AsyncResult<String>> handler);

    //contest-effect_read
    void contestEffectRead(Integer id, Handler<AsyncResult<String>> handler);

}
