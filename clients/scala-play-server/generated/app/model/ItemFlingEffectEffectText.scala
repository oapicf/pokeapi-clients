package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ItemFlingEffectEffectText.
  * @param effect The localized effect text for an API resource in a specific language.
  * @param language The language this effect is in.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ItemFlingEffectEffectText(
  effect: String,
  language: LanguageSummary
)

object ItemFlingEffectEffectText {
  implicit lazy val itemFlingEffectEffectTextJsonFormat: Format[ItemFlingEffectEffectText] = Json.format[ItemFlingEffectEffectText]
}

