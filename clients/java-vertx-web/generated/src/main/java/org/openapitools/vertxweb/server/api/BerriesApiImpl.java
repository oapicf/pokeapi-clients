package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.BerryDetail;
import org.openapitools.vertxweb.server.model.BerryFirmnessDetail;
import org.openapitools.vertxweb.server.model.BerryFlavorDetail;
import org.openapitools.vertxweb.server.model.PaginatedBerryFirmnessSummaryList;
import org.openapitools.vertxweb.server.model.PaginatedBerryFlavorSummaryList;
import org.openapitools.vertxweb.server.model.PaginatedBerrySummaryList;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class BerriesApiImpl implements BerriesApi {
    public Future<ApiResponse<PaginatedBerryFirmnessSummaryList>> berryFirmnessList(Integer limit, Integer offset, String q) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<BerryFirmnessDetail>> berryFirmnessRetrieve(String id) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<PaginatedBerryFlavorSummaryList>> berryFlavorList(Integer limit, Integer offset, String q) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<BerryFlavorDetail>> berryFlavorRetrieve(String id) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<PaginatedBerrySummaryList>> berryList(Integer limit, Integer offset, String q) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<BerryDetail>> berryRetrieve(String id) {
        return Future.failedFuture(new HttpException(501));
    }

}
