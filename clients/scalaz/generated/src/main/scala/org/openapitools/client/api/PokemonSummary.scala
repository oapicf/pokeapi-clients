package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PokemonSummary._

case class PokemonSummary (
  name: String,
url: URI)

object PokemonSummary {
  import DateTimeCodecs._

  implicit val PokemonSummaryCodecJson: CodecJson[PokemonSummary] = CodecJson.derive[PokemonSummary]
  implicit val PokemonSummaryDecoder: EntityDecoder[PokemonSummary] = jsonOf[PokemonSummary]
  implicit val PokemonSummaryEncoder: EntityEncoder[PokemonSummary] = jsonEncoderOf[PokemonSummary]
}
