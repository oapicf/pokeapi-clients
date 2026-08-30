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
import org.openapitools.server.api.model.EvolutionChainDetail
import org.openapitools.server.api.model.EvolutionTriggerDetail
import org.openapitools.server.api.model.PaginatedEvolutionChainSummaryList
import org.openapitools.server.api.model.PaginatedEvolutionTriggerSummaryList

/**
* @TODO("Fill out implementation")
*/
@Singleton
class EvolutionApiAction @Inject constructor(
) : WebAction {

    @Get("/api/v2/evolution-chain/")
    @Description("List evolution chains")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun evolutionChainList(
         @QueryParam(value = "limit") limit: kotlin.Int?, 
         @QueryParam(value = "offset") offset: kotlin.Int?, 
         @QueryParam(value = "q") q: kotlin.String?
    ): PaginatedEvolutionChainSummaryList {
        TODO()
    }

    @Get("/api/v2/evolution-chain/{id}/")
    @Description("Get evolution chain")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun evolutionChainRetrieve(
        @PathParam("id") id: kotlin.String
    ): EvolutionChainDetail {
        TODO()
    }

    @Get("/api/v2/evolution-trigger/")
    @Description("List evolution triggers")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun evolutionTriggerList(
         @QueryParam(value = "limit") limit: kotlin.Int?, 
         @QueryParam(value = "offset") offset: kotlin.Int?, 
         @QueryParam(value = "q") q: kotlin.String?
    ): PaginatedEvolutionTriggerSummaryList {
        TODO()
    }

    @Get("/api/v2/evolution-trigger/{id}/")
    @Description("Get evolution trigger")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun evolutionTriggerRetrieve(
        @PathParam("id") id: kotlin.String
    ): EvolutionTriggerDetail {
        TODO()
    }
}
