package org.openapitools.server.model


/**
 * @param versionGroup The version group in which these evolution requirements apply. for example: ''null''
 * @param isDefault Whether the evolution is considered as the expected evolution in a main series game. Each unique Pokémon variety of a line capable of evolution should have exactly one 'default' evolution. For example, the Meowth species has three default evolutions as there are three distinct varieties it can evolve into: Persian, Alolan Persian, and Perrserker. for example: ''null''
 * @param item The item required to cause evolution this into Pokémon species. for example: ''null''
 * @param trigger The type of event that triggers evolution into this Pokémon species. for example: ''null''
 * @param gender The id of the gender of the evolving Pokémon species must be in order to evolve into this Pokémon species. for example: ''null''
 * @param heldItem The item the evolving Pokémon species must be holding during the evolution trigger event to evolve into this Pokémon species. for example: ''null''
 * @param knownMove  for example: ''null''
 * @param knownMoveType  for example: ''null''
 * @param location The location the evolution must be triggered at. for example: ''null''
 * @param minLevel The minimum required level of the evolving Pokémon species to evolve into this Pokémon species. for example: ''null''
 * @param minHappiness The minimum required level of happiness the evolving Pokémon species to evolve into this Pokémon species. for example: ''null''
 * @param minBeauty The minimum required level of beauty the evolving Pokémon species to evolve into this Pokémon species. for example: ''null''
 * @param minAffection The minimum required level of affection the evolving Pokémon species to evolve into this Pokémon species. for example: ''null''
 * @param nearSpecialRock Whether or not you need to be near a Moss Rock or Icy Rock to evolve into this Pokémon species. for example: ''null''
 * @param needsMultiplayer Whether or not multiplayer link play is needed to evolve into this Pokémon species (e.g. Union Circle). for example: ''null''
 * @param needsOverworldRain Whether or not it must be raining in the overworld to cause evolution this Pokémon species. for example: ''null''
 * @param partySpecies The Pokémon species that must be in the players party in order for the evolving Pokémon species to evolve into this Pokémon species. for example: ''null''
 * @param partyType The player must have a Pokémon of this type in their party during the evolution trigger event in order for the evolving Pokémon species to evolve into this Pokémon species. for example: ''null''
 * @param relativePhysicalStats The required relation between the Pokémon's Attack and Defense stats. 1 means Attack > Defense. 0 means Attack = Defense. -1 means Attack < Defense. for example: ''null''
 * @param timeOfDay The required time of day. Day or night. for example: ''null''
 * @param tradeSpecies Pokémon species for which this one must be traded. for example: ''null''
 * @param turnUpsideDown Whether or not the 3DS needs to be turned upside-down as this Pokémon levels up. for example: ''null''
 * @param region The required region in which this evolution can occur. for example: ''null''
 * @param requiredPokemonForm The Pokémon form required before evolving, or null if unrestricted. for example: ''null''
 * @param evolvedPokemonForm The Pokémon form produced by this evolution, or null if unspecified. for example: ''null''
 * @param usedMove The move that must be used by the evolving Pokémon species during the evolution trigger event in order to evolve into this Pokémon species. for example: ''null''
 * @param minMoveCount The minimum number of times a move must be used in order to evolve into this Pokémon species. for example: ''null''
 * @param minSteps The minimum number of steps that must be taken in order to evolve into this Pokémon species. for example: ''null''
 * @param minDamageTaken The minimum amount of damage taken during the evolution trigger event in order to evolve into this Pokémon species. for example: ''null''
 * @param allowedNatures The natures that allow this evolution, or null if unrestricted. for example: ''null''
 * @param conditionExpression An additional evolution condition expressed in reverse Polish notation, or null if none. for example: ''null''
*/
final case class PokemonEvolution (
  versionGroup: VersionGroupSummary,
  isDefault: Option[Boolean] = None,
  item: ItemSummary,
  trigger: EvolutionTriggerSummary,
  gender: Option[Int] = None,
  heldItem: ItemSummary,
  knownMove: PokemonEvolutionKnownMove,
  knownMoveType: PokemonEvolutionKnownMove,
  location: LocationSummary,
  minLevel: Option[Int] = None,
  minHappiness: Option[Int] = None,
  minBeauty: Option[Int] = None,
  minAffection: Option[Int] = None,
  nearSpecialRock: Option[Boolean] = None,
  needsMultiplayer: Option[Boolean] = None,
  needsOverworldRain: Option[Boolean] = None,
  partySpecies: PokemonSpeciesSummary,
  partyType: TypeSummary,
  relativePhysicalStats: Option[Int] = None,
  timeOfDay: Option[String] = None,
  tradeSpecies: PokemonSpeciesSummary,
  turnUpsideDown: Option[Boolean] = None,
  region: RegionSummary,
  requiredPokemonForm: PokemonFormSummary,
  evolvedPokemonForm: PokemonFormSummary,
  usedMove: MoveSummary,
  minMoveCount: Option[Int] = None,
  minSteps: Option[Int] = None,
  minDamageTaken: Option[Int] = None,
  allowedNatures: Seq[NatureSummary],
  conditionExpression: EvolutionConditionExpression
)

