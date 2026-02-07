package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AbilityDetailPokemonInnerPokemon
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
 * @param minLevel 
 * @param maxLevel 
 * @param chance 
 * @param method 
 * @param conditionValues 
 */
data class LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("min_level", required = true) val minLevel: kotlin.Int,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("max_level", required = true) val maxLevel: kotlin.Int,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("chance", required = true) val chance: kotlin.Int,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("method", required = true) val method: AbilityDetailPokemonInnerPokemon,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("condition_values") val conditionValues: AbilityDetailPokemonInnerPokemon? = null
) {

}

