package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MoveComboUsage._

case class MoveComboUsage (
  /* A list of moves to use before this move. */
  useBefore: List[MoveSummary],
/* A list of moves to use after this move. */
  useAfter: List[MoveSummary])

object MoveComboUsage {
  import DateTimeCodecs._

  implicit val MoveComboUsageCodecJson: CodecJson[MoveComboUsage] = CodecJson.derive[MoveComboUsage]
  implicit val MoveComboUsageDecoder: EntityDecoder[MoveComboUsage] = jsonOf[MoveComboUsage]
  implicit val MoveComboUsageEncoder: EntityEncoder[MoveComboUsage] = jsonEncoderOf[MoveComboUsage]
}
