package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AbilityDetailPokemonInnerPokemon
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
 * @param levelLearnedAt 
 * @param moveLearnMethod 
 * @param versionGroup 
 */
data class PokemonDetailMovesInnerVersionGroupDetailsInner(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("level_learned_at", required = true) val levelLearnedAt: kotlin.Int,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("move_learn_method", required = true) val moveLearnMethod: AbilityDetailPokemonInnerPokemon,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("version_group", required = true) val versionGroup: AbilityDetailPokemonInnerPokemon
) {

}

