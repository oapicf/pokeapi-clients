package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TypeGameIndex.
  * @param gameIndex The internal id of an API resource within game data.
  * @param generation The generation relevent to this game index.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class TypeGameIndex(
  gameIndex: Int,
  generation: GenerationSummary
)

object TypeGameIndex {
  implicit lazy val typeGameIndexJsonFormat: Format[TypeGameIndex] = Json.format[TypeGameIndex]
}

