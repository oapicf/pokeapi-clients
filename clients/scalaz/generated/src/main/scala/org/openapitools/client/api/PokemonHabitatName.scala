package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonHabitatName._

case class PokemonHabitatName (
  name: String,
language: LanguageSummary)

object PokemonHabitatName {
  import DateTimeCodecs._

  implicit val PokemonHabitatNameCodecJson: CodecJson[PokemonHabitatName] = CodecJson.derive[PokemonHabitatName]
  implicit val PokemonHabitatNameDecoder: EntityDecoder[PokemonHabitatName] = jsonOf[PokemonHabitatName]
  implicit val PokemonHabitatNameEncoder: EntityEncoder[PokemonHabitatName] = jsonEncoderOf[PokemonHabitatName]
}
