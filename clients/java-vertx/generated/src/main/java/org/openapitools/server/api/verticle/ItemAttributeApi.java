package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface ItemAttributeApi  {
    //item-attribute_list
    void itemAttributeList(Integer limit, Integer offset, Handler<AsyncResult<String>> handler);

    //item-attribute_read
    void itemAttributeRead(Integer id, Handler<AsyncResult<String>> handler);

}
