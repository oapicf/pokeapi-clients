package org.openapitools.server.api.model

import org.openapitools.server.api.model.MoveStatChange
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class StatAffectingMoves(
    /** A list of moves and how they change the referenced stat. */
    val increase: kotlin.collections.List<MoveStatChange>,
    /** A list of moves and how they change the referenced stat. */
    val decrease: kotlin.collections.List<MoveStatChange>
)
