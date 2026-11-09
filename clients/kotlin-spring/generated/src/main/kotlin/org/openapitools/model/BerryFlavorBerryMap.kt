package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.BerrySummary
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
 * @param potency How powerful the referenced flavor is for this berry.
 * @param berry The berry with the referenced flavor.
 */
data class BerryFlavorBerryMap(

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(required = true, description = "How powerful the referenced flavor is for this berry.")
    @param:JsonProperty("potency", required = true)
    @get:JsonProperty("potency", required = true) val potency: kotlin.Int,

    @field:Valid
    @Schema(required = true, description = "The berry with the referenced flavor.")
    @param:JsonProperty("berry", required = true)
    @get:JsonProperty("berry", required = true) val berry: BerrySummary
) {

}

