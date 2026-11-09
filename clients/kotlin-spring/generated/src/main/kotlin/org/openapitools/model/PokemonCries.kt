package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * @param latest The latest depiction of this Pokémon's cry.
 * @param legacy The legacy depiction of this Pokémon's cry.
 */
data class PokemonCries(

    @Schema(required = true, description = "The latest depiction of this Pokémon's cry.")
    @param:JsonProperty("latest", required = true)
    @get:JsonProperty("latest", required = true) val latest: kotlin.String?,

    @Schema(required = true, description = "The legacy depiction of this Pokémon's cry.")
    @param:JsonProperty("legacy", required = true)
    @get:JsonProperty("legacy", required = true) val legacy: kotlin.String?
) {

}

