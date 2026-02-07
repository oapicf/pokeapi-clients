package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ContestTypeName.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ContestTypeName(
  name: String,
  color: String,
  language: LanguageSummary
)

object ContestTypeName {
  implicit lazy val contestTypeNameJsonFormat: Format[ContestTypeName] = Json.format[ContestTypeName]
}

