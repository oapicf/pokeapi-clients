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
 * @param genus 
 * @param language 
 */
data class PokemonSpeciesDetailGeneraInner(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("genus", required = true) val genus: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("language", required = true) val language: AbilityDetailPokemonInnerPokemon
) {

}

