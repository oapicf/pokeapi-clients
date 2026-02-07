package org.openapitools.server.model


/**
 * @param useBefore  for example: ''null''
 * @param useAfter  for example: ''null''
*/
final case class MoveDetailContestCombosNormal (
  useBefore: Seq[AbilityDetailPokemonInnerPokemon],
  useAfter: Seq[AbilityDetailPokemonInnerPokemon]
)

