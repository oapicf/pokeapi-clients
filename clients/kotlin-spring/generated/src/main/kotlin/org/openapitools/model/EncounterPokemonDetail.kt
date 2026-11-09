package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * @param minPerfectIvs The minimum number of perfect IVs, or null if unspecified.
 * @param alwaysShiny Whether the encountered Pokémon is always shiny.
 * @param neverShiny Whether the encountered Pokémon can never be shiny.
 * @param isAlpha Whether the encountered Pokémon is an alpha Pokémon.
 */
data class EncounterPokemonDetail(

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(description = "The minimum number of perfect IVs, or null if unspecified.")
    @param:JsonProperty("min_perfect_ivs")
    @get:JsonProperty("min_perfect_ivs") val minPerfectIvs: kotlin.Int? = null,

    @Schema(description = "Whether the encountered Pokémon is always shiny.")
    @param:JsonProperty("always_shiny")
    @get:JsonProperty("always_shiny") val alwaysShiny: kotlin.Boolean? = null,

    @Schema(description = "Whether the encountered Pokémon can never be shiny.")
    @param:JsonProperty("never_shiny")
    @get:JsonProperty("never_shiny") val neverShiny: kotlin.Boolean? = null,

    @Schema(description = "Whether the encountered Pokémon is an alpha Pokémon.")
    @param:JsonProperty("is_alpha")
    @get:JsonProperty("is_alpha") val isAlpha: kotlin.Boolean? = null
) {

}

