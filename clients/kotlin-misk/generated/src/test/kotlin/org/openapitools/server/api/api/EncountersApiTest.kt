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
import org.openapitools.server.api.model.EncounterConditionDetail
import org.openapitools.server.api.model.EncounterConditionValueDetail
import org.openapitools.server.api.model.EncounterMethodDetail
import org.openapitools.server.api.model.PaginatedEncounterConditionSummaryList
import org.openapitools.server.api.model.PaginatedEncounterConditionValueSummaryList
import org.openapitools.server.api.model.PaginatedEncounterMethodSummaryList

@MiskTest(startService = true)
internal class EncountersApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var encountersApi: EncountersApiAction

    /**
     * To test EncountersApiAction.encounterConditionList
     */
    @Test
    fun `should handle encounterConditionList`() {
        val limit = TODO()
        val offset = TODO()
        val q = TODO()
        val response: PaginatedEncounterConditionSummaryList = encountersApi.encounterConditionList(limit, offset, q)
    }

    /**
     * To test EncountersApiAction.encounterConditionRetrieve
     */
    @Test
    fun `should handle encounterConditionRetrieve`() {
        val id = TODO()
        val response: EncounterConditionDetail = encountersApi.encounterConditionRetrieve(id)
    }

    /**
     * To test EncountersApiAction.encounterConditionValueList
     */
    @Test
    fun `should handle encounterConditionValueList`() {
        val limit = TODO()
        val offset = TODO()
        val q = TODO()
        val response: PaginatedEncounterConditionValueSummaryList = encountersApi.encounterConditionValueList(limit, offset, q)
    }

    /**
     * To test EncountersApiAction.encounterConditionValueRetrieve
     */
    @Test
    fun `should handle encounterConditionValueRetrieve`() {
        val id = TODO()
        val response: EncounterConditionValueDetail = encountersApi.encounterConditionValueRetrieve(id)
    }

    /**
     * To test EncountersApiAction.encounterMethodList
     */
    @Test
    fun `should handle encounterMethodList`() {
        val limit = TODO()
        val offset = TODO()
        val q = TODO()
        val response: PaginatedEncounterMethodSummaryList = encountersApi.encounterMethodList(limit, offset, q)
    }

    /**
     * To test EncountersApiAction.encounterMethodRetrieve
     */
    @Test
    fun `should handle encounterMethodRetrieve`() {
        val id = TODO()
        val response: EncounterMethodDetail = encountersApi.encounterMethodRetrieve(id)
    }
}
