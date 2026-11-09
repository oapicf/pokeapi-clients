package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class EncounterPokemonDetail(
    /** The minimum number of perfect IVs, or null if unspecified. */
    val minPerfectIvs: kotlin.Int? = null,
    /** Whether the encountered Pokémon is always shiny. */
    val alwaysShiny: kotlin.Boolean? = null,
    /** Whether the encountered Pokémon can never be shiny. */
    val neverShiny: kotlin.Boolean? = null,
    /** Whether the encountered Pokémon is an alpha Pokémon. */
    val isAlpha: kotlin.Boolean? = null
)
