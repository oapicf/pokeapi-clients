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
 * @param frontDefault The URL of the default Pokémon Showdown front image, or null if unavailable.
 * @param frontFemale The URL of the female Pokémon Showdown front image, or null if unavailable.
 * @param frontShiny The URL of the shiny Pokémon Showdown front image, or null if unavailable.
 * @param frontShinyFemale The URL of the shiny female Pokémon Showdown front image, or null if unavailable.
 * @param backDefault The URL of the default Pokémon Showdown back image, or null if unavailable.
 * @param backFemale The URL of the female Pokémon Showdown back image, or null if unavailable.
 * @param backShiny The URL of the shiny Pokémon Showdown back image, or null if unavailable.
 * @param backShinyFemale The URL of the shiny female Pokémon Showdown back image, or null if unavailable.
 */
data class PokemonSpritesOtherShowdown(

    @Schema(required = true, description = "The URL of the default Pokémon Showdown front image, or null if unavailable.")
    @param:JsonProperty("front_default", required = true)
    @get:JsonProperty("front_default", required = true) val frontDefault: kotlin.String?,

    @Schema(required = true, description = "The URL of the female Pokémon Showdown front image, or null if unavailable.")
    @param:JsonProperty("front_female", required = true)
    @get:JsonProperty("front_female", required = true) val frontFemale: kotlin.String?,

    @Schema(required = true, description = "The URL of the shiny Pokémon Showdown front image, or null if unavailable.")
    @param:JsonProperty("front_shiny", required = true)
    @get:JsonProperty("front_shiny", required = true) val frontShiny: kotlin.String?,

    @Schema(required = true, description = "The URL of the shiny female Pokémon Showdown front image, or null if unavailable.")
    @param:JsonProperty("front_shiny_female", required = true)
    @get:JsonProperty("front_shiny_female", required = true) val frontShinyFemale: kotlin.String?,

    @Schema(required = true, description = "The URL of the default Pokémon Showdown back image, or null if unavailable.")
    @param:JsonProperty("back_default", required = true)
    @get:JsonProperty("back_default", required = true) val backDefault: kotlin.String?,

    @Schema(required = true, description = "The URL of the female Pokémon Showdown back image, or null if unavailable.")
    @param:JsonProperty("back_female", required = true)
    @get:JsonProperty("back_female", required = true) val backFemale: kotlin.String?,

    @Schema(required = true, description = "The URL of the shiny Pokémon Showdown back image, or null if unavailable.")
    @param:JsonProperty("back_shiny", required = true)
    @get:JsonProperty("back_shiny", required = true) val backShiny: kotlin.String?,

    @Schema(required = true, description = "The URL of the shiny female Pokémon Showdown back image, or null if unavailable.")
    @param:JsonProperty("back_shiny_female", required = true)
    @get:JsonProperty("back_shiny_female", required = true) val backShinyFemale: kotlin.String?
) {

}

