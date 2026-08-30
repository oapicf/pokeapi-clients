package org.openapitools.server.api.model

import org.openapitools.server.api.model.BerryDetailFlavorsInnerFlavor
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BerryDetailFlavorsInner(
    val potency: kotlin.Int,
    val flavor: BerryDetailFlavorsInnerFlavor
)
