package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.NatureSummary
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
 * @param maxChange The maximum amount of change to the referenced Pokéathlon stat.
 * @param nature The nature causing the change.
 */
data class PokeathlonStatAffectingNature(

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(required = true, description = "The maximum amount of change to the referenced Pokéathlon stat.")
    @param:JsonProperty("max_change", required = true)
    @get:JsonProperty("max_change", required = true) val maxChange: kotlin.Int,

    @field:Valid
    @Schema(required = true, description = "The nature causing the change.")
    @param:JsonProperty("nature", required = true)
    @get:JsonProperty("nature", required = true) val nature: NatureSummary
) {

}

