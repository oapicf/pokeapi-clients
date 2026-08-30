@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class NatureDetail(
    @field:JsonProperty("id")
    val id: kotlin.Int,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("decreased_stat")
    val decreasedStat: StatSummary,

    @field:JsonProperty("increased_stat")
    val increasedStat: StatSummary,

    @field:JsonProperty("likes_flavor")
    val likesFlavor: BerryFlavorSummary,

    @field:JsonProperty("hates_flavor")
    val hatesFlavor: BerryFlavorSummary,

    @field:JsonProperty("berries")
    val berries: kotlin.collections.List<BerrySummary>,

    @field:JsonProperty("pokeathlon_stat_changes")
    val pokeathlonStatChanges: kotlin.collections.List<NatureDetailPokeathlonStatChangesInner>,

    @field:JsonProperty("move_battle_style_preferences")
    val moveBattleStylePreferences: kotlin.collections.List<NatureBattleStylePreference>,

    @field:JsonProperty("names")
    val names: kotlin.collections.List<NatureName>,

)
