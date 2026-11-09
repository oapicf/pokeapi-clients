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
 * @param id The identifier for this resource.
 * @param name The name for this resource.
 * @param iso639 The two-letter ISO 639-1 language code. Multiple PokéAPI language records may share this code.
 * @param iso3166 The two-letter ISO 3166-1 alpha-2 code of the country or region associated with this language record. Multiple PokéAPI language records may share this code.
 * @param names The name of this resource listed in different languages.
 * @param official Whether or not the games are published in this language.
 */
data class LanguageDetail(

    @Schema(required = true, readOnly = true, description = "The identifier for this resource.")
    @param:JsonProperty("id", required = true)
    @get:JsonProperty("id", required = true) val id: kotlin.Int,

    @get:Size(max=200)
    @Schema(required = true, description = "The name for this resource.")
    @param:JsonProperty("name", required = true)
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @get:Size(max=10)
    @Schema(required = true, description = "The two-letter ISO 639-1 language code. Multiple PokéAPI language records may share this code.")
    @param:JsonProperty("iso639", required = true)
    @get:JsonProperty("iso639", required = true) val iso639: kotlin.String,

    @get:Size(max=2)
    @Schema(required = true, description = "The two-letter ISO 3166-1 alpha-2 code of the country or region associated with this language record. Multiple PokéAPI language records may share this code.")
    @param:JsonProperty("iso3166", required = true)
    @get:JsonProperty("iso3166", required = true) val iso3166: kotlin.String,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "The name of this resource listed in different languages.")
    @param:JsonProperty("names", required = true)
    @get:JsonProperty("names", required = true) val names: kotlin.collections.List<LanguageName>,

    @Schema(description = "Whether or not the games are published in this language.")
    @param:JsonProperty("official")
    @get:JsonProperty("official") val official: kotlin.Boolean? = null
) {

}

