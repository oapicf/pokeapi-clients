package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import BerryFirmnessSummary._

case class BerryFirmnessSummary (
  name: String,
url: URI)

object BerryFirmnessSummary {
  import DateTimeCodecs._

  implicit val BerryFirmnessSummaryCodecJson: CodecJson[BerryFirmnessSummary] = CodecJson.derive[BerryFirmnessSummary]
  implicit val BerryFirmnessSummaryDecoder: EntityDecoder[BerryFirmnessSummary] = jsonOf[BerryFirmnessSummary]
  implicit val BerryFirmnessSummaryEncoder: EntityEncoder[BerryFirmnessSummary] = jsonEncoderOf[BerryFirmnessSummary]
}
