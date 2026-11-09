package org.openapitools.server.api.model

import org.openapitools.server.api.model.ItemAttributeDescription
import org.openapitools.server.api.model.ItemAttributeName
import org.openapitools.server.api.model.ItemSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ItemAttributeDetail(
    /** The identifier for this resource. */
    val id: kotlin.Int,
    /** The name for this resource. */
    val name: kotlin.String,
    /** The description of this item attribute listed in different languages. */
    val descriptions: kotlin.collections.List<ItemAttributeDescription>,
    /** A list of items that have this attribute. */
    val items: kotlin.collections.List<ItemSummary>,
    /** The name of this item attribute listed in different languages. */
    val names: kotlin.collections.List<ItemAttributeName>
)
