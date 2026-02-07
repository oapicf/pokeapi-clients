package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.LanguageName
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
 * @param id 
 * @param name 
 * @param iso639 
 * @param iso3166 
 * @param names 
 * @param official 
 */
data class LanguageDetail(

    @Schema(example = "null", required = true, readOnly = true, description = "")
    @get:JsonProperty("id", required = true) val id: kotlin.Int,

    @get:Size(max=100)
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @get:Size(max=10)
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("iso639", required = true) val iso639: kotlin.String,

    @get:Size(max=2)
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("iso3166", required = true) val iso3166: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("names", required = true) val names: kotlin.collections.List<LanguageName>,

    @Schema(example = "null", description = "")
    @get:JsonProperty("official") val official: kotlin.Boolean? = null
) {

}

