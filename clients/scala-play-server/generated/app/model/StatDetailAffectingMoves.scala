package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for StatDetail_affecting_moves.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class StatDetailAffectingMoves(
  increase: List[StatDetailAffectingMovesIncreaseInner],
  decrease: List[StatDetailAffectingMovesIncreaseInner]
)

object StatDetailAffectingMoves {
  implicit lazy val statDetailAffectingMovesJsonFormat: Format[StatDetailAffectingMoves] = Json.format[StatDetailAffectingMoves]
}

