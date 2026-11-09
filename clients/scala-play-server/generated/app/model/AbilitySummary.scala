package model

import play.api.libs.json._
import java.net.URI

/**
  * Represents the Swagger definition for AbilitySummary.
  * @param name The name of the referenced resource.
  * @param url The URL of the referenced resource.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AbilitySummary(
  name: String,
  url: URI
)

object AbilitySummary {
  implicit lazy val abilitySummaryJsonFormat: Format[AbilitySummary] = Json.format[AbilitySummary]
}

