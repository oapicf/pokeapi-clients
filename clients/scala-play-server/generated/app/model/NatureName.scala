package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for NatureName.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-25T05:53:17.467323765Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class NatureName(
  name: String,
  language: LanguageSummary
)

object NatureName {
  implicit lazy val natureNameJsonFormat: Format[NatureName] = Json.format[NatureName]
}

