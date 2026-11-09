package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MoveCombos._

case class MoveCombos (
  /* A detail of moves this move can be used before or after, granting additional appeal points in contests. */
  normal: MoveComboUsage,
/* A detail of moves this move can be used before or after, granting additional appeal points in super contests. */
  `super`: MoveComboUsage)

object MoveCombos {
  import DateTimeCodecs._

  implicit val MoveCombosCodecJson: CodecJson[MoveCombos] = CodecJson.derive[MoveCombos]
  implicit val MoveCombosDecoder: EntityDecoder[MoveCombos] = jsonOf[MoveCombos]
  implicit val MoveCombosEncoder: EntityEncoder[MoveCombos] = jsonEncoderOf[MoveCombos]
}
