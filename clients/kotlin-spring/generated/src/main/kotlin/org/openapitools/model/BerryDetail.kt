package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.BerryDetailFlavorsInner
import org.openapitools.model.BerryFirmnessSummary
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
 * @param id 
 * @param name 
 * @param growthTime 
 * @param maxHarvest 
 * @param naturalGiftPower 
 * @param propertySize 
 * @param smoothness 
 * @param soilDryness 
 * @param firmness 
 * @param flavors 
 * @param item 
 * @param naturalGiftType 
 */
data class BerryDetail(

    @Schema(example = "null", required = true, readOnly = true, description = "")
    @get:JsonProperty("id", required = true) val id: kotlin.Int,

    @get:Size(max=100)
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("growth_time", required = true) val growthTime: kotlin.Int,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("max_harvest", required = true) val maxHarvest: kotlin.Int,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("natural_gift_power", required = true) val naturalGiftPower: kotlin.Int,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("size", required = true) val propertySize: kotlin.Int,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("smoothness", required = true) val smoothness: kotlin.Int,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("soil_dryness", required = true) val soilDryness: kotlin.Int,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("firmness", required = true) val firmness: BerryFirmnessSummary,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("flavors", required = true) val flavors: kotlin.collections.List<BerryDetailFlavorsInner>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("item", required = true) val item: ItemSummary,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("natural_gift_type", required = true) val naturalGiftType: TypeSummary
) {

}

