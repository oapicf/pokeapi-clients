package org.openapitools.server.model


/**
 * @param normal A detail of moves this move can be used before or after, granting additional appeal points in contests. for example: ''null''
 * @param `super` A detail of moves this move can be used before or after, granting additional appeal points in super contests. for example: ''null''
*/
final case class MoveCombos (
  normal: MoveComboUsage,
  `super`: MoveComboUsage
)

