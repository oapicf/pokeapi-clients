package org.openapitools.server.api.model

import org.openapitools.server.api.model.PokemonSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TypePokemon(
    /** The order the Pokémon&#39;s types are listed in. */
    val slot: kotlin.Int,
    /** The Pokémon that has the referenced type. */
    val pokemon: PokemonSummary
)
