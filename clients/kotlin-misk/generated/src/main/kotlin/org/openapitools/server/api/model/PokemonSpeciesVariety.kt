package org.openapitools.server.api.model

import org.openapitools.server.api.model.PokemonSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonSpeciesVariety(
    /** Whether this variety is the default variety. */
    val isDefault: kotlin.Boolean,
    /** The Pokémon variety. */
    val pokemon: PokemonSummary
)
