package org.openapitools.server.model


/**
 * @param slot  for example: ''null''
 * @param pokemon  for example: ''null''
*/
final case class TypeDetailPokemonInner (
  slot: Option[Int] = None,
  pokemon: Option[TypeDetailPokemonInnerPokemon] = None
)

