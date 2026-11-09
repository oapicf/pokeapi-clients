package org.openapitools.server.model


/**
 * @param id The identifier for this resource. for example: ''null''
 * @param name The name for this resource. for example: ''null''
 * @param region The region this location can be found in. for example: ''null''
 * @param names The name of this resource listed in different languages. for example: ''null''
 * @param gameIndices A list of game indices relevent to this location by generation. for example: ''null''
 * @param areas Areas that can be found within this location. for example: ''null''
*/
final case class LocationDetail (
  id: Int,
  name: String,
  region: RegionSummary,
  names: Seq[LocationName],
  gameIndices: Seq[LocationGameIndex],
  areas: Seq[LocationAreaSummary]
)

