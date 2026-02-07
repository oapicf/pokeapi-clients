package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for GenerationName.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class GenerationName(
  name: String,
  language: LanguageSummary
)

object GenerationName {
  implicit lazy val generationNameJsonFormat: Format[GenerationName] = Json.format[GenerationName]
}

