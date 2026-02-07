package org.openapitools.server.model


/**
 * @param isHidden  for example: ''null''
 * @param slot  for example: ''null''
 * @param pokemon  for example: ''null''
*/
final case class AbilityDetailPokemonInner (
  isHidden: Boolean,
  slot: Int,
  pokemon: AbilityDetailPokemonInnerPokemon
)

