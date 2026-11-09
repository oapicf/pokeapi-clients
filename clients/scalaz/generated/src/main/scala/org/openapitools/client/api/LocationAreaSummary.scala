package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import LocationAreaSummary._

case class LocationAreaSummary (
  /* The name of the referenced resource. */
  name: String,
/* The URL of the referenced resource. */
  url: URI)

object LocationAreaSummary {
  import DateTimeCodecs._

  implicit val LocationAreaSummaryCodecJson: CodecJson[LocationAreaSummary] = CodecJson.derive[LocationAreaSummary]
  implicit val LocationAreaSummaryDecoder: EntityDecoder[LocationAreaSummary] = jsonOf[LocationAreaSummary]
  implicit val LocationAreaSummaryEncoder: EntityEncoder[LocationAreaSummary] = jsonEncoderOf[LocationAreaSummary]
}
