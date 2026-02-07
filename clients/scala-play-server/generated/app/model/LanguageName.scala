package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LanguageName.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class LanguageName(
  name: String,
  language: LanguageSummary
)

object LanguageName {
  implicit lazy val languageNameJsonFormat: Format[LanguageName] = Json.format[LanguageName]
}

