package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MoveDamageClassDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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

