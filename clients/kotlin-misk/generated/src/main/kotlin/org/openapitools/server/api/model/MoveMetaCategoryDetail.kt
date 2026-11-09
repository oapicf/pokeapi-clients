package org.openapitools.server.api.model

import org.openapitools.server.api.model.MoveMetaCategoryDescription
import org.openapitools.server.api.model.MoveSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MoveMetaCategoryDetail(
    /** The identifier for this resource. */
    val id: kotlin.Int,
    /** The name for this resource. */
    val name: kotlin.String,
    /** The description of this resource listed in different languages. */
    val descriptions: kotlin.collections.List<MoveMetaCategoryDescription>,
    /** A list of moves that fall into this category. */
    val moves: kotlin.collections.List<MoveSummary>
)
