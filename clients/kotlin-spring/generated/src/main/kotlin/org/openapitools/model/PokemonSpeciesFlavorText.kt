package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.LanguageSummary
import org.openapitools.model.VersionSummary
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
 * @param flavorText The localized flavor text for an API resource in a specific language. Note that this text is left unprocessed as it is found in game files. This means that it contains special characters that one might want to replace with their visible decodable version. Please check out this <a href='https://github.com/veekun/pokedex/issues/218#issuecomment-339841781' >issue</a> to find out more. 
 * @param language The language this name is in.
 * @param version The game version this flavor text is extracted from.
 */
data class PokemonSpeciesFlavorText(

    @Schema(required = true, description = "The localized flavor text for an API resource in a specific language. Note that this text is left unprocessed as it is found in game files. This means that it contains special characters that one might want to replace with their visible decodable version. Please check out this <a href='https://github.com/veekun/pokedex/issues/218#issuecomment-339841781' >issue</a> to find out more. ")
    @param:JsonProperty("flavor_text", required = true)
    @get:JsonProperty("flavor_text", required = true) val flavorText: kotlin.String,

    @field:Valid
    @Schema(required = true, description = "The language this name is in.")
    @param:JsonProperty("language", required = true)
    @get:JsonProperty("language", required = true) val language: LanguageSummary,

    @field:Valid
    @Schema(required = true, description = "The game version this flavor text is extracted from.")
    @param:JsonProperty("version", required = true)
    @get:JsonProperty("version", required = true) val version: VersionSummary
) {

}

