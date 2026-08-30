package model

import play.api.libs.json._
import java.net.URI

/**
  * Represents the Swagger definition for MoveDamageClassSummary.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class MoveDamageClassSummary(
  name: String,
  url: URI
)

object MoveDamageClassSummary {
  implicit lazy val moveDamageClassSummaryJsonFormat: Format[MoveDamageClassSummary] = Json.format[MoveDamageClassSummary]
}

