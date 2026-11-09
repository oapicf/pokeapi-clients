package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ItemFlavorText.
  * @param text The localized flavor text for an API resource in a specific language.
  * @param versionGroup The version group which uses this flavor text.
  * @param language The language this name is in.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ItemFlavorText(
  text: String,
  versionGroup: VersionGroupSummary,
  language: LanguageSummary
)

object ItemFlavorText {
  implicit lazy val itemFlavorTextJsonFormat: Format[ItemFlavorText] = Json.format[ItemFlavorText]
}

