package org.openapitools.vertxweb.server.api;


import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface MoveLearnMethodApi  {
    Future<ApiResponse<String>> moveLearnMethodList(Integer limit, Integer offset);
    Future<ApiResponse<String>> moveLearnMethodRead(Integer id);
}
