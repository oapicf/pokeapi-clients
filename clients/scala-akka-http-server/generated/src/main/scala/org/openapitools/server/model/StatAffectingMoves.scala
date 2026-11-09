package org.openapitools.server.model


/**
 * @param increase A list of moves and how they change the referenced stat. for example: ''null''
 * @param decrease A list of moves and how they change the referenced stat. for example: ''null''
*/
final case class StatAffectingMoves (
  increase: Seq[MoveStatChange],
  decrease: Seq[MoveStatChange]
)

