package org.openapitools.server.api.model

import org.openapitools.server.api.model.AbilityDetailPokemonInnerPokemon
import org.openapitools.server.api.model.EvolutionTriggerName
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class EvolutionTriggerDetail(
    val id: kotlin.Int,
    val name: kotlin.String,
    val names: kotlin.collections.List<EvolutionTriggerName>,
    val pokemonSpecies: kotlin.collections.List<AbilityDetailPokemonInnerPokemon>
)
