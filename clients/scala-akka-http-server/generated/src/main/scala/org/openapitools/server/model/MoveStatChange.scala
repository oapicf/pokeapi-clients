package org.openapitools.server.model


/**
 * @param change The maximum amount of change to the referenced stat. for example: ''null''
 * @param move The move causing the change. for example: ''null''
*/
final case class MoveStatChange (
  change: Int,
  move: MoveSummary
)

