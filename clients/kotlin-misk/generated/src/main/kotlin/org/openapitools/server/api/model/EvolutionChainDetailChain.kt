package org.openapitools.server.api.model

import org.openapitools.server.api.model.AbilityDetailPokemonInnerPokemon
import org.openapitools.server.api.model.EvolutionChainDetailChainEvolvesToInner
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class EvolutionChainDetailChain(
    val evolutionDetails: kotlin.collections.List<kotlin.Any>,
    val evolvesTo: kotlin.collections.List<EvolutionChainDetailChainEvolvesToInner>,
    val isBaby: kotlin.Boolean,
    val species: AbilityDetailPokemonInnerPokemon
)
