package org.openapitools.server.api.model

import org.openapitools.server.api.model.EvolutionConditionExpression
import org.openapitools.server.api.model.EvolutionTriggerSummary
import org.openapitools.server.api.model.ItemSummary
import org.openapitools.server.api.model.LocationSummary
import org.openapitools.server.api.model.MoveSummary
import org.openapitools.server.api.model.NatureSummary
import org.openapitools.server.api.model.PokemonEvolutionKnownMove
import org.openapitools.server.api.model.PokemonFormSummary
import org.openapitools.server.api.model.PokemonSpeciesSummary
import org.openapitools.server.api.model.RegionSummary
import org.openapitools.server.api.model.TypeSummary
import org.openapitools.server.api.model.VersionGroupSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonEvolution(
    /** The version group in which these evolution requirements apply. */
    val versionGroup: VersionGroupSummary,
    /** The item required to cause evolution this into Pokémon species. */
    val item: ItemSummary,
    /** The type of event that triggers evolution into this Pokémon species. */
    val trigger: EvolutionTriggerSummary,
    /** The item the evolving Pokémon species must be holding during the evolution trigger event to evolve into this Pokémon species. */
    val heldItem: ItemSummary,
    val knownMove: PokemonEvolutionKnownMove,
    val knownMoveType: PokemonEvolutionKnownMove,
    /** The location the evolution must be triggered at. */
    val location: LocationSummary,
    /** The Pokémon species that must be in the players party in order for the evolving Pokémon species to evolve into this Pokémon species. */
    val partySpecies: PokemonSpeciesSummary,
    /** The player must have a Pokémon of this type in their party during the evolution trigger event in order for the evolving Pokémon species to evolve into this Pokémon species. */
    val partyType: TypeSummary,
    /** Pokémon species for which this one must be traded. */
    val tradeSpecies: PokemonSpeciesSummary,
    /** The required region in which this evolution can occur. */
    val region: RegionSummary,
    /** The Pokémon form required before evolving, or null if unrestricted. */
    val requiredPokemonForm: PokemonFormSummary,
    /** The Pokémon form produced by this evolution, or null if unspecified. */
    val evolvedPokemonForm: PokemonFormSummary,
    /** The move that must be used by the evolving Pokémon species during the evolution trigger event in order to evolve into this Pokémon species. */
    val usedMove: MoveSummary,
    /** The natures that allow this evolution, or null if unrestricted. */
    val allowedNatures: kotlin.collections.List<NatureSummary>,
    /** An additional evolution condition expressed in reverse Polish notation, or null if none. */
    val conditionExpression: EvolutionConditionExpression,
    /** Whether the evolution is considered as the expected evolution in a main series game. Each unique Pokémon variety of a line capable of evolution should have exactly one &#39;default&#39; evolution. For example, the Meowth species has three default evolutions as there are three distinct varieties it can evolve into: Persian, Alolan Persian, and Perrserker. */
    val isDefault: kotlin.Boolean? = null,
    /** The id of the gender of the evolving Pokémon species must be in order to evolve into this Pokémon species. */
    val gender: kotlin.Int? = null,
    /** The minimum required level of the evolving Pokémon species to evolve into this Pokémon species. */
    val minLevel: kotlin.Int? = null,
    /** The minimum required level of happiness the evolving Pokémon species to evolve into this Pokémon species. */
    val minHappiness: kotlin.Int? = null,
    /** The minimum required level of beauty the evolving Pokémon species to evolve into this Pokémon species. */
    val minBeauty: kotlin.Int? = null,
    /** The minimum required level of affection the evolving Pokémon species to evolve into this Pokémon species. */
    val minAffection: kotlin.Int? = null,
    /** Whether or not you need to be near a Moss Rock or Icy Rock to evolve into this Pokémon species. */
    val nearSpecialRock: kotlin.Boolean? = null,
    /** Whether or not multiplayer link play is needed to evolve into this Pokémon species (e.g. Union Circle). */
    val needsMultiplayer: kotlin.Boolean? = null,
    /** Whether or not it must be raining in the overworld to cause evolution this Pokémon species. */
    val needsOverworldRain: kotlin.Boolean? = null,
    /** The required relation between the Pokémon&#39;s Attack and Defense stats. 1 means Attack &gt; Defense. 0 means Attack &#x3D; Defense. -1 means Attack &lt; Defense. */
    val relativePhysicalStats: kotlin.Int? = null,
    /** The required time of day. Day or night. */
    val timeOfDay: kotlin.String? = null,
    /** Whether or not the 3DS needs to be turned upside-down as this Pokémon levels up. */
    val turnUpsideDown: kotlin.Boolean? = null,
    /** The minimum number of times a move must be used in order to evolve into this Pokémon species. */
    val minMoveCount: kotlin.Int? = null,
    /** The minimum number of steps that must be taken in order to evolve into this Pokémon species. */
    val minSteps: kotlin.Int? = null,
    /** The minimum amount of damage taken during the evolution trigger event in order to evolve into this Pokémon species. */
    val minDamageTaken: kotlin.Int? = null
)
