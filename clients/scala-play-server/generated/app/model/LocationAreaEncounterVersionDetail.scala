package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LocationAreaEncounterVersionDetail.
  * @param rate The chance of an encounter to occur.
  * @param version The version of the game in which the encounter can occur with the given chance.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class LocationAreaEncounterVersionDetail(
  rate: Int,
  version: VersionSummary
)

object LocationAreaEncounterVersionDetail {
  implicit lazy val locationAreaEncounterVersionDetailJsonFormat: Format[LocationAreaEncounterVersionDetail] = Json.format[LocationAreaEncounterVersionDetail]
}

