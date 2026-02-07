package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.BerryFlavorDetailBerriesInnerBerry
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
 * @param potency 
 * @param berry 
 */
data class BerryFlavorDetailBerriesInner(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("potency", required = true) val potency: kotlin.Int,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("berry", required = true) val berry: BerryFlavorDetailBerriesInnerBerry
) {

}

