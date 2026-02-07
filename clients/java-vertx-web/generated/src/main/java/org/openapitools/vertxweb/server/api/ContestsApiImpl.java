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
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class ContestsApiImpl implements ContestsApi {
    public Future<ApiResponse<PaginatedContestEffectSummaryList>> contestEffectList(Integer limit, Integer offset, String q) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ContestEffectDetail>> contestEffectRetrieve(String id) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<PaginatedContestTypeSummaryList>> contestTypeList(Integer limit, Integer offset, String q) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ContestTypeDetail>> contestTypeRetrieve(String id) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<PaginatedSuperContestEffectSummaryList>> superContestEffectList(Integer limit, Integer offset, String q) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<SuperContestEffectDetail>> superContestEffectRetrieve(String id) {
        return Future.failedFuture(new HttpException(501));
    }

}
