package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonEvolution.
  * @param versionGroup The version group in which these evolution requirements apply.
  * @param isDefault Whether the evolution is considered as the expected evolution in a main series game. Each unique Pokémon variety of a line capable of evolution should have exactly one 'default' evolution. For example, the Meowth species has three default evolutions as there are three distinct varieties it can evolve into: Persian, Alolan Persian, and Perrserker.
  * @param item The item required to cause evolution this into Pokémon species.
  * @param trigger The type of event that triggers evolution into this Pokémon species.
  * @param gender The id of the gender of the evolving Pokémon species must be in order to evolve into this Pokémon species.
  * @param heldItem The item the evolving Pokémon species must be holding during the evolution trigger event to evolve into this Pokémon species.
  * @param location The location the evolution must be triggered at.
  * @param minLevel The minimum required level of the evolving Pokémon species to evolve into this Pokémon species.
  * @param minHappiness The minimum required level of happiness the evolving Pokémon species to evolve into this Pokémon species.
  * @param minBeauty The minimum required level of beauty the evolving Pokémon species to evolve into this Pokémon species.
  * @param minAffection The minimum required level of affection the evolving Pokémon species to evolve into this Pokémon species.
  * @param nearSpecialRock Whether or not you need to be near a Moss Rock or Icy Rock to evolve into this Pokémon species.
  * @param needsMultiplayer Whether or not multiplayer link play is needed to evolve into this Pokémon species (e.g. Union Circle).
  * @param needsOverworldRain Whether or not it must be raining in the overworld to cause evolution this Pokémon species.
  * @param partySpecies The Pokémon species that must be in the players party in order for the evolving Pokémon species to evolve into this Pokémon species.
  * @param partyType The player must have a Pokémon of this type in their party during the evolution trigger event in order for the evolving Pokémon species to evolve into this Pokémon species.
  * @param relativePhysicalStats The required relation between the Pokémon's Attack and Defense stats. 1 means Attack > Defense. 0 means Attack = Defense. -1 means Attack < Defense.
  * @param timeOfDay The required time of day. Day or night.
  * @param tradeSpecies Pokémon species for which this one must be traded.
  * @param turnUpsideDown Whether or not the 3DS needs to be turned upside-down as this Pokémon levels up.
  * @param region The required region in which this evolution can occur.
  * @param requiredPokemonForm The Pokémon form required before evolving, or null if unrestricted.
  * @param evolvedPokemonForm The Pokémon form produced by this evolution, or null if unspecified.
  * @param usedMove The move that must be used by the evolving Pokémon species during the evolution trigger event in order to evolve into this Pokémon species.
  * @param minMoveCount The minimum number of times a move must be used in order to evolve into this Pokémon species.
  * @param minSteps The minimum number of steps that must be taken in order to evolve into this Pokémon species.
  * @param minDamageTaken The minimum amount of damage taken during the evolution trigger event in order to evolve into this Pokémon species.
  * @param allowedNatures The natures that allow this evolution, or null if unrestricted.
  * @param conditionExpression An additional evolution condition expressed in reverse Polish notation, or null if none.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PokemonEvolution(
  versionGroup: VersionGroupSummary,
  isDefault: Option[Boolean],
  item: ItemSummary,
  trigger: EvolutionTriggerSummary,
  gender: Option[Int],
  heldItem: ItemSummary,
  knownMove: PokemonEvolutionKnownMove,
  knownMoveType: PokemonEvolutionKnownMove,
  location: LocationSummary,
  minLevel: Option[Int],
  minHappiness: Option[Int],
  minBeauty: Option[Int],
  minAffection: Option[Int],
  nearSpecialRock: Option[Boolean],
  needsMultiplayer: Option[Boolean],
  needsOverworldRain: Option[Boolean],
  partySpecies: PokemonSpeciesSummary,
  partyType: TypeSummary,
  relativePhysicalStats: Option[Int],
  timeOfDay: Option[String],
  tradeSpecies: PokemonSpeciesSummary,
  turnUpsideDown: Option[Boolean],
  region: RegionSummary,
  requiredPokemonForm: PokemonFormSummary,
  evolvedPokemonForm: PokemonFormSummary,
  usedMove: MoveSummary,
  minMoveCount: Option[Int],
  minSteps: Option[Int],
  minDamageTaken: Option[Int],
  allowedNatures: List[NatureSummary],
  conditionExpression: EvolutionConditionExpression
)

object PokemonEvolution {
  implicit lazy val pokemonEvolutionJsonFormat: Format[PokemonEvolution] = Json.format[PokemonEvolution]
}

