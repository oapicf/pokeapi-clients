package org.openapitools.server.model


/**
 * @param id  for example: ''null''
 * @param name  for example: ''null''
 * @param berries  for example: ''null''
 * @param names  for example: ''null''
*/
final case class BerryFirmnessDetail (
  id: Int,
  name: String,
  berries: Seq[BerrySummary],
  names: Seq[BerryFirmnessName]
)

