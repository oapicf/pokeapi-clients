package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PokeathlonStatSummary._

case class PokeathlonStatSummary (
  name: String,
url: URI)

object PokeathlonStatSummary {
  import DateTimeCodecs._

  implicit val PokeathlonStatSummaryCodecJson: CodecJson[PokeathlonStatSummary] = CodecJson.derive[PokeathlonStatSummary]
  implicit val PokeathlonStatSummaryDecoder: EntityDecoder[PokeathlonStatSummary] = jsonOf[PokeathlonStatSummary]
  implicit val PokeathlonStatSummaryEncoder: EntityEncoder[PokeathlonStatSummary] = jsonEncoderOf[PokeathlonStatSummary]
}
