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
 * @param effect 
 * @param shortEffect 
 * @param language 
 */
data class ItemEffectText(

    @get:Size(max=6000)
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("effect", required = true) val effect: kotlin.String,

    @get:Size(max=300)
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("short_effect", required = true) val shortEffect: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("language", required = true) val language: LanguageSummary
) {

}

