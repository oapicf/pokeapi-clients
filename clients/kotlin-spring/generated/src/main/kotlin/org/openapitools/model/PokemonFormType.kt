package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.TypeSummary
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
 * @param slot The order the Pokémon's types are listed in.
 * @param type The type the referenced Form has.
 */
data class PokemonFormType(

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(required = true, description = "The order the Pokémon's types are listed in.")
    @param:JsonProperty("slot", required = true)
    @get:JsonProperty("slot", required = true) val slot: kotlin.Int,

    @field:Valid
    @Schema(required = true, description = "The type the referenced Form has.")
    @param:JsonProperty("type", required = true)
    @get:JsonProperty("type", required = true) val type: TypeSummary
) {

}

