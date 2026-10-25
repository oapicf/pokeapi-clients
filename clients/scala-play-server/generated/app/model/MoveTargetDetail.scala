package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MoveTargetDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-25T05:53:17.467323765Z[Etc/UTC]", comments = "Generator version: 7.26.0")
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

