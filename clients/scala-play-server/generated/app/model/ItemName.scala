package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ItemName.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-25T05:53:17.467323765Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ItemName(
  name: String,
  language: LanguageSummary
)

object ItemName {
  implicit lazy val itemNameJsonFormat: Format[ItemName] = Json.format[ItemName]
}

