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
import org.openapitools.server.api.model.LocationAreaDetail
import org.openapitools.server.api.model.LocationDetail
import org.openapitools.server.api.model.PaginatedLocationAreaSummaryList
import org.openapitools.server.api.model.PaginatedLocationSummaryList
import org.openapitools.server.api.model.PaginatedPalParkAreaSummaryList
import org.openapitools.server.api.model.PaginatedRegionSummaryList
import org.openapitools.server.api.model.PalParkAreaDetail
import org.openapitools.server.api.model.RegionDetail

@MiskTest(startService = true)
internal class LocationApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var locationApi: LocationApiAction

    /**
     * To test LocationApiAction.locationAreaList
     */
    @Test
    fun `should handle locationAreaList`() {
        val limit = TODO()
        val offset = TODO()
        val response: PaginatedLocationAreaSummaryList = locationApi.locationAreaList(limit, offset)
    }

    /**
     * To test LocationApiAction.locationAreaRetrieve
     */
    @Test
    fun `should handle locationAreaRetrieve`() {
        val id = TODO()
        val response: LocationAreaDetail = locationApi.locationAreaRetrieve(id)
    }

    /**
     * To test LocationApiAction.locationList
     */
    @Test
    fun `should handle locationList`() {
        val limit = TODO()
        val offset = TODO()
        val q = TODO()
        val response: PaginatedLocationSummaryList = locationApi.locationList(limit, offset, q)
    }

    /**
     * To test LocationApiAction.locationRetrieve
     */
    @Test
    fun `should handle locationRetrieve`() {
        val id = TODO()
        val response: LocationDetail = locationApi.locationRetrieve(id)
    }

    /**
     * To test LocationApiAction.palParkAreaList
     */
    @Test
    fun `should handle palParkAreaList`() {
        val limit = TODO()
        val offset = TODO()
        val q = TODO()
        val response: PaginatedPalParkAreaSummaryList = locationApi.palParkAreaList(limit, offset, q)
    }

    /**
     * To test LocationApiAction.palParkAreaRetrieve
     */
    @Test
    fun `should handle palParkAreaRetrieve`() {
        val id = TODO()
        val response: PalParkAreaDetail = locationApi.palParkAreaRetrieve(id)
    }

    /**
     * To test LocationApiAction.regionList
     */
    @Test
    fun `should handle regionList`() {
        val limit = TODO()
        val offset = TODO()
        val q = TODO()
        val response: PaginatedRegionSummaryList = locationApi.regionList(limit, offset, q)
    }

    /**
     * To test LocationApiAction.regionRetrieve
     */
    @Test
    fun `should handle regionRetrieve`() {
        val id = TODO()
        val response: RegionDetail = locationApi.regionRetrieve(id)
    }
}
