package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.GenerationSummary
import org.openapitools.model.PokemonAbilityPast
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
 * @param abilities The abilities the referenced pokémon had up to and including the listed generation. If null, the slot was previously empty.
 * @param generation The last generation in which the referenced pokémon had the listed abilities.
 */
data class PokemonPastAbility(

    @field:Valid
    @Schema(required = true, description = "The abilities the referenced pokémon had up to and including the listed generation. If null, the slot was previously empty.")
    @param:JsonProperty("abilities", required = true)
    @get:JsonProperty("abilities", required = true) val abilities: kotlin.collections.List<PokemonAbilityPast>,

    @field:Valid
    @Schema(required = true, description = "The last generation in which the referenced pokémon had the listed abilities.")
    @param:JsonProperty("generation", required = true)
    @get:JsonProperty("generation", required = true) val generation: GenerationSummary
) {

}

