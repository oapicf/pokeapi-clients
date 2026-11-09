package org.openapitools.server.model

import java.net.URI

/**
 * @param trigger The trigger for this form change. for example: ''null''
 * @param name The name of the required item, ability, or move. Only present for a resource-based trigger. for example: ''null''
 * @param url The URL of the required item, ability, or move. Only present for a resource-based trigger. for example: ''null''
 * @param baseForm The required base form. Only present when the trigger specifies one. for example: ''null''
*/
final case class PokemonFormTriggerCondition (
  trigger: String,
  name: Option[String] = None,
  url: Option[URI] = None,
  baseForm: Option[PokemonFormSummary] = None
)

