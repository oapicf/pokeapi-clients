package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LocationAreaEncounterRate.
  * @param encounterMethod The method in which Pokémon may be encountered in an area..
  * @param versionDetails The chance of the encounter to occur on a version of the game.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class LocationAreaEncounterRate(
  encounterMethod: EncounterMethodSummary,
  versionDetails: List[LocationAreaEncounterVersionDetail]
)

object LocationAreaEncounterRate {
  implicit lazy val locationAreaEncounterRateJsonFormat: Format[LocationAreaEncounterRate] = Json.format[LocationAreaEncounterRate]
}

