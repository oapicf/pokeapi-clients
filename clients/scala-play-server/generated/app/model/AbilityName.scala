package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AbilityName.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-25T05:53:17.467323765Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AbilityName(
  name: String,
  language: LanguageSummary
)

object AbilityName {
  implicit lazy val abilityNameJsonFormat: Format[AbilityName] = Json.format[AbilityName]
}

