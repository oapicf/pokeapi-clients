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
open class MachinesApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation machineList.
     *
     * @param limit query parameter limit pattern.
     * @param offset query parameter offset pattern.
     * @param q query parameter q pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [MachineListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun machineList(limit: StringValuePattern? = null, offset: StringValuePattern? = null, q: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): MachineListStubBuilder =
        MachineListStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/machine/"))
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { offset?.let { withQueryParam("offset", it) } }
            .apply { q?.let { withQueryParam("q", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation machineRetrieve.
     *
     * @param id path parameter id pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [MachineRetrieveStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun machineRetrieve(id: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): MachineRetrieveStubBuilder =
        MachineRetrieveStubBuilder(objectMapper, get(urlPathTemplate("/api/v2/machine/{id}/"))
            .withPathParam("id", id)
            .configurer()
        )
}
