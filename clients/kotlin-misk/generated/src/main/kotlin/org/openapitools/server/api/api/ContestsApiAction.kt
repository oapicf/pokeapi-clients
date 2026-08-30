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
import org.openapitools.server.api.model.ContestEffectDetail
import org.openapitools.server.api.model.ContestTypeDetail
import org.openapitools.server.api.model.PaginatedContestEffectSummaryList
import org.openapitools.server.api.model.PaginatedContestTypeSummaryList
import org.openapitools.server.api.model.PaginatedSuperContestEffectSummaryList
import org.openapitools.server.api.model.SuperContestEffectDetail

/**
* @TODO("Fill out implementation")
*/
@Singleton
class ContestsApiAction @Inject constructor(
) : WebAction {

    @Get("/api/v2/contest-effect/")
    @Description("List contest effects")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun contestEffectList(
         @QueryParam(value = "limit") limit: kotlin.Int?, 
         @QueryParam(value = "offset") offset: kotlin.Int?, 
         @QueryParam(value = "q") q: kotlin.String?
    ): PaginatedContestEffectSummaryList {
        TODO()
    }

    @Get("/api/v2/contest-effect/{id}/")
    @Description("Get contest effect")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun contestEffectRetrieve(
        @PathParam("id") id: kotlin.String
    ): ContestEffectDetail {
        TODO()
    }

    @Get("/api/v2/contest-type/")
    @Description("List contest types")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun contestTypeList(
         @QueryParam(value = "limit") limit: kotlin.Int?, 
         @QueryParam(value = "offset") offset: kotlin.Int?, 
         @QueryParam(value = "q") q: kotlin.String?
    ): PaginatedContestTypeSummaryList {
        TODO()
    }

    @Get("/api/v2/contest-type/{id}/")
    @Description("Get contest type")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun contestTypeRetrieve(
        @PathParam("id") id: kotlin.String
    ): ContestTypeDetail {
        TODO()
    }

    @Get("/api/v2/super-contest-effect/")
    @Description("List super contest effects")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun superContestEffectList(
         @QueryParam(value = "limit") limit: kotlin.Int?, 
         @QueryParam(value = "offset") offset: kotlin.Int?, 
         @QueryParam(value = "q") q: kotlin.String?
    ): PaginatedSuperContestEffectSummaryList {
        TODO()
    }

    @Get("/api/v2/super-contest-effect/{id}/")
    @Description("Get super contest effect")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun superContestEffectRetrieve(
        @PathParam("id") id: kotlin.String
    ): SuperContestEffectDetail {
        TODO()
    }
}
