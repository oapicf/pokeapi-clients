package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import EvolutionVariableSummary._

case class EvolutionVariableSummary (
  /* The name of the referenced resource. */
  name: String,
/* The URL of the referenced resource. */
  url: URI)

object EvolutionVariableSummary {
  import DateTimeCodecs._

  implicit val EvolutionVariableSummaryCodecJson: CodecJson[EvolutionVariableSummary] = CodecJson.derive[EvolutionVariableSummary]
  implicit val EvolutionVariableSummaryDecoder: EntityDecoder[EvolutionVariableSummary] = jsonOf[EvolutionVariableSummary]
  implicit val EvolutionVariableSummaryEncoder: EntityEncoder[EvolutionVariableSummary] = jsonEncoderOf[EvolutionVariableSummary]
}
