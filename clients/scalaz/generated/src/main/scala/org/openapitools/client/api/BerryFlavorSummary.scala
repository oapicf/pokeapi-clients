package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import BerryFlavorSummary._

case class BerryFlavorSummary (
  name: String,
url: URI)

object BerryFlavorSummary {
  import DateTimeCodecs._

  implicit val BerryFlavorSummaryCodecJson: CodecJson[BerryFlavorSummary] = CodecJson.derive[BerryFlavorSummary]
  implicit val BerryFlavorSummaryDecoder: EntityDecoder[BerryFlavorSummary] = jsonOf[BerryFlavorSummary]
  implicit val BerryFlavorSummaryEncoder: EntityEncoder[BerryFlavorSummary] = jsonEncoderOf[BerryFlavorSummary]
}
