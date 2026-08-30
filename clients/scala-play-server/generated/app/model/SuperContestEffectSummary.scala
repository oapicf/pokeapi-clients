package model

import play.api.libs.json._
import java.net.URI

/**
  * Represents the Swagger definition for SuperContestEffectSummary.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class SuperContestEffectSummary(
  url: URI
)

object SuperContestEffectSummary {
  implicit lazy val superContestEffectSummaryJsonFormat: Format[SuperContestEffectSummary] = Json.format[SuperContestEffectSummary]
}

