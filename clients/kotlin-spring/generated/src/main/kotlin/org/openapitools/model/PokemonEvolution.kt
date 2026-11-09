package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.EvolutionConditionExpression
import org.openapitools.model.EvolutionTriggerSummary
import org.openapitools.model.ItemSummary
import org.openapitools.model.LocationSummary
import org.openapitools.model.MoveSummary
import org.openapitools.model.NatureSummary
import org.openapitools.model.PokemonEvolutionKnownMove
import org.openapitools.model.PokemonFormSummary
import org.openapitools.model.PokemonSpeciesSummary
import org.openapitools.model.RegionSummary
import org.openapitools.model.TypeSummary
import org.openapitools.model.VersionGroupSummary
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
 * @param versionGroup The version group in which these evolution requirements apply.
 * @param item The item required to cause evolution this into Pokémon species.
 * @param trigger The type of event that triggers evolution into this Pokémon species.
 * @param heldItem The item the evolving Pokémon species must be holding during the evolution trigger event to evolve into this Pokémon species.
 * @param knownMove 
 * @param knownMoveType 
 * @param location The location the evolution must be triggered at.
 * @param partySpecies The Pokémon species that must be in the players party in order for the evolving Pokémon species to evolve into this Pokémon species.
 * @param partyType The player must have a Pokémon of this type in their party during the evolution trigger event in order for the evolving Pokémon species to evolve into this Pokémon species.
 * @param tradeSpecies Pokémon species for which this one must be traded.
 * @param region The required region in which this evolution can occur.
 * @param requiredPokemonForm The Pokémon form required before evolving, or null if unrestricted.
 * @param evolvedPokemonForm The Pokémon form produced by this evolution, or null if unspecified.
 * @param usedMove The move that must be used by the evolving Pokémon species during the evolution trigger event in order to evolve into this Pokémon species.
 * @param allowedNatures The natures that allow this evolution, or null if unrestricted.
 * @param conditionExpression An additional evolution condition expressed in reverse Polish notation, or null if none.
 * @param isDefault Whether the evolution is considered as the expected evolution in a main series game. Each unique Pokémon variety of a line capable of evolution should have exactly one 'default' evolution. For example, the Meowth species has three default evolutions as there are three distinct varieties it can evolve into: Persian, Alolan Persian, and Perrserker.
 * @param gender The id of the gender of the evolving Pokémon species must be in order to evolve into this Pokémon species.
 * @param minLevel The minimum required level of the evolving Pokémon species to evolve into this Pokémon species.
 * @param minHappiness The minimum required level of happiness the evolving Pokémon species to evolve into this Pokémon species.
 * @param minBeauty The minimum required level of beauty the evolving Pokémon species to evolve into this Pokémon species.
 * @param minAffection The minimum required level of affection the evolving Pokémon species to evolve into this Pokémon species.
 * @param nearSpecialRock Whether or not you need to be near a Moss Rock or Icy Rock to evolve into this Pokémon species.
 * @param needsMultiplayer Whether or not multiplayer link play is needed to evolve into this Pokémon species (e.g. Union Circle).
 * @param needsOverworldRain Whether or not it must be raining in the overworld to cause evolution this Pokémon species.
 * @param relativePhysicalStats The required relation between the Pokémon's Attack and Defense stats. 1 means Attack > Defense. 0 means Attack = Defense. -1 means Attack < Defense.
 * @param timeOfDay The required time of day. Day or night.
 * @param turnUpsideDown Whether or not the 3DS needs to be turned upside-down as this Pokémon levels up.
 * @param minMoveCount The minimum number of times a move must be used in order to evolve into this Pokémon species.
 * @param minSteps The minimum number of steps that must be taken in order to evolve into this Pokémon species.
 * @param minDamageTaken The minimum amount of damage taken during the evolution trigger event in order to evolve into this Pokémon species.
 */
