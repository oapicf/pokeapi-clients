package org.openapitools.server.api.model

import org.openapitools.server.api.model.PokedexSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PaginatedPokedexSummaryList(
    val count: kotlin.Int? = null,
    val next: java.net.URI? = null,
    val previous: java.net.URI? = null,
    val results: kotlin.collections.List<PokedexSummary>? = null
)
