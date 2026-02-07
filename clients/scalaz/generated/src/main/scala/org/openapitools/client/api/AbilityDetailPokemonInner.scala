package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AbilityDetailPokemonInner._

case class AbilityDetailPokemonInner (
  isHidden: Boolean,
slot: Integer,
pokemon: AbilityDetailPokemonInnerPokemon)

object AbilityDetailPokemonInner {
  import DateTimeCodecs._

  implicit val AbilityDetailPokemonInnerCodecJson: CodecJson[AbilityDetailPokemonInner] = CodecJson.derive[AbilityDetailPokemonInner]
  implicit val AbilityDetailPokemonInnerDecoder: EntityDecoder[AbilityDetailPokemonInner] = jsonOf[AbilityDetailPokemonInner]
  implicit val AbilityDetailPokemonInnerEncoder: EntityEncoder[AbilityDetailPokemonInner] = jsonEncoderOf[AbilityDetailPokemonInner]
}
