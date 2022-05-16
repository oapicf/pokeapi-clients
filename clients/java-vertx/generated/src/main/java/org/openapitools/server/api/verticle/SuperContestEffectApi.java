package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface SuperContestEffectApi  {
    //super-contest-effect_list
    void superContestEffectList(Integer limit, Integer offset, Handler<AsyncResult<String>> handler);

    //super-contest-effect_read
    void superContestEffectRead(Integer id, Handler<AsyncResult<String>> handler);

}
