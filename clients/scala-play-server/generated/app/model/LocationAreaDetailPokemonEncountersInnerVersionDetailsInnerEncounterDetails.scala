package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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

