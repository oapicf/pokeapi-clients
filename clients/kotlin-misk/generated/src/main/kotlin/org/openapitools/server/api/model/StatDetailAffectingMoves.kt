package org.openapitools.server.api.model

import org.openapitools.server.api.model.StatDetailAffectingMovesIncreaseInner
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class StatDetailAffectingMoves(
    val increase: kotlin.collections.List<StatDetailAffectingMovesIncreaseInner>,
    val decrease: kotlin.collections.List<StatDetailAffectingMovesIncreaseInner>
)
