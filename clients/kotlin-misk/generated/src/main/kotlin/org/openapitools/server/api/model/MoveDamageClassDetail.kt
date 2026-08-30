package org.openapitools.server.api.model

import org.openapitools.server.api.model.MoveDamageClassDescription
import org.openapitools.server.api.model.MoveDamageClassName
import org.openapitools.server.api.model.MoveSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MoveDamageClassDetail(
    val id: kotlin.Int,
    val name: kotlin.String,
    val descriptions: kotlin.collections.List<MoveDamageClassDescription>,
    val moves: kotlin.collections.List<MoveSummary>,
    val names: kotlin.collections.List<MoveDamageClassName>
)
