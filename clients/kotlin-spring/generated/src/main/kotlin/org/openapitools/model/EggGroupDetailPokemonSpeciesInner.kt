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
 * @param name Pokemon species name.
 * @param url The URL to get more information about the species
 */
data class EggGroupDetailPokemonSpeciesInner(

    @Schema(example = "null", description = "Pokemon species name.")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "The URL to get more information about the species")
    @get:JsonProperty("url") val url: java.net.URI? = null
) {

}

