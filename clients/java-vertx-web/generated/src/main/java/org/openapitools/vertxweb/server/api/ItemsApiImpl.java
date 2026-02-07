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
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class ItemsApiImpl implements ItemsApi {
    public Future<ApiResponse<PaginatedItemAttributeSummaryList>> itemAttributeList(Integer limit, Integer offset, String q) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ItemAttributeDetail>> itemAttributeRetrieve(String id) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<PaginatedItemCategorySummaryList>> itemCategoryList(Integer limit, Integer offset, String q) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ItemCategoryDetail>> itemCategoryRetrieve(String id) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<PaginatedItemFlingEffectSummaryList>> itemFlingEffectList(Integer limit, Integer offset, String q) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ItemFlingEffectDetail>> itemFlingEffectRetrieve(String id) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<PaginatedItemSummaryList>> itemList(Integer limit, Integer offset, String q) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<PaginatedItemPocketSummaryList>> itemPocketList(Integer limit, Integer offset, String q) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ItemPocketDetail>> itemPocketRetrieve(String id) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ItemDetail>> itemRetrieve(String id) {
        return Future.failedFuture(new HttpException(501));
    }

}
