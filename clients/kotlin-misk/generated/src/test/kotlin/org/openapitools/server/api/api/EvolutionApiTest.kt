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
import org.openapitools.server.api.model.EvolutionChainDetail
import org.openapitools.server.api.model.EvolutionTriggerDetail
import org.openapitools.server.api.model.PaginatedEvolutionChainSummaryList
import org.openapitools.server.api.model.PaginatedEvolutionTriggerSummaryList

@MiskTest(startService = true)
internal class EvolutionApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var evolutionApi: EvolutionApiAction

    /**
     * To test EvolutionApiAction.evolutionChainList
     */
    @Test
    fun `should handle evolutionChainList`() {
        val limit = TODO()
        val offset = TODO()
        val q = TODO()
        val response: PaginatedEvolutionChainSummaryList = evolutionApi.evolutionChainList(limit, offset, q)
    }

    /**
     * To test EvolutionApiAction.evolutionChainRetrieve
     */
    @Test
    fun `should handle evolutionChainRetrieve`() {
        val id = TODO()
        val response: EvolutionChainDetail = evolutionApi.evolutionChainRetrieve(id)
    }

    /**
     * To test EvolutionApiAction.evolutionTriggerList
     */
    @Test
    fun `should handle evolutionTriggerList`() {
        val limit = TODO()
        val offset = TODO()
        val q = TODO()
        val response: PaginatedEvolutionTriggerSummaryList = evolutionApi.evolutionTriggerList(limit, offset, q)
    }

    /**
     * To test EvolutionApiAction.evolutionTriggerRetrieve
     */
    @Test
    fun `should handle evolutionTriggerRetrieve`() {
        val id = TODO()
        val response: EvolutionTriggerDetail = evolutionApi.evolutionTriggerRetrieve(id)
    }
}
