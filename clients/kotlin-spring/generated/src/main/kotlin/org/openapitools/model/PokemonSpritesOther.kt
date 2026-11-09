package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.PokemonSpritesOtherDreamWorld
import org.openapitools.model.PokemonSpritesOtherHome
import org.openapitools.model.PokemonSpritesOtherOfficialArtwork
import org.openapitools.model.PokemonSpritesOtherShowdown
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
 * @param dreamWorld Pokémon Dream World artwork URLs.
 * @param home Pokémon HOME sprite URLs.
 * @param showdown Pokémon Showdown sprite URLs.
 * @param officialArtwork Official Pokémon artwork URLs, including shiny artwork and version-specific variants.
 */
data class PokemonSpritesOther(

    @field:Valid
    @Schema(description = "Pokémon Dream World artwork URLs.")
    @param:JsonProperty("dream_world")
    @get:JsonProperty("dream_world") val dreamWorld: PokemonSpritesOtherDreamWorld? = null,

    @field:Valid
    @Schema(description = "Pokémon HOME sprite URLs.")
    @param:JsonProperty("home")
    @get:JsonProperty("home") val home: PokemonSpritesOtherHome? = null,

    @field:Valid
    @Schema(description = "Pokémon Showdown sprite URLs.")
    @param:JsonProperty("showdown")
    @get:JsonProperty("showdown") val showdown: PokemonSpritesOtherShowdown? = null,

    @field:Valid
    @Schema(description = "Official Pokémon artwork URLs, including shiny artwork and version-specific variants.")
    @param:JsonProperty("official-artwork")
    @get:JsonProperty("official-artwork") val officialArtwork: PokemonSpritesOtherOfficialArtwork? = null
) {

}

