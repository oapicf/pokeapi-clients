package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface PalParkAreaApi  {
    //pal-park-area_list
    void palParkAreaList(Integer limit, Integer offset, Handler<AsyncResult<String>> handler);

    //pal-park-area_read
    void palParkAreaRead(Integer id, Handler<AsyncResult<String>> handler);

}
