package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonSpeciesFlavorText._

case class PokemonSpeciesFlavorText (
  /* The localized flavor text for an API resource in a specific language. Note that this text is left unprocessed as it is found in game files. This means that it contains special characters that one might want to replace with their visible decodable version. Please check out this <a href='https://github.com/veekun/pokedex/issues/218#issuecomment-339841781' >issue</a> to find out more.  */
  flavorText: String,
/* The language this name is in. */
  language: LanguageSummary,
/* The game version this flavor text is extracted from. */
  version: VersionSummary)

object PokemonSpeciesFlavorText {
  import DateTimeCodecs._

  implicit val PokemonSpeciesFlavorTextCodecJson: CodecJson[PokemonSpeciesFlavorText] = CodecJson.derive[PokemonSpeciesFlavorText]
  implicit val PokemonSpeciesFlavorTextDecoder: EntityDecoder[PokemonSpeciesFlavorText] = jsonOf[PokemonSpeciesFlavorText]
  implicit val PokemonSpeciesFlavorTextEncoder: EntityEncoder[PokemonSpeciesFlavorText] = jsonEncoderOf[PokemonSpeciesFlavorText]
}
