package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LocationName.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class LocationName(
  name: String,
  language: LanguageSummary
)

object LocationName {
  implicit lazy val locationNameJsonFormat: Format[LocationName] = Json.format[LocationName]
}

