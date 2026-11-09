package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonSpritesOther._

case class PokemonSpritesOther (
  /* Pokémon Dream World artwork URLs. */
  dreamWorld: Option[PokemonSpritesOtherDreamWorld],
/* Pokémon HOME sprite URLs. */
  home: Option[PokemonSpritesOtherHome],
/* Pokémon Showdown sprite URLs. */
  showdown: Option[PokemonSpritesOtherShowdown],
/* Official Pokémon artwork URLs, including shiny artwork and version-specific variants. */
  officialArtwork: Option[PokemonSpritesOtherOfficialArtwork])

object PokemonSpritesOther {
  import DateTimeCodecs._

  implicit val PokemonSpritesOtherCodecJson: CodecJson[PokemonSpritesOther] = CodecJson.derive[PokemonSpritesOther]
  implicit val PokemonSpritesOtherDecoder: EntityDecoder[PokemonSpritesOther] = jsonOf[PokemonSpritesOther]
  implicit val PokemonSpritesOtherEncoder: EntityEncoder[PokemonSpritesOther] = jsonEncoderOf[PokemonSpritesOther]
}
