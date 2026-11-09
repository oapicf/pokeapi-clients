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
 * @param id The identifier for this resource.
 * @param item The TM or HM item that corresponds to this machine.
 * @param versionGroup The version group that this machine applies to.
 * @param move The move that is taught by this machine.
 */
data class MachineDetail(

    @Schema(required = true, readOnly = true, description = "The identifier for this resource.")
    @param:JsonProperty("id", required = true)
    @get:JsonProperty("id", required = true) val id: kotlin.Int,

    @field:Valid
    @Schema(required = true, description = "The TM or HM item that corresponds to this machine.")
    @param:JsonProperty("item", required = true)
    @get:JsonProperty("item", required = true) val item: ItemSummary,

    @field:Valid
    @Schema(required = true, description = "The version group that this machine applies to.")
    @param:JsonProperty("version_group", required = true)
    @get:JsonProperty("version_group", required = true) val versionGroup: VersionGroupSummary,

    @field:Valid
    @Schema(required = true, description = "The move that is taught by this machine.")
    @param:JsonProperty("move", required = true)
    @get:JsonProperty("move", required = true) val move: MoveSummary
) {

}

