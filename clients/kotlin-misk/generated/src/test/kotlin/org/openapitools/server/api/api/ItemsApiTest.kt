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
import org.openapitools.server.api.model.ItemAttributeDetail
import org.openapitools.server.api.model.ItemCategoryDetail
import org.openapitools.server.api.model.ItemDetail
import org.openapitools.server.api.model.ItemFlingEffectDetail
import org.openapitools.server.api.model.ItemPocketDetail
import org.openapitools.server.api.model.PaginatedItemAttributeSummaryList
import org.openapitools.server.api.model.PaginatedItemCategorySummaryList
import org.openapitools.server.api.model.PaginatedItemFlingEffectSummaryList
import org.openapitools.server.api.model.PaginatedItemPocketSummaryList
import org.openapitools.server.api.model.PaginatedItemSummaryList

@MiskTest(startService = true)
internal class ItemsApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var itemsApi: ItemsApiAction

    /**
     * To test ItemsApiAction.itemAttributeList
     */
    @Test
    fun `should handle itemAttributeList`() {
        val limit = TODO()
        val offset = TODO()
        val q = TODO()
        val response: PaginatedItemAttributeSummaryList = itemsApi.itemAttributeList(limit, offset, q)
    }

    /**
     * To test ItemsApiAction.itemAttributeRetrieve
     */
    @Test
    fun `should handle itemAttributeRetrieve`() {
        val id = TODO()
        val response: ItemAttributeDetail = itemsApi.itemAttributeRetrieve(id)
    }

    /**
     * To test ItemsApiAction.itemCategoryList
     */
    @Test
    fun `should handle itemCategoryList`() {
        val limit = TODO()
        val offset = TODO()
        val q = TODO()
        val response: PaginatedItemCategorySummaryList = itemsApi.itemCategoryList(limit, offset, q)
    }

    /**
     * To test ItemsApiAction.itemCategoryRetrieve
     */
    @Test
    fun `should handle itemCategoryRetrieve`() {
        val id = TODO()
        val response: ItemCategoryDetail = itemsApi.itemCategoryRetrieve(id)
    }

    /**
     * To test ItemsApiAction.itemFlingEffectList
     */
    @Test
    fun `should handle itemFlingEffectList`() {
        val limit = TODO()
        val offset = TODO()
        val q = TODO()
        val response: PaginatedItemFlingEffectSummaryList = itemsApi.itemFlingEffectList(limit, offset, q)
    }

    /**
     * To test ItemsApiAction.itemFlingEffectRetrieve
     */
    @Test
    fun `should handle itemFlingEffectRetrieve`() {
        val id = TODO()
        val response: ItemFlingEffectDetail = itemsApi.itemFlingEffectRetrieve(id)
    }

    /**
     * To test ItemsApiAction.itemList
     */
    @Test
    fun `should handle itemList`() {
        val limit = TODO()
        val offset = TODO()
        val q = TODO()
        val response: PaginatedItemSummaryList = itemsApi.itemList(limit, offset, q)
    }

    /**
     * To test ItemsApiAction.itemPocketList
     */
    @Test
    fun `should handle itemPocketList`() {
        val limit = TODO()
        val offset = TODO()
        val q = TODO()
        val response: PaginatedItemPocketSummaryList = itemsApi.itemPocketList(limit, offset, q)
    }

    /**
     * To test ItemsApiAction.itemPocketRetrieve
     */
    @Test
    fun `should handle itemPocketRetrieve`() {
        val id = TODO()
        val response: ItemPocketDetail = itemsApi.itemPocketRetrieve(id)
    }

    /**
     * To test ItemsApiAction.itemRetrieve
     */
    @Test
    fun `should handle itemRetrieve`() {
        val id = TODO()
        val response: ItemDetail = itemsApi.itemRetrieve(id)
    }
}
