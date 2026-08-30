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
import org.openapitools.server.api.model.MoveBattleStyleDetail
import org.openapitools.server.api.model.MoveDetail
import org.openapitools.server.api.model.MoveLearnMethodDetail
import org.openapitools.server.api.model.MoveMetaAilmentDetail
import org.openapitools.server.api.model.MoveMetaCategoryDetail
import org.openapitools.server.api.model.MoveTargetDetail
import org.openapitools.server.api.model.PaginatedMoveBattleStyleSummaryList
import org.openapitools.server.api.model.PaginatedMoveLearnMethodSummaryList
import org.openapitools.server.api.model.PaginatedMoveMetaAilmentSummaryList
import org.openapitools.server.api.model.PaginatedMoveMetaCategorySummaryList
import org.openapitools.server.api.model.PaginatedMoveSummaryList
import org.openapitools.server.api.model.PaginatedMoveTargetSummaryList

/**
* @TODO("Fill out implementation")
*/
@Singleton
class MovesApiAction @Inject constructor(
) : WebAction {

    @Get("/api/v2/move-ailment/")
    @Description("List move meta ailments")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun moveAilmentList(
         @QueryParam(value = "limit") limit: kotlin.Int?, 
         @QueryParam(value = "offset") offset: kotlin.Int?, 
         @QueryParam(value = "q") q: kotlin.String?
    ): PaginatedMoveMetaAilmentSummaryList {
        TODO()
    }

    @Get("/api/v2/move-ailment/{id}/")
    @Description("Get move meta ailment")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun moveAilmentRetrieve(
        @PathParam("id") id: kotlin.String
    ): MoveMetaAilmentDetail {
        TODO()
    }

    @Get("/api/v2/move-battle-style/")
    @Description("List move battle styles")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun moveBattleStyleList(
         @QueryParam(value = "limit") limit: kotlin.Int?, 
         @QueryParam(value = "offset") offset: kotlin.Int?, 
         @QueryParam(value = "q") q: kotlin.String?
    ): PaginatedMoveBattleStyleSummaryList {
        TODO()
    }

    @Get("/api/v2/move-battle-style/{id}/")
    @Description("Get move battle style")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun moveBattleStyleRetrieve(
        @PathParam("id") id: kotlin.String
    ): MoveBattleStyleDetail {
        TODO()
    }

    @Get("/api/v2/move-category/")
    @Description("List move meta categories")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun moveCategoryList(
         @QueryParam(value = "limit") limit: kotlin.Int?, 
         @QueryParam(value = "offset") offset: kotlin.Int?, 
         @QueryParam(value = "q") q: kotlin.String?
    ): PaginatedMoveMetaCategorySummaryList {
        TODO()
    }

    @Get("/api/v2/move-category/{id}/")
    @Description("Get move meta category")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun moveCategoryRetrieve(
        @PathParam("id") id: kotlin.String
    ): MoveMetaCategoryDetail {
        TODO()
    }

    @Get("/api/v2/move-learn-method/")
    @Description("List move learn methods")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun moveLearnMethodList(
         @QueryParam(value = "limit") limit: kotlin.Int?, 
         @QueryParam(value = "offset") offset: kotlin.Int?, 
         @QueryParam(value = "q") q: kotlin.String?
    ): PaginatedMoveLearnMethodSummaryList {
        TODO()
    }

    @Get("/api/v2/move-learn-method/{id}/")
    @Description("Get move learn method")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun moveLearnMethodRetrieve(
        @PathParam("id") id: kotlin.String
    ): MoveLearnMethodDetail {
        TODO()
    }

    @Get("/api/v2/move/")
    @Description("List moves")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun moveList(
         @QueryParam(value = "limit") limit: kotlin.Int?, 
         @QueryParam(value = "offset") offset: kotlin.Int?, 
         @QueryParam(value = "q") q: kotlin.String?
    ): PaginatedMoveSummaryList {
        TODO()
    }

    @Get("/api/v2/move/{id}/")
    @Description("Get move")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun moveRetrieve(
        @PathParam("id") id: kotlin.String
    ): MoveDetail {
        TODO()
    }

    @Get("/api/v2/move-target/")
    @Description("List move targets")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun moveTargetList(
         @QueryParam(value = "limit") limit: kotlin.Int?, 
         @QueryParam(value = "offset") offset: kotlin.Int?, 
         @QueryParam(value = "q") q: kotlin.String?
    ): PaginatedMoveTargetSummaryList {
        TODO()
    }

    @Get("/api/v2/move-target/{id}/")
    @Description("Get move target")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun moveTargetRetrieve(
        @PathParam("id") id: kotlin.String
    ): MoveTargetDetail {
        TODO()
    }
}
