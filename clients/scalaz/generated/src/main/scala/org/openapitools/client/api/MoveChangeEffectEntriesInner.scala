package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MoveChangeEffectEntriesInner._

case class MoveChangeEffectEntriesInner (
  effect: String,
shortEffect: String,
language: AbilityDetailPokemonInnerPokemon)

object MoveChangeEffectEntriesInner {
  import DateTimeCodecs._

  implicit val MoveChangeEffectEntriesInnerCodecJson: CodecJson[MoveChangeEffectEntriesInner] = CodecJson.derive[MoveChangeEffectEntriesInner]
  implicit val MoveChangeEffectEntriesInnerDecoder: EntityDecoder[MoveChangeEffectEntriesInner] = jsonOf[MoveChangeEffectEntriesInner]
  implicit val MoveChangeEffectEntriesInnerEncoder: EntityEncoder[MoveChangeEffectEntriesInner] = jsonEncoderOf[MoveChangeEffectEntriesInner]
}
