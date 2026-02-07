package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PalParkAreaSummary._

case class PalParkAreaSummary (
  name: String,
url: URI)

object PalParkAreaSummary {
  import DateTimeCodecs._

  implicit val PalParkAreaSummaryCodecJson: CodecJson[PalParkAreaSummary] = CodecJson.derive[PalParkAreaSummary]
  implicit val PalParkAreaSummaryDecoder: EntityDecoder[PalParkAreaSummary] = jsonOf[PalParkAreaSummary]
  implicit val PalParkAreaSummaryEncoder: EntityEncoder[PalParkAreaSummary] = jsonEncoderOf[PalParkAreaSummary]
}
