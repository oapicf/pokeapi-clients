package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MoveChange.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class MoveChange(
  accuracy: Option[Int],
  power: Option[Int],
  pp: Option[Int],
  effectChance: Int,
  effectEntries: List[MoveChangeEffectEntriesInner],
  `type`: TypeSummary,
  versionGroup: VersionGroupSummary
)

object MoveChange {
  implicit lazy val moveChangeJsonFormat: Format[MoveChange] = Json.format[MoveChange]
}

