package model

import play.api.libs.json._
import java.net.URI

/**
  * Represents the Swagger definition for ItemFlingEffectSummary.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ItemFlingEffectSummary(
  name: String,
  url: URI
)

object ItemFlingEffectSummary {
  implicit lazy val itemFlingEffectSummaryJsonFormat: Format[ItemFlingEffectSummary] = Json.format[ItemFlingEffectSummary]
}

