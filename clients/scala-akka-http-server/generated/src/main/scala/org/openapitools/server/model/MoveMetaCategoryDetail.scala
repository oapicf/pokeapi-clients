package org.openapitools.server.model


/**
 * @param id  for example: ''null''
 * @param name  for example: ''null''
 * @param descriptions  for example: ''null''
 * @param moves  for example: ''null''
*/
final case class MoveMetaCategoryDetail (
  id: Int,
  name: String,
  descriptions: Seq[MoveMetaCategoryDescription],
  moves: Seq[AbilityDetailPokemonInnerPokemon]
)

