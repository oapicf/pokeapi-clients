package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.EncounterConditionValueSummary
import org.openapitools.model.EncounterMethodSummary
import org.openapitools.model.EncounterPokemonDetail
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
 * @param minLevel The lowest level the Pokémon could be encountered at.
 * @param maxLevel The highest level the Pokémon could be encountered at.
 * @param conditionValues A list of condition values that must be in effect for this encounter to occur.
 * @param pokemonDetails Additional properties of the encountered Pokémon, or null if unspecified.
 * @param chance Percent chance that this encounter will occur.
 * @param method The method by which this encounter happens.
 */
data class LocationAreaEncounterDetail(

    @Schema(required = true, description = "The lowest level the Pokémon could be encountered at.")
    @param:JsonProperty("min_level", required = true)
    @get:JsonProperty("min_level", required = true) val minLevel: kotlin.Int,

    @Schema(required = true, description = "The highest level the Pokémon could be encountered at.")
    @param:JsonProperty("max_level", required = true)
    @get:JsonProperty("max_level", required = true) val maxLevel: kotlin.Int,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A list of condition values that must be in effect for this encounter to occur.")
    @param:JsonProperty("condition_values", required = true)
    @get:JsonProperty("condition_values", required = true) val conditionValues: kotlin.collections.List<EncounterConditionValueSummary>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "Additional properties of the encountered Pokémon, or null if unspecified.")
    @param:JsonProperty("pokemon_details", required = true)
    @get:JsonProperty("pokemon_details", required = true) val pokemonDetails: EncounterPokemonDetail?,

    @Schema(description = "Percent chance that this encounter will occur.")
    @param:JsonProperty("chance")
    @get:JsonProperty("chance") val chance: kotlin.Int? = 0,

    @field:Valid
    @Schema(description = "The method by which this encounter happens.")
    @param:JsonProperty("method")
    @get:JsonProperty("method") val method: EncounterMethodSummary? = null
) {

}

