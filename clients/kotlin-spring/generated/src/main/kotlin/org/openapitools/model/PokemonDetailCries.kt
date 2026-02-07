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
 * @param latest 
 * @param legacy 
 */
data class PokemonDetailCries(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("latest", required = true) val latest: java.net.URI,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("legacy", required = true) val legacy: java.net.URI
) {

}

