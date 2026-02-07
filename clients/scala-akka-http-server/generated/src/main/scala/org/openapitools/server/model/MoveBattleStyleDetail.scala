package org.openapitools.server.model


/**
 * @param id  for example: ''null''
 * @param name  for example: ''null''
 * @param names  for example: ''null''
*/
final case class MoveBattleStyleDetail (
  id: Int,
  name: String,
  names: Seq[MoveBattleStyleName]
)

