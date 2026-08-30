package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.PokemonShapeDetailAwesomeNamesInner
import org.openapitools.model.PokemonShapeDetailNamesInner
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
 * @param id 
 * @param name 
 * @param awesomeNames 
 * @param names 
 * @param pokemonSpecies 
 */
data class PokemonShapeDetail(

    @Schema(required = true, readOnly = true, description = "")
    @param:JsonProperty("id")
    @get:JsonProperty("id", required = true) val id: kotlin.Int,

    @get:Size(max=100)
    @Schema(required = true, description = "")
    @param:JsonProperty("name")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "")
    @param:JsonProperty("awesome_names")
    @get:JsonProperty("awesome_names", required = true) val awesomeNames: kotlin.collections.List<PokemonShapeDetailAwesomeNamesInner>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "")
    @param:JsonProperty("names")
    @get:JsonProperty("names", required = true) val names: kotlin.collections.List<PokemonShapeDetailNamesInner>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "")
    @param:JsonProperty("pokemon_species")
    @get:JsonProperty("pokemon_species", required = true) val pokemonSpecies: kotlin.collections.List<PokemonSpeciesSummary>
) {

}

