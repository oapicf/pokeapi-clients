package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MoveBattleStyleDetail.
  * @param id The identifier for this resource.
  * @param name The name for this resource.
  * @param names The name of this resource listed in different languages.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class MoveBattleStyleDetail(
  id: Int,
  name: String,
  names: List[MoveBattleStyleName]
)

object MoveBattleStyleDetail {
  implicit lazy val moveBattleStyleDetailJsonFormat: Format[MoveBattleStyleDetail] = Json.format[MoveBattleStyleDetail]
}

