package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PokemonHabitatSummary._

case class PokemonHabitatSummary (
  name: String,
url: URI)

object PokemonHabitatSummary {
  import DateTimeCodecs._

  implicit val PokemonHabitatSummaryCodecJson: CodecJson[PokemonHabitatSummary] = CodecJson.derive[PokemonHabitatSummary]
  implicit val PokemonHabitatSummaryDecoder: EntityDecoder[PokemonHabitatSummary] = jsonOf[PokemonHabitatSummary]
  implicit val PokemonHabitatSummaryEncoder: EntityEncoder[PokemonHabitatSummary] = jsonEncoderOf[PokemonHabitatSummary]
}
