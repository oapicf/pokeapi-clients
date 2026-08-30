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
import org.openapitools.server.api.model.GenerationDetail
import org.openapitools.server.api.model.PaginatedGenerationSummaryList
import org.openapitools.server.api.model.PaginatedPokedexSummaryList
import org.openapitools.server.api.model.PaginatedVersionGroupSummaryList
import org.openapitools.server.api.model.PaginatedVersionSummaryList
import org.openapitools.server.api.model.PokedexDetail
import org.openapitools.server.api.model.VersionDetail
import org.openapitools.server.api.model.VersionGroupDetail

@MiskTest(startService = true)
internal class GamesApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var gamesApi: GamesApiAction

    /**
     * To test GamesApiAction.generationList
     */
    @Test
    fun `should handle generationList`() {
        val limit = TODO()
        val offset = TODO()
        val q = TODO()
        val response: PaginatedGenerationSummaryList = gamesApi.generationList(limit, offset, q)
    }

    /**
     * To test GamesApiAction.generationRetrieve
     */
    @Test
    fun `should handle generationRetrieve`() {
        val id = TODO()
        val response: GenerationDetail = gamesApi.generationRetrieve(id)
    }

    /**
     * To test GamesApiAction.pokedexList
     */
    @Test
    fun `should handle pokedexList`() {
        val limit = TODO()
        val offset = TODO()
        val q = TODO()
        val response: PaginatedPokedexSummaryList = gamesApi.pokedexList(limit, offset, q)
    }

    /**
     * To test GamesApiAction.pokedexRetrieve
     */
    @Test
    fun `should handle pokedexRetrieve`() {
        val id = TODO()
        val response: PokedexDetail = gamesApi.pokedexRetrieve(id)
    }

    /**
     * To test GamesApiAction.versionGroupList
     */
    @Test
    fun `should handle versionGroupList`() {
        val limit = TODO()
        val offset = TODO()
        val q = TODO()
        val response: PaginatedVersionGroupSummaryList = gamesApi.versionGroupList(limit, offset, q)
    }

    /**
     * To test GamesApiAction.versionGroupRetrieve
     */
    @Test
    fun `should handle versionGroupRetrieve`() {
        val id = TODO()
        val response: VersionGroupDetail = gamesApi.versionGroupRetrieve(id)
    }

    /**
     * To test GamesApiAction.versionList
     */
    @Test
    fun `should handle versionList`() {
        val limit = TODO()
        val offset = TODO()
        val q = TODO()
        val response: PaginatedVersionSummaryList = gamesApi.versionList(limit, offset, q)
    }

    /**
     * To test GamesApiAction.versionRetrieve
     */
    @Test
    fun `should handle versionRetrieve`() {
        val id = TODO()
        val response: VersionDetail = gamesApi.versionRetrieve(id)
    }
}
