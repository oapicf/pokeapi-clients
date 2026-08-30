package org.openapitools.server.api.api

import misk.testing.MiskTestModule
import jakarta.inject.Inject
import misk.testing.MiskTest
import misk.testing.MiskTestModule
import org.junit.jupiter.api.Test
import misk.web.HttpCall
import misk.web.PathParam
import misk.web.QueryParam
import misk.web.RequestBody
import misk.web.RequestHeader
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

@MiskTest(startService = true)
internal class PokemonApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var pokemonApi: PokemonApiAction

    /**
     * To test PokemonApiAction.abilityList
     */
    @Test
    fun `should handle abilityList`() {
        val limit = TODO()
        val offset = TODO()
        val q = TODO()
        val response: PaginatedAbilitySummaryList = pokemonApi.abilityList(limit, offset, q)
    }

    /**
     * To test PokemonApiAction.abilityRetrieve
     */
    @Test
    fun `should handle abilityRetrieve`() {
        val id = TODO()
        val response: AbilityDetail = pokemonApi.abilityRetrieve(id)
    }

    /**
     * To test PokemonApiAction.characteristicList
     */
    @Test
    fun `should handle characteristicList`() {
        val limit = TODO()
        val offset = TODO()
        val q = TODO()
        val response: PaginatedCharacteristicSummaryList = pokemonApi.characteristicList(limit, offset, q)
    }

    /**
     * To test PokemonApiAction.characteristicRetrieve
     */
    @Test
    fun `should handle characteristicRetrieve`() {
        val id = TODO()
        val response: CharacteristicDetail = pokemonApi.characteristicRetrieve(id)
    }

    /**
     * To test PokemonApiAction.eggGroupList
     */
    @Test
    fun `should handle eggGroupList`() {
        val limit = TODO()
        val offset = TODO()
        val q = TODO()
        val response: PaginatedEggGroupSummaryList = pokemonApi.eggGroupList(limit, offset, q)
    }

    /**
     * To test PokemonApiAction.eggGroupRetrieve
     */
    @Test
    fun `should handle eggGroupRetrieve`() {
        val id = TODO()
        val response: EggGroupDetail = pokemonApi.eggGroupRetrieve(id)
    }

    /**
     * To test PokemonApiAction.genderList
     */
    @Test
    fun `should handle genderList`() {
        val limit = TODO()
        val offset = TODO()
        val q = TODO()
        val response: PaginatedGenderSummaryList = pokemonApi.genderList(limit, offset, q)
    }

    /**
     * To test PokemonApiAction.genderRetrieve
     */
    @Test
    fun `should handle genderRetrieve`() {
        val id = TODO()
        val response: GenderDetail = pokemonApi.genderRetrieve(id)
    }

    /**
     * To test PokemonApiAction.growthRateList
     */
    @Test
    fun `should handle growthRateList`() {
        val limit = TODO()
        val offset = TODO()
        val q = TODO()
        val response: PaginatedGrowthRateSummaryList = pokemonApi.growthRateList(limit, offset, q)
    }

    /**
     * To test PokemonApiAction.growthRateRetrieve
     */
    @Test
    fun `should handle growthRateRetrieve`() {
        val id = TODO()
        val response: GrowthRateDetail = pokemonApi.growthRateRetrieve(id)
    }

    /**
     * To test PokemonApiAction.moveDamageClassList
     */
    @Test
    fun `should handle moveDamageClassList`() {
        val limit = TODO()
        val offset = TODO()
        val q = TODO()
        val response: PaginatedMoveDamageClassSummaryList = pokemonApi.moveDamageClassList(limit, offset, q)
    }

    /**
     * To test PokemonApiAction.moveDamageClassRetrieve
     */
    @Test
    fun `should handle moveDamageClassRetrieve`() {
        val id = TODO()
        val response: MoveDamageClassDetail = pokemonApi.moveDamageClassRetrieve(id)
    }

    /**
     * To test PokemonApiAction.natureList
     */
    @Test
    fun `should handle natureList`() {
        val limit = TODO()
        val offset = TODO()
        val q = TODO()
        val response: PaginatedNatureSummaryList = pokemonApi.natureList(limit, offset, q)
    }

    /**
     * To test PokemonApiAction.natureRetrieve
     */
    @Test
    fun `should handle natureRetrieve`() {
        val id = TODO()
        val response: NatureDetail = pokemonApi.natureRetrieve(id)
    }

    /**
     * To test PokemonApiAction.pokeathlonStatList
     */
    @Test
    fun `should handle pokeathlonStatList`() {
        val limit = TODO()
        val offset = TODO()
        val q = TODO()
        val response: PaginatedPokeathlonStatSummaryList = pokemonApi.pokeathlonStatList(limit, offset, q)
    }

    /**
     * To test PokemonApiAction.pokeathlonStatRetrieve
     */
    @Test
    fun `should handle pokeathlonStatRetrieve`() {
        val id = TODO()
        val response: PokeathlonStatDetail = pokemonApi.pokeathlonStatRetrieve(id)
    }

    /**
     * To test PokemonApiAction.pokemonColorList
     */
    @Test
    fun `should handle pokemonColorList`() {
        val limit = TODO()
        val offset = TODO()
        val q = TODO()
        val response: PaginatedPokemonColorSummaryList = pokemonApi.pokemonColorList(limit, offset, q)
    }

    /**
     * To test PokemonApiAction.pokemonColorRetrieve
     */
    @Test
    fun `should handle pokemonColorRetrieve`() {
        val id = TODO()
        val response: PokemonColorDetail = pokemonApi.pokemonColorRetrieve(id)
    }

    /**
     * To test PokemonApiAction.pokemonFormList
     */
    @Test
    fun `should handle pokemonFormList`() {
        val limit = TODO()
        val offset = TODO()
        val q = TODO()
        val response: PaginatedPokemonFormSummaryList = pokemonApi.pokemonFormList(limit, offset, q)
    }

    /**
     * To test PokemonApiAction.pokemonFormRetrieve
     */
    @Test
    fun `should handle pokemonFormRetrieve`() {
        val id = TODO()
        val response: PokemonFormDetail = pokemonApi.pokemonFormRetrieve(id)
    }

    /**
     * To test PokemonApiAction.pokemonHabitatList
     */
    @Test
    fun `should handle pokemonHabitatList`() {
        val limit = TODO()
        val offset = TODO()
        val q = TODO()
        val response: PaginatedPokemonHabitatSummaryList = pokemonApi.pokemonHabitatList(limit, offset, q)
    }

    /**
     * To test PokemonApiAction.pokemonHabitatRetrieve
     */
    @Test
    fun `should handle pokemonHabitatRetrieve`() {
        val id = TODO()
        val response: PokemonHabitatDetail = pokemonApi.pokemonHabitatRetrieve(id)
    }

    /**
     * To test PokemonApiAction.pokemonList
     */
    @Test
    fun `should handle pokemonList`() {
        val limit = TODO()
        val offset = TODO()
        val q = TODO()
        val response: PaginatedPokemonSummaryList = pokemonApi.pokemonList(limit, offset, q)
    }

    /**
     * To test PokemonApiAction.pokemonRetrieve
     */
    @Test
    fun `should handle pokemonRetrieve`() {
        val id = TODO()
        val response: PokemonDetail = pokemonApi.pokemonRetrieve(id)
    }

    /**
     * To test PokemonApiAction.pokemonShapeList
     */
    @Test
    fun `should handle pokemonShapeList`() {
        val limit = TODO()
        val offset = TODO()
        val q = TODO()
        val response: PaginatedPokemonShapeSummaryList = pokemonApi.pokemonShapeList(limit, offset, q)
    }

    /**
     * To test PokemonApiAction.pokemonShapeRetrieve
     */
    @Test
    fun `should handle pokemonShapeRetrieve`() {
        val id = TODO()
        val response: PokemonShapeDetail = pokemonApi.pokemonShapeRetrieve(id)
    }

    /**
     * To test PokemonApiAction.pokemonSpeciesList
     */
    @Test
    fun `should handle pokemonSpeciesList`() {
        val limit = TODO()
        val offset = TODO()
        val q = TODO()
        val response: PaginatedPokemonSpeciesSummaryList = pokemonApi.pokemonSpeciesList(limit, offset, q)
    }

    /**
     * To test PokemonApiAction.pokemonSpeciesRetrieve
     */
    @Test
    fun `should handle pokemonSpeciesRetrieve`() {
        val id = TODO()
        val response: PokemonSpeciesDetail = pokemonApi.pokemonSpeciesRetrieve(id)
    }

    /**
     * To test PokemonApiAction.statList
     */
    @Test
    fun `should handle statList`() {
        val limit = TODO()
        val offset = TODO()
        val q = TODO()
        val response: PaginatedStatSummaryList = pokemonApi.statList(limit, offset, q)
    }

    /**
     * To test PokemonApiAction.statRetrieve
     */
    @Test
    fun `should handle statRetrieve`() {
        val id = TODO()
        val response: StatDetail = pokemonApi.statRetrieve(id)
    }

    /**
     * To test PokemonApiAction.typeList
     */
    @Test
    fun `should handle typeList`() {
        val limit = TODO()
        val offset = TODO()
        val q = TODO()
        val response: PaginatedTypeSummaryList = pokemonApi.typeList(limit, offset, q)
    }

    /**
     * To test PokemonApiAction.typeRetrieve
     */
    @Test
    fun `should handle typeRetrieve`() {
        val id = TODO()
        val response: TypeDetail = pokemonApi.typeRetrieve(id)
    }
}
