package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface MoveAilmentApi  {
    //move-ailment_list
    void moveAilmentList(Integer limit, Integer offset, Handler<AsyncResult<String>> handler);

    //move-ailment_read
    void moveAilmentRead(Integer id, Handler<AsyncResult<String>> handler);

}
