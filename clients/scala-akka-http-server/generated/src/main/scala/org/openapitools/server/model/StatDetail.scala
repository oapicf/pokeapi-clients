package org.openapitools.server.model


/**
 * @param id  for example: ''null''
 * @param name  for example: ''null''
 * @param gameIndex  for example: ''null''
 * @param isBattleOnly  for example: ''null''
 * @param affectingMoves  for example: ''null''
 * @param affectingNatures  for example: ''null''
 * @param characteristics  for example: ''null''
 * @param moveDamageClass  for example: ''null''
 * @param names  for example: ''null''
*/
final case class StatDetail (
  id: Int,
  name: String,
  gameIndex: Int,
  isBattleOnly: Option[Boolean] = None,
  affectingMoves: StatDetailAffectingMoves,
  affectingNatures: StatDetailAffectingNatures,
  characteristics: Seq[CharacteristicSummary],
  moveDamageClass: MoveDamageClassSummary,
  names: Seq[StatName]
)

