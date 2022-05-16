package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface BerryApi  {
    //berry_list
    void berryList(Integer limit, Integer offset, Handler<AsyncResult<String>> handler);

    //berry_read
    void berryRead(Integer id, Handler<AsyncResult<String>> handler);

}
