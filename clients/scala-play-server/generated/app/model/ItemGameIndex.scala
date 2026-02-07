package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ItemGameIndex.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ItemGameIndex(
  gameIndex: Int,
  generation: GenerationSummary
)

object ItemGameIndex {
  implicit lazy val itemGameIndexJsonFormat: Format[ItemGameIndex] = Json.format[ItemGameIndex]
}

