package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MoveStatChange._

case class MoveStatChange (
  /* The maximum amount of change to the referenced stat. */
  change: Integer,
/* The move causing the change. */
  move: MoveSummary)

object MoveStatChange {
  import DateTimeCodecs._

  implicit val MoveStatChangeCodecJson: CodecJson[MoveStatChange] = CodecJson.derive[MoveStatChange]
  implicit val MoveStatChangeDecoder: EntityDecoder[MoveStatChange] = jsonOf[MoveStatChange]
  implicit val MoveStatChangeEncoder: EntityEncoder[MoveStatChange] = jsonEncoderOf[MoveStatChange]
}
