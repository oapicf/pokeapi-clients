@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class SuperContestEffectDetail(
    @field:JsonProperty("id")
    val id: kotlin.Int,

    @field:JsonProperty("appeal")
    val appeal: kotlin.Int,

    @field:JsonProperty("flavor_text_entries")
    val flavorTextEntries: kotlin.collections.List<SuperContestEffectFlavorText>,

    @field:JsonProperty("moves")
    val moves: kotlin.collections.List<MoveSummary>,

)
