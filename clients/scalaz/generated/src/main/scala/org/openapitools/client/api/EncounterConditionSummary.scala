package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import EncounterConditionSummary._

case class EncounterConditionSummary (
  name: String,
url: URI)

object EncounterConditionSummary {
  import DateTimeCodecs._

  implicit val EncounterConditionSummaryCodecJson: CodecJson[EncounterConditionSummary] = CodecJson.derive[EncounterConditionSummary]
  implicit val EncounterConditionSummaryDecoder: EntityDecoder[EncounterConditionSummary] = jsonOf[EncounterConditionSummary]
  implicit val EncounterConditionSummaryEncoder: EntityEncoder[EncounterConditionSummary] = jsonEncoderOf[EncounterConditionSummary]
}
