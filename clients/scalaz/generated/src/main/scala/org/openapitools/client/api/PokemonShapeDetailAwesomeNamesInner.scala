package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonShapeDetailAwesomeNamesInner._

case class PokemonShapeDetailAwesomeNamesInner (
  awesomeName: String,
language: AbilityDetailPokemonInnerPokemon)

object PokemonShapeDetailAwesomeNamesInner {
  import DateTimeCodecs._

  implicit val PokemonShapeDetailAwesomeNamesInnerCodecJson: CodecJson[PokemonShapeDetailAwesomeNamesInner] = CodecJson.derive[PokemonShapeDetailAwesomeNamesInner]
  implicit val PokemonShapeDetailAwesomeNamesInnerDecoder: EntityDecoder[PokemonShapeDetailAwesomeNamesInner] = jsonOf[PokemonShapeDetailAwesomeNamesInner]
  implicit val PokemonShapeDetailAwesomeNamesInnerEncoder: EntityEncoder[PokemonShapeDetailAwesomeNamesInner] = jsonEncoderOf[PokemonShapeDetailAwesomeNamesInner]
}
