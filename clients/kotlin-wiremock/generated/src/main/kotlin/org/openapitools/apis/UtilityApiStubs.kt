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
open class UtilityApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation languageList.
     *
     * @param limit query parameter limit pattern.
     * @param offset query parameter offset pattern.
     * @param q query parameter q pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [LanguageListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun languageList(limit: StringValuePattern? = null, offset: StringValuePattern? = null, q: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): LanguageListStubBuilder =
        LanguageListStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/language/"))
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { offset?.let { withQueryParam("offset", it) } }
            .apply { q?.let { withQueryParam("q", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation languageRetrieve.
     *
     * @param id path parameter id pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [LanguageRetrieveStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun languageRetrieve(id: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): LanguageRetrieveStubBuilder =
        LanguageRetrieveStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/language/{id}/"))
            .withPathParam("id", id)
            .configurer()
        )
}
