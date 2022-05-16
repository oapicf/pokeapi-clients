package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface LanguageApi  {
    //language_list
    void languageList(Integer limit, Integer offset, Handler<AsyncResult<String>> handler);

    //language_read
    void languageRead(Integer id, Handler<AsyncResult<String>> handler);

}
