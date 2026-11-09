@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PokeathlonStatAffectingNatures(
    @field:JsonProperty("increase")
    val increase: kotlin.collections.List<PokeathlonStatAffectingNature>,

    @field:JsonProperty("decrease")
    val decrease: kotlin.collections.List<PokeathlonStatAffectingNature>,

)
