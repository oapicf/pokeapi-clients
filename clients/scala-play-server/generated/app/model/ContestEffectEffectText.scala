package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ContestEffectEffectText.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ContestEffectEffectText(
  effect: String,
  language: LanguageSummary
)

object ContestEffectEffectText {
  implicit lazy val contestEffectEffectTextJsonFormat: Format[ContestEffectEffectText] = Json.format[ContestEffectEffectText]
}

