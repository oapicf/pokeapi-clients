package org.openapitools.server.api.model

import org.openapitools.server.api.model.MoveBattleStyleName
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MoveBattleStyleDetail(
    val id: kotlin.Int,
    val name: kotlin.String,
    val names: kotlin.collections.List<MoveBattleStyleName>
)
