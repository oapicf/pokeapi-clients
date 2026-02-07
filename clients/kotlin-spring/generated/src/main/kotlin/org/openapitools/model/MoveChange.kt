package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.MoveChangeEffectEntriesInner
import org.openapitools.model.TypeSummary
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
 * @param effectChance 
 * @param effectEntries 
 * @param type 
 * @param versionGroup 
 * @param accuracy 
 * @param power 
 * @param pp 
 */
data class MoveChange(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("effect_chance", required = true) val effectChance: kotlin.Int,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("effect_entries", required = true) val effectEntries: kotlin.collections.List<MoveChangeEffectEntriesInner>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("type", required = true) val type: TypeSummary,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("version_group", required = true) val versionGroup: VersionGroupSummary,

    @Schema(example = "null", description = "")
    @get:JsonProperty("accuracy") val accuracy: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("power") val power: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("pp") val pp: kotlin.Int? = null
) {

}

