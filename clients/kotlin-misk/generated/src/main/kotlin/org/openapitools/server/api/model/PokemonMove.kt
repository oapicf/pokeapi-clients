package org.openapitools.server.api.model

import org.openapitools.server.api.model.MoveSummary
import org.openapitools.server.api.model.PokemonMoveVersionGroup
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonMove(
    /** The move the Pokémon can learn. */
    val move: MoveSummary,
    /** The details of the version in which the Pokémon can learn the move. */
    val versionGroupDetails: kotlin.collections.List<PokemonMoveVersionGroup>
)
