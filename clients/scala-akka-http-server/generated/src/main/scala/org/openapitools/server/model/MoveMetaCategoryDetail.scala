package org.openapitools.server.model


/**
 * @param id The identifier for this resource. for example: ''null''
 * @param name The name for this resource. for example: ''null''
 * @param descriptions The description of this resource listed in different languages. for example: ''null''
 * @param moves A list of moves that fall into this category. for example: ''null''
*/
final case class MoveMetaCategoryDetail (
  id: Int,
  name: String,
  descriptions: Seq[MoveMetaCategoryDescription],
  moves: Seq[MoveSummary]
)

