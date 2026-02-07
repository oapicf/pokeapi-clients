package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CharacteristicDescription.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CharacteristicDescription(
  description: Option[String],
  language: LanguageSummary
)

object CharacteristicDescription {
  implicit lazy val characteristicDescriptionJsonFormat: Format[CharacteristicDescription] = Json.format[CharacteristicDescription]
}

