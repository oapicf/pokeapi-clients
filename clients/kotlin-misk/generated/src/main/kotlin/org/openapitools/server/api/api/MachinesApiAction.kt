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
import org.openapitools.server.api.model.MachineDetail
import org.openapitools.server.api.model.PaginatedMachineSummaryList

/**
* @TODO("Fill out implementation")
*/
@Singleton
class MachinesApiAction @Inject constructor(
) : WebAction {

    @Get("/api/v2/machine/")
    @Description("List machines")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun machineList(
         @QueryParam(value = "limit") limit: kotlin.Int?, 
         @QueryParam(value = "offset") offset: kotlin.Int?, 
         @QueryParam(value = "q") q: kotlin.String?
    ): PaginatedMachineSummaryList {
        TODO()
    }

    @Get("/api/v2/machine/{id}/")
    @Description("Get machine")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun machineRetrieve(
        @PathParam("id") id: kotlin.String
    ): MachineDetail {
        TODO()
    }
}
