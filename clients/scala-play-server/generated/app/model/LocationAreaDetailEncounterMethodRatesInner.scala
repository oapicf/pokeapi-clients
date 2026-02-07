package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LocationAreaDetail_encounter_method_rates_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class LocationAreaDetailEncounterMethodRatesInner(
  encounterMethod: AbilityDetailPokemonInnerPokemon,
  versionDetails: List[LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner]
)

object LocationAreaDetailEncounterMethodRatesInner {
  implicit lazy val locationAreaDetailEncounterMethodRatesInnerJsonFormat: Format[LocationAreaDetailEncounterMethodRatesInner] = Json.format[LocationAreaDetailEncounterMethodRatesInner]
}

