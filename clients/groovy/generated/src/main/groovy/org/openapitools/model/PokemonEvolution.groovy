package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.EvolutionConditionExpression;
import org.openapitools.model.EvolutionTriggerSummary;
import org.openapitools.model.ItemSummary;
import org.openapitools.model.LocationSummary;
import org.openapitools.model.MoveSummary;
import org.openapitools.model.NatureSummary;
import org.openapitools.model.PokemonEvolutionKnownMove;
import org.openapitools.model.PokemonFormSummary;
import org.openapitools.model.PokemonSpeciesSummary;
import org.openapitools.model.RegionSummary;
import org.openapitools.model.TypeSummary;
import org.openapitools.model.VersionGroupSummary;

@Canonical
class PokemonEvolution {
    /* The version group in which these evolution requirements apply. */
    VersionGroupSummary versionGroup
    /* Whether the evolution is considered as the expected evolution in a main series game. Each unique Pokémon variety of a line capable of evolution should have exactly one 'default' evolution. For example, the Meowth species has three default evolutions as there are three distinct varieties it can evolve into: Persian, Alolan Persian, and Perrserker. */
    Boolean isDefault
    /* The item required to cause evolution this into Pokémon species. */
    ItemSummary item
    /* The type of event that triggers evolution into this Pokémon species. */
    EvolutionTriggerSummary trigger
    /* The id of the gender of the evolving Pokémon species must be in order to evolve into this Pokémon species. */
    Integer gender
    /* The item the evolving Pokémon species must be holding during the evolution trigger event to evolve into this Pokémon species. */
    ItemSummary heldItem
    
    PokemonEvolutionKnownMove knownMove
    
    PokemonEvolutionKnownMove knownMoveType
    /* The location the evolution must be triggered at. */
    LocationSummary location
    /* The minimum required level of the evolving Pokémon species to evolve into this Pokémon species. */
    Integer minLevel
    /* The minimum required level of happiness the evolving Pokémon species to evolve into this Pokémon species. */
    Integer minHappiness
    /* The minimum required level of beauty the evolving Pokémon species to evolve into this Pokémon species. */
    Integer minBeauty
    /* The minimum required level of affection the evolving Pokémon species to evolve into this Pokémon species. */
    Integer minAffection
    /* Whether or not you need to be near a Moss Rock or Icy Rock to evolve into this Pokémon species. */
    Boolean nearSpecialRock
    /* Whether or not multiplayer link play is needed to evolve into this Pokémon species (e.g. Union Circle). */
    Boolean needsMultiplayer
    /* Whether or not it must be raining in the overworld to cause evolution this Pokémon species. */
    Boolean needsOverworldRain
    /* The Pokémon species that must be in the players party in order for the evolving Pokémon species to evolve into this Pokémon species. */
    PokemonSpeciesSummary partySpecies
    /* The player must have a Pokémon of this type in their party during the evolution trigger event in order for the evolving Pokémon species to evolve into this Pokémon species. */
    TypeSummary partyType
    /* The required relation between the Pokémon's Attack and Defense stats. 1 means Attack > Defense. 0 means Attack = Defense. -1 means Attack < Defense. */
    Integer relativePhysicalStats
    /* The required time of day. Day or night. */
    String timeOfDay
    /* Pokémon species for which this one must be traded. */
    PokemonSpeciesSummary tradeSpecies
    /* Whether or not the 3DS needs to be turned upside-down as this Pokémon levels up. */
    Boolean turnUpsideDown
    /* The required region in which this evolution can occur. */
    RegionSummary region
    /* The Pokémon form required before evolving, or null if unrestricted. */
    PokemonFormSummary requiredPokemonForm
    /* The Pokémon form produced by this evolution, or null if unspecified. */
    PokemonFormSummary evolvedPokemonForm
    /* The move that must be used by the evolving Pokémon species during the evolution trigger event in order to evolve into this Pokémon species. */
    MoveSummary usedMove
    /* The minimum number of times a move must be used in order to evolve into this Pokémon species. */
    Integer minMoveCount
    /* The minimum number of steps that must be taken in order to evolve into this Pokémon species. */
    Integer minSteps
    /* The minimum amount of damage taken during the evolution trigger event in order to evolve into this Pokémon species. */
    Integer minDamageTaken
    /* The natures that allow this evolution, or null if unrestricted. */
    List<NatureSummary> allowedNatures
    /* An additional evolution condition expressed in reverse Polish notation, or null if none. */
    EvolutionConditionExpression conditionExpression
}
