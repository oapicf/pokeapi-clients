package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonDetailPastTypesInner._

case class PokemonDetailPastTypesInner (
  generation: AbilityDetailPokemonInnerPokemon,
types: List[PokemonDetailTypesInner])

object PokemonDetailPastTypesInner {
  import DateTimeCodecs._

  implicit val PokemonDetailPastTypesInnerCodecJson: CodecJson[PokemonDetailPastTypesInner] = CodecJson.derive[PokemonDetailPastTypesInner]
  implicit val PokemonDetailPastTypesInnerDecoder: EntityDecoder[PokemonDetailPastTypesInner] = jsonOf[PokemonDetailPastTypesInner]
  implicit val PokemonDetailPastTypesInnerEncoder: EntityEncoder[PokemonDetailPastTypesInner] = jsonEncoderOf[PokemonDetailPastTypesInner]
}
