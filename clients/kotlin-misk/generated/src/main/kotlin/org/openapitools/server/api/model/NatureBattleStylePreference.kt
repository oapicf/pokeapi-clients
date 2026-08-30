package org.openapitools.server.api.model

import org.openapitools.server.api.model.MoveBattleStyleSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class NatureBattleStylePreference(
    val lowHpPreference: kotlin.Int,
    val highHpPreference: kotlin.Int,
    val moveBattleStyle: MoveBattleStyleSummary
)
