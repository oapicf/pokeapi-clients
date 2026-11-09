package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.MoveLearnMethodSummary
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
 * @param levelLearnedAt The minimum level to learn the move.
 * @param moveLearnMethod The method by which the move is learned.
 * @param versionGroup The version group in which the move is learned.
 * @param order Order by which the pokemon will learn the move. A newly learnt move will replace the move with lowest order.
 */
data class PokemonMoveVersionGroup(

    @Schema(required = true, description = "The minimum level to learn the move.")
    @param:JsonProperty("level_learned_at", required = true)
    @get:JsonProperty("level_learned_at", required = true) val levelLearnedAt: kotlin.Int,

    @field:Valid
    @Schema(required = true, description = "The method by which the move is learned.")
    @param:JsonProperty("move_learn_method", required = true)
    @get:JsonProperty("move_learn_method", required = true) val moveLearnMethod: MoveLearnMethodSummary,

    @field:Valid
    @Schema(required = true, description = "The version group in which the move is learned.")
    @param:JsonProperty("version_group", required = true)
    @get:JsonProperty("version_group", required = true) val versionGroup: VersionGroupSummary,

    @Schema(description = "Order by which the pokemon will learn the move. A newly learnt move will replace the move with lowest order.")
    @param:JsonProperty("order")
    @get:JsonProperty("order") val order: kotlin.Int? = null
) {

}

