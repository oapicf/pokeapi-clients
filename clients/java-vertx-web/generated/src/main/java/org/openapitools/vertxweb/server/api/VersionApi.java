package org.openapitools.vertxweb.server.api;


import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface VersionApi  {
    Future<ApiResponse<String>> versionList(Integer limit, Integer offset);
    Future<ApiResponse<String>> versionRead(Integer id);
}
