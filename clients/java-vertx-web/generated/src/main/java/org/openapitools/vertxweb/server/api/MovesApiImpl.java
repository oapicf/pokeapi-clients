package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.MoveBattleStyleDetail;
import org.openapitools.vertxweb.server.model.MoveDetail;
import org.openapitools.vertxweb.server.model.MoveLearnMethodDetail;
import org.openapitools.vertxweb.server.model.MoveMetaAilmentDetail;
import org.openapitools.vertxweb.server.model.MoveMetaCategoryDetail;
import org.openapitools.vertxweb.server.model.MoveTargetDetail;
import org.openapitools.vertxweb.server.model.PaginatedMoveBattleStyleSummaryList;
import org.openapitools.vertxweb.server.model.PaginatedMoveLearnMethodSummaryList;
import org.openapitools.vertxweb.server.model.PaginatedMoveMetaAilmentSummaryList;
import org.openapitools.vertxweb.server.model.PaginatedMoveMetaCategorySummaryList;
import org.openapitools.vertxweb.server.model.PaginatedMoveSummaryList;
import org.openapitools.vertxweb.server.model.PaginatedMoveTargetSummaryList;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class MovesApiImpl implements MovesApi {
    public Future<ApiResponse<PaginatedMoveMetaAilmentSummaryList>> moveAilmentList(Integer limit, Integer offset, String q) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<MoveMetaAilmentDetail>> moveAilmentRetrieve(String id) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<PaginatedMoveBattleStyleSummaryList>> moveBattleStyleList(Integer limit, Integer offset, String q) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<MoveBattleStyleDetail>> moveBattleStyleRetrieve(String id) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<PaginatedMoveMetaCategorySummaryList>> moveCategoryList(Integer limit, Integer offset, String q) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<MoveMetaCategoryDetail>> moveCategoryRetrieve(String id) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<PaginatedMoveLearnMethodSummaryList>> moveLearnMethodList(Integer limit, Integer offset, String q) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<MoveLearnMethodDetail>> moveLearnMethodRetrieve(String id) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<PaginatedMoveSummaryList>> moveList(Integer limit, Integer offset, String q) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<MoveDetail>> moveRetrieve(String id) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<PaginatedMoveTargetSummaryList>> moveTargetList(Integer limit, Integer offset, String q) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<MoveTargetDetail>> moveTargetRetrieve(String id) {
        return Future.failedFuture(new HttpException(501));
    }

}
