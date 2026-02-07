package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonDetailPastAbilitiesInner._

case class PokemonDetailPastAbilitiesInner (
  abilities: List[PokemonDetailAbilitiesInner],
generation: AbilityDetailPokemonInnerPokemon)

object PokemonDetailPastAbilitiesInner {
  import DateTimeCodecs._

  implicit val PokemonDetailPastAbilitiesInnerCodecJson: CodecJson[PokemonDetailPastAbilitiesInner] = CodecJson.derive[PokemonDetailPastAbilitiesInner]
  implicit val PokemonDetailPastAbilitiesInnerDecoder: EntityDecoder[PokemonDetailPastAbilitiesInner] = jsonOf[PokemonDetailPastAbilitiesInner]
  implicit val PokemonDetailPastAbilitiesInnerEncoder: EntityEncoder[PokemonDetailPastAbilitiesInner] = jsonEncoderOf[PokemonDetailPastAbilitiesInner]
}
