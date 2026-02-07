package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.LanguageDetail;
import org.openapitools.vertxweb.server.model.PaginatedLanguageSummaryList;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class UtilityApiImpl implements UtilityApi {
    public Future<ApiResponse<PaginatedLanguageSummaryList>> languageList(Integer limit, Integer offset, String q) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<LanguageDetail>> languageRetrieve(String id) {
        return Future.failedFuture(new HttpException(501));
    }

}
