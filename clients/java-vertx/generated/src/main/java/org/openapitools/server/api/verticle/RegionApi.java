package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface RegionApi  {
    //region_list
    void regionList(Integer limit, Integer offset, Handler<AsyncResult<String>> handler);

    //region_read
    void regionRead(Integer id, Handler<AsyncResult<String>> handler);

}
