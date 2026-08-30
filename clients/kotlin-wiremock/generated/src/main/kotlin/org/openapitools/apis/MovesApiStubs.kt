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
open class MovesApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation moveAilmentList.
     *
     * @param limit query parameter limit pattern.
     * @param offset query parameter offset pattern.
     * @param q query parameter q pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [MoveAilmentListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun moveAilmentList(limit: StringValuePattern? = null, offset: StringValuePattern? = null, q: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): MoveAilmentListStubBuilder =
        MoveAilmentListStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/move-ailment/"))
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { offset?.let { withQueryParam("offset", it) } }
            .apply { q?.let { withQueryParam("q", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation moveAilmentRetrieve.
     *
     * @param id path parameter id pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [MoveAilmentRetrieveStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun moveAilmentRetrieve(id: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): MoveAilmentRetrieveStubBuilder =
        MoveAilmentRetrieveStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/move-ailment/{id}/"))
            .withPathParam("id", id)
            .configurer()
        )

    /**
     * Construct a stub for the operation moveBattleStyleList.
     *
     * @param limit query parameter limit pattern.
     * @param offset query parameter offset pattern.
     * @param q query parameter q pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [MoveBattleStyleListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun moveBattleStyleList(limit: StringValuePattern? = null, offset: StringValuePattern? = null, q: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): MoveBattleStyleListStubBuilder =
        MoveBattleStyleListStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/move-battle-style/"))
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { offset?.let { withQueryParam("offset", it) } }
            .apply { q?.let { withQueryParam("q", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation moveBattleStyleRetrieve.
     *
     * @param id path parameter id pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [MoveBattleStyleRetrieveStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun moveBattleStyleRetrieve(id: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): MoveBattleStyleRetrieveStubBuilder =
        MoveBattleStyleRetrieveStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/move-battle-style/{id}/"))
            .withPathParam("id", id)
            .configurer()
        )

    /**
     * Construct a stub for the operation moveCategoryList.
     *
     * @param limit query parameter limit pattern.
     * @param offset query parameter offset pattern.
     * @param q query parameter q pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [MoveCategoryListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun moveCategoryList(limit: StringValuePattern? = null, offset: StringValuePattern? = null, q: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): MoveCategoryListStubBuilder =
        MoveCategoryListStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/move-category/"))
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { offset?.let { withQueryParam("offset", it) } }
            .apply { q?.let { withQueryParam("q", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation moveCategoryRetrieve.
     *
     * @param id path parameter id pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [MoveCategoryRetrieveStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun moveCategoryRetrieve(id: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): MoveCategoryRetrieveStubBuilder =
        MoveCategoryRetrieveStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/move-category/{id}/"))
            .withPathParam("id", id)
            .configurer()
        )

    /**
     * Construct a stub for the operation moveLearnMethodList.
     *
     * @param limit query parameter limit pattern.
     * @param offset query parameter offset pattern.
     * @param q query parameter q pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [MoveLearnMethodListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun moveLearnMethodList(limit: StringValuePattern? = null, offset: StringValuePattern? = null, q: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): MoveLearnMethodListStubBuilder =
        MoveLearnMethodListStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/move-learn-method/"))
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { offset?.let { withQueryParam("offset", it) } }
            .apply { q?.let { withQueryParam("q", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation moveLearnMethodRetrieve.
     *
     * @param id path parameter id pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [MoveLearnMethodRetrieveStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun moveLearnMethodRetrieve(id: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): MoveLearnMethodRetrieveStubBuilder =
        MoveLearnMethodRetrieveStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/move-learn-method/{id}/"))
            .withPathParam("id", id)
            .configurer()
        )

    /**
     * Construct a stub for the operation moveList.
     *
     * @param limit query parameter limit pattern.
     * @param offset query parameter offset pattern.
     * @param q query parameter q pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [MoveListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun moveList(limit: StringValuePattern? = null, offset: StringValuePattern? = null, q: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): MoveListStubBuilder =
        MoveListStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/move/"))
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { offset?.let { withQueryParam("offset", it) } }
            .apply { q?.let { withQueryParam("q", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation moveRetrieve.
     *
     * @param id path parameter id pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [MoveRetrieveStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun moveRetrieve(id: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): MoveRetrieveStubBuilder =
        MoveRetrieveStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/move/{id}/"))
            .withPathParam("id", id)
            .configurer()
        )

    /**
     * Construct a stub for the operation moveTargetList.
     *
     * @param limit query parameter limit pattern.
     * @param offset query parameter offset pattern.
     * @param q query parameter q pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [MoveTargetListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun moveTargetList(limit: StringValuePattern? = null, offset: StringValuePattern? = null, q: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): MoveTargetListStubBuilder =
        MoveTargetListStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/move-target/"))
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { offset?.let { withQueryParam("offset", it) } }
            .apply { q?.let { withQueryParam("q", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation moveTargetRetrieve.
     *
     * @param id path parameter id pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [MoveTargetRetrieveStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun moveTargetRetrieve(id: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): MoveTargetRetrieveStubBuilder =
        MoveTargetRetrieveStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/move-target/{id}/"))
            .withPathParam("id", id)
            .configurer()
        )
}
