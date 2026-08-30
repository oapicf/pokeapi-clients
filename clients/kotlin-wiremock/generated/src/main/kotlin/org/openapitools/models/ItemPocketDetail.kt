@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ItemPocketDetail(
    @field:JsonProperty("id")
    val id: kotlin.Int,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("categories")
    val categories: kotlin.collections.List<ItemCategorySummary>,

    @field:JsonProperty("names")
    val names: kotlin.collections.List<ItemPocketName>,

)
