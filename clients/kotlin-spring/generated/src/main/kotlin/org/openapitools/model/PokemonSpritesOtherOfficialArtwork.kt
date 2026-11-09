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
 * @param frontDefault The URL of the default front official artwork, or null if unavailable.
 * @param frontShiny The URL of the shiny front official artwork, or null if unavailable.
 * @param versions Additional official artwork grouped by version. Available keys vary by resource.
 */
data class PokemonSpritesOtherOfficialArtwork(

    @Schema(required = true, description = "The URL of the default front official artwork, or null if unavailable.")
    @param:JsonProperty("front_default", required = true)
    @get:JsonProperty("front_default", required = true) val frontDefault: kotlin.String?,

    @Schema(required = true, description = "The URL of the shiny front official artwork, or null if unavailable.")
    @param:JsonProperty("front_shiny", required = true)
    @get:JsonProperty("front_shiny", required = true) val frontShiny: kotlin.String?,

    @Schema(description = "Additional official artwork grouped by version. Available keys vary by resource.")
    @param:JsonProperty("versions")
    @get:JsonProperty("versions") val versions: kotlin.collections.Map<kotlin.String, kotlin.collections.Map<kotlin.String, kotlin.Any?>>? = null
) {

}

