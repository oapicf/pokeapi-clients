package org.openapitools.server.model


/**
 * @param increase  for example: ''null''
 * @param decrease  for example: ''null''
*/
final case class StatDetailAffectingMoves (
  increase: Seq[StatDetailAffectingMovesIncreaseInner],
  decrease: Seq[StatDetailAffectingMovesIncreaseInner]
)

