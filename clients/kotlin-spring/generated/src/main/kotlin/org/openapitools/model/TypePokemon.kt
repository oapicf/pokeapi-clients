package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * @param slot The order the Pokémon's types are listed in.
 * @param pokemon The Pokémon that has the referenced type.
 */
data class TypePokemon(

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(required = true, description = "The order the Pokémon's types are listed in.")
    @param:JsonProperty("slot", required = true)
    @get:JsonProperty("slot", required = true) val slot: kotlin.Int,

    @field:Valid
    @Schema(required = true, description = "The Pokémon that has the referenced type.")
    @param:JsonProperty("pokemon", required = true)
    @get:JsonProperty("pokemon", required = true) val pokemon: PokemonSummary
) {

}

