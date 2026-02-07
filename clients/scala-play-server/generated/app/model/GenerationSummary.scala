package model

import play.api.libs.json._
import java.net.URI

/**
  * Represents the Swagger definition for GenerationSummary.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class GenerationSummary(
  name: String,
  url: URI
)

object GenerationSummary {
  implicit lazy val generationSummaryJsonFormat: Format[GenerationSummary] = Json.format[GenerationSummary]
}

