package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.GenderPokemonSpecies
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
 * @param pokemonSpeciesDetails A list of Pokémon species that can be this gender and how likely it is that they will be.
 * @param requiredForEvolution A list of Pokémon species that required this gender in order for a Pokémon to evolve into them.
 */
data class GenderDetail(

    @Schema(required = true, readOnly = true, description = "The identifier for this resource.")
    @param:JsonProperty("id", required = true)
    @get:JsonProperty("id", required = true) val id: kotlin.Int,

    @get:Size(max=200)
    @Schema(required = true, description = "The name for this resource.")
    @param:JsonProperty("name", required = true)
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A list of Pokémon species that can be this gender and how likely it is that they will be.")
    @param:JsonProperty("pokemon_species_details", required = true)
    @get:JsonProperty("pokemon_species_details", required = true) val pokemonSpeciesDetails: kotlin.collections.List<GenderPokemonSpecies>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A list of Pokémon species that required this gender in order for a Pokémon to evolve into them.")
    @param:JsonProperty("required_for_evolution", required = true)
    @get:JsonProperty("required_for_evolution", required = true) val requiredForEvolution: kotlin.collections.List<PokemonSpeciesSummary>
) {

}

