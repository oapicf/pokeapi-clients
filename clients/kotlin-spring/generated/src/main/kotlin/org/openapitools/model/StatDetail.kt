package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CharacteristicSummary
import org.openapitools.model.MoveDamageClassSummary
import org.openapitools.model.StatDetailAffectingMoves
import org.openapitools.model.StatDetailAffectingNatures
import org.openapitools.model.StatName
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
 * @param name 
 * @param gameIndex 
 * @param affectingMoves 
 * @param affectingNatures 
 * @param characteristics 
 * @param moveDamageClass 
 * @param names 
 * @param isBattleOnly 
 */
data class StatDetail(

    @Schema(example = "null", required = true, readOnly = true, description = "")
    @get:JsonProperty("id", required = true) val id: kotlin.Int,

    @get:Size(max=100)
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("game_index", required = true) val gameIndex: kotlin.Int,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("affecting_moves", required = true) val affectingMoves: StatDetailAffectingMoves,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("affecting_natures", required = true) val affectingNatures: StatDetailAffectingNatures,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("characteristics", required = true) val characteristics: kotlin.collections.List<CharacteristicSummary>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("move_damage_class", required = true) val moveDamageClass: MoveDamageClassSummary,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("names", required = true) val names: kotlin.collections.List<StatName>,

    @Schema(example = "null", description = "")
    @get:JsonProperty("is_battle_only") val isBattleOnly: kotlin.Boolean? = null
) {

}

