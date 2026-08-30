package org.openapitools.server.api.model

import org.openapitools.server.api.model.ItemCategorySummary
import org.openapitools.server.api.model.ItemPocketName
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ItemPocketDetail(
    val id: kotlin.Int,
    val name: kotlin.String,
    val categories: kotlin.collections.List<ItemCategorySummary>,
    val names: kotlin.collections.List<ItemPocketName>
)
