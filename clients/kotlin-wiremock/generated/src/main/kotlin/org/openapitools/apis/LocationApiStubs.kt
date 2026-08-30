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
open class LocationApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation locationAreaList.
     *
     * @param limit query parameter limit pattern.
     * @param offset query parameter offset pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [LocationAreaListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun locationAreaList(limit: StringValuePattern? = null, offset: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): LocationAreaListStubBuilder =
        LocationAreaListStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/location-area/"))
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { offset?.let { withQueryParam("offset", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation locationAreaRetrieve.
     *
     * @param id path parameter id pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [LocationAreaRetrieveStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun locationAreaRetrieve(id: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): LocationAreaRetrieveStubBuilder =
        LocationAreaRetrieveStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/location-area/{id}/"))
            .withPathParam("id", id)
            .configurer()
        )

    /**
     * Construct a stub for the operation locationList.
     *
     * @param limit query parameter limit pattern.
     * @param offset query parameter offset pattern.
     * @param q query parameter q pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [LocationListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun locationList(limit: StringValuePattern? = null, offset: StringValuePattern? = null, q: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): LocationListStubBuilder =
        LocationListStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/location/"))
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { offset?.let { withQueryParam("offset", it) } }
            .apply { q?.let { withQueryParam("q", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation locationRetrieve.
     *
     * @param id path parameter id pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [LocationRetrieveStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun locationRetrieve(id: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): LocationRetrieveStubBuilder =
        LocationRetrieveStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/location/{id}/"))
            .withPathParam("id", id)
            .configurer()
        )

    /**
     * Construct a stub for the operation palParkAreaList.
     *
     * @param limit query parameter limit pattern.
     * @param offset query parameter offset pattern.
     * @param q query parameter q pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PalParkAreaListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun palParkAreaList(limit: StringValuePattern? = null, offset: StringValuePattern? = null, q: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): PalParkAreaListStubBuilder =
        PalParkAreaListStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/pal-park-area/"))
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { offset?.let { withQueryParam("offset", it) } }
            .apply { q?.let { withQueryParam("q", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation palParkAreaRetrieve.
     *
     * @param id path parameter id pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PalParkAreaRetrieveStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun palParkAreaRetrieve(id: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): PalParkAreaRetrieveStubBuilder =
        PalParkAreaRetrieveStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/pal-park-area/{id}/"))
            .withPathParam("id", id)
            .configurer()
        )

    /**
     * Construct a stub for the operation regionList.
     *
     * @param limit query parameter limit pattern.
     * @param offset query parameter offset pattern.
     * @param q query parameter q pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [RegionListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun regionList(limit: StringValuePattern? = null, offset: StringValuePattern? = null, q: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): RegionListStubBuilder =
        RegionListStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/region/"))
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { offset?.let { withQueryParam("offset", it) } }
            .apply { q?.let { withQueryParam("q", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation regionRetrieve.
     *
     * @param id path parameter id pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [RegionRetrieveStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun regionRetrieve(id: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): RegionRetrieveStubBuilder =
        RegionRetrieveStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/region/{id}/"))
            .withPathParam("id", id)
            .configurer()
        )
}
