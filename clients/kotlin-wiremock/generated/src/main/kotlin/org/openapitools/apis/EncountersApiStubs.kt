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
open class EncountersApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation encounterConditionList.
     *
     * @param limit query parameter limit pattern.
     * @param offset query parameter offset pattern.
     * @param q query parameter q pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [EncounterConditionListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun encounterConditionList(limit: StringValuePattern? = null, offset: StringValuePattern? = null, q: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): EncounterConditionListStubBuilder =
        EncounterConditionListStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/encounter-condition/"))
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { offset?.let { withQueryParam("offset", it) } }
            .apply { q?.let { withQueryParam("q", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation encounterConditionRetrieve.
     *
     * @param id path parameter id pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [EncounterConditionRetrieveStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun encounterConditionRetrieve(id: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): EncounterConditionRetrieveStubBuilder =
        EncounterConditionRetrieveStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/encounter-condition/{id}/"))
            .withPathParam("id", id)
            .configurer()
        )

    /**
     * Construct a stub for the operation encounterConditionValueList.
     *
     * @param limit query parameter limit pattern.
     * @param offset query parameter offset pattern.
     * @param q query parameter q pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [EncounterConditionValueListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun encounterConditionValueList(limit: StringValuePattern? = null, offset: StringValuePattern? = null, q: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): EncounterConditionValueListStubBuilder =
        EncounterConditionValueListStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/encounter-condition-value/"))
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { offset?.let { withQueryParam("offset", it) } }
            .apply { q?.let { withQueryParam("q", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation encounterConditionValueRetrieve.
     *
     * @param id path parameter id pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [EncounterConditionValueRetrieveStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun encounterConditionValueRetrieve(id: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): EncounterConditionValueRetrieveStubBuilder =
        EncounterConditionValueRetrieveStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/encounter-condition-value/{id}/"))
            .withPathParam("id", id)
            .configurer()
        )

    /**
     * Construct a stub for the operation encounterMethodList.
     *
     * @param limit query parameter limit pattern.
     * @param offset query parameter offset pattern.
     * @param q query parameter q pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [EncounterMethodListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun encounterMethodList(limit: StringValuePattern? = null, offset: StringValuePattern? = null, q: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): EncounterMethodListStubBuilder =
        EncounterMethodListStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/encounter-method/"))
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { offset?.let { withQueryParam("offset", it) } }
            .apply { q?.let { withQueryParam("q", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation encounterMethodRetrieve.
     *
     * @param id path parameter id pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [EncounterMethodRetrieveStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun encounterMethodRetrieve(id: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): EncounterMethodRetrieveStubBuilder =
        EncounterMethodRetrieveStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/encounter-method/{id}/"))
            .withPathParam("id", id)
            .configurer()
        )
}
