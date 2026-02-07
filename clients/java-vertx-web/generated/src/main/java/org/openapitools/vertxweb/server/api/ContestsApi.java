package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ContestEffectDetail;
import org.openapitools.vertxweb.server.model.ContestTypeDetail;
import org.openapitools.vertxweb.server.model.PaginatedContestEffectSummaryList;
import org.openapitools.vertxweb.server.model.PaginatedContestTypeSummaryList;
import org.openapitools.vertxweb.server.model.PaginatedSuperContestEffectSummaryList;
import org.openapitools.vertxweb.server.model.SuperContestEffectDetail;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface ContestsApi  {
    Future<ApiResponse<PaginatedContestEffectSummaryList>> contestEffectList(Integer limit, Integer offset, String q);
    Future<ApiResponse<ContestEffectDetail>> contestEffectRetrieve(String id);
    Future<ApiResponse<PaginatedContestTypeSummaryList>> contestTypeList(Integer limit, Integer offset, String q);
    Future<ApiResponse<ContestTypeDetail>> contestTypeRetrieve(String id);
    Future<ApiResponse<PaginatedSuperContestEffectSummaryList>> superContestEffectList(Integer limit, Integer offset, String q);
    Future<ApiResponse<SuperContestEffectDetail>> superContestEffectRetrieve(String id);
}
