package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonSpritesOtherOfficialArtwork._

case class PokemonSpritesOtherOfficialArtwork (
  /* The URL of the default front official artwork, or null if unavailable. */
  frontDefault: String,
/* The URL of the shiny front official artwork, or null if unavailable. */
  frontShiny: String,
/* Additional official artwork grouped by version. Available keys vary by resource. */
  versions: Option[Map[String, Map[String, AnyType]]])

object PokemonSpritesOtherOfficialArtwork {
  import DateTimeCodecs._

  implicit val PokemonSpritesOtherOfficialArtworkCodecJson: CodecJson[PokemonSpritesOtherOfficialArtwork] = CodecJson.derive[PokemonSpritesOtherOfficialArtwork]
  implicit val PokemonSpritesOtherOfficialArtworkDecoder: EntityDecoder[PokemonSpritesOtherOfficialArtwork] = jsonOf[PokemonSpritesOtherOfficialArtwork]
  implicit val PokemonSpritesOtherOfficialArtworkEncoder: EntityEncoder[PokemonSpritesOtherOfficialArtwork] = jsonEncoderOf[PokemonSpritesOtherOfficialArtwork]
}
