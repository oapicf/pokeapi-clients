package org.openapitools.server.model


/**
 * @param minLevel  for example: ''null''
 * @param maxLevel  for example: ''null''
 * @param conditionValues  for example: ''null''
 * @param chance  for example: ''null''
 * @param method  for example: ''null''
*/
final case class LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails (
  minLevel: Int,
  maxLevel: Int,
  conditionValues: Option[AbilityDetailPokemonInnerPokemon] = None,
  chance: Int,
  method: AbilityDetailPokemonInnerPokemon
)

