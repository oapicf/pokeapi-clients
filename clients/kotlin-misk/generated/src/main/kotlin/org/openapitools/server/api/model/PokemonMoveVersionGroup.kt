package org.openapitools.server.api.model

import org.openapitools.server.api.model.MoveLearnMethodSummary
import org.openapitools.server.api.model.VersionGroupSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonMoveVersionGroup(
    /** The minimum level to learn the move. */
    val levelLearnedAt: kotlin.Int,
    /** The method by which the move is learned. */
    val moveLearnMethod: MoveLearnMethodSummary,
    /** The version group in which the move is learned. */
    val versionGroup: VersionGroupSummary,
    /** Order by which the pokemon will learn the move. A newly learnt move will replace the move with lowest order. */
    val order: kotlin.Int? = null
)
