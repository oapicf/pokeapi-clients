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
import org.openapitools.server.api.model.LanguageDetail
import org.openapitools.server.api.model.PaginatedLanguageSummaryList

@MiskTest(startService = true)
internal class UtilityApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var utilityApi: UtilityApiAction

    /**
     * To test UtilityApiAction.languageList
     */
    @Test
    fun `should handle languageList`() {
        val limit = TODO()
        val offset = TODO()
        val q = TODO()
        val response: PaginatedLanguageSummaryList = utilityApi.languageList(limit, offset, q)
    }

    /**
     * To test UtilityApiAction.languageRetrieve
     */
    @Test
    fun `should handle languageRetrieve`() {
        val id = TODO()
        val response: LanguageDetail = utilityApi.languageRetrieve(id)
    }
}
