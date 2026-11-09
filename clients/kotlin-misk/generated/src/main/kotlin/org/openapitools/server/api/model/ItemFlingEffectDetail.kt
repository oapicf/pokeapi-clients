package org.openapitools.server.api.model

import org.openapitools.server.api.model.ItemFlingEffectEffectText
import org.openapitools.server.api.model.ItemSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ItemFlingEffectDetail(
    /** The identifier for this resource. */
    val id: kotlin.Int,
    /** The name for this resource. */
    val name: kotlin.String,
    /** The result of this fling effect listed in different languages. */
    val effectEntries: kotlin.collections.List<ItemFlingEffectEffectText>,
    /** A list of items that have this fling effect. */
    val items: kotlin.collections.List<ItemSummary>
)
