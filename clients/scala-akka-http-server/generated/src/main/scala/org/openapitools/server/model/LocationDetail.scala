package org.openapitools.server.model


/**
 * @param id  for example: ''null''
 * @param name  for example: ''null''
 * @param region  for example: ''null''
 * @param names  for example: ''null''
 * @param gameIndices  for example: ''null''
 * @param areas  for example: ''null''
*/
final case class LocationDetail (
  id: Int,
  name: String,
  region: RegionSummary,
  names: Seq[LocationName],
  gameIndices: Seq[LocationGameIndex],
  areas: Seq[LocationAreaSummary]
)

