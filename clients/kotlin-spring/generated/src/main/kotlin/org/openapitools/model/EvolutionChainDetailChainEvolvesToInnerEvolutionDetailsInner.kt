package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AbilityDetailPokemonInnerPokemon
import org.openapitools.model.EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender
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
 * @param gender 
 * @param heldItem 
 * @param item 
 * @param knownMove 
 * @param knownMoveType 
 * @param location 
 * @param minAffection 
 * @param minBeauty 
 * @param minHappiness 
 * @param minLevel 
 * @param needsOverworldRain 
 * @param partySpecies 
 * @param partyType 
 * @param relativePhysicalStats 
 * @param timeOfDay 
 * @param tradeSpecies 
 * @param trigger 
 * @param turnUpsideDown 
 */
data class EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner(

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("gender")
    @get:JsonProperty("gender", required = true) val gender: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("held_item")
    @get:JsonProperty("held_item", required = true) val heldItem: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("item")
    @get:JsonProperty("item", required = true) val item: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("known_move")
    @get:JsonProperty("known_move", required = true) val knownMove: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("known_move_type")
    @get:JsonProperty("known_move_type", required = true) val knownMoveType: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("location")
    @get:JsonProperty("location", required = true) val location: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender,

    @Schema(required = true, description = "")
    @param:JsonProperty("min_affection")
    @get:JsonProperty("min_affection", required = true) val minAffection: kotlin.Int,

    @Schema(required = true, description = "")
    @param:JsonProperty("min_beauty")
    @get:JsonProperty("min_beauty", required = true) val minBeauty: kotlin.Int,

    @Schema(required = true, description = "")
    @param:JsonProperty("min_happiness")
    @get:JsonProperty("min_happiness", required = true) val minHappiness: kotlin.Int,

    @Schema(required = true, description = "")
    @param:JsonProperty("min_level")
    @get:JsonProperty("min_level", required = true) val minLevel: kotlin.Int,

    @Schema(required = true, description = "")
    @param:JsonProperty("needs_overworld_rain")
    @get:JsonProperty("needs_overworld_rain", required = true) val needsOverworldRain: kotlin.Boolean,

    @Schema(required = true, description = "")
    @param:JsonProperty("party_species")
    @get:JsonProperty("party_species", required = true) val partySpecies: kotlin.String,

    @Schema(required = true, description = "")
    @param:JsonProperty("party_type")
    @get:JsonProperty("party_type", required = true) val partyType: kotlin.String,

    @Schema(required = true, description = "")
    @param:JsonProperty("relative_physical_stats")
    @get:JsonProperty("relative_physical_stats", required = true) val relativePhysicalStats: kotlin.String,

    @Schema(required = true, description = "")
    @param:JsonProperty("time_of_day")
    @get:JsonProperty("time_of_day", required = true) val timeOfDay: kotlin.String,

    @Schema(required = true, description = "")
    @param:JsonProperty("trade_species")
    @get:JsonProperty("trade_species", required = true) val tradeSpecies: kotlin.String,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("trigger")
    @get:JsonProperty("trigger", required = true) val trigger: AbilityDetailPokemonInnerPokemon,

    @Schema(required = true, description = "")
    @param:JsonProperty("turn_upside_down")
    @get:JsonProperty("turn_upside_down", required = true) val turnUpsideDown: kotlin.Boolean
) {

}

