package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonEvolution._

case class PokemonEvolution (
  /* The version group in which these evolution requirements apply. */
  versionGroup: VersionGroupSummary,
/* Whether the evolution is considered as the expected evolution in a main series game. Each unique Pokémon variety of a line capable of evolution should have exactly one 'default' evolution. For example, the Meowth species has three default evolutions as there are three distinct varieties it can evolve into: Persian, Alolan Persian, and Perrserker. */
  isDefault: Option[Boolean],
/* The item required to cause evolution this into Pokémon species. */
  item: ItemSummary,
/* The type of event that triggers evolution into this Pokémon species. */
  trigger: EvolutionTriggerSummary,
/* The id of the gender of the evolving Pokémon species must be in order to evolve into this Pokémon species. */
  gender: Option[Integer],
/* The item the evolving Pokémon species must be holding during the evolution trigger event to evolve into this Pokémon species. */
  heldItem: ItemSummary,
knownMove: PokemonEvolutionKnownMove,
knownMoveType: PokemonEvolutionKnownMove,
/* The location the evolution must be triggered at. */
  location: LocationSummary,
/* The minimum required level of the evolving Pokémon species to evolve into this Pokémon species. */
  minLevel: Option[Integer],
/* The minimum required level of happiness the evolving Pokémon species to evolve into this Pokémon species. */
  minHappiness: Option[Integer],
/* The minimum required level of beauty the evolving Pokémon species to evolve into this Pokémon species. */
  minBeauty: Option[Integer],
/* The minimum required level of affection the evolving Pokémon species to evolve into this Pokémon species. */
  minAffection: Option[Integer],
/* Whether or not you need to be near a Moss Rock or Icy Rock to evolve into this Pokémon species. */
  nearSpecialRock: Option[Boolean],
/* Whether or not multiplayer link play is needed to evolve into this Pokémon species (e.g. Union Circle). */
  needsMultiplayer: Option[Boolean],
/* Whether or not it must be raining in the overworld to cause evolution this Pokémon species. */
  needsOverworldRain: Option[Boolean],
/* The Pokémon species that must be in the players party in order for the evolving Pokémon species to evolve into this Pokémon species. */
  partySpecies: PokemonSpeciesSummary,
/* The player must have a Pokémon of this type in their party during the evolution trigger event in order for the evolving Pokémon species to evolve into this Pokémon species. */
  partyType: TypeSummary,
/* The required relation between the Pokémon's Attack and Defense stats. 1 means Attack > Defense. 0 means Attack = Defense. -1 means Attack < Defense. */
  relativePhysicalStats: Option[Integer],
/* The required time of day. Day or night. */
  timeOfDay: Option[String],
/* Pokémon species for which this one must be traded. */
  tradeSpecies: PokemonSpeciesSummary,
/* Whether or not the 3DS needs to be turned upside-down as this Pokémon levels up. */
  turnUpsideDown: Option[Boolean],
/* The required region in which this evolution can occur. */
  region: RegionSummary,
/* The Pokémon form required before evolving, or null if unrestricted. */
  requiredPokemonForm: PokemonFormSummary,
/* The Pokémon form produced by this evolution, or null if unspecified. */
  evolvedPokemonForm: PokemonFormSummary,
/* The move that must be used by the evolving Pokémon species during the evolution trigger event in order to evolve into this Pokémon species. */
  usedMove: MoveSummary,
/* The minimum number of times a move must be used in order to evolve into this Pokémon species. */
  minMoveCount: Option[Integer],
/* The minimum number of steps that must be taken in order to evolve into this Pokémon species. */
  minSteps: Option[Integer],
/* The minimum amount of damage taken during the evolution trigger event in order to evolve into this Pokémon species. */
  minDamageTaken: Option[Integer],
/* The natures that allow this evolution, or null if unrestricted. */
  allowedNatures: List[NatureSummary],
/* An additional evolution condition expressed in reverse Polish notation, or null if none. */
  conditionExpression: EvolutionConditionExpression)

object PokemonEvolution {
  import DateTimeCodecs._

  implicit val PokemonEvolutionCodecJson: CodecJson[PokemonEvolution] = CodecJson.derive[PokemonEvolution]
  implicit val PokemonEvolutionDecoder: EntityDecoder[PokemonEvolution] = jsonOf[PokemonEvolution]
  implicit val PokemonEvolutionEncoder: EntityEncoder[PokemonEvolution] = jsonEncoderOf[PokemonEvolution]
}
