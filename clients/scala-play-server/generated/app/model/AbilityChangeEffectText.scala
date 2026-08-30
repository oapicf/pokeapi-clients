package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AbilityChangeEffectText.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AbilityChangeEffectText(
  effect: String,
  language: LanguageSummary
)

object AbilityChangeEffectText {
  implicit lazy val abilityChangeEffectTextJsonFormat: Format[AbilityChangeEffectText] = Json.format[AbilityChangeEffectText]
}

