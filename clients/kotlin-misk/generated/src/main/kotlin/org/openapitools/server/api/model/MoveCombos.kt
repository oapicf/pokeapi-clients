package org.openapitools.server.api.model

import org.openapitools.server.api.model.MoveComboUsage
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MoveCombos(
    /** A detail of moves this move can be used before or after, granting additional appeal points in contests. */
    val normal: MoveComboUsage,
    /** A detail of moves this move can be used before or after, granting additional appeal points in super contests. */
    val `super`: MoveComboUsage
)
