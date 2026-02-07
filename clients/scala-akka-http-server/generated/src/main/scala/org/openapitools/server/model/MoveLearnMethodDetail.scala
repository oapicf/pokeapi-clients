package org.openapitools.server.model


/**
 * @param id  for example: ''null''
 * @param name  for example: ''null''
 * @param names  for example: ''null''
 * @param descriptions  for example: ''null''
 * @param versionGroups  for example: ''null''
*/
final case class MoveLearnMethodDetail (
  id: Int,
  name: String,
  names: Seq[MoveLearnMethodName],
  descriptions: Seq[MoveLearnMethodDescription],
  versionGroups: Seq[AbilityDetailPokemonInnerPokemon]
)

