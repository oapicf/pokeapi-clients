package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MoveTargetDetail.
  * @param id The identifier for this resource.
  * @param name The name for this resource.
  * @param descriptions The description of this resource listed in different languages.
  * @param moves A list of moves that that are directed at this target.
  * @param names The name of this resource listed in different languages.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
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

