package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MoveMetaCategoryDetail.
  * @param id The identifier for this resource.
  * @param name The name for this resource.
  * @param descriptions The description of this resource listed in different languages.
  * @param moves A list of moves that fall into this category.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class MoveMetaCategoryDetail(
  id: Int,
  name: String,
  descriptions: List[MoveMetaCategoryDescription],
  moves: List[MoveSummary]
)

object MoveMetaCategoryDetail {
  implicit lazy val moveMetaCategoryDetailJsonFormat: Format[MoveMetaCategoryDetail] = Json.format[MoveMetaCategoryDetail]
}

