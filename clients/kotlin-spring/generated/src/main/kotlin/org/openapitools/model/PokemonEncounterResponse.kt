package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.LocationAreaSummary
import org.openapitools.model.PokemonEncounterVersionDetailResponse
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
 * @param locationArea The location area the referenced Pokémon can be encountered in.
 * @param versionDetails A list of versions and encounters with the referenced Pokémon that might happen.
 */
data class PokemonEncounterResponse(

    @field:Valid
    @Schema(required = true, description = "The location area the referenced Pokémon can be encountered in.")
    @param:JsonProperty("location_area", required = true)
    @get:JsonProperty("location_area", required = true) val locationArea: LocationAreaSummary,

    @field:Valid
    @Schema(required = true, description = "A list of versions and encounters with the referenced Pokémon that might happen.")
    @param:JsonProperty("version_details", required = true)
    @get:JsonProperty("version_details", required = true) val versionDetails: kotlin.collections.List<PokemonEncounterVersionDetailResponse>
) {

}

