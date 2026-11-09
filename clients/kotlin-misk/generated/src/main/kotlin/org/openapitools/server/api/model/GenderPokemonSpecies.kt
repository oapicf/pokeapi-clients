package org.openapitools.server.api.model

import org.openapitools.server.api.model.PokemonSpeciesSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GenderPokemonSpecies(
    /** The chance of this Pokémon being female, in eighths; or -1 for genderless. */
    val rate: kotlin.Int,
    /** A Pokémon species that can be the referenced gender. */
    val pokemonSpecies: PokemonSpeciesSummary
)
