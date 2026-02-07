package org.openapitools.server.model


/**
 * @param pokemon  for example: ''null''
 * @param versionDetails  for example: ''null''
*/
final case class LocationAreaDetailPokemonEncountersInner (
  pokemon: AbilityDetailPokemonInnerPokemon,
  versionDetails: Seq[LocationAreaDetailPokemonEncountersInnerVersionDetailsInner]
)

