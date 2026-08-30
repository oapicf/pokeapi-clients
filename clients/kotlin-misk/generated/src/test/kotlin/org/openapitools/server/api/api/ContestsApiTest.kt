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
import org.openapitools.server.api.model.ContestEffectDetail
import org.openapitools.server.api.model.ContestTypeDetail
import org.openapitools.server.api.model.PaginatedContestEffectSummaryList
import org.openapitools.server.api.model.PaginatedContestTypeSummaryList
import org.openapitools.server.api.model.PaginatedSuperContestEffectSummaryList
import org.openapitools.server.api.model.SuperContestEffectDetail

@MiskTest(startService = true)
internal class ContestsApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var contestsApi: ContestsApiAction

    /**
     * To test ContestsApiAction.contestEffectList
     */
    @Test
    fun `should handle contestEffectList`() {
        val limit = TODO()
        val offset = TODO()
        val q = TODO()
        val response: PaginatedContestEffectSummaryList = contestsApi.contestEffectList(limit, offset, q)
    }

    /**
     * To test ContestsApiAction.contestEffectRetrieve
     */
    @Test
    fun `should handle contestEffectRetrieve`() {
        val id = TODO()
        val response: ContestEffectDetail = contestsApi.contestEffectRetrieve(id)
    }

    /**
     * To test ContestsApiAction.contestTypeList
     */
    @Test
    fun `should handle contestTypeList`() {
        val limit = TODO()
        val offset = TODO()
        val q = TODO()
        val response: PaginatedContestTypeSummaryList = contestsApi.contestTypeList(limit, offset, q)
    }

    /**
     * To test ContestsApiAction.contestTypeRetrieve
     */
    @Test
    fun `should handle contestTypeRetrieve`() {
        val id = TODO()
        val response: ContestTypeDetail = contestsApi.contestTypeRetrieve(id)
    }

    /**
     * To test ContestsApiAction.superContestEffectList
     */
    @Test
    fun `should handle superContestEffectList`() {
        val limit = TODO()
        val offset = TODO()
        val q = TODO()
        val response: PaginatedSuperContestEffectSummaryList = contestsApi.superContestEffectList(limit, offset, q)
    }

    /**
     * To test ContestsApiAction.superContestEffectRetrieve
     */
    @Test
    fun `should handle superContestEffectRetrieve`() {
        val id = TODO()
        val response: SuperContestEffectDetail = contestsApi.superContestEffectRetrieve(id)
    }
}
