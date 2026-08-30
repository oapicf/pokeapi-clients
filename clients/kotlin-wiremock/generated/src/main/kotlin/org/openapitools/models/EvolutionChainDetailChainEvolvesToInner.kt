@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class EvolutionChainDetailChainEvolvesToInner(
    @field:JsonProperty("evolution_details")
    val evolutionDetails: kotlin.collections.List<EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner>,

    @field:JsonProperty("is_baby")
    val isBaby: kotlin.Boolean,

    @field:JsonProperty("species")
    val species: AbilityDetailPokemonInnerPokemon,

)
