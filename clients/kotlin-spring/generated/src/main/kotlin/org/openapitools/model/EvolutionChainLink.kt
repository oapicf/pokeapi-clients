package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.PokemonEvolution
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
 * @param isBaby Whether or not this link is for a baby Pokémon. This would only ever be true on the base link.
 * @param species The Pokémon species at this point in the evolution chain.
 * @param evolutionDetails All details regarding the specific details of the referenced Pokémon species evolution.
 * @param evolvesTo A List of chain objects.
 */
data class EvolutionChainLink(

    @Schema(required = true, description = "Whether or not this link is for a baby Pokémon. This would only ever be true on the base link.")
    @param:JsonProperty("is_baby", required = true)
    @get:JsonProperty("is_baby", required = true) val isBaby: kotlin.Boolean,

    @field:Valid
    @Schema(required = true, description = "The Pokémon species at this point in the evolution chain.")
    @param:JsonProperty("species", required = true)
    @get:JsonProperty("species", required = true) val species: PokemonSpeciesSummary,

    @field:Valid
    @Schema(required = true, description = "All details regarding the specific details of the referenced Pokémon species evolution.")
    @param:JsonProperty("evolution_details", required = true)
    @get:JsonProperty("evolution_details", required = true) val evolutionDetails: kotlin.collections.List<PokemonEvolution>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A List of chain objects.")
    @param:JsonProperty("evolves_to", required = true)
    @get:JsonProperty("evolves_to", required = true) val evolvesTo: kotlin.collections.List<EvolutionChainLink>
) {

}

