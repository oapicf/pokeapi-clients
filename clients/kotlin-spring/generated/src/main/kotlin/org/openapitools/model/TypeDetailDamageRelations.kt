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
 * @param noDamageTo 
 * @param halfDamageTo 
 * @param doubleDamageTo 
 * @param noDamageFrom 
 * @param halfDamageFrom 
 * @param doubleDamageFrom 
 */
data class TypeDetailDamageRelations(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("no_damage_to", required = true) val noDamageTo: kotlin.collections.List<AbilityDetailPokemonInnerPokemon>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("half_damage_to", required = true) val halfDamageTo: kotlin.collections.List<AbilityDetailPokemonInnerPokemon>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("double_damage_to", required = true) val doubleDamageTo: kotlin.collections.List<AbilityDetailPokemonInnerPokemon>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("no_damage_from", required = true) val noDamageFrom: kotlin.collections.List<AbilityDetailPokemonInnerPokemon>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("half_damage_from", required = true) val halfDamageFrom: kotlin.collections.List<AbilityDetailPokemonInnerPokemon>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("double_damage_from", required = true) val doubleDamageFrom: kotlin.collections.List<AbilityDetailPokemonInnerPokemon>
) {

}

