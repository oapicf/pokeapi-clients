package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.LanguageSummary
import org.openapitools.model.VersionGroupSummary
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
 * @param flavorText The localized flavor text for an api resource in a specific language.
 * @param language The language this name is in.
 * @param versionGroup The version group that uses this flavor text.
 */
data class MoveFlavorText(

    @Schema(required = true, description = "The localized flavor text for an api resource in a specific language.")
    @param:JsonProperty("flavor_text", required = true)
    @get:JsonProperty("flavor_text", required = true) val flavorText: kotlin.String,

    @field:Valid
    @Schema(required = true, description = "The language this name is in.")
    @param:JsonProperty("language", required = true)
    @get:JsonProperty("language", required = true) val language: LanguageSummary,

    @field:Valid
    @Schema(required = true, description = "The version group that uses this flavor text.")
    @param:JsonProperty("version_group", required = true)
    @get:JsonProperty("version_group", required = true) val versionGroup: VersionGroupSummary
) {

}

