package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import MoveTargetSummary._

case class MoveTargetSummary (
  name: String,
url: URI)

object MoveTargetSummary {
  import DateTimeCodecs._

  implicit val MoveTargetSummaryCodecJson: CodecJson[MoveTargetSummary] = CodecJson.derive[MoveTargetSummary]
  implicit val MoveTargetSummaryDecoder: EntityDecoder[MoveTargetSummary] = jsonOf[MoveTargetSummary]
  implicit val MoveTargetSummaryEncoder: EntityEncoder[MoveTargetSummary] = jsonEncoderOf[MoveTargetSummary]
}
