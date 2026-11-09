package org.openapitools.server.api.model

import org.openapitools.server.api.model.PokeathlonStatSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PaginatedPokeathlonStatSummaryList(
    /** The total number of resources available from this API. */
    val count: kotlin.Int,
    /** A list of API resources on this page. */
    val results: kotlin.collections.List<PokeathlonStatSummary>,
    /** The URL for the next page in the list, or null if there is no next page. */
    val next: java.net.URI? = null,
    /** The URL for the previous page in the list, or null if there is no previous page. */
    val previous: java.net.URI? = null
)
