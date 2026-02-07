package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ItemFlavorText.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ItemFlavorText(
  text: String,
  versionGroup: VersionGroupSummary,
  language: LanguageSummary
)

object ItemFlavorText {
  implicit lazy val itemFlavorTextJsonFormat: Format[ItemFlavorText] = Json.format[ItemFlavorText]
}

