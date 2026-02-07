package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PokemonColorSummary._

case class PokemonColorSummary (
  name: String,
url: URI)

object PokemonColorSummary {
  import DateTimeCodecs._

  implicit val PokemonColorSummaryCodecJson: CodecJson[PokemonColorSummary] = CodecJson.derive[PokemonColorSummary]
  implicit val PokemonColorSummaryDecoder: EntityDecoder[PokemonColorSummary] = jsonOf[PokemonColorSummary]
  implicit val PokemonColorSummaryEncoder: EntityEncoder[PokemonColorSummary] = jsonEncoderOf[PokemonColorSummary]
}
