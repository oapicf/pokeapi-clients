package org.openapitools.server.api.model

import org.openapitools.server.api.model.PokemonHeldItemVersion
import org.openapitools.server.api.model.PokemonSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonHeldItem(
    /** The Pokémon that holds this item. */
    val pokemon: PokemonSummary,
    /** The details for the version that this item is held in by the Pokémon. */
    val versionDetails: kotlin.collections.List<PokemonHeldItemVersion>
)
