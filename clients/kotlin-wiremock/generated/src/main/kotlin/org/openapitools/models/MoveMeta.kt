@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class MoveMeta(
    @field:JsonProperty("ailment")
    val ailment: MoveMetaAilmentSummary,

    @field:JsonProperty("category")
    val category: MoveMetaCategorySummary,

    @field:JsonProperty("min_hits")
    val minHits: kotlin.Int? = null,

    @field:JsonProperty("max_hits")
    val maxHits: kotlin.Int? = null,

    @field:JsonProperty("min_turns")
    val minTurns: kotlin.Int? = null,

    @field:JsonProperty("max_turns")
    val maxTurns: kotlin.Int? = null,

    @field:JsonProperty("drain")
    val drain: kotlin.Int? = null,

    @field:JsonProperty("healing")
    val healing: kotlin.Int? = null,

    @field:JsonProperty("crit_rate")
    val critRate: kotlin.Int? = null,

    @field:JsonProperty("ailment_chance")
    val ailmentChance: kotlin.Int? = null,

    @field:JsonProperty("flinch_chance")
    val flinchChance: kotlin.Int? = null,

    @field:JsonProperty("stat_chance")
    val statChance: kotlin.Int? = null,

)
