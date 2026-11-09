package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AbilitySummary
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
 * @param slot The slot this ability occupies in this Pokémon species.
 * @param ability The ability the Pokémon may have.
 * @param isHidden Whether or not this is a hidden ability.
 */
data class PokemonAbility(

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(required = true, description = "The slot this ability occupies in this Pokémon species.")
    @param:JsonProperty("slot", required = true)
    @get:JsonProperty("slot", required = true) val slot: kotlin.Int,

    @field:Valid
    @Schema(required = true, description = "The ability the Pokémon may have.")
    @param:JsonProperty("ability", required = true)
    @get:JsonProperty("ability", required = true) val ability: AbilitySummary,

    @Schema(description = "Whether or not this is a hidden ability.")
    @param:JsonProperty("is_hidden")
    @get:JsonProperty("is_hidden") val isHidden: kotlin.Boolean? = null
) {

}

