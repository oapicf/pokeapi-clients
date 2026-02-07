package org.openapitools.server.model


/**
 * @param move  for example: ''null''
 * @param versionGroupDetails  for example: ''null''
*/
final case class PokemonDetailMovesInner (
  move: AbilityDetailPokemonInnerPokemon,
  versionGroupDetails: Seq[PokemonDetailMovesInnerVersionGroupDetailsInner]
)

