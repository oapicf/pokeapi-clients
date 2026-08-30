package org.openapitools.server.api.model

import org.openapitools.server.api.model.ItemFlingEffectEffectText
import org.openapitools.server.api.model.ItemSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ItemFlingEffectDetail(
    val id: kotlin.Int,
    val name: kotlin.String,
    val effectEntries: kotlin.collections.List<ItemFlingEffectEffectText>,
    val items: kotlin.collections.List<ItemSummary>
)
