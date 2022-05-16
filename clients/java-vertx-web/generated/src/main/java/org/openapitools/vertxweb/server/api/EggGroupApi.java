package org.openapitools.vertxweb.server.api;


import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface EggGroupApi  {
    Future<ApiResponse<String>> eggGroupList(Integer limit, Integer offset);
    Future<ApiResponse<String>> eggGroupRead(Integer id);
}
