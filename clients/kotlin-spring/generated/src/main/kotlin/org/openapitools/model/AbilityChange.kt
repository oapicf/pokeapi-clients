package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AbilityChangeEffectText
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
 * @param versionGroup The version group in which the previous effect of this ability originated.
 * @param effectEntries The previous effect of this ability listed in different languages.
 */
data class AbilityChange(

    @field:Valid
    @Schema(required = true, description = "The version group in which the previous effect of this ability originated.")
    @param:JsonProperty("version_group", required = true)
    @get:JsonProperty("version_group", required = true) val versionGroup: VersionGroupSummary,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "The previous effect of this ability listed in different languages.")
    @param:JsonProperty("effect_entries", required = true)
    @get:JsonProperty("effect_entries", required = true) val effectEntries: kotlin.collections.List<AbilityChangeEffectText>
) {

}

