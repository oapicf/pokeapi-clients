package org.openapitools.server.model


/**
 * @param potency How powerful the referenced flavor is for this berry. for example: ''null''
 * @param flavor The referenced berry flavor. for example: ''null''
*/
final case class BerryFlavorMap (
  potency: Int,
  flavor: BerryFlavorSummary
)

