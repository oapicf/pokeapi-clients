package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MoveDetail._

case class MoveDetail (
  id: Integer,
name: String,
accuracy: Option[Integer],
effectChance: Integer,
pp: Option[Integer],
priority: Option[Integer],
power: Option[Integer],
contestCombos: MoveDetailContestCombos,
contestType: ContestTypeSummary,
contestEffect: ContestEffectSummary,
damageClass: MoveDamageClassSummary,
effectEntries: List[MoveChangeEffectEntriesInner],
effectChanges: List[MoveDetailEffectChangesInner],
generation: GenerationSummary,
meta: MoveMeta,
names: List[MoveName],
pastValues: List[MoveChange],
statChanges: List[MoveDetailStatChangesInner],
superContestEffect: SuperContestEffectSummary,
target: MoveTargetSummary,
`type`: TypeSummary,
machines: List[MoveDetailMachinesInner],
flavorTextEntries: List[MoveFlavorText],
learnedByPokemon: List[AbilityDetailPokemonInnerPokemon])

object MoveDetail {
  import DateTimeCodecs._

  implicit val MoveDetailCodecJson: CodecJson[MoveDetail] = CodecJson.derive[MoveDetail]
  implicit val MoveDetailDecoder: EntityDecoder[MoveDetail] = jsonOf[MoveDetail]
  implicit val MoveDetailEncoder: EntityEncoder[MoveDetail] = jsonEncoderOf[MoveDetail]
}
