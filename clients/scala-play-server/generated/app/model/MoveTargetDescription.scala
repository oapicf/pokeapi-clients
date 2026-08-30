package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MoveTargetDescription.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class MoveTargetDescription(
  description: Option[String],
  language: LanguageSummary
)

object MoveTargetDescription {
  implicit lazy val moveTargetDescriptionJsonFormat: Format[MoveTargetDescription] = Json.format[MoveTargetDescription]
}

