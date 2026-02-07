package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MoveBattleStyleDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class MoveBattleStyleDetail(
  id: Int,
  name: String,
  names: List[MoveBattleStyleName]
)

object MoveBattleStyleDetail {
  implicit lazy val moveBattleStyleDetailJsonFormat: Format[MoveBattleStyleDetail] = Json.format[MoveBattleStyleDetail]
}

