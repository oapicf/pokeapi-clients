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
 * @param entryNumber The index of this Pokémon species entry within the Pokédex.
 * @param pokemonSpecies The Pokémon species being encountered.
 */
data class PokemonDexNumber(

    @Schema(required = true, description = "The index of this Pokémon species entry within the Pokédex.")
    @param:JsonProperty("entry_number", required = true)
    @get:JsonProperty("entry_number", required = true) val entryNumber: kotlin.Int,

    @field:Valid
    @Schema(required = true, description = "The Pokémon species being encountered.")
    @param:JsonProperty("pokemon_species", required = true)
    @get:JsonProperty("pokemon_species", required = true) val pokemonSpecies: PokemonSpeciesSummary
) {

}

