package org.openapitools.server.api.model

import org.openapitools.server.api.model.StatSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonStat(
    /** The base value of the stat. */
    val baseStat: kotlin.Int,
    /** The effort points (EV) the Pokémon has in the stat. */
    val effort: kotlin.Int,
    /** The stat the Pokémon has. */
    val stat: StatSummary
)
