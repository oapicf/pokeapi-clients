@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PokeathlonStatDetailAffectingNatures(
    @field:JsonProperty("decrease")
    val decrease: kotlin.collections.List<PokeathlonStatDetailAffectingNaturesDecreaseInner>,

    @field:JsonProperty("increase")
    val increase: kotlin.collections.List<PokeathlonStatDetailAffectingNaturesIncreaseInner>,

)
