package org.openapitools.server.api.model

import org.openapitools.server.api.model.MoveBattleStyleName
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MoveBattleStyleDetail(
    /** The identifier for this resource. */
    val id: kotlin.Int,
    /** The name for this resource. */
    val name: kotlin.String,
    /** The name of this resource listed in different languages. */
    val names: kotlin.collections.List<MoveBattleStyleName>
)
