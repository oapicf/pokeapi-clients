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
 * @param change 
 * @param stat 
 */
data class MoveDetailStatChangesInner(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("change", required = true) val change: kotlin.Int,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("stat", required = true) val stat: AbilityDetailPokemonInnerPokemon
) {

}

