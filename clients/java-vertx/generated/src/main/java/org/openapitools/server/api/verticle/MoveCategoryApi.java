package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface MoveCategoryApi  {
    //move-category_list
    void moveCategoryList(Integer limit, Integer offset, Handler<AsyncResult<String>> handler);

    //move-category_read
    void moveCategoryRead(Integer id, Handler<AsyncResult<String>> handler);

}
