package org.openapitools.server.model


/**
 * @param ability  for example: ''null''
 * @param isHidden  for example: ''null''
 * @param slot  for example: ''null''
*/
final case class PokemonDetailAbilitiesInner (
  ability: AbilityDetailPokemonInnerPokemon,
  isHidden: Boolean,
  slot: Int
)

