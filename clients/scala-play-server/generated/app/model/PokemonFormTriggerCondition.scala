package model

import play.api.libs.json._
import java.net.URI

/**
  * Represents the Swagger definition for PokemonFormTriggerCondition.
  * @param trigger The trigger for this form change.
  * @param name The name of the required item, ability, or move. Only present for a resource-based trigger.
  * @param url The URL of the required item, ability, or move. Only present for a resource-based trigger.
  * @param baseForm The required base form. Only present when the trigger specifies one.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PokemonFormTriggerCondition(
  trigger: String,
  name: Option[String],
  url: Option[URI],
  baseForm: Option[PokemonFormSummary]
)

object PokemonFormTriggerCondition {
  implicit lazy val pokemonFormTriggerConditionJsonFormat: Format[PokemonFormTriggerCondition] = Json.format[PokemonFormTriggerCondition]
}

