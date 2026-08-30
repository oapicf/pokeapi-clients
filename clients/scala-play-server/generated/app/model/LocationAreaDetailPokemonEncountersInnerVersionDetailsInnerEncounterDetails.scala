package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails(
  minLevel: Int,
  maxLevel: Int,
  conditionValues: Option[AbilityDetailPokemonInnerPokemon],
  chance: Int,
  method: AbilityDetailPokemonInnerPokemon
)

object LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails {
  implicit lazy val locationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetailsJsonFormat: Format[LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails] = Json.format[LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails]
}

