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
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class GamesApiImpl implements GamesApi {
    public Future<ApiResponse<PaginatedGenerationSummaryList>> generationList(Integer limit, Integer offset, String q) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GenerationDetail>> generationRetrieve(String id) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<PaginatedPokedexSummaryList>> pokedexList(Integer limit, Integer offset, String q) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<PokedexDetail>> pokedexRetrieve(String id) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<PaginatedVersionGroupSummaryList>> versionGroupList(Integer limit, Integer offset, String q) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<VersionGroupDetail>> versionGroupRetrieve(String id) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<PaginatedVersionSummaryList>> versionList(Integer limit, Integer offset, String q) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<VersionDetail>> versionRetrieve(String id) {
        return Future.failedFuture(new HttpException(501));
    }

}
