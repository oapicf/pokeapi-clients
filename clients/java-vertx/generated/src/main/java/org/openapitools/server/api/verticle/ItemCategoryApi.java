package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface ItemCategoryApi  {
    //item-category_list
    void itemCategoryList(Integer limit, Integer offset, Handler<AsyncResult<String>> handler);

    //item-category_read
    void itemCategoryRead(Integer id, Handler<AsyncResult<String>> handler);

}
