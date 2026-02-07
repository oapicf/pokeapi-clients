package org.openapitools.server.model


/**
 * @param id  for example: ''null''
 * @param name  for example: ''null''
 * @param moves  for example: ''null''
 * @param names  for example: ''null''
*/
final case class MoveMetaAilmentDetail (
  id: Int,
  name: String,
  moves: Seq[AbilityDetailPokemonInnerPokemon],
  names: Seq[MoveMetaAilmentName]
)

