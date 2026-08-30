package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AbilityEffectText.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AbilityEffectText(
  effect: String,
  shortEffect: String,
  language: LanguageSummary
)

object AbilityEffectText {
  implicit lazy val abilityEffectTextJsonFormat: Format[AbilityEffectText] = Json.format[AbilityEffectText]
}

