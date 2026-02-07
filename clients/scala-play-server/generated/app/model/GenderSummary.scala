package model

import play.api.libs.json._
import java.net.URI

/**
  * Represents the Swagger definition for GenderSummary.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class GenderSummary(
  name: String,
  url: URI
)

object GenderSummary {
  implicit lazy val genderSummaryJsonFormat: Format[GenderSummary] = Json.format[GenderSummary]
}

