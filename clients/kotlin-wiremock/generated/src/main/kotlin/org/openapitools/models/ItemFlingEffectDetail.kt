@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ItemFlingEffectDetail(
    @field:JsonProperty("id")
    val id: kotlin.Int,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("effect_entries")
    val effectEntries: kotlin.collections.List<ItemFlingEffectEffectText>,

    @field:JsonProperty("items")
    val items: kotlin.collections.List<ItemSummary>,

)
