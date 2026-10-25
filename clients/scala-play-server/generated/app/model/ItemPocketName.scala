package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ItemPocketName.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-25T05:53:17.467323765Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ItemPocketName(
  name: String,
  language: LanguageSummary
)

object ItemPocketName {
  implicit lazy val itemPocketNameJsonFormat: Format[ItemPocketName] = Json.format[ItemPocketName]
}

