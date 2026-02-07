package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PokemonFormSummary._

case class PokemonFormSummary (
  name: String,
url: URI)

object PokemonFormSummary {
  import DateTimeCodecs._

  implicit val PokemonFormSummaryCodecJson: CodecJson[PokemonFormSummary] = CodecJson.derive[PokemonFormSummary]
  implicit val PokemonFormSummaryDecoder: EntityDecoder[PokemonFormSummary] = jsonOf[PokemonFormSummary]
  implicit val PokemonFormSummaryEncoder: EntityEncoder[PokemonFormSummary] = jsonEncoderOf[PokemonFormSummary]
}
