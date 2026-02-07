package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import StatDetailAffectingMoves._

case class StatDetailAffectingMoves (
  increase: List[StatDetailAffectingMovesIncreaseInner],
decrease: List[StatDetailAffectingMovesIncreaseInner])

object StatDetailAffectingMoves {
  import DateTimeCodecs._

  implicit val StatDetailAffectingMovesCodecJson: CodecJson[StatDetailAffectingMoves] = CodecJson.derive[StatDetailAffectingMoves]
  implicit val StatDetailAffectingMovesDecoder: EntityDecoder[StatDetailAffectingMoves] = jsonOf[StatDetailAffectingMoves]
  implicit val StatDetailAffectingMovesEncoder: EntityEncoder[StatDetailAffectingMoves] = jsonEncoderOf[StatDetailAffectingMoves]
}
