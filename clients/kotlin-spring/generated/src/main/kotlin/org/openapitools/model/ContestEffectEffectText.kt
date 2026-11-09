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
 * @param effect The localized effect text for an API resource in a specific language.
 * @param language The language this effect is in.
 */
data class ContestEffectEffectText(

    @get:Size(max=6000)
    @Schema(required = true, description = "The localized effect text for an API resource in a specific language.")
    @param:JsonProperty("effect", required = true)
    @get:JsonProperty("effect", required = true) val effect: kotlin.String,

    @field:Valid
    @Schema(required = true, description = "The language this effect is in.")
    @param:JsonProperty("language", required = true)
    @get:JsonProperty("language", required = true) val language: LanguageSummary
) {

}

