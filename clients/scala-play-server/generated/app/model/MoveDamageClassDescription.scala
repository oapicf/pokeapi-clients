package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MoveDamageClassDescription.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-25T05:53:17.467323765Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class MoveDamageClassDescription(
  description: Option[String],
  language: LanguageSummary
)

object MoveDamageClassDescription {
  implicit lazy val moveDamageClassDescriptionJsonFormat: Format[MoveDamageClassDescription] = Json.format[MoveDamageClassDescription]
}

