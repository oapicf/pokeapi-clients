package org.openapitools.server.model


/**
 * @param generation  for example: ''null''
 * @param types  for example: ''null''
*/
final case class PokemonDetailPastTypesInner (
  generation: AbilityDetailPokemonInnerPokemon,
  types: Seq[PokemonDetailTypesInner]
)

