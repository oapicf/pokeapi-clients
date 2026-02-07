package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AbilityDetailPokemonInnerPokemon
import org.openapitools.model.LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails
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
 * @param version 
 * @param maxChance 
 * @param encounterDetails 
 */
data class LocationAreaDetailPokemonEncountersInnerVersionDetailsInner(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("version", required = true) val version: AbilityDetailPokemonInnerPokemon,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("max_chance", required = true) val maxChance: kotlin.Int,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("encounter_details", required = true) val encounterDetails: LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails
) {

}

