package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import CurrencySummary._

case class CurrencySummary (
  /* The name of the referenced resource. */
  name: String,
/* The URL of the referenced resource. */
  url: URI)

object CurrencySummary {
  import DateTimeCodecs._

  implicit val CurrencySummaryCodecJson: CodecJson[CurrencySummary] = CodecJson.derive[CurrencySummary]
  implicit val CurrencySummaryDecoder: EntityDecoder[CurrencySummary] = jsonOf[CurrencySummary]
  implicit val CurrencySummaryEncoder: EntityEncoder[CurrencySummary] = jsonEncoderOf[CurrencySummary]
}
