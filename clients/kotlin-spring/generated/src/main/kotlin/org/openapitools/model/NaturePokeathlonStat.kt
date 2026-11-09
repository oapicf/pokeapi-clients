package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.PokeathlonStatSummary
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
 * @param maxChange The amount of change.
 * @param pokeathlonStat The stat being affected.
 */
data class NaturePokeathlonStat(

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(required = true, description = "The amount of change.")
    @param:JsonProperty("max_change", required = true)
    @get:JsonProperty("max_change", required = true) val maxChange: kotlin.Int,

    @field:Valid
    @Schema(required = true, description = "The stat being affected.")
    @param:JsonProperty("pokeathlon_stat", required = true)
    @get:JsonProperty("pokeathlon_stat", required = true) val pokeathlonStat: PokeathlonStatSummary
) {

}

