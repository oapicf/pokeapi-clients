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
import org.openapitools.server.api.model.MoveBattleStyleDetail
import org.openapitools.server.api.model.MoveDetail
import org.openapitools.server.api.model.MoveLearnMethodDetail
import org.openapitools.server.api.model.MoveMetaAilmentDetail
import org.openapitools.server.api.model.MoveMetaCategoryDetail
import org.openapitools.server.api.model.MoveTargetDetail
import org.openapitools.server.api.model.PaginatedMoveBattleStyleSummaryList
import org.openapitools.server.api.model.PaginatedMoveLearnMethodSummaryList
import org.openapitools.server.api.model.PaginatedMoveMetaAilmentSummaryList
import org.openapitools.server.api.model.PaginatedMoveMetaCategorySummaryList
import org.openapitools.server.api.model.PaginatedMoveSummaryList
import org.openapitools.server.api.model.PaginatedMoveTargetSummaryList

@MiskTest(startService = true)
internal class MovesApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var movesApi: MovesApiAction

    /**
     * To test MovesApiAction.moveAilmentList
     */
    @Test
    fun `should handle moveAilmentList`() {
        val limit = TODO()
        val offset = TODO()
        val q = TODO()
        val response: PaginatedMoveMetaAilmentSummaryList = movesApi.moveAilmentList(limit, offset, q)
    }

    /**
     * To test MovesApiAction.moveAilmentRetrieve
     */
    @Test
    fun `should handle moveAilmentRetrieve`() {
        val id = TODO()
        val response: MoveMetaAilmentDetail = movesApi.moveAilmentRetrieve(id)
    }

    /**
     * To test MovesApiAction.moveBattleStyleList
     */
    @Test
    fun `should handle moveBattleStyleList`() {
        val limit = TODO()
        val offset = TODO()
        val q = TODO()
        val response: PaginatedMoveBattleStyleSummaryList = movesApi.moveBattleStyleList(limit, offset, q)
    }

    /**
     * To test MovesApiAction.moveBattleStyleRetrieve
     */
    @Test
    fun `should handle moveBattleStyleRetrieve`() {
        val id = TODO()
        val response: MoveBattleStyleDetail = movesApi.moveBattleStyleRetrieve(id)
    }

    /**
     * To test MovesApiAction.moveCategoryList
     */
    @Test
    fun `should handle moveCategoryList`() {
        val limit = TODO()
        val offset = TODO()
        val q = TODO()
        val response: PaginatedMoveMetaCategorySummaryList = movesApi.moveCategoryList(limit, offset, q)
    }

    /**
     * To test MovesApiAction.moveCategoryRetrieve
     */
    @Test
    fun `should handle moveCategoryRetrieve`() {
        val id = TODO()
        val response: MoveMetaCategoryDetail = movesApi.moveCategoryRetrieve(id)
    }

    /**
     * To test MovesApiAction.moveLearnMethodList
     */
    @Test
    fun `should handle moveLearnMethodList`() {
        val limit = TODO()
        val offset = TODO()
        val q = TODO()
        val response: PaginatedMoveLearnMethodSummaryList = movesApi.moveLearnMethodList(limit, offset, q)
    }

    /**
     * To test MovesApiAction.moveLearnMethodRetrieve
     */
    @Test
    fun `should handle moveLearnMethodRetrieve`() {
        val id = TODO()
        val response: MoveLearnMethodDetail = movesApi.moveLearnMethodRetrieve(id)
    }

    /**
     * To test MovesApiAction.moveList
     */
    @Test
    fun `should handle moveList`() {
        val limit = TODO()
        val offset = TODO()
        val q = TODO()
        val response: PaginatedMoveSummaryList = movesApi.moveList(limit, offset, q)
    }

    /**
     * To test MovesApiAction.moveRetrieve
     */
    @Test
    fun `should handle moveRetrieve`() {
        val id = TODO()
        val response: MoveDetail = movesApi.moveRetrieve(id)
    }

    /**
     * To test MovesApiAction.moveTargetList
     */
    @Test
    fun `should handle moveTargetList`() {
        val limit = TODO()
        val offset = TODO()
        val q = TODO()
        val response: PaginatedMoveTargetSummaryList = movesApi.moveTargetList(limit, offset, q)
    }

    /**
     * To test MovesApiAction.moveTargetRetrieve
     */
    @Test
    fun `should handle moveTargetRetrieve`() {
        val id = TODO()
        val response: MoveTargetDetail = movesApi.moveTargetRetrieve(id)
    }
}
