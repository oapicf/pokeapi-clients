package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LocationAreaDetail_pokemon_encounters_inner_version_details_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class LocationAreaDetailPokemonEncountersInnerVersionDetailsInner(
  version: AbilityDetailPokemonInnerPokemon,
  maxChance: Int,
  encounterDetails: LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails
)

object LocationAreaDetailPokemonEncountersInnerVersionDetailsInner {
  implicit lazy val locationAreaDetailPokemonEncountersInnerVersionDetailsInnerJsonFormat: Format[LocationAreaDetailPokemonEncountersInnerVersionDetailsInner] = Json.format[LocationAreaDetailPokemonEncountersInnerVersionDetailsInner]
}

