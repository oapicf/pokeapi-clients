package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import GrowthRateSummary._

case class GrowthRateSummary (
  name: String,
url: URI)

object GrowthRateSummary {
  import DateTimeCodecs._

  implicit val GrowthRateSummaryCodecJson: CodecJson[GrowthRateSummary] = CodecJson.derive[GrowthRateSummary]
  implicit val GrowthRateSummaryDecoder: EntityDecoder[GrowthRateSummary] = jsonOf[GrowthRateSummary]
  implicit val GrowthRateSummaryEncoder: EntityEncoder[GrowthRateSummary] = jsonEncoderOf[GrowthRateSummary]
}
