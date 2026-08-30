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
import org.openapitools.server.api.model.BerryDetail
import org.openapitools.server.api.model.BerryFirmnessDetail
import org.openapitools.server.api.model.BerryFlavorDetail
import org.openapitools.server.api.model.PaginatedBerryFirmnessSummaryList
import org.openapitools.server.api.model.PaginatedBerryFlavorSummaryList
import org.openapitools.server.api.model.PaginatedBerrySummaryList

@MiskTest(startService = true)
internal class BerriesApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var berriesApi: BerriesApiAction

    /**
     * To test BerriesApiAction.berryFirmnessList
     */
    @Test
    fun `should handle berryFirmnessList`() {
        val limit = TODO()
        val offset = TODO()
        val q = TODO()
        val response: PaginatedBerryFirmnessSummaryList = berriesApi.berryFirmnessList(limit, offset, q)
    }

    /**
     * To test BerriesApiAction.berryFirmnessRetrieve
     */
    @Test
    fun `should handle berryFirmnessRetrieve`() {
        val id = TODO()
        val response: BerryFirmnessDetail = berriesApi.berryFirmnessRetrieve(id)
    }

    /**
     * To test BerriesApiAction.berryFlavorList
     */
    @Test
    fun `should handle berryFlavorList`() {
        val limit = TODO()
        val offset = TODO()
        val q = TODO()
        val response: PaginatedBerryFlavorSummaryList = berriesApi.berryFlavorList(limit, offset, q)
    }

    /**
     * To test BerriesApiAction.berryFlavorRetrieve
     */
    @Test
    fun `should handle berryFlavorRetrieve`() {
        val id = TODO()
        val response: BerryFlavorDetail = berriesApi.berryFlavorRetrieve(id)
    }

    /**
     * To test BerriesApiAction.berryList
     */
    @Test
    fun `should handle berryList`() {
        val limit = TODO()
        val offset = TODO()
        val q = TODO()
        val response: PaginatedBerrySummaryList = berriesApi.berryList(limit, offset, q)
    }

    /**
     * To test BerriesApiAction.berryRetrieve
     */
    @Test
    fun `should handle berryRetrieve`() {
        val id = TODO()
        val response: BerryDetail = berriesApi.berryRetrieve(id)
    }
}
