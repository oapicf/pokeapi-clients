package org.openapitools.server.model


/**
 * @param id  for example: ''null''
 * @param name  for example: ''null''
 * @param berries  for example: ''null''
 * @param contestType  for example: ''null''
 * @param names  for example: ''null''
*/
final case class BerryFlavorDetail (
  id: Int,
  name: String,
  berries: Seq[BerryFlavorDetailBerriesInner],
  contestType: ContestTypeSummary,
  names: Seq[BerryFlavorName]
)

