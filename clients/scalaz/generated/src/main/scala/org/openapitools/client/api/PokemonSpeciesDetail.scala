package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonSpeciesDetail._

case class PokemonSpeciesDetail (
  id: Integer,
name: String,
order: Option[Integer],
genderRate: Option[Integer],
captureRate: Option[Integer],
baseHappiness: Option[Integer],
isBaby: Option[Boolean],
isLegendary: Option[Boolean],
isMythical: Option[Boolean],
hatchCounter: Option[Integer],
hasGenderDifferences: Option[Boolean],
formsSwitchable: Option[Boolean],
growthRate: GrowthRateSummary,
pokedexNumbers: List[PokemonDexEntry],
eggGroups: List[AbilityDetailPokemonInnerPokemon],
color: PokemonColorSummary,
shape: PokemonShapeSummary,
evolvesFromSpecies: PokemonSpeciesSummary,
evolutionChain: EvolutionChainSummary,
habitat: PokemonHabitatSummary,
generation: GenerationSummary,
names: List[PokemonFormDetailFormNamesInner],
palParkEncounters: List[PokemonSpeciesDetailPalParkEncountersInner],
formDescriptions: List[PokemonSpeciesDescription],
flavorTextEntries: List[PokemonSpeciesFlavorText],
genera: List[PokemonSpeciesDetailGeneraInner],
varieties: List[PokemonSpeciesDetailVarietiesInner])

object PokemonSpeciesDetail {
  import DateTimeCodecs._

  implicit val PokemonSpeciesDetailCodecJson: CodecJson[PokemonSpeciesDetail] = CodecJson.derive[PokemonSpeciesDetail]
  implicit val PokemonSpeciesDetailDecoder: EntityDecoder[PokemonSpeciesDetail] = jsonOf[PokemonSpeciesDetail]
  implicit val PokemonSpeciesDetailEncoder: EntityEncoder[PokemonSpeciesDetail] = jsonEncoderOf[PokemonSpeciesDetail]
}
