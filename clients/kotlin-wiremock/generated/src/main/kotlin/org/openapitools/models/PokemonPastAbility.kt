@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PokemonPastAbility(
    @field:JsonProperty("abilities")
    val abilities: kotlin.collections.List<PokemonAbilityPast>,

    @field:JsonProperty("generation")
    val generation: GenerationSummary,

)
