package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class EvolutionVariableSummary(
    /** The name of the referenced resource. */
    val name: kotlin.String,
    /** The URL of the referenced resource. */
    val url: java.net.URI
)
