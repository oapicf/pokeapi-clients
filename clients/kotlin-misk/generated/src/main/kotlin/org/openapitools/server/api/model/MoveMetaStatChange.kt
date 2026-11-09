package org.openapitools.server.api.model

import org.openapitools.server.api.model.StatSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MoveMetaStatChange(
    /** The amount of change. */
    val change: kotlin.Int,
    /** The stat being affected. */
    val stat: StatSummary
)
