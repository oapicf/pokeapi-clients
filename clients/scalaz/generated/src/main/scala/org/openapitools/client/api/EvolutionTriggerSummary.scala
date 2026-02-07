package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import EvolutionTriggerSummary._

case class EvolutionTriggerSummary (
  name: String,
url: URI)

object EvolutionTriggerSummary {
  import DateTimeCodecs._

  implicit val EvolutionTriggerSummaryCodecJson: CodecJson[EvolutionTriggerSummary] = CodecJson.derive[EvolutionTriggerSummary]
  implicit val EvolutionTriggerSummaryDecoder: EntityDecoder[EvolutionTriggerSummary] = jsonOf[EvolutionTriggerSummary]
  implicit val EvolutionTriggerSummaryEncoder: EntityEncoder[EvolutionTriggerSummary] = jsonEncoderOf[EvolutionTriggerSummary]
}
