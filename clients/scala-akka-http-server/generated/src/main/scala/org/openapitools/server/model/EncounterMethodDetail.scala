package org.openapitools.server.model


/**
 * @param id The identifier for this resource. for example: ''null''
 * @param name The name for this resource. for example: ''null''
 * @param order A good value for sorting. for example: ''null''
 * @param names The name of this resource listed in different languages. for example: ''null''
*/
final case class EncounterMethodDetail (
  id: Int,
  name: String,
  order: Option[Int] = None,
  names: Seq[EncounterMethodName]
)

