package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.PokemonShapeAwesomeName
import org.openapitools.model.PokemonShapeName
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
 * @param awesomeNames The \"scientific\" name of this Pokémon shape listed in different languages.
 * @param names The name of this resource listed in different languages.
 * @param pokemonSpecies A list of the Pokémon species that have this shape.
 */
data class PokemonShapeDetail(

    @Schema(required = true, readOnly = true, description = "The identifier for this resource.")
    @param:JsonProperty("id", required = true)
    @get:JsonProperty("id", required = true) val id: kotlin.Int,

    @get:Size(max=200)
    @Schema(required = true, description = "The name for this resource.")
    @param:JsonProperty("name", required = true)
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "The \"scientific\" name of this Pokémon shape listed in different languages.")
    @param:JsonProperty("awesome_names", required = true)
    @get:JsonProperty("awesome_names", required = true) val awesomeNames: kotlin.collections.List<PokemonShapeAwesomeName>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "The name of this resource listed in different languages.")
    @param:JsonProperty("names", required = true)
    @get:JsonProperty("names", required = true) val names: kotlin.collections.List<PokemonShapeName>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A list of the Pokémon species that have this shape.")
    @param:JsonProperty("pokemon_species", required = true)
    @get:JsonProperty("pokemon_species", required = true) val pokemonSpecies: kotlin.collections.List<PokemonSpeciesSummary>
) {

}

