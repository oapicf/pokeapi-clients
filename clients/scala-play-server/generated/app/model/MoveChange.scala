package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MoveChange.
  * @param accuracy The percent value of how likely this move is to be successful.
  * @param power The base power before the listed version group, or null if power did not change.
  * @param pp Power points. The number of times this move can be used.
  * @param effectChance The percent value of how likely it is this moves effect will take effect.
  * @param effectEntries The effect of this move listed in different languages.
  * @param `type` The elemental type of this move.
  * @param versionGroup The version group in which these move stat values were in effect.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class MoveChange(
  accuracy: Option[Int],
  power: Option[Int],
  pp: Option[Int],
  effectChance: Int,
  effectEntries: List[MoveEffectEffectText],
  `type`: TypeSummary,
  versionGroup: VersionGroupSummary
)

object MoveChange {
  implicit lazy val moveChangeJsonFormat: Format[MoveChange] = Json.format[MoveChange]
}

