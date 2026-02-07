package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AbilityEffectText.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AbilityEffectText(
  effect: String,
  shortEffect: String,
  language: LanguageSummary
)

object AbilityEffectText {
  implicit lazy val abilityEffectTextJsonFormat: Format[AbilityEffectText] = Json.format[AbilityEffectText]
}

