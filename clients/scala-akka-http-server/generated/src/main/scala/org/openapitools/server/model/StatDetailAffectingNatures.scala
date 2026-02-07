package org.openapitools.server.model


/**
 * @param increase  for example: ''null''
 * @param decrease  for example: ''null''
*/
final case class StatDetailAffectingNatures (
  increase: Seq[AbilityDetailPokemonInnerPokemon],
  decrease: Seq[AbilityDetailPokemonInnerPokemon]
)

