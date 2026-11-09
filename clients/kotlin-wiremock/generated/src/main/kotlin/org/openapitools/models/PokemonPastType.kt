@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PokemonPastType(
    @field:JsonProperty("generation")
    val generation: GenerationSummary,

    @field:JsonProperty("types")
    val types: kotlin.collections.List<PokemonType>,

)
