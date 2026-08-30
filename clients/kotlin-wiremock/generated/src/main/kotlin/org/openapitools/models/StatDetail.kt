@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class StatDetail(
    @field:JsonProperty("id")
    val id: kotlin.Int,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("game_index")
    val gameIndex: kotlin.Int,

    @field:JsonProperty("affecting_moves")
    val affectingMoves: StatDetailAffectingMoves,

    @field:JsonProperty("affecting_natures")
    val affectingNatures: StatDetailAffectingNatures,

    @field:JsonProperty("characteristics")
    val characteristics: kotlin.collections.List<CharacteristicSummary>,

    @field:JsonProperty("move_damage_class")
    val moveDamageClass: MoveDamageClassSummary,

    @field:JsonProperty("names")
    val names: kotlin.collections.List<StatName>,

    @field:JsonProperty("is_battle_only")
    val isBattleOnly: kotlin.Boolean? = null,

)
