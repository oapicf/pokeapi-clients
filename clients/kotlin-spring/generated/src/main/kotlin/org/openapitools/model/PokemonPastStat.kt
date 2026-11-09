package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.GenerationSummary
import org.openapitools.model.PokemonStat
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
 * @param generation The last generation in which the referenced pokémon had the listed stats.
 * @param stats The stat the Pokémon had up to and including the listed generation.
 */
data class PokemonPastStat(

    @field:Valid
    @Schema(required = true, description = "The last generation in which the referenced pokémon had the listed stats.")
    @param:JsonProperty("generation", required = true)
    @get:JsonProperty("generation", required = true) val generation: GenerationSummary,

    @field:Valid
    @Schema(required = true, description = "The stat the Pokémon had up to and including the listed generation.")
    @param:JsonProperty("stats", required = true)
    @get:JsonProperty("stats", required = true) val stats: kotlin.collections.List<PokemonStat>
) {

}

