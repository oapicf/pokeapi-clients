package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner
import org.openapitools.model.PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod
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
 * @param chance 
 * @param conditionValues 
 * @param maxLevel 
 * @param method 
 * @param minLevel 
 */
data class PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner(

    @Schema(example = "100", required = true, description = "")
    @get:JsonProperty("chance", required = true) val chance: java.math.BigDecimal,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("condition_values", required = true) val conditionValues: kotlin.collections.List<PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner>,

    @Schema(example = "10", required = true, description = "")
    @get:JsonProperty("max_level", required = true) val maxLevel: java.math.BigDecimal,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("method", required = true) val method: PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod,

    @Schema(example = "10", required = true, description = "")
    @get:JsonProperty("min_level", required = true) val minLevel: java.math.BigDecimal
) {

}

