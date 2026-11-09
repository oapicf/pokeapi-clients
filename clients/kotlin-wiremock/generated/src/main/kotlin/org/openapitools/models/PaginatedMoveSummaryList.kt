@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PaginatedMoveSummaryList(
    @field:JsonProperty("count")
    val count: kotlin.Int,

    @field:JsonProperty("results")
    val results: kotlin.collections.List<MoveSummary>,

    @field:JsonProperty("next")
    val next: java.net.URI? = null,

    @field:JsonProperty("previous")
    val previous: java.net.URI? = null,

)
