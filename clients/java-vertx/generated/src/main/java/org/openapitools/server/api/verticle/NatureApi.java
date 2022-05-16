package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface NatureApi  {
    //nature_list
    void natureList(Integer limit, Integer offset, Handler<AsyncResult<String>> handler);

    //nature_read
    void natureRead(Integer id, Handler<AsyncResult<String>> handler);

}
