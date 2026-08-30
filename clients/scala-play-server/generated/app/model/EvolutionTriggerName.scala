package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for EvolutionTriggerName.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class EvolutionTriggerName(
  name: String,
  language: LanguageSummary
)

object EvolutionTriggerName {
  implicit lazy val evolutionTriggerNameJsonFormat: Format[EvolutionTriggerName] = Json.format[EvolutionTriggerName]
}

