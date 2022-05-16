package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface TypeApi  {
    //type_list
    void typeList(Integer limit, Integer offset, Handler<AsyncResult<String>> handler);

    //type_read
    void typeRead(Integer id, Handler<AsyncResult<String>> handler);

}
