package org.openapitools.server.api.model

import org.openapitools.server.api.model.AbilityDetailPokemonInnerPokemon
import org.openapitools.server.api.model.EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class EvolutionChainDetailChainEvolvesToInner(
    val evolutionDetails: kotlin.collections.List<EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner>,
    val isBaby: kotlin.Boolean,
    val species: AbilityDetailPokemonInnerPokemon
)
