package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import GenderSummary._

case class GenderSummary (
  name: String,
url: URI)

object GenderSummary {
  import DateTimeCodecs._

  implicit val GenderSummaryCodecJson: CodecJson[GenderSummary] = CodecJson.derive[GenderSummary]
  implicit val GenderSummaryDecoder: EntityDecoder[GenderSummary] = jsonOf[GenderSummary]
  implicit val GenderSummaryEncoder: EntityEncoder[GenderSummary] = jsonEncoderOf[GenderSummary]
}
