package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonSpritesOtherShowdown._

case class PokemonSpritesOtherShowdown (
  /* The URL of the default Pokémon Showdown front image, or null if unavailable. */
  frontDefault: String,
/* The URL of the female Pokémon Showdown front image, or null if unavailable. */
  frontFemale: String,
/* The URL of the shiny Pokémon Showdown front image, or null if unavailable. */
  frontShiny: String,
/* The URL of the shiny female Pokémon Showdown front image, or null if unavailable. */
  frontShinyFemale: String,
/* The URL of the default Pokémon Showdown back image, or null if unavailable. */
  backDefault: String,
/* The URL of the female Pokémon Showdown back image, or null if unavailable. */
  backFemale: String,
/* The URL of the shiny Pokémon Showdown back image, or null if unavailable. */
  backShiny: String,
/* The URL of the shiny female Pokémon Showdown back image, or null if unavailable. */
  backShinyFemale: String)

object PokemonSpritesOtherShowdown {
  import DateTimeCodecs._

  implicit val PokemonSpritesOtherShowdownCodecJson: CodecJson[PokemonSpritesOtherShowdown] = CodecJson.derive[PokemonSpritesOtherShowdown]
  implicit val PokemonSpritesOtherShowdownDecoder: EntityDecoder[PokemonSpritesOtherShowdown] = jsonOf[PokemonSpritesOtherShowdown]
  implicit val PokemonSpritesOtherShowdownEncoder: EntityEncoder[PokemonSpritesOtherShowdown] = jsonEncoderOf[PokemonSpritesOtherShowdown]
}
