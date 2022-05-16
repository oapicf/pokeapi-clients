package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface GrowthRateApi  {
    //growth-rate_list
    void growthRateList(Integer limit, Integer offset, Handler<AsyncResult<String>> handler);

    //growth-rate_read
    void growthRateRead(Integer id, Handler<AsyncResult<String>> handler);

}
