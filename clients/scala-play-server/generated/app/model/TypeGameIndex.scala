package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TypeGameIndex.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class TypeGameIndex(
  gameIndex: Int,
  generation: GenerationSummary
)

object TypeGameIndex {
  implicit lazy val typeGameIndexJsonFormat: Format[TypeGameIndex] = Json.format[TypeGameIndex]
}

