package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import MoveLearnMethodSummary._

case class MoveLearnMethodSummary (
  name: String,
url: URI)

object MoveLearnMethodSummary {
  import DateTimeCodecs._

  implicit val MoveLearnMethodSummaryCodecJson: CodecJson[MoveLearnMethodSummary] = CodecJson.derive[MoveLearnMethodSummary]
  implicit val MoveLearnMethodSummaryDecoder: EntityDecoder[MoveLearnMethodSummary] = jsonOf[MoveLearnMethodSummary]
  implicit val MoveLearnMethodSummaryEncoder: EntityEncoder[MoveLearnMethodSummary] = jsonEncoderOf[MoveLearnMethodSummary]
}
