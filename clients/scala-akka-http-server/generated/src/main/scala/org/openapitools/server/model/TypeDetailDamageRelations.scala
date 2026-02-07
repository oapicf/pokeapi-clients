package org.openapitools.server.model


/**
 * @param noDamageTo  for example: ''null''
 * @param halfDamageTo  for example: ''null''
 * @param doubleDamageTo  for example: ''null''
 * @param noDamageFrom  for example: ''null''
 * @param halfDamageFrom  for example: ''null''
 * @param doubleDamageFrom  for example: ''null''
*/
final case class TypeDetailDamageRelations (
  noDamageTo: Seq[AbilityDetailPokemonInnerPokemon],
  halfDamageTo: Seq[AbilityDetailPokemonInnerPokemon],
  doubleDamageTo: Seq[AbilityDetailPokemonInnerPokemon],
  noDamageFrom: Seq[AbilityDetailPokemonInnerPokemon],
  halfDamageFrom: Seq[AbilityDetailPokemonInnerPokemon],
  doubleDamageFrom: Seq[AbilityDetailPokemonInnerPokemon]
)

