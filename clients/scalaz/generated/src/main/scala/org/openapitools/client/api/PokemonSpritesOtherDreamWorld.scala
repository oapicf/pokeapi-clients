package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonSpritesOtherDreamWorld._

case class PokemonSpritesOtherDreamWorld (
  /* The URL of the default Pokémon Dream World front image, or null if unavailable. */
  frontDefault: String,
/* The URL of the female Pokémon Dream World front image, or null if unavailable. */
  frontFemale: String)

object PokemonSpritesOtherDreamWorld {
  import DateTimeCodecs._

  implicit val PokemonSpritesOtherDreamWorldCodecJson: CodecJson[PokemonSpritesOtherDreamWorld] = CodecJson.derive[PokemonSpritesOtherDreamWorld]
  implicit val PokemonSpritesOtherDreamWorldDecoder: EntityDecoder[PokemonSpritesOtherDreamWorld] = jsonOf[PokemonSpritesOtherDreamWorld]
  implicit val PokemonSpritesOtherDreamWorldEncoder: EntityEncoder[PokemonSpritesOtherDreamWorld] = jsonEncoderOf[PokemonSpritesOtherDreamWorld]
}
