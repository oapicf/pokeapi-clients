package org.openapitools.server.api.model

import org.openapitools.server.api.model.ItemPocketSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PaginatedItemPocketSummaryList(
    val count: kotlin.Int? = null,
    val next: java.net.URI? = null,
    val previous: java.net.URI? = null,
    val results: kotlin.collections.List<ItemPocketSummary>? = null
)
