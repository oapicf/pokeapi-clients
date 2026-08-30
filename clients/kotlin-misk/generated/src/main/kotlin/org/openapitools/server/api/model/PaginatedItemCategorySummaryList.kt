package org.openapitools.server.api.model

import org.openapitools.server.api.model.ItemCategorySummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PaginatedItemCategorySummaryList(
    val count: kotlin.Int? = null,
    val next: java.net.URI? = null,
    val previous: java.net.URI? = null,
    val results: kotlin.collections.List<ItemCategorySummary>? = null
)
