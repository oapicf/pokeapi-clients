package org.openapitools.server.model


/**
 * @param abilities  for example: ''null''
 * @param generation  for example: ''null''
*/
final case class PokemonDetailPastAbilitiesInner (
  abilities: Seq[PokemonDetailAbilitiesInner],
  generation: AbilityDetailPokemonInnerPokemon
)

