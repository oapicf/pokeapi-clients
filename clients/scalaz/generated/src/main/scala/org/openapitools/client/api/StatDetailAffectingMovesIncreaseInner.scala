package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import StatDetailAffectingMovesIncreaseInner._

case class StatDetailAffectingMovesIncreaseInner (
  change: Integer,
move: AbilityDetailPokemonInnerPokemon)

object StatDetailAffectingMovesIncreaseInner {
  import DateTimeCodecs._

  implicit val StatDetailAffectingMovesIncreaseInnerCodecJson: CodecJson[StatDetailAffectingMovesIncreaseInner] = CodecJson.derive[StatDetailAffectingMovesIncreaseInner]
  implicit val StatDetailAffectingMovesIncreaseInnerDecoder: EntityDecoder[StatDetailAffectingMovesIncreaseInner] = jsonOf[StatDetailAffectingMovesIncreaseInner]
  implicit val StatDetailAffectingMovesIncreaseInnerEncoder: EntityEncoder[StatDetailAffectingMovesIncreaseInner] = jsonEncoderOf[StatDetailAffectingMovesIncreaseInner]
}
