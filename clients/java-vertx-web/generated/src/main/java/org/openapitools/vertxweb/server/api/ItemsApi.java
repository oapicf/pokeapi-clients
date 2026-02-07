package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ItemAttributeDetail;
import org.openapitools.vertxweb.server.model.ItemCategoryDetail;
import org.openapitools.vertxweb.server.model.ItemDetail;
import org.openapitools.vertxweb.server.model.ItemFlingEffectDetail;
import org.openapitools.vertxweb.server.model.ItemPocketDetail;
import org.openapitools.vertxweb.server.model.PaginatedItemAttributeSummaryList;
import org.openapitools.vertxweb.server.model.PaginatedItemCategorySummaryList;
import org.openapitools.vertxweb.server.model.PaginatedItemFlingEffectSummaryList;
import org.openapitools.vertxweb.server.model.PaginatedItemPocketSummaryList;
import org.openapitools.vertxweb.server.model.PaginatedItemSummaryList;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface ItemsApi  {
    Future<ApiResponse<PaginatedItemAttributeSummaryList>> itemAttributeList(Integer limit, Integer offset, String q);
    Future<ApiResponse<ItemAttributeDetail>> itemAttributeRetrieve(String id);
    Future<ApiResponse<PaginatedItemCategorySummaryList>> itemCategoryList(Integer limit, Integer offset, String q);
    Future<ApiResponse<ItemCategoryDetail>> itemCategoryRetrieve(String id);
    Future<ApiResponse<PaginatedItemFlingEffectSummaryList>> itemFlingEffectList(Integer limit, Integer offset, String q);
    Future<ApiResponse<ItemFlingEffectDetail>> itemFlingEffectRetrieve(String id);
    Future<ApiResponse<PaginatedItemSummaryList>> itemList(Integer limit, Integer offset, String q);
    Future<ApiResponse<PaginatedItemPocketSummaryList>> itemPocketList(Integer limit, Integer offset, String q);
    Future<ApiResponse<ItemPocketDetail>> itemPocketRetrieve(String id);
    Future<ApiResponse<ItemDetail>> itemRetrieve(String id);
}
