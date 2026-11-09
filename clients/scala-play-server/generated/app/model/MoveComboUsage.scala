package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MoveComboUsage.
  * @param useBefore A list of moves to use before this move.
  * @param useAfter A list of moves to use after this move.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class MoveComboUsage(
  useBefore: List[MoveSummary],
  useAfter: List[MoveSummary]
)

object MoveComboUsage {
  implicit lazy val moveComboUsageJsonFormat: Format[MoveComboUsage] = Json.format[MoveComboUsage]
}

