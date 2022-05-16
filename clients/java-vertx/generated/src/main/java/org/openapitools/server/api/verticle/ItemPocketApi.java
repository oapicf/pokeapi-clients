package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface ItemPocketApi  {
    //item-pocket_list
    void itemPocketList(Integer limit, Integer offset, Handler<AsyncResult<String>> handler);

    //item-pocket_read
    void itemPocketRead(Integer id, Handler<AsyncResult<String>> handler);

}
