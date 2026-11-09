package org.openapitools.server.model


/**
 * @param lowHpPreference Chance of using the move, in percent, if HP is under one half. for example: ''null''
 * @param highHpPreference Chance of using the move, in percent, if HP is over one half. for example: ''null''
 * @param moveBattleStyle The move battle style. for example: ''null''
*/
final case class NatureBattleStylePreference (
  lowHpPreference: Int,
  highHpPreference: Int,
  moveBattleStyle: MoveBattleStyleSummary
)

