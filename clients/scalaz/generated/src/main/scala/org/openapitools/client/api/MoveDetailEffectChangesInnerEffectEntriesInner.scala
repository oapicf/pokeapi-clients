package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MoveDetailEffectChangesInnerEffectEntriesInner._

case class MoveDetailEffectChangesInnerEffectEntriesInner (
  effect: String,
language: AbilityDetailPokemonInnerPokemon)

object MoveDetailEffectChangesInnerEffectEntriesInner {
  import DateTimeCodecs._

  implicit val MoveDetailEffectChangesInnerEffectEntriesInnerCodecJson: CodecJson[MoveDetailEffectChangesInnerEffectEntriesInner] = CodecJson.derive[MoveDetailEffectChangesInnerEffectEntriesInner]
  implicit val MoveDetailEffectChangesInnerEffectEntriesInnerDecoder: EntityDecoder[MoveDetailEffectChangesInnerEffectEntriesInner] = jsonOf[MoveDetailEffectChangesInnerEffectEntriesInner]
  implicit val MoveDetailEffectChangesInnerEffectEntriesInnerEncoder: EntityEncoder[MoveDetailEffectChangesInnerEffectEntriesInner] = jsonEncoderOf[MoveDetailEffectChangesInnerEffectEntriesInner]
}
