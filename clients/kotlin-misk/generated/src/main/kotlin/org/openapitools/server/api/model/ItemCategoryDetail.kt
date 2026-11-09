package org.openapitools.server.api.model

import org.openapitools.server.api.model.ItemCategoryName
import org.openapitools.server.api.model.ItemPocketSummary
import org.openapitools.server.api.model.ItemSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ItemCategoryDetail(
    /** The identifier for this resource. */
    val id: kotlin.Int,
    /** The name for this resource. */
    val name: kotlin.String,
    /** A list of items that are a part of this category. */
    val items: kotlin.collections.List<ItemSummary>,
    /** The name of this item category listed in different languages. */
    val names: kotlin.collections.List<ItemCategoryName>,
    /** The pocket items in this category would be put in. */
    val pocket: ItemPocketSummary
)
