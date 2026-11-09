package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Experience(
    /** The level gained. */
    val level: kotlin.Int,
    /** The amount of experience required to reach the referenced level. */
    val experience: kotlin.Int
)
