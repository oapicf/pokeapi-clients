package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.ItemSummary
import org.openapitools.model.MoveSummary
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
 * @param id 
 * @param item 
 * @param versionGroup 
 * @param move 
 */
data class MachineDetail(

    @Schema(required = true, readOnly = true, description = "")
    @param:JsonProperty("id")
    @get:JsonProperty("id", required = true) val id: kotlin.Int,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("item")
    @get:JsonProperty("item", required = true) val item: ItemSummary,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("version_group")
    @get:JsonProperty("version_group", required = true) val versionGroup: VersionGroupSummary,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("move")
    @get:JsonProperty("move", required = true) val move: MoveSummary
) {

}

