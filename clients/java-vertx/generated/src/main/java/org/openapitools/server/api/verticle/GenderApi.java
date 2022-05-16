package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface GenderApi  {
    //gender_list
    void genderList(Integer limit, Integer offset, Handler<AsyncResult<String>> handler);

    //gender_read
    void genderRead(Integer id, Handler<AsyncResult<String>> handler);

}
