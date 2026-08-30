package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LocationAreaDetail_encounter_method_rates_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class LocationAreaDetailEncounterMethodRatesInner(
  encounterMethod: AbilityDetailPokemonInnerPokemon,
  versionDetails: List[LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner]
)

object LocationAreaDetailEncounterMethodRatesInner {
  implicit lazy val locationAreaDetailEncounterMethodRatesInnerJsonFormat: Format[LocationAreaDetailEncounterMethodRatesInner] = Json.format[LocationAreaDetailEncounterMethodRatesInner]
}

