package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TypePokemon._

case class TypePokemon (
  /* The order the Pokémon's types are listed in. */
  slot: Integer,
/* The Pokémon that has the referenced type. */
  pokemon: PokemonSummary)

object TypePokemon {
  import DateTimeCodecs._

  implicit val TypePokemonCodecJson: CodecJson[TypePokemon] = CodecJson.derive[TypePokemon]
  implicit val TypePokemonDecoder: EntityDecoder[TypePokemon] = jsonOf[TypePokemon]
  implicit val TypePokemonEncoder: EntityEncoder[TypePokemon] = jsonEncoderOf[TypePokemon]
}
