package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ContestTypeName.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ContestTypeName(
  name: String,
  color: String,
  language: LanguageSummary
)

object ContestTypeName {
  implicit lazy val contestTypeNameJsonFormat: Format[ContestTypeName] = Json.format[ContestTypeName]
}

