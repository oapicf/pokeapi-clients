package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.StatSummary
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
 * @param change The amount of change.
 * @param stat The stat being affected.
 */
data class MoveMetaStatChange(

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(required = true, description = "The amount of change.")
    @param:JsonProperty("change", required = true)
    @get:JsonProperty("change", required = true) val change: kotlin.Int,

    @field:Valid
    @Schema(required = true, description = "The stat being affected.")
    @param:JsonProperty("stat", required = true)
    @get:JsonProperty("stat", required = true) val stat: StatSummary
) {

}

