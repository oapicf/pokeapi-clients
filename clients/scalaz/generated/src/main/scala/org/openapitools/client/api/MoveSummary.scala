package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import MoveSummary._

case class MoveSummary (
  name: String,
url: URI)

object MoveSummary {
  import DateTimeCodecs._

  implicit val MoveSummaryCodecJson: CodecJson[MoveSummary] = CodecJson.derive[MoveSummary]
  implicit val MoveSummaryDecoder: EntityDecoder[MoveSummary] = jsonOf[MoveSummary]
  implicit val MoveSummaryEncoder: EntityEncoder[MoveSummary] = jsonEncoderOf[MoveSummary]
}
