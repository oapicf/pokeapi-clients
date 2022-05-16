package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface VersionGroupApi  {
    //version-group_list
    void versionGroupList(Integer limit, Integer offset, Handler<AsyncResult<String>> handler);

    //version-group_read
    void versionGroupRead(Integer id, Handler<AsyncResult<String>> handler);

}
