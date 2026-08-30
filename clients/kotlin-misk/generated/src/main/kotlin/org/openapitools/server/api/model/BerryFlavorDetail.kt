package org.openapitools.server.api.model

import org.openapitools.server.api.model.BerryFlavorDetailBerriesInner
import org.openapitools.server.api.model.BerryFlavorName
import org.openapitools.server.api.model.ContestTypeSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BerryFlavorDetail(
    val id: kotlin.Int,
    val name: kotlin.String,
    val berries: kotlin.collections.List<BerryFlavorDetailBerriesInner>,
    val contestType: ContestTypeSummary,
    val names: kotlin.collections.List<BerryFlavorName>
)
