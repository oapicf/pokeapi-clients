package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.MoveBattleStyleSummary
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
 * @param lowHpPreference 
 * @param highHpPreference 
 * @param moveBattleStyle 
 */
data class NatureBattleStylePreference(

    @Schema(required = true, description = "")
    @param:JsonProperty("low_hp_preference")
    @get:JsonProperty("low_hp_preference", required = true) val lowHpPreference: kotlin.Int,

    @Schema(required = true, description = "")
    @param:JsonProperty("high_hp_preference")
    @get:JsonProperty("high_hp_preference", required = true) val highHpPreference: kotlin.Int,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("move_battle_style")
    @get:JsonProperty("move_battle_style", required = true) val moveBattleStyle: MoveBattleStyleSummary
) {

}

