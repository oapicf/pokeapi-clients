package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MoveLearnMethodDetail.
  * @param id The identifier for this resource.
  * @param name The name for this resource.
  * @param names The name of this resource listed in different languages.
  * @param descriptions The description of this resource listed in different languages.
  * @param versionGroups A list of version groups where moves can be learned through this method.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class MoveLearnMethodDetail(
  id: Int,
  name: String,
  names: List[MoveLearnMethodName],
  descriptions: List[MoveLearnMethodDescription],
  versionGroups: List[VersionGroupSummary]
)

object MoveLearnMethodDetail {
  implicit lazy val moveLearnMethodDetailJsonFormat: Format[MoveLearnMethodDetail] = Json.format[MoveLearnMethodDetail]
}

