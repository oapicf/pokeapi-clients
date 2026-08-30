package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for SuperContestEffectFlavorText.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class SuperContestEffectFlavorText(
  flavorText: String,
  language: LanguageSummary
)

object SuperContestEffectFlavorText {
  implicit lazy val superContestEffectFlavorTextJsonFormat: Format[SuperContestEffectFlavorText] = Json.format[SuperContestEffectFlavorText]
}

