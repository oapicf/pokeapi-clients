@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class NatureBattleStylePreference(
    @field:JsonProperty("low_hp_preference")
    val lowHpPreference: kotlin.Int,

    @field:JsonProperty("high_hp_preference")
    val highHpPreference: kotlin.Int,

    @field:JsonProperty("move_battle_style")
    val moveBattleStyle: MoveBattleStyleSummary,

)
