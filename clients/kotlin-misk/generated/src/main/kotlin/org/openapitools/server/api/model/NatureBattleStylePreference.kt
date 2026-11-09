package org.openapitools.server.api.model

import org.openapitools.server.api.model.MoveBattleStyleSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class NatureBattleStylePreference(
    /** Chance of using the move, in percent, if HP is under one half. */
    val lowHpPreference: kotlin.Int,
    /** Chance of using the move, in percent, if HP is over one half. */
    val highHpPreference: kotlin.Int,
    /** The move battle style. */
    val moveBattleStyle: MoveBattleStyleSummary
)
