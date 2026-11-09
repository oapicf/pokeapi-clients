package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.EncounterConditionValueSummary
import org.openapitools.model.EncounterMethodSummary
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
 * @param chance Percent chance that this encounter will occur.
 * @param conditionValues A list of condition values that must be in effect for this encounter to occur.
 * @param maxLevel The highest level the Pokémon could be encountered at.
 * @param method The method by which this encounter happens.
 * @param minLevel The lowest level the Pokémon could be encountered at.
 */
data class PokemonEncounterDetailResponse(

    @Schema(required = true, description = "Percent chance that this encounter will occur.")
    @param:JsonProperty("chance", required = true)
    @get:JsonProperty("chance", required = true) val chance: kotlin.Int,

    @field:Valid
    @Schema(required = true, description = "A list of condition values that must be in effect for this encounter to occur.")
    @param:JsonProperty("condition_values", required = true)
    @get:JsonProperty("condition_values", required = true) val conditionValues: kotlin.collections.List<EncounterConditionValueSummary>,

    @Schema(required = true, description = "The highest level the Pokémon could be encountered at.")
    @param:JsonProperty("max_level", required = true)
    @get:JsonProperty("max_level", required = true) val maxLevel: kotlin.Int,

    @field:Valid
    @Schema(required = true, description = "The method by which this encounter happens.")
    @param:JsonProperty("method", required = true)
    @get:JsonProperty("method", required = true) val method: EncounterMethodSummary,

    @Schema(required = true, description = "The lowest level the Pokémon could be encountered at.")
    @param:JsonProperty("min_level", required = true)
    @get:JsonProperty("min_level", required = true) val minLevel: kotlin.Int
) {

}

