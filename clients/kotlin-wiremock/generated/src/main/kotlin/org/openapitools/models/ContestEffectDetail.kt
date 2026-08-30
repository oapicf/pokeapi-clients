@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ContestEffectDetail(
    @field:JsonProperty("id")
    val id: kotlin.Int,

    @field:JsonProperty("appeal")
    val appeal: kotlin.Int,

    @field:JsonProperty("jam")
    val jam: kotlin.Int,

    @field:JsonProperty("effect_entries")
    val effectEntries: kotlin.collections.List<ContestEffectEffectText>,

    @field:JsonProperty("flavor_text_entries")
    val flavorTextEntries: kotlin.collections.List<ContestEffectFlavorText>,

)
