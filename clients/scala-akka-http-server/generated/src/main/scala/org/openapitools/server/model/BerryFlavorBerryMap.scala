package org.openapitools.server.model


/**
 * @param potency How powerful the referenced flavor is for this berry. for example: ''null''
 * @param berry The berry with the referenced flavor. for example: ''null''
*/
final case class BerryFlavorBerryMap (
  potency: Int,
  berry: BerrySummary
)

