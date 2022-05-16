package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface ItemFlingEffectApi  {
    //item-fling-effect_list
    void itemFlingEffectList(Integer limit, Integer offset, Handler<AsyncResult<String>> handler);

    //item-fling-effect_read
    void itemFlingEffectRead(Integer id, Handler<AsyncResult<String>> handler);

}
