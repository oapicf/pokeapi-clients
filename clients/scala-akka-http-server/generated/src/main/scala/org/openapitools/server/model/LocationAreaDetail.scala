package org.openapitools.server.model


/**
 * @param id The identifier for this resource. for example: ''null''
 * @param name The name for this resource. for example: ''null''
 * @param gameIndex The internal id of an API resource within game data. for example: ''null''
 * @param encounterMethodRates A list of methods in which Pokémon may be encountered in this area and how likely the method will occur depending on the version of the game. for example: ''null''
 * @param location The region this location area can be found in. for example: ''null''
 * @param names The name of this resource listed in different languages. for example: ''null''
 * @param pokemonEncounters A list of Pokémon that can be encountered in this area along with version specific details about the encounter. for example: ''null''
*/
final case class LocationAreaDetail (
  id: Int,
  name: String,
  gameIndex: Int,
  encounterMethodRates: Seq[LocationAreaEncounterRate],
  location: LocationSummary,
  names: Seq[LocationAreaName],
  pokemonEncounters: Seq[LocationAreaPokemonEncounter]
)

