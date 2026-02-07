package org.openapitools.server.model


/**
 * @param levelLearnedAt  for example: ''null''
 * @param moveLearnMethod  for example: ''null''
 * @param versionGroup  for example: ''null''
*/
final case class PokemonDetailMovesInnerVersionGroupDetailsInner (
  levelLearnedAt: Int,
  moveLearnMethod: AbilityDetailPokemonInnerPokemon,
  versionGroup: AbilityDetailPokemonInnerPokemon
)

