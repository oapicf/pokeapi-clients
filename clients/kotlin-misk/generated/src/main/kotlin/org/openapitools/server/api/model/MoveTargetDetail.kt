package org.openapitools.server.api.model

import org.openapitools.server.api.model.MoveSummary
import org.openapitools.server.api.model.MoveTargetDescription
import org.openapitools.server.api.model.MoveTargetName
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MoveTargetDetail(
    val id: kotlin.Int,
    val name: kotlin.String,
    val descriptions: kotlin.collections.List<MoveTargetDescription>,
    val moves: kotlin.collections.List<MoveSummary>,
    val names: kotlin.collections.List<MoveTargetName>
)
