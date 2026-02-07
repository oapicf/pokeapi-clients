package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AbilityDetailPokemonInnerPokemon
import org.openapitools.model.PokemonDetailAbilitiesInner
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
 * @param abilities 
 * @param generation 
 */
data class PokemonDetailPastAbilitiesInner(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("abilities", required = true) val abilities: kotlin.collections.List<PokemonDetailAbilitiesInner>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("generation", required = true) val generation: AbilityDetailPokemonInnerPokemon
) {

}

