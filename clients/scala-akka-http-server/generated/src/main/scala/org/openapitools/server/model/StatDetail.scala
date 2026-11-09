package org.openapitools.server.model


/**
 * @param id The identifier for this resource. for example: ''null''
 * @param name The name for this resource. for example: ''null''
 * @param gameIndex ID the games use for this stat. for example: ''null''
 * @param isBattleOnly Whether this stat only exists within a battle. for example: ''null''
 * @param affectingMoves A detail of moves which affect this stat positively or negatively. for example: ''null''
 * @param affectingNatures A detail of natures which affect this stat positively or negatively. for example: ''null''
 * @param affectingItems Items that affect this stat, such as vitamins and battle items. for example: ''null''
 * @param characteristics A list of characteristics that are set on a Pokémon when its highest base stat is this stat. for example: ''null''
 * @param moveDamageClass The class of damage this stat is directly related to. for example: ''null''
 * @param names The name of this resource listed in different languages. for example: ''null''
*/
final case class StatDetail (
  id: Int,
  name: String,
  gameIndex: Int,
  isBattleOnly: Option[Boolean] = None,
  affectingMoves: StatAffectingMoves,
  affectingNatures: StatAffectingNatures,
  affectingItems: Seq[ItemSummary],
  characteristics: Seq[CharacteristicSummary],
  moveDamageClass: MoveDamageClassSummary,
  names: Seq[StatName]
)

