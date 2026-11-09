package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.MachineSummary
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
 * @param machine The machine that teaches a move from an item.
 * @param versionGroup The version group of this specific machine.
 */
data class ItemMachine(

    @field:Valid
    @Schema(required = true, description = "The machine that teaches a move from an item.")
    @param:JsonProperty("machine", required = true)
    @get:JsonProperty("machine", required = true) val machine: MachineSummary,

    @field:Valid
    @Schema(required = true, description = "The version group of this specific machine.")
    @param:JsonProperty("version_group", required = true)
    @get:JsonProperty("version_group", required = true) val versionGroup: VersionGroupSummary
) {

}

