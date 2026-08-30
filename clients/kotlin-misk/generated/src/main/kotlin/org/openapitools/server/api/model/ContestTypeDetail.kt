package org.openapitools.server.api.model

import org.openapitools.server.api.model.BerryFlavorSummary
import org.openapitools.server.api.model.ContestTypeName
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ContestTypeDetail(
    val id: kotlin.Int,
    val name: kotlin.String,
    val berryFlavor: BerryFlavorSummary,
    val names: kotlin.collections.List<ContestTypeName>
)
