package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonDetail._

case class PokemonDetail (
  id: Integer,
name: String,
baseExperience: Option[Integer],
height: Option[Integer],
isDefault: Option[Boolean],
order: Option[Integer],
weight: Option[Integer],
abilities: List[PokemonDetailAbilitiesInner],
pastAbilities: List[PokemonDetailPastAbilitiesInner],
forms: List[PokemonFormSummary],
gameIndices: List[PokemonGameIndex],
heldItems: PokemonDetailHeldItems,
locationAreaEncounters: String,
moves: List[PokemonDetailMovesInner],
species: PokemonSpeciesSummary,
sprites: PokemonDetailSprites,
cries: PokemonDetailCries,
stats: List[PokemonStat],
types: List[PokemonDetailTypesInner],
pastTypes: List[PokemonDetailPastTypesInner])

object PokemonDetail {
  import DateTimeCodecs._

  implicit val PokemonDetailCodecJson: CodecJson[PokemonDetail] = CodecJson.derive[PokemonDetail]
  implicit val PokemonDetailDecoder: EntityDecoder[PokemonDetail] = jsonOf[PokemonDetail]
  implicit val PokemonDetailEncoder: EntityEncoder[PokemonDetail] = jsonEncoderOf[PokemonDetail]
}
