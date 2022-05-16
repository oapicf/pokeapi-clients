package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface LocationAreaApi  {
    //location-area_list
    void locationAreaList(Integer limit, Integer offset, Handler<AsyncResult<String>> handler);

    //location-area_read
    void locationAreaRead(Integer id, Handler<AsyncResult<String>> handler);

}
