package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.StatSummary
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
 * @param baseStat The base value of the stat.
 * @param effort The effort points (EV) the Pokémon has in the stat.
 * @param stat The stat the Pokémon has.
 */
data class PokemonStat(

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(required = true, description = "The base value of the stat.")
    @param:JsonProperty("base_stat", required = true)
    @get:JsonProperty("base_stat", required = true) val baseStat: kotlin.Int,

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(required = true, description = "The effort points (EV) the Pokémon has in the stat.")
    @param:JsonProperty("effort", required = true)
    @get:JsonProperty("effort", required = true) val effort: kotlin.Int,

    @field:Valid
    @Schema(required = true, description = "The stat the Pokémon has.")
    @param:JsonProperty("stat", required = true)
    @get:JsonProperty("stat", required = true) val stat: StatSummary
) {

}

