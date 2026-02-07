package org.openapitools.server.model


/**
 * @param id  for example: ''null''
 * @param name  for example: ''null''
 * @param values  for example: ''null''
 * @param names  for example: ''null''
*/
final case class EncounterConditionDetail (
  id: Int,
  name: String,
  values: Seq[EncounterConditionValueSummary],
  names: Seq[EncounterConditionName]
)

