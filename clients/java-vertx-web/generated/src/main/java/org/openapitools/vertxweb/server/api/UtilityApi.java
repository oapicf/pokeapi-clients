package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.LanguageDetail;
import org.openapitools.vertxweb.server.model.PaginatedLanguageSummaryList;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface UtilityApi  {
    Future<ApiResponse<PaginatedLanguageSummaryList>> languageList(Integer limit, Integer offset, String q);
    Future<ApiResponse<LanguageDetail>> languageRetrieve(String id);
}
