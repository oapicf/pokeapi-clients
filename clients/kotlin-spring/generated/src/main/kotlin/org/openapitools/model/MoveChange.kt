package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.MoveEffectEffectText
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
 * @param effectChance The percent value of how likely it is this moves effect will take effect.
 * @param effectEntries The effect of this move listed in different languages.
 * @param type The elemental type of this move.
 * @param versionGroup The version group in which these move stat values were in effect.
 * @param accuracy The percent value of how likely this move is to be successful.
 * @param power The base power before the listed version group, or null if power did not change.
 * @param pp Power points. The number of times this move can be used.
 */
data class MoveChange(

    @Schema(required = true, description = "The percent value of how likely it is this moves effect will take effect.")
    @param:JsonProperty("effect_chance", required = true)
    @get:JsonProperty("effect_chance", required = true) val effectChance: kotlin.Int?,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "The effect of this move listed in different languages.")
    @param:JsonProperty("effect_entries", required = true)
    @get:JsonProperty("effect_entries", required = true) val effectEntries: kotlin.collections.List<MoveEffectEffectText>,

    @field:Valid
    @Schema(required = true, description = "The elemental type of this move.")
    @param:JsonProperty("type", required = true)
    @get:JsonProperty("type", required = true) val type: TypeSummary?,

    @field:Valid
    @Schema(required = true, description = "The version group in which these move stat values were in effect.")
    @param:JsonProperty("version_group", required = true)
    @get:JsonProperty("version_group", required = true) val versionGroup: VersionGroupSummary,

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(description = "The percent value of how likely this move is to be successful.")
    @param:JsonProperty("accuracy")
    @get:JsonProperty("accuracy") val accuracy: kotlin.Int? = null,

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(description = "The base power before the listed version group, or null if power did not change.")
    @param:JsonProperty("power")
    @get:JsonProperty("power") val power: kotlin.Int? = null,

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(description = "Power points. The number of times this move can be used.")
    @param:JsonProperty("pp")
    @get:JsonProperty("pp") val pp: kotlin.Int? = null
) {

}

