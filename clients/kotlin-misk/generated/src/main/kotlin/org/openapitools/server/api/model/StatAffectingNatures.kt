package org.openapitools.server.api.model

import org.openapitools.server.api.model.NatureSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class StatAffectingNatures(
    /** A list of natures and how they change the referenced stat. */
    val increase: kotlin.collections.List<NatureSummary>,
    /** A list of nature sand how they change the referenced stat. */
    val decrease: kotlin.collections.List<NatureSummary>
)
