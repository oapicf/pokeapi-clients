package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.MachineDetail;
import org.openapitools.vertxweb.server.model.PaginatedMachineSummaryList;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class MachinesApiImpl implements MachinesApi {
    public Future<ApiResponse<PaginatedMachineSummaryList>> machineList(Integer limit, Integer offset, String q) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<MachineDetail>> machineRetrieve(String id) {
        return Future.failedFuture(new HttpException(501));
    }

}
