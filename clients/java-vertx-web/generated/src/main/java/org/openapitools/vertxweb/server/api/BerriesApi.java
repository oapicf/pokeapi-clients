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

import java.util.List;
import java.util.Map;

public interface BerriesApi  {
    Future<ApiResponse<PaginatedBerryFirmnessSummaryList>> berryFirmnessList(Integer limit, Integer offset, String q);
    Future<ApiResponse<BerryFirmnessDetail>> berryFirmnessRetrieve(String id);
    Future<ApiResponse<PaginatedBerryFlavorSummaryList>> berryFlavorList(Integer limit, Integer offset, String q);
    Future<ApiResponse<BerryFlavorDetail>> berryFlavorRetrieve(String id);
    Future<ApiResponse<PaginatedBerrySummaryList>> berryList(Integer limit, Integer offset, String q);
    Future<ApiResponse<BerryDetail>> berryRetrieve(String id);
}
