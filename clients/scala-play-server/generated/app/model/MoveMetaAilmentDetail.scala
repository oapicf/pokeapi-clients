package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MoveMetaAilmentDetail.
  * @param id The identifier for this resource.
  * @param name The name for this resource.
  * @param moves A list of moves that cause this ailment.
  * @param names The name of this resource listed in different languages.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class MoveMetaAilmentDetail(
  id: Int,
  name: String,
  moves: List[MoveSummary],
  names: List[MoveMetaAilmentName]
)

object MoveMetaAilmentDetail {
  implicit lazy val moveMetaAilmentDetailJsonFormat: Format[MoveMetaAilmentDetail] = Json.format[MoveMetaAilmentDetail]
}

