package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MoveMetaStatChange._

case class MoveMetaStatChange (
  /* The amount of change. */
  change: Integer,
/* The stat being affected. */
  stat: StatSummary)

object MoveMetaStatChange {
  import DateTimeCodecs._

  implicit val MoveMetaStatChangeCodecJson: CodecJson[MoveMetaStatChange] = CodecJson.derive[MoveMetaStatChange]
  implicit val MoveMetaStatChangeDecoder: EntityDecoder[MoveMetaStatChange] = jsonOf[MoveMetaStatChange]
  implicit val MoveMetaStatChangeEncoder: EntityEncoder[MoveMetaStatChange] = jsonEncoderOf[MoveMetaStatChange]
}
