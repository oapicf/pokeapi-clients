package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface BerryFlavorApi  {
    //berry-flavor_list
    void berryFlavorList(Integer limit, Integer offset, Handler<AsyncResult<String>> handler);

    //berry-flavor_read
    void berryFlavorRead(Integer id, Handler<AsyncResult<String>> handler);

}
