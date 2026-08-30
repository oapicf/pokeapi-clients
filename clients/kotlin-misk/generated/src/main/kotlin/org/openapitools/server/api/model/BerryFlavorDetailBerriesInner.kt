package org.openapitools.server.api.model

import org.openapitools.server.api.model.BerryFlavorDetailBerriesInnerBerry
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BerryFlavorDetailBerriesInner(
    val potency: kotlin.Int,
    val berry: BerryFlavorDetailBerriesInnerBerry
)
