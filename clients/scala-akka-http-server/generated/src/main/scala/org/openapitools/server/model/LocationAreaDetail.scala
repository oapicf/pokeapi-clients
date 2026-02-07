package org.openapitools.server.model


/**
 * @param id  for example: ''null''
 * @param name  for example: ''null''
 * @param gameIndex  for example: ''null''
 * @param encounterMethodRates  for example: ''null''
 * @param location  for example: ''null''
 * @param names  for example: ''null''
 * @param pokemonEncounters  for example: ''null''
*/
final case class LocationAreaDetail (
  id: Int,
  name: String,
  gameIndex: Int,
  encounterMethodRates: Seq[LocationAreaDetailEncounterMethodRatesInner],
  location: LocationSummary,
  names: Seq[LocationAreaName],
  pokemonEncounters: Seq[LocationAreaDetailPokemonEncountersInner]
)

