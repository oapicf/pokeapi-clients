package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonSpeciesDetail._

case class PokemonSpeciesDetail (
  /* The identifier for this resource. */
  id: Integer,
/* The name for this resource. */
  name: String,
/* The order in which species should be sorted. Based on National Dex order, except families are grouped together and sorted by stage. */
  order: Option[Integer],
/* The chance of this Pokémon being female, in eighths; or -1 for genderless. */
  genderRate: Option[Integer],
/* The base capture rate; up to 255. The higher the number, the easier the catch. */
  captureRate: Option[Integer],
/* The happiness when caught by a normal Pokéball; up to 255. The higher the number, the happier the Pokémon. */
  baseHappiness: Option[Integer],
/* Whether or not this is a baby Pokémon. */
  isBaby: Option[Boolean],
/* Whether or not this is a legendary Pokémon. */
  isLegendary: Option[Boolean],
/* Whether or not this is a mythical Pokémon. */
  isMythical: Option[Boolean],
/* Initial hatch counter: one must walk Y × (hatch_counter + 1) steps before this Pokémon's egg hatches, unless utilizing bonuses like Flame Body's. Y varies per generation. In Generations II, III, and VII, Egg cycles are 256 steps long. In Generation IV, Egg cycles are 255 steps long. In Pokémon Brilliant Diamond and Shining Pearl, Egg cycles are also 255 steps long, but are shorter on special dates. In Generations V and VI, Egg cycles are 257 steps long. In Pokémon Sword and Shield, and in Pokémon Scarlet and Violet, Egg cycles are 128 steps long. */
  hatchCounter: Option[Integer],
/* Whether or not this Pokémon has visual gender differences. */
  hasGenderDifferences: Option[Boolean],
/* Whether or not this Pokémon has multiple forms and can switch between them. */
  formsSwitchable: Option[Boolean],
/* The rate at which this Pokémon species gains levels. */
  growthRate: GrowthRateSummary,
/* A list of Pokedexes and the indexes reserved within them for this Pokémon species. */
  pokedexNumbers: List[PokemonDexEntry],
/* A list of egg groups this Pokémon species is a member of. */
  eggGroups: List[EggGroupSummary],
/* The color of this Pokémon for Pokédex search. */
  color: PokemonColorSummary,
/* The shape of this Pokémon for Pokédex search. */
  shape: PokemonShapeSummary,
/* The Pokémon species that evolves into this Pokemon_species. */
  evolvesFromSpecies: PokemonSpeciesSummary,
/* The evolution chain this Pokémon species is a member of. */
  evolutionChain: EvolutionChainSummary,
/* The habitat this Pokémon species can be encountered in. */
  habitat: PokemonHabitatSummary,
/* The generation this Pokémon species was introduced in. */
  generation: GenerationSummary,
/* The name of this resource listed in different languages. */
  names: List[PokemonSpeciesName],
/* A list of encounters that can be had with this Pokémon species in pal park. */
  palParkEncounters: List[PokemonSpeciesPalParkEncounter],
/* Descriptions of different forms Pokémon take on within the Pokémon species. */
  formDescriptions: List[PokemonSpeciesDescription],
/* A list of flavor text entries for this Pokémon species. */
  flavorTextEntries: List[PokemonSpeciesFlavorText],
/* The genus of this Pokémon species listed in multiple languages. */
  genera: List[PokemonSpeciesGenus],
/* A list of the Pokémon that exist within this Pokémon species. */
  varieties: List[PokemonSpeciesVariety])

object PokemonSpeciesDetail {
  import DateTimeCodecs._

  implicit val PokemonSpeciesDetailCodecJson: CodecJson[PokemonSpeciesDetail] = CodecJson.derive[PokemonSpeciesDetail]
  implicit val PokemonSpeciesDetailDecoder: EntityDecoder[PokemonSpeciesDetail] = jsonOf[PokemonSpeciesDetail]
  implicit val PokemonSpeciesDetailEncoder: EntityEncoder[PokemonSpeciesDetail] = jsonEncoderOf[PokemonSpeciesDetail]
}
