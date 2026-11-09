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
 * @param language The language this name is in.
 * @param description The localized description for an API resource in a specific language.
 */
data class PokedexDescription(

    @field:Valid
    @Schema(required = true, description = "The language this name is in.")
    @param:JsonProperty("language", required = true)
    @get:JsonProperty("language", required = true) val language: LanguageSummary,

    @get:Size(max=2000)
    @Schema(description = "The localized description for an API resource in a specific language.")
    @param:JsonProperty("description")
    @get:JsonProperty("description") val description: kotlin.String? = null
) {

}

