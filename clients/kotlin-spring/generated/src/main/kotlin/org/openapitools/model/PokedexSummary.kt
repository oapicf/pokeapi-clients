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
 * @param name The name of the referenced resource.
 * @param url The URL of the referenced resource.
 */
data class PokedexSummary(

    @get:Size(max=200)
    @Schema(required = true, description = "The name of the referenced resource.")
    @param:JsonProperty("name", required = true)
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "The URL of the referenced resource.")
    @param:JsonProperty("url", required = true)
    @get:JsonProperty("url", required = true) val url: java.net.URI
) {

}

