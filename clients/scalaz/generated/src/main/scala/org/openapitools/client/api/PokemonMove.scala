package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonMove._

case class PokemonMove (
  /* The move the Pokémon can learn. */
  move: MoveSummary,
/* The details of the version in which the Pokémon can learn the move. */
  versionGroupDetails: List[PokemonMoveVersionGroup])

object PokemonMove {
  import DateTimeCodecs._

  implicit val PokemonMoveCodecJson: CodecJson[PokemonMove] = CodecJson.derive[PokemonMove]
  implicit val PokemonMoveDecoder: EntityDecoder[PokemonMove] = jsonOf[PokemonMove]
  implicit val PokemonMoveEncoder: EntityEncoder[PokemonMove] = jsonEncoderOf[PokemonMove]
}
