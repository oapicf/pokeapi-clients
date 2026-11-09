package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MoveMetaStatChange.
  * @param change The amount of change.
  * @param stat The stat being affected.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class MoveMetaStatChange(
  change: Int,
  stat: StatSummary
)

object MoveMetaStatChange {
  implicit lazy val moveMetaStatChangeJsonFormat: Format[MoveMetaStatChange] = Json.format[MoveMetaStatChange]
}

