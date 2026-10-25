package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.VersionSummary
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
 * @param gameIndex 
 * @param version 
 */
data class PokemonGameIndex(

    @Schema(required = true, description = "")
    @param:JsonProperty("game_index", required = true)
    @get:JsonProperty("game_index", required = true) val gameIndex: kotlin.Int,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("version", required = true)
    @get:JsonProperty("version", required = true) val version: VersionSummary
) {

}

