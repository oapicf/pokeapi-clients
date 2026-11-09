package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ContestTypeName.
  * @param name The name for this contest.
  * @param color The color associated with this contest's name.
  * @param language The language that this name is in.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ContestTypeName(
  name: String,
  color: String,
  language: LanguageSummary
)

object ContestTypeName {
  implicit lazy val contestTypeNameJsonFormat: Format[ContestTypeName] = Json.format[ContestTypeName]
}

