@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class StatAffectingNatures(
    @field:JsonProperty("increase")
    val increase: kotlin.collections.List<NatureSummary>,

    @field:JsonProperty("decrease")
    val decrease: kotlin.collections.List<NatureSummary>,

)
