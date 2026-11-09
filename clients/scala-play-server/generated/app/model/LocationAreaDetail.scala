package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LocationAreaDetail.
  * @param id The identifier for this resource.
  * @param name The name for this resource.
  * @param gameIndex The internal id of an API resource within game data.
  * @param encounterMethodRates A list of methods in which Pokémon may be encountered in this area and how likely the method will occur depending on the version of the game.
  * @param location The region this location area can be found in.
  * @param names The name of this resource listed in different languages.
  * @param pokemonEncounters A list of Pokémon that can be encountered in this area along with version specific details about the encounter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class LocationAreaDetail(
  id: Int,
  name: String,
  gameIndex: Int,
  encounterMethodRates: List[LocationAreaEncounterRate],
  location: LocationSummary,
  names: List[LocationAreaName],
  pokemonEncounters: List[LocationAreaPokemonEncounter]
)

object LocationAreaDetail {
  implicit lazy val locationAreaDetailJsonFormat: Format[LocationAreaDetail] = Json.format[LocationAreaDetail]
}

