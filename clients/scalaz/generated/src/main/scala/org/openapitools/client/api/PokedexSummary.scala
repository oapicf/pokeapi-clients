package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PokedexSummary._

case class PokedexSummary (
  name: String,
url: URI)

object PokedexSummary {
  import DateTimeCodecs._

  implicit val PokedexSummaryCodecJson: CodecJson[PokedexSummary] = CodecJson.derive[PokedexSummary]
  implicit val PokedexSummaryDecoder: EntityDecoder[PokedexSummary] = jsonOf[PokedexSummary]
  implicit val PokedexSummaryEncoder: EntityEncoder[PokedexSummary] = jsonEncoderOf[PokedexSummary]
}
