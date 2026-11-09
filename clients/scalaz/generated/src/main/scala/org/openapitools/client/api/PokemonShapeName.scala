package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonShapeName._

case class PokemonShapeName (
  /* The localized name for an API resource in a specific language. */
  name: String,
/* The language this name is in. */
  language: LanguageSummary)

object PokemonShapeName {
  import DateTimeCodecs._

  implicit val PokemonShapeNameCodecJson: CodecJson[PokemonShapeName] = CodecJson.derive[PokemonShapeName]
  implicit val PokemonShapeNameDecoder: EntityDecoder[PokemonShapeName] = jsonOf[PokemonShapeName]
  implicit val PokemonShapeNameEncoder: EntityEncoder[PokemonShapeName] = jsonEncoderOf[PokemonShapeName]
}
