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
 * @param name The name of the berry
 * @param url The URL to get more information about the berry
 */
data class BerryFlavorDetailBerriesInnerBerry(

    @Schema(example = "null", description = "The name of the berry")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "The URL to get more information about the berry")
    @get:JsonProperty("url") val url: java.net.URI? = null
) {

}

