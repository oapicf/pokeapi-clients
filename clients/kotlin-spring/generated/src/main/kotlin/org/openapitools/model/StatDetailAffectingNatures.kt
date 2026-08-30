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
 * @param increase 
 * @param decrease 
 */
data class StatDetailAffectingNatures(

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("increase")
    @get:JsonProperty("increase", required = true) val increase: kotlin.collections.List<AbilityDetailPokemonInnerPokemon>,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("decrease")
    @get:JsonProperty("decrease", required = true) val decrease: kotlin.collections.List<AbilityDetailPokemonInnerPokemon>
) {

}

