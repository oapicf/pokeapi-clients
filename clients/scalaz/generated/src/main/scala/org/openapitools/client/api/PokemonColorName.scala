package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonColorName._

case class PokemonColorName (
  name: String,
language: LanguageSummary)

object PokemonColorName {
  import DateTimeCodecs._

  implicit val PokemonColorNameCodecJson: CodecJson[PokemonColorName] = CodecJson.derive[PokemonColorName]
  implicit val PokemonColorNameDecoder: EntityDecoder[PokemonColorName] = jsonOf[PokemonColorName]
  implicit val PokemonColorNameEncoder: EntityEncoder[PokemonColorName] = jsonEncoderOf[PokemonColorName]
}
