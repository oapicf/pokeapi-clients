package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface EncounterConditionApi  {
    //encounter-condition_list
    void encounterConditionList(Integer limit, Integer offset, Handler<AsyncResult<String>> handler);

    //encounter-condition_read
    void encounterConditionRead(Integer id, Handler<AsyncResult<String>> handler);

}
