package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.LocationAreaPokemonEncounterVersion
import org.openapitools.model.PokemonSummary
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
 * @param pokemon The Pokémon being encountered.
 * @param versionDetails A list of versions and encounters with Pokémon that might happen in the referenced location area.
 */
data class LocationAreaPokemonEncounter(

    @field:Valid
    @Schema(required = true, description = "The Pokémon being encountered.")
    @param:JsonProperty("pokemon", required = true)
    @get:JsonProperty("pokemon", required = true) val pokemon: PokemonSummary,

    @field:Valid
    @Schema(required = true, description = "A list of versions and encounters with Pokémon that might happen in the referenced location area.")
    @param:JsonProperty("version_details", required = true)
    @get:JsonProperty("version_details", required = true) val versionDetails: kotlin.collections.List<LocationAreaPokemonEncounterVersion>
) {

}

