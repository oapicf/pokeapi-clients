package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for StatAffectingMoves.
  * @param increase A list of moves and how they change the referenced stat.
  * @param decrease A list of moves and how they change the referenced stat.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class StatAffectingMoves(
  increase: List[MoveStatChange],
  decrease: List[MoveStatChange]
)

object StatAffectingMoves {
  implicit lazy val statAffectingMovesJsonFormat: Format[StatAffectingMoves] = Json.format[StatAffectingMoves]
}

