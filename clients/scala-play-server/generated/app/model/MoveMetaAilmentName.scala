package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MoveMetaAilmentName.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class MoveMetaAilmentName(
  name: String,
  language: LanguageSummary
)

object MoveMetaAilmentName {
  implicit lazy val moveMetaAilmentNameJsonFormat: Format[MoveMetaAilmentName] = Json.format[MoveMetaAilmentName]
}

