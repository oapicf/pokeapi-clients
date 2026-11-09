package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SuperContestEffectSummary(
    /** The URL of the referenced resource. */
    val url: java.net.URI
)
