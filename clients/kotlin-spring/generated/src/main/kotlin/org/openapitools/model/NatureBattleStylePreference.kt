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
 * @param lowHpPreference Chance of using the move, in percent, if HP is under one half.
 * @param highHpPreference Chance of using the move, in percent, if HP is over one half.
 * @param moveBattleStyle The move battle style.
 */
data class NatureBattleStylePreference(

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(required = true, description = "Chance of using the move, in percent, if HP is under one half.")
    @param:JsonProperty("low_hp_preference", required = true)
    @get:JsonProperty("low_hp_preference", required = true) val lowHpPreference: kotlin.Int,

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(required = true, description = "Chance of using the move, in percent, if HP is over one half.")
    @param:JsonProperty("high_hp_preference", required = true)
    @get:JsonProperty("high_hp_preference", required = true) val highHpPreference: kotlin.Int,

    @field:Valid
    @Schema(required = true, description = "The move battle style.")
    @param:JsonProperty("move_battle_style", required = true)
    @get:JsonProperty("move_battle_style", required = true) val moveBattleStyle: MoveBattleStyleSummary
) {

}

