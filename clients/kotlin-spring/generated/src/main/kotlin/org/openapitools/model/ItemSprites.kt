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
 * @param default The default depiction of this item.
 */
data class ItemSprites(

    @Schema(required = true, description = "The default depiction of this item.")
    @param:JsonProperty("default", required = true)
    @get:JsonProperty("default", required = true) val default: kotlin.String?
) {

}

