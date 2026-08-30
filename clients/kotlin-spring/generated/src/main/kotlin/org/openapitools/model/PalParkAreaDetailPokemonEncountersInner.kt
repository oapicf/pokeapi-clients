package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AbilityDetailPokemonInnerPokemon
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
 * @param baseScore 
 * @param pokemonSpecies 
 * @param rate 
 */
data class PalParkAreaDetailPokemonEncountersInner(

    @Schema(required = true, description = "")
    @param:JsonProperty("base_score")
    @get:JsonProperty("base_score", required = true) val baseScore: kotlin.Int,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("pokemon-species")
    @get:JsonProperty("pokemon-species", required = true) val pokemonSpecies: AbilityDetailPokemonInnerPokemon,

    @Schema(required = true, description = "")
    @param:JsonProperty("rate")
    @get:JsonProperty("rate", required = true) val rate: kotlin.Int
) {

}

