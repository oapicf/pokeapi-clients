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
import org.openapitools.server.api.model.LocationAreaDetail
import org.openapitools.server.api.model.LocationDetail
import org.openapitools.server.api.model.PaginatedLocationAreaSummaryList
import org.openapitools.server.api.model.PaginatedLocationSummaryList
import org.openapitools.server.api.model.PaginatedPalParkAreaSummaryList
import org.openapitools.server.api.model.PaginatedRegionSummaryList
import org.openapitools.server.api.model.PalParkAreaDetail
import org.openapitools.server.api.model.RegionDetail

/**
* @TODO("Fill out implementation")
*/
@Singleton
class LocationApiAction @Inject constructor(
) : WebAction {

    @Get("/api/v2/location-area/")
    @Description("List location areas")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun locationAreaList(
         @QueryParam(value = "limit") limit: kotlin.Int?, 
         @QueryParam(value = "offset") offset: kotlin.Int?
    ): PaginatedLocationAreaSummaryList {
        TODO()
    }

    @Get("/api/v2/location-area/{id}/")
    @Description("Get location area")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun locationAreaRetrieve(
        @PathParam("id") id: kotlin.Int
    ): LocationAreaDetail {
        TODO()
    }

    @Get("/api/v2/location/")
    @Description("List locations")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun locationList(
         @QueryParam(value = "limit") limit: kotlin.Int?, 
         @QueryParam(value = "offset") offset: kotlin.Int?, 
         @QueryParam(value = "q") q: kotlin.String?
    ): PaginatedLocationSummaryList {
        TODO()
    }

    @Get("/api/v2/location/{id}/")
    @Description("Get location")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun locationRetrieve(
        @PathParam("id") id: kotlin.String
    ): LocationDetail {
        TODO()
    }

    @Get("/api/v2/pal-park-area/")
    @Description("List pal park areas")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun palParkAreaList(
         @QueryParam(value = "limit") limit: kotlin.Int?, 
         @QueryParam(value = "offset") offset: kotlin.Int?, 
         @QueryParam(value = "q") q: kotlin.String?
    ): PaginatedPalParkAreaSummaryList {
        TODO()
    }

    @Get("/api/v2/pal-park-area/{id}/")
    @Description("Get pal park area")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun palParkAreaRetrieve(
        @PathParam("id") id: kotlin.String
    ): PalParkAreaDetail {
        TODO()
    }

    @Get("/api/v2/region/")
    @Description("List regions")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun regionList(
         @QueryParam(value = "limit") limit: kotlin.Int?, 
         @QueryParam(value = "offset") offset: kotlin.Int?, 
         @QueryParam(value = "q") q: kotlin.String?
    ): PaginatedRegionSummaryList {
        TODO()
    }

    @Get("/api/v2/region/{id}/")
    @Description("Get region")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun regionRetrieve(
        @PathParam("id") id: kotlin.String
    ): RegionDetail {
        TODO()
    }
}
