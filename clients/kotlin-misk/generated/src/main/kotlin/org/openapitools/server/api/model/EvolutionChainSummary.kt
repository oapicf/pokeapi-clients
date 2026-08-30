package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class EvolutionChainSummary(
    val url: java.net.URI
)
