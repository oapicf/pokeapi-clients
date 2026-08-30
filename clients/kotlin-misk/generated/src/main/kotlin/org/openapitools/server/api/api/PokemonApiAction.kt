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
import org.openapitools.server.api.model.AbilityDetail
import org.openapitools.server.api.model.CharacteristicDetail
import org.openapitools.server.api.model.EggGroupDetail
import org.openapitools.server.api.model.GenderDetail
import org.openapitools.server.api.model.GrowthRateDetail
import org.openapitools.server.api.model.MoveDamageClassDetail
import org.openapitools.server.api.model.NatureDetail
import org.openapitools.server.api.model.PaginatedAbilitySummaryList
import org.openapitools.server.api.model.PaginatedCharacteristicSummaryList
import org.openapitools.server.api.model.PaginatedEggGroupSummaryList
import org.openapitools.server.api.model.PaginatedGenderSummaryList
import org.openapitools.server.api.model.PaginatedGrowthRateSummaryList
import org.openapitools.server.api.model.PaginatedMoveDamageClassSummaryList
import org.openapitools.server.api.model.PaginatedNatureSummaryList
import org.openapitools.server.api.model.PaginatedPokeathlonStatSummaryList
import org.openapitools.server.api.model.PaginatedPokemonColorSummaryList
import org.openapitools.server.api.model.PaginatedPokemonFormSummaryList
import org.openapitools.server.api.model.PaginatedPokemonHabitatSummaryList
import org.openapitools.server.api.model.PaginatedPokemonShapeSummaryList
import org.openapitools.server.api.model.PaginatedPokemonSpeciesSummaryList
import org.openapitools.server.api.model.PaginatedPokemonSummaryList
import org.openapitools.server.api.model.PaginatedStatSummaryList
import org.openapitools.server.api.model.PaginatedTypeSummaryList
import org.openapitools.server.api.model.PokeathlonStatDetail
import org.openapitools.server.api.model.PokemonColorDetail
import org.openapitools.server.api.model.PokemonDetail
import org.openapitools.server.api.model.PokemonFormDetail
import org.openapitools.server.api.model.PokemonHabitatDetail
import org.openapitools.server.api.model.PokemonShapeDetail
import org.openapitools.server.api.model.PokemonSpeciesDetail
import org.openapitools.server.api.model.StatDetail
import org.openapitools.server.api.model.TypeDetail

