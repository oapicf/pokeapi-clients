package org.openapitools.server.api.model

import org.openapitools.server.api.model.PokedexSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonDexEntry(
    /** The index number within the Pokédex. */
    val entryNumber: kotlin.Int,
    /** The Pokédex the referenced Pokémon species can be found in. */
    val pokedex: PokedexSummary
)
