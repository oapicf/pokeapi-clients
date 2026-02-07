package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import EncounterConditionValueSummary._

case class EncounterConditionValueSummary (
  name: String,
url: URI)

object EncounterConditionValueSummary {
  import DateTimeCodecs._

  implicit val EncounterConditionValueSummaryCodecJson: CodecJson[EncounterConditionValueSummary] = CodecJson.derive[EncounterConditionValueSummary]
  implicit val EncounterConditionValueSummaryDecoder: EntityDecoder[EncounterConditionValueSummary] = jsonOf[EncounterConditionValueSummary]
  implicit val EncounterConditionValueSummaryEncoder: EntityEncoder[EncounterConditionValueSummary] = jsonEncoderOf[EncounterConditionValueSummary]
}
