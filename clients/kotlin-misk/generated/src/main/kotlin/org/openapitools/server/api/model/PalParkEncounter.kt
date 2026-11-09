package org.openapitools.server.api.model

import org.openapitools.server.api.model.PokemonSpeciesSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PalParkEncounter(
    /** The base rate for encountering this Pokémon in this pal park area. */
    val rate: kotlin.Int,
    /** The Pokémon species being encountered. */
    val pokemonSpecies: PokemonSpeciesSummary,
    /** The base score given to the player when this Pokémon is caught during a pal park run. */
    val baseScore: kotlin.Int? = null
)
