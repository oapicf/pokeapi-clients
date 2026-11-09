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
 * @param rate The chance of this Pokémon being female, in eighths; or -1 for genderless.
 * @param pokemonSpecies A Pokémon species that can be the referenced gender.
 */
data class GenderPokemonSpecies(

    @Schema(required = true, description = "The chance of this Pokémon being female, in eighths; or -1 for genderless.")
    @param:JsonProperty("rate", required = true)
    @get:JsonProperty("rate", required = true) val rate: kotlin.Int,

    @field:Valid
    @Schema(required = true, description = "A Pokémon species that can be the referenced gender.")
    @param:JsonProperty("pokemon_species", required = true)
    @get:JsonProperty("pokemon_species", required = true) val pokemonSpecies: PokemonSpeciesSummary
) {

}

