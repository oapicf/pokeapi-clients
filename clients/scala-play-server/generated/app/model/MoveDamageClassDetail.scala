package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MoveDamageClassDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class MoveDamageClassDetail(
  id: Int,
  name: String,
  descriptions: List[MoveDamageClassDescription],
  moves: List[MoveSummary],
  names: List[MoveDamageClassName]
)

object MoveDamageClassDetail {
  implicit lazy val moveDamageClassDetailJsonFormat: Format[MoveDamageClassDetail] = Json.format[MoveDamageClassDetail]
}

