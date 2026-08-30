package org.openapitools.server.api.model

import org.openapitools.server.api.model.BerryFirmnessName
import org.openapitools.server.api.model.BerrySummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BerryFirmnessDetail(
    val id: kotlin.Int,
    val name: kotlin.String,
    val berries: kotlin.collections.List<BerrySummary>,
    val names: kotlin.collections.List<BerryFirmnessName>
)
