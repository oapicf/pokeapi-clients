package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonShapeDetail._

case class PokemonShapeDetail (
  id: Integer,
name: String,
awesomeNames: List[PokemonShapeDetailAwesomeNamesInner],
names: List[PokemonShapeDetailNamesInner],
pokemonSpecies: List[PokemonSpeciesSummary])

object PokemonShapeDetail {
  import DateTimeCodecs._

  implicit val PokemonShapeDetailCodecJson: CodecJson[PokemonShapeDetail] = CodecJson.derive[PokemonShapeDetail]
  implicit val PokemonShapeDetailDecoder: EntityDecoder[PokemonShapeDetail] = jsonOf[PokemonShapeDetail]
  implicit val PokemonShapeDetailEncoder: EntityEncoder[PokemonShapeDetail] = jsonEncoderOf[PokemonShapeDetail]
}
