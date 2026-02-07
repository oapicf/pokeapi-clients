package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonSpeciesFlavorText._

case class PokemonSpeciesFlavorText (
  flavorText: String,
language: LanguageSummary,
version: VersionSummary)

object PokemonSpeciesFlavorText {
  import DateTimeCodecs._

  implicit val PokemonSpeciesFlavorTextCodecJson: CodecJson[PokemonSpeciesFlavorText] = CodecJson.derive[PokemonSpeciesFlavorText]
  implicit val PokemonSpeciesFlavorTextDecoder: EntityDecoder[PokemonSpeciesFlavorText] = jsonOf[PokemonSpeciesFlavorText]
  implicit val PokemonSpeciesFlavorTextEncoder: EntityEncoder[PokemonSpeciesFlavorText] = jsonEncoderOf[PokemonSpeciesFlavorText]
}
