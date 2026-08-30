package org.openapitools.server.api.model

import org.openapitools.server.api.model.AbilityDetailPokemonInnerPokemon
import org.openapitools.server.api.model.EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner(
    val gender: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender,
    val heldItem: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender,
    val item: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender,
    val knownMove: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender,
    val knownMoveType: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender,
    val location: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender,
    val minAffection: kotlin.Int,
    val minBeauty: kotlin.Int,
    val minHappiness: kotlin.Int,
    val minLevel: kotlin.Int,
    val needsOverworldRain: kotlin.Boolean,
    val partySpecies: kotlin.String,
    val partyType: kotlin.String,
    val relativePhysicalStats: kotlin.String,
    val timeOfDay: kotlin.String,
    val tradeSpecies: kotlin.String,
    val trigger: AbilityDetailPokemonInnerPokemon,
    val turnUpsideDown: kotlin.Boolean
)
