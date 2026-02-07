package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.MachineDetail;
import org.openapitools.vertxweb.server.model.PaginatedMachineSummaryList;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface MachinesApi  {
    Future<ApiResponse<PaginatedMachineSummaryList>> machineList(Integer limit, Integer offset, String q);
    Future<ApiResponse<MachineDetail>> machineRetrieve(String id);
}
