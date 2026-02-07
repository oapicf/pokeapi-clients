package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MoveTargetDescription.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class MoveTargetDescription(
  description: Option[String],
  language: LanguageSummary
)

object MoveTargetDescription {
  implicit lazy val moveTargetDescriptionJsonFormat: Format[MoveTargetDescription] = Json.format[MoveTargetDescription]
}

