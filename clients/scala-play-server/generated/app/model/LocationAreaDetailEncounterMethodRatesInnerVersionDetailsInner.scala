package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LocationAreaDetail_encounter_method_rates_inner_version_details_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner(
  rate: Int,
  version: AbilityDetailPokemonInnerPokemon
)

object LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner {
  implicit lazy val locationAreaDetailEncounterMethodRatesInnerVersionDetailsInnerJsonFormat: Format[LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner] = Json.format[LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner]
}

