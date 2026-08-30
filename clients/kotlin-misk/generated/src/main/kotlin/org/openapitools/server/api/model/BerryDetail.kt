package org.openapitools.server.api.model

import org.openapitools.server.api.model.BerryDetailFlavorsInner
import org.openapitools.server.api.model.BerryFirmnessSummary
import org.openapitools.server.api.model.ItemSummary
import org.openapitools.server.api.model.TypeSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BerryDetail(
    val id: kotlin.Int,
    val name: kotlin.String,
    val growthTime: kotlin.Int,
    val maxHarvest: kotlin.Int,
    val naturalGiftPower: kotlin.Int,
    val propertySize: kotlin.Int,
    val smoothness: kotlin.Int,
    val soilDryness: kotlin.Int,
    val firmness: BerryFirmnessSummary,
    val flavors: kotlin.collections.List<BerryDetailFlavorsInner>,
    val item: ItemSummary,
    val naturalGiftType: TypeSummary
)
