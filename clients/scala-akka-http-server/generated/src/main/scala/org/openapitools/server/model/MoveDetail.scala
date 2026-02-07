package org.openapitools.server.model


/**
 * @param id  for example: ''null''
 * @param name  for example: ''null''
 * @param accuracy  for example: ''null''
 * @param effectChance  for example: ''null''
 * @param pp  for example: ''null''
 * @param priority  for example: ''null''
 * @param power  for example: ''null''
 * @param contestCombos  for example: ''null''
 * @param contestType  for example: ''null''
 * @param contestEffect  for example: ''null''
 * @param damageClass  for example: ''null''
 * @param effectEntries  for example: ''null''
 * @param effectChanges  for example: ''null''
 * @param generation  for example: ''null''
 * @param meta  for example: ''null''
 * @param names  for example: ''null''
 * @param pastValues  for example: ''null''
 * @param statChanges  for example: ''null''
 * @param superContestEffect  for example: ''null''
 * @param target  for example: ''null''
 * @param `type`  for example: ''null''
 * @param machines  for example: ''null''
 * @param flavorTextEntries  for example: ''null''
 * @param learnedByPokemon  for example: ''null''
*/
final case class MoveDetail (
  id: Int,
  name: String,
  accuracy: Option[Int] = None,
  effectChance: Int,
  pp: Option[Int] = None,
  priority: Option[Int] = None,
  power: Option[Int] = None,
  contestCombos: MoveDetailContestCombos,
  contestType: ContestTypeSummary,
  contestEffect: ContestEffectSummary,
  damageClass: MoveDamageClassSummary,
  effectEntries: Seq[MoveChangeEffectEntriesInner],
  effectChanges: Seq[MoveDetailEffectChangesInner],
  generation: GenerationSummary,
  meta: MoveMeta,
  names: Seq[MoveName],
  pastValues: Seq[MoveChange],
  statChanges: Seq[MoveDetailStatChangesInner],
  superContestEffect: SuperContestEffectSummary,
  target: MoveTargetSummary,
  `type`: TypeSummary,
  machines: Seq[MoveDetailMachinesInner],
  flavorTextEntries: Seq[MoveFlavorText],
  learnedByPokemon: Seq[AbilityDetailPokemonInnerPokemon]
)

