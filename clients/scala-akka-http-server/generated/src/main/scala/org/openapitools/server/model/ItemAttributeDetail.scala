package org.openapitools.server.model


/**
 * @param id  for example: ''null''
 * @param name  for example: ''null''
 * @param descriptions  for example: ''null''
 * @param items  for example: ''null''
 * @param names  for example: ''null''
*/
final case class ItemAttributeDetail (
  id: Int,
  name: String,
  descriptions: Seq[ItemAttributeDescription],
  items: Seq[AbilityDetailPokemonInnerPokemon],
  names: Seq[ItemAttributeName]
)

