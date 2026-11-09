package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MoveStatChange.
  * @param change The maximum amount of change to the referenced stat.
  * @param move The move causing the change.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class MoveStatChange(
  change: Int,
  move: MoveSummary
)

object MoveStatChange {
  implicit lazy val moveStatChangeJsonFormat: Format[MoveStatChange] = Json.format[MoveStatChange]
}

