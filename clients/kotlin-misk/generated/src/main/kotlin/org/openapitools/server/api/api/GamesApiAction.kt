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
import org.openapitools.server.api.model.GenerationDetail
import org.openapitools.server.api.model.PaginatedGenerationSummaryList
import org.openapitools.server.api.model.PaginatedPokedexSummaryList
import org.openapitools.server.api.model.PaginatedVersionGroupSummaryList
import org.openapitools.server.api.model.PaginatedVersionSummaryList
import org.openapitools.server.api.model.PokedexDetail
import org.openapitools.server.api.model.VersionDetail
import org.openapitools.server.api.model.VersionGroupDetail

/**
* @TODO("Fill out implementation")
*/
@Singleton
class GamesApiAction @Inject constructor(
) : WebAction {

    @Get("/api/v2/generation/")
    @Description("List genrations")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun generationList(
         @QueryParam(value = "limit") limit: kotlin.Int?, 
         @QueryParam(value = "offset") offset: kotlin.Int?, 
         @QueryParam(value = "q") q: kotlin.String?
    ): PaginatedGenerationSummaryList {
        TODO()
    }

    @Get("/api/v2/generation/{id}/")
    @Description("Get genration")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun generationRetrieve(
        @PathParam("id") id: kotlin.String
    ): GenerationDetail {
        TODO()
    }

    @Get("/api/v2/pokedex/")
    @Description("List pokedex")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun pokedexList(
         @QueryParam(value = "limit") limit: kotlin.Int?, 
         @QueryParam(value = "offset") offset: kotlin.Int?, 
         @QueryParam(value = "q") q: kotlin.String?
    ): PaginatedPokedexSummaryList {
        TODO()
    }

    @Get("/api/v2/pokedex/{id}/")
    @Description("Get pokedex")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun pokedexRetrieve(
        @PathParam("id") id: kotlin.String
    ): PokedexDetail {
        TODO()
    }

    @Get("/api/v2/version-group/")
    @Description("List version groups")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun versionGroupList(
         @QueryParam(value = "limit") limit: kotlin.Int?, 
         @QueryParam(value = "offset") offset: kotlin.Int?, 
         @QueryParam(value = "q") q: kotlin.String?
    ): PaginatedVersionGroupSummaryList {
        TODO()
    }

    @Get("/api/v2/version-group/{id}/")
    @Description("Get version group")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun versionGroupRetrieve(
        @PathParam("id") id: kotlin.String
    ): VersionGroupDetail {
        TODO()
    }

    @Get("/api/v2/version/")
    @Description("List versions")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun versionList(
         @QueryParam(value = "limit") limit: kotlin.Int?, 
         @QueryParam(value = "offset") offset: kotlin.Int?, 
         @QueryParam(value = "q") q: kotlin.String?
    ): PaginatedVersionSummaryList {
        TODO()
    }

    @Get("/api/v2/version/{id}/")
    @Description("Get version")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun versionRetrieve(
        @PathParam("id") id: kotlin.String
    ): VersionDetail {
        TODO()
    }
}
