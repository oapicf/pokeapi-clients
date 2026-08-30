@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class BerryDetail(
    @field:JsonProperty("id")
    val id: kotlin.Int,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("growth_time")
    val growthTime: kotlin.Int,

    @field:JsonProperty("max_harvest")
    val maxHarvest: kotlin.Int,

    @field:JsonProperty("natural_gift_power")
    val naturalGiftPower: kotlin.Int,

    @field:JsonProperty("size")
    val propertySize: kotlin.Int,

    @field:JsonProperty("smoothness")
    val smoothness: kotlin.Int,

    @field:JsonProperty("soil_dryness")
    val soilDryness: kotlin.Int,

    @field:JsonProperty("firmness")
    val firmness: BerryFirmnessSummary,

    @field:JsonProperty("flavors")
    val flavors: kotlin.collections.List<BerryDetailFlavorsInner>,

    @field:JsonProperty("item")
    val item: ItemSummary,

    @field:JsonProperty("natural_gift_type")
    val naturalGiftType: TypeSummary,

)
