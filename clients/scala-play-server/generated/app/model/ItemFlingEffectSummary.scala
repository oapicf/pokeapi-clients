package model

import play.api.libs.json._
import java.net.URI

/**
  * Represents the Swagger definition for ItemFlingEffectSummary.
  * @param name The name of the referenced resource.
  * @param url The URL of the referenced resource.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ItemFlingEffectSummary(
  name: String,
  url: URI
)

object ItemFlingEffectSummary {
  implicit lazy val itemFlingEffectSummaryJsonFormat: Format[ItemFlingEffectSummary] = Json.format[ItemFlingEffectSummary]
}

