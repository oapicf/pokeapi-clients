package org.openapitools.server.api.model

import org.openapitools.server.api.model.PokemonSpeciesSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonDexNumber(
    /** The index of this Pokémon species entry within the Pokédex. */
    val entryNumber: kotlin.Int,
    /** The Pokémon species being encountered. */
    val pokemonSpecies: PokemonSpeciesSummary
)
