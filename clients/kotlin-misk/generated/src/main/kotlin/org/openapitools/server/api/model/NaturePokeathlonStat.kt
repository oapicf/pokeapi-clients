package org.openapitools.server.api.model

import org.openapitools.server.api.model.PokeathlonStatSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class NaturePokeathlonStat(
    /** The amount of change. */
    val maxChange: kotlin.Int,
    /** The stat being affected. */
    val pokeathlonStat: PokeathlonStatSummary
)
