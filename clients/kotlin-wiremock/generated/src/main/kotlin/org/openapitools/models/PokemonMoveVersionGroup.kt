@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PokemonMoveVersionGroup(
    @field:JsonProperty("level_learned_at")
    val levelLearnedAt: kotlin.Int,

    @field:JsonProperty("move_learn_method")
    val moveLearnMethod: MoveLearnMethodSummary,

    @field:JsonProperty("version_group")
    val versionGroup: VersionGroupSummary,

    @field:JsonProperty("order")
    val order: kotlin.Int? = null,

)
