package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.EvolutionChainDetail;
import org.openapitools.vertxweb.server.model.EvolutionTriggerDetail;
import org.openapitools.vertxweb.server.model.PaginatedEvolutionChainSummaryList;
import org.openapitools.vertxweb.server.model.PaginatedEvolutionTriggerSummaryList;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class EvolutionApiImpl implements EvolutionApi {
    public Future<ApiResponse<PaginatedEvolutionChainSummaryList>> evolutionChainList(Integer limit, Integer offset, String q) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<EvolutionChainDetail>> evolutionChainRetrieve(String id) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<PaginatedEvolutionTriggerSummaryList>> evolutionTriggerList(Integer limit, Integer offset, String q) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<EvolutionTriggerDetail>> evolutionTriggerRetrieve(String id) {
        return Future.failedFuture(new HttpException(501));
    }

}
