package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonShapeAwesomeName._

case class PokemonShapeAwesomeName (
  /* The localized \"scientific\" name for an API resource in a specific language. */
  awesomeName: String,
/* The language this \"scientific\" name is in. */
  language: LanguageSummary)

object PokemonShapeAwesomeName {
  import DateTimeCodecs._

  implicit val PokemonShapeAwesomeNameCodecJson: CodecJson[PokemonShapeAwesomeName] = CodecJson.derive[PokemonShapeAwesomeName]
  implicit val PokemonShapeAwesomeNameDecoder: EntityDecoder[PokemonShapeAwesomeName] = jsonOf[PokemonShapeAwesomeName]
  implicit val PokemonShapeAwesomeNameEncoder: EntityEncoder[PokemonShapeAwesomeName] = jsonEncoderOf[PokemonShapeAwesomeName]
}
