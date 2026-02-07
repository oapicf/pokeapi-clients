package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MoveDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class MoveDetail(
  id: Int,
  name: String,
  accuracy: Option[Int],
  effectChance: Int,
  pp: Option[Int],
  priority: Option[Int],
  power: Option[Int],
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
  learnedByPokemon: List[AbilityDetailPokemonInnerPokemon]
)

object MoveDetail {
  implicit lazy val moveDetailJsonFormat: Format[MoveDetail] = Json.format[MoveDetail]
}

