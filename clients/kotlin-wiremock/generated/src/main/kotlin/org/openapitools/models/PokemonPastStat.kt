@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PokemonPastStat(
    @field:JsonProperty("generation")
    val generation: GenerationSummary,

    @field:JsonProperty("stats")
    val stats: kotlin.collections.List<PokemonStat>,

)
