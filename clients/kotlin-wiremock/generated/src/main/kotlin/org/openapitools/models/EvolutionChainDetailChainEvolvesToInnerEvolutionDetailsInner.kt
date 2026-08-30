@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner(
    @field:JsonProperty("gender")
    val gender: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender,

    @field:JsonProperty("held_item")
    val heldItem: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender,

    @field:JsonProperty("item")
    val item: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender,

    @field:JsonProperty("known_move")
    val knownMove: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender,

    @field:JsonProperty("known_move_type")
    val knownMoveType: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender,

    @field:JsonProperty("location")
    val location: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender,

    @field:JsonProperty("min_affection")
    val minAffection: kotlin.Int,

    @field:JsonProperty("min_beauty")
    val minBeauty: kotlin.Int,

    @field:JsonProperty("min_happiness")
    val minHappiness: kotlin.Int,

    @field:JsonProperty("min_level")
    val minLevel: kotlin.Int,

    @field:JsonProperty("needs_overworld_rain")
    val needsOverworldRain: kotlin.Boolean,

    @field:JsonProperty("party_species")
    val partySpecies: kotlin.String,

    @field:JsonProperty("party_type")
    val partyType: kotlin.String,

    @field:JsonProperty("relative_physical_stats")
    val relativePhysicalStats: kotlin.String,

    @field:JsonProperty("time_of_day")
    val timeOfDay: kotlin.String,

    @field:JsonProperty("trade_species")
    val tradeSpecies: kotlin.String,

    @field:JsonProperty("trigger")
    val trigger: AbilityDetailPokemonInnerPokemon,

    @field:JsonProperty("turn_upside_down")
    val turnUpsideDown: kotlin.Boolean,

)
