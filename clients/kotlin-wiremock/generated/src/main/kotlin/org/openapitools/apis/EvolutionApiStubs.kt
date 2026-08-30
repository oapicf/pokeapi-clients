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
open class EvolutionApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation evolutionChainList.
     *
     * @param limit query parameter limit pattern.
     * @param offset query parameter offset pattern.
     * @param q query parameter q pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [EvolutionChainListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun evolutionChainList(limit: StringValuePattern? = null, offset: StringValuePattern? = null, q: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): EvolutionChainListStubBuilder =
        EvolutionChainListStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/evolution-chain/"))
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { offset?.let { withQueryParam("offset", it) } }
            .apply { q?.let { withQueryParam("q", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation evolutionChainRetrieve.
     *
     * @param id path parameter id pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [EvolutionChainRetrieveStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun evolutionChainRetrieve(id: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): EvolutionChainRetrieveStubBuilder =
        EvolutionChainRetrieveStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/evolution-chain/{id}/"))
            .withPathParam("id", id)
            .configurer()
        )

    /**
     * Construct a stub for the operation evolutionTriggerList.
     *
     * @param limit query parameter limit pattern.
     * @param offset query parameter offset pattern.
     * @param q query parameter q pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [EvolutionTriggerListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun evolutionTriggerList(limit: StringValuePattern? = null, offset: StringValuePattern? = null, q: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): EvolutionTriggerListStubBuilder =
        EvolutionTriggerListStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/evolution-trigger/"))
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { offset?.let { withQueryParam("offset", it) } }
            .apply { q?.let { withQueryParam("q", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation evolutionTriggerRetrieve.
     *
     * @param id path parameter id pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [EvolutionTriggerRetrieveStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun evolutionTriggerRetrieve(id: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): EvolutionTriggerRetrieveStubBuilder =
        EvolutionTriggerRetrieveStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/evolution-trigger/{id}/"))
            .withPathParam("id", id)
            .configurer()
        )
}
