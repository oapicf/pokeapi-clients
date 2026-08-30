package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LocationAreaDetail_encounter_method_rates_inner_version_details_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner(
  rate: Int,
  version: AbilityDetailPokemonInnerPokemon
)

object LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner {
  implicit lazy val locationAreaDetailEncounterMethodRatesInnerVersionDetailsInnerJsonFormat: Format[LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner] = Json.format[LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner]
}

