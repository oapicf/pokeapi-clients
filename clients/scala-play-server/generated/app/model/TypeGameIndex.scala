package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TypeGameIndex.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class TypeGameIndex(
  gameIndex: Int,
  generation: GenerationSummary
)

object TypeGameIndex {
  implicit lazy val typeGameIndexJsonFormat: Format[TypeGameIndex] = Json.format[TypeGameIndex]
}

