package org.openapitools.server.model


/**
 * @param id  for example: ''null''
 * @param name  for example: ''null''
 * @param berryFlavor  for example: ''null''
 * @param names  for example: ''null''
*/
final case class ContestTypeDetail (
  id: Int,
  name: String,
  berryFlavor: BerryFlavorSummary,
  names: Seq[ContestTypeName]
)

