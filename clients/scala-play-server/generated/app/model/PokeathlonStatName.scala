package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokeathlonStatName.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class PokeathlonStatName(
  name: String,
  language: LanguageSummary
)

object PokeathlonStatName {
  implicit lazy val pokeathlonStatNameJsonFormat: Format[PokeathlonStatName] = Json.format[PokeathlonStatName]
}

