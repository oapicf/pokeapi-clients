@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class EvolutionChainLink(
    @field:JsonProperty("is_baby")
    val isBaby: kotlin.Boolean,

    @field:JsonProperty("species")
    val species: PokemonSpeciesSummary,

    @field:JsonProperty("evolution_details")
    val evolutionDetails: kotlin.collections.List<PokemonEvolution>,

    @field:JsonProperty("evolves_to")
    val evolvesTo: kotlin.collections.List<EvolutionChainLink>,

)
