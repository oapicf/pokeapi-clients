package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.TypeDetailPokemonInnerPokemon
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
 * @param slot 
 * @param pokemon 
 */
data class TypeDetailPokemonInner(

    @Schema(example = "null", description = "")
    @get:JsonProperty("slot") val slot: kotlin.Int? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("pokemon") val pokemon: TypeDetailPokemonInnerPokemon? = null
) {

}

