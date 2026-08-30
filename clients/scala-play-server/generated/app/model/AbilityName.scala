package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AbilityName.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AbilityName(
  name: String,
  language: LanguageSummary
)

object AbilityName {
  implicit lazy val abilityNameJsonFormat: Format[AbilityName] = Json.format[AbilityName]
}

