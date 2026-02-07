package org.openapitools.server.model


/**
 * @param id  for example: ''null''
 * @param name  for example: ''null''
 * @param condition  for example: ''null''
 * @param names  for example: ''null''
*/
final case class EncounterConditionValueDetail (
  id: Int,
  name: String,
  condition: EncounterConditionSummary,
  names: Seq[EncounterConditionValueName]
)

