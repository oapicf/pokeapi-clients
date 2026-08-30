package org.openapitools.server.api.model

import org.openapitools.server.api.model.AbilityDetailPokemonInnerPokemon
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokedexDetailPokemonEntriesInner(
    val entryNumber: kotlin.Int,
    val pokemonSpecies: AbilityDetailPokemonInnerPokemon
)
