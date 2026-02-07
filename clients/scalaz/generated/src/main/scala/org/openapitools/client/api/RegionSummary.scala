package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import RegionSummary._

case class RegionSummary (
  name: String,
url: URI)

object RegionSummary {
  import DateTimeCodecs._

  implicit val RegionSummaryCodecJson: CodecJson[RegionSummary] = CodecJson.derive[RegionSummary]
  implicit val RegionSummaryDecoder: EntityDecoder[RegionSummary] = jsonOf[RegionSummary]
  implicit val RegionSummaryEncoder: EntityEncoder[RegionSummary] = jsonEncoderOf[RegionSummary]
}