/**
* @TODO("Fill out implementation")
*/
@Singleton
class PokemonApiAction @Inject constructor(
) : WebAction {

    @Get("/api/v2/ability/")
    @Description("")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun abilityList(
         @QueryParam(value = "limit") limit: kotlin.Int?, 
         @QueryParam(value = "offset") offset: kotlin.Int?, 
         @QueryParam(value = "q") q: kotlin.String?
    ): PaginatedAbilitySummaryList {
        TODO()
    }

    @Get("/api/v2/ability/{id}/")
    @Description("")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun abilityRetrieve(
        @PathParam("id") id: kotlin.String
    ): AbilityDetail {
        TODO()
    }

    @Get("/api/v2/characteristic/")
    @Description("List charecterictics")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun characteristicList(
         @QueryParam(value = "limit") limit: kotlin.Int?, 
         @QueryParam(value = "offset") offset: kotlin.Int?, 
         @QueryParam(value = "q") q: kotlin.String?
    ): PaginatedCharacteristicSummaryList {
        TODO()
    }

    @Get("/api/v2/characteristic/{id}/")
    @Description("Get characteristic")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun characteristicRetrieve(
        @PathParam("id") id: kotlin.String
    ): CharacteristicDetail {
        TODO()
    }

    @Get("/api/v2/egg-group/")
    @Description("List egg groups")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun eggGroupList(
         @QueryParam(value = "limit") limit: kotlin.Int?, 
         @QueryParam(value = "offset") offset: kotlin.Int?, 
         @QueryParam(value = "q") q: kotlin.String?
    ): PaginatedEggGroupSummaryList {
        TODO()
    }

    @Get("/api/v2/egg-group/{id}/")
    @Description("Get egg group")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun eggGroupRetrieve(
        @PathParam("id") id: kotlin.String
    ): EggGroupDetail {
        TODO()
    }

    @Get("/api/v2/gender/")
    @Description("List genders")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun genderList(
         @QueryParam(value = "limit") limit: kotlin.Int?, 
         @QueryParam(value = "offset") offset: kotlin.Int?, 
         @QueryParam(value = "q") q: kotlin.String?
    ): PaginatedGenderSummaryList {
        TODO()
    }

    @Get("/api/v2/gender/{id}/")
    @Description("Get gender")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun genderRetrieve(
        @PathParam("id") id: kotlin.String
    ): GenderDetail {
        TODO()
    }

    @Get("/api/v2/growth-rate/")
    @Description("List growth rates")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun growthRateList(
         @QueryParam(value = "limit") limit: kotlin.Int?, 
         @QueryParam(value = "offset") offset: kotlin.Int?, 
         @QueryParam(value = "q") q: kotlin.String?
    ): PaginatedGrowthRateSummaryList {
        TODO()
    }

    @Get("/api/v2/growth-rate/{id}/")
    @Description("Get growth rate")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun growthRateRetrieve(
        @PathParam("id") id: kotlin.String
    ): GrowthRateDetail {
        TODO()
    }

    @Get("/api/v2/move-damage-class/")
    @Description("List move damage classes")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun moveDamageClassList(
         @QueryParam(value = "limit") limit: kotlin.Int?, 
         @QueryParam(value = "offset") offset: kotlin.Int?, 
         @QueryParam(value = "q") q: kotlin.String?
    ): PaginatedMoveDamageClassSummaryList {
        TODO()
    }

    @Get("/api/v2/move-damage-class/{id}/")
    @Description("Get move damage class")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun moveDamageClassRetrieve(
        @PathParam("id") id: kotlin.String
    ): MoveDamageClassDetail {
        TODO()
    }

    @Get("/api/v2/nature/")
    @Description("List natures")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun natureList(
         @QueryParam(value = "limit") limit: kotlin.Int?, 
         @QueryParam(value = "offset") offset: kotlin.Int?, 
         @QueryParam(value = "q") q: kotlin.String?
    ): PaginatedNatureSummaryList {
        TODO()
    }

    @Get("/api/v2/nature/{id}/")
    @Description("Get nature")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun natureRetrieve(
        @PathParam("id") id: kotlin.String
    ): NatureDetail {
        TODO()
    }

    @Get("/api/v2/pokeathlon-stat/")
    @Description("List pokeathlon stats")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun pokeathlonStatList(
         @QueryParam(value = "limit") limit: kotlin.Int?, 
         @QueryParam(value = "offset") offset: kotlin.Int?, 
         @QueryParam(value = "q") q: kotlin.String?
    ): PaginatedPokeathlonStatSummaryList {
        TODO()
    }

    @Get("/api/v2/pokeathlon-stat/{id}/")
    @Description("Get pokeathlon stat")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun pokeathlonStatRetrieve(
        @PathParam("id") id: kotlin.String
    ): PokeathlonStatDetail {
        TODO()
    }

    @Get("/api/v2/pokemon-color/")
    @Description("List pokemon colors")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun pokemonColorList(
         @QueryParam(value = "limit") limit: kotlin.Int?, 
         @QueryParam(value = "offset") offset: kotlin.Int?, 
         @QueryParam(value = "q") q: kotlin.String?
    ): PaginatedPokemonColorSummaryList {
        TODO()
    }

    @Get("/api/v2/pokemon-color/{id}/")
    @Description("Get pokemon color")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun pokemonColorRetrieve(
        @PathParam("id") id: kotlin.String
    ): PokemonColorDetail {
        TODO()
    }

    @Get("/api/v2/pokemon-form/")
    @Description("List pokemon forms")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun pokemonFormList(
         @QueryParam(value = "limit") limit: kotlin.Int?, 
         @QueryParam(value = "offset") offset: kotlin.Int?, 
         @QueryParam(value = "q") q: kotlin.String?
    ): PaginatedPokemonFormSummaryList {
        TODO()
    }

    @Get("/api/v2/pokemon-form/{id}/")
    @Description("Get pokemon form")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun pokemonFormRetrieve(
        @PathParam("id") id: kotlin.String
    ): PokemonFormDetail {
        TODO()
    }

    @Get("/api/v2/pokemon-habitat/")
    @Description("List pokemom habitas")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun pokemonHabitatList(
         @QueryParam(value = "limit") limit: kotlin.Int?, 
         @QueryParam(value = "offset") offset: kotlin.Int?, 
         @QueryParam(value = "q") q: kotlin.String?
    ): PaginatedPokemonHabitatSummaryList {
        TODO()
    }

    @Get("/api/v2/pokemon-habitat/{id}/")
    @Description("Get pokemom habita")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun pokemonHabitatRetrieve(
        @PathParam("id") id: kotlin.String
    ): PokemonHabitatDetail {
        TODO()
    }

    @Get("/api/v2/pokemon/")
    @Description("List pokemon")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun pokemonList(
         @QueryParam(value = "limit") limit: kotlin.Int?, 
         @QueryParam(value = "offset") offset: kotlin.Int?, 
         @QueryParam(value = "q") q: kotlin.String?
    ): PaginatedPokemonSummaryList {
        TODO()
    }

    @Get("/api/v2/pokemon/{id}/")
    @Description("Get pokemon")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun pokemonRetrieve(
        @PathParam("id") id: kotlin.String
    ): PokemonDetail {
        TODO()
    }

    @Get("/api/v2/pokemon-shape/")
    @Description("List pokemon shapes")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun pokemonShapeList(
         @QueryParam(value = "limit") limit: kotlin.Int?, 
         @QueryParam(value = "offset") offset: kotlin.Int?, 
         @QueryParam(value = "q") q: kotlin.String?
    ): PaginatedPokemonShapeSummaryList {
        TODO()
    }

    @Get("/api/v2/pokemon-shape/{id}/")
    @Description("Get pokemon shape")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun pokemonShapeRetrieve(
        @PathParam("id") id: kotlin.String
    ): PokemonShapeDetail {
        TODO()
    }

    @Get("/api/v2/pokemon-species/")
    @Description("List pokemon species")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun pokemonSpeciesList(
         @QueryParam(value = "limit") limit: kotlin.Int?, 
         @QueryParam(value = "offset") offset: kotlin.Int?, 
         @QueryParam(value = "q") q: kotlin.String?
    ): PaginatedPokemonSpeciesSummaryList {
        TODO()
    }

    @Get("/api/v2/pokemon-species/{id}/")
    @Description("Get pokemon species")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun pokemonSpeciesRetrieve(
        @PathParam("id") id: kotlin.String
    ): PokemonSpeciesDetail {
        TODO()
    }

    @Get("/api/v2/stat/")
    @Description("List stats")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun statList(
         @QueryParam(value = "limit") limit: kotlin.Int?, 
         @QueryParam(value = "offset") offset: kotlin.Int?, 
         @QueryParam(value = "q") q: kotlin.String?
    ): PaginatedStatSummaryList {
        TODO()
    }

    @Get("/api/v2/stat/{id}/")
    @Description("Get stat")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun statRetrieve(
        @PathParam("id") id: kotlin.String
    ): StatDetail {
        TODO()
    }

    @Get("/api/v2/type/")
    @Description("List types")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun typeList(
         @QueryParam(value = "limit") limit: kotlin.Int?, 
         @QueryParam(value = "offset") offset: kotlin.Int?, 
         @QueryParam(value = "q") q: kotlin.String?
    ): PaginatedTypeSummaryList {
        TODO()
    }

    @Get("/api/v2/type/{id}/")
    @Description("Get types")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun typeRetrieve(
        @PathParam("id") id: kotlin.String
    ): TypeDetail {
        TODO()
    }
}
