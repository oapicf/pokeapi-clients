@file:Suppress(
    "RemoveRedundantQualifierName",
    "UnusedImport",
    "unused",
)

package org.openapitools.apis

import com.fasterxml.jackson.databind.ObjectMapper
import com.github.tomakehurst.wiremock.client.MappingBuilder
import com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder
import com.github.tomakehurst.wiremock.client.WireMock.*
import com.github.tomakehurst.wiremock.matching.StringValuePattern
import org.openapitools.models.*

/**
 * WireMock stub request builder.
 */
open class ItemsApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation itemAttributeList.
     *
     * @param limit query parameter limit pattern.
     * @param offset query parameter offset pattern.
     * @param q query parameter q pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ItemAttributeListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun itemAttributeList(limit: StringValuePattern? = null, offset: StringValuePattern? = null, q: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): ItemAttributeListStubBuilder =
        ItemAttributeListStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/item-attribute/"))
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { offset?.let { withQueryParam("offset", it) } }
            .apply { q?.let { withQueryParam("q", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation itemAttributeRetrieve.
     *
     * @param id path parameter id pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ItemAttributeRetrieveStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun itemAttributeRetrieve(id: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): ItemAttributeRetrieveStubBuilder =
        ItemAttributeRetrieveStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/item-attribute/{id}/"))
            .withPathParam("id", id)
            .configurer()
        )

    /**
     * Construct a stub for the operation itemCategoryList.
     *
     * @param limit query parameter limit pattern.
     * @param offset query parameter offset pattern.
     * @param q query parameter q pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ItemCategoryListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun itemCategoryList(limit: StringValuePattern? = null, offset: StringValuePattern? = null, q: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): ItemCategoryListStubBuilder =
        ItemCategoryListStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/item-category/"))
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { offset?.let { withQueryParam("offset", it) } }
            .apply { q?.let { withQueryParam("q", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation itemCategoryRetrieve.
     *
     * @param id path parameter id pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ItemCategoryRetrieveStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun itemCategoryRetrieve(id: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): ItemCategoryRetrieveStubBuilder =
        ItemCategoryRetrieveStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/item-category/{id}/"))
            .withPathParam("id", id)
            .configurer()
        )

    /**
     * Construct a stub for the operation itemFlingEffectList.
     *
     * @param limit query parameter limit pattern.
     * @param offset query parameter offset pattern.
     * @param q query parameter q pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ItemFlingEffectListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun itemFlingEffectList(limit: StringValuePattern? = null, offset: StringValuePattern? = null, q: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): ItemFlingEffectListStubBuilder =
        ItemFlingEffectListStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/item-fling-effect/"))
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { offset?.let { withQueryParam("offset", it) } }
            .apply { q?.let { withQueryParam("q", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation itemFlingEffectRetrieve.
     *
     * @param id path parameter id pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ItemFlingEffectRetrieveStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun itemFlingEffectRetrieve(id: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): ItemFlingEffectRetrieveStubBuilder =
        ItemFlingEffectRetrieveStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/item-fling-effect/{id}/"))
            .withPathParam("id", id)
            .configurer()
        )

    /**
     * Construct a stub for the operation itemList.
     *
     * @param limit query parameter limit pattern.
     * @param offset query parameter offset pattern.
     * @param q query parameter q pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ItemListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun itemList(limit: StringValuePattern? = null, offset: StringValuePattern? = null, q: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): ItemListStubBuilder =
        ItemListStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/item/"))
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { offset?.let { withQueryParam("offset", it) } }
            .apply { q?.let { withQueryParam("q", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation itemPocketList.
     *
     * @param limit query parameter limit pattern.
     * @param offset query parameter offset pattern.
     * @param q query parameter q pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ItemPocketListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun itemPocketList(limit: StringValuePattern? = null, offset: StringValuePattern? = null, q: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): ItemPocketListStubBuilder =
        ItemPocketListStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/item-pocket/"))
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { offset?.let { withQueryParam("offset", it) } }
            .apply { q?.let { withQueryParam("q", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation itemPocketRetrieve.
     *
     * @param id path parameter id pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ItemPocketRetrieveStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun itemPocketRetrieve(id: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): ItemPocketRetrieveStubBuilder =
        ItemPocketRetrieveStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/item-pocket/{id}/"))
            .withPathParam("id", id)
            .configurer()
        )

    /**
     * Construct a stub for the operation itemRetrieve.
     *
     * @param id path parameter id pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ItemRetrieveStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun itemRetrieve(id: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): ItemRetrieveStubBuilder =
        ItemRetrieveStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/item/{id}/"))
            .withPathParam("id", id)
            .configurer()
        )
}
