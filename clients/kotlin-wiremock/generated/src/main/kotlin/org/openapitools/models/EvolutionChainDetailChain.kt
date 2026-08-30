@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class EvolutionChainDetailChain(
    @field:JsonProperty("evolution_details")
    val evolutionDetails: kotlin.collections.List<kotlin.Any>,

    @field:JsonProperty("evolves_to")
    val evolvesTo: kotlin.collections.List<EvolutionChainDetailChainEvolvesToInner>,

    @field:JsonProperty("is_baby")
    val isBaby: kotlin.Boolean,

    @field:JsonProperty("species")
    val species: AbilityDetailPokemonInnerPokemon,

)
