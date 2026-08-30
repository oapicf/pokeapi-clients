package org.openapitools.server.api.model

import org.openapitools.server.api.model.ItemCategoryName
import org.openapitools.server.api.model.ItemPocketSummary
import org.openapitools.server.api.model.ItemSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ItemCategoryDetail(
    val id: kotlin.Int,
    val name: kotlin.String,
    val items: kotlin.collections.List<ItemSummary>,
    val names: kotlin.collections.List<ItemCategoryName>,
    val pocket: ItemPocketSummary
)
