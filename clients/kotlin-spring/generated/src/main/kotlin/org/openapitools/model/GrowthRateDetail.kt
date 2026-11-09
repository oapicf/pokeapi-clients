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
 * @param id The identifier for this resource.
 * @param name The name for this resource.
 * @param formula The formula used to calculate the rate at which the Pokémon species gains level.
 * @param descriptions The descriptions of this characteristic listed in different languages.
 * @param levels A list of levels and the amount of experienced needed to atain them based on this growth rate.
 * @param pokemonSpecies A list of Pokémon species that gain levels at this growth rate.
 */
data class GrowthRateDetail(

    @Schema(required = true, readOnly = true, description = "The identifier for this resource.")
    @param:JsonProperty("id", required = true)
    @get:JsonProperty("id", required = true) val id: kotlin.Int,

    @get:Size(max=200)
    @Schema(required = true, description = "The name for this resource.")
    @param:JsonProperty("name", required = true)
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @get:Size(max=500)
    @Schema(required = true, description = "The formula used to calculate the rate at which the Pokémon species gains level.")
    @param:JsonProperty("formula", required = true)
    @get:JsonProperty("formula", required = true) val formula: kotlin.String,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "The descriptions of this characteristic listed in different languages.")
    @param:JsonProperty("descriptions", required = true)
    @get:JsonProperty("descriptions", required = true) val descriptions: kotlin.collections.List<GrowthRateDescription>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A list of levels and the amount of experienced needed to atain them based on this growth rate.")
    @param:JsonProperty("levels", required = true)
    @get:JsonProperty("levels", required = true) val levels: kotlin.collections.List<Experience>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A list of Pokémon species that gain levels at this growth rate.")
    @param:JsonProperty("pokemon_species", required = true)
    @get:JsonProperty("pokemon_species", required = true) val pokemonSpecies: kotlin.collections.List<PokemonSpeciesSummary>
) {

}

