package org.openapitools.server.model


/**
 * @param id  for example: ''null''
 * @param geneModulo  for example: ''null''
 * @param possibleValues  for example: ''null''
 * @param highestStat  for example: ''null''
 * @param descriptions  for example: ''null''
*/
final case class CharacteristicDetail (
  id: Int,
  geneModulo: Int,
  possibleValues: Seq[Int],
  highestStat: StatSummary,
  descriptions: Seq[CharacteristicDescription]
)

