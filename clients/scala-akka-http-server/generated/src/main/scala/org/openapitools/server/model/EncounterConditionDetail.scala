package org.openapitools.server.model


/**
 * @param id The identifier for this resource. for example: ''null''
 * @param name The name for this resource. for example: ''null''
 * @param values A list of possible values for this encounter condition. for example: ''null''
 * @param names The name of this resource listed in different languages. for example: ''null''
*/
final case class EncounterConditionDetail (
  id: Int,
  name: String,
  values: Seq[EncounterConditionValueSummary],
  names: Seq[EncounterConditionName]
)

