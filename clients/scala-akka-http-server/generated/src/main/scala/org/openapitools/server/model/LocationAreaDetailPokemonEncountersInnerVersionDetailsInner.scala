package org.openapitools.server.model


/**
 * @param version  for example: ''null''
 * @param maxChance  for example: ''null''
 * @param encounterDetails  for example: ''null''
*/
final case class LocationAreaDetailPokemonEncountersInnerVersionDetailsInner (
  version: AbilityDetailPokemonInnerPokemon,
  maxChance: Int,
  encounterDetails: LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails
)

