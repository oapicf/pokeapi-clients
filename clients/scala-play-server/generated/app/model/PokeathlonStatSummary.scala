package model

import play.api.libs.json._
import java.net.URI

/**
  * Represents the Swagger definition for PokeathlonStatSummary.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class PokeathlonStatSummary(
  name: String,
  url: URI
)

object PokeathlonStatSummary {
  implicit lazy val pokeathlonStatSummaryJsonFormat: Format[PokeathlonStatSummary] = Json.format[PokeathlonStatSummary]
}

