package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import MoveMetaCategorySummary._

case class MoveMetaCategorySummary (
  name: String,
url: URI)

object MoveMetaCategorySummary {
  import DateTimeCodecs._

  implicit val MoveMetaCategorySummaryCodecJson: CodecJson[MoveMetaCategorySummary] = CodecJson.derive[MoveMetaCategorySummary]
  implicit val MoveMetaCategorySummaryDecoder: EntityDecoder[MoveMetaCategorySummary] = jsonOf[MoveMetaCategorySummary]
  implicit val MoveMetaCategorySummaryEncoder: EntityEncoder[MoveMetaCategorySummary] = jsonEncoderOf[MoveMetaCategorySummary]
}
