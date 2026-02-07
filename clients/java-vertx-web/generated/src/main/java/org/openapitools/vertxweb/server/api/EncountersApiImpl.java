package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.EncounterConditionDetail;
import org.openapitools.vertxweb.server.model.EncounterConditionValueDetail;
import org.openapitools.vertxweb.server.model.EncounterMethodDetail;
import org.openapitools.vertxweb.server.model.PaginatedEncounterConditionSummaryList;
import org.openapitools.vertxweb.server.model.PaginatedEncounterConditionValueSummaryList;
import org.openapitools.vertxweb.server.model.PaginatedEncounterMethodSummaryList;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class EncountersApiImpl implements EncountersApi {
    public Future<ApiResponse<PaginatedEncounterConditionSummaryList>> encounterConditionList(Integer limit, Integer offset, String q) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<EncounterConditionDetail>> encounterConditionRetrieve(String id) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<PaginatedEncounterConditionValueSummaryList>> encounterConditionValueList(Integer limit, Integer offset, String q) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<EncounterConditionValueDetail>> encounterConditionValueRetrieve(String id) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<PaginatedEncounterMethodSummaryList>> encounterMethodList(Integer limit, Integer offset, String q) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<EncounterMethodDetail>> encounterMethodRetrieve(String id) {
        return Future.failedFuture(new HttpException(501));
    }

}
