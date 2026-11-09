package org.openapitools.server.api.model

import org.openapitools.server.api.model.PalParkAreaSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonSpeciesPalParkEncounter(
    /** The base rate for encountering the referenced Pokémon in this pal park area. */
    val rate: kotlin.Int,
    /** The pal park area where this encounter happens. */
    val area: PalParkAreaSummary,
    /** The base score given to the player when the referenced Pokémon is caught during a pal park run. */
    val baseScore: kotlin.Int? = null
)
