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

import java.util.List;
import java.util.Map;

public interface LocationApi  {
    Future<ApiResponse<PaginatedLocationAreaSummaryList>> locationAreaList(Integer limit, Integer offset);
    Future<ApiResponse<LocationAreaDetail>> locationAreaRetrieve(Integer id);
    Future<ApiResponse<PaginatedLocationSummaryList>> locationList(Integer limit, Integer offset, String q);
    Future<ApiResponse<LocationDetail>> locationRetrieve(String id);
    Future<ApiResponse<PaginatedPalParkAreaSummaryList>> palParkAreaList(Integer limit, Integer offset, String q);
    Future<ApiResponse<PalParkAreaDetail>> palParkAreaRetrieve(String id);
    Future<ApiResponse<PaginatedRegionSummaryList>> regionList(Integer limit, Integer offset, String q);
    Future<ApiResponse<RegionDetail>> regionRetrieve(String id);
}
