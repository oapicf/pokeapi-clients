@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PokeathlonStatDetail(
    @field:JsonProperty("id")
    val id: kotlin.Int,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("affecting_natures")
    val affectingNatures: PokeathlonStatDetailAffectingNatures,

    @field:JsonProperty("names")
    val names: kotlin.collections.List<PokeathlonStatName>,

)
