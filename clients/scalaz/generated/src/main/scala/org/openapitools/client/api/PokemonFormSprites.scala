package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonFormSprites._

case class PokemonFormSprites (
  /* The default depiction of this Pokémon from the front in battle. */
  frontDefault: String,
/* The shiny depiction of this Pokémon from the front in battle. */
  frontShiny: String,
/* The female depiction of this Pokémon from the front in battle. */
  frontFemale: String,
/* The shiny female depiction of this Pokémon from the front in battle. */
  frontShinyFemale: String,
/* The default depiction of this Pokémon from the back in battle. */
  backDefault: String,
/* The shiny depiction of this Pokémon from the back in battle. */
  backShiny: String,
/* The female depiction of this Pokémon from the back in battle. */
  backFemale: String,
/* The shiny female depiction of this Pokémon from the back in battle. */
  backShinyFemale: String,
/* Additional sprites grouped by source, such as official artwork, HOME, and Showdown. Available keys vary by resource. */
  other: Option[PokemonSpritesOther],
/* Sprites grouped by generation and game. Available keys vary by resource. */
  versions: Option[Map[String, Map[String, AnyType]]])

object PokemonFormSprites {
  import DateTimeCodecs._

  implicit val PokemonFormSpritesCodecJson: CodecJson[PokemonFormSprites] = CodecJson.derive[PokemonFormSprites]
  implicit val PokemonFormSpritesDecoder: EntityDecoder[PokemonFormSprites] = jsonOf[PokemonFormSprites]
  implicit val PokemonFormSpritesEncoder: EntityEncoder[PokemonFormSprites] = jsonEncoderOf[PokemonFormSprites]
}
