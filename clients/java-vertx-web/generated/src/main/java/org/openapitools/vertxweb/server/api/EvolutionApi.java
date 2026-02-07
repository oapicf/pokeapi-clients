package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.EvolutionChainDetail;
import org.openapitools.vertxweb.server.model.EvolutionTriggerDetail;
import org.openapitools.vertxweb.server.model.PaginatedEvolutionChainSummaryList;
import org.openapitools.vertxweb.server.model.PaginatedEvolutionTriggerSummaryList;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface EvolutionApi  {
    Future<ApiResponse<PaginatedEvolutionChainSummaryList>> evolutionChainList(Integer limit, Integer offset, String q);
    Future<ApiResponse<EvolutionChainDetail>> evolutionChainRetrieve(String id);
    Future<ApiResponse<PaginatedEvolutionTriggerSummaryList>> evolutionTriggerList(Integer limit, Integer offset, String q);
    Future<ApiResponse<EvolutionTriggerDetail>> evolutionTriggerRetrieve(String id);
}
