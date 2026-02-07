package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonDetailAbilitiesInner._

case class PokemonDetailAbilitiesInner (
  ability: AbilityDetailPokemonInnerPokemon,
isHidden: Boolean,
slot: Integer)

object PokemonDetailAbilitiesInner {
  import DateTimeCodecs._

  implicit val PokemonDetailAbilitiesInnerCodecJson: CodecJson[PokemonDetailAbilitiesInner] = CodecJson.derive[PokemonDetailAbilitiesInner]
  implicit val PokemonDetailAbilitiesInnerDecoder: EntityDecoder[PokemonDetailAbilitiesInner] = jsonOf[PokemonDetailAbilitiesInner]
  implicit val PokemonDetailAbilitiesInnerEncoder: EntityEncoder[PokemonDetailAbilitiesInner] = jsonEncoderOf[PokemonDetailAbilitiesInner]
}
