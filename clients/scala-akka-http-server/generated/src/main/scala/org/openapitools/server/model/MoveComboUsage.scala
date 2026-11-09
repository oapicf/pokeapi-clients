package org.openapitools.server.model


/**
 * @param useBefore A list of moves to use before this move. for example: ''null''
 * @param useAfter A list of moves to use after this move. for example: ''null''
*/
final case class MoveComboUsage (
  useBefore: Seq[MoveSummary],
  useAfter: Seq[MoveSummary]
)

