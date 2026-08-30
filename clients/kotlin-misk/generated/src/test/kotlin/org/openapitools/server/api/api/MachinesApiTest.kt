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
import org.openapitools.server.api.model.MachineDetail
import org.openapitools.server.api.model.PaginatedMachineSummaryList

@MiskTest(startService = true)
internal class MachinesApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var machinesApi: MachinesApiAction

    /**
     * To test MachinesApiAction.machineList
     */
    @Test
    fun `should handle machineList`() {
        val limit = TODO()
        val offset = TODO()
        val q = TODO()
        val response: PaginatedMachineSummaryList = machinesApi.machineList(limit, offset, q)
    }

    /**
     * To test MachinesApiAction.machineRetrieve
     */
    @Test
    fun `should handle machineRetrieve`() {
        val id = TODO()
        val response: MachineDetail = machinesApi.machineRetrieve(id)
    }
}
