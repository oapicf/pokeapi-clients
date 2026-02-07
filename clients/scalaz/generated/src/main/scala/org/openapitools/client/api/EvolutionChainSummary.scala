package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import EvolutionChainSummary._

case class EvolutionChainSummary (
  url: URI)

object EvolutionChainSummary {
  import DateTimeCodecs._

  implicit val EvolutionChainSummaryCodecJson: CodecJson[EvolutionChainSummary] = CodecJson.derive[EvolutionChainSummary]
  implicit val EvolutionChainSummaryDecoder: EntityDecoder[EvolutionChainSummary] = jsonOf[EvolutionChainSummary]
  implicit val EvolutionChainSummaryEncoder: EntityEncoder[EvolutionChainSummary] = jsonEncoderOf[EvolutionChainSummary]
}
