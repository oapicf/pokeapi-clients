package org.openapitools.server.model


/**
 * @param baseScore  for example: ''null''
 * @param pokemonSpecies  for example: ''null''
 * @param rate  for example: ''null''
*/
final case class PalParkAreaDetailPokemonEncountersInner (
  baseScore: Int,
  pokemonSpecies: AbilityDetailPokemonInnerPokemon,
  rate: Int
)

