package org.openapitools.server.model


/**
 * @param id The identifier for this resource. for example: ''null''
 * @param name The name for this resource. for example: ''null''
 * @param condition The condition this encounter condition value pertains to. for example: ''null''
 * @param names The name of this resource listed in different languages. for example: ''null''
*/
final case class EncounterConditionValueDetail (
  id: Int,
  name: String,
  condition: EncounterConditionSummary,
  names: Seq[EncounterConditionValueName]
)

