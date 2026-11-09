package org.openapitools.server.model


/**
 * @param change The amount of change. for example: ''null''
 * @param stat The stat being affected. for example: ''null''
*/
final case class MoveMetaStatChange (
  change: Int,
  stat: StatSummary
)

