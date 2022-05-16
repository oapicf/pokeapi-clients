package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface StatApi  {
    //stat_list
    void statList(Integer limit, Integer offset, Handler<AsyncResult<String>> handler);

    //stat_read
    void statRead(Integer id, Handler<AsyncResult<String>> handler);

}
