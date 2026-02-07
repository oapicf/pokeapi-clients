package org.openapitools.server.model


/**
 * @param lowHpPreference  for example: ''null''
 * @param highHpPreference  for example: ''null''
 * @param moveBattleStyle  for example: ''null''
*/
final case class NatureBattleStylePreference (
  lowHpPreference: Int,
  highHpPreference: Int,
  moveBattleStyle: MoveBattleStyleSummary
)

