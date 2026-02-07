package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.GenerationDetail;
import org.openapitools.vertxweb.server.model.PaginatedGenerationSummaryList;
import org.openapitools.vertxweb.server.model.PaginatedPokedexSummaryList;
import org.openapitools.vertxweb.server.model.PaginatedVersionGroupSummaryList;
import org.openapitools.vertxweb.server.model.PaginatedVersionSummaryList;
import org.openapitools.vertxweb.server.model.PokedexDetail;
import org.openapitools.vertxweb.server.model.VersionDetail;
import org.openapitools.vertxweb.server.model.VersionGroupDetail;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface GamesApi  {
    Future<ApiResponse<PaginatedGenerationSummaryList>> generationList(Integer limit, Integer offset, String q);
    Future<ApiResponse<GenerationDetail>> generationRetrieve(String id);
    Future<ApiResponse<PaginatedPokedexSummaryList>> pokedexList(Integer limit, Integer offset, String q);
    Future<ApiResponse<PokedexDetail>> pokedexRetrieve(String id);
    Future<ApiResponse<PaginatedVersionGroupSummaryList>> versionGroupList(Integer limit, Integer offset, String q);
    Future<ApiResponse<VersionGroupDetail>> versionGroupRetrieve(String id);
    Future<ApiResponse<PaginatedVersionSummaryList>> versionList(Integer limit, Integer offset, String q);
    Future<ApiResponse<VersionDetail>> versionRetrieve(String id);
}
