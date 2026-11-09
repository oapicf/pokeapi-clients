@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PokemonEvolution(
    @field:JsonProperty("version_group")
    val versionGroup: VersionGroupSummary,

    @field:JsonProperty("item")
    val item: ItemSummary,

    @field:JsonProperty("trigger")
    val trigger: EvolutionTriggerSummary,

    @field:JsonProperty("held_item")
    val heldItem: ItemSummary,

    @field:JsonProperty("known_move")
    val knownMove: PokemonEvolutionKnownMove,

    @field:JsonProperty("known_move_type")
    val knownMoveType: PokemonEvolutionKnownMove,

    @field:JsonProperty("location")
    val location: LocationSummary,

    @field:JsonProperty("party_species")
    val partySpecies: PokemonSpeciesSummary,

    @field:JsonProperty("party_type")
    val partyType: TypeSummary,

    @field:JsonProperty("trade_species")
    val tradeSpecies: PokemonSpeciesSummary,

    @field:JsonProperty("region")
    val region: RegionSummary,

    @field:JsonProperty("required_pokemon_form")
    val requiredPokemonForm: PokemonFormSummary,

    @field:JsonProperty("evolved_pokemon_form")
    val evolvedPokemonForm: PokemonFormSummary,

    @field:JsonProperty("used_move")
    val usedMove: MoveSummary,

    @field:JsonProperty("allowed_natures")
    val allowedNatures: kotlin.collections.List<NatureSummary>,

    @field:JsonProperty("condition_expression")
    val conditionExpression: EvolutionConditionExpression,

    @field:JsonProperty("is_default")
    val isDefault: kotlin.Boolean? = null,

    @field:JsonProperty("gender")
    val gender: kotlin.Int? = null,

    @field:JsonProperty("min_level")
    val minLevel: kotlin.Int? = null,

    @field:JsonProperty("min_happiness")
    val minHappiness: kotlin.Int? = null,

    @field:JsonProperty("min_beauty")
    val minBeauty: kotlin.Int? = null,

    @field:JsonProperty("min_affection")
    val minAffection: kotlin.Int? = null,

    @field:JsonProperty("near_special_rock")
    val nearSpecialRock: kotlin.Boolean? = null,

    @field:JsonProperty("needs_multiplayer")
    val needsMultiplayer: kotlin.Boolean? = null,

    @field:JsonProperty("needs_overworld_rain")
    val needsOverworldRain: kotlin.Boolean? = null,

    @field:JsonProperty("relative_physical_stats")
    val relativePhysicalStats: kotlin.Int? = null,

    @field:JsonProperty("time_of_day")
    val timeOfDay: kotlin.String? = null,

    @field:JsonProperty("turn_upside_down")
    val turnUpsideDown: kotlin.Boolean? = null,

    @field:JsonProperty("min_move_count")
    val minMoveCount: kotlin.Int? = null,

    @field:JsonProperty("min_steps")
    val minSteps: kotlin.Int? = null,

    @field:JsonProperty("min_damage_taken")
    val minDamageTaken: kotlin.Int? = null,

)
