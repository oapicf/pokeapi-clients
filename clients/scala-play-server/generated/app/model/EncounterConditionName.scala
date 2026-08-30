package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for EncounterConditionName.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class EncounterConditionName(
  name: String,
  language: LanguageSummary
)

object EncounterConditionName {
  implicit lazy val encounterConditionNameJsonFormat: Format[EncounterConditionName] = Json.format[EncounterConditionName]
}

