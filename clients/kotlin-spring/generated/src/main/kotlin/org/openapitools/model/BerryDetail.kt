package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.BerryFirmnessSummary
import org.openapitools.model.BerryFlavorMap
import org.openapitools.model.ItemSummary
import org.openapitools.model.TypeSummary
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param id The identifier for this resource.
 * @param name The name for this resource.
 * @param firmness The firmness of this berry, used in making Pokéblocks or Poffins.
 * @param flavors A list of references to each flavor a berry can have and the potency of each of those flavors in regard to this berry.
 * @param item Berries are actually items. This is a reference to the item specific data for this berry.
 * @param naturalGiftType The type inherited by \"Natural Gift\" when used with this Berry.
 * @param growthTime Time it takes the tree to grow one stage, in hours. Berry trees go through four of these growth stages before they can be picked.
 * @param maxHarvest The maximum number of these berries that can grow on one tree in Generation IV.
 * @param naturalGiftPower The power of the move \"Natural Gift\" when used with this Berry.
 * @param propertySize The size of this Berry, in millimeters.
 * @param smoothness The smoothness of this Berry, used in making Pokéblocks or Poffins.
 * @param soilDryness The speed at which this Berry dries out the soil as it grows. A higher rate means the soil dries more quickly.
 */
data class BerryDetail(

    @Schema(required = true, readOnly = true, description = "The identifier for this resource.")
    @param:JsonProperty("id", required = true)
    @get:JsonProperty("id", required = true) val id: kotlin.Int,

    @get:Size(max=200)
    @Schema(required = true, description = "The name for this resource.")
    @param:JsonProperty("name", required = true)
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @field:Valid
    @Schema(required = true, description = "The firmness of this berry, used in making Pokéblocks or Poffins.")
    @param:JsonProperty("firmness", required = true)
    @get:JsonProperty("firmness", required = true) val firmness: BerryFirmnessSummary?,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A list of references to each flavor a berry can have and the potency of each of those flavors in regard to this berry.")
    @param:JsonProperty("flavors", required = true)
    @get:JsonProperty("flavors", required = true) val flavors: kotlin.collections.List<BerryFlavorMap>,

    @field:Valid
    @Schema(required = true, description = "Berries are actually items. This is a reference to the item specific data for this berry.")
    @param:JsonProperty("item", required = true)
    @get:JsonProperty("item", required = true) val item: ItemSummary,

    @field:Valid
    @Schema(required = true, description = "The type inherited by \"Natural Gift\" when used with this Berry.")
    @param:JsonProperty("natural_gift_type", required = true)
    @get:JsonProperty("natural_gift_type", required = true) val naturalGiftType: TypeSummary?,

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(description = "Time it takes the tree to grow one stage, in hours. Berry trees go through four of these growth stages before they can be picked.")
    @param:JsonProperty("growth_time")
    @get:JsonProperty("growth_time") val growthTime: kotlin.Int? = null,

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(description = "The maximum number of these berries that can grow on one tree in Generation IV.")
    @param:JsonProperty("max_harvest")
    @get:JsonProperty("max_harvest") val maxHarvest: kotlin.Int? = null,

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(description = "The power of the move \"Natural Gift\" when used with this Berry.")
    @param:JsonProperty("natural_gift_power")
    @get:JsonProperty("natural_gift_power") val naturalGiftPower: kotlin.Int? = null,

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(description = "The size of this Berry, in millimeters.")
    @param:JsonProperty("size")
    @get:JsonProperty("size") val propertySize: kotlin.Int? = null,

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(description = "The smoothness of this Berry, used in making Pokéblocks or Poffins.")
    @param:JsonProperty("smoothness")
    @get:JsonProperty("smoothness") val smoothness: kotlin.Int? = null,

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(description = "The speed at which this Berry dries out the soil as it grows. A higher rate means the soil dries more quickly.")
    @param:JsonProperty("soil_dryness")
    @get:JsonProperty("soil_dryness") val soilDryness: kotlin.Int? = null
) {

}

