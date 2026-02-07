package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PokemonSpeciesSummary._

case class PokemonSpeciesSummary (
  name: String,
url: URI)

object PokemonSpeciesSummary {
  import DateTimeCodecs._

  implicit val PokemonSpeciesSummaryCodecJson: CodecJson[PokemonSpeciesSummary] = CodecJson.derive[PokemonSpeciesSummary]
  implicit val PokemonSpeciesSummaryDecoder: EntityDecoder[PokemonSpeciesSummary] = jsonOf[PokemonSpeciesSummary]
  implicit val PokemonSpeciesSummaryEncoder: EntityEncoder[PokemonSpeciesSummary] = jsonEncoderOf[PokemonSpeciesSummary]
}