data class PokemonEvolution(

    @field:Valid
    @Schema(required = true, description = "The version group in which these evolution requirements apply.")
    @param:JsonProperty("version_group", required = true)
    @get:JsonProperty("version_group", required = true) val versionGroup: VersionGroupSummary,

    @field:Valid
    @Schema(required = true, description = "The item required to cause evolution this into Pokémon species.")
    @param:JsonProperty("item", required = true)
    @get:JsonProperty("item", required = true) val item: ItemSummary?,

    @field:Valid
    @Schema(required = true, description = "The type of event that triggers evolution into this Pokémon species.")
    @param:JsonProperty("trigger", required = true)
    @get:JsonProperty("trigger", required = true) val trigger: EvolutionTriggerSummary,

    @field:Valid
    @Schema(required = true, description = "The item the evolving Pokémon species must be holding during the evolution trigger event to evolve into this Pokémon species.")
    @param:JsonProperty("held_item", required = true)
    @get:JsonProperty("held_item", required = true) val heldItem: ItemSummary?,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("known_move", required = true)
    @get:JsonProperty("known_move", required = true) val knownMove: PokemonEvolutionKnownMove,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("known_move_type", required = true)
    @get:JsonProperty("known_move_type", required = true) val knownMoveType: PokemonEvolutionKnownMove,

    @field:Valid
    @Schema(required = true, description = "The location the evolution must be triggered at.")
    @param:JsonProperty("location", required = true)
    @get:JsonProperty("location", required = true) val location: LocationSummary?,

    @field:Valid
    @Schema(required = true, description = "The Pokémon species that must be in the players party in order for the evolving Pokémon species to evolve into this Pokémon species.")
    @param:JsonProperty("party_species", required = true)
    @get:JsonProperty("party_species", required = true) val partySpecies: PokemonSpeciesSummary?,

    @field:Valid
    @Schema(required = true, description = "The player must have a Pokémon of this type in their party during the evolution trigger event in order for the evolving Pokémon species to evolve into this Pokémon species.")
    @param:JsonProperty("party_type", required = true)
    @get:JsonProperty("party_type", required = true) val partyType: TypeSummary?,

    @field:Valid
    @Schema(required = true, description = "Pokémon species for which this one must be traded.")
    @param:JsonProperty("trade_species", required = true)
    @get:JsonProperty("trade_species", required = true) val tradeSpecies: PokemonSpeciesSummary?,

    @field:Valid
    @Schema(required = true, description = "The required region in which this evolution can occur.")
    @param:JsonProperty("region", required = true)
    @get:JsonProperty("region", required = true) val region: RegionSummary?,

    @field:Valid
    @Schema(required = true, description = "The Pokémon form required before evolving, or null if unrestricted.")
    @param:JsonProperty("required_pokemon_form", required = true)
    @get:JsonProperty("required_pokemon_form", required = true) val requiredPokemonForm: PokemonFormSummary?,

    @field:Valid
    @Schema(required = true, description = "The Pokémon form produced by this evolution, or null if unspecified.")
    @param:JsonProperty("evolved_pokemon_form", required = true)
    @get:JsonProperty("evolved_pokemon_form", required = true) val evolvedPokemonForm: PokemonFormSummary?,

    @field:Valid
    @Schema(required = true, description = "The move that must be used by the evolving Pokémon species during the evolution trigger event in order to evolve into this Pokémon species.")
    @param:JsonProperty("used_move", required = true)
    @get:JsonProperty("used_move", required = true) val usedMove: MoveSummary?,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "The natures that allow this evolution, or null if unrestricted.")
    @param:JsonProperty("allowed_natures", required = true)
    @get:JsonProperty("allowed_natures", required = true) val allowedNatures: kotlin.collections.List<NatureSummary>?,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "An additional evolution condition expressed in reverse Polish notation, or null if none.")
    @param:JsonProperty("condition_expression", required = true)
    @get:JsonProperty("condition_expression", required = true) val conditionExpression: EvolutionConditionExpression?,

    @Schema(description = "Whether the evolution is considered as the expected evolution in a main series game. Each unique Pokémon variety of a line capable of evolution should have exactly one 'default' evolution. For example, the Meowth species has three default evolutions as there are three distinct varieties it can evolve into: Persian, Alolan Persian, and Perrserker.")
    @param:JsonProperty("is_default")
    @get:JsonProperty("is_default") val isDefault: kotlin.Boolean? = null,

    @Schema(description = "The id of the gender of the evolving Pokémon species must be in order to evolve into this Pokémon species.")
    @param:JsonProperty("gender")
    @get:JsonProperty("gender") val gender: kotlin.Int? = null,

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(description = "The minimum required level of the evolving Pokémon species to evolve into this Pokémon species.")
    @param:JsonProperty("min_level")
    @get:JsonProperty("min_level") val minLevel: kotlin.Int? = null,

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(description = "The minimum required level of happiness the evolving Pokémon species to evolve into this Pokémon species.")
    @param:JsonProperty("min_happiness")
    @get:JsonProperty("min_happiness") val minHappiness: kotlin.Int? = null,

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(description = "The minimum required level of beauty the evolving Pokémon species to evolve into this Pokémon species.")
    @param:JsonProperty("min_beauty")
    @get:JsonProperty("min_beauty") val minBeauty: kotlin.Int? = null,

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(description = "The minimum required level of affection the evolving Pokémon species to evolve into this Pokémon species.")
    @param:JsonProperty("min_affection")
    @get:JsonProperty("min_affection") val minAffection: kotlin.Int? = null,

    @Schema(description = "Whether or not you need to be near a Moss Rock or Icy Rock to evolve into this Pokémon species.")
    @param:JsonProperty("near_special_rock")
    @get:JsonProperty("near_special_rock") val nearSpecialRock: kotlin.Boolean? = null,

    @Schema(description = "Whether or not multiplayer link play is needed to evolve into this Pokémon species (e.g. Union Circle).")
    @param:JsonProperty("needs_multiplayer")
    @get:JsonProperty("needs_multiplayer") val needsMultiplayer: kotlin.Boolean? = null,

    @Schema(description = "Whether or not it must be raining in the overworld to cause evolution this Pokémon species.")
    @param:JsonProperty("needs_overworld_rain")
    @get:JsonProperty("needs_overworld_rain") val needsOverworldRain: kotlin.Boolean? = null,

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(description = "The required relation between the Pokémon's Attack and Defense stats. 1 means Attack > Defense. 0 means Attack = Defense. -1 means Attack < Defense.")
    @param:JsonProperty("relative_physical_stats")
    @get:JsonProperty("relative_physical_stats") val relativePhysicalStats: kotlin.Int? = null,

    @get:Size(max=10)
    @Schema(description = "The required time of day. Day or night.")
    @param:JsonProperty("time_of_day")
    @get:JsonProperty("time_of_day") val timeOfDay: kotlin.String? = null,

    @Schema(description = "Whether or not the 3DS needs to be turned upside-down as this Pokémon levels up.")
    @param:JsonProperty("turn_upside_down")
    @get:JsonProperty("turn_upside_down") val turnUpsideDown: kotlin.Boolean? = null,

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(description = "The minimum number of times a move must be used in order to evolve into this Pokémon species.")
    @param:JsonProperty("min_move_count")
    @get:JsonProperty("min_move_count") val minMoveCount: kotlin.Int? = null,

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(description = "The minimum number of steps that must be taken in order to evolve into this Pokémon species.")
    @param:JsonProperty("min_steps")
    @get:JsonProperty("min_steps") val minSteps: kotlin.Int? = null,

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(description = "The minimum amount of damage taken during the evolution trigger event in order to evolve into this Pokémon species.")
    @param:JsonProperty("min_damage_taken")
    @get:JsonProperty("min_damage_taken") val minDamageTaken: kotlin.Int? = null
) {

}

