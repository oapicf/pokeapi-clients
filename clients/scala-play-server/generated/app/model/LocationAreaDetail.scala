package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LocationAreaDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class LocationAreaDetail(
  id: Int,
  name: String,
  gameIndex: Int,
  encounterMethodRates: List[LocationAreaDetailEncounterMethodRatesInner],
  location: LocationSummary,
  names: List[LocationAreaName],
  pokemonEncounters: List[LocationAreaDetailPokemonEncountersInner]
)

object LocationAreaDetail {
  implicit lazy val locationAreaDetailJsonFormat: Format[LocationAreaDetail] = Json.format[LocationAreaDetail]
}

