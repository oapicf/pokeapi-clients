package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonFormName._

case class PokemonFormName (
  /* The localized name for an API resource in a specific language. */
  name: String,
/* The language this name is in. */
  language: LanguageSummary)

object PokemonFormName {
  import DateTimeCodecs._

  implicit val PokemonFormNameCodecJson: CodecJson[PokemonFormName] = CodecJson.derive[PokemonFormName]
  implicit val PokemonFormNameDecoder: EntityDecoder[PokemonFormName] = jsonOf[PokemonFormName]
  implicit val PokemonFormNameEncoder: EntityEncoder[PokemonFormName] = jsonEncoderOf[PokemonFormName]
}
