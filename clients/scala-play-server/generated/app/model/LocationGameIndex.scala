package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LocationGameIndex.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-25T05:53:17.467323765Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class LocationGameIndex(
  gameIndex: Int,
  generation: GenerationSummary
)

object LocationGameIndex {
  implicit lazy val locationGameIndexJsonFormat: Format[LocationGameIndex] = Json.format[LocationGameIndex]
}

