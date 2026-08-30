package model

import play.api.libs.json._
import java.net.URI

/**
  * Represents the Swagger definition for BerryFirmnessSummary.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class BerryFirmnessSummary(
  name: String,
  url: URI
)

object BerryFirmnessSummary {
  implicit lazy val berryFirmnessSummaryJsonFormat: Format[BerryFirmnessSummary] = Json.format[BerryFirmnessSummary]
}

