package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.LocationAreaEncounterRate
import org.openapitools.model.LocationAreaName
import org.openapitools.model.LocationAreaPokemonEncounter
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
 * @param id The identifier for this resource.
 * @param name The name for this resource.
 * @param gameIndex The internal id of an API resource within game data.
 * @param encounterMethodRates A list of methods in which Pokémon may be encountered in this area and how likely the method will occur depending on the version of the game.
 * @param location The region this location area can be found in.
 * @param names The name of this resource listed in different languages.
 * @param pokemonEncounters A list of Pokémon that can be encountered in this area along with version specific details about the encounter.
 */
data class LocationAreaDetail(

    @Schema(required = true, readOnly = true, description = "The identifier for this resource.")
    @param:JsonProperty("id", required = true)
    @get:JsonProperty("id", required = true) val id: kotlin.Int,

    @get:Size(max=200)
    @Schema(required = true, description = "The name for this resource.")
    @param:JsonProperty("name", required = true)
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(required = true, description = "The internal id of an API resource within game data.")
    @param:JsonProperty("game_index", required = true)
    @get:JsonProperty("game_index", required = true) val gameIndex: kotlin.Int,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A list of methods in which Pokémon may be encountered in this area and how likely the method will occur depending on the version of the game.")
    @param:JsonProperty("encounter_method_rates", required = true)
    @get:JsonProperty("encounter_method_rates", required = true) val encounterMethodRates: kotlin.collections.List<LocationAreaEncounterRate>,

    @field:Valid
    @Schema(required = true, description = "The region this location area can be found in.")
    @param:JsonProperty("location", required = true)
    @get:JsonProperty("location", required = true) val location: LocationSummary,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "The name of this resource listed in different languages.")
    @param:JsonProperty("names", required = true)
    @get:JsonProperty("names", required = true) val names: kotlin.collections.List<LocationAreaName>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A list of Pokémon that can be encountered in this area along with version specific details about the encounter.")
    @param:JsonProperty("pokemon_encounters", required = true)
    @get:JsonProperty("pokemon_encounters", required = true) val pokemonEncounters: kotlin.collections.List<LocationAreaPokemonEncounter>
) {

}

