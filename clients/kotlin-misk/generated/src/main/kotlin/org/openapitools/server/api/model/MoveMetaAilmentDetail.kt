package org.openapitools.server.api.model

import org.openapitools.server.api.model.MoveMetaAilmentName
import org.openapitools.server.api.model.MoveSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MoveMetaAilmentDetail(
    /** The identifier for this resource. */
    val id: kotlin.Int,
    /** The name for this resource. */
    val name: kotlin.String,
    /** A list of moves that cause this ailment. */
    val moves: kotlin.collections.List<MoveSummary>,
    /** The name of this resource listed in different languages. */
    val names: kotlin.collections.List<MoveMetaAilmentName>
)
