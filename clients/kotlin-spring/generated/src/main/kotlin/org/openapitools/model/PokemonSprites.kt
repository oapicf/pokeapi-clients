package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.PokemonSpritesOther
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
 * @param frontDefault The default depiction of this Pokémon from the front in battle.
 * @param frontShiny The shiny depiction of this Pokémon from the front in battle.
 * @param frontFemale The female depiction of this Pokémon from the front in battle.
 * @param frontShinyFemale The shiny female depiction of this Pokémon from the front in battle.
 * @param backDefault The default depiction of this Pokémon from the back in battle.
 * @param backShiny The shiny depiction of this Pokémon from the back in battle.
 * @param backFemale The female depiction of this Pokémon from the back in battle.
 * @param backShinyFemale The shiny female depiction of this Pokémon from the back in battle.
 * @param other Additional sprites grouped by source, such as official artwork, HOME, and Showdown. Available keys vary by resource.
 * @param versions Sprites grouped by generation and game. Available keys vary by resource.
 */
data class PokemonSprites(

    @Schema(required = true, description = "The default depiction of this Pokémon from the front in battle.")
    @param:JsonProperty("front_default", required = true)
    @get:JsonProperty("front_default", required = true) val frontDefault: kotlin.String?,

    @Schema(required = true, description = "The shiny depiction of this Pokémon from the front in battle.")
    @param:JsonProperty("front_shiny", required = true)
    @get:JsonProperty("front_shiny", required = true) val frontShiny: kotlin.String?,

    @Schema(required = true, description = "The female depiction of this Pokémon from the front in battle.")
    @param:JsonProperty("front_female", required = true)
    @get:JsonProperty("front_female", required = true) val frontFemale: kotlin.String?,

    @Schema(required = true, description = "The shiny female depiction of this Pokémon from the front in battle.")
    @param:JsonProperty("front_shiny_female", required = true)
    @get:JsonProperty("front_shiny_female", required = true) val frontShinyFemale: kotlin.String?,

    @Schema(required = true, description = "The default depiction of this Pokémon from the back in battle.")
    @param:JsonProperty("back_default", required = true)
    @get:JsonProperty("back_default", required = true) val backDefault: kotlin.String?,

    @Schema(required = true, description = "The shiny depiction of this Pokémon from the back in battle.")
    @param:JsonProperty("back_shiny", required = true)
    @get:JsonProperty("back_shiny", required = true) val backShiny: kotlin.String?,

    @Schema(required = true, description = "The female depiction of this Pokémon from the back in battle.")
    @param:JsonProperty("back_female", required = true)
    @get:JsonProperty("back_female", required = true) val backFemale: kotlin.String?,

    @Schema(required = true, description = "The shiny female depiction of this Pokémon from the back in battle.")
    @param:JsonProperty("back_shiny_female", required = true)
    @get:JsonProperty("back_shiny_female", required = true) val backShinyFemale: kotlin.String?,

    @field:Valid
    @Schema(description = "Additional sprites grouped by source, such as official artwork, HOME, and Showdown. Available keys vary by resource.")
    @param:JsonProperty("other")
    @get:JsonProperty("other") val other: PokemonSpritesOther? = null,

    @Schema(description = "Sprites grouped by generation and game. Available keys vary by resource.")
    @param:JsonProperty("versions")
    @get:JsonProperty("versions") val versions: kotlin.collections.Map<kotlin.String, kotlin.collections.Map<kotlin.String, kotlin.Any?>>? = null
) {

}

