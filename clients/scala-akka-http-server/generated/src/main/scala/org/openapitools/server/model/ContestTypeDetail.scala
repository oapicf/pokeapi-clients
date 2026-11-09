package org.openapitools.server.model


/**
 * @param id The identifier for this resource. for example: ''null''
 * @param name The name for this resource. for example: ''null''
 * @param berryFlavor The berry flavor that correlates with this contest type. for example: ''null''
 * @param names The name of this contest type listed in different languages. for example: ''null''
*/
final case class ContestTypeDetail (
  id: Int,
  name: String,
  berryFlavor: BerryFlavorSummary,
  names: Seq[ContestTypeName]
)

