package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MoveDetailEffectChangesInner._

case class MoveDetailEffectChangesInner (
  effectEntries: List[MoveDetailEffectChangesInnerEffectEntriesInner],
versionGroup: AbilityDetailPokemonInnerPokemon)

object MoveDetailEffectChangesInner {
  import DateTimeCodecs._

  implicit val MoveDetailEffectChangesInnerCodecJson: CodecJson[MoveDetailEffectChangesInner] = CodecJson.derive[MoveDetailEffectChangesInner]
  implicit val MoveDetailEffectChangesInnerDecoder: EntityDecoder[MoveDetailEffectChangesInner] = jsonOf[MoveDetailEffectChangesInner]
  implicit val MoveDetailEffectChangesInnerEncoder: EntityEncoder[MoveDetailEffectChangesInner] = jsonEncoderOf[MoveDetailEffectChangesInner]
}
