package org.openapitools.server.api.model

import org.openapitools.server.api.model.MoveDamageClassDescription
import org.openapitools.server.api.model.MoveDamageClassName
import org.openapitools.server.api.model.MoveSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MoveDamageClassDetail(
    /** The identifier for this resource. */
    val id: kotlin.Int,
    /** The name for this resource. */
    val name: kotlin.String,
    /** The description of this resource listed in different languages. */
    val descriptions: kotlin.collections.List<MoveDamageClassDescription>,
    /** A list of moves that fall into this damage class. */
    val moves: kotlin.collections.List<MoveSummary>,
    /** The name of this resource listed in different languages. */
    val names: kotlin.collections.List<MoveDamageClassName>
)
