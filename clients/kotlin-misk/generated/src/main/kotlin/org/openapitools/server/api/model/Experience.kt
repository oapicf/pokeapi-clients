package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Experience(
    val level: kotlin.Int,
    val experience: kotlin.Int
)
