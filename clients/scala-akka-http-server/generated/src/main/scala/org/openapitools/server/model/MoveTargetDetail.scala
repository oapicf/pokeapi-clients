package org.openapitools.server.model


/**
 * @param id The identifier for this resource. for example: ''null''
 * @param name The name for this resource. for example: ''null''
 * @param descriptions The description of this resource listed in different languages. for example: ''null''
 * @param moves A list of moves that that are directed at this target. for example: ''null''
 * @param names The name of this resource listed in different languages. for example: ''null''
*/
final case class MoveTargetDetail (
  id: Int,
  name: String,
  descriptions: Seq[MoveTargetDescription],
  moves: Seq[MoveSummary],
  names: Seq[MoveTargetName]
)

