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
 * @param isDefault Whether this variety is the default variety.
 * @param pokemon The Pokémon variety.
 */
data class PokemonSpeciesVariety(

    @Schema(required = true, description = "Whether this variety is the default variety.")
    @param:JsonProperty("is_default", required = true)
    @get:JsonProperty("is_default", required = true) val isDefault: kotlin.Boolean,

    @field:Valid
    @Schema(required = true, description = "The Pokémon variety.")
    @param:JsonProperty("pokemon", required = true)
    @get:JsonProperty("pokemon", required = true) val pokemon: PokemonSummary
) {

}

