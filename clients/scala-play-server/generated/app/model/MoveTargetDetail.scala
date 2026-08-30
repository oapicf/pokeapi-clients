package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MoveTargetDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class MoveTargetDetail(
  id: Int,
  name: String,
  descriptions: List[MoveTargetDescription],
  moves: List[MoveSummary],
  names: List[MoveTargetName]
)

object MoveTargetDetail {
  implicit lazy val moveTargetDetailJsonFormat: Format[MoveTargetDetail] = Json.format[MoveTargetDetail]
}

