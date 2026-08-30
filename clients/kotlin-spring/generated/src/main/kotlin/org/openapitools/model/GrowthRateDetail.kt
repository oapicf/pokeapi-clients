package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.Experience
import org.openapitools.model.GrowthRateDescription
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
 * @param formula 
 * @param descriptions 
 * @param levels 
 * @param pokemonSpecies 
 */
data class GrowthRateDetail(

    @Schema(required = true, readOnly = true, description = "")
    @param:JsonProperty("id")
    @get:JsonProperty("id", required = true) val id: kotlin.Int,

    @get:Size(max=100)
    @Schema(required = true, description = "")
    @param:JsonProperty("name")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @get:Size(max=500)
    @Schema(required = true, description = "")
    @param:JsonProperty("formula")
    @get:JsonProperty("formula", required = true) val formula: kotlin.String,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "")
    @param:JsonProperty("descriptions")
    @get:JsonProperty("descriptions", required = true) val descriptions: kotlin.collections.List<GrowthRateDescription>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "")
    @param:JsonProperty("levels")
    @get:JsonProperty("levels", required = true) val levels: kotlin.collections.List<Experience>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "")
    @param:JsonProperty("pokemon_species")
    @get:JsonProperty("pokemon_species", required = true) val pokemonSpecies: kotlin.collections.List<PokemonSpeciesSummary>
) {

}

