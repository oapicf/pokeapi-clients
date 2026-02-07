package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonDetailTypesInner._

case class PokemonDetailTypesInner (
  slot: Integer,
`type`: AbilityDetailPokemonInnerPokemon)

object PokemonDetailTypesInner {
  import DateTimeCodecs._

  implicit val PokemonDetailTypesInnerCodecJson: CodecJson[PokemonDetailTypesInner] = CodecJson.derive[PokemonDetailTypesInner]
  implicit val PokemonDetailTypesInnerDecoder: EntityDecoder[PokemonDetailTypesInner] = jsonOf[PokemonDetailTypesInner]
  implicit val PokemonDetailTypesInnerEncoder: EntityEncoder[PokemonDetailTypesInner] = jsonEncoderOf[PokemonDetailTypesInner]
}
