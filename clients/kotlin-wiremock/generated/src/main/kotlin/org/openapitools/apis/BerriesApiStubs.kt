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
open class BerriesApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation berryFirmnessList.
     *
     * @param limit query parameter limit pattern.
     * @param offset query parameter offset pattern.
     * @param q query parameter q pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [BerryFirmnessListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun berryFirmnessList(limit: StringValuePattern? = null, offset: StringValuePattern? = null, q: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): BerryFirmnessListStubBuilder =
        BerryFirmnessListStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/berry-firmness/"))
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { offset?.let { withQueryParam("offset", it) } }
            .apply { q?.let { withQueryParam("q", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation berryFirmnessRetrieve.
     *
     * @param id path parameter id pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [BerryFirmnessRetrieveStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun berryFirmnessRetrieve(id: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): BerryFirmnessRetrieveStubBuilder =
        BerryFirmnessRetrieveStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/berry-firmness/{id}/"))
            .withPathParam("id", id)
            .configurer()
        )

    /**
     * Construct a stub for the operation berryFlavorList.
     *
     * @param limit query parameter limit pattern.
     * @param offset query parameter offset pattern.
     * @param q query parameter q pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [BerryFlavorListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun berryFlavorList(limit: StringValuePattern? = null, offset: StringValuePattern? = null, q: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): BerryFlavorListStubBuilder =
        BerryFlavorListStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/berry-flavor/"))
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { offset?.let { withQueryParam("offset", it) } }
            .apply { q?.let { withQueryParam("q", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation berryFlavorRetrieve.
     *
     * @param id path parameter id pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [BerryFlavorRetrieveStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun berryFlavorRetrieve(id: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): BerryFlavorRetrieveStubBuilder =
        BerryFlavorRetrieveStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/berry-flavor/{id}/"))
            .withPathParam("id", id)
            .configurer()
        )

    /**
     * Construct a stub for the operation berryList.
     *
     * @param limit query parameter limit pattern.
     * @param offset query parameter offset pattern.
     * @param q query parameter q pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [BerryListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun berryList(limit: StringValuePattern? = null, offset: StringValuePattern? = null, q: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): BerryListStubBuilder =
        BerryListStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/berry/"))
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { offset?.let { withQueryParam("offset", it) } }
            .apply { q?.let { withQueryParam("q", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation berryRetrieve.
     *
     * @param id path parameter id pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [BerryRetrieveStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun berryRetrieve(id: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): BerryRetrieveStubBuilder =
        BerryRetrieveStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/berry/{id}/"))
            .withPathParam("id", id)
            .configurer()
        )
}
