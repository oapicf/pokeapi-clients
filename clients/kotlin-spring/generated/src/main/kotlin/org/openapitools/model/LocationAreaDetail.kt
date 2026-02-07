package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.LocationAreaDetailEncounterMethodRatesInner
import org.openapitools.model.LocationAreaDetailPokemonEncountersInner
import org.openapitools.model.LocationAreaName
import org.openapitools.model.LocationSummary
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
 * @param id 
 * @param name 
 * @param gameIndex 
 * @param encounterMethodRates 
 * @param location 
 * @param names 
 * @param pokemonEncounters 
 */
data class LocationAreaDetail(

    @Schema(example = "null", required = true, readOnly = true, description = "")
    @get:JsonProperty("id", required = true) val id: kotlin.Int,

    @get:Size(max=100)
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("game_index", required = true) val gameIndex: kotlin.Int,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("encounter_method_rates", required = true) val encounterMethodRates: kotlin.collections.List<LocationAreaDetailEncounterMethodRatesInner>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("location", required = true) val location: LocationSummary,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("names", required = true) val names: kotlin.collections.List<LocationAreaName>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("pokemon_encounters", required = true) val pokemonEncounters: kotlin.collections.List<LocationAreaDetailPokemonEncountersInner>
) {

}

