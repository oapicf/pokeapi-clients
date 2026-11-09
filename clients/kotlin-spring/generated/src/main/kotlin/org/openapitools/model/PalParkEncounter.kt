package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.PokemonSpeciesSummary
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
 * @param rate The base rate for encountering this Pokémon in this pal park area.
 * @param pokemonSpecies The Pokémon species being encountered.
 * @param baseScore The base score given to the player when this Pokémon is caught during a pal park run.
 */
data class PalParkEncounter(

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(required = true, description = "The base rate for encountering this Pokémon in this pal park area.")
    @param:JsonProperty("rate", required = true)
    @get:JsonProperty("rate", required = true) val rate: kotlin.Int,

    @field:Valid
    @Schema(required = true, description = "The Pokémon species being encountered.")
    @param:JsonProperty("pokemon_species", required = true)
    @get:JsonProperty("pokemon_species", required = true) val pokemonSpecies: PokemonSpeciesSummary,

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(description = "The base score given to the player when this Pokémon is caught during a pal park run.")
    @param:JsonProperty("base_score")
    @get:JsonProperty("base_score") val baseScore: kotlin.Int? = null
) {

}

