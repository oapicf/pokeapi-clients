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
 * @param flavorText 
 * @param language 
 * @param versionGroup 
 */
data class AbilityFlavorText(

    @Schema(required = true, description = "")
    @param:JsonProperty("flavor_text", required = true)
    @get:JsonProperty("flavor_text", required = true) val flavorText: kotlin.String,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("language", required = true)
    @get:JsonProperty("language", required = true) val language: LanguageSummary,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("version_group", required = true)
    @get:JsonProperty("version_group", required = true) val versionGroup: VersionGroupSummary
) {

}

