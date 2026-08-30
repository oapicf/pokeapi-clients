package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ItemFlavorText.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ItemFlavorText(
  text: String,
  versionGroup: VersionGroupSummary,
  language: LanguageSummary
)

object ItemFlavorText {
  implicit lazy val itemFlavorTextJsonFormat: Format[ItemFlavorText] = Json.format[ItemFlavorText]
}

