package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface GenerationApi  {
    //generation_list
    void generationList(Integer limit, Integer offset, Handler<AsyncResult<String>> handler);

    //generation_read
    void generationRead(Integer id, Handler<AsyncResult<String>> handler);

}
