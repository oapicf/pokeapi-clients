package org.openapitools.server.model


/**
 * @param id  for example: ''null''
 * @param name  for example: ''null''
 * @param descriptions  for example: ''null''
 * @param moves  for example: ''null''
 * @param names  for example: ''null''
*/
final case class MoveTargetDetail (
  id: Int,
  name: String,
  descriptions: Seq[MoveTargetDescription],
  moves: Seq[MoveSummary],
  names: Seq[MoveTargetName]
)

