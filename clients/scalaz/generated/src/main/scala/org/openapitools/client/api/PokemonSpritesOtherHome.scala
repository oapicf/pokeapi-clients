package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonSpritesOtherHome._

case class PokemonSpritesOtherHome (
  /* The URL of the default Pokémon HOME front image, or null if unavailable. */
  frontDefault: String,
/* The URL of the female Pokémon HOME front image, or null if unavailable. */
  frontFemale: String,
/* The URL of the shiny Pokémon HOME front image, or null if unavailable. */
  frontShiny: String,
/* The URL of the shiny female Pokémon HOME front image, or null if unavailable. */
  frontShinyFemale: String)

object PokemonSpritesOtherHome {
  import DateTimeCodecs._

  implicit val PokemonSpritesOtherHomeCodecJson: CodecJson[PokemonSpritesOtherHome] = CodecJson.derive[PokemonSpritesOtherHome]
  implicit val PokemonSpritesOtherHomeDecoder: EntityDecoder[PokemonSpritesOtherHome] = jsonOf[PokemonSpritesOtherHome]
  implicit val PokemonSpritesOtherHomeEncoder: EntityEncoder[PokemonSpritesOtherHome] = jsonEncoderOf[PokemonSpritesOtherHome]
}
