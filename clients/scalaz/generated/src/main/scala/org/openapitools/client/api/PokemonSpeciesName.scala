package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonSpeciesName._

case class PokemonSpeciesName (
  /* The localized name for an API resource in a specific language. */
  name: String,
/* The language this name is in. */
  language: LanguageSummary)

object PokemonSpeciesName {
  import DateTimeCodecs._

  implicit val PokemonSpeciesNameCodecJson: CodecJson[PokemonSpeciesName] = CodecJson.derive[PokemonSpeciesName]
  implicit val PokemonSpeciesNameDecoder: EntityDecoder[PokemonSpeciesName] = jsonOf[PokemonSpeciesName]
  implicit val PokemonSpeciesNameEncoder: EntityEncoder[PokemonSpeciesName] = jsonEncoderOf[PokemonSpeciesName]
}
