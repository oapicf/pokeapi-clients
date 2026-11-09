package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.VersionSummary
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
 * @param rate The chance of an encounter to occur.
 * @param version The version of the game in which the encounter can occur with the given chance.
 */
data class LocationAreaEncounterVersionDetail(

    @Schema(required = true, description = "The chance of an encounter to occur.")
    @param:JsonProperty("rate", required = true)
    @get:JsonProperty("rate", required = true) val rate: kotlin.Int,

    @field:Valid
    @Schema(required = true, description = "The version of the game in which the encounter can occur with the given chance.")
    @param:JsonProperty("version", required = true)
    @get:JsonProperty("version", required = true) val version: VersionSummary
) {

}

