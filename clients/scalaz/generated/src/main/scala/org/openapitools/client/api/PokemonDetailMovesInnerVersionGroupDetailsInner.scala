package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonDetailMovesInnerVersionGroupDetailsInner._

case class PokemonDetailMovesInnerVersionGroupDetailsInner (
  levelLearnedAt: Integer,
moveLearnMethod: AbilityDetailPokemonInnerPokemon,
versionGroup: AbilityDetailPokemonInnerPokemon)

object PokemonDetailMovesInnerVersionGroupDetailsInner {
  import DateTimeCodecs._

  implicit val PokemonDetailMovesInnerVersionGroupDetailsInnerCodecJson: CodecJson[PokemonDetailMovesInnerVersionGroupDetailsInner] = CodecJson.derive[PokemonDetailMovesInnerVersionGroupDetailsInner]
  implicit val PokemonDetailMovesInnerVersionGroupDetailsInnerDecoder: EntityDecoder[PokemonDetailMovesInnerVersionGroupDetailsInner] = jsonOf[PokemonDetailMovesInnerVersionGroupDetailsInner]
  implicit val PokemonDetailMovesInnerVersionGroupDetailsInnerEncoder: EntityEncoder[PokemonDetailMovesInnerVersionGroupDetailsInner] = jsonEncoderOf[PokemonDetailMovesInnerVersionGroupDetailsInner]
}
