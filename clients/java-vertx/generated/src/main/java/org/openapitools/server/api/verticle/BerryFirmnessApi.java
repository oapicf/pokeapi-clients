package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface BerryFirmnessApi  {
    //berry-firmness_list
    void berryFirmnessList(Integer limit, Integer offset, Handler<AsyncResult<String>> handler);

    //berry-firmness_read
    void berryFirmnessRead(Integer id, Handler<AsyncResult<String>> handler);

}
