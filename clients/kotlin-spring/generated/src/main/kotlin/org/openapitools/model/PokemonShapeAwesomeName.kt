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
 * @param awesomeName The localized \"scientific\" name for an API resource in a specific language.
 * @param language The language this \"scientific\" name is in.
 */
data class PokemonShapeAwesomeName(

    @get:Size(max=30)
    @Schema(required = true, description = "The localized \"scientific\" name for an API resource in a specific language.")
    @param:JsonProperty("awesome_name", required = true)
    @get:JsonProperty("awesome_name", required = true) val awesomeName: kotlin.String,

    @field:Valid
    @Schema(required = true, description = "The language this \"scientific\" name is in.")
    @param:JsonProperty("language", required = true)
    @get:JsonProperty("language", required = true) val language: LanguageSummary
) {

}

