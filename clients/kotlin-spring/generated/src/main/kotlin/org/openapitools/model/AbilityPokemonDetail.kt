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
 * @param slot Pokémon have 3 ability 'slots' which hold references to possible abilities they could have. This is the slot of this ability for the referenced pokemon.
 * @param pokemon The Pokémon this ability could belong to.
 * @param isHidden Whether or not this a hidden ability for the referenced Pokémon.
 */
data class AbilityPokemonDetail(

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(required = true, description = "Pokémon have 3 ability 'slots' which hold references to possible abilities they could have. This is the slot of this ability for the referenced pokemon.")
    @param:JsonProperty("slot", required = true)
    @get:JsonProperty("slot", required = true) val slot: kotlin.Int,

    @field:Valid
    @Schema(required = true, description = "The Pokémon this ability could belong to.")
    @param:JsonProperty("pokemon", required = true)
    @get:JsonProperty("pokemon", required = true) val pokemon: PokemonSummary,

    @Schema(description = "Whether or not this a hidden ability for the referenced Pokémon.")
    @param:JsonProperty("is_hidden")
    @get:JsonProperty("is_hidden") val isHidden: kotlin.Boolean? = null
) {

}

