package org.openapitools.server.api.model

import org.openapitools.server.api.model.GenerationSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LocationGameIndex(
    val gameIndex: kotlin.Int,
    val generation: GenerationSummary
)
