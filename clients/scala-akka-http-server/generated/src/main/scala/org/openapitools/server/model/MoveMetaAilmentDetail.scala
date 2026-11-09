package org.openapitools.server.model


/**
 * @param id The identifier for this resource. for example: ''null''
 * @param name The name for this resource. for example: ''null''
 * @param moves A list of moves that cause this ailment. for example: ''null''
 * @param names The name of this resource listed in different languages. for example: ''null''
*/
final case class MoveMetaAilmentDetail (
  id: Int,
  name: String,
  moves: Seq[MoveSummary],
  names: Seq[MoveMetaAilmentName]
)

