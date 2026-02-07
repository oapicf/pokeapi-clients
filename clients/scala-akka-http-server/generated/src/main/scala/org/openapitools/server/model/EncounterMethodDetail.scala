package org.openapitools.server.model


/**
 * @param id  for example: ''null''
 * @param name  for example: ''null''
 * @param order  for example: ''null''
 * @param names  for example: ''null''
*/
final case class EncounterMethodDetail (
  id: Int,
  name: String,
  order: Option[Int] = None,
  names: Seq[EncounterMethodName]
)

