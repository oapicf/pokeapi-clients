package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface EggGroupApi  {
    //egg-group_list
    void eggGroupList(Integer limit, Integer offset, Handler<AsyncResult<String>> handler);

    //egg-group_read
    void eggGroupRead(Integer id, Handler<AsyncResult<String>> handler);

}
