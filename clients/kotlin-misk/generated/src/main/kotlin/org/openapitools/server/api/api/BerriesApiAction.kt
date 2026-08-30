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
import org.openapitools.server.api.model.BerryDetail
import org.openapitools.server.api.model.BerryFirmnessDetail
import org.openapitools.server.api.model.BerryFlavorDetail
import org.openapitools.server.api.model.PaginatedBerryFirmnessSummaryList
import org.openapitools.server.api.model.PaginatedBerryFlavorSummaryList
import org.openapitools.server.api.model.PaginatedBerrySummaryList

/**
* @TODO("Fill out implementation")
*/
@Singleton
class BerriesApiAction @Inject constructor(
) : WebAction {

    @Get("/api/v2/berry-firmness/")
    @Description("List berry firmness")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun berryFirmnessList(
         @QueryParam(value = "limit") limit: kotlin.Int?, 
         @QueryParam(value = "offset") offset: kotlin.Int?, 
         @QueryParam(value = "q") q: kotlin.String?
    ): PaginatedBerryFirmnessSummaryList {
        TODO()
    }

    @Get("/api/v2/berry-firmness/{id}/")
    @Description("Get berry by firmness")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun berryFirmnessRetrieve(
        @PathParam("id") id: kotlin.String
    ): BerryFirmnessDetail {
        TODO()
    }

    @Get("/api/v2/berry-flavor/")
    @Description("List berry flavors")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun berryFlavorList(
         @QueryParam(value = "limit") limit: kotlin.Int?, 
         @QueryParam(value = "offset") offset: kotlin.Int?, 
         @QueryParam(value = "q") q: kotlin.String?
    ): PaginatedBerryFlavorSummaryList {
        TODO()
    }

    @Get("/api/v2/berry-flavor/{id}/")
    @Description("Get berries by flavor")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun berryFlavorRetrieve(
        @PathParam("id") id: kotlin.String
    ): BerryFlavorDetail {
        TODO()
    }

    @Get("/api/v2/berry/")
    @Description("List berries")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun berryList(
         @QueryParam(value = "limit") limit: kotlin.Int?, 
         @QueryParam(value = "offset") offset: kotlin.Int?, 
         @QueryParam(value = "q") q: kotlin.String?
    ): PaginatedBerrySummaryList {
        TODO()
    }

    @Get("/api/v2/berry/{id}/")
    @Description("Get a berry")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun berryRetrieve(
        @PathParam("id") id: kotlin.String
    ): BerryDetail {
        TODO()
    }
}
