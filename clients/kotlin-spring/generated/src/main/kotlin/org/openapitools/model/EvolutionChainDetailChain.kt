package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AbilityDetailPokemonInnerPokemon
import org.openapitools.model.EvolutionChainDetailChainEvolvesToInner
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
 * @param evolutionDetails 
 * @param evolvesTo 
 * @param isBaby 
 * @param species 
 */
data class EvolutionChainDetailChain(

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("evolution_details")
    @get:JsonProperty("evolution_details", required = true) val evolutionDetails: kotlin.collections.List<kotlin.Any>,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("evolves_to")
    @get:JsonProperty("evolves_to", required = true) val evolvesTo: kotlin.collections.List<EvolutionChainDetailChainEvolvesToInner>,

    @Schema(required = true, description = "")
    @param:JsonProperty("is_baby")
    @get:JsonProperty("is_baby", required = true) val isBaby: kotlin.Boolean,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("species")
    @get:JsonProperty("species", required = true) val species: AbilityDetailPokemonInnerPokemon
) {

}

