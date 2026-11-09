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
 * @param frontDefault The URL of the default Pokémon Dream World front image, or null if unavailable.
 * @param frontFemale The URL of the female Pokémon Dream World front image, or null if unavailable.
 */
data class PokemonSpritesOtherDreamWorld(

    @Schema(required = true, description = "The URL of the default Pokémon Dream World front image, or null if unavailable.")
    @param:JsonProperty("front_default", required = true)
    @get:JsonProperty("front_default", required = true) val frontDefault: kotlin.String?,

    @Schema(required = true, description = "The URL of the female Pokémon Dream World front image, or null if unavailable.")
    @param:JsonProperty("front_female", required = true)
    @get:JsonProperty("front_female", required = true) val frontFemale: kotlin.String?
) {

}

