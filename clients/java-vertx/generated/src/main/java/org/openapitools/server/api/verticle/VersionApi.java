package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface VersionApi  {
    //version_list
    void versionList(Integer limit, Integer offset, Handler<AsyncResult<String>> handler);

    //version_read
    void versionRead(Integer id, Handler<AsyncResult<String>> handler);

}
