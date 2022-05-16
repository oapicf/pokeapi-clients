package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface EncounterConditionValueApi  {
    //encounter-condition-value_list
    void encounterConditionValueList(Integer limit, Integer offset, Handler<AsyncResult<String>> handler);

    //encounter-condition-value_read
    void encounterConditionValueRead(Integer id, Handler<AsyncResult<String>> handler);

}
