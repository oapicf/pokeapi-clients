package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import StatAffectingMoves._

case class StatAffectingMoves (
  /* A list of moves and how they change the referenced stat. */
  increase: List[MoveStatChange],
/* A list of moves and how they change the referenced stat. */
  decrease: List[MoveStatChange])

object StatAffectingMoves {
  import DateTimeCodecs._

  implicit val StatAffectingMovesCodecJson: CodecJson[StatAffectingMoves] = CodecJson.derive[StatAffectingMoves]
  implicit val StatAffectingMovesDecoder: EntityDecoder[StatAffectingMoves] = jsonOf[StatAffectingMoves]
  implicit val StatAffectingMovesEncoder: EntityEncoder[StatAffectingMoves] = jsonEncoderOf[StatAffectingMoves]
}
