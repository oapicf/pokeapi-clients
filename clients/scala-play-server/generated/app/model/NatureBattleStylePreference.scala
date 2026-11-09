package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for NatureBattleStylePreference.
  * @param lowHpPreference Chance of using the move, in percent, if HP is under one half.
  * @param highHpPreference Chance of using the move, in percent, if HP is over one half.
  * @param moveBattleStyle The move battle style.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class NatureBattleStylePreference(
  lowHpPreference: Int,
  highHpPreference: Int,
  moveBattleStyle: MoveBattleStyleSummary
)

object NatureBattleStylePreference {
  implicit lazy val natureBattleStylePreferenceJsonFormat: Format[NatureBattleStylePreference] = Json.format[NatureBattleStylePreference]
}

