package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ContestEffectSummary(
    /** The URL of the referenced resource. */
    val url: java.net.URI
)
