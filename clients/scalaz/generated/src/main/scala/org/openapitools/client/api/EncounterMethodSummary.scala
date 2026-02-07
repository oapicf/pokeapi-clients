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
  name: String,
url: URI)

object EncounterMethodSummary {
  import DateTimeCodecs._

  implicit val EncounterMethodSummaryCodecJson: CodecJson[EncounterMethodSummary] = CodecJson.derive[EncounterMethodSummary]
  implicit val EncounterMethodSummaryDecoder: EntityDecoder[EncounterMethodSummary] = jsonOf[EncounterMethodSummary]
  implicit val EncounterMethodSummaryEncoder: EntityEncoder[EncounterMethodSummary] = jsonEncoderOf[EncounterMethodSummary]
}
