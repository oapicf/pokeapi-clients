package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.PokemonEncountersRetrieve200ResponseInnerLocationArea
import org.openapitools.model.PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner
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
 * @param locationArea 
 * @param versionDetails 
 */
data class PokemonEncountersRetrieve200ResponseInner(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("location_area", required = true) val locationArea: PokemonEncountersRetrieve200ResponseInnerLocationArea,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("version_details", required = true) val versionDetails: kotlin.collections.List<PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner>
) {

}

