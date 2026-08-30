@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ItemCategoryDetail(
    @field:JsonProperty("id")
    val id: kotlin.Int,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("items")
    val items: kotlin.collections.List<ItemSummary>,

    @field:JsonProperty("names")
    val names: kotlin.collections.List<ItemCategoryName>,

    @field:JsonProperty("pocket")
    val pocket: ItemPocketSummary,

)
