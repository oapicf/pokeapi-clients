package org.openapitools.server.api.model

import org.openapitools.server.api.model.ItemCategorySummary
import org.openapitools.server.api.model.ItemPocketName
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ItemPocketDetail(
    /** The identifier for this resource. */
    val id: kotlin.Int,
    /** The name for this resource. */
    val name: kotlin.String,
    /** A list of item categories that are relevant to this item pocket. */
    val categories: kotlin.collections.List<ItemCategorySummary>,
    /** The name of this resource listed in different languages. */
    val names: kotlin.collections.List<ItemPocketName>
)
