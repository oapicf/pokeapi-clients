package org.openapitools.server.api.model

import org.openapitools.server.api.model.MoveSummary
import org.openapitools.server.api.model.MoveTargetDescription
import org.openapitools.server.api.model.MoveTargetName
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MoveTargetDetail(
    /** The identifier for this resource. */
    val id: kotlin.Int,
    /** The name for this resource. */
    val name: kotlin.String,
    /** The description of this resource listed in different languages. */
    val descriptions: kotlin.collections.List<MoveTargetDescription>,
    /** A list of moves that that are directed at this target. */
    val moves: kotlin.collections.List<MoveSummary>,
    /** The name of this resource listed in different languages. */
    val names: kotlin.collections.List<MoveTargetName>
)
