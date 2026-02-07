package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import LocationSummary._

case class LocationSummary (
  name: String,
url: URI)

object LocationSummary {
  import DateTimeCodecs._

  implicit val LocationSummaryCodecJson: CodecJson[LocationSummary] = CodecJson.derive[LocationSummary]
  implicit val LocationSummaryDecoder: EntityDecoder[LocationSummary] = jsonOf[LocationSummary]
  implicit val LocationSummaryEncoder: EntityEncoder[LocationSummary] = jsonEncoderOf[LocationSummary]
}
