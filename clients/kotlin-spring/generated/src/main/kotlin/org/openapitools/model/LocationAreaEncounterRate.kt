package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.EncounterMethodSummary
import org.openapitools.model.LocationAreaEncounterVersionDetail
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
 * @param encounterMethod The method in which Pokémon may be encountered in an area..
 * @param versionDetails The chance of the encounter to occur on a version of the game.
 */
data class LocationAreaEncounterRate(

    @field:Valid
    @Schema(required = true, description = "The method in which Pokémon may be encountered in an area..")
    @param:JsonProperty("encounter_method", required = true)
    @get:JsonProperty("encounter_method", required = true) val encounterMethod: EncounterMethodSummary,

    @field:Valid
    @Schema(required = true, description = "The chance of the encounter to occur on a version of the game.")
    @param:JsonProperty("version_details", required = true)
    @get:JsonProperty("version_details", required = true) val versionDetails: kotlin.collections.List<LocationAreaEncounterVersionDetail>
) {

}

