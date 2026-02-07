package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.EncounterConditionDetail;
import org.openapitools.vertxweb.server.model.EncounterConditionValueDetail;
import org.openapitools.vertxweb.server.model.EncounterMethodDetail;
import org.openapitools.vertxweb.server.model.PaginatedEncounterConditionSummaryList;
import org.openapitools.vertxweb.server.model.PaginatedEncounterConditionValueSummaryList;
import org.openapitools.vertxweb.server.model.PaginatedEncounterMethodSummaryList;
import org.openapitools.vertxweb.server.model.PokemonEncountersRetrieve200ResponseInner;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface EncountersApi  {
    Future<ApiResponse<PaginatedEncounterConditionSummaryList>> encounterConditionList(Integer limit, Integer offset, String q);
    Future<ApiResponse<EncounterConditionDetail>> encounterConditionRetrieve(String id);
    Future<ApiResponse<PaginatedEncounterConditionValueSummaryList>> encounterConditionValueList(Integer limit, Integer offset, String q);
    Future<ApiResponse<EncounterConditionValueDetail>> encounterConditionValueRetrieve(String id);
    Future<ApiResponse<PaginatedEncounterMethodSummaryList>> encounterMethodList(Integer limit, Integer offset, String q);
    Future<ApiResponse<EncounterMethodDetail>> encounterMethodRetrieve(String id);
    Future<ApiResponse<List<PokemonEncountersRetrieve200ResponseInner>>> pokemonEncountersRetrieve(String pokemonId);
}
