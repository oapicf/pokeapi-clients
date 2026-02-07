package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.LocationAreaDetail;
import org.openapitools.vertxweb.server.model.LocationDetail;
import org.openapitools.vertxweb.server.model.PaginatedLocationAreaSummaryList;
import org.openapitools.vertxweb.server.model.PaginatedLocationSummaryList;
import org.openapitools.vertxweb.server.model.PaginatedPalParkAreaSummaryList;
import org.openapitools.vertxweb.server.model.PaginatedRegionSummaryList;
import org.openapitools.vertxweb.server.model.PalParkAreaDetail;
import org.openapitools.vertxweb.server.model.RegionDetail;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class LocationApiImpl implements LocationApi {
    public Future<ApiResponse<PaginatedLocationAreaSummaryList>> locationAreaList(Integer limit, Integer offset) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<LocationAreaDetail>> locationAreaRetrieve(Integer id) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<PaginatedLocationSummaryList>> locationList(Integer limit, Integer offset, String q) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<LocationDetail>> locationRetrieve(String id) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<PaginatedPalParkAreaSummaryList>> palParkAreaList(Integer limit, Integer offset, String q) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<PalParkAreaDetail>> palParkAreaRetrieve(String id) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<PaginatedRegionSummaryList>> regionList(Integer limit, Integer offset, String q) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<RegionDetail>> regionRetrieve(String id) {
        return Future.failedFuture(new HttpException(501));
    }

}
