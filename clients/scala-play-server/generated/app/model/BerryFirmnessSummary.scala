package model

import play.api.libs.json._
import java.net.URI

/**
  * Represents the Swagger definition for BerryFirmnessSummary.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class BerryFirmnessSummary(
  name: String,
  url: URI
)

object BerryFirmnessSummary {
  implicit lazy val berryFirmnessSummaryJsonFormat: Format[BerryFirmnessSummary] = Json.format[BerryFirmnessSummary]
}

