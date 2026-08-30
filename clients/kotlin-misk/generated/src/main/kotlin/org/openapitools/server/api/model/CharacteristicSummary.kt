package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CharacteristicSummary(
    val url: java.net.URI
)
