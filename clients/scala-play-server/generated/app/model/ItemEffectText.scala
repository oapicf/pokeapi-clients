package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ItemEffectText.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ItemEffectText(
  effect: String,
  shortEffect: String,
  language: LanguageSummary
)

object ItemEffectText {
  implicit lazy val itemEffectTextJsonFormat: Format[ItemEffectText] = Json.format[ItemEffectText]
}

