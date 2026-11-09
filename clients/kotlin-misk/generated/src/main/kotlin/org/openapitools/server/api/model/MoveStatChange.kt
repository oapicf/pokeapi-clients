package org.openapitools.server.api.model

import org.openapitools.server.api.model.MoveSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MoveStatChange(
    /** The maximum amount of change to the referenced stat. */
    val change: kotlin.Int,
    /** The move causing the change. */
    val move: MoveSummary
)
