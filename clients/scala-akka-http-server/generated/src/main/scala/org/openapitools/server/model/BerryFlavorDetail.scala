package org.openapitools.server.model


/**
 * @param id The identifier for this resource. for example: ''null''
 * @param name The name for this resource. for example: ''null''
 * @param berries A list of the berries with this flavor. for example: ''null''
 * @param contestType The contest type that correlates with this berry flavor. for example: ''null''
 * @param names The name of this resource listed in different languages. for example: ''null''
*/
final case class BerryFlavorDetail (
  id: Int,
  name: String,
  berries: Seq[BerryFlavorBerryMap],
  contestType: ContestTypeSummary,
  names: Seq[BerryFlavorName]
)

