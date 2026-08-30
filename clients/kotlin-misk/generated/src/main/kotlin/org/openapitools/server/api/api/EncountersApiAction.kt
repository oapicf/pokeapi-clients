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
import org.openapitools.server.api.model.EncounterConditionDetail
import org.openapitools.server.api.model.EncounterConditionValueDetail
import org.openapitools.server.api.model.EncounterMethodDetail
import org.openapitools.server.api.model.PaginatedEncounterConditionSummaryList
import org.openapitools.server.api.model.PaginatedEncounterConditionValueSummaryList
import org.openapitools.server.api.model.PaginatedEncounterMethodSummaryList

/**
* @TODO("Fill out implementation")
*/
@Singleton
class EncountersApiAction @Inject constructor(
) : WebAction {

    @Get("/api/v2/encounter-condition/")
    @Description("List encounter conditions")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun encounterConditionList(
         @QueryParam(value = "limit") limit: kotlin.Int?, 
         @QueryParam(value = "offset") offset: kotlin.Int?, 
         @QueryParam(value = "q") q: kotlin.String?
    ): PaginatedEncounterConditionSummaryList {
        TODO()
    }

    @Get("/api/v2/encounter-condition/{id}/")
    @Description("Get encounter condition")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun encounterConditionRetrieve(
        @PathParam("id") id: kotlin.String
    ): EncounterConditionDetail {
        TODO()
    }

    @Get("/api/v2/encounter-condition-value/")
    @Description("List encounter condition values")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun encounterConditionValueList(
         @QueryParam(value = "limit") limit: kotlin.Int?, 
         @QueryParam(value = "offset") offset: kotlin.Int?, 
         @QueryParam(value = "q") q: kotlin.String?
    ): PaginatedEncounterConditionValueSummaryList {
        TODO()
    }

    @Get("/api/v2/encounter-condition-value/{id}/")
    @Description("Get encounter condition value")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun encounterConditionValueRetrieve(
        @PathParam("id") id: kotlin.String
    ): EncounterConditionValueDetail {
        TODO()
    }

    @Get("/api/v2/encounter-method/")
    @Description("List encounter methods")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun encounterMethodList(
         @QueryParam(value = "limit") limit: kotlin.Int?, 
         @QueryParam(value = "offset") offset: kotlin.Int?, 
         @QueryParam(value = "q") q: kotlin.String?
    ): PaginatedEncounterMethodSummaryList {
        TODO()
    }

    @Get("/api/v2/encounter-method/{id}/")
    @Description("Get encounter method")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun encounterMethodRetrieve(
        @PathParam("id") id: kotlin.String
    ): EncounterMethodDetail {
        TODO()
    }
}
