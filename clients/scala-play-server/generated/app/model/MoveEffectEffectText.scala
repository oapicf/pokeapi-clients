package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MoveEffectEffectText.
  * @param effect The localized effect text for an API resource in a specific language.
  * @param shortEffect The localized effect text in brief.
  * @param language The language this effect is in.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class MoveEffectEffectText(
  effect: String,
  shortEffect: String,
  language: LanguageSummary
)

object MoveEffectEffectText {
  implicit lazy val moveEffectEffectTextJsonFormat: Format[MoveEffectEffectText] = Json.format[MoveEffectEffectText]
}

