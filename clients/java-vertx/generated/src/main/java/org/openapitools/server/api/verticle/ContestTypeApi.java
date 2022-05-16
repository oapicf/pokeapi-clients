package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface ContestTypeApi  {
    //contest-type_list
    void contestTypeList(Integer limit, Integer offset, Handler<AsyncResult<String>> handler);

    //contest-type_read
    void contestTypeRead(Integer id, Handler<AsyncResult<String>> handler);

}
