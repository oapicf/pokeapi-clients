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
open class ContestsApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation contestEffectList.
     *
     * @param limit query parameter limit pattern.
     * @param offset query parameter offset pattern.
     * @param q query parameter q pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ContestEffectListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun contestEffectList(limit: StringValuePattern? = null, offset: StringValuePattern? = null, q: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): ContestEffectListStubBuilder =
        ContestEffectListStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/contest-effect/"))
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { offset?.let { withQueryParam("offset", it) } }
            .apply { q?.let { withQueryParam("q", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation contestEffectRetrieve.
     *
     * @param id path parameter id pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ContestEffectRetrieveStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun contestEffectRetrieve(id: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): ContestEffectRetrieveStubBuilder =
        ContestEffectRetrieveStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/contest-effect/{id}/"))
            .withPathParam("id", id)
            .configurer()
        )

    /**
     * Construct a stub for the operation contestTypeList.
     *
     * @param limit query parameter limit pattern.
     * @param offset query parameter offset pattern.
     * @param q query parameter q pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ContestTypeListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun contestTypeList(limit: StringValuePattern? = null, offset: StringValuePattern? = null, q: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): ContestTypeListStubBuilder =
        ContestTypeListStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/contest-type/"))
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { offset?.let { withQueryParam("offset", it) } }
            .apply { q?.let { withQueryParam("q", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation contestTypeRetrieve.
     *
     * @param id path parameter id pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ContestTypeRetrieveStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun contestTypeRetrieve(id: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): ContestTypeRetrieveStubBuilder =
        ContestTypeRetrieveStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/contest-type/{id}/"))
            .withPathParam("id", id)
            .configurer()
        )

    /**
     * Construct a stub for the operation superContestEffectList.
     *
     * @param limit query parameter limit pattern.
     * @param offset query parameter offset pattern.
     * @param q query parameter q pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [SuperContestEffectListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun superContestEffectList(limit: StringValuePattern? = null, offset: StringValuePattern? = null, q: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): SuperContestEffectListStubBuilder =
        SuperContestEffectListStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/super-contest-effect/"))
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { offset?.let { withQueryParam("offset", it) } }
            .apply { q?.let { withQueryParam("q", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation superContestEffectRetrieve.
     *
     * @param id path parameter id pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [SuperContestEffectRetrieveStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun superContestEffectRetrieve(id: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): SuperContestEffectRetrieveStubBuilder =
        SuperContestEffectRetrieveStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/super-contest-effect/{id}/"))
            .withPathParam("id", id)
            .configurer()
        )
}
