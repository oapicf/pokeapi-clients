package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.LanguageSummary
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
 * @param name The name for this contest.
 * @param color The color associated with this contest's name.
 * @param language The language that this name is in.
 */
data class ContestTypeName(

    @get:Size(max=200)
    @Schema(required = true, description = "The name for this contest.")
    @param:JsonProperty("name", required = true)
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @get:Size(max=10)
    @Schema(required = true, description = "The color associated with this contest's name.")
    @param:JsonProperty("color", required = true)
    @get:JsonProperty("color", required = true) val color: kotlin.String,

    @field:Valid
    @Schema(required = true, description = "The language that this name is in.")
    @param:JsonProperty("language", required = true)
    @get:JsonProperty("language", required = true) val language: LanguageSummary
) {

}

