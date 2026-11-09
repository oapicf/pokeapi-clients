package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import EncounterMethodSummary._

case class EncounterMethodSummary (
  /* The name of the referenced resource. */
  name: String,
/* The URL of the referenced resource. */
  url: URI)

object EncounterMethodSummary {
  import DateTimeCodecs._

  implicit val EncounterMethodSummaryCodecJson: CodecJson[EncounterMethodSummary] = CodecJson.derive[EncounterMethodSummary]
  implicit val EncounterMethodSummaryDecoder: EntityDecoder[EncounterMethodSummary] = jsonOf[EncounterMethodSummary]
  implicit val EncounterMethodSummaryEncoder: EntityEncoder[EncounterMethodSummary] = jsonEncoderOf[EncounterMethodSummary]
}
