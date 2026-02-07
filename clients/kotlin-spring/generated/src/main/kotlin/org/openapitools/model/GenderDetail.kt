package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AbilityDetailPokemonInnerPokemon
import org.openapitools.model.GenderDetailPokemonSpeciesDetailsInner
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
 * @param id 
 * @param name 
 * @param pokemonSpeciesDetails 
 * @param requiredForEvolution 
 */
data class GenderDetail(

    @Schema(example = "null", required = true, readOnly = true, description = "")
    @get:JsonProperty("id", required = true) val id: kotlin.Int,

    @get:Size(max=100)
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("pokemon_species_details", required = true) val pokemonSpeciesDetails: kotlin.collections.List<GenderDetailPokemonSpeciesDetailsInner>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("required_for_evolution", required = true) val requiredForEvolution: kotlin.collections.List<AbilityDetailPokemonInnerPokemon>
) {

}

