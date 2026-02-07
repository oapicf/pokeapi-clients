package model

import play.api.libs.json._
import java.net.URI

/**
  * Represents the Swagger definition for ItemFlingEffectSummary.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ItemFlingEffectSummary(
  name: String,
  url: URI
)

object ItemFlingEffectSummary {
  implicit lazy val itemFlingEffectSummaryJsonFormat: Format[ItemFlingEffectSummary] = Json.format[ItemFlingEffectSummary]
}

