package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface EncounterMethodApi  {
    //encounter-method_list
    void encounterMethodList(Integer limit, Integer offset, Handler<AsyncResult<String>> handler);

    //encounter-method_read
    void encounterMethodRead(Integer id, Handler<AsyncResult<String>> handler);

}
