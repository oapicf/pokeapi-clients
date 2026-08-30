package org.openapitools.server.api.model

import org.openapitools.server.api.model.PokedexSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonDexEntry(
    val entryNumber: kotlin.Int,
    val pokedex: PokedexSummary
)
