package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.MoveSummary
import org.openapitools.model.PokemonMoveVersionGroup
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
 * @param move The move the Pokémon can learn.
 * @param versionGroupDetails The details of the version in which the Pokémon can learn the move.
 */
data class PokemonMove(

    @field:Valid
    @Schema(required = true, description = "The move the Pokémon can learn.")
    @param:JsonProperty("move", required = true)
    @get:JsonProperty("move", required = true) val move: MoveSummary,

    @field:Valid
    @Schema(required = true, description = "The details of the version in which the Pokémon can learn the move.")
    @param:JsonProperty("version_group_details", required = true)
    @get:JsonProperty("version_group_details", required = true) val versionGroupDetails: kotlin.collections.List<PokemonMoveVersionGroup>
) {

}

