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
open class GamesApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation generationList.
     *
     * @param limit query parameter limit pattern.
     * @param offset query parameter offset pattern.
     * @param q query parameter q pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GenerationListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun generationList(limit: StringValuePattern? = null, offset: StringValuePattern? = null, q: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GenerationListStubBuilder =
        GenerationListStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/generation/"))
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { offset?.let { withQueryParam("offset", it) } }
            .apply { q?.let { withQueryParam("q", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation generationRetrieve.
     *
     * @param id path parameter id pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GenerationRetrieveStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun generationRetrieve(id: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GenerationRetrieveStubBuilder =
        GenerationRetrieveStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/generation/{id}/"))
            .withPathParam("id", id)
            .configurer()
        )

    /**
     * Construct a stub for the operation pokedexList.
     *
     * @param limit query parameter limit pattern.
     * @param offset query parameter offset pattern.
     * @param q query parameter q pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PokedexListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun pokedexList(limit: StringValuePattern? = null, offset: StringValuePattern? = null, q: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): PokedexListStubBuilder =
        PokedexListStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/pokedex/"))
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { offset?.let { withQueryParam("offset", it) } }
            .apply { q?.let { withQueryParam("q", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation pokedexRetrieve.
     *
     * @param id path parameter id pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PokedexRetrieveStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun pokedexRetrieve(id: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): PokedexRetrieveStubBuilder =
        PokedexRetrieveStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/pokedex/{id}/"))
            .withPathParam("id", id)
            .configurer()
        )

    /**
     * Construct a stub for the operation versionGroupList.
     *
     * @param limit query parameter limit pattern.
     * @param offset query parameter offset pattern.
     * @param q query parameter q pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [VersionGroupListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun versionGroupList(limit: StringValuePattern? = null, offset: StringValuePattern? = null, q: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): VersionGroupListStubBuilder =
        VersionGroupListStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/version-group/"))
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { offset?.let { withQueryParam("offset", it) } }
            .apply { q?.let { withQueryParam("q", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation versionGroupRetrieve.
     *
     * @param id path parameter id pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [VersionGroupRetrieveStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun versionGroupRetrieve(id: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): VersionGroupRetrieveStubBuilder =
        VersionGroupRetrieveStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/version-group/{id}/"))
            .withPathParam("id", id)
            .configurer()
        )

    /**
     * Construct a stub for the operation versionList.
     *
     * @param limit query parameter limit pattern.
     * @param offset query parameter offset pattern.
     * @param q query parameter q pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [VersionListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun versionList(limit: StringValuePattern? = null, offset: StringValuePattern? = null, q: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): VersionListStubBuilder =
        VersionListStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/version/"))
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { offset?.let { withQueryParam("offset", it) } }
            .apply { q?.let { withQueryParam("q", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation versionRetrieve.
     *
     * @param id path parameter id pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [VersionRetrieveStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun versionRetrieve(id: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): VersionRetrieveStubBuilder =
        VersionRetrieveStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/version/{id}/"))
            .withPathParam("id", id)
            .configurer()
        )
}
