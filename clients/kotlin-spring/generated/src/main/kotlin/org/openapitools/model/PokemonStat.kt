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
 * @param baseStat 
 * @param effort 
 * @param stat 
 */
data class PokemonStat(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("base_stat", required = true) val baseStat: kotlin.Int,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("effort", required = true) val effort: kotlin.Int,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("stat", required = true) val stat: StatSummary
) {

}

