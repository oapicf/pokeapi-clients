package org.openapitools.server.api.model

import org.openapitools.server.api.model.MoveSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MoveComboUsage(
    /** A list of moves to use before this move. */
    val useBefore: kotlin.collections.List<MoveSummary>,
    /** A list of moves to use after this move. */
    val useAfter: kotlin.collections.List<MoveSummary>
)
