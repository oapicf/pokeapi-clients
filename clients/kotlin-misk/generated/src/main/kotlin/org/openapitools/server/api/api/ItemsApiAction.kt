package org.openapitools.server.api.api

import jakarta.inject.Inject
import jakarta.inject.Singleton
import jakarta.validation.Valid
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import misk.web.actions.WebAction
import misk.web.interceptors.LogRequestResponse
import misk.web.Delete
import misk.web.Description
import misk.web.Get
import misk.web.HttpCall
import misk.web.Patch
import misk.web.PathParam
import misk.web.Post
import misk.web.Put
import misk.web.QueryParam
import misk.web.RequestBody
import misk.web.RequestContentType
import misk.web.RequestHeader
import misk.web.Response
import misk.web.ResponseContentType
import misk.web.mediatype.MediaTypes
import org.openapitools.server.api.model.ItemAttributeDetail
import org.openapitools.server.api.model.ItemCategoryDetail
import org.openapitools.server.api.model.ItemDetail
import org.openapitools.server.api.model.ItemFlingEffectDetail
import org.openapitools.server.api.model.ItemPocketDetail
import org.openapitools.server.api.model.PaginatedItemAttributeSummaryList
import org.openapitools.server.api.model.PaginatedItemCategorySummaryList
import org.openapitools.server.api.model.PaginatedItemFlingEffectSummaryList
import org.openapitools.server.api.model.PaginatedItemPocketSummaryList
import org.openapitools.server.api.model.PaginatedItemSummaryList

/**
* @TODO("Fill out implementation")
*/
@Singleton
class ItemsApiAction @Inject constructor(
) : WebAction {

    @Get("/api/v2/item-attribute/")
    @Description("List item attributes")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun itemAttributeList(
         @QueryParam(value = "limit") limit: kotlin.Int?, 
         @QueryParam(value = "offset") offset: kotlin.Int?, 
         @QueryParam(value = "q") q: kotlin.String?
    ): PaginatedItemAttributeSummaryList {
        TODO()
    }

    @Get("/api/v2/item-attribute/{id}/")
    @Description("Get item attribute")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun itemAttributeRetrieve(
        @PathParam("id") id: kotlin.String
    ): ItemAttributeDetail {
        TODO()
    }

    @Get("/api/v2/item-category/")
    @Description("List item categories")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun itemCategoryList(
         @QueryParam(value = "limit") limit: kotlin.Int?, 
         @QueryParam(value = "offset") offset: kotlin.Int?, 
         @QueryParam(value = "q") q: kotlin.String?
    ): PaginatedItemCategorySummaryList {
        TODO()
    }

    @Get("/api/v2/item-category/{id}/")
    @Description("Get item category")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun itemCategoryRetrieve(
        @PathParam("id") id: kotlin.String
    ): ItemCategoryDetail {
        TODO()
    }

    @Get("/api/v2/item-fling-effect/")
    @Description("List item fling effects")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun itemFlingEffectList(
         @QueryParam(value = "limit") limit: kotlin.Int?, 
         @QueryParam(value = "offset") offset: kotlin.Int?, 
         @QueryParam(value = "q") q: kotlin.String?
    ): PaginatedItemFlingEffectSummaryList {
        TODO()
    }

    @Get("/api/v2/item-fling-effect/{id}/")
    @Description("Get item fling effect")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun itemFlingEffectRetrieve(
        @PathParam("id") id: kotlin.String
    ): ItemFlingEffectDetail {
        TODO()
    }

    @Get("/api/v2/item/")
    @Description("List items")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun itemList(
         @QueryParam(value = "limit") limit: kotlin.Int?, 
         @QueryParam(value = "offset") offset: kotlin.Int?, 
         @QueryParam(value = "q") q: kotlin.String?
    ): PaginatedItemSummaryList {
        TODO()
    }

    @Get("/api/v2/item-pocket/")
    @Description("List item pockets")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun itemPocketList(
         @QueryParam(value = "limit") limit: kotlin.Int?, 
         @QueryParam(value = "offset") offset: kotlin.Int?, 
         @QueryParam(value = "q") q: kotlin.String?
    ): PaginatedItemPocketSummaryList {
        TODO()
    }

    @Get("/api/v2/item-pocket/{id}/")
    @Description("Get item pocket")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun itemPocketRetrieve(
        @PathParam("id") id: kotlin.String
    ): ItemPocketDetail {
        TODO()
    }

    @Get("/api/v2/item/{id}/")
    @Description("Get item")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun itemRetrieve(
        @PathParam("id") id: kotlin.String
    ): ItemDetail {
        TODO()
    }
}
