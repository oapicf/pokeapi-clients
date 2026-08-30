package org.openapitools.server.api.model

import org.openapitools.server.api.model.StatSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonStat(
    val baseStat: kotlin.Int,
    val effort: kotlin.Int,
    val stat: StatSummary
)
