package org.openapitools.vertxweb.server.api;


import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface ItemPocketApi  {
    Future<ApiResponse<String>> itemPocketList(Integer limit, Integer offset);
    Future<ApiResponse<String>> itemPocketRead(Integer id);
}
